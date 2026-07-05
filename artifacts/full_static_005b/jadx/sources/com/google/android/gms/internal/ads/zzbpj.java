package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbpj implements zzccp {
    final /* synthetic */ zzbps zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ zzbpt zzc;

    zzbpj(zzbpt zzbptVar, zzbps zzbpsVar, zzfmc zzfmcVar) {
        this.zza = zzbpsVar;
        this.zzb = zzfmcVar;
        this.zzc = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbgd.zzd.zze()).booleanValue()) {
                zzbpt zzbptVar = this.zzc;
                if (zzbptVar.zze != null) {
                    zzfmq zzfmqVar = zzbptVar.zze;
                    zzfmc zzfmcVar = this.zzb;
                    zzfmcVar.zzc("Failed loading new engine");
                    zzfmcVar.zzh(false);
                    zzfmqVar.zzb(zzfmcVar.zzn());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
