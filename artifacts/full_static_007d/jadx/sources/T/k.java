package T;

import A.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final p.h f655a = new p.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f656b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static m f657c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static m b() {
        m mVar = new m(14);
        f657c = mVar;
        p.h hVar = f655a;
        hVar.getClass();
        if (p.g.f2163f.h(hVar, null, mVar)) {
            p.g.b(hVar);
        }
        return f657c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z2) {
        int i2;
        boolean z3;
        int i3;
        long length;
        long length2;
        File file;
        j jVarA;
        j jVar;
        int i4;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z2 || f657c == null) {
            synchronized (f656b) {
                if (z2) {
                    i2 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length2 = file3.length();
                            if (file3.exists()) {
                                long jA = a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (jVarA == null) {
                                    if (z3) {
                                    }
                                }
                                if (z2) {
                                    i2 = 2;
                                }
                                jVar = new j(1, (jVarA == null && jVarA.f652b == 2 && i2 == 1 && length < jVarA.f654d) ? 3 : i2, jA, length2);
                                if (jVarA != null) {
                                    jVar.b(file);
                                }
                                b();
                                return;
                            }
                        }
                    }
                    b();
                    return;
                }
                if (f657c != null) {
                    return;
                }
                i2 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z3 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z3 = false;
                }
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    length = file22.length();
                    boolean z4 = !file22.exists() && length > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length2 = file32.length();
                    boolean z5 = !file32.exists() && length2 > 0;
                    try {
                        long jA2 = a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            jVarA = null;
                        } else {
                            try {
                                jVarA = j.a(file);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        }
                        if (jVarA == null && jVarA.f653c == jA2 && (i4 = jVarA.f652b) != 2) {
                            i2 = i4;
                        } else if (z3) {
                            i2 = 327680;
                        } else if (z4) {
                            i2 = 1;
                        } else if (z5) {
                            i2 = 2;
                        }
                        if (z2 && z5 && i2 != 1) {
                            i2 = 2;
                        }
                        jVar = new j(1, (jVarA == null && jVarA.f652b == 2 && i2 == 1 && length < jVarA.f654d) ? 3 : i2, jA2, length2);
                        if (jVarA != null || !jVarA.equals(jVar)) {
                            try {
                                jVar.b(file);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                b();
                return;
            }
        }
    }
}
