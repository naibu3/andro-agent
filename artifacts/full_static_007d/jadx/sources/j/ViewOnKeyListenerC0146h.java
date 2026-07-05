package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import k.C0155C;
import k.C0202t0;
import k.I0;
import k.J0;
import k.L0;
import org.conscrypt.R;

/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0146h extends v implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f1621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1622c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1623d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1624e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f1625f;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0142d f1627i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0143e f1628j;

    /* renamed from: n, reason: collision with root package name */
    public View f1632n;

    /* renamed from: o, reason: collision with root package name */
    public View f1633o;

    /* renamed from: p, reason: collision with root package name */
    public int f1634p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1635q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1636r;

    /* renamed from: s, reason: collision with root package name */
    public int f1637s;

    /* renamed from: t, reason: collision with root package name */
    public int f1638t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1640v;

    /* renamed from: w, reason: collision with root package name */
    public y f1641w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f1642x;
    public w y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1643z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1626g = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final A.f f1629k = new A.f(22, this);

    /* renamed from: l, reason: collision with root package name */
    public int f1630l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1631m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1639u = false;

    public ViewOnKeyListenerC0146h(Context context, View view, int i2, boolean z2) {
        int i3 = 0;
        this.f1627i = new ViewTreeObserverOnGlobalLayoutListenerC0142d(i3, this);
        this.f1628j = new ViewOnAttachStateChangeListenerC0143e(this, i3);
        this.f1621b = context;
        this.f1632n = view;
        this.f1623d = i2;
        this.f1624e = z2;
        this.f1634p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1622c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1625f = new Handler();
    }

    @Override // j.z
    public final void a(n nVar, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (nVar == ((C0145g) arrayList.get(i2)).f1619b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0145g) arrayList.get(i3)).f1619b.c(false);
        }
        C0145g c0145g = (C0145g) arrayList.remove(i2);
        c0145g.f1619b.r(this);
        boolean z3 = this.f1643z;
        L0 l02 = c0145g.f1618a;
        if (z3) {
            I0.b(l02.y, null);
            l02.y.setAnimationStyle(0);
        }
        l02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f1634p = ((C0145g) arrayList.get(size2 - 1)).f1620c;
        } else {
            this.f1634p = this.f1632n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0145g) arrayList.get(0)).f1619b.c(false);
                return;
            }
            return;
        }
        dismiss();
        y yVar = this.f1641w;
        if (yVar != null) {
            yVar.a(nVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1642x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1642x.removeGlobalOnLayoutListener(this.f1627i);
            }
            this.f1642x = null;
        }
        this.f1633o.removeOnAttachStateChangeListener(this.f1628j);
        this.y.onDismiss();
    }

    @Override // j.InterfaceC0136D
    public final boolean b() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0145g) arrayList.get(0)).f1618a.y.isShowing();
    }

    @Override // j.z
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0145g) it.next()).f1618a.f1766c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((k) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.InterfaceC0136D
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0145g[] c0145gArr = (C0145g[]) arrayList.toArray(new C0145g[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0145g c0145g = c0145gArr[i2];
                if (c0145g.f1618a.y.isShowing()) {
                    c0145g.f1618a.dismiss();
                }
            }
        }
    }

    @Override // j.InterfaceC0136D
    public final C0202t0 e() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0145g) arrayList.get(arrayList.size() - 1)).f1618a.f1766c;
    }

    @Override // j.z
    public final boolean g() {
        return false;
    }

    @Override // j.z
    public final void h(y yVar) {
        this.f1641w = yVar;
    }

    @Override // j.InterfaceC0136D
    public final void i() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f1626g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((n) it.next());
        }
        arrayList.clear();
        View view = this.f1632n;
        this.f1633o = view;
        if (view != null) {
            boolean z2 = this.f1642x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1642x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1627i);
            }
            this.f1633o.addOnAttachStateChangeListener(this.f1628j);
        }
    }

    @Override // j.z
    public final boolean j(SubMenuC0138F subMenuC0138F) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0145g c0145g = (C0145g) it.next();
            if (subMenuC0138F == c0145g.f1619b) {
                c0145g.f1618a.f1766c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0138F.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0138F);
        y yVar = this.f1641w;
        if (yVar != null) {
            yVar.c(subMenuC0138F);
        }
        return true;
    }

    @Override // j.v
    public final void l(n nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        nVar.b(this, this.f1621b);
        if (b()) {
            v(nVar);
        } else {
            this.f1626g.add(nVar);
        }
    }

    @Override // j.v
    public final void n(View view) {
        if (this.f1632n != view) {
            this.f1632n = view;
            this.f1631m = Gravity.getAbsoluteGravity(this.f1630l, view.getLayoutDirection());
        }
    }

    @Override // j.v
    public final void o(boolean z2) {
        this.f1639u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0145g c0145g;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0145g = null;
                break;
            }
            c0145g = (C0145g) arrayList.get(i2);
            if (!c0145g.f1618a.y.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0145g != null) {
            c0145g.f1619b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.v
    public final void p(int i2) {
        if (this.f1630l != i2) {
            this.f1630l = i2;
            this.f1631m = Gravity.getAbsoluteGravity(i2, this.f1632n.getLayoutDirection());
        }
    }

    @Override // j.v
    public final void q(int i2) {
        this.f1635q = true;
        this.f1637s = i2;
    }

    @Override // j.v
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.y = (w) onDismissListener;
    }

    @Override // j.v
    public final void s(boolean z2) {
        this.f1640v = z2;
    }

    @Override // j.v
    public final void t(int i2) {
        this.f1636r = true;
        this.f1638t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(n nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0145g c0145g;
        View childAt;
        int i2;
        int i3;
        int i4;
        int width;
        MenuItem item;
        k kVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f1621b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        k kVar2 = new k(nVar, layoutInflaterFrom, this.f1624e, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f1639u) {
            kVar2.f1654c = true;
        } else if (b()) {
            kVar2.f1654c = v.u(nVar);
        }
        int iM = v.m(kVar2, context, this.f1622c);
        L0 l02 = new L0(context, null, this.f1623d);
        l02.f1804B = this.f1629k;
        l02.f1778p = this;
        l02.y.setOnDismissListener(this);
        l02.f1777o = this.f1632n;
        l02.f1774l = this.f1631m;
        l02.f1786x = true;
        l02.y.setFocusable(true);
        l02.y.setInputMethodMode(2);
        l02.o(kVar2);
        l02.r(iM);
        l02.f1774l = this.f1631m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0145g = (C0145g) arrayList.get(arrayList.size() - 1);
            n nVar2 = c0145g.f1619b;
            int size = nVar2.f1663f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    item = null;
                    break;
                }
                item = nVar2.getItem(i5);
                if (item.hasSubMenu() && nVar == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C0202t0 c0202t0 = c0145g.f1618a.f1766c;
                ListAdapter adapter = c0202t0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    kVar = (k) headerViewListAdapter.getWrappedAdapter();
                } else {
                    kVar = (k) adapter;
                    headersCount = 0;
                }
                int count = kVar.getCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == kVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - c0202t0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0202t0.getChildCount()) {
                    childAt = c0202t0.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt == null) {
                int i7 = Build.VERSION.SDK_INT;
                C0155C c0155c = l02.y;
                if (i7 <= 28) {
                    Method method = L0.f1803C;
                    if (method != null) {
                        try {
                            method.invoke(c0155c, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    J0.a(c0155c, false);
                }
                I0.a(l02.y, null);
                C0202t0 c0202t02 = ((C0145g) arrayList.get(arrayList.size() - 1)).f1618a.f1766c;
                int[] iArr = new int[2];
                c0202t02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f1633o.getWindowVisibleDisplayFrame(rect);
                if (this.f1634p == 1) {
                    i2 = (c0202t02.getWidth() + iArr[0]) + iM > rect.right ? 0 : 1;
                } else if (iArr[0] - iM < 0) {
                }
                boolean z2 = i2 == 1;
                this.f1634p = i2;
                if (Build.VERSION.SDK_INT >= 26) {
                    l02.f1777o = childAt;
                    i4 = 0;
                    i3 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f1632n.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f1631m & 7) == 5) {
                        iArr2[0] = this.f1632n.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i3 = iArr3[0] - iArr2[0];
                    i4 = iArr3[1] - iArr2[1];
                }
                if ((this.f1631m & 5) != 5) {
                    width = z2 ? i3 + childAt.getWidth() : i3 - iM;
                    l02.f1769f = width;
                    l02.f1773k = true;
                    l02.f1772j = true;
                    l02.m(i4);
                } else if (z2) {
                    width = i3 + iM;
                    l02.f1769f = width;
                    l02.f1773k = true;
                    l02.f1772j = true;
                    l02.m(i4);
                } else {
                    iM = childAt.getWidth();
                    l02.f1769f = width;
                    l02.f1773k = true;
                    l02.f1772j = true;
                    l02.m(i4);
                }
            } else {
                if (this.f1635q) {
                    l02.f1769f = this.f1637s;
                }
                if (this.f1636r) {
                    l02.m(this.f1638t);
                }
                Rect rect2 = this.f1721a;
                l02.f1785w = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0145g(l02, nVar, this.f1634p));
            l02.i();
            C0202t0 c0202t03 = l02.f1766c;
            c0202t03.setOnKeyListener(this);
            if (c0145g == null || !this.f1640v || nVar.f1669m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0202t03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(nVar.f1669m);
            c0202t03.addHeaderView(frameLayout, null, false);
            l02.i();
            return;
        }
        c0145g = null;
        childAt = null;
        if (childAt == null) {
        }
        arrayList.add(new C0145g(l02, nVar, this.f1634p));
        l02.i();
        C0202t0 c0202t032 = l02.f1766c;
        c0202t032.setOnKeyListener(this);
        if (c0145g == null) {
        }
    }
}
