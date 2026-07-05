package admob.plus.cordova.ads;

import admob.plus.cordova.ExecuteContext;
import admob.plus.cordova.Generated;
import admob.plus.core.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

/* loaded from: classes.dex */
public class Rewarded extends AdBase {
    private RewardedAd mAd;

    public Rewarded(ExecuteContext executeContext) {
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
        RewardedAd.load(getActivity(), this.adUnitId, this.adRequest, new RewardedAdLoadCallback() { // from class: admob.plus.cordova.ads.Rewarded.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Rewarded.this.mAd = null;
                Rewarded.this.emit(Generated.Events.AD_LOAD_FAIL, loadAdError);
                context.reject(loadAdError.toString());
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedAd rewardedAd) {
                Rewarded.this.mAd = rewardedAd;
                ServerSideVerificationOptions serverSideVerificationOptionsOptServerSideVerificationOptions = context.optServerSideVerificationOptions();
                if (serverSideVerificationOptionsOptServerSideVerificationOptions != null) {
                    Rewarded.this.mAd.setServerSideVerificationOptions(serverSideVerificationOptionsOptServerSideVerificationOptions);
                }
                Rewarded.this.mAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: admob.plus.cordova.ads.Rewarded.1.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        Rewarded.this.emit(Generated.Events.AD_DISMISS);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        Rewarded.this.emit(Generated.Events.AD_SHOW_FAIL, adError);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        Rewarded.this.clear();
                        Rewarded.this.emit(Generated.Events.AD_SHOW);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdImpression() {
                        Rewarded.this.emit(Generated.Events.AD_IMPRESSION);
                    }
                });
                Rewarded.this.emit(Generated.Events.AD_LOAD);
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
            this.mAd.show(getActivity(), new OnUserEarnedRewardListener() { // from class: admob.plus.cordova.ads.Rewarded$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    this.f$0.m17lambda$show$0$admobpluscordovaadsRewarded(rewardItem);
                }
            });
            context.resolve();
        } else {
            context.reject("Ad is not loaded");
        }
    }

    /* renamed from: lambda$show$0$admob-plus-cordova-ads-Rewarded, reason: not valid java name */
    /* synthetic */ void m17lambda$show$0$admobpluscordovaadsRewarded(RewardItem rewardItem) {
        emit(Generated.Events.AD_REWARD, rewardItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clear() {
        if (this.mAd != null) {
            this.mAd = null;
        }
    }
}
