package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import f.AbstractC0101a;
import org.conscrypt.R;

/* renamed from: k.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161I extends C0156D {

    /* renamed from: e, reason: collision with root package name */
    public final C0160H f1788e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1789f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1790g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1791i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1792j;

    public C0161I(C0160H c0160h) {
        super(c0160h);
        this.f1790g = null;
        this.h = null;
        this.f1791i = false;
        this.f1792j = false;
        this.f1788e = c0160h;
    }

    @Override // k.C0156D
    public final void b(AttributeSet attributeSet, int i2) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0160H c0160h = this.f1788e;
        Context context = c0160h.getContext();
        int[] iArr = AbstractC0101a.f1268g;
        D0.h hVarP = D0.h.p(context, attributeSet, iArr, R.attr.seekBarStyle);
        H.N.g(c0160h, c0160h.getContext(), iArr, attributeSet, (TypedArray) hVarP.f259c, R.attr.seekBarStyle);
        Drawable drawableK = hVarP.k(0);
        if (drawableK != null) {
            c0160h.setThumb(drawableK);
        }
        Drawable drawableJ = hVarP.j(1);
        Drawable drawable = this.f1789f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1789f = drawableJ;
        if (drawableJ != null) {
            drawableJ.setCallback(c0160h);
            drawableJ.setLayoutDirection(c0160h.getLayoutDirection());
            if (drawableJ.isStateful()) {
                drawableJ.setState(c0160h.getDrawableState());
            }
            f();
        }
        c0160h.invalidate();
        TypedArray typedArray = (TypedArray) hVarP.f259c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0191n0.b(typedArray.getInt(3, -1), this.h);
            this.f1792j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f1790g = hVarP.i(2);
            this.f1791i = true;
        }
        hVarP.r();
        f();
    }

    public final void f() {
        Drawable drawable = this.f1789f;
        if (drawable != null) {
            if (this.f1791i || this.f1792j) {
                Drawable drawableMutate = drawable.mutate();
                this.f1789f = drawableMutate;
                if (this.f1791i) {
                    drawableMutate.setTintList(this.f1790g);
                }
                if (this.f1792j) {
                    this.f1789f.setTintMode(this.h);
                }
                if (this.f1789f.isStateful()) {
                    this.f1789f.setState(this.f1788e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f1789f != null) {
            int max = this.f1788e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1789f.getIntrinsicWidth();
                int intrinsicHeight = this.f1789f.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1789f.setBounds(-i2, -i3, i2, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1789f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
