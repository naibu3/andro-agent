package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class x extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f331a;

    x(ae aeVar) {
        this.f331a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f331a.g) {
            if (this.f331a.m.get() > 0 && this.f331a.m.decrementAndGet() > 0) {
                this.f331a.c.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            ae aeVar = this.f331a;
            if (aeVar.o != null) {
                aeVar.c.d("Unbind from service.", new Object[0]);
                ae aeVar2 = this.f331a;
                aeVar2.b.unbindService(aeVar2.n);
                this.f331a.h = false;
                this.f331a.o = null;
                this.f331a.n = null;
            }
            this.f331a.x();
        }
    }
}
