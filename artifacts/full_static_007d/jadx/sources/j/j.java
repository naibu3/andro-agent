package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0106d;
import g.DialogC0110h;

/* loaded from: classes.dex */
public final class j implements z, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f1646a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f1647b;

    /* renamed from: c, reason: collision with root package name */
    public n f1648c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f1649d;

    /* renamed from: e, reason: collision with root package name */
    public y f1650e;

    /* renamed from: f, reason: collision with root package name */
    public i f1651f;

    public j(ContextWrapper contextWrapper) {
        this.f1646a = contextWrapper;
        this.f1647b = LayoutInflater.from(contextWrapper);
    }

    @Override // j.z
    public final void a(n nVar, boolean z2) {
        y yVar = this.f1650e;
        if (yVar != null) {
            yVar.a(nVar, z2);
        }
    }

    @Override // j.z
    public final void c() {
        i iVar = this.f1651f;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // j.z
    public final boolean d(p pVar) {
        return false;
    }

    @Override // j.z
    public final void f(Context context, n nVar) {
        if (this.f1646a != null) {
            this.f1646a = context;
            if (this.f1647b == null) {
                this.f1647b = LayoutInflater.from(context);
            }
        }
        this.f1648c = nVar;
        i iVar = this.f1651f;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // j.z
    public final boolean g() {
        return false;
    }

    @Override // j.z
    public final void h(y yVar) {
        throw null;
    }

    @Override // j.z
    public final boolean j(SubMenuC0138F subMenuC0138F) {
        if (!subMenuC0138F.hasVisibleItems()) {
            return false;
        }
        o oVar = new o();
        oVar.f1681a = subMenuC0138F;
        Context context = subMenuC0138F.f1658a;
        B0.F f2 = new B0.F(context);
        C0106d c0106d = (C0106d) f2.f80b;
        j jVar = new j(c0106d.f1415a);
        oVar.f1683c = jVar;
        jVar.f1650e = oVar;
        subMenuC0138F.b(jVar, context);
        j jVar2 = oVar.f1683c;
        if (jVar2.f1651f == null) {
            jVar2.f1651f = new i(jVar2);
        }
        c0106d.f1421g = jVar2.f1651f;
        c0106d.h = oVar;
        View view = subMenuC0138F.f1671o;
        if (view != null) {
            c0106d.f1419e = view;
        } else {
            c0106d.f1417c = subMenuC0138F.f1670n;
            c0106d.f1418d = subMenuC0138F.f1669m;
        }
        c0106d.f1420f = oVar;
        DialogC0110h dialogC0110hA = f2.a();
        oVar.f1682b = dialogC0110hA;
        dialogC0110hA.setOnDismissListener(oVar);
        WindowManager.LayoutParams attributes = oVar.f1682b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        oVar.f1682b.show();
        y yVar = this.f1650e;
        if (yVar == null) {
            return true;
        }
        yVar.c(subMenuC0138F);
        return true;
    }

    @Override // j.z
    public final boolean k(p pVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f1648c.q(this.f1651f.getItem(i2), this, 0);
    }
}
