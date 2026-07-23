/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Loader;
import javax.microedition.m3g.Mesh;
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Object3D;
import javax.microedition.m3g.World;

public final class h {
    public static Node a(String string) {
        Object3D[] object3DArray = null;
        try {
            object3DArray = Loader.load(string);
        }
        catch (Exception exception) {
            System.out.println(" Loading  M3G  problem   " + string + "  " + exception);
        }
        int n = 0;
        while (n < object3DArray.length) {
            if (object3DArray[n] instanceof World) {
                Node node = ((World)object3DArray[n]).getChild(0);
                return node;
            }
            ++n;
        }
        return null;
    }

    public static void a(Node node, Image image, Image image2) {
        try {
            ((Mesh)((Group)node).getChild(0)).getAppearance(0).getTexture(0).setImage(new Image2D(99, image2));
            ((Mesh)((Object3D)((Group)node)).find(3)).getAppearance(0).getTexture(0).setImage(new Image2D(99, image));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}
