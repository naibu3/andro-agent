package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbzt extends zzbzg {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbzu zzb;

    public zzbzt(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbzu zzbzuVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg() {
        zzbzu zzbzuVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbzuVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbzuVar);
    }
}
