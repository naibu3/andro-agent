package B0;

import b0.AbstractC0081g;
import j0.AbstractC0150d;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: B0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d {

    /* renamed from: c, reason: collision with root package name */
    public final H0.o f99c;

    /* renamed from: f, reason: collision with root package name */
    public int f102f;

    /* renamed from: g, reason: collision with root package name */
    public int f103g;

    /* renamed from: a, reason: collision with root package name */
    public int f97a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f98b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0002c[] f100d = new C0002c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f101e = 7;

    public C0003d(v vVar) {
        this.f99c = new H0.o(vVar);
    }

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f100d.length;
            while (true) {
                length--;
                i3 = this.f101e;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0002c c0002c = this.f100d[length];
                AbstractC0150d.b(c0002c);
                int i5 = c0002c.f96c;
                i2 -= i5;
                this.f103g -= i5;
                this.f102f--;
                i4++;
            }
            C0002c[] c0002cArr = this.f100d;
            System.arraycopy(c0002cArr, i3 + 1, c0002cArr, i3 + 1 + i4, this.f102f);
            this.f101e += i4;
        }
        return i4;
    }

    public final H0.h b(int i2) throws IOException {
        if (i2 >= 0) {
            C0002c[] c0002cArr = AbstractC0005f.f111a;
            if (i2 <= c0002cArr.length - 1) {
                return c0002cArr[i2].f94a;
            }
        }
        int length = this.f101e + 1 + (i2 - AbstractC0005f.f111a.length);
        if (length >= 0) {
            C0002c[] c0002cArr2 = this.f100d;
            if (length < c0002cArr2.length) {
                C0002c c0002c = c0002cArr2[length];
                AbstractC0150d.b(c0002c);
                return c0002c.f94a;
            }
        }
        throw new IOException(AbstractC0150d.h(Integer.valueOf(i2 + 1), "Header index too large "));
    }

    public final void c(C0002c c0002c) {
        this.f98b.add(c0002c);
        int i2 = this.f97a;
        int i3 = c0002c.f96c;
        if (i3 > i2) {
            C0002c[] c0002cArr = this.f100d;
            AbstractC0081g.A(c0002cArr, 0, c0002cArr.length);
            this.f101e = this.f100d.length - 1;
            this.f102f = 0;
            this.f103g = 0;
            return;
        }
        a((this.f103g + i3) - i2);
        int i4 = this.f102f + 1;
        C0002c[] c0002cArr2 = this.f100d;
        if (i4 > c0002cArr2.length) {
            C0002c[] c0002cArr3 = new C0002c[c0002cArr2.length * 2];
            System.arraycopy(c0002cArr2, 0, c0002cArr3, c0002cArr2.length, c0002cArr2.length);
            this.f101e = this.f100d.length - 1;
            this.f100d = c0002cArr3;
        }
        int i5 = this.f101e;
        this.f101e = i5 - 1;
        this.f100d[i5] = c0002c;
        this.f102f++;
        this.f103g += i3;
    }

    public final H0.h d() {
        int i2;
        H0.o oVar = this.f99c;
        byte bI = oVar.i();
        byte[] bArr = v0.b.f2808a;
        int i3 = bI & 255;
        int i4 = 0;
        boolean z2 = (bI & 128) == 128;
        long jE = e(i3, 127);
        if (!z2) {
            return oVar.j(jE);
        }
        H0.e eVar = new H0.e();
        int[] iArr = D.f75a;
        AbstractC0150d.e(oVar, "source");
        C c2 = D.f77c;
        C c3 = c2;
        long j2 = 0;
        int i5 = 0;
        while (j2 < jE) {
            j2++;
            byte bI2 = oVar.i();
            byte[] bArr2 = v0.b.f2808a;
            i4 = (i4 << 8) | (bI2 & 255);
            i5 += 8;
            while (i5 >= 8) {
                C[] cArr = (C[]) c3.f74c;
                AbstractC0150d.b(cArr);
                c3 = cArr[(i4 >>> (i5 - 8)) & 255];
                AbstractC0150d.b(c3);
                if (((C[]) c3.f74c) == null) {
                    eVar.u(c3.f72a);
                    i5 -= c3.f73b;
                    c3 = c2;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            C[] cArr2 = (C[]) c3.f74c;
            AbstractC0150d.b(cArr2);
            C c4 = cArr2[(i4 << (8 - i5)) & 255];
            AbstractC0150d.b(c4);
            if (((C[]) c4.f74c) != null || (i2 = c4.f73b) > i5) {
                break;
            }
            eVar.u(c4.f72a);
            i5 -= i2;
            c3 = c2;
        }
        return eVar.k(eVar.f412b);
    }

    public final int e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte bI = this.f99c.i();
            byte[] bArr = v0.b.f2808a;
            int i6 = bI & 255;
            if ((bI & 128) == 0) {
                return i3 + (i6 << i5);
            }
            i3 += (bI & 127) << i5;
            i5 += 7;
        }
    }
}
