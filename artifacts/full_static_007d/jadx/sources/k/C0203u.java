package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: k.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2029b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0203u f2030c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f2031a;

    public static synchronized C0203u a() {
        try {
            if (f2030c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2030c;
    }

    public static synchronized void c() {
        if (f2030c == null) {
            C0203u c0203u = new C0203u();
            f2030c = c0203u;
            c0203u.f2031a = N0.b();
            N0 n02 = f2030c.f2031a;
            B0.h hVar = new B0.h();
            synchronized (n02) {
                n02.f1815e = hVar;
            }
        }
    }

    public static void d(Drawable drawable, U0 u02, int[] iArr) {
        PorterDuff.Mode mode = N0.f1809f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = u02.f1850b;
        if (!z2 && !u02.f1849a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) u02.f1851c : null;
        PorterDuff.Mode mode2 = u02.f1849a ? (PorterDuff.Mode) u02.f1852d : N0.f1809f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f2031a.c(context, i2);
    }
}
