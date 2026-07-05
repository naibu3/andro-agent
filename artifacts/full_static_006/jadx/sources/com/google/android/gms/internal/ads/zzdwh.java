package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdwh {
    private final zzbmo zza;

    zzdwh(zzbmo zzbmoVar) {
        this.zza = zzbmoVar;
    }

    private final void zzs(zzdwg zzdwgVar) throws JSONException, RemoteException {
        String strZza = zzdwg.zza(zzdwgVar);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching AFMA event on publisher webview: ".concat(strZza));
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdwg("initialize", null));
    }

    public final void zzb(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onAdClicked";
        this.zza.zzb(zzdwg.zza(zzdwgVar));
    }

    public final void zzc(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onAdClosed";
        zzs(zzdwgVar);
    }

    public final void zzd(long j, int i) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onAdFailedToLoad";
        zzdwgVar.zzd = Integer.valueOf(i);
        zzs(zzdwgVar);
    }

    public final void zze(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onAdLoaded";
        zzs(zzdwgVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdwgVar);
    }

    public final void zzg(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onAdOpened";
        zzs(zzdwgVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("creation", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "nativeObjectCreated";
        zzs(zzdwgVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("creation", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "nativeObjectNotCreated";
        zzs(zzdwgVar);
    }

    public final void zzj(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onAdClicked";
        zzs(zzdwgVar);
    }

    public final void zzk(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onRewardedAdClosed";
        zzs(zzdwgVar);
    }

    public final void zzl(long j, zzbyx zzbyxVar) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onUserEarnedReward";
        zzdwgVar.zze = zzbyxVar.zzf();
        zzdwgVar.zzf = Integer.valueOf(zzbyxVar.zze());
        zzs(zzdwgVar);
    }

    public final void zzm(long j, int i) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onRewardedAdFailedToLoad";
        zzdwgVar.zzd = Integer.valueOf(i);
        zzs(zzdwgVar);
    }

    public final void zzn(long j, int i) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onRewardedAdFailedToShow";
        zzdwgVar.zzd = Integer.valueOf(i);
        zzs(zzdwgVar);
    }

    public final void zzo(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onAdImpression";
        zzs(zzdwgVar);
    }

    public final void zzp(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onRewardedAdLoaded";
        zzs(zzdwgVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdwgVar);
    }

    public final void zzr(long j) throws JSONException, RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j);
        zzdwgVar.zzc = "onRewardedAdOpened";
        zzs(zzdwgVar);
    }
}
