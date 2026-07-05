package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfev implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzdjh zzd;
    final /* synthetic */ zzfew zze;

    zzfev(zzfew zzfewVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzdjh zzdjhVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzdjhVar;
        this.zze = zzfewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmn zzfmnVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzdB(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzim)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzdB(zzeVarZza);
                    }
                });
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfes
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zze.zzdB(zzeVarZza);
                    }
                });
            }
            zzfil.zzb(zzeVarZza.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zzg;
                zzfmc zzfmcVar = this.zzc;
                zzfmcVar.zza(zzeVarZza);
                zzfmcVar.zzi(th);
                zzfmcVar.zzh(false);
                zzfmqVar.zzb(zzfmcVar.zzn());
            } else {
                zzfmnVar.zzc(zzeVarZza);
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
        zzdig zzdigVar = (zzdig) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzim)).booleanValue()) {
                zzddq zzddqVarZzn = zzdigVar.zzn();
                zzddqVarZzn.zza(this.zze.zzd);
                zzddqVarZzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdigVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzim)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfet
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzs();
                    }
                });
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zze.zzs();
                    }
                });
            }
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zzg;
                zzfmc zzfmcVar = this.zzc;
                zzfmcVar.zzb(zzdigVar.zzp().zzb);
                zzfmcVar.zze(zzdigVar.zzl().zzg());
                zzfmcVar.zzh(true);
                zzfmqVar.zzb(zzfmcVar.zzn());
            } else {
                zzfmnVar.zzh(zzdigVar.zzp().zzb);
                zzfmnVar.zzf(zzdigVar.zzl().zzg());
                zzfmc zzfmcVar2 = this.zzc;
                zzfmcVar2.zzh(true);
                zzfmnVar.zza(zzfmcVar2);
                zzfmnVar.zzi();
            }
        }
    }
}
