package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbpi implements zzccr {
    final /* synthetic */ zzbps zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ zzbpt zzc;

    zzbpi(zzbpt zzbptVar, zzbps zzbpsVar, zzfmc zzfmcVar) {
        this.zza = zzbpsVar;
        this.zzb = zzfmcVar;
        this.zzc = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccr
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbpt zzbptVar = this.zzc;
            if (zzbptVar.zzh != null && this.zza != zzbptVar.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbgd.zzd.zze()).booleanValue()) {
                zzbpt zzbptVar2 = this.zzc;
                if (zzbptVar2.zze != null) {
                    zzfmq zzfmqVar = zzbptVar2.zze;
                    zzfmc zzfmcVar = this.zzb;
                    zzfmcVar.zzh(true);
                    zzfmqVar.zzb(zzfmcVar.zzn());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
