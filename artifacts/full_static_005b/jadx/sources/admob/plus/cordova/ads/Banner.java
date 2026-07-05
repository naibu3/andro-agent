package admob.plus.cordova.ads;

import admob.plus.cordova.ExecuteContext;
import admob.plus.cordova.Generated;
import admob.plus.core.Context;
import admob.plus.core.Helper;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Banner extends AdBase {
    private static final String TAG = "AdMobPlus.Banner";
    private static ViewGroup rootLinearLayout;
    private static int screenWidth;
    private final AdSize adSize;
    private final int gravity;
    private AdView mAdView;
    private AdView mAdViewOld;
    private RelativeLayout mRelativeLayout;
    private final Integer offset;

    public Banner(ExecuteContext executeContext) {
        super(executeContext);
        this.mRelativeLayout = null;
        this.mAdViewOld = null;
        this.adSize = executeContext.optAdSize();
        this.gravity = "top".equals(executeContext.optPosition()) ? 48 : 80;
        this.offset = executeContext.optOffset();
    }

    public static void destroyParentView() {
        ViewGroup parentView = Helper.getParentView(rootLinearLayout);
        if (parentView != null) {
            parentView.removeAllViews();
        }
        rootLinearLayout = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void runJustBeforeBeingDrawn(final View view, final Runnable runnable) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: admob.plus.cordova.ads.Banner.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                runnable.run();
                return true;
            }
        });
    }

    @Override // admob.plus.core.GenericAd
    public boolean isLoaded() {
        return this.mAdView != null;
    }

    @Override // admob.plus.core.GenericAd
    public void load(Context context) {
        if (this.mAdView == null) {
            this.mAdView = createBannerView();
        }
        this.mAdView.loadAd(this.adRequest);
        context.resolve();
    }

    private AdView createBannerView() {
        AdView adView = new AdView(getActivity());
        adView.setAdUnitId(this.adUnitId);
        adView.setAdSize(this.adSize);
        adView.setAdListener(new AnonymousClass2(adView));
        return adView;
    }

    /* renamed from: admob.plus.cordova.ads.Banner$2, reason: invalid class name */
    class AnonymousClass2 extends AdListener {
        final /* synthetic */ AdView val$adView;

        AnonymousClass2(AdView adView) {
            this.val$adView = adView;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            Banner.this.emit(Generated.Events.AD_CLICK);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            Banner.this.emit(Generated.Events.AD_DISMISS);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Banner.this.emit(Generated.Events.AD_LOAD_FAIL, loadAdError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            Banner.this.emit(Generated.Events.AD_IMPRESSION);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            if (Banner.this.mAdViewOld != null) {
                Banner banner = Banner.this;
                banner.removeBannerView(banner.mAdViewOld);
                Banner.this.mAdViewOld = null;
            }
            Banner.runJustBeforeBeingDrawn(this.val$adView, new Runnable() { // from class: admob.plus.cordova.ads.Banner$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m10lambda$onAdLoaded$0$admobpluscordovaadsBanner$2();
                }
            });
            Banner banner2 = Banner.this;
            banner2.emit(Generated.Events.AD_LOAD, banner2.computeAdSize());
        }

        /* renamed from: lambda$onAdLoaded$0$admob-plus-cordova-ads-Banner$2, reason: not valid java name */
        /* synthetic */ void m10lambda$onAdLoaded$0$admobpluscordovaadsBanner$2() {
            Banner banner = Banner.this;
            banner.emit(Generated.Events.BANNER_SIZE, banner.computeAdSize());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            Banner.this.emit(Generated.Events.AD_SHOW);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> computeAdSize() {
        final int width = this.mAdView.getWidth();
        final int height = this.mAdView.getHeight();
        return new HashMap<String, Object>() { // from class: admob.plus.cordova.ads.Banner.3
            {
                put("size", new HashMap<String, Object>() { // from class: admob.plus.cordova.ads.Banner.3.1
                    {
                        put("width", Integer.valueOf(Helper.pxToDp(width)));
                        put("height", Integer.valueOf(Helper.pxToDp(height)));
                        put("widthInPixels", Integer.valueOf(width));
                        put("heightInPixels", Integer.valueOf(height));
                    }
                });
            }
        };
    }

    @Override // admob.plus.core.GenericAd
    public void show(Context context) {
        if (this.mAdView.getParent() == null) {
            addBannerView();
        } else if (this.mAdView.getVisibility() == 8) {
            this.mAdView.resume();
            this.mAdView.setVisibility(0);
        } else {
            ViewGroup parentView = Helper.getParentView(getWebView());
            ViewGroup viewGroup = rootLinearLayout;
            if (viewGroup != parentView) {
                Helper.removeFromParentView(viewGroup);
                addBannerView();
            }
        }
        context.resolve();
    }

    @Override // admob.plus.core.GenericAd
    public void hide(Context context) {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.pause();
            this.mAdView.setVisibility(8);
        }
        context.resolve();
    }

    @Override // admob.plus.cordova.ads.AdBase
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = getActivity().getResources().getDisplayMetrics().widthPixels;
        if (i != screenWidth) {
            screenWidth = i;
            getActivity().runOnUiThread(new Runnable() { // from class: admob.plus.cordova.ads.Banner$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.reloadBannerView();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadBannerView() {
        AdView adView = this.mAdView;
        if (adView == null || adView.getVisibility() == 8) {
            return;
        }
        pauseBannerViews();
        AdView adView2 = this.mAdViewOld;
        if (adView2 != null) {
            removeBannerView(adView2);
        }
        this.mAdViewOld = this.mAdView;
        AdView adViewCreateBannerView = createBannerView();
        this.mAdView = adViewCreateBannerView;
        adViewCreateBannerView.loadAd(this.adRequest);
        addBannerView();
    }

    @Override // admob.plus.cordova.ads.AdBase
    public void onPause(boolean z) {
        pauseBannerViews();
        super.onPause(z);
    }

    private void pauseBannerViews() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.pause();
        }
        AdView adView2 = this.mAdViewOld;
        if (adView2 == null || adView2 == this.mAdView) {
            return;
        }
        adView2.pause();
    }

    @Override // admob.plus.cordova.ads.AdBase
    public void onResume(boolean z) {
        super.onResume(z);
        resumeBannerViews();
    }

    private void resumeBannerViews() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.resume();
        }
        AdView adView2 = this.mAdViewOld;
        if (adView2 != null) {
            adView2.resume();
        }
    }

    @Override // admob.plus.cordova.ads.AdBase
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            removeBannerView(adView);
            this.mAdView = null;
        }
        AdView adView2 = this.mAdViewOld;
        if (adView2 != null) {
            removeBannerView(adView2);
            this.mAdViewOld = null;
        }
        RelativeLayout relativeLayout = this.mRelativeLayout;
        if (relativeLayout != null) {
            Helper.removeFromParentView(relativeLayout);
            this.mRelativeLayout = null;
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBannerView(AdView adView) {
        Helper.removeFromParentView(adView);
        adView.removeAllViews();
        adView.destroy();
    }

    private void addBannerView() {
        AdView adView = this.mAdView;
        if (adView == null) {
            return;
        }
        if (this.offset == null) {
            ViewGroup parentView = Helper.getParentView(adView);
            ViewGroup viewGroup = rootLinearLayout;
            if (parentView == viewGroup && viewGroup != null) {
                return;
            } else {
                addBannerViewWithLinearLayout();
            }
        } else {
            ViewGroup parentView2 = Helper.getParentView(adView);
            RelativeLayout relativeLayout = this.mRelativeLayout;
            if (parentView2 == relativeLayout && relativeLayout != null) {
                return;
            } else {
                addBannerViewWithRelativeLayout();
            }
        }
        ViewGroup contentView = getContentView();
        if (contentView != null) {
            contentView.bringToFront();
            contentView.requestLayout();
            contentView.requestFocus();
        }
    }

    private void addBannerViewWithLinearLayout() {
        View webView = getWebView();
        ViewGroup parentView = Helper.getParentView(webView);
        if (rootLinearLayout == null) {
            rootLinearLayout = new LinearLayout(getActivity());
        }
        if (parentView != null && parentView != rootLinearLayout) {
            parentView.removeView(webView);
            ((LinearLayout) rootLinearLayout).setOrientation(1);
            rootLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 0.0f));
            webView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            rootLinearLayout.addView(webView);
            if (Helper.getParentView(rootLinearLayout) != parentView) {
                Helper.removeFromParentView(rootLinearLayout);
                parentView.addView(rootLinearLayout);
            }
        }
        Helper.removeFromParentView(this.mAdView);
        if (isPositionTop()) {
            rootLinearLayout.addView(this.mAdView, 0);
        } else {
            rootLinearLayout.addView(this.mAdView);
        }
        ViewGroup contentView = getContentView();
        if (contentView != null) {
            for (int i = 0; i < contentView.getChildCount(); i++) {
                View childAt = contentView.getChildAt(i);
                if (childAt instanceof RelativeLayout) {
                    childAt.bringToFront();
                }
            }
        }
    }

    private void addBannerViewWithRelativeLayout() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(isPositionTop() ? 10 : 12);
        if (this.mRelativeLayout == null) {
            this.mRelativeLayout = new RelativeLayout(getActivity());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            if (isPositionTop()) {
                layoutParams2.setMargins(0, this.offset.intValue(), 0, 0);
            } else {
                layoutParams2.setMargins(0, 0, 0, this.offset.intValue());
            }
            ViewGroup contentView = getContentView();
            if (contentView != null) {
                contentView.addView(this.mRelativeLayout, layoutParams2);
            } else {
                Log.e(TAG, "Unable to find content view");
            }
        }
        Helper.removeFromParentView(this.mAdView);
        this.mRelativeLayout.addView(this.mAdView, layoutParams);
        this.mRelativeLayout.bringToFront();
    }

    private boolean isPositionTop() {
        return this.gravity == 48;
    }

    /* renamed from: admob.plus.cordova.ads.Banner$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$admob$plus$cordova$ads$Banner$AdSizeType;

        static {
            int[] iArr = new int[AdSizeType.values().length];
            $SwitchMap$admob$plus$cordova$ads$Banner$AdSizeType = iArr;
            try {
                iArr[AdSizeType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$admob$plus$cordova$ads$Banner$AdSizeType[AdSizeType.LARGE_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$admob$plus$cordova$ads$Banner$AdSizeType[AdSizeType.MEDIUM_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$admob$plus$cordova$ads$Banner$AdSizeType[AdSizeType.FULL_BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$admob$plus$cordova$ads$Banner$AdSizeType[AdSizeType.LEADERBOARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$admob$plus$cordova$ads$Banner$AdSizeType[AdSizeType.SMART_BANNER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum AdSizeType {
        BANNER,
        LARGE_BANNER,
        MEDIUM_RECTANGLE,
        FULL_BANNER,
        LEADERBOARD,
        SMART_BANNER;

        public static AdSize getAdSize(int i) {
            switch (AnonymousClass4.$SwitchMap$admob$plus$cordova$ads$Banner$AdSizeType[values()[i].ordinal()]) {
                case 1:
                    return AdSize.BANNER;
                case 2:
                    return AdSize.LARGE_BANNER;
                case 3:
                    return AdSize.MEDIUM_RECTANGLE;
                case 4:
                    return AdSize.FULL_BANNER;
                case 5:
                    return AdSize.LEADERBOARD;
                case 6:
                    return AdSize.SMART_BANNER;
                default:
                    return null;
            }
        }
    }
}
