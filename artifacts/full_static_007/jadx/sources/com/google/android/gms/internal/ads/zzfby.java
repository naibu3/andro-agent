package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfby implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzfca zzd;
    final /* synthetic */ zzfcb zze;

    zzfby(zzfcb zzfcbVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzfca zzfcaVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzfcaVar;
        this.zze = zzfcbVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcrp, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmn zzfmnVar;
        zzcrp zzcrpVar = (zzcrp) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcrpVar == null ? zzfiq.zzb(th, null) : zzcrpVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcrpVar != null) {
                zzcrpVar.zzc().zzdB(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzil)).booleanValue()) {
                    this.zze.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbx
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdB(zzeVarZzb);
                        }
                    });
                }
            } else {
                this.zze.zzd.zzdB(zzeVarZzb);
                this.zze.zzm(this.zzd).zzh().zzb().zzc().zzh();
            }
            zzfil.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zzh;
                zzfmc zzfmcVar = this.zzc;
                zzfmcVar.zza(zzeVarZzb);
                zzfmcVar.zzi(th);
                zzfmcVar.zzh(false);
                zzfmqVar.zzb(zzfmcVar.zzn());
            } else {
                zzfmnVar.zzc(zzeVarZzb);
                zzfmc zzfmcVar2 = this.zzc;
                zzfmcVar2.zzi(th);
                zzfmcVar2.zzh(false);
                zzfmnVar.zza(zzfmcVar2);
                zzfmnVar.zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfmn zzfmnVar;
        zzcup zzcupVar = (zzcup) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzil)).booleanValue()) {
                zzcupVar.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcupVar);
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zzh;
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
