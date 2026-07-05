package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzfcb implements zzeps {
    protected final zzcjd zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfcr zzd;
    private final zzfek zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfmq zzh;
    private final zzfhm zzi;

    @Nullable
    private ListenableFuture zzj;

    protected zzfcb(Context context, Executor executor, zzcjd zzcjdVar, zzfek zzfekVar, zzfcr zzfcrVar, zzfhm zzfhmVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcjdVar;
        this.zze = zzfekVar;
        this.zzd = zzfcrVar;
        this.zzi = zzfhmVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcjdVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcyr zzm(zzfei zzfeiVar) {
        zzfca zzfcaVar = (zzfca) zzfeiVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzil)).booleanValue()) {
            zzcsc zzcscVar = new zzcsc(this.zzg);
            zzcyt zzcytVar = new zzcyt();
            zzcytVar.zze(this.zzb);
            zzcytVar.zzi(zzfcaVar.zza);
            zzcyv zzcyvVarZzj = zzcytVar.zzj();
            zzdfa zzdfaVar = new zzdfa();
            zzdfaVar.zzc(this.zzd, this.zzc);
            zzdfaVar.zzl(this.zzd, this.zzc);
            return zze(zzcscVar, zzcyvVarZzj, zzdfaVar.zzn());
        }
        zzfcr zzfcrVarZzi = zzfcr.zzi(this.zzd);
        zzdfa zzdfaVar2 = new zzdfa();
        zzdfaVar2.zzb(zzfcrVarZzi, this.zzc);
        zzdfaVar2.zzg(zzfcrVarZzi, this.zzc);
        zzdfaVar2.zzh(zzfcrVarZzi, this.zzc);
        zzdfaVar2.zzi(zzfcrVarZzi, this.zzc);
        zzdfaVar2.zzc(zzfcrVarZzi, this.zzc);
        zzdfaVar2.zzl(zzfcrVarZzi, this.zzc);
        zzdfaVar2.zzm(zzfcrVarZzi);
        zzcsc zzcscVar2 = new zzcsc(this.zzg);
        zzcyt zzcytVar2 = new zzcyt();
        zzcytVar2.zze(this.zzb);
        zzcytVar2.zzi(zzfcaVar.zza);
        return zze(zzcscVar2, zzcytVar2.zzj(), zzdfaVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // com.google.android.gms.internal.ads.zzeps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzepq zzepqVar, zzepr zzeprVar) throws RemoteException {
        zzfmn zzfmnVar;
        boolean z = ((Boolean) zzbgi.zzd.zze()).booleanValue() && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlg)).booleanValue();
        if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlh)).intValue() || !z) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
            return false;
        }
        if (this.zzj != null) {
            return false;
        }
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzfek zzfekVar = this.zze;
            if (zzfekVar.zzd() != null) {
                zzfmn zzfmnVarZzh = ((zzcrp) zzfekVar.zzd()).zzh();
                zzfmnVarZzh.zzd(zzfmw.FORMAT_APP_OPEN);
                zzfmnVarZzh.zzb(zzlVar.zzp);
                zzfmnVarZzh.zzg(zzlVar.zzm);
                zzfmnVar = zzfmnVarZzh;
            } else {
                zzfmnVar = null;
            }
        }
        zzfil.zza(this.zzb, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzlVar.zzf) {
            this.zza.zzl().zzo(true);
        }
        Bundle bundleZza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfhm zzfhmVar = this.zzi;
        zzfhmVar.zzt(str);
        zzfhmVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzb());
        zzfhmVar.zzH(zzlVar);
        zzfhmVar.zzA(bundleZza);
        Context context = this.zzb;
        zzfho zzfhoVarZzJ = zzfhmVar.zzJ();
        zzfmc zzfmcVarZzb = zzfmb.zzb(context, zzfmm.zza(zzfhoVarZzJ), zzfmw.FORMAT_APP_OPEN, zzlVar);
        zzfca zzfcaVar = new zzfca(null);
        zzfcaVar.zza = zzfhoVarZzJ;
        ListenableFuture listenableFutureZzc = this.zze.zzc(new zzfel(zzfcaVar, null), new zzfej() { // from class: com.google.android.gms.internal.ads.zzfbw
            @Override // com.google.android.gms.internal.ads.zzfej
            public final zzcyr zza(zzfei zzfeiVar) {
                return this.zza.zzm(zzfeiVar);
            }
        }, null);
        this.zzj = listenableFutureZzc;
        zzgft.zzr(listenableFutureZzc, new zzfby(this, zzeprVar, zzfmnVar, zzfmcVarZzb, zzfcaVar), this.zzc);
        return true;
    }

    protected abstract zzcyr zze(zzcsc zzcscVar, zzcyv zzcyvVar, zzdfc zzdfcVar);

    final /* synthetic */ void zzk() {
        this.zzd.zzdB(zzfiq.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzu(zzwVar);
    }
}
