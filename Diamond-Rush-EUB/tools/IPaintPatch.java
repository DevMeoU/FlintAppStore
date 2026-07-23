import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;

/**
 * Patches i.class paint() method to replace hideNotify/showNotify calls
 * (from the orientation-guard block) with no-ops, eliminating the
 * "false" spam and game-state reset that happens every frame when the
 * physical display is portrait and the game is landscape.
 *
 * Replaces each (aload_0 + invokevirtual hideNotify/showNotify) pair
 * with a single POP that discards the "this" reference.
 */
public class IPaintPatch {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.println("Usage: IPaintPatch input.class output.class");
            System.exit(1);
        }
        byte[] in = Files.readAllBytes(Paths.get(args[0]));
        byte[] out = patch(in);
        if (out != null) {
            Files.write(Paths.get(args[1]), out);
        } else {
            Files.copy(Paths.get(args[0]), Paths.get(args[1]), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    public static byte[] patch(byte[] classBytes) {
        ClassReader cr = new ClassReader(classBytes);
        if (!"i".equals(cr.getClassName())) return null;

        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);
        cr.accept(new ClassVisitor(Opcodes.ASM9, cw) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String desc,
                                              String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
                if ("paint".equals(name)) {
                    return new PaintGuardRemover(mv);
                }
                return mv;
            }
        }, 0);
        return cw.toByteArray();
    }

    static class PaintGuardRemover extends MethodVisitor {
        private boolean pendingAload0;

        PaintGuardRemover(MethodVisitor mv) { super(Opcodes.ASM9, mv); }

        @Override
        public void visitVarInsn(int opcode, int var) {
            // Defer aload_0 — might be followed by hideNotify/showNotify
            if (opcode == Opcodes.ALOAD && var == 0) {
                pendingAload0 = true;
                return;
            }
            flushPending();
            super.visitVarInsn(opcode, var);
        }

        @Override
        public void visitMethodInsn(int opcode, String owner, String name,
                                     String desc, boolean itf) {
            if (pendingAload0
                    && opcode == Opcodes.INVOKEVIRTUAL
                    && "i".equals(owner)
                    && ("hideNotify".equals(name) || "showNotify".equals(name))) {
                // Skip both aload_0 + invokevirtual; just pop 'this'
                pendingAload0 = false;
                super.visitInsn(Opcodes.POP);
                return;
            }
            flushPending();
            super.visitMethodInsn(opcode, owner, name, desc, itf);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            flushPending();
            super.visitJumpInsn(opcode, label);
        }

        @Override
        public void visitLabel(Label label) {
            flushPending();
            super.visitLabel(label);
        }

        @Override
        public void visitInsn(int opcode) {
            flushPending();
            super.visitInsn(opcode);
        }

        private void flushPending() {
            if (pendingAload0) {
                pendingAload0 = false;
                super.visitVarInsn(Opcodes.ALOAD, 0);
            }
        }
    }
}
