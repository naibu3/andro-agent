package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfgd implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzfgf zzd;
    final /* synthetic */ zzfgg zze;

    zzfgd(zzfgg zzfggVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzfgf zzfgfVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzfgfVar;
        this.zze = zzfggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmn zzfmnVar;
        zzdrm zzdrmVar = (zzdrm) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdrmVar == null ? zzfiq.zzb(th, null) : zzdrmVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzdrmVar != null) {
                zzdrmVar.zza().zzdB(zzeVarZzb);
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzdB(zzeVarZzb);
                    }
                });
            } else {
                this.zze.zzd.zzdB(zzeVarZzb);
                this.zze.zzk(this.zzd).zzh().zzb().zzc().zzh();
            }
            zzfil.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zzg;
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
        zzdrh zzdrhVar = (zzdrh) obj;
        synchronized (this.zze) {
            zzdrhVar.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdrhVar);
            zzfgg zzfggVar = this.zze;
            Executor executor = zzfggVar.zzb;
            final zzffw zzffwVar = zzfggVar.zzd;
            Objects.requireNonNull(zzffwVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgc
                @Override // java.lang.Runnable
                public final void run() {
                    zzffwVar.zzs();
                }
            });
            this.zze.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zzg;
                zzfmc zzfmcVar = this.zzc;
                zzfmcVar.zzb(zzdrhVar.zzp().zzb);
                zzfmcVar.zze(zzdrhVar.zzl().zzg());
                zzfmcVar.zzh(true);
                zzfmqVar.zzb(zzfmcVar.zzn());
            } else {
                zzfmnVar.zzh(zzdrhVar.zzp().zzb);
                zzfmnVar.zzf(zzdrhVar.zzl().zzg());
                zzfmc zzfmcVar2 = this.zzc;
                zzfmcVar2.zzh(true);
                zzfmnVar.zza(zzfmcVar2);
                zzfmnVar.zzi();
            }
        }
    }
}
