package H;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class V extends X {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f343a;

    public V() {
        this.f343a = C0.k.b();
    }

    @Override // H.X
    public f0 b() {
        a();
        f0 f0VarC = f0.c(this.f343a.build(), null);
        f0VarC.f366a.k(null);
        return f0VarC;
    }

    @Override // H.X
    public void c(A.c cVar) {
        this.f343a.setStableInsets(cVar.b());
    }

    @Override // H.X
    public void d(A.c cVar) {
        this.f343a.setSystemWindowInsets(cVar.b());
    }

    public V(f0 f0Var) {
        WindowInsets.Builder builderB;
        super(f0Var);
        WindowInsets windowInsetsB = f0Var.b();
        if (windowInsetsB != null) {
            builderB = C0.k.c(windowInsetsB);
        } else {
            builderB = C0.k.b();
        }
        this.f343a = builderB;
    }
}
