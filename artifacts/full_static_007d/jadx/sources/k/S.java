package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import f.AbstractC0101a;
import i.C0122d;
import j.ViewTreeObserverOnGlobalLayoutListenerC0142d;

/* loaded from: classes.dex */
public final class S extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1829i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0194p f1830a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1831b;

    /* renamed from: c, reason: collision with root package name */
    public final C0162J f1832c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f1833d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1834e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f1835f;

    /* renamed from: g, reason: collision with root package name */
    public int f1836g;
    public final Rect h;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public S(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, org.conscrypt.R.attr.spinnerStyle);
        this.h = new Rect();
        S0.a(this, getContext());
        int[] iArr = AbstractC0101a.f1281u;
        D0.h hVarP = D0.h.p(context, attributeSet, iArr, org.conscrypt.R.attr.spinnerStyle);
        this.f1830a = new C0194p(this);
        TypedArray typedArray = (TypedArray) hVarP.f259c;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f1831b = new C0122d(context, resourceId);
        } else {
            this.f1831b = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1829i, org.conscrypt.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    if (i2 != 0) {
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                    }
                    hVarP.r();
                    this.f1834e = true;
                    spinnerAdapter = this.f1833d;
                    if (spinnerAdapter != null) {
                    }
                    this.f1830a.d(attributeSet, org.conscrypt.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            L l2 = new L(this);
            this.f1835f = l2;
            l2.f1801c = typedArray.getString(2);
        } else if (i2 == 1) {
            O o2 = new O(this, this.f1831b, attributeSet);
            D0.h hVarP2 = D0.h.p(this.f1831b, attributeSet, iArr, org.conscrypt.R.attr.spinnerStyle);
            this.f1836g = ((TypedArray) hVarP2.f259c).getLayoutDimension(3, -2);
            o2.k(hVarP2.j(1));
            o2.f1816B = typedArray.getString(2);
            hVarP2.r();
            this.f1835f = o2;
            this.f1832c = new C0162J(this, this, o2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(org.conscrypt.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        hVarP.r();
        this.f1834e = true;
        spinnerAdapter = this.f1833d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1833d = null;
        }
        this.f1830a.d(attributeSet, org.conscrypt.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0194p c0194p = this.f1830a;
        if (c0194p != null) {
            c0194p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        Q q2 = this.f1835f;
        return q2 != null ? q2.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        Q q2 = this.f1835f;
        return q2 != null ? q2.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1835f != null ? this.f1836g : super.getDropDownWidth();
    }

    public final Q getInternalPopup() {
        return this.f1835f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        Q q2 = this.f1835f;
        return q2 != null ? q2.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1831b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        Q q2 = this.f1835f;
        return q2 != null ? q2.a() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0194p c0194p = this.f1830a;
        if (c0194p != null) {
            return c0194p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0194p c0194p = this.f1830a;
        if (c0194p != null) {
            return c0194p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q q2 = this.f1835f;
        if (q2 == null || !q2.b()) {
            return;
        }
        q2.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1835f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        P p2 = (P) parcelable;
        super.onRestoreInstanceState(p2.getSuperState());
        if (!p2.f1821a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0142d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        P p2 = new P(super.onSaveInstanceState());
        Q q2 = this.f1835f;
        p2.f1821a = q2 != null && q2.b();
        return p2;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0162J c0162j = this.f1832c;
        if (c0162j == null || !c0162j.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        Q q2 = this.f1835f;
        if (q2 == null) {
            return super.performClick();
        }
        if (q2.b()) {
            return true;
        }
        this.f1835f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0194p c0194p = this.f1830a;
        if (c0194p != null) {
            c0194p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0194p c0194p = this.f1830a;
        if (c0194p != null) {
            c0194p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        Q q2 = this.f1835f;
        if (q2 == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            q2.p(i2);
            q2.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        Q q2 = this.f1835f;
        if (q2 != null) {
            q2.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f1835f != null) {
            this.f1836g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        Q q2 = this.f1835f;
        if (q2 != null) {
            q2.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(C0.d.v(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        Q q2 = this.f1835f;
        if (q2 != null) {
            q2.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0194p c0194p = this.f1830a;
        if (c0194p != null) {
            c0194p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0194p c0194p = this.f1830a;
        if (c0194p != null) {
            c0194p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1834e) {
            this.f1833d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        Q q2 = this.f1835f;
        if (q2 != null) {
            Context context = this.f1831b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            M m2 = new M();
            m2.f1805a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                m2.f1806b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0163K.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            q2.o(m2);
        }
    }
}
