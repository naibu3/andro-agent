package E;

import H.N;
import Z.s;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.t;
import g.K;
import g.w;
import htb.d3vnu11.securenotes.NoteActivity;
import j0.AbstractC0150d;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import k.C0202t0;
import org.conscrypt.ct.CTConstants;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f269b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f268a = i2;
        this.f269b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0.a aVarC;
        long jNanoTime;
        switch (this.f268a) {
            case 0:
                Object obj = ((A.f) this.f269b).f8b;
                return;
            case 1:
                K.d dVar = (K.d) this.f269b;
                if (dVar.f504o) {
                    boolean z2 = dVar.f502m;
                    K.a aVar = dVar.f491a;
                    if (z2) {
                        dVar.f502m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f486e = jCurrentAnimationTimeMillis;
                        aVar.f488g = -1L;
                        aVar.f487f = jCurrentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f488g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f488g + aVar.f489i) || !dVar.e()) {
                        dVar.f504o = false;
                        return;
                    }
                    boolean z3 = dVar.f503n;
                    ListView listView = dVar.f493c;
                    if (z3) {
                        dVar.f503n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f487f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - aVar.f487f;
                    aVar.f487f = jCurrentAnimationTimeMillis2;
                    dVar.f506q.scrollListBy((int) (j2 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f485d));
                    WeakHashMap weakHashMap = N.f327a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                Z.l lVar = (Z.l) this.f269b;
                lVar.f715b.h.setVisibility(8);
                Toast.makeText(lVar.f715b, "Login successful", 0).show();
                lVar.f715b.setResult(-1);
                lVar.f715b.finish();
                return;
            case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                Z.l lVar2 = (Z.l) this.f269b;
                lVar2.f715b.h.setVisibility(8);
                Toast.makeText(lVar2.f715b, "Registration successful", 0).show();
                lVar2.f715b.setResult(-1);
                lVar2.f715b.finish();
                return;
            case 4:
                NoteActivity noteActivity = ((s) this.f269b).f730a;
                noteActivity.f1507f.b(noteActivity.f1502a, new A.f(13, this));
                return;
            case 5:
                s sVar = (s) this.f269b;
                NoteActivity noteActivity2 = sVar.f730a;
                int i2 = NoteActivity.h;
                noteActivity2.f(false);
                Toast.makeText(sVar.f730a, "Note deleted successfully", 0).show();
                sVar.f730a.setResult(-1);
                sVar.f730a.finish();
                return;
            case 6:
                ((t) this.f269b).e(true);
                return;
            case 7:
                K k2 = (K) this.f269b;
                w wVar = k2.f1370b;
                Menu menuP = k2.p();
                j.n nVar = menuP instanceof j.n ? (j.n) menuP : null;
                if (nVar != null) {
                    nVar.w();
                }
                try {
                    menuP.clear();
                    if (!wVar.onCreatePanelMenu(0, menuP) || !wVar.onPreparePanel(0, null, menuP)) {
                        menuP.clear();
                    }
                    if (nVar != null) {
                        nVar.v();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (nVar != null) {
                        nVar.v();
                    }
                    throw th;
                }
            case CTConstants.TIMESTAMP_LENGTH /* 8 */:
                C0202t0 c0202t0 = (C0202t0) this.f269b;
                c0202t0.f2028l = null;
                c0202t0.drawableStateChanged();
                return;
            case 9:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f269b;
                if (searchView$SearchAutoComplete.f903f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f903f = false;
                    return;
                }
                return;
            case 10:
                ((Toolbar) this.f269b).u();
                return;
        }
        while (true) {
            x0.d dVar2 = (x0.d) this.f269b;
            synchronized (dVar2) {
                aVarC = dVar2.c();
            }
            if (aVarC == null) {
                return;
            }
            x0.b bVar = aVarC.f2838c;
            AbstractC0150d.b(bVar);
            x0.d dVar3 = (x0.d) this.f269b;
            boolean zIsLoggable = x0.d.f2847i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                x0.c cVar = bVar.f2840a.f2848a;
                jNanoTime = System.nanoTime();
                C0.d.d(aVarC, bVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                x0.d.a(dVar3, aVarC);
                if (zIsLoggable) {
                    x0.c cVar2 = bVar.f2840a.f2848a;
                    C0.d.d(aVarC, bVar, AbstractC0150d.h(C0.d.q(System.nanoTime() - jNanoTime), "finished run in "));
                }
            } catch (Throwable th2) {
                try {
                    ((ThreadPoolExecutor) dVar3.f2848a.f2846a).execute(this);
                    throw th2;
                } catch (Throwable th3) {
                    if (zIsLoggable) {
                        x0.c cVar3 = bVar.f2840a.f2848a;
                        C0.d.d(aVarC, bVar, AbstractC0150d.h(C0.d.q(System.nanoTime() - jNanoTime), "failed a run in "));
                    }
                    throw th3;
                }
            }
        }
    }

    public b(A.f fVar, int i2) {
        this.f268a = 0;
        this.f269b = fVar;
    }
}
