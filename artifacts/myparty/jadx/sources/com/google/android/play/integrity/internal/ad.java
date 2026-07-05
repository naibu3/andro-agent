package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class ad implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f312a;

    /* synthetic */ ad(ae aeVar, ac acVar) {
        this.f312a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f312a.c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f312a.c().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f312a.c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f312a.c().post(new ab(this));
    }
}
