package g;

import H.InterfaceC0027v;
import H.U;
import H.V;
import H.W;
import H.X;
import H.e0;
import H.f0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0185k0;
import k.l1;
import k.m1;
import org.conscrypt.R;

/* loaded from: classes.dex */
public final class r implements InterfaceC0027v, InterfaceC0185k0, j.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f1469b;

    public /* synthetic */ r(C c2, int i2) {
        this.f1468a = i2;
        this.f1469b = c2;
    }

    @Override // j.y
    public void a(j.n nVar, boolean z2) {
        B b2;
        switch (this.f1468a) {
            case 2:
                this.f1469b.s(nVar);
                break;
            default:
                j.n nVarK = nVar.k();
                int i2 = 0;
                boolean z3 = nVarK != nVar;
                if (z3) {
                    nVar = nVarK;
                }
                C c2 = this.f1469b;
                B[] bArr = c2.f1316L;
                int length = bArr != null ? bArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        b2 = null;
                    } else {
                        b2 = bArr[i2];
                        if (b2 == null || b2.h != nVar) {
                            i2++;
                        }
                    }
                }
                if (b2 != null) {
                    if (!z3) {
                        c2.t(b2, z2);
                        break;
                    } else {
                        c2.r(b2.f1288a, b2, nVarK);
                        c2.t(b2, true);
                        break;
                    }
                }
                break;
        }
    }

    public f0 b(View view, f0 f0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2;
        boolean z2;
        f0 f0VarB;
        boolean z3;
        boolean z4;
        e0 e0Var = f0Var.f366a;
        int i3 = e0Var.g().f3b;
        C c2 = this.f1469b;
        c2.getClass();
        int i4 = e0Var.g().f3b;
        ActionBarContextView actionBarContextView = c2.f1349v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i2 = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c2.f1349v.getLayoutParams();
            if (c2.f1349v.isShown()) {
                if (c2.f1333c0 == null) {
                    c2.f1333c0 = new Rect();
                    c2.f1334d0 = new Rect();
                }
                Rect rect = c2.f1333c0;
                Rect rect2 = c2.f1334d0;
                rect.set(e0Var.g().f2a, e0Var.g().f3b, e0Var.g().f4c, e0Var.g().f5d);
                ViewGroup viewGroup = c2.f1305A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = m1.f1979a;
                    l1.a(viewGroup, rect, rect2);
                } else {
                    if (!m1.f1979a) {
                        m1.f1979a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            m1.f1980b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                m1.f1980b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = m1.f1980b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e2) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                        }
                    }
                }
                int i5 = rect.top;
                int i6 = rect.left;
                int i7 = rect.right;
                ViewGroup viewGroup2 = c2.f1305A;
                WeakHashMap weakHashMap = H.N.f327a;
                f0 f0VarA = H.H.a(viewGroup2);
                int i8 = f0VarA == null ? 0 : f0VarA.f366a.g().f2a;
                int i9 = f0VarA == null ? 0 : f0VarA.f366a.g().f4c;
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z4 = true;
                }
                Context context = c2.f1338k;
                if (i5 <= 0 || c2.f1307C != null) {
                    View view2 = c2.f1307C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != i8 || marginLayoutParams2.rightMargin != i9) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = i8;
                            marginLayoutParams2.rightMargin = i9;
                            c2.f1307C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    c2.f1307C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i8;
                    layoutParams.rightMargin = i9;
                    c2.f1305A.addView(c2.f1307C, -1, layoutParams);
                }
                View view4 = c2.f1307C;
                boolean z6 = view4 != null;
                if (z6 && view4.getVisibility() != 0) {
                    View view5 = c2.f1307C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!c2.f1312H && z6) {
                    i4 = 0;
                }
                z3 = z4;
                z2 = z6;
                i2 = 0;
            } else {
                i2 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = false;
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
            }
            if (z3) {
                c2.f1349v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = c2.f1307C;
        if (view6 != null) {
            view6.setVisibility(z2 ? i2 : 8);
        }
        if (i3 != i4) {
            int i12 = e0Var.g().f2a;
            int i13 = e0Var.g().f4c;
            int i14 = e0Var.g().f5d;
            int i15 = Build.VERSION.SDK_INT;
            X w2 = i15 >= 30 ? new W(f0Var) : i15 >= 29 ? new V(f0Var) : new U(f0Var);
            w2.d(A.c.a(i12, i4, i13, i14));
            f0VarB = w2.b();
        } else {
            f0VarB = f0Var;
        }
        WeakHashMap weakHashMap2 = H.N.f327a;
        WindowInsets windowInsetsB = f0VarB.b();
        if (windowInsetsB == null) {
            return f0VarB;
        }
        WindowInsets windowInsetsB2 = H.E.b(view, windowInsetsB);
        return !windowInsetsB2.equals(windowInsetsB) ? f0.c(windowInsetsB2, view) : f0VarB;
    }

    @Override // j.y
    public boolean c(j.n nVar) {
        Window.Callback callback;
        switch (this.f1468a) {
            case 2:
                Window.Callback callback2 = this.f1469b.f1339l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, nVar);
                    break;
                }
                break;
            default:
                if (nVar == nVar.k()) {
                    C c2 = this.f1469b;
                    if (c2.f1310F && (callback = c2.f1339l.getCallback()) != null && !c2.f1321Q) {
                        callback.onMenuOpened(108, nVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
