package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzepy implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzdkd zzd;
    final /* synthetic */ zzepz zze;

    zzepy(zzepz zzepzVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzdkd zzdkdVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzdkdVar;
        this.zze = zzepzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmn zzfmnVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdB(zzeVarZza);
        this.zze.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze.zzd.zza().zzdB(zzeVarZza);
            }
        });
        zzfil.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
            zzfmnVar.zzc(zzeVarZza);
            zzfmc zzfmcVar = this.zzc;
            zzfmcVar.zzi(th);
            zzfmcVar.zzh(false);
            zzfmnVar.zza(zzfmcVar);
            zzfmnVar.zzi();
            return;
        }
        zzepz zzepzVar = this.zze;
        zzfmc zzfmcVar2 = this.zzc;
        zzfmq zzfmqVar = zzepzVar.zze;
        zzfmcVar2.zza(zzeVarZza);
        zzfmcVar2.zzi(th);
        zzfmcVar2.zzh(false);
        zzfmqVar.zzb(zzfmcVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfmn zzfmnVar;
        zzcup zzcupVar = (zzcup) obj;
        synchronized (this.zze) {
            zzcupVar.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcupVar);
            this.zze.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze.zzd.zzb().zzs();
                }
            });
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zze;
                zzfmc zzfmcVar = this.zzc;
                zzfmcVar.zzb(zzcupVar.zzp().zzb);
                zzfmcVar.zze(zzcupVar.zzl().zzg());
                zzfmcVar.zzh(true);
                zzfmqVar.zzb(zzfmcVar.zzn());
            } else {
                zzfmnVar.zzh(zzcupVar.zzp().zzb);
                zzfmnVar.zzf(zzcupVar.zzl().zzg());
                zzfmc zzfmcVar2 = this.zzc;
                zzfmcVar2.zzh(true);
                zzfmnVar.zza(zzfmcVar2);
                zzfmnVar.zzi();
            }
        }
    }
}
