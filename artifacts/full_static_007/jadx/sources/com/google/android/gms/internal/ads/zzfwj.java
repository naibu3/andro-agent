package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfwj extends zzfww {
    final /* synthetic */ zzfwp zza;
    final /* synthetic */ zzfws zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfwn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfwj(zzfwn zzfwnVar, TaskCompletionSource taskCompletionSource, zzfwp zzfwpVar, zzfws zzfwsVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = zzfwpVar;
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
            zzfwn zzfwnVar = this.zzd;
            String str = zzfwnVar.zzd;
            zzfwp zzfwpVar = this.zza;
            String str2 = zzfwnVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzfwpVar.zzf());
            bundle.putString("adFieldEnifd", zzfwpVar.zzg());
            bundle.putInt("layoutGravity", zzfwpVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfwpVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfwpVar.zze());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", true);
            bundle.putString("callerPackage", str2);
            if (zzfwpVar.zzh() != null) {
                bundle.putString("appId", zzfwpVar.zzh());
            }
            Zze.zzf(str, bundle, new zzfwm(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfwn.zzb.zzb(e, "show overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
