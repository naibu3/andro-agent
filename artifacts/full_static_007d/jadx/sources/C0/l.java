package C0;

import b0.AbstractC0084j;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.conscrypt.BuildConfig;
import u0.r;

/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f229c;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    static {
        int i2;
        int i3;
        Integer numValueOf;
        int i4;
        boolean z2 = true;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            numValueOf = null;
            break;
        }
        f.f(10);
        int length = property.length();
        if (length != 0) {
            char cCharAt = property.charAt(0);
            int i5 = -2147483647;
            if (AbstractC0150d.f(cCharAt, 48) < 0) {
                if (length != 1) {
                    if (cCharAt == '-') {
                        i5 = Integer.MIN_VALUE;
                        i2 = 1;
                    } else if (cCharAt == '+') {
                        i2 = 1;
                        i3 = 0;
                        int i6 = 0;
                        int i7 = -59652323;
                        while (i2 < length) {
                            int iDigit = Character.digit((int) property.charAt(i2), 10);
                            if (iDigit >= 0 && ((i6 >= i7 || (i7 == -59652323 && i6 >= (i7 = i5 / 10))) && (i4 = i6 * 10) >= i5 + iDigit)) {
                                i6 = i4 - iDigit;
                                i2++;
                            }
                        }
                        numValueOf = i3 == 0 ? Integer.valueOf(i6) : Integer.valueOf(-i6);
                    }
                }
                numValueOf = null;
                break;
            } else {
                i2 = 0;
            }
            i3 = i2;
            int i62 = 0;
            int i72 = -59652323;
            while (i2 < length) {
            }
            if (i3 == 0) {
            }
        }
        if (numValueOf == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numValueOf.intValue() < 9) {
            z2 = false;
        }
        f229c = z2;
    }

    @Override // C0.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0150d.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r) obj) != r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0084j.I(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r) it.next()).f2548a);
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // C0.o
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals(BuildConfig.FLAVOR)) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
