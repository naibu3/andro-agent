package g;

import H.InterfaceC0017k;
import H.S;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.EnumC0067n;
import androidx.lifecycle.InterfaceC0072t;
import f.AbstractC0101a;
import i.AbstractC0120b;
import i.C0122d;
import i.C0123e;
import i.C0127i;
import i.InterfaceC0119a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0153A;
import k.C0154B;
import k.C0157E;
import k.C0158F;
import k.C0160H;
import k.C0171d0;
import k.C0176g;
import k.C0183j0;
import k.C0184k;
import k.C0192o;
import k.C0196q;
import k.C0199s;
import k.C0203u;
import k.C0207w;
import k.C0211y;
import k.InterfaceC0187l0;
import k.e1;
import k.j1;
import k.m1;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.ct.CTConstants;

/* loaded from: classes.dex */
public final class C extends AbstractC0118p implements j.l, LayoutInflater.Factory2 {
    public static final n.k h0 = new n.k(0);

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f1303i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f1304j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f1305A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f1306B;

    /* renamed from: C, reason: collision with root package name */
    public View f1307C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1308D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1309E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1310F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1311G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1312H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1313I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1314J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1315K;

    /* renamed from: L, reason: collision with root package name */
    public B[] f1316L;

    /* renamed from: M, reason: collision with root package name */
    public B f1317M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1318N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f1319O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1320P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f1321Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f1322R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1323S;

    /* renamed from: T, reason: collision with root package name */
    public int f1324T;

    /* renamed from: U, reason: collision with root package name */
    public int f1325U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1326V;

    /* renamed from: W, reason: collision with root package name */
    public x f1327W;

    /* renamed from: X, reason: collision with root package name */
    public x f1328X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1329Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1330Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1332b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f1333c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f1334d0;

    /* renamed from: e0, reason: collision with root package name */
    public F f1335e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1336f0;
    public OnBackInvokedCallback g0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1337j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f1338k;

    /* renamed from: l, reason: collision with root package name */
    public Window f1339l;

    /* renamed from: m, reason: collision with root package name */
    public w f1340m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f1341n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0103a f1342o;

    /* renamed from: p, reason: collision with root package name */
    public C0127i f1343p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1344q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0187l0 f1345r;

    /* renamed from: s, reason: collision with root package name */
    public r f1346s;

    /* renamed from: t, reason: collision with root package name */
    public r f1347t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0120b f1348u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f1349v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f1350w;

    /* renamed from: x, reason: collision with root package name */
    public q f1351x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1352z;
    public S y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final q f1331a0 = new q(this, 0);

    public C(Context context, Window window, InterfaceC0113k interfaceC0113k, Object obj) {
        AbstractActivityC0112j abstractActivityC0112j = null;
        this.f1323S = -100;
        this.f1338k = context;
        this.f1341n = interfaceC0113k;
        this.f1337j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC0112j)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC0112j = (AbstractActivityC0112j) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC0112j != null) {
                this.f1323S = ((C) abstractActivityC0112j.getDelegate()).f1323S;
            }
        }
        if (this.f1323S == -100) {
            n.k kVar = h0;
            Integer num = (Integer) kVar.get(this.f1337j.getClass().getName());
            if (num != null) {
                this.f1323S = num.intValue();
                kVar.remove(this.f1337j.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C0203u.c();
    }

    public static D.e q(Context context) {
        D.e eVar;
        D.e eVar2;
        if (Build.VERSION.SDK_INT >= 33 || (eVar = AbstractC0118p.f1460c) == null) {
            return null;
        }
        D.e eVarB = u.b(context.getApplicationContext().getResources().getConfiguration());
        D.f fVar = eVar.f240a;
        if (fVar.f241a.isEmpty()) {
            eVar2 = D.e.f239b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < eVarB.f240a.f241a.size() + fVar.f241a.size()) {
                Locale locale = i2 < fVar.f241a.size() ? fVar.f241a.get(i2) : eVarB.f240a.f241a.get(i2 - fVar.f241a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            eVar2 = new D.e(new D.f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return eVar2.f240a.f241a.isEmpty() ? eVarB : eVar2;
    }

    public static Configuration u(Context context, int i2, D.e eVar, Configuration configuration, boolean z2) {
        int i3 = i2 != 1 ? i2 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            u.d(configuration2, eVar);
        }
        return configuration2;
    }

    public final B A(int i2) {
        B[] bArr = this.f1316L;
        if (bArr == null || bArr.length <= i2) {
            B[] bArr2 = new B[i2 + 1];
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            this.f1316L = bArr2;
            bArr = bArr2;
        }
        B b2 = bArr[i2];
        if (b2 != null) {
            return b2;
        }
        B b3 = new B();
        b3.f1288a = i2;
        b3.f1300n = false;
        bArr[i2] = b3;
        return b3;
    }

    public final void B() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x();
        if (this.f1310F && this.f1342o == null) {
            Object obj = this.f1337j;
            if (obj instanceof Activity) {
                this.f1342o = new P((Activity) obj, this.f1311G);
            } else if (obj instanceof Dialog) {
                this.f1342o = new P((Dialog) obj);
            }
            AbstractC0103a abstractC0103a = this.f1342o;
            if (abstractC0103a != null) {
                abstractC0103a.l(this.f1332b0);
            }
        }
    }

    public final void C(int i2) {
        this.f1330Z = (1 << i2) | this.f1330Z;
        if (this.f1329Y) {
            return;
        }
        View decorView = this.f1339l.getDecorView();
        q qVar = this.f1331a0;
        WeakHashMap weakHashMap = H.N.f327a;
        decorView.postOnAnimation(qVar);
        this.f1329Y = true;
    }

    public final int D(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return z(context).e();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f1328X == null) {
                    this.f1328X = new x(this, context);
                }
                return this.f1328X.e();
            }
        }
        return i2;
    }

    public final boolean E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = this.f1318N;
        this.f1318N = false;
        B bA = A(0);
        if (bA.f1299m) {
            if (!z2) {
                t(bA, true);
            }
            return true;
        }
        AbstractC0120b abstractC0120b = this.f1348u;
        if (abstractC0120b != null) {
            abstractC0120b.a();
            return true;
        }
        B();
        AbstractC0103a abstractC0103a = this.f1342o;
        return abstractC0103a != null && abstractC0103a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0173, code lost:
    
        if (r3.f1651f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(B b2, KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (b2.f1299m || this.f1321Q) {
            return;
        }
        int i3 = b2.f1288a;
        Context context = this.f1338k;
        if (i3 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f1339l.getCallback();
        if (callback != null && !callback.onMenuOpened(i3, b2.h)) {
            t(b2, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !H(b2, keyEvent)) {
            return;
        }
        C0102A c0102a = b2.f1292e;
        if (c0102a != null && !b2.f1300n) {
            View view = b2.f1294g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i2 = -1;
            }
            b2.f1298l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = b2.f1290c;
            layoutParams2.windowAnimations = b2.f1291d;
            windowManager.addView(b2.f1292e, layoutParams2);
            b2.f1299m = true;
            if (i3 != 0) {
                J();
                return;
            }
            return;
        }
        if (c0102a == null) {
            B();
            AbstractC0103a abstractC0103a = this.f1342o;
            Context contextE = abstractC0103a != null ? abstractC0103a.e() : null;
            if (contextE != null) {
                context = contextE;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(org.conscrypt.R.attr.actionBarPopupTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            }
            themeNewTheme.resolveAttribute(org.conscrypt.R.attr.panelMenuListTheme, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                themeNewTheme.applyStyle(i5, true);
            } else {
                themeNewTheme.applyStyle(org.conscrypt.R.style.Theme_AppCompat_CompactMenu, true);
            }
            C0122d c0122d = new C0122d(context, 0);
            c0122d.getTheme().setTo(themeNewTheme);
            b2.f1296j = c0122d;
            TypedArray typedArrayObtainStyledAttributes = c0122d.obtainStyledAttributes(AbstractC0101a.f1270j);
            b2.f1289b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            b2.f1291d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            b2.f1292e = new C0102A(this, b2.f1296j);
            b2.f1290c = 81;
        } else if (b2.f1300n && c0102a.getChildCount() > 0) {
            b2.f1292e.removeAllViews();
        }
        View view2 = b2.f1294g;
        if (view2 == null) {
            if (b2.h != null) {
                if (this.f1347t == null) {
                    this.f1347t = new r(this, 3);
                }
                r rVar = this.f1347t;
                if (b2.f1295i == null) {
                    j.j jVar = new j.j(b2.f1296j);
                    b2.f1295i = jVar;
                    jVar.f1650e = rVar;
                    j.n nVar = b2.h;
                    nVar.b(jVar, nVar.f1658a);
                }
                j.j jVar2 = b2.f1295i;
                C0102A c0102a2 = b2.f1292e;
                if (jVar2.f1649d == null) {
                    jVar2.f1649d = (ExpandedMenuView) jVar2.f1647b.inflate(org.conscrypt.R.layout.abc_expanded_menu_layout, (ViewGroup) c0102a2, false);
                    if (jVar2.f1651f == null) {
                        jVar2.f1651f = new j.i(jVar2);
                    }
                    jVar2.f1649d.setAdapter((ListAdapter) jVar2.f1651f);
                    jVar2.f1649d.setOnItemClickListener(jVar2);
                }
                ExpandedMenuView expandedMenuView = jVar2.f1649d;
                b2.f1293f = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            b2.f1300n = true;
            return;
        }
        b2.f1293f = view2;
        if (b2.f1293f != null) {
            if (b2.f1294g == null) {
                j.j jVar3 = b2.f1295i;
                if (jVar3.f1651f == null) {
                    jVar3.f1651f = new j.i(jVar3);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = b2.f1293f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            b2.f1292e.setBackgroundResource(b2.f1289b);
            ViewParent parent = b2.f1293f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(b2.f1293f);
            }
            b2.f1292e.addView(b2.f1293f, layoutParams3);
            if (!b2.f1293f.hasFocus()) {
                b2.f1293f.requestFocus();
            }
        }
        b2.f1300n = true;
        return;
        i2 = -2;
        b2.f1298l = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = b2.f1290c;
        layoutParams22.windowAnimations = b2.f1291d;
        windowManager.addView(b2.f1292e, layoutParams22);
        b2.f1299m = true;
        if (i3 != 0) {
        }
    }

    public final boolean G(B b2, int i2, KeyEvent keyEvent) {
        j.n nVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((b2.f1297k || H(b2, keyEvent)) && (nVar = b2.h) != null) {
            return nVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(B b2, KeyEvent keyEvent) {
        InterfaceC0187l0 interfaceC0187l0;
        InterfaceC0187l0 interfaceC0187l02;
        Resources.Theme themeNewTheme;
        InterfaceC0187l0 interfaceC0187l03;
        InterfaceC0187l0 interfaceC0187l04;
        if (this.f1321Q) {
            return false;
        }
        if (b2.f1297k) {
            return true;
        }
        B b3 = this.f1317M;
        if (b3 != null && b3 != b2) {
            t(b3, false);
        }
        Window.Callback callback = this.f1339l.getCallback();
        int i2 = b2.f1288a;
        if (callback != null) {
            b2.f1294g = callback.onCreatePanelView(i2);
        }
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (interfaceC0187l04 = this.f1345r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0187l04;
            actionBarOverlayLayout.k();
            ((e1) actionBarOverlayLayout.f860e).f1905l = true;
        }
        if (b2.f1294g == null && (!z2 || !(this.f1342o instanceof K))) {
            j.n nVar = b2.h;
            if (nVar == null || b2.f1301o) {
                if (nVar == null) {
                    Context context = this.f1338k;
                    if ((i2 == 0 || i2 == 108) && this.f1345r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(org.conscrypt.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(org.conscrypt.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(org.conscrypt.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C0122d c0122d = new C0122d(context, 0);
                            c0122d.getTheme().setTo(themeNewTheme);
                            context = c0122d;
                        }
                    }
                    j.n nVar2 = new j.n(context);
                    nVar2.f1662e = this;
                    j.n nVar3 = b2.h;
                    if (nVar2 != nVar3) {
                        if (nVar3 != null) {
                            nVar3.r(b2.f1295i);
                        }
                        b2.h = nVar2;
                        j.j jVar = b2.f1295i;
                        if (jVar != null) {
                            nVar2.b(jVar, nVar2.f1658a);
                        }
                    }
                    if (b2.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0187l02 = this.f1345r) != null) {
                    if (this.f1346s == null) {
                        this.f1346s = new r(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0187l02).l(b2.h, this.f1346s);
                }
                b2.h.w();
                if (!callback.onCreatePanelMenu(i2, b2.h)) {
                    j.n nVar4 = b2.h;
                    if (nVar4 != null) {
                        if (nVar4 != null) {
                            nVar4.r(b2.f1295i);
                        }
                        b2.h = null;
                    }
                    if (z2 && (interfaceC0187l0 = this.f1345r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0187l0).l(null, this.f1346s);
                    }
                    return false;
                }
                b2.f1301o = false;
            }
            b2.h.w();
            Bundle bundle = b2.f1302p;
            if (bundle != null) {
                b2.h.s(bundle);
                b2.f1302p = null;
            }
            if (!callback.onPreparePanel(0, b2.f1294g, b2.h)) {
                if (z2 && (interfaceC0187l03 = this.f1345r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0187l03).l(null, this.f1346s);
                }
                b2.h.v();
                return false;
            }
            b2.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            b2.h.v();
        }
        b2.f1297k = true;
        b2.f1298l = false;
        this.f1317M = b2;
        return true;
    }

    public final void I() {
        if (this.f1352z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f1336f0 != null && (A(0).f1299m || this.f1348u != null)) {
                z2 = true;
            }
            if (z2 && this.g0 == null) {
                this.g0 = v.b(this.f1336f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.g0) == null) {
                    return;
                }
                v.c(this.f1336f0, onBackInvokedCallback);
                this.g0 = null;
            }
        }
    }

    @Override // g.AbstractC0118p
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1338k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof C) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.AbstractC0118p
    public final void b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f1342o != null) {
            B();
            if (this.f1342o.f()) {
                return;
            }
            C(0);
        }
    }

    @Override // g.AbstractC0118p
    public final void d() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strC;
        this.f1319O = true;
        o(false, true);
        y();
        Object obj = this.f1337j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = x.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC0103a abstractC0103a = this.f1342o;
                if (abstractC0103a == null) {
                    this.f1332b0 = true;
                } else {
                    abstractC0103a.l(true);
                }
            }
            synchronized (AbstractC0118p.h) {
                AbstractC0118p.f(this);
                AbstractC0118p.f1464g.add(new WeakReference(this));
            }
        }
        this.f1322R = new Configuration(this.f1338k.getResources().getConfiguration());
        this.f1320P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // g.AbstractC0118p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        if (this.f1337j instanceof Activity) {
            synchronized (AbstractC0118p.h) {
                AbstractC0118p.f(this);
            }
        }
        if (this.f1329Y) {
            this.f1339l.getDecorView().removeCallbacks(this.f1331a0);
        }
        this.f1321Q = true;
        if (this.f1323S != -100) {
            Object obj = this.f1337j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                h0.put(this.f1337j.getClass().getName(), Integer.valueOf(this.f1323S));
            } else {
                h0.remove(this.f1337j.getClass().getName());
            }
        }
        AbstractC0103a abstractC0103a = this.f1342o;
        if (abstractC0103a != null) {
            abstractC0103a.h();
        }
        x xVar = this.f1327W;
        if (xVar != null) {
            xVar.c();
        }
        x xVar2 = this.f1328X;
        if (xVar2 != null) {
            xVar2.c();
        }
    }

    @Override // g.AbstractC0118p
    public final boolean g(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f1314J && i2 == 108) {
            return false;
        }
        if (this.f1310F && i2 == 1) {
            this.f1310F = false;
        }
        if (i2 == 1) {
            I();
            this.f1314J = true;
            return true;
        }
        if (i2 == 2) {
            I();
            this.f1308D = true;
            return true;
        }
        if (i2 == 5) {
            I();
            this.f1309E = true;
            return true;
        }
        if (i2 == 10) {
            I();
            this.f1312H = true;
            return true;
        }
        if (i2 == 108) {
            I();
            this.f1310F = true;
            return true;
        }
        if (i2 != 109) {
            return this.f1339l.requestFeature(i2);
        }
        I();
        this.f1311G = true;
        return true;
    }

    @Override // g.AbstractC0118p
    public final void h(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f1305A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1338k).inflate(i2, viewGroup);
        this.f1340m.a(this.f1339l.getCallback());
    }

    @Override // g.AbstractC0118p
    public final void i(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f1305A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1340m.a(this.f1339l.getCallback());
    }

    @Override // g.AbstractC0118p
    public final void j(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f1305A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1340m.a(this.f1339l.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // j.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(j.n nVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ActionMenuView actionMenuView;
        C0184k c0184k;
        InterfaceC0187l0 interfaceC0187l0 = this.f1345r;
        if (interfaceC0187l0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0187l0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((e1) actionBarOverlayLayout.f860e).f1895a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f925a) != null && actionMenuView.f884s) {
                if (ViewConfiguration.get(this.f1338k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1345r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout2.f860e).f1895a.f925a;
                    if (actionMenuView2 != null) {
                        C0184k c0184k2 = actionMenuView2.f885t;
                        if (c0184k2 != null) {
                            if (c0184k2.f1970u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f1339l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1345r;
                actionBarOverlayLayout3.k();
                if (((e1) actionBarOverlayLayout3.f860e).f1895a.o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1345r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((e1) actionBarOverlayLayout4.f860e).f1895a.f925a;
                    if (actionMenuView3 != null && (c0184k = actionMenuView3.f885t) != null) {
                        c0184k.e();
                    }
                    if (this.f1321Q) {
                        return;
                    }
                    callback.onPanelClosed(108, A(0).h);
                    return;
                }
                if (callback == null || this.f1321Q) {
                    return;
                }
                if (this.f1329Y && (1 & this.f1330Z) != 0) {
                    View decorView = this.f1339l.getDecorView();
                    q qVar = this.f1331a0;
                    decorView.removeCallbacks(qVar);
                    qVar.run();
                }
                B bA = A(0);
                j.n nVar2 = bA.h;
                if (nVar2 == null || bA.f1301o || !callback.onPreparePanel(0, bA.f1294g, nVar2)) {
                    return;
                }
                callback.onMenuOpened(108, bA.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f1345r;
                actionBarOverlayLayout5.k();
                ((e1) actionBarOverlayLayout5.f860e).f1895a.u();
                return;
            }
        }
        B bA2 = A(0);
        bA2.f1300n = true;
        t(bA2, false);
        F(bA2, null);
    }

    @Override // g.AbstractC0118p
    public final void l(CharSequence charSequence) {
        this.f1344q = charSequence;
        InterfaceC0187l0 interfaceC0187l0 = this.f1345r;
        if (interfaceC0187l0 != null) {
            interfaceC0187l0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0103a abstractC0103a = this.f1342o;
        if (abstractC0103a != null) {
            abstractC0103a.n(charSequence);
            return;
        }
        TextView textView = this.f1306B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // j.l
    public final boolean m(j.n nVar, MenuItem menuItem) {
        B b2;
        Window.Callback callback = this.f1339l.getCallback();
        if (callback != null && !this.f1321Q) {
            j.n nVarK = nVar.k();
            B[] bArr = this.f1316L;
            int length = bArr != null ? bArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    b2 = bArr[i2];
                    if (b2 != null && b2.h == nVarK) {
                        break;
                    }
                    i2++;
                } else {
                    b2 = null;
                    break;
                }
            }
            if (b2 != null) {
                return callback.onMenuItemSelected(b2.f1288a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Type inference failed for: r3v1, types: [g.k, java.lang.Object] */
    @Override // g.AbstractC0118p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0120b n(InterfaceC0119a interfaceC0119a) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC0120b abstractC0120bOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC0120b abstractC0120b;
        boolean z2 = false;
        int i2 = 1;
        if (interfaceC0119a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0120b abstractC0120b2 = this.f1348u;
        if (abstractC0120b2 != null) {
            abstractC0120b2.a();
        }
        E.c cVar = new E.c(this, interfaceC0119a, 6, z2);
        B();
        AbstractC0103a abstractC0103a = this.f1342o;
        ?? r3 = this.f1341n;
        if (abstractC0103a != null) {
            AbstractC0120b abstractC0120bO = abstractC0103a.o(cVar);
            this.f1348u = abstractC0120bO;
            if (abstractC0120bO != null) {
                r3.onSupportActionModeStarted(abstractC0120bO);
            }
        }
        if (this.f1348u == null) {
            S s2 = this.y;
            if (s2 != null) {
                s2.b();
            }
            AbstractC0120b abstractC0120b3 = this.f1348u;
            if (abstractC0120b3 != null) {
                abstractC0120b3.a();
            }
            if (this.f1321Q) {
                abstractC0120bOnWindowStartingSupportActionMode = null;
                if (abstractC0120bOnWindowStartingSupportActionMode == null) {
                }
                abstractC0120b = this.f1348u;
                if (abstractC0120b != null) {
                }
                J();
                this.f1348u = this.f1348u;
            } else {
                try {
                    abstractC0120bOnWindowStartingSupportActionMode = r3.onWindowStartingSupportActionMode(cVar);
                } catch (AbstractMethodError unused) {
                }
                if (abstractC0120bOnWindowStartingSupportActionMode == null) {
                    this.f1348u = abstractC0120bOnWindowStartingSupportActionMode;
                } else {
                    if (this.f1349v == null) {
                        boolean z3 = this.f1313I;
                        Context context = this.f1338k;
                        if (z3) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(org.conscrypt.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                C0122d c0122d = new C0122d(context, 0);
                                c0122d.getTheme().setTo(themeNewTheme);
                                context = c0122d;
                            }
                            this.f1349v = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, org.conscrypt.R.attr.actionModePopupWindowStyle);
                            this.f1350w = popupWindow;
                            popupWindow.setWindowLayoutType(2);
                            this.f1350w.setContentView(this.f1349v);
                            this.f1350w.setWidth(-1);
                            context.getTheme().resolveAttribute(org.conscrypt.R.attr.actionBarSize, typedValue, true);
                            this.f1349v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f1350w.setHeight(-2);
                            this.f1351x = new q(this, i2);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f1305A.findViewById(org.conscrypt.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                B();
                                AbstractC0103a abstractC0103a2 = this.f1342o;
                                Context contextE = abstractC0103a2 != null ? abstractC0103a2.e() : null;
                                if (contextE != null) {
                                    context = contextE;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f1349v = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f1349v != null) {
                        S s3 = this.y;
                        if (s3 != null) {
                            s3.b();
                        }
                        this.f1349v.e();
                        Context context2 = this.f1349v.getContext();
                        ActionBarContextView actionBarContextView = this.f1349v;
                        C0123e c0123e = new C0123e();
                        c0123e.f1517c = context2;
                        c0123e.f1518d = actionBarContextView;
                        c0123e.f1519e = cVar;
                        j.n nVar = new j.n(actionBarContextView.getContext());
                        nVar.f1668l = 1;
                        c0123e.h = nVar;
                        nVar.f1662e = c0123e;
                        if (((InterfaceC0119a) cVar.f271b).c(c0123e, nVar)) {
                            c0123e.g();
                            this.f1349v.c(c0123e);
                            this.f1348u = c0123e;
                            if (this.f1352z && (viewGroup = this.f1305A) != null && viewGroup.isLaidOut()) {
                                this.f1349v.setAlpha(0.0f);
                                S sA = H.N.a(this.f1349v);
                                sA.a(1.0f);
                                this.y = sA;
                                sA.d(new s(i2, this));
                            } else {
                                this.f1349v.setAlpha(1.0f);
                                this.f1349v.setVisibility(0);
                                if (this.f1349v.getParent() instanceof View) {
                                    View view = (View) this.f1349v.getParent();
                                    WeakHashMap weakHashMap = H.N.f327a;
                                    H.E.c(view);
                                }
                            }
                            if (this.f1350w != null) {
                                this.f1339l.getDecorView().post(this.f1351x);
                            }
                        } else {
                            this.f1348u = null;
                        }
                    }
                }
                abstractC0120b = this.f1348u;
                if (abstractC0120b != null) {
                    r3.onSupportActionModeStarted(abstractC0120b);
                }
                J();
                this.f1348u = this.f1348u;
            }
        }
        J();
        return this.f1348u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(boolean z2, boolean z3) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        Object obj2;
        if (this.f1321Q) {
            return false;
        }
        int i3 = this.f1323S;
        if (i3 == -100) {
            i3 = AbstractC0118p.f1459b;
        }
        int i4 = i3;
        Context context = this.f1338k;
        int iD = D(context, i4);
        int i5 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        D.e eVarQ = i5 < 33 ? q(context) : null;
        if (!z3 && eVarQ != null) {
            eVarQ = u.b(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iD, eVarQ, null, false);
        boolean z7 = this.f1326V;
        Object obj3 = this.f1337j;
        if (z7 || !(obj3 instanceof Activity)) {
            this.f1326V = true;
            i2 = this.f1325U;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i2 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i5 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f1325U = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    this.f1325U = 0;
                }
                this.f1326V = true;
                i2 = this.f1325U;
            }
        }
        Configuration configuration = this.f1322R;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i6 = configuration.uiMode & 48;
        int i7 = configurationU.uiMode & 48;
        D.e eVarB = u.b(configuration);
        D.e eVarB2 = eVarQ == null ? null : u.b(configurationU);
        int i8 = i6 != i7 ? 512 : 0;
        if (eVarB2 != null && !eVarB.equals(eVarB2)) {
            i8 |= 8196;
        }
        if (((~i2) & i8) != 0 && z2 && this.f1319O && ((f1304j0 || this.f1320P) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (!activity.isChild()) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 31 && (i8 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationU.getLayoutDirection());
                }
                if (i9 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new M.r(5, activity));
                }
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (z4 || i8 == 0) {
            z5 = z4;
        } else {
            boolean z8 = (i2 & i8) == i8;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i7;
            if (eVarB2 != null) {
                u.d(configuration2, eVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 26 && i10 < 28) {
                if (!C0.f.f217j) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        C0.f.f216i = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e3);
                    }
                    C0.f.f217j = true;
                }
                Field field = C0.f.f216i;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!C0.f.f212d) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                C0.f.f211c = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e5);
                            }
                            C0.f.f212d = true;
                        }
                        Field field2 = C0.f.f211c;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e6) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e6);
                            }
                            if (obj2 != null) {
                                if (!C0.f.f214f) {
                                    try {
                                        C0.f.f213e = Class.forName("android.content.res.ThemedResourceCache");
                                    } catch (ClassNotFoundException e7) {
                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
                                    }
                                    C0.f.f214f = true;
                                }
                                Class cls = C0.f.f213e;
                                if (cls != null) {
                                    if (!C0.f.h) {
                                        try {
                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                            C0.f.f215g = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e8) {
                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e8);
                                        }
                                        C0.f.h = true;
                                    }
                                    Field field3 = C0.f.f215g;
                                    if (field3 != null) {
                                        try {
                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                        } catch (IllegalAccessException e9) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e9);
                                        }
                                        if (longSparseArray != null) {
                                            longSparseArray.clear();
                                        }
                                    }
                                }
                            }
                        } else {
                            obj2 = null;
                            if (obj2 != null) {
                            }
                        }
                    }
                }
            }
            int i11 = this.f1324T;
            if (i11 != 0) {
                context.setTheme(i11);
                z6 = true;
                context.getTheme().applyStyle(this.f1324T, true);
            } else {
                z6 = true;
            }
            if (z8 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof InterfaceC0072t) {
                    if (((androidx.lifecycle.v) ((InterfaceC0072t) activity2).getLifecycle()).f1207c.compareTo(EnumC0067n.f1198c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f1320P && !this.f1321Q) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z5 = z6;
        }
        if (z5 && (obj3 instanceof AbstractActivityC0112j)) {
            if ((i8 & 512) != 0) {
                ((AbstractActivityC0112j) obj3).onNightModeChanged(iD);
            }
            if ((i8 & 4) != 0) {
                ((AbstractActivityC0112j) obj3).onLocalesChanged(eVarQ);
            }
        }
        if (eVarB2 != null) {
            u.c(u.b(context.getResources().getConfiguration()));
        }
        if (i4 == 0) {
            z(context).h();
        } else {
            x xVar = this.f1327W;
            if (xVar != null) {
                xVar.c();
            }
        }
        if (i4 == 3) {
            if (this.f1328X == null) {
                this.f1328X = new x(this, context);
            }
            this.f1328X.h();
        } else {
            x xVar2 = this.f1328X;
            if (xVar2 != null) {
                xVar2.c();
            }
        }
        return z5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c0158f;
        int i2;
        String attributeValue = str;
        char c2 = 4;
        View view2 = null;
        if (this.f1335e0 == null) {
            int[] iArr = AbstractC0101a.f1270j;
            Context context2 = this.f1338k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f1335e0 = new F();
            } else {
                try {
                    this.f1335e0 = (F) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f1335e0 = new F();
                }
            }
        }
        F f2 = this.f1335e0;
        int i3 = j1.f1950a;
        f2.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0101a.f1284x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context c0122d = (resourceId == 0 || ((context instanceof C0122d) && ((C0122d) context).f1512a == resourceId)) ? context : new C0122d(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (!attributeValue.equals("RatingBar")) {
                    c2 = 65535;
                    break;
                } else {
                    c2 = 0;
                    break;
                }
            case -1455429095:
                if (attributeValue.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (attributeValue.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (attributeValue.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (!attributeValue.equals("ImageButton")) {
                }
                break;
            case -658531749:
                if (attributeValue.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (attributeValue.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (attributeValue.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (attributeValue.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (attributeValue.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (attributeValue.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (attributeValue.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (attributeValue.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (attributeValue.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                c0158f = new C0158F(c0122d, attributeSet);
                break;
            case 1:
                c0158f = new C0199s(c0122d, attributeSet);
                break;
            case 2:
                c0158f = new C0154B(c0122d, attributeSet);
                break;
            case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                c0158f = new C0171d0(c0122d, attributeSet);
                break;
            case 4:
                c0158f = new C0211y(c0122d, attributeSet, org.conscrypt.R.attr.imageButtonStyle);
                break;
            case 5:
                c0158f = new C0160H(c0122d, attributeSet);
                break;
            case 6:
                c0158f = new k.S(c0122d, attributeSet);
                break;
            case 7:
                c0158f = new C0157E(c0122d, attributeSet);
                break;
            case CTConstants.TIMESTAMP_LENGTH /* 8 */:
                c0158f = new C0183j0(c0122d, attributeSet);
                break;
            case '\t':
                c0158f = new C0153A(c0122d, attributeSet, 0);
                break;
            case '\n':
                c0158f = new C0192o(c0122d, attributeSet);
                break;
            case 11:
                c0158f = new k.r(c0122d, attributeSet);
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                c0158f = new C0207w(c0122d, attributeSet);
                break;
            case '\r':
                c0158f = new C0196q(c0122d, attributeSet);
                break;
            default:
                c0158f = null;
                break;
        }
        if (c0158f == null && context != c0122d) {
            Object[] objArr = f2.f1364a;
            if (attributeValue.equals("view")) {
                attributeValue = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0122d;
                objArr[1] = attributeSet;
                if (-1 == attributeValue.indexOf(46)) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr = F.f1363g;
                        if (i4 < 3) {
                            View viewA = f2.a(c0122d, attributeValue, strArr[i4]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i4++;
                            }
                        }
                    }
                } else {
                    View viewA2 = f2.a(c0122d, attributeValue, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0158f = view2;
        }
        if (c0158f != null) {
            Context context3 = c0158f.getContext();
            if ((context3 instanceof ContextWrapper) && c0158f.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, F.f1359c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0158f.setOnClickListener(new E(c0158f, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c0122d.obtainStyledAttributes(attributeSet, F.f1360d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = H.N.f327a;
                    i2 = 0;
                    new H.B(org.conscrypt.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0158f, Boolean.valueOf(z2));
                } else {
                    i2 = 0;
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c0122d.obtainStyledAttributes(attributeSet, F.f1361e);
                if (typedArrayObtainStyledAttributes5.hasValue(i2)) {
                    H.N.i(c0158f, typedArrayObtainStyledAttributes5.getString(i2));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c0122d.obtainStyledAttributes(attributeSet, F.f1362f);
                if (typedArrayObtainStyledAttributes6.hasValue(i2)) {
                    boolean z3 = typedArrayObtainStyledAttributes6.getBoolean(i2, i2);
                    WeakHashMap weakHashMap2 = H.N.f327a;
                    new H.B(org.conscrypt.R.id.tag_screen_reader_focusable, Boolean.class, i2, 28, 0).d(c0158f, Boolean.valueOf(z3));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c0158f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f1339l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof w) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        w wVar = new w(this, callback);
        this.f1340m = wVar;
        window.setCallback(wVar);
        int[] iArr = f1303i0;
        Context context = this.f1338k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            C0203u c0203uA = C0203u.a();
            synchronized (c0203uA) {
                drawableD = c0203uA.f2031a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f1339l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f1336f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.g0) != null) {
            v.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.g0 = null;
        }
        Object obj = this.f1337j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f1336f0 = v.a(activity);
            } else {
                this.f1336f0 = null;
            }
        }
        J();
    }

    public final void r(int i2, B b2, j.n nVar) {
        if (nVar == null) {
            if (b2 == null && i2 >= 0) {
                B[] bArr = this.f1316L;
                if (i2 < bArr.length) {
                    b2 = bArr[i2];
                }
            }
            if (b2 != null) {
                nVar = b2.h;
            }
        }
        if ((b2 == null || b2.f1299m) && !this.f1321Q) {
            w wVar = this.f1340m;
            Window.Callback callback = this.f1339l.getCallback();
            wVar.getClass();
            try {
                wVar.f1476e = true;
                callback.onPanelClosed(i2, nVar);
            } finally {
                wVar.f1476e = false;
            }
        }
    }

    public final void s(j.n nVar) {
        C0184k c0184k;
        if (this.f1315K) {
            return;
        }
        this.f1315K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1345r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f860e).f1895a.f925a;
        if (actionMenuView != null && (c0184k = actionMenuView.f885t) != null) {
            c0184k.e();
            C0176g c0176g = c0184k.f1969t;
            if (c0176g != null && c0176g.b()) {
                c0176g.f1730i.dismiss();
            }
        }
        Window.Callback callback = this.f1339l.getCallback();
        if (callback != null && !this.f1321Q) {
            callback.onPanelClosed(108, nVar);
        }
        this.f1315K = false;
    }

    public final void t(B b2, boolean z2) {
        C0102A c0102a;
        InterfaceC0187l0 interfaceC0187l0;
        if (z2 && b2.f1288a == 0 && (interfaceC0187l0 = this.f1345r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0187l0;
            actionBarOverlayLayout.k();
            if (((e1) actionBarOverlayLayout.f860e).f1895a.o()) {
                s(b2.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1338k.getSystemService("window");
        if (windowManager != null && b2.f1299m && (c0102a = b2.f1292e) != null) {
            windowManager.removeView(c0102a);
            if (z2) {
                r(b2.f1288a, b2, null);
            }
        }
        b2.f1297k = false;
        b2.f1298l = false;
        b2.f1299m = false;
        b2.f1293f = null;
        b2.f1300n = true;
        if (this.f1317M == b2) {
            this.f1317M = null;
        }
        if (b2.f1288a == 0) {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View decorView;
        boolean zU;
        boolean zH;
        ActionMenuView actionMenuView;
        C0184k c0184k;
        Object obj = this.f1337j;
        if (((obj instanceof InterfaceC0017k) || (obj instanceof DialogC0110h)) && (decorView = this.f1339l.getDecorView()) != null && C0.m.g(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            w wVar = this.f1340m;
            Window.Callback callback = this.f1339l.getCallback();
            wVar.getClass();
            try {
                wVar.f1475d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                wVar.f1475d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f1318N = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                B bA = A(0);
                if (bA.f1299m) {
                    return true;
                }
                H(bA, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f1348u != null) {
                    return true;
                }
                B bA2 = A(0);
                InterfaceC0187l0 interfaceC0187l0 = this.f1345r;
                Context context = this.f1338k;
                if (interfaceC0187l0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0187l0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((e1) actionBarOverlayLayout.f860e).f1895a;
                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f925a) == null || !actionMenuView.f884s || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        boolean z2 = bA2.f1299m;
                        if (z2 || bA2.f1298l) {
                            t(bA2, true);
                            zU = z2;
                        } else {
                            if (bA2.f1297k) {
                                if (bA2.f1301o) {
                                    bA2.f1297k = false;
                                    zH = H(bA2, keyEvent);
                                } else {
                                    zH = true;
                                }
                                if (zH) {
                                    F(bA2, keyEvent);
                                    zU = true;
                                }
                            }
                            zU = false;
                        }
                    } else {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1345r;
                        actionBarOverlayLayout2.k();
                        if (((e1) actionBarOverlayLayout2.f860e).f1895a.o()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1345r;
                            actionBarOverlayLayout3.k();
                            ActionMenuView actionMenuView2 = ((e1) actionBarOverlayLayout3.f860e).f1895a.f925a;
                            if (actionMenuView2 != null && (c0184k = actionMenuView2.f885t) != null && c0184k.e()) {
                                zU = true;
                            }
                        } else if (!this.f1321Q && H(bA2, keyEvent)) {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1345r;
                            actionBarOverlayLayout4.k();
                            zU = ((e1) actionBarOverlayLayout4.f860e).f1895a.u();
                        }
                        zU = false;
                    }
                }
                if (!zU) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (E()) {
            return true;
        }
        return false;
    }

    public final void w(int i2) {
        B bA = A(i2);
        if (bA.h != null) {
            Bundle bundle = new Bundle();
            bA.h.t(bundle);
            if (bundle.size() > 0) {
                bA.f1302p = bundle;
            }
            bA.h.w();
            bA.h.clear();
        }
        bA.f1301o = true;
        bA.f1300n = true;
        if ((i2 == 108 || i2 == 0) && this.f1345r != null) {
            B bA2 = A(0);
            bA2.f1297k = false;
            H(bA2, null);
        }
    }

    public final void x() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i2 = 1;
        int i3 = 0;
        if (this.f1352z) {
            return;
        }
        int[] iArr = AbstractC0101a.f1270j;
        Context context = this.f1338k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f1313I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.f1339l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f1314J) {
            viewGroup = this.f1312H ? (ViewGroup) layoutInflaterFrom.inflate(org.conscrypt.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(org.conscrypt.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f1313I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(org.conscrypt.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f1311G = false;
            this.f1310F = false;
        } else if (this.f1310F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(org.conscrypt.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0122d(context, typedValue.resourceId) : context).inflate(org.conscrypt.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0187l0 interfaceC0187l0 = (InterfaceC0187l0) viewGroup.findViewById(org.conscrypt.R.id.decor_content_parent);
            this.f1345r = interfaceC0187l0;
            interfaceC0187l0.setWindowCallback(this.f1339l.getCallback());
            if (this.f1311G) {
                ((ActionBarOverlayLayout) this.f1345r).j(109);
            }
            if (this.f1308D) {
                ((ActionBarOverlayLayout) this.f1345r).j(2);
            }
            if (this.f1309E) {
                ((ActionBarOverlayLayout) this.f1345r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1310F + ", windowActionBarOverlay: " + this.f1311G + ", android:windowIsFloating: " + this.f1313I + ", windowActionModeOverlay: " + this.f1312H + ", windowNoTitle: " + this.f1314J + " }");
        }
        r rVar = new r(this, i3);
        WeakHashMap weakHashMap = H.N.f327a;
        H.G.h(viewGroup, rVar);
        if (this.f1345r == null) {
            this.f1306B = (TextView) viewGroup.findViewById(org.conscrypt.R.id.title);
        }
        boolean z2 = m1.f1979a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(org.conscrypt.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1339l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1339l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new r(this, i2));
        this.f1305A = viewGroup;
        Object obj = this.f1337j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1344q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0187l0 interfaceC0187l02 = this.f1345r;
            if (interfaceC0187l02 != null) {
                interfaceC0187l02.setWindowTitle(title);
            } else {
                AbstractC0103a abstractC0103a = this.f1342o;
                if (abstractC0103a != null) {
                    abstractC0103a.n(title);
                } else {
                    TextView textView = this.f1306B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f1305A.findViewById(R.id.content);
        View decorView = this.f1339l.getDecorView();
        contentFrameLayout2.f901g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f1352z = true;
        B bA = A(0);
        if (this.f1321Q || bA.h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.f1339l == null) {
            Object obj = this.f1337j;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f1339l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final z z(Context context) {
        if (this.f1327W == null) {
            if (D0.h.f256e == null) {
                Context applicationContext = context.getApplicationContext();
                D0.h.f256e = new D0.h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1327W = new x(this, D0.h.f256e);
        }
        return this.f1327W;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
