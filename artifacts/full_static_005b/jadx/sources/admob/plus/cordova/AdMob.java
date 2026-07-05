package admob.plus.cordova;

import admob.plus.cordova.Generated;
import admob.plus.cordova.ads.AdBase;
import admob.plus.cordova.ads.AppOpen;
import admob.plus.cordova.ads.Banner;
import admob.plus.cordova.ads.Interstitial;
import admob.plus.cordova.ads.Native;
import admob.plus.cordova.ads.Rewarded;
import admob.plus.cordova.ads.RewardedInterstitial;
import admob.plus.cordova.ads.WebViewAd;
import admob.plus.core.Ad;
import admob.plus.core.GenericAd;
import admob.plus.core.Helper;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.messaging.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdMob extends CordovaPlugin implements Helper.Adapter {
    public static final String NATIVE_VIEW_DEFAULT = "default";
    private static final String TAG = "AdMobPlus";
    public Helper helper;
    private final ArrayList<PluginResult> eventQueue = new ArrayList<>();
    private CallbackContext readyCallbackContext = null;

    public static void registerNativeAdViewProviders(Map<String, Native.ViewProvider> map) {
        Native.providers.putAll(map);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, final CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: admob.plus.cordova.AdMob.1
            @Override // java.lang.Runnable
            public void run() {
                if (AdMob.this.preferences.getBoolean("AdMobPlusWebViewAd", false)) {
                    WebView webView = (WebView) cordovaWebView.getView();
                    MobileAds.registerWebView(webView);
                    webView.reload();
                    Log.d(AdMob.TAG, "Integrated the WebView API for Ads in " + webView.getUrl() + " WebView");
                }
            }
        });
    }

    @Override // org.apache.cordova.CordovaPlugin
    protected void pluginInitialize() {
        super.pluginInitialize();
        Log.i(TAG, "Initialize plugin");
        this.helper = new Helper(this);
        ExecuteContext.plugin = this;
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean onOverrideUrlLoading(String str) {
        Log.d(TAG, "onOverrideUrlLoading called with URL " + str);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.parse(str);
            intent.setData(uri);
            if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
                return false;
            }
            this.f9cordova.getActivity().startActivity(intent);
            Log.d(TAG, "Open Iframe URL to browser " + str);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.d(TAG, "onOverrideUrlLoading: Error loading url " + str + ":" + e.toString());
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    @Override // org.apache.cordova.CordovaPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean execute(String str, JSONArray jSONArray, final CallbackContext callbackContext) {
        ExecuteContext executeContext;
        char c;
        GenericAd banner;
        Log.d(TAG, String.format("Execute %s", str));
        executeContext = new ExecuteContext(str, jSONArray, callbackContext);
        str.hashCode();
        c = 6;
        switch (str) {
            case "adHide":
                return executeAdHide(executeContext);
            case "adLoad":
                return executeAdLoad(executeContext);
            case "adShow":
                return executeAdShow(executeContext);
            case "setAppVolume":
                MobileAds.setAppVolume(BigDecimal.valueOf(jSONArray.optDouble(0)).floatValue());
                callbackContext.success();
                return true;
            case "setAppMuted":
                MobileAds.setAppMuted(jSONArray.optBoolean(0));
                callbackContext.success();
                return true;
            case "configure":
            case "configRequest":
                executeContext.configure(this.helper);
                return true;
            case "ready":
                return executeReady(callbackContext);
            case "start":
                MobileAds.initialize(this.f9cordova.getActivity(), new OnInitializationCompleteListener() { // from class: admob.plus.cordova.AdMob$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                    public final void onInitializationComplete(InitializationStatus initializationStatus) {
                        this.f$0.m2lambda$execute$0$admobpluscordovaAdMob(callbackContext, initializationStatus);
                    }
                });
                return true;
            case "adIsLoaded":
                return executeAdIsLoaded_(executeContext);
            case "adCreate":
                String strOptString = executeContext.optString("cls");
                if (strOptString == null) {
                    executeContext.reject("ad cls is missing");
                } else {
                    strOptString.hashCode();
                    switch (strOptString.hashCode()) {
                        case -1791176561:
                            if (!strOptString.equals("BannerAd")) {
                                c = 65535;
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        case -909742738:
                            if (strOptString.equals("AppOpenAd")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -609786639:
                            if (strOptString.equals("RewardedAd")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -543102915:
                            if (strOptString.equals("RewardedInterstitialAd")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 320151695:
                            if (strOptString.equals("InterstitialAd")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 938685948:
                            if (strOptString.equals("WebViewAd")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 2110329530:
                            if (!strOptString.equals("NativeAd")) {
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            banner = new Banner(executeContext);
                            break;
                        case 1:
                            banner = new AppOpen(executeContext);
                            break;
                        case 2:
                            banner = new Rewarded(executeContext);
                            break;
                        case 3:
                            banner = new RewardedInterstitial(executeContext);
                            break;
                        case 4:
                            banner = new Interstitial(executeContext);
                            break;
                        case 5:
                            banner = new WebViewAd(executeContext);
                            break;
                        case 6:
                            banner = new Native(executeContext);
                            break;
                        default:
                            banner = null;
                            break;
                    }
                    if (banner != null) {
                        executeContext.resolve();
                    } else {
                        executeContext.reject("ad cls is not supported");
                    }
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: lambda$execute$0$admob-plus-cordova-AdMob, reason: not valid java name */
    /* synthetic */ void m2lambda$execute$0$admobpluscordovaAdMob(CallbackContext callbackContext, InitializationStatus initializationStatus) {
        this.helper.configForTestLab();
        callbackContext.success(new JSONObject(new HashMap<String, Object>() { // from class: admob.plus.cordova.AdMob.2
            {
                put("version", MobileAds.getVersion());
            }
        }));
    }

    private boolean executeReady(CallbackContext callbackContext) {
        if (this.readyCallbackContext == null) {
            Iterator<PluginResult> it = this.eventQueue.iterator();
            while (it.hasNext()) {
                callbackContext.sendPluginResult(it.next());
            }
            this.eventQueue.clear();
        } else {
            Log.e(TAG, "Ready action should only be called once.");
        }
        this.readyCallbackContext = callbackContext;
        emit(Generated.Events.READY, new HashMap<String, Object>() { // from class: admob.plus.cordova.AdMob.3
            {
                put("isRunningInTestLab", Boolean.valueOf(AdMob.this.helper.isRunningInTestLab()));
            }
        });
        return true;
    }

    private boolean executeAdIsLoaded_(final ExecuteContext executeContext) {
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: admob.plus.cordova.AdMob$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AdMob.lambda$executeAdIsLoaded_$1(executeContext);
            }
        });
        return true;
    }

    static /* synthetic */ void lambda$executeAdIsLoaded_$1(ExecuteContext executeContext) {
        GenericAd genericAd = (GenericAd) executeContext.optAdOrError();
        if (genericAd != null) {
            executeContext.resolve(genericAd.isLoaded());
        }
    }

    private boolean executeAdLoad(final ExecuteContext executeContext) {
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: admob.plus.cordova.AdMob$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AdMob.lambda$executeAdLoad$2(executeContext);
            }
        });
        return true;
    }

    static /* synthetic */ void lambda$executeAdLoad$2(ExecuteContext executeContext) {
        GenericAd genericAd = (GenericAd) executeContext.optAdOrError();
        if (genericAd != null) {
            genericAd.load(executeContext);
        }
    }

    private boolean executeAdShow(final ExecuteContext executeContext) {
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: admob.plus.cordova.AdMob$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AdMob.lambda$executeAdShow$3(executeContext);
            }
        });
        return true;
    }

    static /* synthetic */ void lambda$executeAdShow$3(ExecuteContext executeContext) {
        GenericAd genericAd = (GenericAd) executeContext.optAdOrError();
        if (genericAd != null) {
            if (genericAd.isLoaded()) {
                genericAd.show(executeContext);
            } else {
                executeContext.resolve(false);
            }
        }
    }

    private boolean executeAdHide(final ExecuteContext executeContext) {
        this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: admob.plus.cordova.AdMob$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AdMob.lambda$executeAdHide$4(executeContext);
            }
        });
        return true;
    }

    static /* synthetic */ void lambda$executeAdHide$4(ExecuteContext executeContext) {
        GenericAd genericAd = (GenericAd) executeContext.optAdOrError();
        if (genericAd != null) {
            genericAd.hide(executeContext);
        }
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<Map.Entry<String, Ad>> it = Helper.ads.entrySet().iterator();
        while (it.hasNext()) {
            ((AdBase) it.next().getValue()).onConfigurationChanged(configuration);
        }
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onPause(boolean z) {
        Iterator<Map.Entry<String, Ad>> it = Helper.ads.entrySet().iterator();
        while (it.hasNext()) {
            ((AdBase) it.next().getValue()).onPause(z);
        }
        super.onPause(z);
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onResume(boolean z) {
        super.onResume(z);
        Iterator<Map.Entry<String, Ad>> it = Helper.ads.entrySet().iterator();
        while (it.hasNext()) {
            ((AdBase) it.next().getValue()).onResume(z);
        }
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void onDestroy() {
        this.readyCallbackContext = null;
        Iterator<Map.Entry<String, Ad>> it = Helper.ads.entrySet().iterator();
        while (it.hasNext()) {
            ((AdBase) it.next().getValue()).onDestroy();
        }
        Banner.destroyParentView();
        super.onDestroy();
    }

    @Override // admob.plus.core.Helper.Adapter
    public Activity getActivity() {
        return this.f9cordova.getActivity();
    }

    @Override // admob.plus.core.Helper.Adapter
    public void emit(String str, Map<String, Object> map) {
        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, new JSONObject(new HashMap<String, Object>(str, map) { // from class: admob.plus.cordova.AdMob.4
            final /* synthetic */ Map val$data;
            final /* synthetic */ String val$eventName;

            {
                this.val$eventName = str;
                this.val$data = map;
                put("type", str);
                put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, map);
            }
        }));
        pluginResult.setKeepCallback(true);
        CallbackContext callbackContext = this.readyCallbackContext;
        if (callbackContext == null) {
            this.eventQueue.add(pluginResult);
        } else {
            callbackContext.sendPluginResult(pluginResult);
        }
    }
}
