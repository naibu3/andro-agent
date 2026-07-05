package g;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import i.AbstractC0120b;
import i.C0122d;
import i.C0127i;
import i.InterfaceC0119a;
import j0.AbstractC0150d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.C0203u;
import k.N0;
import k.j1;
import z.AbstractC0257b;
import z.AbstractC0265j;

/* renamed from: g.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0112j extends androidx.fragment.app.i implements InterfaceC0113k, x.j {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0118p mDelegate;
    private Resources mResources;

    public AbstractActivityC0112j() {
        getSavedStateRegistry().c(DELEGATE_TAG, new U.a(this));
        addOnContextAvailableListener(new C0111i(this));
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        d();
        C c2 = (C) getDelegate();
        c2.x();
        ((ViewGroup) c2.f1305A.findViewById(R.id.content)).addView(view, layoutParams);
        c2.f1340m.a(c2.f1339l.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Method method;
        C c2 = (C) getDelegate();
        c2.f1319O = true;
        int i2 = c2.f1323S;
        if (i2 == -100) {
            i2 = AbstractC0118p.f1459b;
        }
        int iD = c2.D(context, i2);
        if (AbstractC0118p.c(context) && AbstractC0118p.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0118p.f1465i) {
                    try {
                        D.e eVar = AbstractC0118p.f1460c;
                        if (eVar == null) {
                            if (AbstractC0118p.f1461d == null) {
                                AbstractC0118p.f1461d = D.e.a(x.c.e(context));
                            }
                            if (!AbstractC0118p.f1461d.f240a.f241a.isEmpty()) {
                                AbstractC0118p.f1460c = AbstractC0118p.f1461d;
                            }
                        } else if (!eVar.equals(AbstractC0118p.f1461d)) {
                            D.e eVar2 = AbstractC0118p.f1460c;
                            AbstractC0118p.f1461d = eVar2;
                            x.c.d(context, eVar2.f240a.f241a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0118p.f1463f) {
                AbstractC0118p.f1458a.execute(new T.h(context, 2));
            }
        }
        D.e eVarQ = C.q(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(C.u(context, iD, eVarQ, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C0122d) {
            try {
                ((C0122d) context).a(C.u(context, iD, eVarQ, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (C.f1304j0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    int i7 = Build.VERSION.SDK_INT;
                    u.a(configuration3, configuration4, configuration);
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    if (i7 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i28 = configuration3.uiMode & 15;
                    int i29 = configuration4.uiMode & 15;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 48;
                    int i31 = configuration4.uiMode & 48;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.screenWidthDp;
                    int i33 = configuration4.screenWidthDp;
                    if (i32 != i33) {
                        configuration.screenWidthDp = i33;
                    }
                    int i34 = configuration3.screenHeightDp;
                    int i35 = configuration4.screenHeightDp;
                    if (i34 != i35) {
                        configuration.screenHeightDp = i35;
                    }
                    int i36 = configuration3.smallestScreenWidthDp;
                    int i37 = configuration4.smallestScreenWidthDp;
                    if (i36 != i37) {
                        configuration.smallestScreenWidthDp = i37;
                    }
                    int i38 = configuration3.densityDpi;
                    int i39 = configuration4.densityDpi;
                    if (i38 != i39) {
                        configuration.densityDpi = i39;
                    }
                }
            }
            Configuration configurationU = C.u(context, iD, eVarQ, configuration, true);
            C0122d c0122d = new C0122d(context, org.conscrypt.R.style.Theme_AppCompat_Empty);
            c0122d.a(configurationU);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0122d.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC0265j.a(theme);
                    } else {
                        synchronized (AbstractC0257b.f2934e) {
                            if (AbstractC0257b.f2936g) {
                                method = AbstractC0257b.f2935f;
                                if (method != null) {
                                }
                            } else {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC0257b.f2935f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                AbstractC0257b.f2936g = true;
                                method = AbstractC0257b.f2935f;
                                if (method != null) {
                                    try {
                                        method.invoke(theme, null);
                                    } catch (IllegalAccessException | InvocationTargetException e3) {
                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                        AbstractC0257b.f2935f = null;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0122d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC0103a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    public final void d() {
        View decorView = getWindow().getDecorView();
        AbstractC0150d.e(decorView, "<this>");
        decorView.setTag(org.conscrypt.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0150d.e(decorView2, "<this>");
        decorView2.setTag(org.conscrypt.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0150d.e(decorView3, "<this>");
        decorView3.setTag(org.conscrypt.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC0150d.e(decorView4, "<this>");
        decorView4.setTag(org.conscrypt.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // x.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0103a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C c2 = (C) getDelegate();
        c2.x();
        return (T) c2.f1339l.findViewById(i2);
    }

    public AbstractC0118p getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC0116n executorC0116n = AbstractC0118p.f1458a;
            this.mDelegate = new C(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0104b getDrawerToggleDelegate() {
        ((C) getDelegate()).getClass();
        return new A.m(19);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C c2 = (C) getDelegate();
        if (c2.f1343p == null) {
            c2.B();
            AbstractC0103a abstractC0103a = c2.f1342o;
            c2.f1343p = new C0127i(abstractC0103a != null ? abstractC0103a.e() : c2.f1338k);
        }
        return c2.f1343p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i2 = j1.f1950a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0103a getSupportActionBar() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C c2 = (C) getDelegate();
        c2.B();
        return c2.f1342o;
    }

    @Override // x.j
    public Intent getSupportParentActivityIntent() {
        return x.c.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // a.AbstractActivityC0046m, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        C c2 = (C) getDelegate();
        if (c2.f1310F && c2.f1352z) {
            c2.B();
            AbstractC0103a abstractC0103a = c2.f1342o;
            if (abstractC0103a != null) {
                abstractC0103a.g();
            }
        }
        C0203u c0203uA = C0203u.a();
        Context context = c2.f1338k;
        synchronized (c0203uA) {
            N0 n02 = c0203uA.f2031a;
            synchronized (n02) {
                n.h hVar = (n.h) n02.f1812b.get(context);
                if (hVar != null) {
                    int i2 = hVar.f2116d;
                    Object[] objArr = hVar.f2115c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        objArr[i3] = null;
                    }
                    hVar.f2116d = 0;
                    hVar.f2113a = false;
                }
            }
        }
        c2.f1322R = new Configuration(c2.f1338k.getResources().getConfiguration());
        c2.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(x.k kVar) {
        kVar.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = x.c.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AbstractActivityC0112j abstractActivityC0112j = kVar.f2835b;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC0112j.getPackageManager());
            }
            ArrayList arrayList = kVar.f2834a;
            int size = arrayList.size();
            try {
                for (Intent intentB = x.c.b(abstractActivityC0112j, component); intentB != null; intentB = x.c.b(abstractActivityC0112j, intentB.getComponent())) {
                    arrayList.add(size, intentB);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e2);
            }
        }
    }

    @Override // androidx.fragment.app.i, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.i, a.AbstractActivityC0046m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        AbstractC0103a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // a.AbstractActivityC0046m, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((C) getDelegate()).x();
    }

    @Override // androidx.fragment.app.i, android.app.Activity
    public void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        C c2 = (C) getDelegate();
        c2.B();
        AbstractC0103a abstractC0103a = c2.f1342o;
        if (abstractC0103a != null) {
            abstractC0103a.m(true);
        }
    }

    @Override // androidx.fragment.app.i, android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        ((C) getDelegate()).o(true, false);
    }

    @Override // androidx.fragment.app.i, android.app.Activity
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        C c2 = (C) getDelegate();
        c2.B();
        AbstractC0103a abstractC0103a = c2.f1342o;
        if (abstractC0103a != null) {
            abstractC0103a.m(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        x.k kVar = new x.k(this);
        onCreateSupportNavigateUpTaskStack(kVar);
        onPrepareSupportNavigateUpTaskStack(kVar);
        ArrayList arrayList = kVar.f2834a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        kVar.f2835b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        getDelegate().l(charSequence);
    }

    @Override // g.InterfaceC0113k
    public AbstractC0120b onWindowStartingSupportActionMode(InterfaceC0119a interfaceC0119a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC0103a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // a.AbstractActivityC0046m, android.app.Activity
    public void setContentView(int i2) {
        d();
        getDelegate().h(i2);
    }

    public void setSupportActionBar(Toolbar toolbar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C c2 = (C) getDelegate();
        if (c2.f1337j instanceof Activity) {
            c2.B();
            AbstractC0103a abstractC0103a = c2.f1342o;
            if (abstractC0103a instanceof P) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            c2.f1343p = null;
            if (abstractC0103a != null) {
                abstractC0103a.h();
            }
            c2.f1342o = null;
            if (toolbar != null) {
                Object obj = c2.f1337j;
                K k2 = new K(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : c2.f1344q, c2.f1340m);
                c2.f1342o = k2;
                c2.f1340m.f1473b = k2.f1371c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                c2.f1340m.f1473b = null;
            }
            c2.b();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        ((C) getDelegate()).f1324T = i2;
    }

    public AbstractC0120b startSupportActionMode(InterfaceC0119a interfaceC0119a) {
        return getDelegate().n(interfaceC0119a);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i2) {
        return getDelegate().g(i2);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // a.AbstractActivityC0046m, android.app.Activity
    public void setContentView(View view) {
        d();
        getDelegate().i(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        getDelegate().j(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(D.e eVar) {
    }

    public void onNightModeChanged(int i2) {
    }

    public void onPrepareSupportNavigateUpTaskStack(x.k kVar) {
    }

    @Override // g.InterfaceC0113k
    public void onSupportActionModeFinished(AbstractC0120b abstractC0120b) {
    }

    @Override // g.InterfaceC0113k
    public void onSupportActionModeStarted(AbstractC0120b abstractC0120b) {
    }

    @Deprecated
    public void setSupportProgress(int i2) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z2) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z2) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z2) {
    }
}
