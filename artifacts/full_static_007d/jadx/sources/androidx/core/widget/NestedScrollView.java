package androidx.core.widget;

import A.f;
import C0.d;
import D.b;
import H.AbstractC0029x;
import H.AbstractC0030y;
import H.C0015i;
import H.C0026u;
import H.C0031z;
import H.G;
import H.InterfaceC0024s;
import H.InterfaceC0025t;
import H.N;
import H.O;
import H.r;
import K.c;
import K.e;
import K.g;
import K.i;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0025t {

    /* renamed from: B, reason: collision with root package name */
    public static final float f986B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final e f987C = new e();

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f988D = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0015i f989A;

    /* renamed from: a, reason: collision with root package name */
    public final float f990a;

    /* renamed from: b, reason: collision with root package name */
    public long f991b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f992c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f993d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f994e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f995f;

    /* renamed from: g, reason: collision with root package name */
    public int f996g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f997i;

    /* renamed from: j, reason: collision with root package name */
    public View f998j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f999k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1000l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1001m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1002n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1003o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1004p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1005q;

    /* renamed from: r, reason: collision with root package name */
    public int f1006r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1007s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1008t;

    /* renamed from: u, reason: collision with root package name */
    public int f1009u;

    /* renamed from: v, reason: collision with root package name */
    public int f1010v;

    /* renamed from: w, reason: collision with root package name */
    public i f1011w;

    /* renamed from: x, reason: collision with root package name */
    public final C0026u f1012x;
    public final r y;

    /* renamed from: z, reason: collision with root package name */
    public float f1013z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.conscrypt.R.attr.nestedScrollViewStyle);
        this.f992c = new Rect();
        this.h = true;
        this.f997i = false;
        this.f998j = null;
        this.f999k = false;
        this.f1002n = true;
        this.f1006r = -1;
        this.f1007s = new int[2];
        this.f1008t = new int[2];
        this.f989A = new C0015i(getContext(), new f(5, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f994e = i2 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f995f = i2 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f990a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f993d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1003o = viewConfiguration.getScaledTouchSlop();
        this.f1004p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1005q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f988D, org.conscrypt.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1012x = new C0026u();
        this.y = new r(this);
        setNestedScrollingEnabled(true);
        N.h(this, f987C);
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // H.InterfaceC0024s
    public final void a(int i2, int i3, int[] iArr, int i4) {
        i(i2, i3, i4, iArr, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // H.InterfaceC0024s
    public final void b(View view, View view2, int i2, int i3) {
        C0026u c0026u = this.f1012x;
        if (i3 == 1) {
            c0026u.f393b = i2;
        } else {
            c0026u.f392a = i2;
        }
        w(2, i3);
    }

    @Override // H.InterfaceC0024s
    public final void c(View view, int i2) {
        C0026u c0026u = this.f1012x;
        if (i2 == 1) {
            c0026u.f393b = 0;
        } else {
            c0026u.f392a = 0;
        }
        y(i2);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i2;
        if (this.f993d.isFinished()) {
            return;
        }
        this.f993d.computeScrollOffset();
        int currY = this.f993d.getCurrY();
        int i3 = currY - this.f1010v;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f995f;
        EdgeEffect edgeEffect2 = this.f994e;
        if (i3 <= 0 || d.u(edgeEffect2) == 0.0f) {
            if (i3 < 0 && d.u(edgeEffect) != 0.0f) {
                float f2 = height;
                iRound = Math.round(d.B(edgeEffect, (i3 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (iRound != i3) {
                    edgeEffect.finish();
                }
            }
            this.f1010v = currY;
            int[] iArr = this.f1008t;
            iArr[1] = 0;
            i(0, i3, 1, iArr, null);
            i2 = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (b.a()) {
                K.f.a(this, Math.abs(this.f993d.getCurrVelocity()));
            }
            if (i2 != 0) {
                int scrollY = getScrollY();
                q(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i2 - scrollY2;
                iArr[1] = 0;
                this.y.b(0, scrollY2, 0, i4, this.f1007s, 1, iArr);
                i2 = i4 - iArr[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i2 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f993d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f993d.getCurrVelocity());
                    }
                }
                this.f993d.abortAnimation();
                y(1);
            }
            if (this.f993d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                y(1);
                return;
            }
        }
        iRound = Math.round(d.B(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect2.finish();
        }
        i3 -= iRound;
        this.f1010v = currY;
        int[] iArr2 = this.f1008t;
        iArr2[1] = 0;
        i(0, i3, 1, iArr2, null);
        i2 = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (b.a()) {
        }
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        if (this.f993d.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // H.InterfaceC0025t
    public final void d(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        o(i5, i6, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        ViewParent viewParentC;
        r rVar = this.y;
        if (!rVar.f390d || (viewParentC = rVar.c(0)) == null) {
            return false;
        }
        try {
            return viewParentC.onNestedFling(rVar.f389c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.y.a(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return i(i2, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.y.b(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f994e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f995f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // H.InterfaceC0024s
    public final void e(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5, int i6) {
        o(i5, i6, null);
    }

    @Override // H.InterfaceC0024s
    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f992c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !n(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0026u c0026u = this.f1012x;
        return c0026u.f393b | c0026u.f392a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1013z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1013z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1013z;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.y.c(0) != null;
    }

    public final boolean i(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        ViewParent viewParentC;
        int i5;
        int i6;
        r rVar = this.y;
        if (!rVar.f390d || (viewParentC = rVar.c(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        NestedScrollView nestedScrollView = rVar.f389c;
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (rVar.f391e == null) {
                rVar.f391e = new int[2];
            }
            iArr = rVar.f391e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentC instanceof InterfaceC0024s) {
            ((InterfaceC0024s) viewParentC).a(i2, i3, iArr, i4);
        } else if (i4 == 0) {
            try {
                viewParentC.onNestedPreScroll(nestedScrollView, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.y.f390d;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.f992c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? l(33) : g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? l(130) : g(130);
                }
                if (keyCode == 62) {
                    r(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return l(33);
                }
                if (keyCode == 93) {
                    return l(130);
                }
                if (keyCode == 122) {
                    r(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                r(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    public final void k(int i2) {
        if (getChildCount() > 0) {
            this.f993d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f1010v = getScrollY();
            postInvalidateOnAnimation();
            if (b.a()) {
                K.f.a(this, Math.abs(this.f993d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f992c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i2, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i2, int i3) {
        Rect rect = this.f992c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    public final void o(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.y.b(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f997i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        float axisValue;
        int i2;
        int width;
        char c2;
        int iF;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c3;
        boolean z2;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f2;
        long j2;
        float fSqrt;
        int i3;
        VelocityTracker velocityTracker2;
        float[] fArr;
        int i4;
        float f3;
        if (motionEvent.getAction() != 8 || this.f999k) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i2 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i2 = 26;
        } else {
            axisValue = 0.0f;
            i2 = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i2 == 0) {
            return true;
        }
        C0015i c0015i = this.f989A;
        c0015i.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i5 = c0015i.f373f;
        int[] iArr = c0015i.h;
        if (i5 == source && c0015i.f374g == deviceId && c0015i.f372e == i2) {
            c3 = 0;
            z2 = false;
        } else {
            Context context = c0015i.f368a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                int i7 = O.f332a;
                iF = AbstractC0029x.f(viewConfiguration, deviceId2, i2, source2);
            } else {
                int i8 = O.f332a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i2, source2) == null) {
                    c2 = 0;
                    iF = Integer.MAX_VALUE;
                    iArr[c2] = iF;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i6 < 34) {
                        scaledMaximumFlingVelocity = AbstractC0029x.e(viewConfiguration, deviceId3, i2, source3);
                    } else {
                        InputDevice device2 = InputDevice.getDevice(deviceId3);
                        int i9 = Integer.MIN_VALUE;
                        if ((device2 == null || device2.getMotionRange(i2, source3) == null) ? false : true) {
                            Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                            Objects.requireNonNull(viewConfiguration);
                            if (identifier != -1) {
                                if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                                    i9 = dimensionPixelSize;
                                }
                                scaledMaximumFlingVelocity = i9;
                            } else {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            }
                        } else {
                            scaledMaximumFlingVelocity = i9;
                        }
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c0015i.f373f = source;
                    c0015i.f374g = deviceId;
                    c0015i.f372e = i2;
                    c3 = 0;
                    z2 = true;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        iF = Integer.MAX_VALUE;
                    }
                    iF = scaledMinimumFlingVelocity;
                }
            }
            c2 = 0;
            iArr[c2] = iF;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i6 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0015i.f373f = source;
            c0015i.f374g = deviceId;
            c0015i.f372e = i2;
            c3 = 0;
            z2 = true;
        }
        if (iArr[c3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0015i.f370c;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c0015i.f370c = null;
            }
        } else {
            if (c0015i.f370c == null) {
                c0015i.f370c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0015i.f370c;
            Map map = AbstractC0030y.f394a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0030y.f394a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new C0031z());
                }
                C0031z c0031z = (C0031z) map2.get(velocityTracker4);
                c0031z.getClass();
                long eventTime = motionEvent.getEventTime();
                int i10 = c0031z.f398d;
                long[] jArr = c0031z.f396b;
                if (i10 != 0 && eventTime - jArr[c0031z.f399e] > 40) {
                    c0031z.f398d = 0;
                    c0031z.f397c = 0.0f;
                }
                int i11 = (c0031z.f399e + 1) % 20;
                c0031z.f399e = i11;
                int i12 = c0031z.f398d;
                if (i12 != 20) {
                    c0031z.f398d = i12 + 1;
                }
                c0031z.f395a[i11] = motionEvent.getAxisValue(26);
                jArr[c0031z.f399e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
            C0031z c0031z2 = (C0031z) AbstractC0030y.f394a.get(velocityTracker4);
            if (c0031z2 != null) {
                int i13 = c0031z2.f398d;
                if (i13 < 2) {
                    velocityTracker = velocityTracker4;
                    i3 = 1000;
                    fSqrt = 0.0f;
                    f3 = fSqrt * i3;
                    c0031z2.f397c = f3;
                    if (f3 >= (-Math.abs(Float.MAX_VALUE))) {
                        c0031z2.f397c = -Math.abs(Float.MAX_VALUE);
                    } else if (c0031z2.f397c > Math.abs(Float.MAX_VALUE)) {
                        c0031z2.f397c = Math.abs(Float.MAX_VALUE);
                    }
                } else {
                    int i14 = c0031z2.f399e;
                    int i15 = ((i14 + 20) - (i13 - 1)) % 20;
                    long[] jArr2 = c0031z2.f396b;
                    long j3 = jArr2[i14];
                    while (true) {
                        j2 = jArr2[i15];
                        if (j3 - j2 <= 100) {
                            break;
                        }
                        c0031z2.f398d--;
                        i15 = (i15 + 1) % 20;
                    }
                    int i16 = c0031z2.f398d;
                    if (i16 >= 2) {
                        float[] fArr2 = c0031z2.f395a;
                        if (i16 == 2) {
                            int i17 = (i15 + 1) % 20;
                            if (j2 != jArr2[i17]) {
                                velocityTracker = velocityTracker4;
                                i3 = 1000;
                                fSqrt = fArr2[i17] / (r8 - j2);
                            }
                        } else {
                            float f4 = 0.0f;
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                if (i18 >= c0031z2.f398d - 1) {
                                    break;
                                }
                                int i20 = i18 + i15;
                                long j4 = jArr2[i20 % 20];
                                int i21 = (i20 + 1) % 20;
                                if (jArr2[i21] == j4) {
                                    velocityTracker2 = velocityTracker4;
                                    fArr = fArr2;
                                    i4 = 1;
                                } else {
                                    i19++;
                                    velocityTracker2 = velocityTracker4;
                                    float fSqrt2 = (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
                                    float f5 = fArr2[i21];
                                    long j5 = jArr2[i21];
                                    fArr = fArr2;
                                    float f6 = f5 / (j5 - j4);
                                    float fAbs = (Math.abs(f6) * (f6 - fSqrt2)) + f4;
                                    i4 = 1;
                                    if (i19 == 1) {
                                        fAbs *= 0.5f;
                                    }
                                    f4 = fAbs;
                                }
                                i18 += i4;
                                fArr2 = fArr;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            fSqrt = ((float) Math.sqrt(Math.abs(f4) * 2.0f)) * (f4 < 0.0f ? -1.0f : 1.0f);
                            i3 = 1000;
                        }
                        f3 = fSqrt * i3;
                        c0031z2.f397c = f3;
                        if (f3 >= (-Math.abs(Float.MAX_VALUE))) {
                        }
                    }
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = AbstractC0029x.b(velocityTracker, i2);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i2 == 0) {
                    yVelocity = velocityTracker5.getXVelocity();
                } else if (i2 == 1) {
                    yVelocity = velocityTracker5.getYVelocity();
                } else {
                    C0031z c0031z3 = (C0031z) AbstractC0030y.f394a.get(velocityTracker5);
                    yVelocity = (c0031z3 == null || i2 != 26) ? 0.0f : c0031z3.f397c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0015i.f369b.f8b;
            float f7 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f7);
            if (z2 || (fSignum != Math.signum(c0015i.f371d) && fSignum != 0.0f)) {
                nestedScrollView.f993d.abortAnimation();
            }
            if (Math.abs(f7) >= iArr[0]) {
                float fMax = Math.max(-r4, Math.min(f7, iArr[1]));
                if (fMax == 0.0f) {
                    f2 = 0.0f;
                } else {
                    nestedScrollView.f993d.abortAnimation();
                    nestedScrollView.k((int) fMax);
                    f2 = fMax;
                }
                c0015i.f371d = f2;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f999k) {
            return true;
        }
        int i2 = action & 255;
        if (i2 == 0) {
            int y = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x2 < childAt.getLeft() || x2 >= childAt.getRight()) {
                    if (!x(motionEvent) && this.f993d.isFinished()) {
                        z2 = false;
                    }
                    this.f999k = z2;
                    VelocityTracker velocityTracker = this.f1000l;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1000l = null;
                    }
                } else {
                    this.f996g = y;
                    this.f1006r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1000l;
                    if (velocityTracker2 == null) {
                        this.f1000l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1000l.addMovement(motionEvent);
                    this.f993d.computeScrollOffset();
                    if (!x(motionEvent) && this.f993d.isFinished()) {
                        z2 = false;
                    }
                    this.f999k = z2;
                    w(2, 0);
                }
            }
        } else if (i2 == 1) {
            this.f999k = false;
            this.f1006r = -1;
            VelocityTracker velocityTracker3 = this.f1000l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1000l = null;
            }
            if (this.f993d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i2 == 2) {
            int i3 = this.f1006r;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f996g) > this.f1003o && (2 & getNestedScrollAxes()) == 0) {
                        this.f999k = true;
                        this.f996g = y2;
                        if (this.f1000l == null) {
                            this.f1000l = VelocityTracker.obtain();
                        }
                        this.f1000l.addMovement(motionEvent);
                        this.f1009u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i2 != 3) {
            if (i2 == 6) {
                p(motionEvent);
            }
        }
        return this.f999k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredHeight;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.h = false;
        View view = this.f998j;
        if (view != null && m(view, this)) {
            View view2 = this.f998j;
            Rect rect = this.f992c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f998j = null;
        if (!this.f997i) {
            if (this.f1011w != null) {
                scrollTo(getScrollX(), this.f1011w.f508a);
                this.f1011w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i6 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f997i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1001m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        k((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.y.a(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        i(i2, i3, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        o(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f1011w = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f508a = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f992c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f1002n) {
                v(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1000l == null) {
            this.f1000l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1009u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1009u);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f995f;
            EdgeEffect edgeEffect2 = this.f994e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1000l;
                velocityTracker.computeCurrentVelocity(1000, this.f1005q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1006r);
                if (Math.abs(yVelocity) >= this.f1004p) {
                    if (d.u(edgeEffect2) != 0.0f) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (d.u(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (u(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            k(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = i3;
                        if (!this.y.a(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            k(i3);
                        }
                    }
                } else if (this.f993d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1006r = -1;
                this.f999k = false;
                VelocityTracker velocityTracker2 = this.f1000l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1000l = null;
                }
                y(0);
                this.f994e.onRelease();
                this.f995f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1006r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1006r + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f996g - y;
                    float x2 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (d.u(edgeEffect2) != 0.0f) {
                        float f4 = -d.B(edgeEffect2, -height, x2);
                        if (d.u(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (d.u(edgeEffect) != 0.0f) {
                        float fB = d.B(edgeEffect, height, 1.0f - x2);
                        if (d.u(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = fB;
                    }
                    int iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i5 = i4 - iRound;
                    if (!this.f999k && Math.abs(i5) > this.f1003o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f999k = true;
                        i5 = i5 > 0 ? i5 - this.f1003o : i5 + this.f1003o;
                    }
                    if (this.f999k) {
                        int iT = t(i5, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f996g = y - iT;
                        this.f1009u += iT;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f999k && getChildCount() > 0 && this.f993d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1006r = -1;
                this.f999k = false;
                VelocityTracker velocityTracker3 = this.f1000l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1000l = null;
                }
                y(0);
                this.f994e.onRelease();
                this.f995f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f996g = (int) motionEvent.getY(actionIndex);
                this.f1006r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f996g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1006r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f999k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f993d.isFinished()) {
                this.f993d.abortAnimation();
                y(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f996g = y2;
            this.f1006r = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1000l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1006r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f996g = (int) motionEvent.getY(i2);
            this.f1006r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1000l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z2 = false;
        } else {
            i3 = 0;
            z2 = true;
        }
        if (i6 > i5) {
            z3 = true;
        } else if (i6 < 0) {
            i5 = 0;
            z3 = true;
        } else {
            i5 = i6;
            z3 = false;
        }
        if (z3 && this.y.c(1) == null) {
            this.f993d.springBack(i3, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i5);
        return z2 || z3;
    }

    public final void r(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f992c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        s(i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.f998j = view2;
        } else {
            Rect rect = this.f992c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z3 = iH != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iH);
            } else {
                v(0, iH, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1000l) != null) {
            velocityTracker.recycle();
            this.f1000l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            t(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1001m) {
            this.f1001m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        r rVar = this.y;
        if (rVar.f390d) {
            WeakHashMap weakHashMap = N.f327a;
            G.i(rVar.f389c);
        }
        rVar.f390d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1002n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return w(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            w(2, i4);
        }
        boolean zI = i(0, i2, i4, this.f1008t, this.f1007s);
        int[] iArr = this.f1008t;
        int[] iArr2 = this.f1007s;
        if (zI) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z4 = q(i5, 0, scrollY, scrollRange) && this.y.c(i4) == null;
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.y.b(0, scrollY2, 0, i5 - scrollY2, this.f1007s, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f995f;
        EdgeEffect edgeEffect2 = this.f994e;
        if (i9 < 0) {
            if (z3) {
                d.B(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z3) {
            d.B(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z4 = false;
        }
        if (z4 && i4 == 0 && (velocityTracker = this.f1000l) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            y(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    public final boolean u(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fU = d.u(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2) * 0.35f;
        float f2 = this.f990a * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d2 = f986B;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f2))) < fU;
    }

    public final void v(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f991b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f993d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f1010v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f993d.isFinished()) {
                this.f993d.abortAnimation();
                y(1);
            }
            scrollBy(i2, i3);
        }
        this.f991b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i2, int i3) {
        boolean zOnStartNestedScroll;
        r rVar = this.y;
        if (!(rVar.c(i3) != null)) {
            if (!rVar.f390d) {
                return false;
            }
            View view = rVar.f389c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0024s;
                if (z2) {
                    zOnStartNestedScroll = ((InterfaceC0024s) parent).f(view2, view, i2, i3);
                } else if (i3 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i2);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i3 == 0) {
                        rVar.f387a = parent;
                    } else if (i3 == 1) {
                        rVar.f388b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0024s) parent).b(view2, view, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                } else {
                    if (parent instanceof View) {
                        view2 = parent;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f994e;
        if (d.u(edgeEffect) != 0.0f) {
            d.B(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f995f;
        if (d.u(edgeEffect2) == 0.0f) {
            return z2;
        }
        d.B(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i2) {
        r rVar = this.y;
        ViewParent viewParentC = rVar.c(i2);
        if (viewParentC != null) {
            boolean z2 = viewParentC instanceof InterfaceC0024s;
            NestedScrollView nestedScrollView = rVar.f389c;
            if (z2) {
                ((InterfaceC0024s) viewParentC).c(nestedScrollView, i2);
            } else if (i2 == 0) {
                try {
                    viewParentC.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                rVar.f387a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                rVar.f388b = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
