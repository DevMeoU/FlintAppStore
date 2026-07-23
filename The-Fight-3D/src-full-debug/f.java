/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.rms.RecordStore;

public final class f {
    public RecordStore a = null;

    public final void a() {
        try {
            this.a = RecordStore.openRecordStore("TheFight3D", true);
        }
        catch (Exception exception) {}
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(w.r.h);
                byte[] byArray = byteArrayOutputStream.toByteArray();
                if (this.a.getNumRecords() == 0) {
                    this.a.addRecord(byArray, 0, byArray.length);
                } else {
                    this.a.setRecord(1, byArray, 0, byArray.length);
                }
            }
            catch (Exception exception) {
                System.out.println("writeRecord" + exception);
                try {
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                    this.a.closeRecordStore();
                    return;
                }
                catch (Exception exception2) {
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                this.a.closeRecordStore();
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            this.a.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void b() {
        byte[] byArray = new byte[30];
        try {
            this.a = RecordStore.openRecordStore("TheFight3D", false);
            this.a.closeRecordStore();
        }
        catch (Exception exception) {}
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            try {
                this.a = RecordStore.openRecordStore("TheFight3D", false);
                this.a.getRecord(1, byArray, 0);
                w.r.h = dataInputStream.readByte();
            }
            catch (Exception exception) {
                try {
                    byteArrayInputStream.close();
                    dataInputStream.close();
                    this.a.closeRecordStore();
                    return;
                }
                catch (Exception exception2) {
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayInputStream.close();
                dataInputStream.close();
                this.a.closeRecordStore();
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            byteArrayInputStream.close();
            dataInputStream.close();
            this.a.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void c() {
        byte[] byArray = new byte[30];
        try {
            this.a = RecordStore.openRecordStore("TheFight3D1", false);
        }
        catch (Exception exception) {}
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            try {
                this.a.getRecord(1, byArray, 0);
                k.g = dataInputStream.readInt();
                n.a = this.a.getRecordSize(1) > 0 ? 0 : -1;
            }
            catch (Exception exception) {
                try {
                    byteArrayInputStream.close();
                    dataInputStream.close();
                    this.a.closeRecordStore();
                    return;
                }
                catch (Exception exception2) {
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayInputStream.close();
                dataInputStream.close();
                this.a.closeRecordStore();
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            byteArrayInputStream.close();
            dataInputStream.close();
            this.a.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void d() {
        try {
            this.a = RecordStore.openRecordStore("TheFight3D1", true);
        }
        catch (Exception exception) {}
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeInt(k.g);
                byte[] byArray = byteArrayOutputStream.toByteArray();
                if (this.a.getNumRecords() == 0) {
                    this.a.addRecord(byArray, 0, byArray.length);
                } else {
                    this.a.setRecord(1, byArray, 0, byArray.length);
                }
            }
            catch (Exception exception) {
                try {
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                    this.a.closeRecordStore();
                    return;
                }
                catch (Exception exception2) {
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                this.a.closeRecordStore();
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            this.a.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}
