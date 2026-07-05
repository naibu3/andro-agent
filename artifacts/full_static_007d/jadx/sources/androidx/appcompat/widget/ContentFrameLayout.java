package androidx.appcompat.widget;

import H.S;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import g.C;
import g.r;
import j.n;
import k.C0176g;
import k.C0184k;
import k.InterfaceC0185k0;
import k.InterfaceC0187l0;
import k.e1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f895a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f896b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f897c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f898d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f899e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f900f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f901g;
    public InterfaceC0185k0 h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f901g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f899e == null) {
            this.f899e = new TypedValue();
        }
        return this.f899e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f900f == null) {
            this.f900f = new TypedValue();
        }
        return this.f900f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f897c == null) {
            this.f897c = new TypedValue();
        }
        return this.f897c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f898d == null) {
            this.f898d = new TypedValue();
        }
        return this.f898d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f895a == null) {
            this.f895a = new TypedValue();
        }
        return this.f895a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f896b == null) {
            this.f896b = new TypedValue();
        }
        return this.f896b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0185k0 interfaceC0185k0 = this.h;
        if (interfaceC0185k0 != null) {
            interfaceC0185k0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0184k c0184k;
        super.onDetachedFromWindow();
        InterfaceC0185k0 interfaceC0185k0 = this.h;
        if (interfaceC0185k0 != null) {
            C c2 = ((r) interfaceC0185k0).f1469b;
            InterfaceC0187l0 interfaceC0187l0 = c2.f1345r;
            if (interfaceC0187l0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0187l0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f860e).f1895a.f925a;
                if (actionMenuView != null && (c0184k = actionMenuView.f885t) != null) {
                    c0184k.e();
                    C0176g c0176g = c0184k.f1969t;
                    if (c0176g != null && c0176g.b()) {
                        c0176g.f1730i.dismiss();
                    }
                }
            }
            if (c2.f1350w != null) {
                c2.f1339l.getDecorView().removeCallbacks(c2.f1351x);
                if (c2.f1350w.isShowing()) {
                    try {
                        c2.f1350w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                c2.f1350w = null;
            }
            S s2 = c2.y;
            if (s2 != null) {
                s2.b();
            }
            n nVar = c2.A(0).h;
            if (nVar != null) {
                nVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int iMakeMeasureSpec2;
        int i4;
        int i5;
        float fraction;
        int i6;
        int i7;
        float fraction2;
        int i8;
        int i9;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        Rect rect = this.f901g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i2;
            z2 = false;
        } else {
            TypedValue typedValue = z4 ? this.f898d : this.f897c;
            if (typedValue != null && (i8 = typedValue.type) != 0) {
                if (i8 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i8 == 6) {
                    int i10 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i10, i10);
                } else {
                    i9 = 0;
                    if (i9 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.left + rect.right), View.MeasureSpec.getSize(i2)), 1073741824);
                        z2 = true;
                    }
                }
                i9 = (int) fraction3;
                if (i9 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i3;
        } else {
            TypedValue typedValue2 = z4 ? this.f899e : this.f900f;
            if (typedValue2 != null && (i6 = typedValue2.type) != 0) {
                if (i6 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i6 == 6) {
                    int i11 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i11, i11);
                } else {
                    i7 = 0;
                    if (i7 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i7 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                    }
                }
                i7 = (int) fraction2;
                if (i7 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z2 || mode != Integer.MIN_VALUE) {
            z3 = false;
        } else {
            TypedValue typedValue3 = z4 ? this.f896b : this.f895a;
            if (typedValue3 != null && (i4 = typedValue3.type) != 0) {
                if (i4 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i4 == 6) {
                    int i12 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i12, i12);
                } else {
                    i5 = 0;
                    if (i5 > 0) {
                        i5 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i5) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    }
                }
                i5 = (int) fraction;
                if (i5 > 0) {
                }
                if (measuredWidth >= i5) {
                }
            }
        }
        if (z3) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC0185k0 interfaceC0185k0) {
        this.h = interfaceC0185k0;
    }
}
