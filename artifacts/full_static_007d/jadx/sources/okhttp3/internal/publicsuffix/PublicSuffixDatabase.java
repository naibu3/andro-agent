package okhttp3.internal.publicsuffix;

import A.e;
import A.m;
import C0.d;
import C0.o;
import H0.c;
import H0.j;
import H0.l;
import H0.v;
import b0.AbstractC0082h;
import b0.C0089o;
import b0.C0091q;
import j0.AbstractC0150d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.conscrypt.BuildConfig;
import p0.b;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f2141e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f2142f = d.y("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f2143g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f2144a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f2145b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2146c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2147d;

    public static List c(String str) {
        List listM = q0.d.M(str, new char[]{'.'});
        if (listM.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!AbstractC0150d.a(listM.get(listM.size() - 1), BuildConfig.FLAVOR)) {
            return listM;
        }
        int size = listM.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(e.b("Requested element count ", size, " is less than zero.").toString());
        }
        C0091q c0091q = C0091q.f1234a;
        if (size == 0) {
            return c0091q;
        }
        if (size >= listM.size()) {
            return AbstractC0082h.L(listM);
        }
        if (size == 1) {
            if (listM.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return d.y(listM.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = listM.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : d.y(arrayList.get(0)) : c0091q;
    }

    public final String a(String str) throws InterruptedException {
        String strB;
        String strB2;
        String strB3;
        List listM;
        int size;
        int size2;
        int i2 = 0;
        String unicode = IDN.toUnicode(str);
        AbstractC0150d.d(unicode, "unicodeDomain");
        List listC = c(unicode);
        if (this.f2144a.get() || !this.f2144a.compareAndSet(false, true)) {
            try {
                this.f2145b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z2 = true;
                    } catch (IOException e2) {
                        o oVar = o.f236a;
                        o.f236a.getClass();
                        o.i("Failed to read public suffix list", 5, e2);
                        if (z2) {
                        }
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f2146c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i3 = 0; i3 < size3; i3++) {
            String str2 = (String) listC.get(i3);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC0150d.d(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            AbstractC0150d.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i3] = bytes;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                strB = null;
                break;
            }
            int i5 = i4 + 1;
            byte[] bArr2 = this.f2146c;
            if (bArr2 == null) {
                AbstractC0150d.i("publicSuffixListBytes");
                throw null;
            }
            strB = m.b(bArr2, bArr, i4);
            if (strB != null) {
                break;
            }
            i4 = i5;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i6 = 0;
            while (i6 < length) {
                int i7 = i6 + 1;
                bArr3[i6] = f2141e;
                byte[] bArr4 = this.f2146c;
                if (bArr4 == null) {
                    AbstractC0150d.i("publicSuffixListBytes");
                    throw null;
                }
                strB2 = m.b(bArr4, bArr3, i6);
                if (strB2 != null) {
                    break;
                }
                i6 = i7;
            }
            strB2 = null;
        } else {
            strB2 = null;
        }
        if (strB2 != null) {
            int i8 = size3 - 1;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + 1;
                byte[] bArr5 = this.f2147d;
                if (bArr5 == null) {
                    AbstractC0150d.i("publicSuffixExceptionListBytes");
                    throw null;
                }
                strB3 = m.b(bArr5, bArr, i9);
                if (strB3 != null) {
                    break;
                }
                i9 = i10;
            }
            strB3 = null;
        } else {
            strB3 = null;
        }
        if (strB3 != null) {
            listM = q0.d.M(AbstractC0150d.h(strB3, "!"), new char[]{'.'});
        } else if (strB == null && strB2 == null) {
            listM = f2142f;
        } else {
            List listM2 = strB == null ? null : q0.d.M(strB, new char[]{'.'});
            List list = C0091q.f1234a;
            if (listM2 == null) {
                listM2 = list;
            }
            List listM3 = strB2 == null ? null : q0.d.M(strB2, new char[]{'.'});
            if (listM3 != null) {
                list = listM3;
            }
            listM = listM2.size() > list.size() ? listM2 : list;
        }
        if (listC.size() == listM.size() && ((String) listM.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listM.size();
        } else {
            size = listC.size();
            size2 = listM.size() + 1;
        }
        int i11 = size - size2;
        p0.d c0089o = new C0089o(0, c(str));
        if (i11 < 0) {
            throw new IllegalArgumentException(e.b("Requested element count ", i11, " is less than zero.").toString());
        }
        if (i11 != 0) {
            c0089o = new b(c0089o, i11);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) BuildConfig.FLAVOR);
        for (Object obj : c0089o) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ".");
            }
            C0.m.a(sb, obj, null);
        }
        sb.append((CharSequence) BuildConfig.FLAVOR);
        String string = sb.toString();
        AbstractC0150d.d(string, "toString(...)");
        return string;
    }

    public final void b() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = l.f427a;
        H0.o oVar = new H0.o(new j(new c(resourceAsStream, new v(), 1)));
        try {
            long jL = oVar.l();
            oVar.q(jL);
            byte[] bArrJ = oVar.f434b.j(jL);
            long jL2 = oVar.l();
            oVar.q(jL2);
            byte[] bArrJ2 = oVar.f434b.j(jL2);
            C0.m.b(oVar, null);
            synchronized (this) {
                this.f2146c = bArrJ;
                this.f2147d = bArrJ2;
            }
            this.f2145b.countDown();
        } finally {
        }
    }
}
