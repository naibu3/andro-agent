package androidx.appcompat.view.menu;

import C0.d;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.AbstractC0101a;
import j.AbstractC0141c;
import j.C0140b;
import j.InterfaceC0133A;
import j.m;
import j.n;
import j.p;
import k.C0171d0;
import k.InterfaceC0186l;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0171d0 implements InterfaceC0133A, View.OnClickListener, InterfaceC0186l {
    public p h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f796i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f797j;

    /* renamed from: k, reason: collision with root package name */
    public m f798k;

    /* renamed from: l, reason: collision with root package name */
    public C0140b f799l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0141c f800m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f801n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f802o;

    /* renamed from: p, reason: collision with root package name */
    public final int f803p;

    /* renamed from: q, reason: collision with root package name */
    public int f804q;

    /* renamed from: r, reason: collision with root package name */
    public final int f805r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f801n = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0101a.f1264c, 0, 0);
        this.f803p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f805r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f804q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0186l
    public final boolean a() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // k.InterfaceC0186l
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // j.InterfaceC0133A
    public final void c(p pVar) {
        this.h = pVar;
        setIcon(pVar.getIcon());
        setTitle(pVar.getTitleCondensed());
        setId(pVar.f1687a);
        setVisibility(pVar.isVisible() ? 0 : 8);
        setEnabled(pVar.isEnabled());
        if (pVar.hasSubMenu() && this.f799l == null) {
            this.f799l = new C0140b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.InterfaceC0133A
    public p getItemData() {
        return this.h;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f796i);
        if (this.f797j != null && ((this.h.y & 4) != 4 || (!this.f801n && !this.f802o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f796i : null);
        CharSequence charSequence = this.h.f1702q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f1691e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f1703r;
        if (TextUtils.isEmpty(charSequence2)) {
            d.H(this, z4 ? null : this.h.f1691e);
        } else {
            d.H(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m mVar = this.f798k;
        if (mVar != null) {
            mVar.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f801n = h();
        i();
    }

    @Override // k.C0171d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i4 = this.f804q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f803p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f797j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f797j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0140b c0140b;
        if (this.h.hasSubMenu() && (c0140b = this.f799l) != null && c0140b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f802o != z2) {
            this.f802o = z2;
            p pVar = this.h;
            if (pVar != null) {
                n nVar = pVar.f1699n;
                nVar.f1667k = true;
                nVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f797j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f805r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(m mVar) {
        this.f798k = mVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f804q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0141c abstractC0141c) {
        this.f800m = abstractC0141c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f796i = charSequence;
        i();
    }
}
