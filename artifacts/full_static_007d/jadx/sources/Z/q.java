package Z;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0109g;
import htb.d3vnu11.securenotes.MainActivity;
import i.AbstractC0120b;
import k.Z0;

/* loaded from: classes.dex */
public final class q implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f725b;

    public /* synthetic */ q(int i2, Object obj) {
        this.f724a = i2;
        this.f725b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f724a) {
            case 0:
                p pVar = (p) this.f725b;
                pVar.f723a.accountManager.c();
                MainActivity mainActivity = pVar.f723a;
                mainActivity.updateLoginButton();
                mainActivity.loadNotes();
                break;
            case 1:
                C0109g c0109g = (C0109g) this.f725b;
                Button button = c0109g.f1430f;
                c0109g.f1445v.obtainMessage(1, c0109g.f1426b).sendToTarget();
                break;
            case 2:
                ((AbstractC0120b) this.f725b).a();
                break;
            default:
                Z0 z02 = ((Toolbar) this.f725b).f917M;
                j.p pVar2 = z02 == null ? null : z02.f1872b;
                if (pVar2 != null) {
                    pVar2.collapseActionView();
                    break;
                }
                break;
        }
    }
}
