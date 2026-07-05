package z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.conscrypt.R;
import org.xmlpull.v1.XmlPullParserException;
import w.AbstractC0254a;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0258c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2937a = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        int depth;
        int color;
        int i2;
        int[] iArr;
        AttributeSet attributeSet;
        int i3;
        boolean z2;
        int iA;
        float f2;
        float f3;
        float f4;
        float fCbrt;
        float f5;
        TypedValue typedValue;
        ?? r02 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z3 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == z3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = AbstractC0254a.f2815a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSetAsAttributeSet, iArr4) : theme2.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, i4, i4);
                int resourceId = ObtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f2937a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z3);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i4, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i4, -65281);
                    }
                    float f6 = ObtainAttributes.hasValue(z3) ? ObtainAttributes.getFloat(z3, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    float f7 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                    int[] iArr5 = new int[attributeCount];
                    int i7 = i4;
                    for (int i8 = i7; i8 < attributeCount; i8++) {
                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i8);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i9 = i7 + 1;
                            if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i8, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr5[i7] = attributeNameResource;
                            i7 = i9;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr5, i7);
                    float f8 = 0.0f;
                    float f9 = 100.0f;
                    boolean z4 = f7 >= 0.0f && f7 <= 100.0f;
                    if (f6 != 1.0f || z4) {
                        int iAlpha = (int) ((Color.alpha(color) * f6) + 0.5f);
                        if (iAlpha < 0) {
                            i2 = 0;
                        } else {
                            i2 = 255;
                            if (iAlpha <= 255) {
                                i2 = iAlpha;
                            }
                        }
                        if (z4) {
                            C0256a c0256aA = C0256a.a(color);
                            C0267l c0267l = C0267l.f2958k;
                            float f10 = c0256aA.f2925b;
                            if (f10 < 1.0d || Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                attributeSet = attributeSetAsAttributeSet;
                                i3 = depth2;
                                z2 = true;
                                iA = AbstractC0257b.a(f7);
                            } else {
                                float f11 = c0256aA.f2924a;
                                float fMin = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
                                float f12 = 0.0f;
                                float f13 = f10;
                                C0256a c0256a = null;
                                boolean z5 = true;
                                while (true) {
                                    if (Math.abs(f12 - f10) >= 0.4f) {
                                        float f14 = 1000.0f;
                                        float f15 = f8;
                                        float f16 = f9;
                                        float f17 = 1000.0f;
                                        C0256a c0256a2 = null;
                                        while (true) {
                                            if (Math.abs(f15 - f16) <= 0.01f) {
                                                attributeSet = attributeSetAsAttributeSet;
                                                i3 = depth2;
                                                f2 = fMin;
                                                f3 = f9;
                                                z2 = true;
                                                float f18 = f8;
                                                iArr = iArrTrimStateSet;
                                                f4 = f18;
                                                break;
                                            }
                                            float f19 = ((f16 - f15) / 2.0f) + f15;
                                            int iC = C0256a.b(f19, f13, fMin).c(C0267l.f2958k);
                                            float fB = AbstractC0257b.b(Color.red(iC));
                                            float fB2 = AbstractC0257b.b(Color.green(iC));
                                            float fB3 = AbstractC0257b.b(Color.blue(iC));
                                            z2 = true;
                                            float[] fArr = AbstractC0257b.f2933d[1];
                                            f3 = 100.0f;
                                            float f20 = ((fB3 * fArr[2]) + ((fB2 * fArr[1]) + (fB * fArr[0]))) / 100.0f;
                                            if (f20 <= 0.008856452f) {
                                                fCbrt = f20 * 903.2963f;
                                                attributeSet = attributeSetAsAttributeSet;
                                                i3 = depth2;
                                            } else {
                                                attributeSet = attributeSetAsAttributeSet;
                                                i3 = depth2;
                                                fCbrt = (((float) Math.cbrt(f20)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f7 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C0256a c0256aA2 = C0256a.a(iC);
                                                C0256a c0256aB = C0256a.b(c0256aA2.f2926c, c0256aA2.f2925b, fMin);
                                                f5 = f19;
                                                float f21 = c0256aA2.f2927d - c0256aB.f2927d;
                                                f2 = fMin;
                                                float f22 = c0256aA2.f2928e - c0256aB.f2928e;
                                                float f23 = c0256aA2.f2929f - c0256aB.f2929f;
                                                double dSqrt = Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21));
                                                iArr = iArrTrimStateSet;
                                                float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f17 = fPow;
                                                    c0256a2 = c0256aA2;
                                                    f14 = fAbs;
                                                }
                                            } else {
                                                f5 = f19;
                                                f2 = fMin;
                                                iArr = iArrTrimStateSet;
                                            }
                                            f4 = 0.0f;
                                            if (f14 == 0.0f && f17 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f7) {
                                                f15 = f5;
                                            } else {
                                                f16 = f5;
                                            }
                                            f9 = 100.0f;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i3;
                                            fMin = f2;
                                            int[] iArr6 = iArr;
                                            f8 = 0.0f;
                                            iArrTrimStateSet = iArr6;
                                        }
                                        C0256a c0256a3 = c0256a2;
                                        if (!z5) {
                                            if (c0256a3 == null) {
                                                f10 = f13;
                                            } else {
                                                c0256a = c0256a3;
                                                f12 = f13;
                                            }
                                            f13 = ((f10 - f12) / 2.0f) + f12;
                                            f9 = f3;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i3;
                                            fMin = f2;
                                        } else {
                                            if (c0256a3 != null) {
                                                iA = c0256a3.c(c0267l);
                                                break;
                                            }
                                            f13 = ((f10 - f12) / 2.0f) + f12;
                                            f9 = f3;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i3;
                                            fMin = f2;
                                            z5 = false;
                                        }
                                        int[] iArr7 = iArr;
                                        f8 = f4;
                                        iArrTrimStateSet = iArr7;
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        attributeSet = attributeSetAsAttributeSet;
                                        i3 = depth2;
                                        z2 = true;
                                        iA = c0256a == null ? AbstractC0257b.a(f7) : c0256a.c(c0267l);
                                    }
                                }
                            }
                            color = iA;
                        } else {
                            iArr = iArrTrimStateSet;
                            attributeSet = attributeSetAsAttributeSet;
                            i3 = depth2;
                            z2 = true;
                        }
                        color = (16777215 & color) | (i2 << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        attributeSet = attributeSetAsAttributeSet;
                        i3 = depth2;
                        z2 = true;
                    }
                    int i10 = i5 + 1;
                    if (i10 > iArr3.length) {
                        int[] iArr8 = new int[i5 <= 4 ? 8 : i5 * 2];
                        System.arraycopy(iArr3, 0, iArr8, 0, i5);
                        iArr3 = iArr8;
                    }
                    iArr3[i5] = color;
                    if (i10 > iArr2.length) {
                        ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                        System.arraycopy(iArr2, 0, r1, 0, i5);
                        iArr2 = r1;
                    }
                    iArr2[i5] = iArr;
                    iArr2 = iArr2;
                    theme2 = theme;
                    i5 = i10;
                    z3 = z2;
                    attributeSetAsAttributeSet = attributeSet;
                    depth2 = i3;
                    i4 = 0;
                    r02 = resources;
                }
            } else {
                r02 = resources;
                theme2 = theme;
                z3 = z3;
                attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                depth2 = depth2;
                i4 = 0;
            }
        }
        int[] iArr9 = new int[i5];
        int[][] iArr10 = new int[i5][];
        System.arraycopy(iArr3, 0, iArr9, 0, i5);
        System.arraycopy(iArr2, 0, iArr10, 0, i5);
        return new ColorStateList(iArr10, iArr9);
    }
}
