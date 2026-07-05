package I0;

import H0.e;
import H0.m;
import H0.p;
import j0.AbstractC0150d;
import java.io.EOFException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f464a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(q0.a.f2219a);
        AbstractC0150d.d(bytes, "(this as java.lang.String).getBytes(charset)");
        f464a = bytes;
    }

    public static final String a(long j2, e eVar) throws EOFException {
        AbstractC0150d.e(eVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (eVar.h(j3) == ((byte) 13)) {
                String strN = eVar.n(j3, q0.a.f2219a);
                eVar.o(2L);
                return strN;
            }
        }
        String strN2 = eVar.n(j2, q0.a.f2219a);
        eVar.o(1L);
        return strN2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r19 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(e eVar, m mVar, boolean z2) {
        int i2;
        int i3;
        p pVar;
        byte[] bArr;
        int i4;
        AbstractC0150d.e(eVar, "<this>");
        AbstractC0150d.e(mVar, "options");
        p pVar2 = eVar.f411a;
        int i5 = -2;
        if (pVar2 != null) {
            int i6 = pVar2.f437b;
            int i7 = pVar2.f438c;
            byte[] bArr2 = pVar2.f436a;
            p pVar3 = pVar2;
            int i8 = -1;
            int i9 = 0;
            loop0: while (true) {
                int i10 = i9 + 1;
                int[] iArr = mVar.f429b;
                int i11 = iArr[i9];
                int i12 = i9 + 2;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i8 = i13;
                }
                if (pVar3 == null) {
                    break;
                }
                if (i11 >= 0) {
                    int i14 = i6 + 1;
                    int i15 = bArr2[i6] & 255;
                    int i16 = i12 + i11;
                    while (i12 != i16) {
                        if (i15 == iArr[i12]) {
                            i2 = iArr[i12 + i11];
                            if (i14 == i7) {
                                pVar3 = pVar3.f441f;
                                AbstractC0150d.b(pVar3);
                                i3 = pVar3.f437b;
                                i7 = pVar3.f438c;
                                bArr2 = pVar3.f436a;
                                if (pVar3 == pVar2) {
                                    pVar3 = null;
                                }
                            } else {
                                i3 = i14;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i8;
                }
                int i17 = (i11 * (-1)) + i12;
                while (true) {
                    int i18 = i6 + 1;
                    int i19 = i12 + 1;
                    if ((bArr2[i6] & 255) != iArr[i12]) {
                        return i8;
                    }
                    boolean z3 = i19 == i17;
                    if (i18 == i7) {
                        AbstractC0150d.b(pVar3);
                        p pVar4 = pVar3.f441f;
                        AbstractC0150d.b(pVar4);
                        i4 = pVar4.f437b;
                        int i20 = pVar4.f438c;
                        bArr = pVar4.f436a;
                        if (pVar4 != pVar2) {
                            pVar = pVar4;
                            i7 = i20;
                        } else {
                            if (!z3) {
                                break loop0;
                            }
                            i7 = i20;
                            pVar = null;
                        }
                    } else {
                        pVar = pVar3;
                        bArr = bArr2;
                        i4 = i18;
                    }
                    if (z3) {
                        i2 = iArr[i19];
                        i3 = i4;
                        bArr2 = bArr;
                        pVar3 = pVar;
                        break;
                    }
                    i6 = i4;
                    bArr2 = bArr;
                    pVar3 = pVar;
                    i12 = i19;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i9 = -i2;
                i6 = i3;
                i5 = -2;
            }
        } else {
            return z2 ? -2 : -1;
        }
    }
}
