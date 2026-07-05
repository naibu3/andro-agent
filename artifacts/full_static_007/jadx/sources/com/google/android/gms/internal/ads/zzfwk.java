package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfwk extends zzfww {
    final /* synthetic */ zzfwe zza;
    final /* synthetic */ zzfws zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfwn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwk(zzfwn zzfwnVar, TaskCompletionSource taskCompletionSource, zzfwe zzfweVar, zzfws zzfwsVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfweVar;
        this.zzb = zzfwsVar;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfwnVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfvo] */
    @Override // com.google.android.gms.internal.ads.zzfww
    protected final void zza() {
        try {
            ?? Zze = this.zzd.zza.zze();
            if (Zze == 0) {
                return;
            }
            zzfwe zzfweVar = this.zza;
            String str = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfweVar.zzb());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfweVar.zza());
            Zze.zze(bundle, new zzfwm(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfwn.zzb.zzb(e, "dismiss overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
