package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class aa extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ IBinder f310a;
    final /* synthetic */ ad b;

    aa(ad adVar, IBinder iBinder) {
        this.f310a = iBinder;
        this.b = adVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() throws RemoteException {
        this.b.f312a.o = (IInterface) this.b.f312a.j.a(this.f310a);
        ae.r(this.b.f312a);
        this.b.f312a.h = false;
        Iterator it = this.b.f312a.e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.b.f312a.e.clear();
    }
}
