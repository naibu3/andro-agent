package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfde implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzctg zzd;
    final /* synthetic */ zzfdf zze;

    zzfde(zzfdf zzfdfVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzctg zzctgVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzctgVar;
        this.zze = zzfdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzfmn zzfmnVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzdB(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzik)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzdB(zzeVarZza);
                    }
                });
            }
            zzfdf zzfdfVar = this.zze;
            zzfdfVar.zzh.zzd(zzfdfVar.zzj.zzc());
            zzfil.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zzi;
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
        zzcsf zzcsfVar = (zzcsf) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcsfVar.zzc() != null) {
                ViewParent parent = zzcsfVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Banner view provided from " + (zzcsfVar.zzl() != null ? zzcsfVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcsfVar.zzc());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzik)).booleanValue()) {
                zzddq zzddqVarZzn = zzcsfVar.zzn();
                zzddqVarZzn.zza(this.zze.zzd);
                zzddqVarZzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcsfVar.zzc());
            this.zza.zzb(zzcsfVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzik)).booleanValue()) {
                zzfdf zzfdfVar = this.zze;
                Executor executor = zzfdfVar.zzb;
                final zzepc zzepcVar = zzfdfVar.zzd;
                Objects.requireNonNull(zzepcVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzepcVar.zzs();
                    }
                });
            }
            this.zze.zzh.zzd(zzcsfVar.zza());
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue() || (zzfmnVar = this.zzb) == null) {
                zzfmq zzfmqVar = this.zze.zzi;
                zzfmc zzfmcVar = this.zzc;
                zzfmcVar.zzb(zzcsfVar.zzp().zzb);
                zzfmcVar.zze(zzcsfVar.zzl().zzg());
                zzfmcVar.zzh(true);
                zzfmqVar.zzb(zzfmcVar.zzn());
            } else {
                zzfmnVar.zzh(zzcsfVar.zzp().zzb);
                zzfmnVar.zzf(zzcsfVar.zzl().zzg());
                zzfmc zzfmcVar2 = this.zzc;
                zzfmcVar2.zzh(true);
                zzfmnVar.zza(zzfmcVar2);
                zzfmnVar.zzi();
            }
        }
    }
}
