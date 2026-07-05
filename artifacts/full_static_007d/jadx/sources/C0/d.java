package C0;

import H.T;
import M.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.lifecycle.I;
import b0.C0091q;
import d0.AbstractC0098a;
import e0.AbstractC0100a;
import j0.AbstractC0150d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k.C0213z;
import k.N0;
import k.f1;
import k.h1;
import org.conscrypt.BuildConfig;
import u0.r;
import u0.y;
import z.AbstractC0258c;
import z.AbstractC0266k;
import z.C0260e;
import z.C0263h;
import z.C0264i;

/* loaded from: classes.dex */
public abstract class d implements T, K.g {
    public d() {
        new ConcurrentHashMap();
    }

    public static float B(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return K.c.c(edgeEffect, f2, f3);
        }
        K.b.a(edgeEffect, f2, f3);
        return f2;
    }

    public static C0213z C(String str) throws ProtocolException, NumberFormatException {
        int i2;
        String strSubstring;
        AbstractC0150d.e(str, "statusLine");
        boolean zB = q0.k.B(str, false, "HTTP/1.");
        r rVar = r.HTTP_1_0;
        if (zB) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(AbstractC0150d.h(str, "Unexpected status line: "));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException(AbstractC0150d.h(str, "Unexpected status line: "));
                }
                rVar = r.HTTP_1_1;
            }
        } else {
            if (!q0.k.B(str, false, "ICY ")) {
                throw new ProtocolException(AbstractC0150d.h(str, "Unexpected status line: "));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException(AbstractC0150d.h(str, "Unexpected status line: "));
        }
        try {
            String strSubstring2 = str.substring(i2, i3);
            AbstractC0150d.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i4 = Integer.parseInt(strSubstring2);
            if (str.length() <= i3) {
                strSubstring = BuildConfig.FLAVOR;
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException(AbstractC0150d.h(str, "Unexpected status line: "));
                }
                strSubstring = str.substring(i2 + 4);
                AbstractC0150d.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new C0213z(rVar, i4, strSubstring, 2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(AbstractC0150d.h(str, "Unexpected status line: "));
        }
    }

    public static void H(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            f1.a(view, charSequence);
            return;
        }
        h1 h1Var = h1.f1914k;
        if (h1Var != null && h1Var.f1916a == view) {
            h1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new h1(view, charSequence);
            return;
        }
        h1 h1Var2 = h1.f1915l;
        if (h1Var2 != null && h1Var2.f1916a == view) {
            h1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final void d(x0.a aVar, x0.b bVar, String str) {
        x0.d.f2847i.fine(bVar.f2841b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f2836a);
    }

    public static void e(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC0150d.e(th, "<this>");
        AbstractC0150d.e(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC0100a.f1261a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0098a.f1260a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void f(long j2, H0.e eVar, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        int i7;
        long j3;
        H0.e eVar2;
        long j4;
        int i8 = i2;
        int i9 = 0;
        int i10 = 1;
        if (!(i3 < i4)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < i4) {
            int i11 = i3;
            while (true) {
                int i12 = i11 + 1;
                if (((H0.h) arrayList.get(i11)).a() < i8) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (i12 >= i4) {
                    break;
                } else {
                    i11 = i12;
                }
            }
        }
        H0.h hVar = (H0.h) arrayList.get(i3);
        H0.h hVar2 = (H0.h) arrayList.get(i4 - 1);
        if (i8 == hVar.a()) {
            int iIntValue = ((Number) arrayList2.get(i3)).intValue();
            int i13 = i3 + 1;
            H0.h hVar3 = (H0.h) arrayList.get(i13);
            i5 = i13;
            i6 = iIntValue;
            hVar = hVar3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (hVar.d(i8) == hVar2.d(i8)) {
            int iMin = Math.min(hVar.a(), hVar2.a());
            if (i8 < iMin) {
                int i14 = i8;
                while (true) {
                    int i15 = i14 + 1;
                    if (hVar.d(i14) != hVar2.d(i14)) {
                        break;
                    }
                    i9++;
                    if (i15 >= iMin) {
                        break;
                    } else {
                        i14 = i15;
                    }
                }
            }
            long j5 = 4;
            long j6 = (eVar.f412b / j5) + j2 + 2 + i9 + 1;
            eVar.w(-i9);
            eVar.w(i6);
            int i16 = i8 + i9;
            if (i8 < i16) {
                while (true) {
                    int i17 = i8 + 1;
                    eVar.w(hVar.d(i8) & 255);
                    if (i17 >= i16) {
                        break;
                    } else {
                        i8 = i17;
                    }
                }
            }
            if (i5 + 1 == i4) {
                if (i16 != ((H0.h) arrayList.get(i5)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                eVar.w(((Number) arrayList2.get(i5)).intValue());
                return;
            } else {
                H0.e eVar3 = new H0.e();
                eVar.w(((int) ((eVar3.f412b / j5) + j6)) * (-1));
                f(j6, eVar3, i16, arrayList, i5, i4, arrayList2);
                eVar.t(eVar3);
                return;
            }
        }
        int i18 = i5 + 1;
        if (i18 < i4) {
            while (true) {
                int i19 = i18 + 1;
                if (((H0.h) arrayList.get(i18 - 1)).d(i8) != ((H0.h) arrayList.get(i18)).d(i8)) {
                    i10++;
                }
                if (i19 >= i4) {
                    break;
                } else {
                    i18 = i19;
                }
            }
        }
        long j7 = 4;
        long j8 = (i10 * 2) + (eVar.f412b / j7) + j2 + 2;
        eVar.w(i10);
        eVar.w(i6);
        if (i5 < i4) {
            int i20 = i5;
            while (true) {
                int i21 = i20 + 1;
                int iD = ((H0.h) arrayList.get(i20)).d(i8);
                if (i20 == i5 || iD != ((H0.h) arrayList.get(i20 - 1)).d(i8)) {
                    eVar.w(iD & 255);
                }
                if (i21 >= i4) {
                    break;
                } else {
                    i20 = i21;
                }
            }
        }
        H0.e eVar4 = new H0.e();
        while (i5 < i4) {
            byte bD = ((H0.h) arrayList.get(i5)).d(i8);
            int i22 = i5 + 1;
            if (i22 < i4) {
                int i23 = i22;
                while (true) {
                    int i24 = i23 + 1;
                    if (bD != ((H0.h) arrayList.get(i23)).d(i8)) {
                        i7 = i23;
                        break;
                    } else if (i24 >= i4) {
                        break;
                    } else {
                        i23 = i24;
                    }
                }
                i7 = i4;
            } else {
                i7 = i4;
            }
            if (i22 == i7 && i8 + 1 == ((H0.h) arrayList.get(i5)).a()) {
                eVar.w(((Number) arrayList2.get(i5)).intValue());
                j3 = j8;
                eVar2 = eVar4;
                j4 = j7;
            } else {
                eVar.w(((int) ((eVar4.f412b / j7) + j8)) * (-1));
                j3 = j8;
                eVar2 = eVar4;
                j4 = j7;
                f(j8, eVar4, i8 + 1, arrayList, i5, i7, arrayList2);
            }
            i5 = i7;
            eVar4 = eVar2;
            j7 = j4;
            j8 = j3;
        }
        eVar.t(eVar4);
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final String q(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static u0.j r(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listK = C0091q.f1234a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException(AbstractC0150d.h(cipherSuite, "cipherSuite == "));
        }
        u0.g gVarC = u0.g.f2433b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        y yVarO = f.o(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        List listK2 = peerCertificates != null ? v0.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK = v0.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new u0.j(yVarO, gVarC, listK, new I(1, listK2));
    }

    public static r s(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return r.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return r.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return r.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return r.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return r.SPDY_3;
        }
        if (str.equals("quic")) {
            return r.QUIC;
        }
        throw new IOException(AbstractC0150d.h(str, "Unexpected protocol: "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.f2952c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList t(Context context, int i2) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        C0263h c0263h;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0264i c0264i = new C0264i(resources, theme);
        synchronized (AbstractC0266k.f2957c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0266k.f2956b.get(c0264i);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c0263h = (C0263h) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (c0263h.f2951b.equals(resources.getConfiguration())) {
                        if (theme != null || c0263h.f2952c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = c0263h.f2950a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC0266k.f2955a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = AbstractC0258c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (AbstractC0266k.f2957c) {
            try {
                WeakHashMap weakHashMap = AbstractC0266k.f2956b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c0264i);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c0264i, sparseArray2);
                }
                sparseArray2.append(i2, new C0263h(colorStateListA, c0264i.f2953a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListA;
    }

    public static float u(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return K.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable v(Context context, int i2) {
        return N0.b().c(context, i2);
    }

    public static boolean x() {
        return e.f207d;
    }

    public static List y(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC0150d.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public abstract void A(v vVar);

    public abstract void D(p.f fVar, p.f fVar2);

    public abstract void E(p.f fVar, Thread thread);

    public abstract void F(boolean z2);

    public abstract void G(boolean z2);

    public abstract boolean g(p.g gVar, p.c cVar);

    public abstract boolean h(p.g gVar, Object obj, Object obj2);

    public abstract boolean i(p.g gVar, p.f fVar, p.f fVar2);

    public abstract Typeface k(Context context, C0260e c0260e, Resources resources, int i2);

    public abstract Typeface l(Context context, E.l[] lVarArr, int i2);

    public Typeface m(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface n(Context context, InputStream inputStream) {
        File fileS = f.s(context);
        if (fileS == null) {
            return null;
        }
        try {
            if (f.m(fileS, inputStream)) {
                return Typeface.createFromFile(fileS.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileS.delete();
        }
    }

    public Typeface o(Context context, Resources resources, int i2, String str, int i3) {
        File fileS = f.s(context);
        if (fileS == null) {
            return null;
        }
        try {
            if (f.l(fileS, resources, i2)) {
                return Typeface.createFromFile(fileS.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileS.delete();
        }
    }

    public E.l p(E.l[] lVarArr, int i2) {
        new A.m(0);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        E.l lVar = null;
        int i4 = Integer.MAX_VALUE;
        for (E.l lVar2 : lVarArr) {
            int iAbs = (Math.abs(lVar2.f298c - i3) * 2) + (lVar2.f299d == z2 ? 0 : 1);
            if (lVar == null || i4 > iAbs) {
                lVar = lVar2;
                i4 = iAbs;
            }
        }
        return lVar;
    }

    public abstract InputFilter[] w(InputFilter[] inputFilterArr);

    public abstract void z(Throwable th);

    @Override // H.T
    public void b() {
    }

    @Override // H.T
    public void c() {
    }
}
