package androidx.appcompat.widget;

import C0.d;
import D0.h;
import E.b;
import H.C0021o;
import H.N;
import Z.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import f.AbstractC0101a;
import g.I;
import g.J;
import i.C0127i;
import j.n;
import j.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.C0153A;
import k.C0171d0;
import k.C0184k;
import k.C0211y;
import k.InterfaceC0189m0;
import k.P0;
import k.W0;
import k.X0;
import k.Y0;
import k.Z0;
import k.a1;
import k.b1;
import k.c1;
import k.e1;
import k.m1;
import org.conscrypt.R;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f905A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f906B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f907C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f908D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f909E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f910F;

    /* renamed from: G, reason: collision with root package name */
    public final C0021o f911G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f912H;

    /* renamed from: I, reason: collision with root package name */
    public b1 f913I;

    /* renamed from: J, reason: collision with root package name */
    public final X0 f914J;

    /* renamed from: K, reason: collision with root package name */
    public e1 f915K;

    /* renamed from: L, reason: collision with root package name */
    public C0184k f916L;

    /* renamed from: M, reason: collision with root package name */
    public Z0 f917M;

    /* renamed from: N, reason: collision with root package name */
    public J f918N;

    /* renamed from: O, reason: collision with root package name */
    public I f919O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f920P;

    /* renamed from: Q, reason: collision with root package name */
    public OnBackInvokedCallback f921Q;

    /* renamed from: R, reason: collision with root package name */
    public OnBackInvokedDispatcher f922R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f923S;

    /* renamed from: T, reason: collision with root package name */
    public final b f924T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f925a;

    /* renamed from: b, reason: collision with root package name */
    public C0171d0 f926b;

    /* renamed from: c, reason: collision with root package name */
    public C0171d0 f927c;

    /* renamed from: d, reason: collision with root package name */
    public C0211y f928d;

    /* renamed from: e, reason: collision with root package name */
    public C0153A f929e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f930f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f931g;
    public C0211y h;

    /* renamed from: i, reason: collision with root package name */
    public View f932i;

    /* renamed from: j, reason: collision with root package name */
    public Context f933j;

    /* renamed from: k, reason: collision with root package name */
    public int f934k;

    /* renamed from: l, reason: collision with root package name */
    public int f935l;

    /* renamed from: m, reason: collision with root package name */
    public int f936m;

    /* renamed from: n, reason: collision with root package name */
    public final int f937n;

    /* renamed from: o, reason: collision with root package name */
    public final int f938o;

    /* renamed from: p, reason: collision with root package name */
    public int f939p;

    /* renamed from: q, reason: collision with root package name */
    public int f940q;

    /* renamed from: r, reason: collision with root package name */
    public int f941r;

    /* renamed from: s, reason: collision with root package name */
    public int f942s;

    /* renamed from: t, reason: collision with root package name */
    public P0 f943t;

    /* renamed from: u, reason: collision with root package name */
    public int f944u;

    /* renamed from: v, reason: collision with root package name */
    public int f945v;

    /* renamed from: w, reason: collision with root package name */
    public final int f946w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f947x;
    public CharSequence y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f948z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f946w = 8388627;
        this.f908D = new ArrayList();
        this.f909E = new ArrayList();
        this.f910F = new int[2];
        this.f911G = new C0021o(new W0(this, 1));
        this.f912H = new ArrayList();
        this.f914J = new X0(this);
        this.f924T = new b(10, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0101a.f1283w;
        h hVarP = h.p(context2, attributeSet, iArr, R.attr.toolbarStyle);
        N.g(this, context, iArr, attributeSet, (TypedArray) hVarP.f259c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) hVarP.f259c;
        this.f935l = typedArray.getResourceId(28, 0);
        this.f936m = typedArray.getResourceId(19, 0);
        this.f946w = typedArray.getInteger(0, 8388627);
        this.f937n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f942s = dimensionPixelOffset;
        this.f941r = dimensionPixelOffset;
        this.f940q = dimensionPixelOffset;
        this.f939p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f939p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f940q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f941r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f942s = dimensionPixelOffset5;
        }
        this.f938o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        P0 p02 = this.f943t;
        p02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            p02.f1826e = dimensionPixelSize;
            p02.f1822a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            p02.f1827f = dimensionPixelSize2;
            p02.f1823b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            p02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f944u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f945v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f930f = hVarP.j(4);
        this.f931g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f933j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableJ = hVarP.j(16);
        if (drawableJ != null) {
            setNavigationIcon(drawableJ);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableJ2 = hVarP.j(11);
        if (drawableJ2 != null) {
            setLogo(drawableJ2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(hVarP.i(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(hVarP.i(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        hVarP.r();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0127i(getContext());
    }

    public static a1 h() {
        a1 a1Var = new a1(-2, -2);
        a1Var.f1878b = 0;
        a1Var.f1877a = 8388627;
        return a1Var;
    }

    public static a1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof a1;
        if (z2) {
            a1 a1Var = (a1) layoutParams;
            a1 a1Var2 = new a1(a1Var);
            a1Var2.f1878b = 0;
            a1Var2.f1878b = a1Var.f1878b;
            return a1Var2;
        }
        if (z2) {
            a1 a1Var3 = new a1((a1) layoutParams);
            a1Var3.f1878b = 0;
            return a1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            a1 a1Var4 = new a1(layoutParams);
            a1Var4.f1878b = 0;
            return a1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        a1 a1Var5 = new a1(marginLayoutParams);
        a1Var5.f1878b = 0;
        ((ViewGroup.MarginLayoutParams) a1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) a1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) a1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) a1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return a1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                a1 a1Var = (a1) childAt.getLayoutParams();
                if (a1Var.f1878b == 0 && t(childAt)) {
                    int i4 = a1Var.f1877a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            a1 a1Var2 = (a1) childAt2.getLayoutParams();
            if (a1Var2.f1878b == 0 && t(childAt2)) {
                int i6 = a1Var2.f1877a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a1 a1VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (a1) layoutParams;
        a1VarH.f1878b = 1;
        if (!z2 || this.f932i == null) {
            addView(view, a1VarH);
        } else {
            view.setLayoutParams(a1VarH);
            this.f909E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0211y c0211y = new C0211y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0211y;
            c0211y.setImageDrawable(this.f930f);
            this.h.setContentDescription(this.f931g);
            a1 a1VarH = h();
            a1VarH.f1877a = (this.f937n & 112) | 8388611;
            a1VarH.f1878b = 2;
            this.h.setLayoutParams(a1VarH);
            this.h.setOnClickListener(new q(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a1);
    }

    public final void d() {
        if (this.f943t == null) {
            P0 p02 = new P0();
            p02.f1822a = 0;
            p02.f1823b = 0;
            p02.f1824c = Integer.MIN_VALUE;
            p02.f1825d = Integer.MIN_VALUE;
            p02.f1826e = 0;
            p02.f1827f = 0;
            p02.f1828g = false;
            p02.h = false;
            this.f943t = p02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f925a;
        if (actionMenuView.f881p == null) {
            n nVar = (n) actionMenuView.getMenu();
            if (this.f917M == null) {
                this.f917M = new Z0(this);
            }
            this.f925a.setExpandedActionViewsExclusive(true);
            nVar.b(this.f917M, this.f933j);
            v();
        }
    }

    public final void f() {
        if (this.f925a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f925a = actionMenuView;
            actionMenuView.setPopupTheme(this.f934k);
            this.f925a.setOnMenuItemClickListener(this.f914J);
            ActionMenuView actionMenuView2 = this.f925a;
            J j2 = this.f918N;
            X0 x02 = new X0(this);
            actionMenuView2.f886u = j2;
            actionMenuView2.f887v = x02;
            a1 a1VarH = h();
            a1VarH.f1877a = (this.f937n & 112) | 8388613;
            this.f925a.setLayoutParams(a1VarH);
            b(this.f925a, false);
        }
    }

    public final void g() {
        if (this.f928d == null) {
            this.f928d = new C0211y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            a1 a1VarH = h();
            a1VarH.f1877a = (this.f937n & 112) | 8388611;
            this.f928d.setLayoutParams(a1VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0211y c0211y = this.h;
        if (c0211y != null) {
            return c0211y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0211y c0211y = this.h;
        if (c0211y != null) {
            return c0211y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        P0 p02 = this.f943t;
        if (p02 != null) {
            return p02.f1828g ? p02.f1822a : p02.f1823b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f945v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        P0 p02 = this.f943t;
        if (p02 != null) {
            return p02.f1822a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        P0 p02 = this.f943t;
        if (p02 != null) {
            return p02.f1823b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        P0 p02 = this.f943t;
        if (p02 != null) {
            return p02.f1828g ? p02.f1823b : p02.f1822a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f944u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        n nVar;
        ActionMenuView actionMenuView = this.f925a;
        return (actionMenuView == null || (nVar = actionMenuView.f881p) == null || !nVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f945v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f944u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0153A c0153a = this.f929e;
        if (c0153a != null) {
            return c0153a.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0153A c0153a = this.f929e;
        if (c0153a != null) {
            return c0153a.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f925a.getMenu();
    }

    public View getNavButtonView() {
        return this.f928d;
    }

    public CharSequence getNavigationContentDescription() {
        C0211y c0211y = this.f928d;
        if (c0211y != null) {
            return c0211y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0211y c0211y = this.f928d;
        if (c0211y != null) {
            return c0211y.getDrawable();
        }
        return null;
    }

    public C0184k getOuterActionMenuPresenter() {
        return this.f916L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f925a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f933j;
    }

    public int getPopupTheme() {
        return this.f934k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.f927c;
    }

    public CharSequence getTitle() {
        return this.f947x;
    }

    public int getTitleMarginBottom() {
        return this.f942s;
    }

    public int getTitleMarginEnd() {
        return this.f940q;
    }

    public int getTitleMarginStart() {
        return this.f939p;
    }

    public int getTitleMarginTop() {
        return this.f941r;
    }

    public final TextView getTitleTextView() {
        return this.f926b;
    }

    public InterfaceC0189m0 getWrapper() {
        if (this.f915K == null) {
            this.f915K = new e1(this, true);
        }
        return this.f915K;
    }

    public final int j(View view, int i2) {
        a1 a1Var = (a1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = a1Var.f1877a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f946w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.f912H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        this.f911G.a();
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f912H = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f909E.contains(view);
    }

    public final boolean o() {
        C0184k c0184k;
        ActionMenuView actionMenuView = this.f925a;
        return (actionMenuView == null || (c0184k = actionMenuView.f885t) == null || !c0184k.i()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f924T);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f907C = false;
        }
        if (!this.f907C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f907C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f907C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iP;
        int iQ;
        boolean zT;
        boolean zT2;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int paddingTop;
        int i12;
        int i13;
        int i14;
        int i15;
        int size;
        int iP2;
        int i16;
        int size2;
        int i17;
        int size3;
        int i18;
        int i19;
        int i20;
        int size4;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i21 = width - paddingRight;
        int[] iArr = this.f910F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = N.f327a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (!t(this.f928d)) {
            iP = paddingLeft;
        } else {
            if (z4) {
                iQ = q(this.f928d, i21, iMin, iArr);
                iP = paddingLeft;
                if (t(this.h)) {
                    if (z4) {
                        iQ = q(this.h, iQ, iMin, iArr);
                    } else {
                        iP = p(this.h, iP, iMin, iArr);
                    }
                }
                if (t(this.f925a)) {
                    if (z4) {
                        iP = p(this.f925a, iP, iMin, iArr);
                    } else {
                        iQ = q(this.f925a, iQ, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iP);
                iArr[1] = Math.max(0, currentContentInsetRight - (i21 - iQ));
                int iMax = Math.max(iP, currentContentInsetLeft);
                int iMin2 = Math.min(iQ, i21 - currentContentInsetRight);
                if (t(this.f932i)) {
                    if (z4) {
                        iMin2 = q(this.f932i, iMin2, iMin, iArr);
                    } else {
                        iMax = p(this.f932i, iMax, iMin, iArr);
                    }
                }
                if (t(this.f929e)) {
                    if (z4) {
                        iMin2 = q(this.f929e, iMin2, iMin, iArr);
                    } else {
                        iMax = p(this.f929e, iMax, iMin, iArr);
                    }
                }
                zT = t(this.f926b);
                zT2 = t(this.f927c);
                if (zT) {
                    i6 = paddingRight;
                    measuredHeight = 0;
                } else {
                    a1 a1Var = (a1) this.f926b.getLayoutParams();
                    i6 = paddingRight;
                    measuredHeight = ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin + this.f926b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin;
                }
                if (zT2) {
                    i7 = width;
                } else {
                    a1 a1Var2 = (a1) this.f927c.getLayoutParams();
                    i7 = width;
                    measuredHeight += this.f927c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) a1Var2).topMargin + ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin;
                }
                if (!zT || zT2) {
                    C0171d0 c0171d0 = !zT ? this.f926b : this.f927c;
                    C0171d0 c0171d02 = !zT2 ? this.f927c : this.f926b;
                    a1 a1Var3 = (a1) c0171d0.getLayoutParams();
                    a1 a1Var4 = (a1) c0171d02.getLayoutParams();
                    if ((zT || this.f926b.getMeasuredWidth() <= 0) && (!zT2 || this.f927c.getMeasuredWidth() <= 0)) {
                        i8 = paddingLeft;
                        z3 = false;
                    } else {
                        i8 = paddingLeft;
                        z3 = true;
                    }
                    i9 = this.f946w & 112;
                    i10 = iMin;
                    if (i9 == 48) {
                        i11 = iMax;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) a1Var3).topMargin + this.f941r;
                    } else if (i9 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        i11 = iMax;
                        int i22 = ((ViewGroup.MarginLayoutParams) a1Var3).topMargin + this.f941r;
                        if (iMax2 < i22) {
                            iMax2 = i22;
                        } else {
                            int i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                            int i24 = ((ViewGroup.MarginLayoutParams) a1Var3).bottomMargin;
                            int i25 = this.f942s;
                            if (i23 < i24 + i25) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin + i25) - i23));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        i11 = iMax;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) a1Var4).bottomMargin) - this.f942s) - measuredHeight;
                    }
                    if (z4) {
                        int i26 = (z3 ? this.f939p : 0) - iArr[1];
                        iMin2 -= Math.max(0, i26);
                        iArr[1] = Math.max(0, -i26);
                        if (zT) {
                            a1 a1Var5 = (a1) this.f926b.getLayoutParams();
                            int measuredWidth = iMin2 - this.f926b.getMeasuredWidth();
                            int measuredHeight2 = this.f926b.getMeasuredHeight() + paddingTop;
                            this.f926b.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i14 = measuredWidth - this.f940q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) a1Var5).bottomMargin;
                        } else {
                            i14 = iMin2;
                        }
                        if (zT2) {
                            int i27 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a1) this.f927c.getLayoutParams())).topMargin;
                            this.f927c.layout(iMin2 - this.f927c.getMeasuredWidth(), i27, iMin2, this.f927c.getMeasuredHeight() + i27);
                            i15 = iMin2 - this.f940q;
                        } else {
                            i15 = iMin2;
                        }
                        if (z3) {
                            iMin2 = Math.min(i14, i15);
                        }
                        iMax = i11;
                    } else {
                        int i28 = (z3 ? this.f939p : 0) - iArr[0];
                        iMax = Math.max(0, i28) + i11;
                        iArr[0] = Math.max(0, -i28);
                        if (zT) {
                            a1 a1Var6 = (a1) this.f926b.getLayoutParams();
                            int measuredWidth2 = this.f926b.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f926b.getMeasuredHeight() + paddingTop;
                            this.f926b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i12 = measuredWidth2 + this.f940q;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) a1Var6).bottomMargin;
                        } else {
                            i12 = iMax;
                        }
                        if (zT2) {
                            int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((a1) this.f927c.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f927c.getMeasuredWidth() + iMax;
                            this.f927c.layout(iMax, i29, measuredWidth3, this.f927c.getMeasuredHeight() + i29);
                            i13 = measuredWidth3 + this.f940q;
                        } else {
                            i13 = iMax;
                        }
                        if (z3) {
                            iMax = Math.max(i12, i13);
                        }
                    }
                } else {
                    i8 = paddingLeft;
                    i10 = iMin;
                }
                ArrayList arrayList = this.f908D;
                a(arrayList, 3);
                size = arrayList.size();
                iP2 = iMax;
                for (i16 = 0; i16 < size; i16++) {
                    iP2 = p((View) arrayList.get(i16), iP2, i10, iArr);
                }
                int i30 = i10;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i17 = 0; i17 < size2; i17++) {
                    iMin2 = q((View) arrayList.get(i17), iMin2, i30, iArr);
                }
                a(arrayList, 1);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i32;
                int i34 = i31;
                i18 = 0;
                int measuredWidth4 = 0;
                while (i18 < size3) {
                    View view = (View) arrayList.get(i18);
                    a1 a1Var7 = (a1) view.getLayoutParams();
                    int i35 = ((ViewGroup.MarginLayoutParams) a1Var7).leftMargin - i34;
                    int i36 = ((ViewGroup.MarginLayoutParams) a1Var7).rightMargin - i33;
                    int iMax3 = Math.max(0, i35);
                    int iMax4 = Math.max(0, i36);
                    int iMax5 = Math.max(0, -i35);
                    int iMax6 = Math.max(0, -i36);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i18++;
                    i33 = iMax6;
                    i34 = iMax5;
                }
                i20 = ((((i7 - i8) - i6) / 2) + i8) - (measuredWidth4 / 2);
                int i37 = measuredWidth4 + i20;
                if (i20 >= iP2) {
                    iP2 = i37 > iMin2 ? i20 - (i37 - iMin2) : i20;
                }
                size4 = arrayList.size();
                for (i19 = 0; i19 < size4; i19++) {
                    iP2 = p((View) arrayList.get(i19), iP2, i30, iArr);
                }
                arrayList.clear();
            }
            iP = p(this.f928d, paddingLeft, iMin, iArr);
        }
        iQ = i21;
        if (t(this.h)) {
        }
        if (t(this.f925a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i21 - iQ));
        int iMax7 = Math.max(iP, currentContentInsetLeft2);
        int iMin22 = Math.min(iQ, i21 - currentContentInsetRight2);
        if (t(this.f932i)) {
        }
        if (t(this.f929e)) {
        }
        zT = t(this.f926b);
        zT2 = t(this.f927c);
        if (zT) {
        }
        if (zT2) {
        }
        if (zT) {
            if (!zT) {
            }
            if (!zT2) {
            }
            a1 a1Var32 = (a1) c0171d0.getLayoutParams();
            a1 a1Var42 = (a1) c0171d02.getLayoutParams();
            if (zT) {
                i8 = paddingLeft;
                z3 = false;
                i9 = this.f946w & 112;
                i10 = iMin;
                if (i9 == 48) {
                }
                if (z4) {
                }
            } else {
                i8 = paddingLeft;
                z3 = false;
                i9 = this.f946w & 112;
                i10 = iMin;
                if (i9 == 48) {
                }
                if (z4) {
                }
            }
        }
        ArrayList arrayList2 = this.f908D;
        a(arrayList2, 3);
        size = arrayList2.size();
        iP2 = iMax7;
        while (i16 < size) {
        }
        int i302 = i10;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i17 < size2) {
        }
        a(arrayList2, 1);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i322;
        int i342 = i312;
        i18 = 0;
        int measuredWidth42 = 0;
        while (i18 < size3) {
        }
        i20 = ((((i7 - i8) - i6) / 2) + i8) - (measuredWidth42 / 2);
        int i372 = measuredWidth42 + i20;
        if (i20 >= iP2) {
        }
        size4 = arrayList2.size();
        while (i19 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z2 = m1.f1979a;
        int i4 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.f928d)) {
            s(this.f928d, i2, 0, i3, this.f938o);
            iK = k(this.f928d) + this.f928d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f928d) + this.f928d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f928d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.h)) {
            s(this.h, i2, 0, i3, this.f938o);
            iK = k(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.f910F;
        iArr[c3] = iMax4;
        if (t(this.f925a)) {
            s(this.f925a, i2, iMax3, i3, this.f938o);
            iK2 = k(this.f925a) + this.f925a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f925a) + this.f925a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f925a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.f932i)) {
            iMax5 += r(this.f932i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, l(this.f932i) + this.f932i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f932i.getMeasuredState());
        }
        if (t(this.f929e)) {
            iMax5 += r(this.f929e, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, l(this.f929e) + this.f929e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f929e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((a1) childAt.getLayoutParams()).f1878b == 0 && t(childAt)) {
                iMax5 += r(childAt, i2, iMax5, i3, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i6 = this.f941r + this.f942s;
        int i7 = this.f939p + this.f940q;
        if (t(this.f926b)) {
            r(this.f926b, i2, iMax5 + i7, i3, i6, iArr);
            int iK3 = k(this.f926b) + this.f926b.getMeasuredWidth();
            iL = l(this.f926b) + this.f926b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f926b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f927c)) {
            iMax2 = Math.max(iMax2, r(this.f927c, i2, iMax5 + i7, i3, iL + i6, iArr));
            iL = l(this.f927c) + this.f927c.getMeasuredHeight() + iL;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f927c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f920P) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof c1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c1 c1Var = (c1) parcelable;
        super.onRestoreInstanceState(c1Var.f517a);
        ActionMenuView actionMenuView = this.f925a;
        n nVar = actionMenuView != null ? actionMenuView.f881p : null;
        int i2 = c1Var.f1884c;
        if (i2 != 0 && this.f917M != null && nVar != null && (menuItemFindItem = nVar.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1Var.f1885d) {
            b bVar = this.f924T;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        P0 p02 = this.f943t;
        boolean z2 = i2 == 1;
        if (z2 == p02.f1828g) {
            return;
        }
        p02.f1828g = z2;
        if (!p02.h) {
            p02.f1822a = p02.f1826e;
            p02.f1823b = p02.f1827f;
            return;
        }
        if (z2) {
            int i3 = p02.f1825d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = p02.f1826e;
            }
            p02.f1822a = i3;
            int i4 = p02.f1824c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = p02.f1827f;
            }
            p02.f1823b = i4;
            return;
        }
        int i5 = p02.f1824c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = p02.f1826e;
        }
        p02.f1822a = i5;
        int i6 = p02.f1825d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = p02.f1827f;
        }
        p02.f1823b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar;
        c1 c1Var = new c1(super.onSaveInstanceState());
        Z0 z02 = this.f917M;
        if (z02 != null && (pVar = z02.f1872b) != null) {
            c1Var.f1884c = pVar.f1687a;
        }
        c1Var.f1885d = o();
        return c1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f906B = false;
        }
        if (!this.f906B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f906B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f906B = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i3, int[] iArr) {
        a1 a1Var = (a1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) a1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int iJ = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin + iMax;
    }

    public final int q(View view, int i2, int i3, int[] iArr) {
        a1 a1Var = (a1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) a1Var).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iJ = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin);
    }

    public final int r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f923S != z2) {
            this.f923S = z2;
            v();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(d.v(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f920P = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f945v) {
            this.f945v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f944u) {
            this.f944u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(d.v(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(d.v(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f928d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(b1 b1Var) {
        this.f913I = b1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f925a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f934k != i2) {
            this.f934k = i2;
            if (i2 == 0) {
                this.f933j = getContext();
            } else {
                this.f933j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f942s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f940q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f939p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f941r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        C0184k c0184k;
        ActionMenuView actionMenuView = this.f925a;
        return (actionMenuView == null || (c0184k = actionMenuView.f885t) == null || !c0184k.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = Y0.a(this);
            Z0 z02 = this.f917M;
            boolean z2 = (z02 == null || z02.f1872b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f923S) ? false : true;
            if (z2 && this.f922R == null) {
                if (this.f921Q == null) {
                    this.f921Q = Y0.b(new W0(this, 0));
                }
                Y0.c(onBackInvokedDispatcherA, this.f921Q);
                this.f922R = onBackInvokedDispatcherA;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f922R) == null) {
                return;
            }
            Y0.d(onBackInvokedDispatcher, this.f921Q);
            this.f922R = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a1 a1Var = new a1(context, attributeSet);
        a1Var.f1877a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0101a.f1263b);
        a1Var.f1877a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        a1Var.f1878b = 0;
        return a1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0211y c0211y = this.h;
        if (c0211y != null) {
            c0211y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0211y c0211y = this.h;
            if (c0211y != null) {
                c0211y.setImageDrawable(this.f930f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f929e == null) {
                this.f929e = new C0153A(getContext(), null, 0);
            }
            if (!n(this.f929e)) {
                b(this.f929e, true);
            }
        } else {
            C0153A c0153a = this.f929e;
            if (c0153a != null && n(c0153a)) {
                removeView(this.f929e);
                this.f909E.remove(this.f929e);
            }
        }
        C0153A c0153a2 = this.f929e;
        if (c0153a2 != null) {
            c0153a2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f929e == null) {
            this.f929e = new C0153A(getContext(), null, 0);
        }
        C0153A c0153a = this.f929e;
        if (c0153a != null) {
            c0153a.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0211y c0211y = this.f928d;
        if (c0211y != null) {
            c0211y.setContentDescription(charSequence);
            d.H(this.f928d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f928d)) {
                b(this.f928d, true);
            }
        } else {
            C0211y c0211y = this.f928d;
            if (c0211y != null && n(c0211y)) {
                removeView(this.f928d);
                this.f909E.remove(this.f928d);
            }
        }
        C0211y c0211y2 = this.f928d;
        if (c0211y2 != null) {
            c0211y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0171d0 c0171d0 = this.f927c;
            if (c0171d0 != null && n(c0171d0)) {
                removeView(this.f927c);
                this.f909E.remove(this.f927c);
            }
        } else {
            if (this.f927c == null) {
                Context context = getContext();
                C0171d0 c0171d02 = new C0171d0(context, null);
                this.f927c = c0171d02;
                c0171d02.setSingleLine();
                this.f927c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f936m;
                if (i2 != 0) {
                    this.f927c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f905A;
                if (colorStateList != null) {
                    this.f927c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f927c)) {
                b(this.f927c, true);
            }
        }
        C0171d0 c0171d03 = this.f927c;
        if (c0171d03 != null) {
            c0171d03.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f905A = colorStateList;
        C0171d0 c0171d0 = this.f927c;
        if (c0171d0 != null) {
            c0171d0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0171d0 c0171d0 = this.f926b;
            if (c0171d0 != null && n(c0171d0)) {
                removeView(this.f926b);
                this.f909E.remove(this.f926b);
            }
        } else {
            if (this.f926b == null) {
                Context context = getContext();
                C0171d0 c0171d02 = new C0171d0(context, null);
                this.f926b = c0171d02;
                c0171d02.setSingleLine();
                this.f926b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f935l;
                if (i2 != 0) {
                    this.f926b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f948z;
                if (colorStateList != null) {
                    this.f926b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f926b)) {
                b(this.f926b, true);
            }
        }
        C0171d0 c0171d03 = this.f926b;
        if (c0171d03 != null) {
            c0171d03.setText(charSequence);
        }
        this.f947x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f948z = colorStateList;
        C0171d0 c0171d0 = this.f926b;
        if (c0171d0 != null) {
            c0171d0.setTextColor(colorStateList);
        }
    }
}
