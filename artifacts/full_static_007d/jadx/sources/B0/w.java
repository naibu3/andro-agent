package B0;

import b0.AbstractC0081g;
import b0.AbstractC0082h;
import j0.AbstractC0150d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.conscrypt.ct.CTConstants;

/* loaded from: classes.dex */
public final class w implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f184d;

    /* renamed from: a, reason: collision with root package name */
    public final H0.o f185a;

    /* renamed from: b, reason: collision with root package name */
    public final v f186b;

    /* renamed from: c, reason: collision with root package name */
    public final C0003d f187c;

    static {
        Logger logger = Logger.getLogger(AbstractC0006g.class.getName());
        AbstractC0150d.d(logger, "getLogger(Http2::class.java.name)");
        f184d = logger;
    }

    public w(H0.o oVar) {
        AbstractC0150d.e(oVar, "source");
        this.f185a = oVar;
        v vVar = new v(oVar);
        this.f186b = vVar;
        this.f187c = new C0003d(vVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f185a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x024b, code lost:
    
        throw new java.io.IOException(j0.AbstractC0150d.h(java.lang.Integer.valueOf(r9), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(boolean z2, m mVar) throws IOException {
        EnumC0001b enumC0001b;
        Object[] array;
        int i2 = 2;
        int i3 = 0;
        AbstractC0150d.e(mVar, "handler");
        try {
            this.f185a.q(9L);
            int iS = v0.b.s(this.f185a);
            if (iS > 16384) {
                throw new IOException(AbstractC0150d.h(Integer.valueOf(iS), "FRAME_SIZE_ERROR: "));
            }
            int i4 = this.f185a.i() & 255;
            byte bI = this.f185a.i();
            int i5 = bI & 255;
            int iL = this.f185a.l();
            int i6 = Integer.MAX_VALUE & iL;
            Logger logger = f184d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC0006g.a(true, i6, iS, i4, i5));
            }
            if (z2 && i4 != 4) {
                String[] strArr = AbstractC0006g.f114b;
                throw new IOException(AbstractC0150d.h(i4 < strArr.length ? strArr[i4] : v0.b.h("0x%02x", Integer.valueOf(i4)), "Expected a SETTINGS frame but was "));
            }
            EnumC0001b enumC0001b2 = null;
            switch (i4) {
                case 0:
                    h(mVar, iS, i5, i6);
                    return true;
                case 1:
                    j(mVar, iS, i5, i6);
                    return true;
                case 2:
                    if (iS != 5) {
                        throw new IOException(A.e.b("TYPE_PRIORITY length: ", iS, " != 5"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    H0.o oVar = this.f185a;
                    oVar.l();
                    oVar.i();
                    return true;
                case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                    if (iS != 4) {
                        throw new IOException(A.e.b("TYPE_RST_STREAM length: ", iS, " != 4"));
                    }
                    if (i6 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int iL2 = this.f185a.l();
                    EnumC0001b[] enumC0001bArrValues = EnumC0001b.values();
                    int length = enumC0001bArrValues.length;
                    while (true) {
                        if (i3 < length) {
                            enumC0001b = enumC0001bArrValues[i3];
                            if (enumC0001b.f88a != iL2) {
                                i3++;
                            }
                        } else {
                            enumC0001b = null;
                        }
                    }
                    if (enumC0001b == null) {
                        throw new IOException(AbstractC0150d.h(Integer.valueOf(iL2), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    s sVar = mVar.f132b;
                    sVar.getClass();
                    if (i6 == 0 || (iL & 1) != 0) {
                        A aJ = sVar.j(i6);
                        if (aJ != null) {
                            aJ.k(enumC0001b);
                        }
                    } else {
                        sVar.f155i.c(new o(sVar.f150c + '[' + i6 + "] onReset", sVar, i6, enumC0001b, 2), 0L);
                    }
                    return true;
                case 4:
                    if (i6 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((bI & 1) != 0) {
                        if (iS != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else {
                        if (iS % 6 != 0) {
                            throw new IOException(AbstractC0150d.h(Integer.valueOf(iS), "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        F f2 = new F(0);
                        n0.a aVarT = C0.m.t(C0.m.v(0, iS), 6);
                        int i7 = aVarT.f2131a;
                        int i8 = aVarT.f2132b;
                        int i9 = aVarT.f2133c;
                        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                            while (true) {
                                int i10 = i7 + i9;
                                H0.o oVar2 = this.f185a;
                                short sN = oVar2.n();
                                byte[] bArr = v0.b.f2808a;
                                int i11 = sN & 65535;
                                int iL3 = oVar2.l();
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        i11 = 4;
                                    } else if (i11 != 4) {
                                        if (i11 == 5 && (iL3 < 16384 || iL3 > 16777215)) {
                                            break;
                                        }
                                    } else {
                                        if (iL3 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i11 = 7;
                                    }
                                } else if (iL3 != 0 && iL3 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                f2.f(i11, iL3);
                                if (i7 != i8) {
                                    i7 = i10;
                                }
                            }
                        }
                        s sVar2 = mVar.f132b;
                        sVar2.h.c(new k(AbstractC0150d.h(" applyAndAckSettings", sVar2.f150c), mVar, f2, i2), 0L);
                    }
                    return true;
                case 5:
                    k(mVar, iS, i5, i6);
                    return true;
                case 6:
                    if (iS != 8) {
                        throw new IOException(AbstractC0150d.h(Integer.valueOf(iS), "TYPE_PING length != 8: "));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int iL4 = this.f185a.l();
                    int iL5 = this.f185a.l();
                    if ((bI & 1) != 0) {
                        s sVar3 = mVar.f132b;
                        synchronized (sVar3) {
                            try {
                                if (iL4 == 1) {
                                    sVar3.f158l++;
                                } else if (iL4 == 2) {
                                    sVar3.f160n++;
                                } else if (iL4 == 3) {
                                    sVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        s sVar4 = mVar.f132b;
                        sVar4.h.c(new l(AbstractC0150d.h(" ping", sVar4.f150c), mVar.f132b, iL4, iL5), 0L);
                    }
                    return true;
                case 7:
                    if (iS < 8) {
                        throw new IOException(AbstractC0150d.h(Integer.valueOf(iS), "TYPE_GOAWAY length < 8: "));
                    }
                    if (i6 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int iL6 = this.f185a.l();
                    int iL7 = this.f185a.l();
                    int i12 = iS - 8;
                    EnumC0001b[] enumC0001bArrValues2 = EnumC0001b.values();
                    int length2 = enumC0001bArrValues2.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length2) {
                            EnumC0001b enumC0001b3 = enumC0001bArrValues2[i13];
                            if (enumC0001b3.f88a == iL7) {
                                enumC0001b2 = enumC0001b3;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (enumC0001b2 == null) {
                        throw new IOException(AbstractC0150d.h(Integer.valueOf(iL7), "TYPE_GOAWAY unexpected error code: "));
                    }
                    H0.h hVarJ = H0.h.f413d;
                    if (i12 > 0) {
                        hVarJ = this.f185a.j(i12);
                    }
                    AbstractC0150d.e(hVarJ, "debugData");
                    hVarJ.a();
                    s sVar5 = mVar.f132b;
                    synchronized (sVar5) {
                        array = sVar5.f149b.values().toArray(new A[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        sVar5.f153f = true;
                    }
                    A[] aArr = (A[]) array;
                    int length3 = aArr.length;
                    while (i3 < length3) {
                        A a2 = aArr[i3];
                        i3++;
                        if (a2.f53a > iL6 && a2.h()) {
                            a2.k(EnumC0001b.REFUSED_STREAM);
                            mVar.f132b.j(a2.f53a);
                        }
                    }
                    return true;
                case CTConstants.TIMESTAMP_LENGTH /* 8 */:
                    if (iS != 4) {
                        throw new IOException(AbstractC0150d.h(Integer.valueOf(iS), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long jL = this.f185a.l() & 2147483647L;
                    if (jL == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i6 == 0) {
                        s sVar6 = mVar.f132b;
                        synchronized (sVar6) {
                            sVar6.f167u += jL;
                            sVar6.notifyAll();
                        }
                    } else {
                        A aI = mVar.f132b.i(i6);
                        if (aI != null) {
                            synchronized (aI) {
                                aI.f58f += jL;
                                if (jL > 0) {
                                    aI.notifyAll();
                                }
                            }
                        }
                    }
                    return true;
                default:
                    this.f185a.r(iS);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0125, code lost:
    
        if (r8 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0127, code lost:
    
        r18.j(v0.b.f2809b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(m mVar, int i2, int i3, int i4) throws IOException {
        int i5;
        int i6;
        A a2;
        boolean z2;
        boolean z3;
        long j2;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i3 & 8) != 0) {
            byte bI = this.f185a.i();
            byte[] bArr = v0.b.f2808a;
            i6 = bI & 255;
            i5 = i2;
        } else {
            i5 = i2;
            i6 = 0;
        }
        int iA = u.a(i5, i3, i6);
        H0.o oVar = this.f185a;
        mVar.getClass();
        AbstractC0150d.e(oVar, "source");
        mVar.f132b.getClass();
        if (!(i4 != 0 && (i4 & 1) == 0)) {
            A aI = mVar.f132b.i(i4);
            if (aI != null) {
                byte[] bArr2 = v0.b.f2808a;
                y yVar = aI.f60i;
                long j3 = iA;
                yVar.getClass();
                while (true) {
                    if (j3 <= 0) {
                        a2 = aI;
                        break;
                    }
                    synchronized (yVar.f197f) {
                        z2 = yVar.f193b;
                        a2 = aI;
                        z3 = yVar.f195d.f412b + j3 > yVar.f192a;
                    }
                    if (z3) {
                        oVar.r(j3);
                        yVar.f197f.e(EnumC0001b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        oVar.r(j3);
                        break;
                    }
                    long jB = oVar.b(j3, yVar.f194c);
                    if (jB == -1) {
                        throw new EOFException();
                    }
                    j3 -= jB;
                    A a3 = yVar.f197f;
                    synchronized (a3) {
                        if (yVar.f196e) {
                            H0.e eVar = yVar.f194c;
                            j2 = eVar.f412b;
                            eVar.o(j2);
                        } else {
                            H0.e eVar2 = yVar.f195d;
                            boolean z5 = eVar2.f412b == 0;
                            eVar2.t(yVar.f194c);
                            if (z5) {
                                a3.notifyAll();
                            }
                            j2 = 0;
                        }
                    }
                    if (j2 > 0) {
                        yVar.f(j2);
                    }
                    aI = a2;
                }
            } else {
                mVar.f132b.n(i4, EnumC0001b.PROTOCOL_ERROR);
                long j4 = iA;
                mVar.f132b.l(j4);
                oVar.r(j4);
            }
        } else {
            s sVar = mVar.f132b;
            sVar.getClass();
            H0.e eVar3 = new H0.e();
            long j5 = iA;
            oVar.q(j5);
            oVar.b(j5, eVar3);
            sVar.f155i.c(new n(sVar.f150c + '[' + i4 + "] onData", sVar, i4, eVar3, iA, z4), 0L);
        }
        this.f185a.r(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        throw new java.io.IOException(j0.AbstractC0150d.h(java.lang.Integer.valueOf(r7), "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List i(int i2, int i3, int i4, int i5) throws IOException {
        C0003d c0003d;
        v vVar = this.f186b;
        vVar.f182e = i2;
        vVar.f179b = i2;
        vVar.f183f = i3;
        vVar.f180c = i4;
        vVar.f181d = i5;
        while (true) {
            c0003d = this.f187c;
            H0.o oVar = c0003d.f99c;
            boolean zF = oVar.f();
            ArrayList arrayList = c0003d.f98b;
            if (zF) {
                List listL = AbstractC0082h.L(arrayList);
                arrayList.clear();
                return listL;
            }
            byte bI = oVar.i();
            byte[] bArr = v0.b.f2808a;
            int i6 = bI & 255;
            if (i6 == 128) {
                throw new IOException("index == 0");
            }
            if ((bI & 128) == 128) {
                int iE = c0003d.e(i6, 127);
                int i7 = iE - 1;
                if (i7 >= 0) {
                    C0002c[] c0002cArr = AbstractC0005f.f111a;
                    if (i7 <= c0002cArr.length - 1) {
                        arrayList.add(c0002cArr[i7]);
                    }
                }
                int length = c0003d.f101e + 1 + (i7 - AbstractC0005f.f111a.length);
                if (length < 0) {
                    break;
                }
                C0002c[] c0002cArr2 = c0003d.f100d;
                if (length >= c0002cArr2.length) {
                    break;
                }
                C0002c c0002c = c0002cArr2[length];
                AbstractC0150d.b(c0002c);
                arrayList.add(c0002c);
            } else if (i6 == 64) {
                C0002c[] c0002cArr3 = AbstractC0005f.f111a;
                H0.h hVarD = c0003d.d();
                AbstractC0005f.a(hVarD);
                c0003d.c(new C0002c(hVarD, c0003d.d()));
            } else if ((bI & 64) == 64) {
                c0003d.c(new C0002c(c0003d.b(c0003d.e(i6, 63) - 1), c0003d.d()));
            } else if ((bI & 32) == 32) {
                int iE2 = c0003d.e(i6, 31);
                c0003d.f97a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    break;
                }
                int i8 = c0003d.f103g;
                if (iE2 < i8) {
                    if (iE2 == 0) {
                        C0002c[] c0002cArr4 = c0003d.f100d;
                        AbstractC0081g.A(c0002cArr4, 0, c0002cArr4.length);
                        c0003d.f101e = c0003d.f100d.length - 1;
                        c0003d.f102f = 0;
                        c0003d.f103g = 0;
                    } else {
                        c0003d.a(i8 - iE2);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                C0002c[] c0002cArr5 = AbstractC0005f.f111a;
                H0.h hVarD2 = c0003d.d();
                AbstractC0005f.a(hVarD2);
                arrayList.add(new C0002c(hVarD2, c0003d.d()));
            } else {
                arrayList.add(new C0002c(c0003d.b(c0003d.e(i6, 15) - 1), c0003d.d()));
            }
        }
        throw new IOException(AbstractC0150d.h(Integer.valueOf(c0003d.f97a), "Invalid dynamic table size update "));
    }

    public final void j(m mVar, int i2, int i3, int i4) throws IOException {
        int i5;
        int i6 = 1;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = false;
        boolean z3 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte bI = this.f185a.i();
            byte[] bArr = v0.b.f2808a;
            i5 = bI & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            H0.o oVar = this.f185a;
            oVar.l();
            oVar.i();
            byte[] bArr2 = v0.b.f2808a;
            mVar.getClass();
            i2 -= 5;
        }
        List listI = i(u.a(i2, i3, i5), i5, i3, i4);
        mVar.getClass();
        mVar.f132b.getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            z2 = true;
        }
        if (z2) {
            s sVar = mVar.f132b;
            sVar.getClass();
            sVar.f155i.c(new o(sVar.f150c + '[' + i4 + "] onHeaders", sVar, i4, listI, z3), 0L);
            return;
        }
        s sVar2 = mVar.f132b;
        synchronized (sVar2) {
            A aI = sVar2.i(i4);
            if (aI != null) {
                aI.j(v0.b.u(listI), z3);
                return;
            }
            if (sVar2.f153f) {
                return;
            }
            if (i4 <= sVar2.f151d) {
                return;
            }
            if (i4 % 2 == sVar2.f152e % 2) {
                return;
            }
            A a2 = new A(i4, sVar2, false, z3, v0.b.u(listI));
            sVar2.f151d = i4;
            sVar2.f149b.put(Integer.valueOf(i4), a2);
            sVar2.f154g.e().c(new k(sVar2.f150c + '[' + i4 + "] onStream", sVar2, a2, i6), 0L);
        }
    }

    public final void k(m mVar, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i3 & 8) != 0) {
            byte bI = this.f185a.i();
            byte[] bArr = v0.b.f2808a;
            i5 = bI & 255;
        } else {
            i5 = 0;
        }
        int iL = this.f185a.l() & Integer.MAX_VALUE;
        List listI = i(u.a(i2 - 4, i3, i5), i5, i3, i4);
        mVar.getClass();
        s sVar = mVar.f132b;
        sVar.getClass();
        synchronized (sVar) {
            if (sVar.y.contains(Integer.valueOf(iL))) {
                sVar.n(iL, EnumC0001b.PROTOCOL_ERROR);
                return;
            }
            sVar.y.add(Integer.valueOf(iL));
            sVar.f155i.c(new o(sVar.f150c + '[' + iL + "] onRequest", sVar, iL, listI, 1), 0L);
        }
    }
}
