package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import j.InterfaceC0133A;
import j.InterfaceC0134B;
import j.SubMenuC0138F;
import java.util.ArrayList;
import org.conscrypt.R;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184k implements j.z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1951a;

    /* renamed from: b, reason: collision with root package name */
    public Context f1952b;

    /* renamed from: c, reason: collision with root package name */
    public j.n f1953c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f1954d;

    /* renamed from: e, reason: collision with root package name */
    public j.y f1955e;
    public InterfaceC0134B h;

    /* renamed from: i, reason: collision with root package name */
    public C0182j f1958i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1959j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1960k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1961l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1962m;

    /* renamed from: n, reason: collision with root package name */
    public int f1963n;

    /* renamed from: o, reason: collision with root package name */
    public int f1964o;

    /* renamed from: p, reason: collision with root package name */
    public int f1965p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1966q;

    /* renamed from: s, reason: collision with root package name */
    public C0176g f1968s;

    /* renamed from: t, reason: collision with root package name */
    public C0176g f1969t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0180i f1970u;

    /* renamed from: v, reason: collision with root package name */
    public C0178h f1971v;

    /* renamed from: f, reason: collision with root package name */
    public final int f1956f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f1957g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f1967r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final A.f f1972w = new A.f(24, this);

    public C0184k(Context context) {
        this.f1951a = context;
        this.f1954d = LayoutInflater.from(context);
    }

    @Override // j.z
    public final void a(j.n nVar, boolean z2) {
        e();
        C0176g c0176g = this.f1969t;
        if (c0176g != null && c0176g.b()) {
            c0176g.f1730i.dismiss();
        }
        j.y yVar = this.f1955e;
        if (yVar != null) {
            yVar.a(nVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j.A] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(j.p pVar, View view, ViewGroup viewGroup) {
        View actionView = pVar.getActionView();
        if (actionView == null || pVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0133A ? (InterfaceC0133A) view : (InterfaceC0133A) this.f1954d.inflate(this.f1957g, viewGroup, false);
            actionMenuItemView.c(pVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f1971v == null) {
                this.f1971v = new C0178h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f1971v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(pVar.f1686C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0188m)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.z
    public final void c() {
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            j.n nVar = this.f1953c;
            if (nVar != null) {
                nVar.i();
                ArrayList arrayListL = this.f1953c.l();
                int size = arrayListL.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    j.p pVar = (j.p) arrayListL.get(i3);
                    if (pVar.f()) {
                        View childAt = viewGroup.getChildAt(i2);
                        j.p itemData = childAt instanceof InterfaceC0133A ? ((InterfaceC0133A) childAt).getItemData() : null;
                        View viewB = b(pVar, childAt, viewGroup);
                        if (pVar != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.h).addView(viewB, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f1958i) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.h).requestLayout();
        j.n nVar2 = this.f1953c;
        if (nVar2 != null) {
            nVar2.i();
            ArrayList arrayList2 = nVar2.f1665i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                j.q qVar = ((j.p) arrayList2.get(i4)).f1684A;
            }
        }
        j.n nVar3 = this.f1953c;
        if (nVar3 != null) {
            nVar3.i();
            arrayList = nVar3.f1666j;
        }
        if (this.f1961l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((j.p) arrayList.get(0)).f1686C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1958i == null) {
                this.f1958i = new C0182j(this, this.f1951a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1958i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1958i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0182j c0182j = this.f1958i;
                actionMenuView.getClass();
                C0188m c0188mI = ActionMenuView.i();
                c0188mI.f1973a = true;
                actionMenuView.addView(c0182j, c0188mI);
            }
        } else {
            C0182j c0182j2 = this.f1958i;
            if (c0182j2 != null) {
                Object parent = c0182j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1958i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f1961l);
    }

    @Override // j.z
    public final boolean d(j.p pVar) {
        return false;
    }

    public final boolean e() {
        Object obj;
        RunnableC0180i runnableC0180i = this.f1970u;
        if (runnableC0180i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0180i);
            this.f1970u = null;
            return true;
        }
        C0176g c0176g = this.f1968s;
        if (c0176g == null) {
            return false;
        }
        if (c0176g.b()) {
            c0176g.f1730i.dismiss();
        }
        return true;
    }

    @Override // j.z
    public final void f(Context context, j.n nVar) {
        this.f1952b = context;
        LayoutInflater.from(context);
        this.f1953c = nVar;
        Resources resources = context.getResources();
        if (!this.f1962m) {
            this.f1961l = true;
        }
        int i2 = 2;
        this.f1963n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f1965p = i2;
        int measuredWidth = this.f1963n;
        if (this.f1961l) {
            if (this.f1958i == null) {
                C0182j c0182j = new C0182j(this, this.f1951a);
                this.f1958i = c0182j;
                if (this.f1960k) {
                    c0182j.setImageDrawable(this.f1959j);
                    this.f1959j = null;
                    this.f1960k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1958i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1958i.getMeasuredWidth();
        } else {
            this.f1958i = null;
        }
        this.f1964o = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // j.z
    public final boolean g() {
        int size;
        ArrayList arrayListL;
        int i2;
        boolean z2;
        j.n nVar = this.f1953c;
        if (nVar != null) {
            arrayListL = nVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i3 = this.f1965p;
        int i4 = this.f1964o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= size) {
                break;
            }
            j.p pVar = (j.p) arrayListL.get(i5);
            int i8 = pVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f1966q && pVar.f1686C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f1961l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f1967r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            j.p pVar2 = (j.p) arrayListL.get(i10);
            int i12 = pVar2.y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = pVar2.f1688b;
            if (z4) {
                View viewB = b(pVar2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                pVar2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View viewB2 = b(pVar2, null, viewGroup);
                    viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewB2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        j.p pVar3 = (j.p) arrayListL.get(i14);
                        if (pVar3.f1688b == i13) {
                            if (pVar3.f()) {
                                i9++;
                            }
                            pVar3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                pVar2.g(z6);
            } else {
                pVar2.g(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    @Override // j.z
    public final void h(j.y yVar) {
        throw null;
    }

    public final boolean i() {
        C0176g c0176g = this.f1968s;
        return c0176g != null && c0176g.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.z
    public final boolean j(SubMenuC0138F subMenuC0138F) {
        boolean z2;
        if (!subMenuC0138F.hasVisibleItems()) {
            return false;
        }
        SubMenuC0138F subMenuC0138F2 = subMenuC0138F;
        while (true) {
            j.n nVar = subMenuC0138F2.f1592z;
            if (nVar == this.f1953c) {
                break;
            }
            subMenuC0138F2 = (SubMenuC0138F) nVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof InterfaceC0133A) && ((InterfaceC0133A) childAt).getItemData() == subMenuC0138F2.f1591A) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0138F.f1591A.getClass();
        int size = subMenuC0138F.f1663f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0138F.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0176g c0176g = new C0176g(this, this.f1952b, subMenuC0138F, view);
        this.f1969t = c0176g;
        c0176g.f1729g = z2;
        j.v vVar = c0176g.f1730i;
        if (vVar != null) {
            vVar.o(z2);
        }
        C0176g c0176g2 = this.f1969t;
        if (!c0176g2.b()) {
            if (c0176g2.f1727e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0176g2.d(0, 0, false, false);
        }
        j.y yVar = this.f1955e;
        if (yVar != null) {
            yVar.c(subMenuC0138F);
        }
        return true;
    }

    @Override // j.z
    public final boolean k(j.p pVar) {
        return false;
    }

    public final boolean l() {
        j.n nVar;
        if (!this.f1961l || i() || (nVar = this.f1953c) == null || this.h == null || this.f1970u != null) {
            return false;
        }
        nVar.i();
        if (nVar.f1666j.isEmpty()) {
            return false;
        }
        RunnableC0180i runnableC0180i = new RunnableC0180i(this, new C0176g(this, this.f1952b, this.f1953c, this.f1958i));
        this.f1970u = runnableC0180i;
        ((View) this.h).post(runnableC0180i);
        return true;
    }
}
