package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfdf implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzepc zzd;
    private final zzepg zze;
    private final ViewGroup zzf;
    private zzbfk zzg;
    private final zzdca zzh;
    private final zzfmq zzi;
    private final zzdeh zzj;
    private final zzfhm zzk;
    private ListenableFuture zzl;

    public zzfdf(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjd zzcjdVar, zzepc zzepcVar, zzepg zzepgVar, zzfhm zzfhmVar, zzdeh zzdehVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjdVar;
        this.zzd = zzepcVar;
        this.zze = zzepgVar;
        this.zzk = zzfhmVar;
        this.zzh = zzcjdVar.zzf();
        this.zzi = zzcjdVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdehVar;
        zzfhmVar.zzs(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzepq zzepqVar, zzepr zzeprVar) throws JSONException, RemoteException {
        zzctg zzctgVarZzk;
        zzfmn zzfmnVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            Bundle bundleZza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
            zzfhm zzfhmVar = this.zzk;
            zzfhmVar.zzt(str);
            zzfhmVar.zzH(zzlVar);
            zzfhmVar.zzA(bundleZza);
            Context context = this.zza;
            zzfho zzfhoVarZzJ = zzfhmVar.zzJ();
            zzfmc zzfmcVarZzb = zzfmb.zzb(context, zzfmm.zza(zzfhoVarZzJ), zzfmw.FORMAT_BANNER, zzlVar);
            if (!((Boolean) zzbgq.zze.zze()).booleanValue() || !this.zzk.zzh().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzik)).booleanValue()) {
                    zzctf zzctfVarZze = this.zzc.zze();
                    zzcyt zzcytVar = new zzcyt();
                    zzcytVar.zze(this.zza);
                    zzcytVar.zzi(zzfhoVarZzJ);
                    zzctfVarZze.zzi(zzcytVar.zzj());
                    zzdfa zzdfaVar = new zzdfa();
                    zzdfaVar.zzj(this.zzd, this.zzb);
                    zzdfaVar.zzk(this.zzd, this.zzb);
                    zzctfVarZze.zzf(zzdfaVar.zzn());
                    zzctfVarZze.zze(new zzenl(this.zzg));
                    zzctfVarZze.zzd(new zzdjy(zzdme.zza, null));
                    zzctfVarZze.zzg(new zzcuh(this.zzh, this.zzj));
                    zzctfVarZze.zzc(new zzcsc(this.zzf));
                    zzctgVarZzk = zzctfVarZze.zzh();
                } else {
                    zzctf zzctfVarZze2 = this.zzc.zze();
                    zzcyt zzcytVar2 = new zzcyt();
                    zzcytVar2.zze(this.zza);
                    zzcytVar2.zzi(zzfhoVarZzJ);
                    zzctfVarZze2.zzi(zzcytVar2.zzj());
                    zzdfa zzdfaVar2 = new zzdfa();
                    zzdfaVar2.zzj(this.zzd, this.zzb);
                    zzdfaVar2.zza(this.zzd, this.zzb);
                    zzdfaVar2.zza(this.zze, this.zzb);
                    zzdfaVar2.zzl(this.zzd, this.zzb);
                    zzdfaVar2.zzd(this.zzd, this.zzb);
                    zzdfaVar2.zze(this.zzd, this.zzb);
                    zzdfaVar2.zzf(this.zzd, this.zzb);
                    zzdfaVar2.zzb(this.zzd, this.zzb);
                    zzdfaVar2.zzk(this.zzd, this.zzb);
                    zzdfaVar2.zzi(this.zzd, this.zzb);
                    zzctfVarZze2.zzf(zzdfaVar2.zzn());
                    zzctfVarZze2.zze(new zzenl(this.zzg));
                    zzctfVarZze2.zzd(new zzdjy(zzdme.zza, null));
                    zzctfVarZze2.zzg(new zzcuh(this.zzh, this.zzj));
                    zzctfVarZze2.zzc(new zzcsc(this.zzf));
                    zzctgVarZzk = zzctfVarZze2.zzh();
                }
                zzctg zzctgVar = zzctgVarZzk;
                if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
                    zzfmn zzfmnVarZzj = zzctgVar.zzj();
                    zzfmnVarZzj.zzd(zzfmw.FORMAT_BANNER);
                    zzfmnVarZzj.zzb(zzlVar.zzp);
                    zzfmnVarZzj.zzg(zzlVar.zzm);
                    zzfmnVar = zzfmnVarZzj;
                } else {
                    zzfmnVar = null;
                }
                zzcvx zzcvxVarZzd = zzctgVar.zzd();
                ListenableFuture listenableFutureZzi = zzcvxVarZzd.zzi(zzcvxVarZzd.zzj());
                this.zzl = listenableFutureZzi;
                zzgft.zzr(listenableFutureZzi, new zzfde(this, zzeprVar, zzfmnVar, zzfmcVarZzb, zzctgVar), this.zzb);
                return true;
            }
            zzepc zzepcVar = this.zzd;
            if (zzepcVar != null) {
                zzepcVar.zzdB(zzfiq.zzd(7, null, null));
            }
        }
        return false;
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfhm zzi() {
        return this.zzk;
    }

    final /* synthetic */ void zzm() {
        this.zzd.zzdB(zzfiq.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final void zzp(zzdcb zzdcbVar) {
        this.zzh.zzo(zzdcbVar, this.zzb);
    }

    public final void zzq(zzbfk zzbfkVar) {
        this.zzg = zzbfkVar;
    }

    public final boolean zzr() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzu.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzW(view, view.getContext());
    }
}
