package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcrz extends zzcup {
    private final zzchd zzc;
    private final int zzd;
    private final Context zze;
    private final zzcrn zzf;
    private final zzdjp zzg;
    private final zzdgm zzh;
    private final zzczy zzi;
    private final boolean zzj;
    private final zzccc zzk;
    private boolean zzl;

    zzcrz(zzcuo zzcuoVar, Context context, zzchd zzchdVar, int i, zzcrn zzcrnVar, zzdjp zzdjpVar, zzdgm zzdgmVar, zzczy zzczyVar, zzccc zzcccVar) {
        super(zzcuoVar);
        this.zzl = false;
        this.zzc = zzchdVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcrnVar;
        this.zzg = zzdjpVar;
        this.zzh = zzdgmVar;
        this.zzi = zzczyVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfs)).booleanValue();
        this.zzk = zzcccVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcup
    public final void zzb() {
        super.zzb();
        zzchd zzchdVar = this.zzc;
        if (zzchdVar != null) {
            zzchdVar.destroy();
        }
    }

    public final void zzc(zzbca zzbcaVar) {
        zzchd zzchdVar = this.zzc;
        if (zzchdVar != null) {
            zzchdVar.zzak(zzbcaVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    public final void zzd(Activity activity, zzbcn zzbcnVar, boolean z) throws RemoteException {
        zzchd zzchdVar;
        zzfgt zzfgtVarZzD;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzG(activity2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaD)).booleanValue()) {
                    new zzfrp(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzu.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlQ)).booleanValue() && (zzchdVar = this.zzc) != null && (zzfgtVarZzD = zzchdVar.zzD()) != null && zzfgtVarZzD.zzas && zzfgtVarZzD.zzat != this.zzk.zzb()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The app open consent form has been shown.");
            this.zzi.zza(zzfiq.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzl) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzfiq.zzd(10, null, null));
        }
        if (this.zzl) {
            return;
        }
        try {
            this.zzg.zza(z, activity2, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzl = true;
        } catch (zzdjo e) {
            this.zzi.zzc(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
