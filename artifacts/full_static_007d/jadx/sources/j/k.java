package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final n f1652a;

    /* renamed from: b, reason: collision with root package name */
    public int f1653b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1654c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1655d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f1656e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1657f;

    public k(n nVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f1655d = z2;
        this.f1656e = layoutInflater;
        this.f1652a = nVar;
        this.f1657f = i2;
        a();
    }

    public final void a() {
        n nVar = this.f1652a;
        p pVar = nVar.f1678v;
        if (pVar != null) {
            nVar.i();
            ArrayList arrayList = nVar.f1666j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((p) arrayList.get(i2)) == pVar) {
                    this.f1653b = i2;
                    return;
                }
            }
        }
        this.f1653b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i2) {
        ArrayList arrayListL;
        n nVar = this.f1652a;
        if (this.f1655d) {
            nVar.i();
            arrayListL = nVar.f1666j;
        } else {
            arrayListL = nVar.l();
        }
        int i3 = this.f1653b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (p) arrayListL.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        n nVar = this.f1652a;
        if (this.f1655d) {
            nVar.i();
            arrayListL = nVar.f1666j;
        } else {
            arrayListL = nVar.l();
        }
        return this.f1653b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f1656e.inflate(this.f1657f, viewGroup, false);
        }
        int i3 = getItem(i2).f1688b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f1688b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1652a.m() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0133A interfaceC0133A = (InterfaceC0133A) view;
        if (this.f1654c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0133A.c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
