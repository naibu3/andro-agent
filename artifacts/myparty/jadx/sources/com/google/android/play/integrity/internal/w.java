package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class w extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f330a;
    final /* synthetic */ t b;
    final /* synthetic */ ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f330a = taskCompletionSource2;
        this.b = tVar;
        this.c = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.c.g) {
            ae.o(this.c, this.f330a);
            if (this.c.m.getAndIncrement() > 0) {
                this.c.c.d("Already connected to the service.", new Object[0]);
            }
            ae.q(this.c, this.b);
        }
    }
}
