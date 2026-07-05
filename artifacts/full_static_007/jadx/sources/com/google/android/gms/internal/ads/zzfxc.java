package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfxc extends zzfww {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfxf zzb;

    zzfxc(zzfxf zzfxfVar, IBinder iBinder) {
        this.zza = iBinder;
        this.zzb = zzfxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zza() throws RemoteException {
        this.zzb.zza.zzn = zzfvn.zzb(this.zza);
        zzfxg.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        Iterator it = this.zzb.zza.zze.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzb.zza.zze.clear();
    }
}
