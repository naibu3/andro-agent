package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import f.AbstractC0101a;
import org.conscrypt.R;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199s extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0201t f2007a;

    /* renamed from: b, reason: collision with root package name */
    public final C0194p f2008b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f2009c;

    /* renamed from: d, reason: collision with root package name */
    public C0209x f2010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199s(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        T0.a(context);
        S0.a(this, getContext());
        Z z2 = new Z(this);
        this.f2009c = z2;
        z2.f(attributeSet, R.attr.checkedTextViewStyle);
        z2.b();
        C0194p c0194p = new C0194p(this);
        this.f2008b = c0194p;
        c0194p.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f2007a = new C0201t(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0101a.f1272l;
        D0.h hVarP = D0.h.p(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) hVarP.f259c;
        H.N.g(this, getContext(), iArr, attributeSet, (TypedArray) hVarP.f259c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(C0.d.v(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(C0.d.v(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(hVarP.i(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0191n0.b(typedArray.getInt(3, -1), null));
            }
            hVarP.r();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            hVarP.r();
            throw th;
        }
    }

    private C0209x getEmojiTextViewHelper() {
        if (this.f2010d == null) {
            this.f2010d = new C0209x(this);
        }
        return this.f2010d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Z z2 = this.f2009c;
        if (z2 != null) {
            z2.b();
        }
        C0194p c0194p = this.f2008b;
        if (c0194p != null) {
            c0194p.a();
        }
        C0201t c0201t = this.f2007a;
        if (c0201t != null) {
            c0201t.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0.f.B(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0194p c0194p = this.f2008b;
        if (c0194p != null) {
            return c0194p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0194p c0194p = this.f2008b;
        if (c0194p != null) {
            return c0194p.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0201t c0201t = this.f2007a;
        if (c0201t != null) {
            return c0201t.f2012a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0201t c0201t = this.f2007a;
        if (c0201t != null) {
            return c0201t.f2013b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2009c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2009c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0.m.m(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0194p c0194p = this.f2008b;
        if (c0194p != null) {
            c0194p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0194p c0194p = this.f2008b;
        if (c0194p != null) {
            c0194p.f(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0201t c0201t = this.f2007a;
        if (c0201t != null) {
            if (c0201t.f2016e) {
                c0201t.f2016e = false;
            } else {
                c0201t.f2016e = true;
                c0201t.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2009c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2009c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0.f.C(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0194p c0194p = this.f2008b;
        if (c0194p != null) {
            c0194p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0194p c0194p = this.f2008b;
        if (c0194p != null) {
            c0194p.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0201t c0201t = this.f2007a;
        if (c0201t != null) {
            c0201t.f2012a = colorStateList;
            c0201t.f2014c = true;
            c0201t.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0201t c0201t = this.f2007a;
        if (c0201t != null) {
            c0201t.f2013b = mode;
            c0201t.f2015d = true;
            c0201t.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2009c;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2009c;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z2 = this.f2009c;
        if (z2 != null) {
            z2.g(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(C0.d.v(getContext(), i2));
    }
}
