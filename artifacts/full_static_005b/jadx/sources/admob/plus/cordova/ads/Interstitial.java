package admob.plus.cordova.ads;

import admob.plus.cordova.ExecuteContext;
import admob.plus.cordova.Generated;
import admob.plus.core.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes.dex */
public class Interstitial extends AdBase {
    private InterstitialAd mAd;

    public Interstitial(ExecuteContext executeContext) {
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
        InterstitialAd.load(getActivity(), this.adUnitId, this.adRequest, new InterstitialAdLoadCallback() { // from class: admob.plus.cordova.ads.Interstitial.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                Interstitial.this.mAd = interstitialAd;
                Interstitial.this.mAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: admob.plus.cordova.ads.Interstitial.1.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        Interstitial.this.emit(Generated.Events.AD_DISMISS);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        Interstitial.this.emit(Generated.Events.AD_SHOW_FAIL, adError);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        Interstitial.this.mAd = null;
                        Interstitial.this.emit(Generated.Events.AD_SHOW);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdImpression() {
                        Interstitial.this.emit(Generated.Events.AD_IMPRESSION);
                    }
                });
                Interstitial.this.emit(Generated.Events.AD_LOAD);
                context.resolve();
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Interstitial.this.mAd = null;
                Interstitial.this.emit(Generated.Events.AD_LOAD_FAIL, loadAdError);
                context.reject(loadAdError.toString());
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
            this.mAd.show(getActivity());
            context.resolve();
        } else {
            context.reject("Ad is not loaded");
        }
    }

    private void clear() {
        InterstitialAd interstitialAd = this.mAd;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(null);
            this.mAd = null;
        }
    }
}
