package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfwl extends zzfww {
    final /* synthetic */ zzfwu zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfws zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfwn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwl(zzfwn zzfwnVar, TaskCompletionSource taskCompletionSource, zzfwu zzfwuVar, int i, zzfws zzfwsVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfwuVar;
        this.zzb = i;
        this.zzc = zzfwsVar;
        this.zzd = taskCompletionSource2;
        this.zze = zzfwnVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfvo] */
    @Override // com.google.android.gms.internal.ads.zzfww
    protected final void zza() {
        try {
            ?? Zze = this.zze.zza.zze();
            if (Zze == 0) {
                return;
            }
            zzfwu zzfwuVar = this.zza;
            String str = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfwuVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfwuVar.zza());
            Zze.zzg(bundle, new zzfwm(this.zze, this.zzc));
        } catch (RemoteException e) {
            zzfwn.zzb.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), this.zze.zzd);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
