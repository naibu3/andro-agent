package H0;

import j0.AbstractC0150d;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    public final t f433a;

    /* renamed from: b, reason: collision with root package name */
    public final e f434b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f435c;

    public o(t tVar) {
        AbstractC0150d.e(tVar, "source");
        this.f433a = tVar;
        this.f434b = new e();
    }

    @Override // H0.t
    public final v a() {
        return this.f433a.a();
    }

    @Override // H0.t
    public final long b(long j2, e eVar) {
        AbstractC0150d.e(eVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "byteCount < 0: ").toString());
        }
        if (this.f435c) {
            throw new IllegalStateException("closed");
        }
        e eVar2 = this.f434b;
        if (eVar2.f412b == 0 && this.f433a.b(8192L, eVar2) == -1) {
            return -1L;
        }
        return eVar2.b(Math.min(j2, eVar2.f412b), eVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f435c) {
            return;
        }
        this.f435c = true;
        this.f433a.close();
        e eVar = this.f434b;
        eVar.o(eVar.f412b);
    }

    @Override // H0.g
    public final String e(Charset charset) {
        e eVar = this.f434b;
        eVar.t(this.f433a);
        return eVar.n(eVar.f412b, charset);
    }

    public final boolean f() {
        if (this.f435c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f434b;
        return eVar.f() && this.f433a.b(8192L, eVar) == -1;
    }

    @Override // H0.g
    public final int g(m mVar) throws EOFException {
        AbstractC0150d.e(mVar, "options");
        if (this.f435c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            e eVar = this.f434b;
            int iB = I0.a.b(eVar, mVar, true);
            if (iB != -2) {
                if (iB != -1) {
                    eVar.o(mVar.f428a[iB].a());
                    return iB;
                }
            } else if (this.f433a.b(8192L, eVar) == -1) {
                break;
            }
        }
        return -1;
    }

    public final long h(byte b2, long j2, long j3) {
        p pVar;
        o oVar = this;
        long j4 = j3;
        if (oVar.f435c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (0 > j4) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j4).toString());
        }
        while (jMax < j4) {
            e eVar = oVar.f434b;
            eVar.getClass();
            long j5 = 0;
            boolean z2 = false;
            if (0 <= jMax && jMax <= j4) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalArgumentException(("size=" + eVar.f412b + " fromIndex=" + jMax + " toIndex=" + j4).toString());
            }
            long j6 = eVar.f412b;
            long j7 = j4 > j6 ? j6 : j4;
            long j8 = -1;
            if (jMax != j7 && (pVar = eVar.f411a) != null) {
                if (j6 - jMax >= jMax) {
                    while (true) {
                        long j9 = (pVar.f438c - pVar.f437b) + j5;
                        if (j9 > jMax) {
                            break;
                        }
                        pVar = pVar.f441f;
                        AbstractC0150d.b(pVar);
                        j5 = j9;
                    }
                    long j10 = jMax;
                    while (true) {
                        if (j5 >= j7) {
                            break;
                        }
                        int iMin = (int) Math.min(pVar.f438c, (pVar.f437b + j7) - j5);
                        for (int i2 = (int) ((pVar.f437b + j10) - j5); i2 < iMin; i2++) {
                            if (pVar.f436a[i2] == b2) {
                                j8 = (i2 - pVar.f437b) + j5;
                                break;
                            }
                        }
                        j10 = (pVar.f438c - pVar.f437b) + j5;
                        pVar = pVar.f441f;
                        AbstractC0150d.b(pVar);
                        j5 = j10;
                    }
                } else {
                    while (j6 > jMax) {
                        pVar = pVar.f442g;
                        AbstractC0150d.b(pVar);
                        j6 -= pVar.f438c - pVar.f437b;
                    }
                    long j11 = jMax;
                    while (true) {
                        if (j6 >= j7) {
                            break;
                        }
                        int iMin2 = (int) Math.min(pVar.f438c, (pVar.f437b + j7) - j6);
                        for (int i3 = (int) ((pVar.f437b + j11) - j6); i3 < iMin2; i3++) {
                            if (pVar.f436a[i3] == b2) {
                                j8 = (i3 - pVar.f437b) + j6;
                                break;
                            }
                        }
                        j11 = j6 + (pVar.f438c - pVar.f437b);
                        pVar = pVar.f441f;
                        AbstractC0150d.b(pVar);
                        j6 = j11;
                    }
                }
            }
            if (j8 != -1) {
                return j8;
            }
            long j12 = eVar.f412b;
            if (j12 >= j3) {
                return -1L;
            }
            oVar = this;
            if (oVar.f433a.b(8192L, eVar) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j12);
            j4 = j3;
        }
        return -1L;
    }

    public final byte i() throws EOFException {
        q(1L);
        return this.f434b.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f435c;
    }

    public final h j(long j2) throws EOFException {
        q(j2);
        return this.f434b.k(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() throws EOFException {
        e eVar;
        long j2;
        int i2;
        int i3;
        byte bH;
        int i4 = 48;
        q(1L);
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            boolean zP = p(i6);
            eVar = this.f434b;
            if (!zP) {
                break;
            }
            bH = eVar.h(i5);
            if ((bH < ((byte) 48) || bH > ((byte) 57)) && ((bH < ((byte) 97) || bH > ((byte) 102)) && (bH < ((byte) 65) || bH > ((byte) 70)))) {
                break;
            }
            i5 = i6;
        }
        if (i5 == 0) {
            C0.f.f(16);
            C0.f.f(16);
            String string = Integer.toString(bH, 16);
            AbstractC0150d.d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new NumberFormatException(AbstractC0150d.h(string, "Expected leading [0-9a-fA-F] character but was 0x"));
        }
        long j3 = 0;
        if (eVar.f412b == 0) {
            throw new EOFException();
        }
        long j4 = 0;
        int i7 = 0;
        boolean z2 = false;
        while (true) {
            p pVar = eVar.f411a;
            AbstractC0150d.b(pVar);
            int i8 = pVar.f437b;
            int i9 = pVar.f438c;
            int i10 = i7;
            while (i8 < i9) {
                byte b2 = pVar.f436a[i8];
                byte b3 = (byte) i4;
                if (b2 < b3 || b2 > ((byte) 57)) {
                    byte b4 = (byte) 97;
                    if ((b2 < b4 || b2 > ((byte) 102)) && (b2 < (b4 = (byte) 65) || b2 > ((byte) 70))) {
                        i2 = i10;
                        j2 = 0;
                        if (i2 == 0) {
                            char[] cArr = I0.b.f465a;
                            throw new NumberFormatException(AbstractC0150d.h(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]}), "Expected leading [0-9a-fA-F] character but was 0x"));
                        }
                        z2 = true;
                        if (i8 != i9) {
                            eVar.f411a = pVar.a();
                            q.a(pVar);
                        } else {
                            pVar.f437b = i8;
                        }
                        if (!!z2 || eVar.f411a == null) {
                            break;
                        }
                        i7 = i2;
                        j3 = j2;
                        i4 = 48;
                    } else {
                        i3 = (b2 - b4) + 10;
                    }
                } else {
                    i3 = b2 - b3;
                }
                if ((j4 & (-1152921504606846976L)) != 0) {
                    e eVar2 = new e();
                    eVar2.v(j4);
                    eVar2.u(b2);
                    throw new NumberFormatException(AbstractC0150d.h(eVar2.n(eVar2.f412b, q0.a.f2219a), "Number too large: "));
                }
                j4 = (j4 << 4) | i3;
                i8++;
                i10++;
                j3 = 0;
                i4 = 48;
            }
            j2 = j3;
            i2 = i10;
            if (i8 != i9) {
            }
            if (!z2) {
                break;
            }
            break;
            break;
        }
        eVar.f412b -= i2;
        return j4;
    }

    public final int l() throws EOFException {
        q(4L);
        return this.f434b.l();
    }

    public final int m() throws EOFException {
        q(4L);
        int iL = this.f434b.l();
        return ((iL & 255) << 24) | (((-16777216) & iL) >>> 24) | ((16711680 & iL) >>> 8) | ((65280 & iL) << 8);
    }

    public final short n() throws EOFException {
        q(2L);
        return this.f434b.m();
    }

    public final String o(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "limit < 0: ").toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b2 = (byte) 10;
        long jH = h(b2, 0L, j3);
        e eVar = this.f434b;
        if (jH != -1) {
            return I0.a.a(jH, eVar);
        }
        if (j3 < Long.MAX_VALUE && p(j3) && eVar.h(j3 - 1) == ((byte) 13) && p(1 + j3) && eVar.h(j3) == b2) {
            return I0.a.a(j3, eVar);
        }
        e eVar2 = new e();
        long jMin = Math.min(32, eVar.f412b);
        long j4 = 0;
        eVar.getClass();
        AbstractC0150d.e(eVar2, "out");
        C0.f.e(eVar.f412b, 0L, jMin);
        if (jMin != 0) {
            eVar2.f412b += jMin;
            p pVar = eVar.f411a;
            while (true) {
                AbstractC0150d.b(pVar);
                long j5 = pVar.f438c - pVar.f437b;
                if (j4 < j5) {
                    break;
                }
                j4 -= j5;
                pVar = pVar.f441f;
            }
            while (jMin > 0) {
                AbstractC0150d.b(pVar);
                p pVarC = pVar.c();
                int i2 = pVarC.f437b + ((int) j4);
                pVarC.f437b = i2;
                pVarC.f438c = Math.min(i2 + ((int) jMin), pVarC.f438c);
                p pVar2 = eVar2.f411a;
                if (pVar2 == null) {
                    pVarC.f442g = pVarC;
                    pVarC.f441f = pVarC;
                    eVar2.f411a = pVarC;
                } else {
                    p pVar3 = pVar2.f442g;
                    AbstractC0150d.b(pVar3);
                    pVar3.b(pVarC);
                }
                jMin -= pVarC.f438c - pVarC.f437b;
                pVar = pVar.f441f;
                j4 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(eVar.f412b, j2) + " content=" + eVar2.k(eVar2.f412b).b() + (char) 8230);
    }

    public final boolean p(long j2) {
        e eVar;
        if (j2 < 0) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "byteCount < 0: ").toString());
        }
        if (this.f435c) {
            throw new IllegalStateException("closed");
        }
        do {
            eVar = this.f434b;
            if (eVar.f412b >= j2) {
                return true;
            }
        } while (this.f433a.b(8192L, eVar) != -1);
        return false;
    }

    public final void q(long j2) throws EOFException {
        if (!p(j2)) {
            throw new EOFException();
        }
    }

    public final void r(long j2) throws EOFException {
        if (this.f435c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            e eVar = this.f434b;
            if (eVar.f412b == 0 && this.f433a.b(8192L, eVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, eVar.f412b);
            eVar.o(jMin);
            j2 -= jMin;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC0150d.e(byteBuffer, "sink");
        e eVar = this.f434b;
        if (eVar.f412b == 0 && this.f433a.b(8192L, eVar) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f433a + ')';
    }
}
