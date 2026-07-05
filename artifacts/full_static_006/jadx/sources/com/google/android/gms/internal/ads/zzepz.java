package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzepz implements zzeps {
    private final zzfhm zza;
    private final zzcjd zzb;
    private final Context zzc;
    private final zzepp zzd;
    private final zzfmq zze;
    private zzcve zzf;

    public zzepz(zzcjd zzcjdVar, Context context, zzepp zzeppVar, zzfhm zzfhmVar) {
        this.zzb = zzcjdVar;
        this.zzc = context;
        this.zzd = zzeppVar;
        this.zza = zzfhmVar;
        this.zze = zzcjdVar.zzz();
        zzfhmVar.zzv(zzeppVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        zzcve zzcveVar = this.zzf;
        return zzcveVar != null && zzcveVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzepq zzepqVar, zzepr zzeprVar) throws JSONException, RemoteException {
        zzfmn zzfmnVar;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zzc) && zzlVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            });
            return false;
        }
        zzfil.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzl().zzo(true);
        }
        int i = ((zzept) zzepqVar).zza;
        Bundle bundleZza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfhm zzfhmVar = this.zza;
        zzfhmVar.zzH(zzlVar);
        zzfhmVar.zzA(bundleZza);
        zzfhmVar.zzC(i);
        Context context = this.zzc;
        zzfho zzfhoVarZzJ = zzfhmVar.zzJ();
        zzfmc zzfmcVarZzb = zzfmb.zzb(context, zzfmm.zza(zzfhoVarZzJ), zzfmw.FORMAT_NATIVE, zzlVar);
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzfhoVarZzJ.zzn;
        if (zzcbVar != null) {
            this.zzd.zzd().zzm(zzcbVar);
        }
        zzdkc zzdkcVarZzh = this.zzb.zzh();
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(this.zzc);
        zzcytVar.zzi(zzfhoVarZzJ);
        zzdkcVarZzh.zzf(zzcytVar.zzj());
        zzdfa zzdfaVar = new zzdfa();
        zzdfaVar.zzk(this.zzd.zzd(), this.zzb.zzB());
        zzdkcVarZzh.zze(zzdfaVar.zzn());
        zzdkcVarZzh.zzd(this.zzd.zzc());
        zzdkcVarZzh.zzc(new zzcsc(null));
        zzdkd zzdkdVarZzh = zzdkcVarZzh.zzh();
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzfmn zzfmnVarZzf = zzdkdVarZzh.zzf();
            zzfmnVarZzf.zzd(zzfmw.FORMAT_NATIVE);
            zzfmnVarZzf.zzb(zzlVar.zzp);
            zzfmnVarZzf.zzg(zzlVar.zzm);
            zzfmnVar = zzfmnVarZzf;
        } else {
            zzfmnVar = null;
        }
        this.zzb.zzy().zzc(1);
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        ScheduledExecutorService scheduledExecutorServiceZzC = this.zzb.zzC();
        zzcvx zzcvxVarZza = zzdkdVarZzh.zza();
        zzcve zzcveVar = new zzcve(zzggeVar, scheduledExecutorServiceZzC, zzcvxVarZza.zzi(zzcvxVarZza.zzj()));
        this.zzf = zzcveVar;
        zzcveVar.zze(new zzepy(this, zzeprVar, zzfmnVar, zzfmcVarZzb, zzdkdVarZzh));
        return true;
    }

    final /* synthetic */ void zzf() {
        this.zzd.zza().zzdB(zzfiq.zzd(4, null, null));
    }

    final /* synthetic */ void zzg() {
        this.zzd.zza().zzdB(zzfiq.zzd(6, null, null));
    }
}
