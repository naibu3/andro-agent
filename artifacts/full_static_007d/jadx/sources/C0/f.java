package C0;

import H0.w;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import j0.AbstractC0150d;
import j0.C0148b;
import j0.InterfaceC0147a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k.C0171d0;
import org.conscrypt.BuildConfig;
import org.conscrypt.ct.CTConstants;
import u0.y;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static long f209a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f210b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f211c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f212d;

    /* renamed from: e, reason: collision with root package name */
    public static Class f213e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f214f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f215g;
    public static boolean h;

    /* renamed from: i, reason: collision with root package name */
    public static Field f216i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f217j;

    public static void A(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static ActionMode.Callback B(ActionMode.Callback callback) {
        return (!(callback instanceof K.j) || Build.VERSION.SDK_INT < 26) ? callback : ((K.j) callback).f509a;
    }

    public static ActionMode.Callback C(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof K.j) || callback == null) ? callback : new K.j(callback, textView);
    }

    public static final boolean a(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        AbstractC0150d.e(bArr, "a");
        AbstractC0150d.e(bArr2, "b");
        if (i4 <= 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
            if (i6 >= i4) {
                return true;
            }
            i5 = i6;
        }
    }

    public static H0.d b() throws InterruptedException {
        H0.d dVar = H0.d.f407j;
        AbstractC0150d.b(dVar);
        H0.d dVar2 = dVar.f409f;
        if (dVar2 == null) {
            long jNanoTime = System.nanoTime();
            H0.d.class.wait(H0.d.h);
            H0.d dVar3 = H0.d.f407j;
            AbstractC0150d.b(dVar3);
            if (dVar3.f409f != null || System.nanoTime() - jNanoTime < H0.d.f406i) {
                return null;
            }
            return H0.d.f407j;
        }
        long jNanoTime2 = dVar2.f410g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j2 = jNanoTime2 / 1000000;
            H0.d.class.wait(j2, (int) (jNanoTime2 - (1000000 * j2)));
            return null;
        }
        H0.d dVar4 = H0.d.f407j;
        AbstractC0150d.b(dVar4);
        dVar4.f409f = dVar2.f409f;
        dVar2.f409f = null;
        return dVar2;
    }

    public static void c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void d(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(v0.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str).toString());
            }
            i2 = i3;
        }
    }

    public static final void e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static void f(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new n0.c(2, 36, 1));
        }
    }

    public static void g(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
        if (i2 <= i3) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    public static int h(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                if (iNoteProxyOpNoThrow == 0) {
                    iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, x.d.a(context)) : 1;
                }
            } else {
                iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
            }
            if (iNoteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void i(String str, String str2) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                throw new IllegalArgumentException(AbstractC0150d.h(v0.b.p(str2) ? BuildConfig.FLAVOR : AbstractC0150d.h(str, ": "), v0.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2)).toString());
            }
            i2 = i3;
        }
    }

    public static void k(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean l(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zM = m(file, inputStreamOpenRawResource);
                k(inputStreamOpenRawResource);
                return zM;
            } catch (Throwable th) {
                th = th;
                k(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean m(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            k(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            k(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static final boolean n(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static y o(String str) {
        AbstractC0150d.e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return y.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return y.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return y.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return y.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return y.SSL_3_0;
        }
        throw new IllegalArgumentException(AbstractC0150d.h(str, "Unexpected TLS version: "));
    }

    public static Set p() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final Class q(C0148b c0148b) {
        Class clsA = c0148b.a();
        AbstractC0150d.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class r(o0.a aVar) {
        AbstractC0150d.e(aVar, "<this>");
        Class clsA = ((InterfaceC0147a) aVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    public static File s(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static F.c t(C0171d0 c0171d0) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new F.c(B.a.d(c0171d0));
        }
        TextPaint textPaint = new TextPaint(c0171d0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0171d0.getBreakStrategy();
        int hyphenationFrequency = c0171d0.getHyphenationFrequency();
        if (c0171d0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c0171d0.getInputType() & 15) != 3) {
                boolean z2 = c0171d0.getLayoutDirection() == 1;
                switch (c0171d0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(B.a.a(DecimalFormatSymbols.getInstance(c0171d0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new F.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean u() {
        if (Build.VERSION.SDK_INT >= 29) {
            return W.a.a();
        }
        try {
            if (f210b == null) {
                f209a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f210b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f210b.invoke(null, Long.valueOf(f209a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static MappedByteBuffer v(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static u0.k w(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            String str = strArr2[i3];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i3] = q0.d.P(str).toString();
            i3 = i4;
        }
        int iK = m.k(0, strArr2.length - 1, 2);
        if (iK >= 0) {
            while (true) {
                int i5 = i2 + 2;
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                d(str2);
                i(str3, str2);
                if (i2 == iK) {
                    break;
                }
                i2 = i5;
            }
        }
        return new u0.k(strArr2);
    }

    public static String x(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        AbstractC0150d.e(x509Certificate, "certificate");
        H0.h hVar = H0.h.f413d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        AbstractC0150d.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i2 = 0;
        e(encoded.length, 0, length);
        m.c(length, encoded.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, length);
        AbstractC0150d.d(bArrCopyOfRange, "copyOfRange(...)");
        H0.h hVar2 = new H0.h(bArrCopyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrCopyOfRange, 0, hVar2.a());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC0150d.d(bArrDigest, "digestBytes");
        new H0.h(bArrDigest);
        byte[] bArr = w.f452a;
        AbstractC0150d.e(bArr, "map");
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b2 = bArrDigest[i2];
            int i4 = i2 + 2;
            byte b3 = bArrDigest[i2 + 1];
            i2 += 3;
            byte b4 = bArrDigest[i4];
            bArr2[i3] = bArr[(b2 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr2[i5] = bArr[b4 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b5 = bArrDigest[i2];
            bArr2[i3] = bArr[(b5 & 255) >> 2];
            bArr2[1 + i3] = bArr[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr2[2 + i3] = b6;
            bArr2[i3 + 3] = b6;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b7 = bArrDigest[i2];
            byte b8 = bArrDigest[i6];
            bArr2[i3] = bArr[(b7 & 255) >> 2];
            bArr2[1 + i3] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr2[i3 + 2] = bArr[(b8 & 15) << 2];
            bArr2[i3 + 3] = (byte) 61;
        }
        return AbstractC0150d.h(new String(bArr2, q0.a.f2219a), "sha256/");
    }

    public static void y(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            B.a.e(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void z(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public abstract List j(String str, List list);
}
