package E;

import B0.F;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final n.j f292a = new n.j(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f293b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f294c;

    /* renamed from: d, reason: collision with root package name */
    public static final n.k f295d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f293b = threadPoolExecutor;
        f294c = new Object();
        f295d = new n.k(0);
    }

    public static String a(List list, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < list.size(); i3++) {
            sb.append(((g) list.get(i3)).f282e);
            sb.append("-");
            sb.append(i2);
            if (i3 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r8 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j b(String str, Context context, List list, int i2) {
        int i3;
        Typeface typefaceL;
        C0.f.c("getFontSync");
        n.j jVar = f292a;
        try {
            Typeface typeface = (Typeface) jVar.a(str);
            if (typeface != null) {
                return new j(typeface);
            }
            F fA = f.a(context, list);
            int i4 = fA.f79a;
            List list2 = (List) fA.f80b;
            if (i4 != 0) {
                i3 = i4 != 1 ? -3 : -2;
            } else {
                l[] lVarArr = (l[]) list2.get(0);
                if (lVarArr == null || lVarArr.length == 0) {
                    i3 = 1;
                } else {
                    int length = lVarArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            i3 = 0;
                            break;
                        }
                        int i6 = lVarArr[i5].f300e;
                        if (i6 == 0) {
                            i5++;
                        } else if (i6 >= 0) {
                            i3 = i6;
                        }
                    }
                }
            }
            if (i3 != 0) {
                return new j(i3);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                l[] lVarArr2 = (l[]) list2.get(0);
                C0.d dVar = A.g.f9a;
                C0.f.c("TypefaceCompat.createFromFontInfo");
                typefaceL = A.g.f9a.l(context, lVarArr2, i2);
                Trace.endSection();
            } else {
                C0.d dVar2 = A.g.f9a;
                C0.f.c("TypefaceCompat.createFromFontInfoWithFallback");
                typefaceL = A.g.f9a.m(context, list2, i2);
                Trace.endSection();
            }
            if (typefaceL == null) {
                return new j(-3);
            }
            jVar.b(str, typefaceL);
            return new j(typefaceL);
        } catch (PackageManager.NameNotFoundException unused) {
            return new j(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }
}
