package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfgg implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzffw zzd;
    private final zzfek zze;
    private final zzfhg zzf;
    private final zzfmq zzg;
    private final zzfhm zzh;
    private ListenableFuture zzi;

    public zzfgg(Context context, Executor executor, zzcjd zzcjdVar, zzfek zzfekVar, zzffw zzffwVar, zzfhm zzfhmVar, zzfhg zzfhgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjdVar;
        this.zze = zzfekVar;
        this.zzd = zzffwVar;
        this.zzh = zzfhmVar;
        this.zzf = zzfhgVar;
        this.zzg = zzcjdVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdrl zzk(zzfei zzfeiVar) {
        zzdrl zzdrlVarZzi = this.zzc.zzi();
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(this.zza);
        zzcytVar.zzi(((zzfgf) zzfeiVar).zza);
        zzcytVar.zzh(this.zzf);
        zzdrlVarZzi.zzd(zzcytVar.zzj());
        zzdrlVarZzi.zzc(new zzdfa().zzn());
        return zzdrlVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzeps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzepq zzepqVar, zzepr zzeprVar) throws JSONException, RemoteException {
        zzfmn zzfmnVar;
        zzbyo zzbyoVar = new zzbyo(zzlVar, str);
        if (zzbyoVar.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzfek zzfekVar = this.zze;
            if (zzfekVar.zzd() != null) {
                zzfmn zzfmnVarZzh = ((zzdrm) zzfekVar.zzd()).zzh();
                zzfmnVarZzh.zzd(zzfmw.FORMAT_REWARDED);
                zzfmnVarZzh.zzb(zzbyoVar.zza.zzp);
                zzfmnVarZzh.zzg(zzbyoVar.zza.zzm);
                zzfmnVar = zzfmnVarZzh;
            } else {
                zzfmnVar = null;
            }
        }
        zzfil.zza(this.zza, zzbyoVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzbyoVar.zza.zzf) {
            this.zzc.zzl().zzo(true);
        }
        Bundle bundleZza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzbyoVar.zza.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfhm zzfhmVar = this.zzh;
        zzfhmVar.zzt(zzbyoVar.zzb);
        zzfhmVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzd());
        zzfhmVar.zzH(zzbyoVar.zza);
        zzfhmVar.zzA(bundleZza);
        Context context = this.zza;
        zzfho zzfhoVarZzJ = zzfhmVar.zzJ();
        zzfmc zzfmcVarZzb = zzfmb.zzb(context, zzfmm.zza(zzfhoVarZzJ), zzfmw.FORMAT_REWARDED, zzbyoVar.zza);
        zzfgf zzfgfVar = new zzfgf(null);
        zzfgfVar.zza = zzfhoVarZzJ;
        ListenableFuture listenableFutureZzc = this.zze.zzc(new zzfel(zzfgfVar, null), new zzfej() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // com.google.android.gms.internal.ads.zzfej
            public final zzcyr zza(zzfei zzfeiVar) {
                return this.zza.zzk(zzfeiVar);
            }
        }, null);
        this.zzi = listenableFutureZzc;
        zzgft.zzr(listenableFutureZzc, new zzfgd(this, zzeprVar, zzfmnVar, zzfmcVarZzb, zzfgfVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzi() {
        this.zzd.zzdB(zzfiq.zzd(6, null, null));
    }

    final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}
