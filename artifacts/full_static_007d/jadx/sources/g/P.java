package g;

import H.S;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import f.AbstractC0101a;
import i.AbstractC0120b;
import i.C0128j;
import i.C0129k;
import i.InterfaceC0119a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.InterfaceC0170d;
import k.InterfaceC0189m0;
import k.Z0;
import k.e1;

/* loaded from: classes.dex */
public final class P extends AbstractC0103a implements InterfaceC0170d {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f1389z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f1390a;

    /* renamed from: b, reason: collision with root package name */
    public Context f1391b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f1392c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1393d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0189m0 f1394e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f1395f;

    /* renamed from: g, reason: collision with root package name */
    public final View f1396g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public O f1397i;

    /* renamed from: j, reason: collision with root package name */
    public O f1398j;

    /* renamed from: k, reason: collision with root package name */
    public E.c f1399k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1400l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1401m;

    /* renamed from: n, reason: collision with root package name */
    public int f1402n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1403o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1404p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1405q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1406r;

    /* renamed from: s, reason: collision with root package name */
    public C0129k f1407s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1408t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1409u;

    /* renamed from: v, reason: collision with root package name */
    public final N f1410v;

    /* renamed from: w, reason: collision with root package name */
    public final N f1411w;

    /* renamed from: x, reason: collision with root package name */
    public final A.f f1412x;

    public P(Activity activity, boolean z2) {
        new ArrayList();
        this.f1401m = new ArrayList();
        this.f1402n = 0;
        this.f1403o = true;
        this.f1406r = true;
        this.f1410v = new N(this, 0);
        this.f1411w = new N(this, 1);
        this.f1412x = new A.f(21, this);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z2) {
            return;
        }
        this.f1396g = decorView.findViewById(R.id.content);
    }

    @Override // g.AbstractC0103a
    public final boolean b() {
        Z0 z02;
        InterfaceC0189m0 interfaceC0189m0 = this.f1394e;
        if (interfaceC0189m0 == null || (z02 = ((e1) interfaceC0189m0).f1895a.f917M) == null || z02.f1872b == null) {
            return false;
        }
        Z0 z03 = ((e1) interfaceC0189m0).f1895a.f917M;
        j.p pVar = z03 == null ? null : z03.f1872b;
        if (pVar == null) {
            return true;
        }
        pVar.collapseActionView();
        return true;
    }

    @Override // g.AbstractC0103a
    public final void c(boolean z2) {
        if (z2 == this.f1400l) {
            return;
        }
        this.f1400l = z2;
        ArrayList arrayList = this.f1401m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // g.AbstractC0103a
    public final int d() {
        return ((e1) this.f1394e).f1896b;
    }

    @Override // g.AbstractC0103a
    public final Context e() {
        if (this.f1391b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1390a.getTheme().resolveAttribute(org.conscrypt.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1391b = new ContextThemeWrapper(this.f1390a, i2);
            } else {
                this.f1391b = this.f1390a;
            }
        }
        return this.f1391b;
    }

    @Override // g.AbstractC0103a
    public final void g() {
        r(this.f1390a.getResources().getBoolean(org.conscrypt.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // g.AbstractC0103a
    public final boolean i(int i2, KeyEvent keyEvent) {
        j.n nVar;
        O o2 = this.f1397i;
        if (o2 == null || (nVar = o2.f1385d) == null) {
            return false;
        }
        nVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return nVar.performShortcut(i2, keyEvent, 0);
    }

    @Override // g.AbstractC0103a
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        e1 e1Var = (e1) this.f1394e;
        int i3 = e1Var.f1896b;
        this.h = true;
        e1Var.a((i2 & 4) | (i3 & (-5)));
    }

    @Override // g.AbstractC0103a
    public final void m(boolean z2) {
        C0129k c0129k;
        this.f1408t = z2;
        if (z2 || (c0129k = this.f1407s) == null) {
            return;
        }
        c0129k.a();
    }

    @Override // g.AbstractC0103a
    public final void n(CharSequence charSequence) {
        e1 e1Var = (e1) this.f1394e;
        if (e1Var.f1901g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f1896b & 8) != 0) {
            Toolbar toolbar = e1Var.f1895a;
            toolbar.setTitle(charSequence);
            if (e1Var.f1901g) {
                H.N.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // g.AbstractC0103a
    public final AbstractC0120b o(E.c cVar) {
        O o2 = this.f1397i;
        if (o2 != null) {
            o2.a();
        }
        this.f1392c.setHideOnContentScrollEnabled(false);
        this.f1395f.e();
        O o3 = new O(this, this.f1395f.getContext(), cVar);
        j.n nVar = o3.f1385d;
        nVar.w();
        try {
            if (!((InterfaceC0119a) o3.f1386e.f271b).c(o3, nVar)) {
                return null;
            }
            this.f1397i = o3;
            o3.g();
            this.f1395f.c(o3);
            p(true);
            return o3;
        } finally {
            nVar.v();
        }
    }

    public final void p(boolean z2) {
        S sI;
        S sI2;
        if (z2) {
            if (!this.f1405q) {
                this.f1405q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1392c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (this.f1405q) {
            this.f1405q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1392c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        if (!this.f1393d.isLaidOut()) {
            if (z2) {
                ((e1) this.f1394e).f1895a.setVisibility(4);
                this.f1395f.setVisibility(0);
                return;
            } else {
                ((e1) this.f1394e).f1895a.setVisibility(0);
                this.f1395f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            e1 e1Var = (e1) this.f1394e;
            sI = H.N.a(e1Var.f1895a);
            sI.a(0.0f);
            sI.c(100L);
            sI.d(new C0128j(e1Var, 4));
            sI2 = this.f1395f.i(200L, 0);
        } else {
            e1 e1Var2 = (e1) this.f1394e;
            S sA = H.N.a(e1Var2.f1895a);
            sA.a(1.0f);
            sA.c(200L);
            sA.d(new C0128j(e1Var2, 0));
            sI = this.f1395f.i(100L, 8);
            sI2 = sA;
        }
        C0129k c0129k = new C0129k();
        ArrayList arrayList = c0129k.f1566a;
        arrayList.add(sI);
        View view = (View) sI.f336a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) sI2.f336a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(sI2);
        c0129k.b();
    }

    public final void q(View view) {
        InterfaceC0189m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.conscrypt.R.id.decor_content_parent);
        this.f1392c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(org.conscrypt.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0189m0) {
            wrapper = (InterfaceC0189m0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f1394e = wrapper;
        this.f1395f = (ActionBarContextView) view.findViewById(org.conscrypt.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.conscrypt.R.id.action_bar_container);
        this.f1393d = actionBarContainer;
        InterfaceC0189m0 interfaceC0189m0 = this.f1394e;
        if (interfaceC0189m0 == null || this.f1395f == null || actionBarContainer == null) {
            throw new IllegalStateException(P.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((e1) interfaceC0189m0).f1895a.getContext();
        this.f1390a = context;
        if ((((e1) this.f1394e).f1896b & 4) != 0) {
            this.h = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f1394e.getClass();
        r(context.getResources().getBoolean(org.conscrypt.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f1390a.obtainStyledAttributes(null, AbstractC0101a.f1262a, org.conscrypt.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1392c;
            if (!actionBarOverlayLayout2.f862g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1409u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1393d;
            WeakHashMap weakHashMap = H.N.f327a;
            H.G.g(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void r(boolean z2) {
        if (z2) {
            this.f1393d.setTabContainer(null);
            ((e1) this.f1394e).getClass();
        } else {
            ((e1) this.f1394e).getClass();
            this.f1393d.setTabContainer(null);
        }
        this.f1394e.getClass();
        ((e1) this.f1394e).f1895a.setCollapsible(false);
        this.f1392c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z2) {
        boolean z3 = this.f1405q || !this.f1404p;
        View view = this.f1396g;
        final A.f fVar = this.f1412x;
        if (!z3) {
            if (this.f1406r) {
                this.f1406r = false;
                C0129k c0129k = this.f1407s;
                if (c0129k != null) {
                    c0129k.a();
                }
                int i2 = this.f1402n;
                N n2 = this.f1410v;
                if (i2 != 0 || (!this.f1408t && !z2)) {
                    n2.a();
                    return;
                }
                this.f1393d.setAlpha(1.0f);
                this.f1393d.setTransitioning(true);
                C0129k c0129k2 = new C0129k();
                float f2 = -this.f1393d.getHeight();
                if (z2) {
                    this.f1393d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                S sA = H.N.a(this.f1393d);
                sA.e(f2);
                final View view2 = (View) sA.f336a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(fVar != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: H.P
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((g.P) this.f333a.f8b).f1393d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = c0129k2.f1570e;
                ArrayList arrayList = c0129k2.f1566a;
                if (!z4) {
                    arrayList.add(sA);
                }
                if (this.f1403o && view != null) {
                    S sA2 = H.N.a(view);
                    sA2.e(f2);
                    if (!c0129k2.f1570e) {
                        arrayList.add(sA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = y;
                boolean z5 = c0129k2.f1570e;
                if (!z5) {
                    c0129k2.f1568c = accelerateInterpolator;
                }
                if (!z5) {
                    c0129k2.f1567b = 250L;
                }
                if (!z5) {
                    c0129k2.f1569d = n2;
                }
                this.f1407s = c0129k2;
                c0129k2.b();
                return;
            }
            return;
        }
        if (this.f1406r) {
            return;
        }
        this.f1406r = true;
        C0129k c0129k3 = this.f1407s;
        if (c0129k3 != null) {
            c0129k3.a();
        }
        this.f1393d.setVisibility(0);
        int i3 = this.f1402n;
        N n3 = this.f1411w;
        if (i3 == 0 && (this.f1408t || z2)) {
            this.f1393d.setTranslationY(0.0f);
            float f3 = -this.f1393d.getHeight();
            if (z2) {
                this.f1393d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f1393d.setTranslationY(f3);
            C0129k c0129k4 = new C0129k();
            S sA3 = H.N.a(this.f1393d);
            sA3.e(0.0f);
            final View view3 = (View) sA3.f336a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(fVar != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: H.P
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((g.P) this.f333a.f8b).f1393d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = c0129k4.f1570e;
            ArrayList arrayList2 = c0129k4.f1566a;
            if (!z6) {
                arrayList2.add(sA3);
            }
            if (this.f1403o && view != null) {
                view.setTranslationY(f3);
                S sA4 = H.N.a(view);
                sA4.e(0.0f);
                if (!c0129k4.f1570e) {
                    arrayList2.add(sA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f1389z;
            boolean z7 = c0129k4.f1570e;
            if (!z7) {
                c0129k4.f1568c = decelerateInterpolator;
            }
            if (!z7) {
                c0129k4.f1567b = 250L;
            }
            if (!z7) {
                c0129k4.f1569d = n3;
            }
            this.f1407s = c0129k4;
            c0129k4.b();
        } else {
            this.f1393d.setAlpha(1.0f);
            this.f1393d.setTranslationY(0.0f);
            if (this.f1403o && view != null) {
                view.setTranslationY(0.0f);
            }
            n3.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1392c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = H.N.f327a;
            H.E.c(actionBarOverlayLayout);
        }
    }

    public P(Dialog dialog) {
        new ArrayList();
        this.f1401m = new ArrayList();
        this.f1402n = 0;
        this.f1403o = true;
        this.f1406r = true;
        this.f1410v = new N(this, 0);
        this.f1411w = new N(this, 1);
        this.f1412x = new A.f(21, this);
        q(dialog.getWindow().getDecorView());
    }
}
