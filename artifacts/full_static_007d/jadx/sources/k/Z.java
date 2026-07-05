package k;

import H.AbstractC0029x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import f.AbstractC0101a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1859a;

    /* renamed from: b, reason: collision with root package name */
    public U0 f1860b;

    /* renamed from: c, reason: collision with root package name */
    public U0 f1861c;

    /* renamed from: d, reason: collision with root package name */
    public U0 f1862d;

    /* renamed from: e, reason: collision with root package name */
    public U0 f1863e;

    /* renamed from: f, reason: collision with root package name */
    public U0 f1864f;

    /* renamed from: g, reason: collision with root package name */
    public U0 f1865g;
    public U0 h;

    /* renamed from: i, reason: collision with root package name */
    public final C0181i0 f1866i;

    /* renamed from: j, reason: collision with root package name */
    public int f1867j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f1868k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f1869l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1870m;

    public Z(TextView textView) {
        this.f1859a = textView;
        this.f1866i = new C0181i0(textView);
    }

    public static U0 c(Context context, C0203u c0203u, int i2) {
        ColorStateList colorStateListF;
        synchronized (c0203u) {
            colorStateListF = c0203u.f2031a.f(context, i2);
        }
        if (colorStateListF == null) {
            return null;
        }
        U0 u02 = new U0();
        u02.f1850b = true;
        u02.f1851c = colorStateListF;
        return u02;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            J.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            J.b.a(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = text.length();
        if (i5 < 0 || i3 > length) {
            J.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            J.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            J.c.a(editorInfo, text, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (i9 * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        J.c.a(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    public final void a(Drawable drawable, U0 u02) {
        if (drawable == null || u02 == null) {
            return;
        }
        C0203u.d(drawable, u02, this.f1859a.getDrawableState());
    }

    public final void b() {
        U0 u02 = this.f1860b;
        TextView textView = this.f1859a;
        if (u02 != null || this.f1861c != null || this.f1862d != null || this.f1863e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f1860b);
            a(compoundDrawables[1], this.f1861c);
            a(compoundDrawables[2], this.f1862d);
            a(compoundDrawables[3], this.f1863e);
        }
        if (this.f1864f == null && this.f1865g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1864f);
        a(compoundDrawablesRelative[2], this.f1865g);
    }

    public final ColorStateList d() {
        U0 u02 = this.h;
        if (u02 != null) {
            return (ColorStateList) u02.f1851c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        U0 u02 = this.h;
        if (u02 != null) {
            return (PorterDuff.Mode) u02.f1852d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String string;
        String string2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        int i7;
        TextView textView = this.f1859a;
        Context context = textView.getContext();
        C0203u c0203uA = C0203u.a();
        int[] iArr = AbstractC0101a.h;
        D0.h hVarP = D0.h.p(context, attributeSet, iArr, i2);
        H.N.g(textView, textView.getContext(), iArr, attributeSet, (TypedArray) hVarP.f259c, i2);
        TypedArray typedArray = (TypedArray) hVarP.f259c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1860b = c(context, c0203uA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1861c = c(context, c0203uA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f1862d = c(context, c0203uA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f1863e = c(context, c0203uA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f1864f = c(context, c0203uA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1865g = c(context, c0203uA, typedArray.getResourceId(6, 0));
        }
        hVarP.r();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0101a.f1282v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            D0.h hVar = new D0.h(context, typedArrayObtainStyledAttributes);
            if (z5 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, hVar);
            int i8 = Build.VERSION.SDK_INT;
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i7 = 26;
            } else {
                i7 = 26;
                string2 = null;
            }
            string = (i8 < i7 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            hVar.r();
        } else {
            z2 = false;
            z3 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        D0.h hVar2 = new D0.h(context, typedArrayObtainStyledAttributes2);
        if (z5 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z4 = z2;
        } else {
            z4 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i9 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i9 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, hVar2);
        hVar2.r();
        if (!z5 && z3) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f1869l;
        if (typeface != null) {
            if (this.f1868k == -1) {
                textView.setTypeface(typeface, this.f1867j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            X.d(textView, string);
        }
        if (string2 != null) {
            W.b(textView, W.a(string2));
        }
        int[] iArr3 = AbstractC0101a.f1269i;
        C0181i0 c0181i0 = this.f1866i;
        Context context2 = c0181i0.f1937j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = c0181i0.f1936i;
        H.N.g(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i2);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0181i0.f1929a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr4[i10] = typedArrayObtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                c0181i0.f1934f = C0181i0.b(iArr4);
                c0181i0.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0181i0.j()) {
            c0181i0.f1929a = 0;
        } else if (c0181i0.f1929a == 1) {
            if (!c0181i0.f1935g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0181i0.k(dimension2, dimension3, dimension);
            }
            c0181i0.h();
        }
        if (m1.f1981c && c0181i0.f1929a != 0) {
            int[] iArr5 = c0181i0.f1934f;
            if (iArr5.length > 0) {
                if (X.a(textView) != -1.0f) {
                    X.b(textView, Math.round(c0181i0.f1932d), Math.round(c0181i0.f1933e), Math.round(c0181i0.f1931c), 0);
                } else {
                    X.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? c0203uA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c0203uA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c0203uA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c0203uA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c0203uA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c0203uA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = C0.d.t(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            textView.setCompoundDrawableTintMode(AbstractC0191n0.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i3);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i3);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i4 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i5 = -1;
            } else {
                int i11 = typedValuePeekValue.data;
                int i12 = i11 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i11);
                i5 = i12;
                i4 = -1;
            }
        } else {
            i4 = -1;
            i5 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i4) {
            C0.f.y(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i4) {
            C0.f.z(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i5 == i4) {
                C0.f.A(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0029x.i(textView, i5, dimensionPixelSize);
            } else {
                C0.f.A(textView, Math.round(TypedValue.applyDimension(i5, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0101a.f1282v);
        D0.h hVar = new D0.h(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1859a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, hVar);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            X.d(textView, string);
        }
        hVar.r();
        Typeface typeface = this.f1869l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1867j);
        }
    }

    public final void i(int i2, int i3, int i4, int i5) {
        C0181i0 c0181i0 = this.f1866i;
        if (c0181i0.j()) {
            DisplayMetrics displayMetrics = c0181i0.f1937j.getResources().getDisplayMetrics();
            c0181i0.k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0181i0.h()) {
                c0181i0.a();
            }
        }
    }

    public final void j(int[] iArr, int i2) {
        C0181i0 c0181i0 = this.f1866i;
        if (c0181i0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0181i0.f1937j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0181i0.f1934f = C0181i0.b(iArrCopyOf);
                if (!c0181i0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0181i0.f1935g = false;
            }
            if (c0181i0.h()) {
                c0181i0.a();
            }
        }
    }

    public final void k(int i2) {
        C0181i0 c0181i0 = this.f1866i;
        if (c0181i0.j()) {
            if (i2 == 0) {
                c0181i0.f1929a = 0;
                c0181i0.f1932d = -1.0f;
                c0181i0.f1933e = -1.0f;
                c0181i0.f1931c = -1.0f;
                c0181i0.f1934f = new int[0];
                c0181i0.f1930b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(A.e.a("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = c0181i0.f1937j.getResources().getDisplayMetrics();
            c0181i0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0181i0.h()) {
                c0181i0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new U0();
        }
        U0 u02 = this.h;
        u02.f1851c = colorStateList;
        u02.f1850b = colorStateList != null;
        this.f1860b = u02;
        this.f1861c = u02;
        this.f1862d = u02;
        this.f1863e = u02;
        this.f1864f = u02;
        this.f1865g = u02;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new U0();
        }
        U0 u02 = this.h;
        u02.f1852d = mode;
        u02.f1849a = mode != null;
        this.f1860b = u02;
        this.f1861c = u02;
        this.f1862d = u02;
        this.f1863e = u02;
        this.f1864f = u02;
        this.f1865g = u02;
    }

    public final void n(Context context, D0.h hVar) {
        String string;
        int i2 = this.f1867j;
        TypedArray typedArray = (TypedArray) hVar.f259c;
        this.f1867j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f1868k = i4;
            if (i4 != -1) {
                this.f1867j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1870m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f1869l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f1869l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f1869l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1869l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f1868k;
        int i8 = this.f1867j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceL = hVar.l(i6, this.f1867j, new U(this, i7, i8, new WeakReference(this.f1859a)));
                if (typefaceL != null) {
                    if (i3 < 28 || this.f1868k == -1) {
                        this.f1869l = typefaceL;
                    } else {
                        this.f1869l = Y.a(Typeface.create(typefaceL, 0), this.f1868k, (this.f1867j & 2) != 0);
                    }
                }
                this.f1870m = this.f1869l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1869l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1868k == -1) {
            this.f1869l = Typeface.create(string, this.f1867j);
        } else {
            this.f1869l = Y.a(Typeface.create(string, 0), this.f1868k, (this.f1867j & 2) != 0);
        }
    }
}
