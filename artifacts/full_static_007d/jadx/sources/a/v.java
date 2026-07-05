package a;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0052a;
import b0.C0080f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f779a;

    /* renamed from: b, reason: collision with root package name */
    public final C0080f f780b = new C0080f();

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.o f781c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f782d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f783e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f784f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f785g;

    public v(Runnable runnable) {
        this.f779a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f782d = i2 >= 34 ? new r(new o(0, this), new o(1, this), new p(this, 0), new p(this, 1)) : new q(0, new p(this, 2));
        }
    }

    public final void a() {
        Object objPrevious;
        if (this.f781c == null) {
            C0080f c0080f = this.f780b;
            ListIterator<E> listIterator = c0080f.listIterator(c0080f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((androidx.fragment.app.o) objPrevious).f1066a) {
                        break;
                    }
                }
            }
        }
        this.f781c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    public final void b() {
        androidx.fragment.app.o oVarPrevious;
        androidx.fragment.app.o oVar = this.f781c;
        if (oVar == null) {
            C0080f c0080f = this.f780b;
            c0080f.getClass();
            ListIterator listIterator = c0080f.listIterator(c0080f.f1230c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    oVarPrevious = listIterator.previous();
                    if (((androidx.fragment.app.o) oVarPrevious).f1066a) {
                        break;
                    }
                } else {
                    oVarPrevious = 0;
                    break;
                }
            }
            oVar = oVarPrevious;
        }
        this.f781c = null;
        if (oVar == null) {
            this.f779a.run();
            return;
        }
        androidx.fragment.app.t tVar = oVar.f1069d;
        tVar.e(true);
        if (!tVar.f1089g.f1066a) {
            tVar.f1088f.b();
            return;
        }
        tVar.e(false);
        tVar.d(true);
        ArrayList arrayList = tVar.f1078C;
        ArrayList arrayList2 = tVar.f1079D;
        ArrayList arrayList3 = tVar.f1086d;
        int size = (arrayList3 == null || arrayList3.isEmpty()) ? -1 : tVar.f1086d.size() - 1;
        if (size >= 0) {
            for (int size2 = tVar.f1086d.size() - 1; size2 >= size; size2--) {
                arrayList.add((C0052a) tVar.f1086d.remove(size2));
                arrayList2.add(Boolean.TRUE);
            }
            tVar.f1084b = true;
            try {
                tVar.i(tVar.f1078C, tVar.f1079D);
            } finally {
                tVar.a();
            }
        }
        tVar.j();
        tVar.f1085c.f1132b.values().removeAll(Collections.singleton(null));
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f783e;
        OnBackInvokedCallback onBackInvokedCallback = this.f782d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z2 && !this.f784f) {
            D.c.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f784f = true;
        } else {
            if (z2 || !this.f784f) {
                return;
            }
            D.c.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f784f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f785g;
        boolean z3 = false;
        C0080f c0080f = this.f780b;
        if (c0080f == null || !c0080f.isEmpty()) {
            Iterator<E> it = c0080f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.fragment.app.o) it.next()).f1066a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f785g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
