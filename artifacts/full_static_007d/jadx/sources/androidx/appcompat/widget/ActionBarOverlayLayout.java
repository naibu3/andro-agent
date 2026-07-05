package androidx.appcompat.widget;

import A.c;
import C0.d;
import H.C0026u;
import H.E;
import H.G;
import H.InterfaceC0024s;
import H.InterfaceC0025t;
import H.N;
import H.Q;
import H.U;
import H.V;
import H.W;
import H.X;
import H.e0;
import H.f0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import g.P;
import i.C0129k;
import j.n;
import j.y;
import java.util.WeakHashMap;
import k.C0172e;
import k.C0174f;
import k.C0184k;
import k.InterfaceC0170d;
import k.InterfaceC0187l0;
import k.InterfaceC0189m0;
import k.RunnableC0168c;
import k.Z0;
import k.e1;
import org.conscrypt.PSKKeyManager;
import org.conscrypt.R;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0187l0, InterfaceC0024s, InterfaceC0025t {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f851C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final f0 f852D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f853E;

    /* renamed from: A, reason: collision with root package name */
    public final C0026u f854A;

    /* renamed from: B, reason: collision with root package name */
    public final C0174f f855B;

    /* renamed from: a, reason: collision with root package name */
    public int f856a;

    /* renamed from: b, reason: collision with root package name */
    public int f857b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f858c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f859d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0189m0 f860e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f861f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f862g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f863i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f864j;

    /* renamed from: k, reason: collision with root package name */
    public int f865k;

    /* renamed from: l, reason: collision with root package name */
    public int f866l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f867m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f868n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f869o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f870p;

    /* renamed from: q, reason: collision with root package name */
    public f0 f871q;

    /* renamed from: r, reason: collision with root package name */
    public f0 f872r;

    /* renamed from: s, reason: collision with root package name */
    public f0 f873s;

    /* renamed from: t, reason: collision with root package name */
    public f0 f874t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0170d f875u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f876v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f877w;

    /* renamed from: x, reason: collision with root package name */
    public final Q f878x;
    public final RunnableC0168c y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0168c f879z;

    static {
        int i2 = Build.VERSION.SDK_INT;
        X w2 = i2 >= 30 ? new W() : i2 >= 29 ? new V() : new U();
        w2.d(c.a(0, 1, 0, 1));
        f852D = w2.b();
        f853E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f857b = 0;
        this.f867m = new Rect();
        this.f868n = new Rect();
        this.f869o = new Rect();
        this.f870p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        f0 f0Var = f0.f365b;
        this.f871q = f0Var;
        this.f872r = f0Var;
        this.f873s = f0Var;
        this.f874t = f0Var;
        this.f878x = new Q(this);
        this.y = new RunnableC0168c(this, 0);
        this.f879z = new RunnableC0168c(this, 1);
        i(context);
        this.f854A = new C0026u();
        C0174f c0174f = new C0174f(context);
        c0174f.setWillNotDraw(true);
        this.f855B = c0174f;
        addView(c0174f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0172e c0172e = (C0172e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0172e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0172e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0172e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0172e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0172e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0172e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0172e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0172e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // H.InterfaceC0024s
    public final void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // H.InterfaceC0024s
    public final void c(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0172e;
    }

    @Override // H.InterfaceC0025t
    public final void d(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        e(nestedScrollView, i2, i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f861f != null) {
            if (this.f859d.getVisibility() == 0) {
                translationY = (int) (this.f859d.getTranslationY() + this.f859d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f861f.setBounds(0, translationY, getWidth(), this.f861f.getIntrinsicHeight() + translationY);
            this.f861f.draw(canvas);
        }
    }

    @Override // H.InterfaceC0024s
    public final void e(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(nestedScrollView, i2, i3, i4, i5);
        }
    }

    @Override // H.InterfaceC0024s
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0172e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0172e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f859d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0026u c0026u = this.f854A;
        return c0026u.f393b | c0026u.f392a;
    }

    public CharSequence getTitle() {
        k();
        return ((e1) this.f860e).f1895a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.y);
        removeCallbacks(this.f879z);
        ViewPropertyAnimator viewPropertyAnimator = this.f877w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f851C);
        this.f856a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f861f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f876v = new OverScroller(context);
    }

    public final void j(int i2) {
        k();
        if (i2 == 2) {
            ((e1) this.f860e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((e1) this.f860e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0189m0 wrapper;
        if (this.f858c == null) {
            this.f858c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f859d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0189m0) {
                wrapper = (InterfaceC0189m0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f860e = wrapper;
        }
    }

    public final void l(n nVar, y yVar) {
        k();
        e1 e1Var = (e1) this.f860e;
        C0184k c0184k = e1Var.f1906m;
        Toolbar toolbar = e1Var.f1895a;
        if (c0184k == null) {
            e1Var.f1906m = new C0184k(toolbar.getContext());
        }
        C0184k c0184k2 = e1Var.f1906m;
        c0184k2.f1955e = yVar;
        if (nVar == null && toolbar.f925a == null) {
            return;
        }
        toolbar.f();
        n nVar2 = toolbar.f925a.f881p;
        if (nVar2 == nVar) {
            return;
        }
        if (nVar2 != null) {
            nVar2.r(toolbar.f916L);
            nVar2.r(toolbar.f917M);
        }
        if (toolbar.f917M == null) {
            toolbar.f917M = new Z0(toolbar);
        }
        c0184k2.f1966q = true;
        if (nVar != null) {
            nVar.b(c0184k2, toolbar.f933j);
            nVar.b(toolbar.f917M, toolbar.f933j);
        } else {
            c0184k2.f(toolbar.f933j, null);
            toolbar.f917M.f(toolbar.f933j, null);
            c0184k2.c();
            toolbar.f917M.c();
        }
        toolbar.f925a.setPopupTheme(toolbar.f934k);
        toolbar.f925a.setPresenter(c0184k2);
        toolbar.f916L = c0184k2;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        f0 f0VarC = f0.c(windowInsets, this);
        e0 e0Var = f0VarC.f366a;
        boolean zG = g(this.f859d, new Rect(e0Var.g().f2a, e0Var.g().f3b, e0Var.g().f4c, e0Var.g().f5d), false);
        WeakHashMap weakHashMap = N.f327a;
        Rect rect = this.f867m;
        G.b(this, f0VarC, rect);
        f0 f0VarH = e0Var.h(rect.left, rect.top, rect.right, rect.bottom);
        this.f871q = f0VarH;
        boolean z2 = true;
        if (!this.f872r.equals(f0VarH)) {
            this.f872r = this.f871q;
            zG = true;
        }
        Rect rect2 = this.f868n;
        if (rect2.equals(rect)) {
            z2 = zG;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return e0Var.a().f366a.c().f366a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = N.f327a;
        E.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0172e c0172e = (C0172e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0172e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0172e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f859d, i2, 0, i3, 0);
        C0172e c0172e = (C0172e) this.f859d.getLayoutParams();
        int iMax = Math.max(0, this.f859d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0172e).leftMargin + ((ViewGroup.MarginLayoutParams) c0172e).rightMargin);
        int iMax2 = Math.max(0, this.f859d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0172e).topMargin + ((ViewGroup.MarginLayoutParams) c0172e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f859d.getMeasuredState());
        WeakHashMap weakHashMap = N.f327a;
        boolean z2 = (getWindowSystemUiVisibility() & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        if (z2) {
            measuredHeight = this.f856a;
            if (this.h && this.f859d.getTabContainer() != null) {
                measuredHeight += this.f856a;
            }
        } else {
            measuredHeight = this.f859d.getVisibility() != 8 ? this.f859d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f867m;
        Rect rect2 = this.f869o;
        rect2.set(rect);
        this.f873s = this.f871q;
        if (this.f862g || z2) {
            c cVarA = c.a(this.f873s.f366a.g().f2a, this.f873s.f366a.g().f3b + measuredHeight, this.f873s.f366a.g().f4c, this.f873s.f366a.g().f5d);
            f0 f0Var = this.f873s;
            int i4 = Build.VERSION.SDK_INT;
            X w2 = i4 >= 30 ? new W(f0Var) : i4 >= 29 ? new V(f0Var) : new U(f0Var);
            w2.d(cVarA);
            this.f873s = w2.b();
        } else {
            C0174f c0174f = this.f855B;
            f0 f0Var2 = f852D;
            Rect rect3 = this.f870p;
            G.b(c0174f, f0Var2, rect3);
            if (!rect3.equals(f853E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f873s = this.f873s.f366a.h(0, measuredHeight, 0, 0);
            }
        }
        g(this.f858c, rect2, true);
        if (!this.f874t.equals(this.f873s)) {
            f0 f0Var3 = this.f873s;
            this.f874t = f0Var3;
            ContentFrameLayout contentFrameLayout = this.f858c;
            WindowInsets windowInsetsB = f0Var3.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsA = E.a(contentFrameLayout, windowInsetsB);
                if (!windowInsetsA.equals(windowInsetsB)) {
                    f0.c(windowInsetsA, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f858c, i2, 0, i3, 0);
        C0172e c0172e2 = (C0172e) this.f858c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f858c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0172e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0172e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f858c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0172e2).topMargin + ((ViewGroup.MarginLayoutParams) c0172e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f858c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f863i || !z2) {
            return false;
        }
        this.f876v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f876v.getFinalY() > this.f859d.getHeight()) {
            h();
            this.f879z.run();
        } else {
            h();
            this.y.run();
        }
        this.f864j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f865k + i3;
        this.f865k = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        P p2;
        C0129k c0129k;
        this.f854A.f392a = i2;
        this.f865k = getActionBarHideOffset();
        h();
        InterfaceC0170d interfaceC0170d = this.f875u;
        if (interfaceC0170d == null || (c0129k = (p2 = (P) interfaceC0170d).f1407s) == null) {
            return;
        }
        c0129k.a();
        p2.f1407s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f859d.getVisibility() != 0) {
            return false;
        }
        return this.f863i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f863i || this.f864j) {
            return;
        }
        if (this.f865k <= this.f859d.getHeight()) {
            h();
            postDelayed(this.y, 600L);
        } else {
            h();
            postDelayed(this.f879z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        k();
        int i3 = this.f866l ^ i2;
        this.f866l = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        InterfaceC0170d interfaceC0170d = this.f875u;
        if (interfaceC0170d != null) {
            P p2 = (P) interfaceC0170d;
            p2.f1403o = !z3;
            if (z2 || !z3) {
                if (p2.f1404p) {
                    p2.f1404p = false;
                    p2.s(true);
                }
            } else if (!p2.f1404p) {
                p2.f1404p = true;
                p2.s(true);
            }
        }
        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.f875u == null) {
            return;
        }
        WeakHashMap weakHashMap = N.f327a;
        E.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f857b = i2;
        InterfaceC0170d interfaceC0170d = this.f875u;
        if (interfaceC0170d != null) {
            ((P) interfaceC0170d).f1402n = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f859d.setTranslationY(-Math.max(0, Math.min(i2, this.f859d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0170d interfaceC0170d) {
        this.f875u = interfaceC0170d;
        if (getWindowToken() != null) {
            ((P) this.f875u).f1402n = this.f857b;
            int i2 = this.f866l;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = N.f327a;
                E.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f863i) {
            this.f863i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        k();
        e1 e1Var = (e1) this.f860e;
        e1Var.f1898d = i2 != 0 ? d.v(e1Var.f1895a.getContext(), i2) : null;
        e1Var.c();
    }

    public void setLogo(int i2) {
        k();
        e1 e1Var = (e1) this.f860e;
        e1Var.f1899e = i2 != 0 ? d.v(e1Var.f1895a.getContext(), i2) : null;
        e1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f862g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // k.InterfaceC0187l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((e1) this.f860e).f1904k = callback;
    }

    @Override // k.InterfaceC0187l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        e1 e1Var = (e1) this.f860e;
        if (e1Var.f1901g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f1896b & 8) != 0) {
            Toolbar toolbar = e1Var.f1895a;
            toolbar.setTitle(charSequence);
            if (e1Var.f1901g) {
                N.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0172e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        e1 e1Var = (e1) this.f860e;
        e1Var.f1898d = drawable;
        e1Var.c();
    }

    @Override // H.InterfaceC0024s
    public final void a(int i2, int i3, int[] iArr, int i4) {
    }
}
