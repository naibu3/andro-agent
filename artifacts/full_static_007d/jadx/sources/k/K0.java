package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class K0 extends C0202t0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f1795m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1796n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f1797o;

    /* renamed from: p, reason: collision with root package name */
    public j.p f1798p;

    public K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f1795m = 21;
            this.f1796n = 22;
        } else {
            this.f1795m = 22;
            this.f1796n = 21;
        }
    }

    @Override // k.C0202t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        j.k kVar;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f1797o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                kVar = (j.k) headerViewListAdapter.getWrappedAdapter();
            } else {
                kVar = (j.k) adapter;
                headersCount = 0;
            }
            j.p item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= kVar.getCount()) ? null : kVar.getItem(i2);
            j.p pVar = this.f1798p;
            if (pVar != item) {
                j.n nVar = kVar.f1652a;
                if (pVar != null) {
                    this.f1797o.l(nVar, pVar);
                }
                this.f1798p = item;
                if (item != null) {
                    this.f1797o.f(nVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f1795m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f1796n) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (j.k) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (j.k) adapter).f1652a.c(false);
        return true;
    }

    public void setHoverListener(H0 h0) {
        this.f1797o = h0;
    }

    @Override // k.C0202t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
