package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import f.AbstractC0101a;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201t {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f2012a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f2013b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2014c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2015d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2016e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f2017f;

    public /* synthetic */ C0201t(TextView textView) {
        this.f2017f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f2017f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f2014c || this.f2015d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f2014c) {
                    drawableMutate.setTintList(this.f2012a);
                }
                if (this.f2015d) {
                    drawableMutate.setTintMode(this.f2013b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        C0199s c0199s = (C0199s) this.f2017f;
        Drawable checkMarkDrawable = c0199s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2014c || this.f2015d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f2014c) {
                    drawableMutate.setTintList(this.f2012a);
                }
                if (this.f2015d) {
                    drawableMutate.setTintMode(this.f2013b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0199s.getDrawableState());
                }
                c0199s.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i2) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f2017f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0101a.f1273m;
        D0.h hVarP = D0.h.p(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) hVarP.f259c;
        H.N.g(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) hVarP.f259c, i2);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(C0.d.v(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(C0.d.v(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(hVarP.i(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC0191n0.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            hVarP.r();
        }
    }
}
