package g;

import H.InterfaceC0017k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC0068o;
import androidx.lifecycle.EnumC0066m;
import androidx.lifecycle.InterfaceC0072t;
import i.AbstractC0120b;
import i.InterfaceC0119a;
import j0.AbstractC0150d;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import org.conscrypt.R;

/* renamed from: g.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC0110h extends Dialog implements DialogInterface, InterfaceC0113k, InterfaceC0072t, U.g {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.v f1447a;

    /* renamed from: b, reason: collision with root package name */
    public final U.f f1448b;

    /* renamed from: c, reason: collision with root package name */
    public final a.v f1449c;

    /* renamed from: d, reason: collision with root package name */
    public C f1450d;

    /* renamed from: e, reason: collision with root package name */
    public final D f1451e;

    /* renamed from: f, reason: collision with root package name */
    public final C0109g f1452f;

    /* JADX WARN: Type inference failed for: r2v4, types: [g.D] */
    public DialogC0110h(ContextThemeWrapper contextThemeWrapper, int i2) {
        int i3;
        int iH = h(contextThemeWrapper, i2);
        if (iH == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i3 = typedValue.resourceId;
        } else {
            i3 = iH;
        }
        super(contextThemeWrapper, i3);
        this.f1448b = new U.f(this);
        this.f1449c = new a.v(new M.r(3, this));
        this.f1451e = new InterfaceC0017k() { // from class: g.D
            @Override // H.InterfaceC0017k
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f1353a.j(keyEvent);
            }
        };
        AbstractC0118p abstractC0118pB = b();
        if (iH == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iH = typedValue2.resourceId;
        }
        ((C) abstractC0118pB).f1324T = iH;
        abstractC0118pB.d();
        this.f1452f = new C0109g(getContext(), this, getWindow());
    }

    public static void a(DialogC0110h dialogC0110h) {
        super.onBackPressed();
    }

    public static int h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C c2 = (C) b();
        c2.x();
        ((ViewGroup) c2.f1305A.findViewById(android.R.id.content)).addView(view, layoutParams);
        c2.f1340m.a(c2.f1339l.getCallback());
    }

    public final AbstractC0118p b() {
        if (this.f1450d == null) {
            ExecutorC0116n executorC0116n = AbstractC0118p.f1458a;
            this.f1450d = new C(getContext(), getWindow(), this, this);
        }
        return this.f1450d;
    }

    public final androidx.lifecycle.v c() {
        androidx.lifecycle.v vVar = this.f1447a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f1447a = vVar2;
        return vVar2;
    }

    public final void d() {
        View decorView = getWindow().getDecorView();
        AbstractC0150d.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0150d.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0150d.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0.m.h(this.f1451e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0150d.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            a.v vVar = this.f1449c;
            vVar.f783e = onBackInvokedDispatcher;
            vVar.c(vVar.f785g);
        }
        this.f1448b.b(bundle);
        c().e(EnumC0066m.ON_CREATE);
    }

    public final void f(Bundle bundle) {
        b().a();
        e(bundle);
        b().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C c2 = (C) b();
        c2.x();
        return c2.f1339l.findViewById(i2);
    }

    public final void g() {
        c().e(EnumC0066m.ON_DESTROY);
        this.f1447a = null;
        super.onStop();
    }

    @Override // androidx.lifecycle.InterfaceC0072t
    public final AbstractC0068o getLifecycle() {
        return c();
    }

    @Override // U.g
    public final U.e getSavedStateRegistry() {
        return this.f1448b.f672b;
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().l(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().b();
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1449c.b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        f(bundle);
        C0109g c0109g = this.f1452f;
        c0109g.f1426b.setContentView(c0109g.f1440q);
        Window window = c0109g.f1427c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = C0109g.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = C0109g.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = C0109g.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0109g.f1432i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0109g.f1432i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        c0109g.f1436m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0109g.f1432i.removeView(c0109g.f1436m);
            if (c0109g.f1429e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0109g.f1432i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c0109g.f1432i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c0109g.f1429e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        c0109g.f1430f = button;
        Z.q qVar = c0109g.f1446w;
        button.setOnClickListener(qVar);
        if (TextUtils.isEmpty(null)) {
            c0109g.f1430f.setVisibility(8);
            i2 = 0;
        } else {
            c0109g.f1430f.setText((CharSequence) null);
            c0109g.f1430f.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        c0109g.f1431g = button2;
        button2.setOnClickListener(qVar);
        if (TextUtils.isEmpty(null)) {
            c0109g.f1431g.setVisibility(8);
        } else {
            c0109g.f1431g.setText((CharSequence) null);
            c0109g.f1431g.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        c0109g.h = button3;
        button3.setOnClickListener(qVar);
        if (TextUtils.isEmpty(null)) {
            c0109g.h.setVisibility(8);
        } else {
            c0109g.h.setText((CharSequence) null);
            c0109g.h.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0109g.f1425a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = c0109g.f1430f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = c0109g.f1431g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = c0109g.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (c0109g.f1437n != null) {
            viewGroupA.addView(c0109g.f1437n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0109g.f1434k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0109g.f1428d) || !c0109g.f1444u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0109g.f1434k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0109g.f1435l = textView2;
                textView2.setText(c0109g.f1428d);
                Drawable drawable = c0109g.f1433j;
                if (drawable != null) {
                    c0109g.f1434k.setImageDrawable(drawable);
                } else {
                    c0109g.f1435l.setPadding(c0109g.f1434k.getPaddingLeft(), c0109g.f1434k.getPaddingTop(), c0109g.f1434k.getPaddingRight(), c0109g.f1434k.getPaddingBottom());
                    c0109g.f1434k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupA3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c0109g.f1432i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c0109g.f1429e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0109g.f1429e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f794a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f795b);
            }
        }
        if (!z2) {
            View view = c0109g.f1429e;
            if (view == null) {
                view = c0109g.f1432i;
            }
            if (view != null) {
                int i4 = (z3 ? 2 : 0) | i3;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = H.N.f327a;
                H.H.b(view, i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0109g.f1429e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0109g.f1438o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = c0109g.f1439p;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1452f.f1432i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1452f.f1432i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC0150d.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f1448b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().e(EnumC0066m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        g();
        C c2 = (C) b();
        c2.B();
        AbstractC0103a abstractC0103a = c2.f1342o;
        if (abstractC0103a != null) {
            abstractC0103a.m(false);
        }
    }

    @Override // g.InterfaceC0113k
    public final AbstractC0120b onWindowStartingSupportActionMode(InterfaceC0119a interfaceC0119a) {
        return null;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i2) {
        d();
        b().h(i2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        b().l(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        d();
        b().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        C0109g c0109g = this.f1452f;
        c0109g.f1428d = charSequence;
        TextView textView = c0109g.f1435l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        b().j(view, layoutParams);
    }

    @Override // g.InterfaceC0113k
    public final void onSupportActionModeFinished(AbstractC0120b abstractC0120b) {
    }

    @Override // g.InterfaceC0113k
    public final void onSupportActionModeStarted(AbstractC0120b abstractC0120b) {
    }
}
