import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;

public class HNullPatch {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) { System.err.println("Usage: HNullPatch input output"); System.exit(1); }
        byte[] in = Files.readAllBytes(Paths.get(args[0]));
        byte[] out = patch(in);
        if (out != null) Files.write(Paths.get(args[1]), out);
        else Files.copy(Paths.get(args[0]), Paths.get(args[1]), StandardCopyOption.REPLACE_EXISTING);
    }

    public static byte[] patch(byte[] classBytes) {
        ClassReader cr = new ClassReader(classBytes);
        String cn = cr.getClassName();
        if (!"h".equals(cn) && !"c".equals(cn) && !"i".equals(cn)) return null;

        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);
        cr.accept(new ClassVisitor(Opcodes.ASM9, cw) {
            @Override
            public MethodVisitor visitMethod(int acc, String name, String desc, String sig, String[] exns) {
                MethodVisitor mv = super.visitMethod(acc, name, desc, sig, exns);
                return new MethodVisitor(Opcodes.ASM9, mv) {
                    // Guard String.length() — if receiver is null, return 0.
                    public void visitMethodInsn(int op, String owner, String n, String d, boolean itf) {
                        if ("java/lang/String".equals(owner) && "length".equals(n)) {
                            Label nn = new Label();
                            Label end = new Label();
                            super.visitInsn(Opcodes.DUP);
                            super.visitJumpInsn(Opcodes.IFNONNULL, nn);
                            super.visitInsn(Opcodes.POP);
                            super.visitInsn(Opcodes.ICONST_0);
                            super.visitJumpInsn(Opcodes.GOTO, end);
                            super.visitLabel(nn);
                            super.visitMethodInsn(Opcodes.INVOKEVIRTUAL, owner, n, d, itf);
                            super.visitLabel(end);
                        } else {
                            super.visitMethodInsn(op, owner, n, d, itf);
                        }
                    }

                    // Guard *aload (array[index]) — if array is null, push null.
                    @Override
                    public void visitInsn(int insn) {
                        if (insn == Opcodes.AALOAD) {
                            Label nn = new Label();
                            Label end = new Label();
                            // Stack: ... arrayref index
                            super.visitInsn(Opcodes.DUP2);          // ... arrayref index arrayref index
                            super.visitInsn(Opcodes.POP2);          // ... arrayref index arrayref
                            super.visitJumpInsn(Opcodes.IFNONNULL, nn); // ... arrayref index
                            super.visitInsn(Opcodes.SWAP);         // ... index arrayref
                            super.visitInsn(Opcodes.POP);           // ... index
                            super.visitInsn(Opcodes.POP);           // ...
                            super.visitInsn(Opcodes.ACONST_NULL);  // ... null
                            super.visitJumpInsn(Opcodes.GOTO, end);
                            super.visitLabel(nn);                  // ... arrayref index
                            super.visitInsn(Opcodes.AALOAD);
                            super.visitLabel(end);
                        } else if (insn == Opcodes.IALOAD || insn == Opcodes.BALOAD
                                || insn == Opcodes.CALOAD || insn == Opcodes.SALOAD) {
                            Label nn = new Label();
                            Label end = new Label();
                            super.visitInsn(Opcodes.DUP2);
                            super.visitInsn(Opcodes.POP2);
                            super.visitJumpInsn(Opcodes.IFNONNULL, nn);
                            super.visitInsn(Opcodes.SWAP);
                            super.visitInsn(Opcodes.POP);
                            super.visitInsn(Opcodes.POP);
                            super.visitInsn(Opcodes.ICONST_0);
                            super.visitJumpInsn(Opcodes.GOTO, end);
                            super.visitLabel(nn);
                            super.visitInsn(insn);
                            super.visitLabel(end);
                        } else {
                            super.visitInsn(insn);
                        }
                    }
                };
            }
        }, 0);
        return cw.toByteArray();
    }
}
