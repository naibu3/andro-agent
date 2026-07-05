package M;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f578d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f579a;

    /* renamed from: b, reason: collision with root package name */
    public final v f580b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f581c = 0;

    public y(v vVar, int i2) {
        this.f580b = vVar;
        this.f579a = i2;
    }

    public final int a(int i2) {
        N.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarC.f319d;
        int i3 = iA + aVarC.f316a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final int b() {
        N.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i2 = iA + aVarC.f316a;
        return ((ByteBuffer) aVarC.f319d).getInt(((ByteBuffer) aVarC.f319d).getInt(i2) + i2);
    }

    public final N.a c() {
        ThreadLocal threadLocal = f578d;
        N.a aVar = (N.a) threadLocal.get();
        if (aVar == null) {
            aVar = new N.a();
            threadLocal.set(aVar);
        }
        N.b bVar = (N.b) this.f580b.f570a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i2 = iA + bVar.f316a;
            int i3 = (this.f579a * 4) + ((ByteBuffer) bVar.f319d).getInt(i2) + i2 + 4;
            int i4 = ((ByteBuffer) bVar.f319d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f319d;
            aVar.f319d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f316a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                aVar.f317b = i5;
                aVar.f318c = ((ByteBuffer) aVar.f319d).getShort(i5);
            } else {
                aVar.f316a = 0;
                aVar.f317b = 0;
                aVar.f318c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        N.a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarC.f319d).getInt(iA + aVarC.f316a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i2 = 0; i2 < iB; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
