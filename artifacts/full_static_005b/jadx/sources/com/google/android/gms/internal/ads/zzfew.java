package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfew implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzepc zzd;
    private final zzffw zze;
    private zzbfk zzf;
    private final zzfmq zzg;
    private final zzfhm zzh;
    private ListenableFuture zzi;

    public zzfew(Context context, Executor executor, zzcjd zzcjdVar, zzepc zzepcVar, zzffw zzffwVar, zzfhm zzfhmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjdVar;
        this.zzd = zzepcVar;
        this.zzh = zzfhmVar;
        this.zze = zzffwVar;
        this.zzg = zzcjdVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzepq zzepqVar, zzepr zzeprVar) throws JSONException {
        zzdjh zzdjhVarZzf;
        zzfmn zzfmnVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzl().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfep) zzepqVar).zza;
        Bundle bundleZza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfhm zzfhmVar = this.zzh;
        zzfhmVar.zzt(str);
        zzfhmVar.zzs(zzqVar);
        zzfhmVar.zzH(zzlVar);
        zzfhmVar.zzA(bundleZza);
        Context context = this.zza;
        zzfho zzfhoVarZzJ = zzfhmVar.zzJ();
        zzfmc zzfmcVarZzb = zzfmb.zzb(context, zzfmm.zza(zzfhoVarZzJ), zzfmw.FORMAT_INTERSTITIAL, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzim)).booleanValue()) {
            zzdjg zzdjgVarZzg = this.zzc.zzg();
            zzcyt zzcytVar = new zzcyt();
            zzcytVar.zze(this.zza);
            zzcytVar.zzi(zzfhoVarZzJ);
            zzdjgVarZzg.zze(zzcytVar.zzj());
            zzdfa zzdfaVar = new zzdfa();
            zzdfaVar.zzj(this.zzd, this.zzb);
            zzdfaVar.zzk(this.zzd, this.zzb);
            zzdjgVarZzg.zzd(zzdfaVar.zzn());
            zzdjgVarZzg.zzc(new zzenl(this.zzf));
            zzdjhVarZzf = zzdjgVarZzg.zzh();
        } else {
            zzdfa zzdfaVar2 = new zzdfa();
            zzffw zzffwVar = this.zze;
            if (zzffwVar != null) {
                zzdfaVar2.zze(zzffwVar, this.zzb);
                zzdfaVar2.zzf(this.zze, this.zzb);
                zzdfaVar2.zzb(this.zze, this.zzb);
            }
            zzdjg zzdjgVarZzg2 = this.zzc.zzg();
            zzcyt zzcytVar2 = new zzcyt();
            zzcytVar2.zze(this.zza);
            zzcytVar2.zzi(zzfhoVarZzJ);
            zzdjgVarZzg2.zze(zzcytVar2.zzj());
            zzdfaVar2.zzj(this.zzd, this.zzb);
            zzdfaVar2.zze(this.zzd, this.zzb);
            zzdfaVar2.zzf(this.zzd, this.zzb);
            zzdfaVar2.zzb(this.zzd, this.zzb);
            zzdfaVar2.zza(this.zzd, this.zzb);
            zzdfaVar2.zzl(this.zzd, this.zzb);
            zzdfaVar2.zzk(this.zzd, this.zzb);
            zzdfaVar2.zzi(this.zzd, this.zzb);
            zzdfaVar2.zzc(this.zzd, this.zzb);
            zzdjgVarZzg2.zzd(zzdfaVar2.zzn());
            zzdjgVarZzg2.zzc(new zzenl(this.zzf));
            zzdjhVarZzf = zzdjgVarZzg2.zzh();
        }
        zzdjh zzdjhVar = zzdjhVarZzf;
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzfmn zzfmnVarZzf = zzdjhVar.zzf();
            zzfmnVarZzf.zzd(zzfmw.FORMAT_INTERSTITIAL);
            zzfmnVarZzf.zzb(zzlVar.zzp);
            zzfmnVarZzf.zzg(zzlVar.zzm);
            zzfmnVar = zzfmnVarZzf;
        } else {
            zzfmnVar = null;
        }
        zzcvx zzcvxVarZza = zzdjhVar.zza();
        ListenableFuture listenableFutureZzi = zzcvxVarZza.zzi(zzcvxVarZza.zzj());
        this.zzi = listenableFutureZzi;
        zzgft.zzr(listenableFutureZzi, new zzfev(this, zzeprVar, zzfmnVar, zzfmcVarZzb, zzdjhVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzh() {
        this.zzd.zzdB(zzfiq.zzd(6, null, null));
    }

    public final void zzi(zzbfk zzbfkVar) {
        this.zzf = zzbfkVar;
    }
}
