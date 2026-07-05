package M;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends C0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f526a;

    public e(f fVar) {
        this.f526a = fVar;
    }

    @Override // C0.d
    public final void A(v vVar) {
        f fVar = this.f526a;
        fVar.f529c = vVar;
        v vVar2 = fVar.f529c;
        j jVar = fVar.f527a;
        fVar.f528b = new D0.h(vVar2, jVar.f540g, jVar.f541i, Build.VERSION.SDK_INT >= 34 ? o.a() : C0.f.p());
        j jVar2 = fVar.f527a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f534a.writeLock().lock();
        try {
            jVar2.f536c = 1;
            arrayList.addAll(jVar2.f535b);
            jVar2.f535b.clear();
            jVar2.f534a.writeLock().unlock();
            jVar2.f537d.post(new h(arrayList, jVar2.f536c, null));
        } catch (Throwable th) {
            jVar2.f534a.writeLock().unlock();
            throw th;
        }
    }

    @Override // C0.d
    public final void z(Throwable th) {
        this.f526a.f527a.d(th);
    }
}
