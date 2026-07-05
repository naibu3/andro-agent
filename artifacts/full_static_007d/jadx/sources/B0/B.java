package B0;

import b0.AbstractC0081g;
import j0.AbstractC0150d;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class B implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f66f = Logger.getLogger(AbstractC0006g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final H0.n f67a;

    /* renamed from: b, reason: collision with root package name */
    public final H0.e f68b;

    /* renamed from: c, reason: collision with root package name */
    public int f69c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70d;

    /* renamed from: e, reason: collision with root package name */
    public final C0004e f71e;

    public B(H0.n nVar) {
        AbstractC0150d.e(nVar, "sink");
        this.f67a = nVar;
        H0.e eVar = new H0.e();
        this.f68b = eVar;
        this.f69c = 16384;
        this.f71e = new C0004e(eVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f70d = true;
        this.f67a.close();
    }

    public final synchronized void f(F f2) {
        try {
            AbstractC0150d.e(f2, "peerSettings");
            if (this.f70d) {
                throw new IOException("closed");
            }
            int i2 = this.f69c;
            int i3 = f2.f79a;
            if ((i3 & 32) != 0) {
                i2 = ((int[]) f2.f80b)[5];
            }
            this.f69c = i2;
            if (((i3 & 2) != 0 ? ((int[]) f2.f80b)[1] : -1) != -1) {
                C0004e c0004e = this.f71e;
                int i4 = (i3 & 2) != 0 ? ((int[]) f2.f80b)[1] : -1;
                c0004e.getClass();
                int iMin = Math.min(i4, 16384);
                int i5 = c0004e.f107d;
                if (i5 != iMin) {
                    if (iMin < i5) {
                        c0004e.f105b = Math.min(c0004e.f105b, iMin);
                    }
                    c0004e.f106c = true;
                    c0004e.f107d = iMin;
                    int i6 = c0004e.h;
                    if (iMin < i6) {
                        if (iMin == 0) {
                            C0002c[] c0002cArr = c0004e.f108e;
                            AbstractC0081g.A(c0002cArr, 0, c0002cArr.length);
                            c0004e.f109f = c0004e.f108e.length - 1;
                            c0004e.f110g = 0;
                            c0004e.h = 0;
                        } else {
                            c0004e.a(i6 - iMin);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f67a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.f70d) {
            throw new IOException("closed");
        }
        this.f67a.flush();
    }

    public final synchronized void h(boolean z2, int i2, H0.e eVar, int i3) {
        if (this.f70d) {
            throw new IOException("closed");
        }
        i(i2, i3, 0, z2 ? 1 : 0);
        if (i3 > 0) {
            AbstractC0150d.b(eVar);
            this.f67a.c(i3, eVar);
        }
    }

    public final void i(int i2, int i3, int i4, int i5) {
        Level level = Level.FINE;
        Logger logger = f66f;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC0006g.a(false, i2, i3, i4, i5));
        }
        if (i3 > this.f69c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f69c + ": " + i3).toString());
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw new IllegalArgumentException(AbstractC0150d.h(Integer.valueOf(i2), "reserved bit set: ").toString());
        }
        byte[] bArr = v0.b.f2808a;
        H0.n nVar = this.f67a;
        AbstractC0150d.e(nVar, "<this>");
        nVar.h((i3 >>> 16) & 255);
        nVar.h((i3 >>> 8) & 255);
        nVar.h(i3 & 255);
        nVar.h(i4 & 255);
        nVar.h(i5 & 255);
        nVar.i(i2 & Integer.MAX_VALUE);
    }

    public final synchronized void j(int i2, EnumC0001b enumC0001b, byte[] bArr) {
        if (this.f70d) {
            throw new IOException("closed");
        }
        if (enumC0001b.f88a == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        i(0, bArr.length + 8, 7, 0);
        this.f67a.i(i2);
        this.f67a.i(enumC0001b.f88a);
        if (bArr.length != 0) {
            H0.n nVar = this.f67a;
            if (nVar.f432c) {
                throw new IllegalStateException("closed");
            }
            nVar.f431b.s(bArr, bArr.length);
            nVar.f();
        }
        this.f67a.flush();
    }

    public final synchronized void k(boolean z2, int i2, ArrayList arrayList) {
        if (this.f70d) {
            throw new IOException("closed");
        }
        this.f71e.d(arrayList);
        long j2 = this.f68b.f412b;
        long jMin = Math.min(this.f69c, j2);
        int i3 = j2 == jMin ? 4 : 0;
        if (z2) {
            i3 |= 1;
        }
        i(i2, (int) jMin, 1, i3);
        this.f67a.c(jMin, this.f68b);
        if (j2 > jMin) {
            long j3 = j2 - jMin;
            while (j3 > 0) {
                long jMin2 = Math.min(this.f69c, j3);
                j3 -= jMin2;
                i(i2, (int) jMin2, 9, j3 == 0 ? 4 : 0);
                this.f67a.c(jMin2, this.f68b);
            }
        }
    }

    public final synchronized void l(int i2, int i3, boolean z2) {
        if (this.f70d) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z2 ? 1 : 0);
        this.f67a.i(i2);
        this.f67a.i(i3);
        this.f67a.flush();
    }

    public final synchronized void m(int i2, EnumC0001b enumC0001b) {
        if (this.f70d) {
            throw new IOException("closed");
        }
        if (enumC0001b.f88a == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i(i2, 4, 3, 0);
        this.f67a.i(enumC0001b.f88a);
        this.f67a.flush();
    }

    public final synchronized void n(long j2, int i2) {
        if (this.f70d) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0150d.h(Long.valueOf(j2), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        i(i2, 4, 8, 0);
        this.f67a.i((int) j2);
        this.f67a.flush();
    }
}
