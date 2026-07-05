package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.conscrypt.PSKKeyManager;
import s.C0236c;
import s.C0237d;
import t.C0239b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2671a;

    /* renamed from: b, reason: collision with root package name */
    public int f2672b;

    /* renamed from: c, reason: collision with root package name */
    public int f2673c;

    /* renamed from: d, reason: collision with root package name */
    public int f2674d;

    /* renamed from: e, reason: collision with root package name */
    public int f2675e;

    /* renamed from: f, reason: collision with root package name */
    public int f2676f;

    /* renamed from: g, reason: collision with root package name */
    public int f2677g;
    public final /* synthetic */ ConstraintLayout h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f2671a = constraintLayout2;
    }

    public static boolean a(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public final void b(C0237d c0237d, C0239b c0239b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i2;
        int iMakeMeasureSpec3;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0237d == null) {
            return;
        }
        if (c0237d.f2300f0 == 8) {
            c0239b.f2357e = 0;
            c0239b.f2358f = 0;
            c0239b.f2359g = 0;
            return;
        }
        if (c0237d.f2281S == null) {
            return;
        }
        int i4 = c0239b.f2353a;
        int i5 = c0239b.f2354b;
        int i6 = c0239b.f2355c;
        int i7 = c0239b.f2356d;
        int i8 = this.f2672b + this.f2673c;
        int i9 = this.f2674d;
        View view = c0237d.f2298e0;
        int iA = q.f.a(i4);
        C0236c c0236c = c0237d.f2272J;
        C0236c c0236c2 = c0237d.f2270H;
        if (iA == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (iA == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2676f, i9, -2);
        } else if (iA == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2676f, i9, -2);
            boolean z3 = c0237d.f2318r == 1;
            int i10 = c0239b.f2361j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0237d.i();
                if (c0239b.f2361j == 2 || !z3 || ((z3 && z4) || c0237d.y())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0237d.o(), 1073741824);
                }
            }
        } else if (iA != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i11 = this.f2676f;
            int i12 = c0236c2 != null ? c0236c2.f2261g : 0;
            if (c0236c != null) {
                i12 += c0236c.f2261g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int iA2 = q.f.a(i5);
        if (iA2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (iA2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2677g, i8, -2);
        } else if (iA2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2677g, i8, -2);
            boolean z5 = c0237d.f2319s == 1;
            int i13 = c0239b.f2361j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0237d.o();
                if (c0239b.f2361j == 2 || !z5 || ((z5 && z6) || c0237d.z())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0237d.i(), 1073741824);
                }
            }
        } else if (iA2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i14 = this.f2677g;
            int i15 = c0236c2 != null ? c0237d.f2271I.f2261g : 0;
            if (c0236c != null) {
                i15 += c0237d.f2273K.f2261g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        s.e eVar = (s.e) c0237d.f2281S;
        ConstraintLayout constraintLayout = this.h;
        if (eVar != null && s.g.c(constraintLayout.f961i, PSKKeyManager.MAX_KEY_LENGTH_BYTES) && view.getMeasuredWidth() == c0237d.o() && view.getMeasuredWidth() < eVar.o() && view.getMeasuredHeight() == c0237d.i() && view.getMeasuredHeight() < eVar.i() && view.getBaseline() == c0237d.f2288Z && !c0237d.x() && a(c0237d.f2268F, iMakeMeasureSpec, c0237d.o()) && a(c0237d.f2269G, iMakeMeasureSpec2, c0237d.i())) {
            c0239b.f2357e = c0237d.o();
            c0239b.f2358f = c0237d.i();
            c0239b.f2359g = c0237d.f2288Z;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0237d.f2284V > 0.0f;
        boolean z12 = z8 && c0237d.f2284V > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i16 = c0239b.f2361j;
        if (i16 != 1 && i16 != 2 && z7 && c0237d.f2318r == 0 && z8 && c0237d.f2319s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            iMax = 0;
        } else {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            c0237d.f2268F = iMakeMeasureSpec;
            c0237d.f2269G = iMakeMeasureSpec2;
            c0237d.f2301g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0237d.f2321u;
            int iMax2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0237d.f2322v;
            if (i18 > 0) {
                iMax2 = Math.min(i18, iMax2);
            }
            int i19 = c0237d.f2324x;
            iMax = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = iMakeMeasureSpec;
            int i21 = c0237d.y;
            if (i21 > 0) {
                iMax = Math.min(i21, iMax);
            }
            if (!s.g.c(constraintLayout.f961i, 1)) {
                if (z11 && z9) {
                    iMax2 = (int) ((iMax * c0237d.f2284V) + 0.5f);
                } else if (z12 && z10) {
                    iMax = (int) ((iMax2 / c0237d.f2284V) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z2 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i2 = 1073741824;
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i2 = 1073741824;
                    iMakeMeasureSpec3 = i20;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i2);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                c0237d.f2268F = iMakeMeasureSpec3;
                c0237d.f2269G = iMakeMeasureSpec2;
                z2 = false;
                c0237d.f2301g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0239b.f2355c || iMax != c0239b.f2356d) {
            z2 = true;
        }
        c0239b.f2360i = z2;
        boolean z14 = eVar2.f2638c0 ? true : z13;
        if (z14 && baseline != -1 && c0237d.f2288Z != baseline) {
            c0239b.f2360i = true;
        }
        c0239b.f2357e = measuredWidth;
        c0239b.f2358f = iMax;
        c0239b.h = z14;
        c0239b.f2359g = baseline;
    }
}
