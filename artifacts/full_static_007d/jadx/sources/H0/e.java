package H0;

import b0.AbstractC0081g;
import j0.AbstractC0150d;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public p f411a;

    /* renamed from: b, reason: collision with root package name */
    public long f412b;

    @Override // H0.t
    public final v a() {
        return v.f448d;
    }

    @Override // H0.t
    public final long b(long j2, e eVar) {
        AbstractC0150d.e(eVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "byteCount < 0: ").toString());
        }
        long j3 = this.f412b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        eVar.c(j2, this);
        return j2;
    }

    @Override // H0.s
    public final void c(long j2, e eVar) {
        p pVarB;
        AbstractC0150d.e(eVar, "source");
        if (eVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        C0.f.e(eVar.f412b, 0L, j2);
        while (j2 > 0) {
            p pVar = eVar.f411a;
            AbstractC0150d.b(pVar);
            int i2 = pVar.f438c;
            p pVar2 = eVar.f411a;
            AbstractC0150d.b(pVar2);
            long j3 = i2 - pVar2.f437b;
            int i3 = 0;
            if (j2 < j3) {
                p pVar3 = this.f411a;
                p pVar4 = pVar3 != null ? pVar3.f442g : null;
                if (pVar4 != null && pVar4.f440e) {
                    if ((pVar4.f438c + j2) - (pVar4.f439d ? 0 : pVar4.f437b) <= 8192) {
                        p pVar5 = eVar.f411a;
                        AbstractC0150d.b(pVar5);
                        pVar5.d(pVar4, (int) j2);
                        eVar.f412b -= j2;
                        this.f412b += j2;
                        return;
                    }
                }
                p pVar6 = eVar.f411a;
                AbstractC0150d.b(pVar6);
                int i4 = (int) j2;
                if (i4 <= 0 || i4 > pVar6.f438c - pVar6.f437b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    pVarB = pVar6.c();
                } else {
                    pVarB = q.b();
                    int i5 = pVar6.f437b;
                    AbstractC0081g.x(pVar6.f436a, 0, i5, pVarB.f436a, i5 + i4);
                }
                pVarB.f438c = pVarB.f437b + i4;
                pVar6.f437b += i4;
                p pVar7 = pVar6.f442g;
                AbstractC0150d.b(pVar7);
                pVar7.b(pVarB);
                eVar.f411a = pVarB;
            }
            p pVar8 = eVar.f411a;
            AbstractC0150d.b(pVar8);
            long j4 = pVar8.f438c - pVar8.f437b;
            eVar.f411a = pVar8.a();
            p pVar9 = this.f411a;
            if (pVar9 == null) {
                this.f411a = pVar8;
                pVar8.f442g = pVar8;
                pVar8.f441f = pVar8;
            } else {
                p pVar10 = pVar9.f442g;
                AbstractC0150d.b(pVar10);
                pVar10.b(pVar8);
                p pVar11 = pVar8.f442g;
                if (pVar11 == pVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC0150d.b(pVar11);
                if (pVar11.f440e) {
                    int i6 = pVar8.f438c - pVar8.f437b;
                    p pVar12 = pVar8.f442g;
                    AbstractC0150d.b(pVar12);
                    int i7 = 8192 - pVar12.f438c;
                    p pVar13 = pVar8.f442g;
                    AbstractC0150d.b(pVar13);
                    if (!pVar13.f439d) {
                        p pVar14 = pVar8.f442g;
                        AbstractC0150d.b(pVar14);
                        i3 = pVar14.f437b;
                    }
                    if (i6 <= i7 + i3) {
                        p pVar15 = pVar8.f442g;
                        AbstractC0150d.b(pVar15);
                        pVar8.d(pVar15, i6);
                        pVar8.a();
                        q.a(pVar8);
                    }
                }
            }
            eVar.f412b -= j4;
            this.f412b += j4;
            j2 -= j4;
        }
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f412b != 0) {
            p pVar = this.f411a;
            AbstractC0150d.b(pVar);
            p pVarC = pVar.c();
            eVar.f411a = pVarC;
            pVarC.f442g = pVarC;
            pVarC.f441f = pVarC;
            for (p pVar2 = pVar.f441f; pVar2 != pVar; pVar2 = pVar2.f441f) {
                p pVar3 = pVarC.f442g;
                AbstractC0150d.b(pVar3);
                AbstractC0150d.b(pVar2);
                pVar3.b(pVar2.c());
            }
            eVar.f412b = this.f412b;
        }
        return eVar;
    }

    @Override // H0.f
    public final /* bridge */ /* synthetic */ f d(String str) {
        x(str);
        return this;
    }

    @Override // H0.g
    public final String e(Charset charset) {
        return n(this.f412b, charset);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                long j2 = this.f412b;
                e eVar = (e) obj;
                if (j2 == eVar.f412b) {
                    if (j2 != 0) {
                        p pVar = this.f411a;
                        AbstractC0150d.b(pVar);
                        p pVar2 = eVar.f411a;
                        AbstractC0150d.b(pVar2);
                        int i2 = pVar.f437b;
                        int i3 = pVar2.f437b;
                        long j3 = 0;
                        while (j3 < this.f412b) {
                            long jMin = Math.min(pVar.f438c - i2, pVar2.f438c - i3);
                            if (0 < jMin) {
                                long j4 = 0;
                                do {
                                    j4++;
                                    int i4 = i2 + 1;
                                    byte b2 = pVar.f436a[i2];
                                    int i5 = i3 + 1;
                                    if (b2 == pVar2.f436a[i3]) {
                                        i3 = i5;
                                        i2 = i4;
                                    }
                                } while (j4 < jMin);
                            }
                            if (i2 == pVar.f438c) {
                                p pVar3 = pVar.f441f;
                                AbstractC0150d.b(pVar3);
                                i2 = pVar3.f437b;
                                pVar = pVar3;
                            }
                            if (i3 == pVar2.f438c) {
                                pVar2 = pVar2.f441f;
                                AbstractC0150d.b(pVar2);
                                i3 = pVar2.f437b;
                            }
                            j3 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.f412b == 0;
    }

    @Override // H0.g
    public final int g(m mVar) throws EOFException {
        AbstractC0150d.e(mVar, "options");
        int iB = I0.a.b(this, mVar, false);
        if (iB == -1) {
            return -1;
        }
        o(mVar.f428a[iB].a());
        return iB;
    }

    public final byte h(long j2) {
        C0.f.e(this.f412b, j2, 1L);
        p pVar = this.f411a;
        if (pVar == null) {
            AbstractC0150d.b(null);
            throw null;
        }
        long j3 = this.f412b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                pVar = pVar.f442g;
                AbstractC0150d.b(pVar);
                j3 -= pVar.f438c - pVar.f437b;
            }
            return pVar.f436a[(int) ((pVar.f437b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i2 = pVar.f438c;
            int i3 = pVar.f437b;
            long j5 = (i2 - i3) + j4;
            if (j5 > j2) {
                return pVar.f436a[(int) ((i3 + j2) - j4)];
            }
            pVar = pVar.f441f;
            AbstractC0150d.b(pVar);
            j4 = j5;
        }
    }

    public final int hashCode() {
        p pVar = this.f411a;
        if (pVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = pVar.f438c;
            for (int i4 = pVar.f437b; i4 < i3; i4++) {
                i2 = (i2 * 31) + pVar.f436a[i4];
            }
            pVar = pVar.f441f;
            AbstractC0150d.b(pVar);
        } while (pVar != this.f411a);
        return i2;
    }

    public final byte i() throws EOFException {
        if (this.f412b == 0) {
            throw new EOFException();
        }
        p pVar = this.f411a;
        AbstractC0150d.b(pVar);
        int i2 = pVar.f437b;
        int i3 = pVar.f438c;
        int i4 = i2 + 1;
        byte b2 = pVar.f436a[i2];
        this.f412b--;
        if (i4 == i3) {
            this.f411a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f437b = i4;
        }
        return b2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j2) throws EOFException {
        int iMin;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "byteCount: ").toString());
        }
        if (this.f412b < j2) {
            throw new EOFException();
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i2 - i3;
            C0.f.e(i2, i3, i4);
            p pVar = this.f411a;
            if (pVar == null) {
                iMin = -1;
            } else {
                iMin = Math.min(i4, pVar.f438c - pVar.f437b);
                int i5 = pVar.f437b;
                AbstractC0081g.x(pVar.f436a, i3, i5, bArr, i5 + iMin);
                int i6 = pVar.f437b + iMin;
                pVar.f437b = i6;
                this.f412b -= iMin;
                if (i6 == pVar.f438c) {
                    this.f411a = pVar.a();
                    q.a(pVar);
                }
            }
            if (iMin == -1) {
                throw new EOFException();
            }
            i3 += iMin;
        }
        return bArr;
    }

    public final h k(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "byteCount: ").toString());
        }
        if (this.f412b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new h(j(j2));
        }
        h hVarP = p((int) j2);
        o(j2);
        return hVarP;
    }

    public final int l() throws EOFException {
        if (this.f412b < 4) {
            throw new EOFException();
        }
        p pVar = this.f411a;
        AbstractC0150d.b(pVar);
        int i2 = pVar.f437b;
        int i3 = pVar.f438c;
        if (i3 - i2 < 4) {
            return ((i() & 255) << 24) | ((i() & 255) << 16) | ((i() & 255) << 8) | (i() & 255);
        }
        byte[] bArr = pVar.f436a;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i6 = i2 + 4;
        int i7 = i5 | (bArr[i4] & 255);
        this.f412b -= 4;
        if (i6 == i3) {
            this.f411a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f437b = i6;
        }
        return i7;
    }

    public final short m() throws EOFException {
        if (this.f412b < 2) {
            throw new EOFException();
        }
        p pVar = this.f411a;
        AbstractC0150d.b(pVar);
        int i2 = pVar.f437b;
        int i3 = pVar.f438c;
        if (i3 - i2 < 2) {
            return (short) (((i() & 255) << 8) | (i() & 255));
        }
        int i4 = i2 + 1;
        byte[] bArr = pVar.f436a;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & 255) | i5;
        this.f412b -= 2;
        if (i6 == i3) {
            this.f411a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f437b = i6;
        }
        return (short) i7;
    }

    public final String n(long j2, Charset charset) throws EOFException {
        AbstractC0150d.e(charset, "charset");
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "byteCount: ").toString());
        }
        if (this.f412b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return BuildConfig.FLAVOR;
        }
        p pVar = this.f411a;
        AbstractC0150d.b(pVar);
        int i2 = pVar.f437b;
        if (i2 + j2 > pVar.f438c) {
            return new String(j(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(pVar.f436a, i2, i3, charset);
        int i4 = pVar.f437b + i3;
        pVar.f437b = i4;
        this.f412b -= j2;
        if (i4 == pVar.f438c) {
            this.f411a = pVar.a();
            q.a(pVar);
        }
        return str;
    }

    public final void o(long j2) throws EOFException {
        while (j2 > 0) {
            p pVar = this.f411a;
            if (pVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, pVar.f438c - pVar.f437b);
            long j3 = iMin;
            this.f412b -= j3;
            j2 -= j3;
            int i2 = pVar.f437b + iMin;
            pVar.f437b = i2;
            if (i2 == pVar.f438c) {
                this.f411a = pVar.a();
                q.a(pVar);
            }
        }
    }

    public final h p(int i2) {
        if (i2 == 0) {
            return h.f413d;
        }
        C0.f.e(this.f412b, 0L, i2);
        p pVar = this.f411a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            AbstractC0150d.b(pVar);
            int i6 = pVar.f438c;
            int i7 = pVar.f437b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            pVar = pVar.f441f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        p pVar2 = this.f411a;
        int i8 = 0;
        while (i3 < i2) {
            AbstractC0150d.b(pVar2);
            bArr[i8] = pVar2.f436a;
            i3 += pVar2.f438c - pVar2.f437b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = pVar2.f437b;
            pVar2.f439d = true;
            i8++;
            pVar2 = pVar2.f441f;
        }
        return new r(bArr, iArr);
    }

    public final p q(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        p pVar = this.f411a;
        if (pVar == null) {
            p pVarB = q.b();
            this.f411a = pVarB;
            pVarB.f442g = pVarB;
            pVarB.f441f = pVarB;
            return pVarB;
        }
        p pVar2 = pVar.f442g;
        AbstractC0150d.b(pVar2);
        if (pVar2.f438c + i2 <= 8192 && pVar2.f440e) {
            return pVar2;
        }
        p pVarB2 = q.b();
        pVar2.b(pVarB2);
        return pVarB2;
    }

    public final void r(h hVar) {
        AbstractC0150d.e(hVar, "byteString");
        hVar.i(this, hVar.a());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC0150d.e(byteBuffer, "sink");
        p pVar = this.f411a;
        if (pVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), pVar.f438c - pVar.f437b);
        byteBuffer.put(pVar.f436a, pVar.f437b, iMin);
        int i2 = pVar.f437b + iMin;
        pVar.f437b = i2;
        this.f412b -= iMin;
        if (i2 == pVar.f438c) {
            this.f411a = pVar.a();
            q.a(pVar);
        }
        return iMin;
    }

    public final void s(byte[] bArr, int i2) {
        AbstractC0150d.e(bArr, "source");
        int i3 = 0;
        long j2 = i2;
        C0.f.e(bArr.length, 0, j2);
        while (i3 < i2) {
            p pVarQ = q(1);
            int iMin = Math.min(i2 - i3, 8192 - pVarQ.f438c);
            int i4 = i3 + iMin;
            AbstractC0081g.x(bArr, pVarQ.f438c, i3, pVarQ.f436a, i4);
            pVarQ.f438c += iMin;
            i3 = i4;
        }
        this.f412b += j2;
    }

    public final void t(t tVar) {
        AbstractC0150d.e(tVar, "source");
        while (tVar.b(8192L, this) != -1) {
        }
    }

    public final String toString() {
        long j2 = this.f412b;
        if (j2 <= 2147483647L) {
            return p((int) j2).toString();
        }
        throw new IllegalStateException(AbstractC0150d.h(Long.valueOf(j2), "size > Int.MAX_VALUE: ").toString());
    }

    public final void u(int i2) {
        p pVarQ = q(1);
        int i3 = pVarQ.f438c;
        pVarQ.f438c = i3 + 1;
        pVarQ.f436a[i3] = (byte) i2;
        this.f412b++;
    }

    public final void v(long j2) {
        if (j2 == 0) {
            u(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        p pVarQ = q(i2);
        int i3 = pVarQ.f438c;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            pVarQ.f436a[i4] = I0.a.f464a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        pVarQ.f438c += i2;
        this.f412b += i2;
    }

    public final void w(int i2) {
        p pVarQ = q(4);
        int i3 = pVarQ.f438c;
        byte[] bArr = pVarQ.f436a;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        pVarQ.f438c = i3 + 4;
        this.f412b += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC0150d.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            p pVarQ = q(1);
            int iMin = Math.min(i2, 8192 - pVarQ.f438c);
            byteBuffer.get(pVarQ.f436a, pVarQ.f438c, iMin);
            i2 -= iMin;
            pVarQ.f438c += iMin;
        }
        this.f412b += iRemaining;
        return iRemaining;
    }

    public final void x(String str) {
        AbstractC0150d.e(str, "string");
        y(str, 0, str.length());
    }

    public final void y(String str, int i2, int i3) {
        char cCharAt;
        AbstractC0150d.e(str, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0150d.h(Integer.valueOf(i2), "beginIndex < 0: ").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        while (i2 < i3) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 128) {
                p pVarQ = q(1);
                int i4 = pVarQ.f438c - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                byte[] bArr = pVarQ.f436a;
                bArr[i2 + i4] = (byte) cCharAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= iMin || (cCharAt = str.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt;
                }
                int i6 = pVarQ.f438c;
                int i7 = (i4 + i2) - i6;
                pVarQ.f438c = i6 + i7;
                this.f412b += i7;
            } else {
                if (cCharAt2 < 2048) {
                    p pVarQ2 = q(2);
                    int i8 = pVarQ2.f438c;
                    byte[] bArr2 = pVarQ2.f436a;
                    bArr2[i8] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    pVarQ2.f438c = i8 + 2;
                    this.f412b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    p pVarQ3 = q(3);
                    int i9 = pVarQ3.f438c;
                    byte[] bArr3 = pVarQ3.f436a;
                    bArr3[i9] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    pVarQ3.f438c = i9 + 3;
                    this.f412b += 3;
                } else {
                    int i10 = i2 + 1;
                    char cCharAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 > 57343) {
                        u(63);
                        i2 = i10;
                    } else {
                        int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        p pVarQ4 = q(4);
                        int i12 = pVarQ4.f438c;
                        byte[] bArr4 = pVarQ4.f436a;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        pVarQ4.f438c = i12 + 4;
                        this.f412b += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final void z(int i2) {
        String str;
        int i3 = 0;
        if (i2 < 128) {
            u(i2);
            return;
        }
        if (i2 < 2048) {
            p pVarQ = q(2);
            int i4 = pVarQ.f438c;
            byte[] bArr = pVarQ.f436a;
            bArr[i4] = (byte) ((i2 >> 6) | 192);
            bArr[1 + i4] = (byte) ((i2 & 63) | 128);
            pVarQ.f438c = i4 + 2;
            this.f412b += 2;
            return;
        }
        if (55296 <= i2 && i2 <= 57343) {
            u(63);
            return;
        }
        if (i2 < 65536) {
            p pVarQ2 = q(3);
            int i5 = pVarQ2.f438c;
            byte[] bArr2 = pVarQ2.f436a;
            bArr2[i5] = (byte) ((i2 >> 12) | 224);
            bArr2[1 + i5] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[2 + i5] = (byte) ((i2 & 63) | 128);
            pVarQ2.f438c = i5 + 3;
            this.f412b += 3;
            return;
        }
        if (i2 <= 1114111) {
            p pVarQ3 = q(4);
            int i6 = pVarQ3.f438c;
            byte[] bArr3 = pVarQ3.f436a;
            bArr3[i6] = (byte) ((i2 >> 18) | 240);
            bArr3[1 + i6] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[2 + i6] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[3 + i6] = (byte) ((i2 & 63) | 128);
            pVarQ3.f438c = i6 + 4;
            this.f412b += 4;
            return;
        }
        if (i2 != 0) {
            char[] cArr = I0.b.f465a;
            char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
            while (i3 < 8 && cArr2[i3] == '0') {
                i3++;
            }
            if (i3 < 0) {
                throw new IndexOutOfBoundsException(A.e.b("startIndex: ", i3, ", endIndex: 8, size: 8"));
            }
            if (i3 > 8) {
                throw new IllegalArgumentException(A.e.b("startIndex: ", i3, " > endIndex: 8"));
            }
            str = new String(cArr2, i3, 8 - i3);
        } else {
            str = "0";
        }
        throw new IllegalArgumentException(AbstractC0150d.h(str, "Unexpected code point: 0x"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, H0.s
    public final void close() {
    }

    @Override // H0.s, java.io.Flushable
    public final void flush() {
    }
}
