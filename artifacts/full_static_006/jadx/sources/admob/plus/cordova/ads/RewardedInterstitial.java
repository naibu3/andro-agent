package admob.plus.cordova.ads;

import admob.plus.cordova.ExecuteContext;
import admob.plus.cordova.Generated;
import admob.plus.core.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* loaded from: classes.dex */
public class RewardedInterstitial extends AdBase {
    private RewardedInterstitialAd mAd;

    public RewardedInterstitial(ExecuteContext executeContext) {
        super(executeContext);
        this.mAd = null;
    }

    @Override // admob.plus.cordova.ads.AdBase
    public void onDestroy() {
        clear();
        super.onDestroy();
    }

    @Override // admob.plus.core.GenericAd
    public void load(final Context context) {
        clear();
        RewardedInterstitialAd.load(getActivity(), this.adUnitId, this.adRequest, new RewardedInterstitialAdLoadCallback() { // from class: admob.plus.cordova.ads.RewardedInterstitial.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                RewardedInterstitial.this.mAd = null;
                RewardedInterstitial.this.emit(Generated.Events.AD_LOAD_FAIL, loadAdError);
                context.reject(loadAdError.toString());
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
                RewardedInterstitial.this.mAd = rewardedInterstitialAd;
                ServerSideVerificationOptions serverSideVerificationOptionsOptServerSideVerificationOptions = context.optServerSideVerificationOptions();
                if (serverSideVerificationOptionsOptServerSideVerificationOptions != null) {
                    RewardedInterstitial.this.mAd.setServerSideVerificationOptions(serverSideVerificationOptionsOptServerSideVerificationOptions);
                }
                RewardedInterstitial.this.mAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: admob.plus.cordova.ads.RewardedInterstitial.1.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        RewardedInterstitial.this.emit(Generated.Events.AD_DISMISS);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        RewardedInterstitial.this.emit(Generated.Events.AD_SHOW_FAIL, adError);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        RewardedInterstitial.this.mAd = null;
                        RewardedInterstitial.this.emit(Generated.Events.AD_SHOW);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdImpression() {
                        RewardedInterstitial.this.emit(Generated.Events.AD_IMPRESSION);
                    }
                });
                RewardedInterstitial.this.emit(Generated.Events.AD_LOAD);
                context.resolve();
            }
        });
    }

    @Override // admob.plus.core.GenericAd
    public boolean isLoaded() {
        return this.mAd != null;
    }

    @Override // admob.plus.core.GenericAd
    public void show(Context context) {
        if (isLoaded()) {
            this.mAd.show(getActivity(), new OnUserEarnedRewardListener() { // from class: admob.plus.cordova.ads.RewardedInterstitial$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    this.f$0.m20lambda$show$0$admobpluscordovaadsRewardedInterstitial(rewardItem);
                }
            });
            context.resolve();
        } else {
            context.reject("Ad is not loaded");
        }
    }

    /* renamed from: lambda$show$0$admob-plus-cordova-ads-RewardedInterstitial, reason: not valid java name */
    /* synthetic */ void m20lambda$show$0$admobpluscordovaadsRewardedInterstitial(RewardItem rewardItem) {
        emit(Generated.Events.AD_REWARD, rewardItem);
    }

    private void clear() {
        if (this.mAd != null) {
            this.mAd = null;
        }
    }
}
