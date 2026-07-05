package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import f.AbstractC0101a;

/* renamed from: k.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0212y0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2054a;

    /* renamed from: b, reason: collision with root package name */
    public int f2055b;

    /* renamed from: c, reason: collision with root package name */
    public int f2056c;

    /* renamed from: d, reason: collision with root package name */
    public int f2057d;

    /* renamed from: e, reason: collision with root package name */
    public int f2058e;

    /* renamed from: f, reason: collision with root package name */
    public int f2059f;

    /* renamed from: g, reason: collision with root package name */
    public float f2060g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2061i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2062j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2063k;

    /* renamed from: l, reason: collision with root package name */
    public int f2064l;

    /* renamed from: m, reason: collision with root package name */
    public int f2065m;

    /* renamed from: n, reason: collision with root package name */
    public int f2066n;

    /* renamed from: o, reason: collision with root package name */
    public int f2067o;

    public AbstractC0212y0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2054a = true;
        this.f2055b = -1;
        this.f2056c = 0;
        this.f2058e = 8388659;
        int[] iArr = AbstractC0101a.f1274n;
        D0.h hVarP = D0.h.p(context, attributeSet, iArr, 0);
        H.N.g(this, context, iArr, attributeSet, (TypedArray) hVarP.f259c, 0);
        TypedArray typedArray = (TypedArray) hVarP.f259c;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f2060g = typedArray.getFloat(4, -1.0f);
        this.f2055b = typedArray.getInt(3, -1);
        this.h = typedArray.getBoolean(7, false);
        setDividerDrawable(hVarP.j(5));
        this.f2066n = typedArray.getInt(8, 0);
        this.f2067o = typedArray.getDimensionPixelSize(6, 0);
        hVarP.r();
    }

    public final void c(Canvas canvas, int i2) {
        this.f2063k.setBounds(getPaddingLeft() + this.f2067o, i2, (getWidth() - getPaddingRight()) - this.f2067o, this.f2065m + i2);
        this.f2063k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0210x0;
    }

    public final void d(Canvas canvas, int i2) {
        this.f2063k.setBounds(i2, getPaddingTop() + this.f2067o, this.f2064l + i2, (getHeight() - getPaddingBottom()) - this.f2067o);
        this.f2063k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0210x0 generateDefaultLayoutParams() {
        int i2 = this.f2057d;
        if (i2 == 0) {
            return new C0210x0(-2, -2);
        }
        if (i2 == 1) {
            return new C0210x0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0210x0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0210x0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0210x0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0210x0 ? new C0210x0((C0210x0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0210x0((ViewGroup.MarginLayoutParams) layoutParams) : new C0210x0(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f2055b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2055b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2055b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f2056c;
        if (this.f2057d == 1 && (i2 = this.f2058e & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2059f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2059f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0210x0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2055b;
    }

    public Drawable getDividerDrawable() {
        return this.f2063k;
    }

    public int getDividerPadding() {
        return this.f2067o;
    }

    public int getDividerWidth() {
        return this.f2064l;
    }

    public int getGravity() {
        return this.f2058e;
    }

    public int getOrientation() {
        return this.f2057d;
    }

    public int getShowDividers() {
        return this.f2066n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2060g;
    }

    public final boolean h(int i2) {
        if (i2 == 0) {
            return (this.f2066n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f2066n & 4) != 0;
        }
        if ((this.f2066n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f2063k == null) {
            return;
        }
        int i3 = 0;
        if (this.f2057d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && h(i3)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0210x0) childAt.getLayoutParams())).topMargin) - this.f2065m);
                }
                i3++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2065m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0210x0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = m1.f1979a;
        boolean z3 = getLayoutDirection() == 1;
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i3)) {
                C0210x0 c0210x0 = (C0210x0) childAt3.getLayoutParams();
                d(canvas, z3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0210x0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0210x0).leftMargin) - this.f2064l);
            }
            i3++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0210x0 c0210x02 = (C0210x0) childAt4.getLayoutParams();
                if (z3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0210x02).leftMargin;
                    i2 = this.f2064l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0210x02).rightMargin;
                }
            } else if (z3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f2064l;
                right = left - i2;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int measuredHeight;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        if (this.f2057d == 1) {
            int paddingLeft = getPaddingLeft();
            int i19 = i4 - i2;
            int paddingRight = i19 - getPaddingRight();
            int paddingRight2 = (i19 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i20 = this.f2058e;
            int i21 = i20 & 112;
            int i22 = 8388615 & i20;
            int paddingTop = i21 != 16 ? i21 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f2059f : getPaddingTop() + (((i5 - i3) - this.f2059f) / 2);
            int i23 = 0;
            while (i23 < virtualChildCount) {
                View childAt = getChildAt(i23);
                if (childAt != null && childAt.getVisibility() != i18) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0210x0 c0210x0 = (C0210x0) childAt.getLayoutParams();
                    int i24 = ((LinearLayout.LayoutParams) c0210x0).gravity;
                    if (i24 < 0) {
                        i24 = i22;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0210x0).leftMargin;
                        i16 = ((LinearLayout.LayoutParams) c0210x0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i17 = ((LinearLayout.LayoutParams) c0210x0).leftMargin + paddingLeft;
                        if (h(i23)) {
                            paddingTop += this.f2065m;
                        }
                        int i25 = paddingTop + ((LinearLayout.LayoutParams) c0210x0).topMargin;
                        childAt.layout(i17, i25, measuredWidth + i17, i25 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0210x0).bottomMargin + i25;
                    } else {
                        i15 = paddingRight - measuredWidth;
                        i16 = ((LinearLayout.LayoutParams) c0210x0).rightMargin;
                    }
                    i17 = i15 - i16;
                    if (h(i23)) {
                    }
                    int i252 = paddingTop + ((LinearLayout.LayoutParams) c0210x0).topMargin;
                    childAt.layout(i17, i252, measuredWidth + i17, i252 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0210x0).bottomMargin + i252;
                }
                i23++;
                i18 = 8;
            }
            return;
        }
        boolean z3 = m1.f1979a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i26 = i5 - i3;
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.f2058e;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z5 = this.f2054a;
        int[] iArr = this.f2061i;
        int[] iArr2 = this.f2062j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f2059f : getPaddingLeft() + (((i4 - i2) - this.f2059f) / 2);
        if (z4) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = 1;
            i7 = 0;
        }
        int i30 = 0;
        while (i30 < virtualChildCount2) {
            int i31 = (i6 * i30) + i7;
            View childAt2 = getChildAt(i31);
            if (childAt2 == null) {
                i8 = i7;
                i9 = i6;
                i10 = virtualChildCount2;
                i11 = i29;
                i12 = 1;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C0210x0 c0210x02 = (C0210x0) childAt2.getLayoutParams();
                    i9 = i6;
                    if (z5) {
                        i10 = virtualChildCount2;
                        int baseline = ((LinearLayout.LayoutParams) c0210x02).height != -1 ? childAt2.getBaseline() : -1;
                        i13 = ((LinearLayout.LayoutParams) c0210x02).gravity;
                        if (i13 < 0) {
                            i13 = i29;
                        }
                        i14 = i13 & 112;
                        i11 = i29;
                        if (i14 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0210x02).topMargin) - ((LinearLayout.LayoutParams) c0210x02).bottomMargin;
                        } else if (i14 == 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) c0210x02).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i14 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0210x02).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (h(i31)) {
                            paddingLeft2 += this.f2064l;
                        }
                        int i32 = paddingLeft2 + ((LinearLayout.LayoutParams) c0210x02).leftMargin;
                        childAt2.layout(i32, measuredHeight, i32 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0210x02).rightMargin + i32;
                    } else {
                        i10 = virtualChildCount2;
                    }
                    i13 = ((LinearLayout.LayoutParams) c0210x02).gravity;
                    if (i13 < 0) {
                    }
                    i14 = i13 & 112;
                    i11 = i29;
                    if (i14 != 16) {
                    }
                    if (h(i31)) {
                    }
                    int i322 = paddingLeft2 + ((LinearLayout.LayoutParams) c0210x02).leftMargin;
                    childAt2.layout(i322, measuredHeight, i322 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0210x02).rightMargin + i322;
                } else {
                    i9 = i6;
                    i10 = virtualChildCount2;
                    i11 = i29;
                }
                i12 = 1;
            }
            i30 += i12;
            i7 = i8;
            i6 = i9;
            virtualChildCount2 = i10;
            i29 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        char c2;
        int i4;
        int iMax;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        char c3;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        int i13;
        int i14;
        int baseline;
        int i15;
        int i16;
        float f4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        boolean z3;
        C0210x0 c0210x0;
        boolean z4;
        int i22;
        boolean z5;
        int i23;
        int i24;
        int baseline2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z6;
        C0210x0 c0210x02;
        boolean z7;
        int i34;
        boolean z8;
        int iMax2;
        int i35 = -2;
        int i36 = 1073741824;
        int i37 = 8;
        int i38 = Integer.MIN_VALUE;
        float f5 = 0.0f;
        boolean z9 = true;
        if (this.f2057d == 1) {
            this.f2059f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i39 = this.f2055b;
            boolean z10 = this.h;
            boolean z11 = true;
            int i40 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            boolean z12 = false;
            int iMax5 = 0;
            int i41 = 0;
            int i42 = 0;
            boolean z13 = false;
            float f6 = 0.0f;
            while (i40 < virtualChildCount) {
                View childAt = getChildAt(i40);
                if (childAt == null) {
                    this.f2059f = this.f2059f;
                } else {
                    if (childAt.getVisibility() != i37) {
                        if (h(i40)) {
                            this.f2059f += this.f2065m;
                        }
                        C0210x0 c0210x03 = (C0210x0) childAt.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) c0210x03).weight;
                        f6 += f7;
                        if (mode2 == i36 && ((LinearLayout.LayoutParams) c0210x03).height == 0 && f7 > f5) {
                            int i43 = this.f2059f;
                            this.f2059f = Math.max(i43, ((LinearLayout.LayoutParams) c0210x03).topMargin + i43 + ((LinearLayout.LayoutParams) c0210x03).bottomMargin);
                            i30 = i39;
                            i31 = mode2;
                            i32 = mode;
                            i33 = virtualChildCount;
                            c0210x02 = c0210x03;
                            z7 = true;
                            z6 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) c0210x03).height != 0 || f7 <= f5) {
                                i29 = i38;
                            } else {
                                ((LinearLayout.LayoutParams) c0210x03).height = i35;
                                i29 = 0;
                            }
                            int i44 = f6 == f5 ? this.f2059f : 0;
                            i30 = i39;
                            i31 = mode2;
                            i32 = mode;
                            i33 = virtualChildCount;
                            z6 = true;
                            c0210x02 = c0210x03;
                            measureChildWithMargins(childAt, i2, 0, i3, i44);
                            if (i29 != i38) {
                                ((LinearLayout.LayoutParams) c0210x02).height = i29;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i45 = this.f2059f;
                            this.f2059f = Math.max(i45, i45 + measuredHeight + ((LinearLayout.LayoutParams) c0210x02).topMargin + ((LinearLayout.LayoutParams) c0210x02).bottomMargin);
                            int i46 = iMax5;
                            if (z10) {
                                iMax5 = Math.max(measuredHeight, i46);
                            }
                            z7 = z12;
                        }
                        if (i30 >= 0 && i30 == i40 + 1) {
                            this.f2056c = this.f2059f;
                        }
                        if (i40 < i30 && ((LinearLayout.LayoutParams) c0210x02).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i34 = i32;
                        if (i34 == 1073741824 || ((LinearLayout.LayoutParams) c0210x02).width != -1) {
                            z8 = false;
                        } else {
                            z8 = z6;
                            z13 = z8;
                        }
                        int i47 = ((LinearLayout.LayoutParams) c0210x02).leftMargin + ((LinearLayout.LayoutParams) c0210x02).rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i47;
                        iMax2 = Math.max(i41, measuredWidth);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i42, childAt.getMeasuredState());
                        boolean z14 = (z11 && ((LinearLayout.LayoutParams) c0210x02).width == -1) ? z6 : false;
                        if (((LinearLayout.LayoutParams) c0210x02).weight > 0.0f) {
                            if (!z8) {
                                i47 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i47);
                        } else {
                            int i48 = iMax4;
                            if (!z8) {
                                i47 = measuredWidth;
                            }
                            iMax3 = Math.max(iMax3, i47);
                            iMax4 = i48;
                        }
                        z12 = z7;
                        i42 = iCombineMeasuredStates;
                        z11 = z14;
                    }
                    i40++;
                    mode = i34;
                    i41 = iMax2;
                    i39 = i30;
                    z9 = z6;
                    mode2 = i31;
                    virtualChildCount = i33;
                    i35 = -2;
                    i36 = 1073741824;
                    i37 = 8;
                    i38 = Integer.MIN_VALUE;
                    f5 = 0.0f;
                }
                i30 = i39;
                i31 = mode2;
                i34 = mode;
                i33 = virtualChildCount;
                iMax2 = i41;
                z6 = true;
                i40++;
                mode = i34;
                i41 = iMax2;
                i39 = i30;
                z9 = z6;
                mode2 = i31;
                virtualChildCount = i33;
                i35 = -2;
                i36 = 1073741824;
                i37 = 8;
                i38 = Integer.MIN_VALUE;
                f5 = 0.0f;
            }
            int i49 = mode2;
            int i50 = mode;
            int i51 = virtualChildCount;
            boolean z15 = z9;
            int iMax6 = iMax3;
            int i52 = iMax4;
            int i53 = iMax5;
            int i54 = i41;
            int iCombineMeasuredStates2 = i42;
            if (this.f2059f > 0 && h(i51)) {
                this.f2059f += this.f2065m;
            }
            int i55 = i49;
            if (z10 && (i55 == Integer.MIN_VALUE || i55 == 0)) {
                this.f2059f = 0;
                for (int i56 = 0; i56 < i51; i56++) {
                    View childAt2 = getChildAt(i56);
                    if (childAt2 == null) {
                        this.f2059f = this.f2059f;
                    } else if (childAt2.getVisibility() != 8) {
                        C0210x0 c0210x04 = (C0210x0) childAt2.getLayoutParams();
                        int i57 = this.f2059f;
                        this.f2059f = Math.max(i57, i57 + i53 + ((LinearLayout.LayoutParams) c0210x04).topMargin + ((LinearLayout.LayoutParams) c0210x04).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f2059f;
            this.f2059f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, 0);
            int i58 = (16777215 & iResolveSizeAndState) - this.f2059f;
            if (z12 || (i58 != 0 && f6 > 0.0f)) {
                float f8 = this.f2060g;
                if (f8 > 0.0f) {
                    f6 = f8;
                }
                this.f2059f = 0;
                int i59 = 0;
                while (i59 < i51) {
                    View childAt3 = getChildAt(i59);
                    if (childAt3.getVisibility() == 8) {
                        i26 = i55;
                    } else {
                        C0210x0 c0210x05 = (C0210x0) childAt3.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) c0210x05).weight;
                        if (f9 > 0.0f) {
                            int i60 = (int) ((i58 * f9) / f6);
                            f6 -= f9;
                            int i61 = i58 - i60;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c0210x05).leftMargin + ((LinearLayout.LayoutParams) c0210x05).rightMargin, ((LinearLayout.LayoutParams) c0210x05).width);
                            if (((LinearLayout.LayoutParams) c0210x05).height == 0) {
                                i28 = 1073741824;
                                if (i55 == 1073741824) {
                                    if (i60 <= 0) {
                                        i60 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i60, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                                i58 = i61;
                            } else {
                                i28 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i60;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i28));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            i58 = i61;
                        }
                        int i62 = ((LinearLayout.LayoutParams) c0210x05).leftMargin + ((LinearLayout.LayoutParams) c0210x05).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i62;
                        int iMax7 = Math.max(i54, measuredWidth2);
                        if (i50 != 1073741824) {
                            i26 = i55;
                            i27 = -1;
                            if (((LinearLayout.LayoutParams) c0210x05).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i62);
                            boolean z16 = (z11 || ((LinearLayout.LayoutParams) c0210x05).width != i27) ? false : z15;
                            int i63 = this.f2059f;
                            this.f2059f = Math.max(i63, childAt3.getMeasuredHeight() + i63 + ((LinearLayout.LayoutParams) c0210x05).topMargin + ((LinearLayout.LayoutParams) c0210x05).bottomMargin);
                            z11 = z16;
                            i54 = iMax7;
                        } else {
                            i26 = i55;
                            i27 = -1;
                        }
                        i62 = measuredWidth2;
                        iMax6 = Math.max(iMax6, i62);
                        if (z11) {
                            int i632 = this.f2059f;
                            this.f2059f = Math.max(i632, childAt3.getMeasuredHeight() + i632 + ((LinearLayout.LayoutParams) c0210x05).topMargin + ((LinearLayout.LayoutParams) c0210x05).bottomMargin);
                            z11 = z16;
                            i54 = iMax7;
                        }
                    }
                    i59++;
                    i55 = i26;
                }
                this.f2059f = getPaddingBottom() + getPaddingTop() + this.f2059f;
            } else {
                iMax6 = Math.max(iMax6, i52);
                if (z10 && i55 != 1073741824) {
                    for (int i64 = 0; i64 < i51; i64++) {
                        View childAt4 = getChildAt(i64);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0210x0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i53, 1073741824));
                        }
                    }
                }
            }
            int i65 = i54;
            if (z11 || i50 == 1073741824) {
                iMax6 = i65;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z13) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i66 = 0; i66 < i51; i66++) {
                    View childAt5 = getChildAt(i66);
                    if (childAt5.getVisibility() != 8) {
                        C0210x0 c0210x06 = (C0210x0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0210x06).width == -1) {
                            int i67 = ((LinearLayout.LayoutParams) c0210x06).height;
                            ((LinearLayout.LayoutParams) c0210x06).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i3, 0);
                            ((LinearLayout.LayoutParams) c0210x06).height = i67;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f2059f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i2);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (this.f2061i == null || this.f2062j == null) {
            this.f2061i = new int[4];
            this.f2062j = new int[4];
        }
        int[] iArr = this.f2061i;
        int[] iArr2 = this.f2062j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z17 = this.f2054a;
        boolean z18 = this.h;
        boolean z19 = mode3 == 1073741824;
        boolean z20 = true;
        int iMax8 = 0;
        float f10 = 0.0f;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int iMax9 = 0;
        int iMax10 = 0;
        boolean z21 = false;
        boolean z22 = false;
        while (i69 < virtualChildCount2) {
            View childAt6 = getChildAt(i69);
            if (childAt6 == null) {
                this.f2059f = this.f2059f;
                i21 = i69;
                z2 = z18;
                z3 = z17;
            } else {
                int i71 = iMax8;
                int i72 = i68;
                if (childAt6.getVisibility() == 8) {
                    z3 = z17;
                    iMax8 = i71;
                    i68 = i72;
                    i21 = i69;
                    z2 = z18;
                } else {
                    if (h(i69)) {
                        this.f2059f += this.f2064l;
                    }
                    C0210x0 c0210x07 = (C0210x0) childAt6.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) c0210x07).weight;
                    float f12 = f10 + f11;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0210x07).width == 0 && f11 > 0.0f) {
                        if (z19) {
                            i25 = i69;
                            this.f2059f = ((LinearLayout.LayoutParams) c0210x07).leftMargin + ((LinearLayout.LayoutParams) c0210x07).rightMargin + this.f2059f;
                        } else {
                            i25 = i69;
                            int i73 = this.f2059f;
                            this.f2059f = Math.max(i73, ((LinearLayout.LayoutParams) c0210x07).leftMargin + i73 + ((LinearLayout.LayoutParams) c0210x07).rightMargin);
                        }
                        if (z17) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            c0210x0 = c0210x07;
                            i18 = i71;
                            i19 = i72;
                            i21 = i25;
                            z2 = z18;
                            z3 = z17;
                        } else {
                            c0210x0 = c0210x07;
                            i18 = i71;
                            i19 = i72;
                            i21 = i25;
                            i22 = 1073741824;
                            z2 = z18;
                            z3 = z17;
                            z4 = true;
                            if (mode4 == i22 && ((LinearLayout.LayoutParams) c0210x0).height == -1) {
                                z5 = true;
                                z22 = true;
                            } else {
                                z5 = false;
                            }
                            i23 = ((LinearLayout.LayoutParams) c0210x0).topMargin + ((LinearLayout.LayoutParams) c0210x0).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i23;
                            int iCombineMeasuredStates3 = View.combineMeasuredStates(i70, childAt6.getMeasuredState());
                            if (z3 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i24 = i23;
                            } else {
                                int i74 = ((LinearLayout.LayoutParams) c0210x0).gravity;
                                if (i74 < 0) {
                                    i74 = this.f2058e;
                                }
                                int i75 = (((i74 & 112) >> 4) & (-2)) >> 1;
                                i24 = i23;
                                iArr[i75] = Math.max(iArr[i75], baseline2);
                                iArr2[i75] = Math.max(iArr2[i75], measuredHeight3 - baseline2);
                            }
                            int iMax11 = Math.max(i19, measuredHeight3);
                            boolean z23 = !z20 && ((LinearLayout.LayoutParams) c0210x0).height == -1;
                            if (((LinearLayout.LayoutParams) c0210x0).weight <= 0.0f) {
                                if (z5) {
                                    measuredHeight3 = i24;
                                }
                                iMax10 = Math.max(iMax10, measuredHeight3);
                                iMax8 = i18;
                            } else {
                                if (z5) {
                                    measuredHeight3 = i24;
                                }
                                iMax8 = Math.max(i18, measuredHeight3);
                            }
                            i68 = iMax11;
                            i70 = iCombineMeasuredStates3;
                            z21 = z4;
                            z20 = z23;
                            f10 = f12;
                        }
                    } else {
                        int i76 = i69;
                        if (((LinearLayout.LayoutParams) c0210x07).width == 0) {
                            f4 = 0.0f;
                            if (f11 > 0.0f) {
                                ((LinearLayout.LayoutParams) c0210x07).width = -2;
                                i17 = 0;
                            }
                            i18 = i71;
                            i19 = i72;
                            i20 = i17;
                            i21 = i76;
                            z2 = z18;
                            z3 = z17;
                            measureChildWithMargins(childAt6, i2, f12 != f4 ? this.f2059f : 0, i3, 0);
                            if (i20 == Integer.MIN_VALUE) {
                                c0210x0 = c0210x07;
                                ((LinearLayout.LayoutParams) c0210x0).width = i20;
                            } else {
                                c0210x0 = c0210x07;
                            }
                            int measuredWidth3 = childAt6.getMeasuredWidth();
                            if (z19) {
                                int i77 = this.f2059f;
                                this.f2059f = Math.max(i77, i77 + measuredWidth3 + ((LinearLayout.LayoutParams) c0210x0).leftMargin + ((LinearLayout.LayoutParams) c0210x0).rightMargin);
                            } else {
                                this.f2059f = ((LinearLayout.LayoutParams) c0210x0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0210x0).rightMargin + this.f2059f;
                            }
                            if (z2) {
                                iMax9 = Math.max(measuredWidth3, iMax9);
                            }
                        } else {
                            f4 = 0.0f;
                        }
                        i17 = Integer.MIN_VALUE;
                        i18 = i71;
                        i19 = i72;
                        i20 = i17;
                        i21 = i76;
                        z2 = z18;
                        z3 = z17;
                        measureChildWithMargins(childAt6, i2, f12 != f4 ? this.f2059f : 0, i3, 0);
                        if (i20 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z19) {
                        }
                        if (z2) {
                        }
                    }
                    z4 = z21;
                    i22 = 1073741824;
                    if (mode4 == i22) {
                        z5 = false;
                        i23 = ((LinearLayout.LayoutParams) c0210x0).topMargin + ((LinearLayout.LayoutParams) c0210x0).bottomMargin;
                        int measuredHeight32 = childAt6.getMeasuredHeight() + i23;
                        int iCombineMeasuredStates32 = View.combineMeasuredStates(i70, childAt6.getMeasuredState());
                        if (z3) {
                            i24 = i23;
                            int iMax112 = Math.max(i19, measuredHeight32);
                            if (z20) {
                                if (((LinearLayout.LayoutParams) c0210x0).weight <= 0.0f) {
                                }
                                i68 = iMax112;
                                i70 = iCombineMeasuredStates32;
                                z21 = z4;
                                z20 = z23;
                                f10 = f12;
                            }
                        }
                    }
                }
            }
            i69 = i21 + 1;
            z18 = z2;
            z17 = z3;
        }
        int i78 = i68;
        boolean z24 = z18;
        boolean z25 = z17;
        if (this.f2059f > 0 && h(virtualChildCount2)) {
            this.f2059f += this.f2064l;
        }
        int i79 = iArr[1];
        if (i79 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                iMax = i78;
                i4 = i70;
            }
            if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f2059f = 0;
                for (i16 = 0; i16 < virtualChildCount2; i16++) {
                    View childAt7 = getChildAt(i16);
                    if (childAt7 == null) {
                        this.f2059f = this.f2059f;
                    } else if (childAt7.getVisibility() != 8) {
                        C0210x0 c0210x08 = (C0210x0) childAt7.getLayoutParams();
                        if (z19) {
                            this.f2059f = ((LinearLayout.LayoutParams) c0210x08).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c0210x08).rightMargin + this.f2059f;
                        } else {
                            int i80 = this.f2059f;
                            this.f2059f = Math.max(i80, i80 + iMax9 + ((LinearLayout.LayoutParams) c0210x08).leftMargin + ((LinearLayout.LayoutParams) c0210x08).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f2059f;
            this.f2059f = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, 0);
            int i81 = (16777215 & iResolveSizeAndState2) - this.f2059f;
            if (!z21 || (i81 != 0 && f10 > 0.0f)) {
                f2 = this.f2060g;
                if (f2 > 0.0f) {
                    f10 = f2;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f2059f = 0;
                int iCombineMeasuredStates4 = i4;
                iMax = -1;
                i5 = 0;
                while (i5 < virtualChildCount2) {
                    View childAt8 = getChildAt(i5);
                    if (childAt8 == null || childAt8.getVisibility() == 8) {
                        i10 = i81;
                        i11 = virtualChildCount2;
                    } else {
                        C0210x0 c0210x09 = (C0210x0) childAt8.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) c0210x09).weight;
                        if (f13 > 0.0f) {
                            i11 = virtualChildCount2;
                            int i82 = (int) ((i81 * f13) / f10);
                            float f14 = f10 - f13;
                            int i83 = i81 - i82;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c0210x09).topMargin + ((LinearLayout.LayoutParams) c0210x09).bottomMargin, ((LinearLayout.LayoutParams) c0210x09).height);
                            if (((LinearLayout.LayoutParams) c0210x09).width == 0) {
                                i15 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i82 <= 0) {
                                        i82 = 0;
                                    }
                                    childAt8.measure(View.MeasureSpec.makeMeasureSpec(i82, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates4, childAt8.getMeasuredState() & (-16777216));
                                f10 = f14;
                                i12 = i83;
                            } else {
                                i15 = 1073741824;
                            }
                            int measuredWidth4 = childAt8.getMeasuredWidth() + i82;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                            iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates4, childAt8.getMeasuredState() & (-16777216));
                            f10 = f14;
                            i12 = i83;
                        } else {
                            i12 = i81;
                            i11 = virtualChildCount2;
                        }
                        if (z19) {
                            f3 = f10;
                            this.f2059f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0210x09).leftMargin + ((LinearLayout.LayoutParams) c0210x09).rightMargin + this.f2059f;
                            i13 = i12;
                        } else {
                            f3 = f10;
                            int i84 = this.f2059f;
                            i13 = i12;
                            this.f2059f = Math.max(i84, childAt8.getMeasuredWidth() + i84 + ((LinearLayout.LayoutParams) c0210x09).leftMargin + ((LinearLayout.LayoutParams) c0210x09).rightMargin);
                        }
                        boolean z26 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0210x09).height == -1;
                        int i85 = ((LinearLayout.LayoutParams) c0210x09).topMargin + ((LinearLayout.LayoutParams) c0210x09).bottomMargin;
                        int measuredHeight4 = childAt8.getMeasuredHeight() + i85;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z26) {
                            i85 = measuredHeight4;
                        }
                        iMax8 = Math.max(iMax8, i85);
                        if (z20) {
                            i14 = -1;
                            boolean z27 = ((LinearLayout.LayoutParams) c0210x09).height == -1;
                            if (!z25 && (baseline = childAt8.getBaseline()) != i14) {
                                int i86 = ((LinearLayout.LayoutParams) c0210x09).gravity;
                                if (i86 < 0) {
                                    i86 = this.f2058e;
                                }
                                int i87 = (((i86 & 112) >> 4) & (-2)) >> 1;
                                iArr[i87] = Math.max(iArr[i87], baseline);
                                iArr2[i87] = Math.max(iArr2[i87], measuredHeight4 - baseline);
                            }
                            z20 = z27;
                            i10 = i13;
                            f10 = f3;
                        } else {
                            i14 = -1;
                        }
                        if (!z25) {
                            z20 = z27;
                            i10 = i13;
                            f10 = f3;
                        }
                    }
                    i5++;
                    i81 = i10;
                    virtualChildCount2 = i11;
                }
                i6 = i3;
                i7 = virtualChildCount2;
                this.f2059f = getPaddingRight() + getPaddingLeft() + this.f2059f;
                i8 = iArr[1];
                if (i8 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c3 = 3;
                    if (iArr[3] == -1) {
                        i9 = 0;
                    }
                    i4 = iCombineMeasuredStates4;
                } else {
                    c3 = 3;
                }
                i9 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i8, iArr[2]))));
                i4 = iCombineMeasuredStates4;
            } else {
                iMax8 = Math.max(iMax8, iMax10);
                if (z24 && mode3 != 1073741824) {
                    for (int i88 = 0; i88 < virtualChildCount2; i88++) {
                        View childAt9 = getChildAt(i88);
                        if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0210x0) childAt9.getLayoutParams())).weight > 0.0f) {
                            childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i6 = i3;
                i7 = virtualChildCount2;
                i9 = 0;
            }
            if (!z20 || mode4 == 1073741824) {
                iMax8 = iMax;
            }
            setMeasuredDimension((i4 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i6, i4 << 16));
            if (z22) {
                return;
            }
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            int i89 = i7;
            while (i9 < i89) {
                View childAt10 = getChildAt(i9);
                if (childAt10.getVisibility() != 8) {
                    C0210x0 c0210x010 = (C0210x0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0210x010).height == -1) {
                        int i90 = ((LinearLayout.LayoutParams) c0210x010).width;
                        ((LinearLayout.LayoutParams) c0210x010).width = childAt10.getMeasuredWidth();
                        measureChildWithMargins(childAt10, i2, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c0210x010).width = i90;
                    }
                }
                i9++;
            }
            return;
        }
        c2 = 3;
        i4 = i70;
        iMax = Math.max(i78, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i79, iArr[2]))));
        if (z24) {
            this.f2059f = 0;
            while (i16 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f2059f;
        this.f2059f = paddingRight2;
        int iResolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i2, 0);
        int i812 = (16777215 & iResolveSizeAndState22) - this.f2059f;
        if (z21) {
            f2 = this.f2060g;
            if (f2 > 0.0f) {
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f2059f = 0;
            int iCombineMeasuredStates42 = i4;
            iMax = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
            }
            i6 = i3;
            i7 = virtualChildCount2;
            this.f2059f = getPaddingRight() + getPaddingLeft() + this.f2059f;
            i8 = iArr[1];
            if (i8 != -1) {
                c3 = 3;
                i9 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i8, iArr[2]))));
                i4 = iCombineMeasuredStates42;
            }
        }
        if (!z20) {
            iMax8 = iMax;
        }
        setMeasuredDimension((i4 & (-16777216)) | iResolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i6, i4 << 16));
        if (z22) {
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f2054a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f2055b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2063k) {
            return;
        }
        this.f2063k = drawable;
        if (drawable != null) {
            this.f2064l = drawable.getIntrinsicWidth();
            this.f2065m = drawable.getIntrinsicHeight();
        } else {
            this.f2064l = 0;
            this.f2065m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f2067o = i2;
    }

    public void setGravity(int i2) {
        if (this.f2058e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2058e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2058e;
        if ((8388615 & i4) != i3) {
            this.f2058e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f2057d != i2) {
            this.f2057d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f2066n) {
            requestLayout();
        }
        this.f2066n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2058e;
        if ((i4 & 112) != i3) {
            this.f2058e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2060g = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
