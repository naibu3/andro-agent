package v0;

import B0.C0002c;
import C0.d;
import C0.f;
import H0.e;
import H0.h;
import H0.m;
import H0.o;
import H0.t;
import b0.C0079e;
import b0.C0091q;
import j0.AbstractC0150d;
import j0.g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k.C0213z;
import u0.k;
import u0.q;
import u0.u;
import u0.v;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2808a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f2809b = f.w(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final v f2810c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0213z f2811d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f2812e;

    /* renamed from: f, reason: collision with root package name */
    public static final TimeZone f2813f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f2814g;
    public static final String h;

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0188, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], java.io.Serializable] */
    static {
        int i2;
        ?? r2 = new byte[0];
        f2808a = r2;
        e eVar = new e();
        eVar.s(r2, 0);
        long j2 = 0;
        f2810c = new v(j2, eVar);
        b(j2, j2, j2);
        f2811d = new C0213z(null, 0, r2, 1);
        h hVar = h.f413d;
        h[] hVarArr = {A.m.d("efbbbf"), A.m.d("feff"), A.m.d("fffe"), A.m.d("0000ffff"), A.m.d("ffff0000")};
        ArrayList arrayList = new ArrayList(new C0079e(hVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i3 = 0; i3 < 5; i3++) {
            h hVar2 = hVarArr[i3];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Integer[] numArr = (Integer[]) array;
        Object[] objArrCopyOf = Arrays.copyOf(numArr, numArr.length);
        AbstractC0150d.e(objArrCopyOf, "elements");
        ArrayList arrayList3 = objArrCopyOf.length == 0 ? new ArrayList() : new ArrayList(new C0079e(objArrCopyOf, true));
        int i4 = 0;
        int i5 = 0;
        while (i4 < 5) {
            h hVar3 = hVarArr[i4];
            int i6 = i5 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(A.e.b("fromIndex (0) is greater than toIndex (", size, ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i7 = size - 1;
            int i8 = 0;
            while (true) {
                if (i8 > i7) {
                    i2 = -(i8 + 1);
                    break;
                }
                i2 = (i8 + i7) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i2);
                int iCompareTo = comparable == hVar3 ? 0 : comparable == null ? -1 : hVar3 == null ? 1 : comparable.compareTo(hVar3);
                if (iCompareTo < 0) {
                    i8 = i2 + 1;
                } else if (iCompareTo > 0) {
                    i7 = i2 - 1;
                }
            }
            arrayList3.set(i2, Integer.valueOf(i5));
            i4++;
            i5 = i6;
        }
        if (((h) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i9 = 0;
        while (i9 < arrayList.size()) {
            h hVar4 = (h) arrayList.get(i9);
            int i10 = i9 + 1;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                h hVar5 = (h) arrayList.get(i11);
                hVar5.getClass();
                AbstractC0150d.e(hVar4, "prefix");
                if (!hVar5.f(hVar4, hVar4.a())) {
                    break;
                }
                if (hVar5.a() == hVar4.a()) {
                    throw new IllegalArgumentException(AbstractC0150d.h(hVar5, "duplicate option: ").toString());
                }
                if (((Number) arrayList3.get(i11)).intValue() > ((Number) arrayList3.get(i9)).intValue()) {
                    arrayList.remove(i11);
                    arrayList3.remove(i11);
                } else {
                    i11++;
                }
            }
            i9 = i10;
        }
        e eVar2 = new e();
        d.f(0L, eVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (eVar2.f412b / 4)];
        int i12 = 0;
        while (!eVar2.f()) {
            iArr[i12] = eVar2.l();
            i12++;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(hVarArr, 5);
        AbstractC0150d.d(objArrCopyOf2, "java.util.Arrays.copyOf(this, size)");
        f2812e = new m((h[]) objArrCopyOf2, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC0150d.b(timeZone);
        f2813f = timeZone;
        f2814g = new g(1);
        String strL = q0.d.L(q.class.getName(), "okhttp3.");
        if (strL.endsWith("Client")) {
            strL = strL.substring(0, strL.length() - 6);
            AbstractC0150d.d(strL, "substring(...)");
        }
        h = strL;
    }

    public static final boolean a(u0.m mVar, u0.m mVar2) {
        AbstractC0150d.e(mVar, "<this>");
        AbstractC0150d.e(mVar2, "other");
        return AbstractC0150d.a(mVar.f2486d, mVar2.f2486d) && mVar.f2487e == mVar2.f2487e && AbstractC0150d.a(mVar.f2483a, mVar2.f2483a);
    }

    public static final void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void c(Closeable closeable) throws IOException {
        AbstractC0150d.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) throws IOException {
        AbstractC0150d.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!AbstractC0150d.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c2, int i2, int i3) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final int f(String str, String str2, int i2, int i3) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (q0.d.C(str2, str.charAt(i2))) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final boolean g(t tVar, TimeUnit timeUnit) {
        AbstractC0150d.e(timeUnit, "timeUnit");
        try {
            return t(tVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        AbstractC0150d.e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC0150d.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                i2++;
                int i3 = 0;
                while (true) {
                    if (i3 < strArr2.length) {
                        int i4 = i3 + 1;
                        try {
                            if (comparator.compare(str, strArr2[i3]) == 0) {
                                return true;
                            }
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw new NoSuchElementException(e2.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(u uVar) {
        String strA = uVar.f2571f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        List listAsList;
        AbstractC0150d.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        AbstractC0150d.e(objArrCopyOf, "elements");
        if (objArrCopyOf.length > 0) {
            listAsList = Arrays.asList(objArrCopyOf);
            AbstractC0150d.d(listAsList, "asList(...)");
        } else {
            listAsList = C0091q.f1234a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        AbstractC0150d.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (AbstractC0150d.f(cCharAt, 31) <= 0 || AbstractC0150d.f(cCharAt, 127) >= 0) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int m(String str, int i2, int i3) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final int n(String str, int i2, int i3) {
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                int i5 = i4 - 1;
                char cCharAt = str.charAt(i4);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4 = i5;
            }
        }
        return i2;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC0150d.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            int length2 = strArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    String str2 = strArr2[i3];
                    i3++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean p(String str) {
        AbstractC0150d.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset r(H0.g gVar, Charset charset) {
        Charset charsetForName;
        AbstractC0150d.e(gVar, "<this>");
        AbstractC0150d.e(charset, "default");
        int iG = gVar.g(f2812e);
        if (iG == -1) {
            return charset;
        }
        if (iG == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            AbstractC0150d.d(charset2, "UTF_8");
            return charset2;
        }
        if (iG == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            AbstractC0150d.d(charset3, "UTF_16BE");
            return charset3;
        }
        if (iG == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            AbstractC0150d.d(charset4, "UTF_16LE");
            return charset4;
        }
        if (iG == 3) {
            Charset charset5 = q0.a.f2219a;
            charsetForName = q0.a.f2221c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                AbstractC0150d.d(charsetForName, "forName(...)");
                q0.a.f2221c = charsetForName;
            }
        } else {
            if (iG != 4) {
                throw new AssertionError();
            }
            Charset charset6 = q0.a.f2219a;
            charsetForName = q0.a.f2220b;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                AbstractC0150d.d(charsetForName, "forName(...)");
                q0.a.f2220b = charsetForName;
            }
        }
        return charsetForName;
    }

    public static final int s(o oVar) {
        AbstractC0150d.e(oVar, "<this>");
        return (oVar.i() & 255) | ((oVar.i() & 255) << 16) | ((oVar.i() & 255) << 8);
    }

    public static final boolean t(t tVar, int i2, TimeUnit timeUnit) {
        AbstractC0150d.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = tVar.a().e() ? tVar.a().c() - jNanoTime : Long.MAX_VALUE;
        tVar.a().d(Math.min(jC, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            e eVar = new e();
            while (tVar.b(8192L, eVar) != -1) {
                eVar.o(eVar.f412b);
            }
            if (jC == Long.MAX_VALUE) {
                tVar.a().a();
            } else {
                tVar.a().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                tVar.a().a();
            } else {
                tVar.a().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                tVar.a().a();
            } else {
                tVar.a().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final k u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0002c c0002c = (C0002c) it.next();
            String strH = c0002c.f94a.h();
            String strH2 = c0002c.f95b.h();
            arrayList.add(strH);
            arrayList.add(q0.d.P(strH2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new k((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final String v(u0.m mVar, boolean z2) {
        AbstractC0150d.e(mVar, "<this>");
        String str = mVar.f2486d;
        if (q0.d.D(str, ":")) {
            str = "[" + str + ']';
        }
        int i2 = mVar.f2487e;
        if (!z2) {
            String str2 = mVar.f2483a;
            AbstractC0150d.e(str2, "scheme");
            if (i2 == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List w(List list) {
        AbstractC0150d.e(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        AbstractC0150d.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int x(String str, int i2) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        if (lValueOf == null) {
            return i2;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String y(String str, int i2, int i3) {
        int iM = m(str, i2, i3);
        String strSubstring = str.substring(iM, n(str, iM, i3));
        AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void z(IOException iOException, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC0150d.e(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d.e(iOException, (Exception) it.next());
        }
    }
}
