package com.qonversion.android.sdk;

import android.app.Activity;
import android.app.Application;
import com.appfeel.cordova.annotated.android.plugin.AnnotatedCordovaPlugin;
import com.appfeel.cordova.annotated.android.plugin.ExecutionThread;
import com.appfeel.cordova.annotated.android.plugin.PluginAction;
import io.qonversion.sandwich.ActivityProvider;
import io.qonversion.sandwich.QonversionEventsListener;
import io.qonversion.sandwich.QonversionSandwich;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class QonversionPlugin extends AnnotatedCordovaPlugin implements QonversionEventsListener {
    private QonversionSandwich qonversionSandwich;
    private CallbackContext entitlementsUpdateDelegate = null;
    private CallbackContext automationsEventDelegate = null;

    @Override // org.apache.cordova.CordovaPlugin
    public void pluginInitialize() {
        super.pluginInitialize();
        Application application = (Application) this.f9cordova.getContext().getApplicationContext();
        final CordovaInterface cordovaInterface = this.f9cordova;
        Objects.requireNonNull(cordovaInterface);
        this.qonversionSandwich = new QonversionSandwich(application, new ActivityProvider() { // from class: com.qonversion.android.sdk.QonversionPlugin$$ExternalSyntheticLambda0
            @Override // io.qonversion.sandwich.ActivityProvider
            public final Activity getCurrentActivity() {
                return cordovaInterface.getActivity();
            }
        }, this);
    }

    @PluginAction(actionName = "syncHistoricalData", isAutofinish = false, thread = ExecutionThread.WORKER)
    public void syncHistoricalData(CallbackContext callbackContext) {
        this.qonversionSandwich.syncHistoricalData();
        callbackContext.success();
    }

    @PluginAction(actionName = "storeSDKInfo", thread = ExecutionThread.MAIN)
    public void storeSDKInfo(String str, String str2, CallbackContext callbackContext) {
        this.qonversionSandwich.storeSdkInfo(str, str2);
        callbackContext.success();
    }

    @PluginAction(actionName = "initializeSdk", isAutofinish = false, thread = ExecutionThread.MAIN)
    public void initializeSdk(String str, String str2, String str3, String str4, String str5, boolean z, CallbackContext callbackContext) {
        this.qonversionSandwich.initialize(this.f9cordova.getContext().getApplicationContext(), str, str2, str3, str4, str5, z);
        this.entitlementsUpdateDelegate = callbackContext;
        PluginResult pluginResult = new PluginResult(PluginResult.Status.NO_RESULT);
        pluginResult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginResult);
    }

    @PluginAction(actionName = "purchase", isAutofinish = false, thread = ExecutionThread.UI)
    public void purchase(String str, String str2, Boolean bool, String str3, String str4, JSONArray jSONArray, CallbackContext callbackContext) {
        List<String> listConvertArrayToStringList;
        if (jSONArray == null) {
            listConvertArrayToStringList = null;
        } else {
            try {
                listConvertArrayToStringList = EntitiesConverter.convertArrayToStringList(jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
                callbackContext.error(e.getMessage());
                return;
            }
        }
        this.qonversionSandwich.purchase(str, str2, bool, str3, str4, listConvertArrayToStringList, Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "updatePurchase", isAutofinish = false, thread = ExecutionThread.UI)
    public void updatePurchase(String str, String str2, Boolean bool, String str3, String str4, JSONArray jSONArray, CallbackContext callbackContext) {
        purchase(str, str2, bool, str3, str4, jSONArray, callbackContext);
    }

    @PluginAction(actionName = "setDefinedProperty", thread = ExecutionThread.WORKER)
    public void setDefinedProperty(String str, String str2, CallbackContext callbackContext) {
        this.qonversionSandwich.setDefinedProperty(str, str2);
        callbackContext.success();
    }

    @PluginAction(actionName = "setCustomProperty", thread = ExecutionThread.WORKER)
    public void setCustomProperty(String str, String str2, CallbackContext callbackContext) {
        this.qonversionSandwich.setCustomProperty(str, str2);
        callbackContext.success();
    }

    @PluginAction(actionName = "userProperties", isAutofinish = false, thread = ExecutionThread.UI)
    public void userProperties(CallbackContext callbackContext) {
        this.qonversionSandwich.userProperties(Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "attribution", thread = ExecutionThread.WORKER)
    public void attribution(JSONObject jSONObject, String str, CallbackContext callbackContext) {
        try {
            this.qonversionSandwich.addAttributionData(str, EntitiesConverter.toMap(jSONObject));
            callbackContext.success();
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error(e.getMessage());
        }
    }

    @PluginAction(actionName = "checkEntitlements", isAutofinish = false, thread = ExecutionThread.UI)
    public void checkEntitlements(CallbackContext callbackContext) {
        this.qonversionSandwich.checkEntitlements(Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "products", isAutofinish = false, thread = ExecutionThread.UI)
    public void products(CallbackContext callbackContext) {
        this.qonversionSandwich.products(Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "offerings", isAutofinish = false, thread = ExecutionThread.UI)
    public void offerings(CallbackContext callbackContext) {
        this.qonversionSandwich.offerings(Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "checkTrialIntroEligibilityForProductIds", isAutofinish = false, thread = ExecutionThread.UI)
    public void checkTrialIntroEligibilityForProductIds(JSONArray jSONArray, CallbackContext callbackContext) {
        try {
            this.qonversionSandwich.checkTrialIntroEligibility(EntitiesConverter.convertArrayToStringList(jSONArray), Utils.getResultListener(callbackContext));
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error(e.getMessage());
        }
    }

    @PluginAction(actionName = "restore", isAutofinish = false, thread = ExecutionThread.UI)
    public void restore(CallbackContext callbackContext) {
        this.qonversionSandwich.restore(Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "remoteConfig", isAutofinish = false, thread = ExecutionThread.WORKER)
    public void remoteConfig(String str, CallbackContext callbackContext) {
        this.qonversionSandwich.remoteConfig(str, Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "remoteConfigList", isAutofinish = false, thread = ExecutionThread.WORKER)
    public void remoteConfigList(CallbackContext callbackContext) {
        this.qonversionSandwich.remoteConfigList(Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "remoteConfigListForContextKeys", isAutofinish = false, thread = ExecutionThread.WORKER)
    public void remoteConfigListForContextKeys(JSONArray jSONArray, boolean z, CallbackContext callbackContext) {
        try {
            this.qonversionSandwich.remoteConfigList(EntitiesConverter.convertArrayToStringList(jSONArray), z, Utils.getResultListener(callbackContext));
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error(e.getMessage());
        }
    }

    @PluginAction(actionName = "attachUserToExperiment", isAutofinish = false, thread = ExecutionThread.UI)
    public void attachUserToExperiment(String str, String str2, CallbackContext callbackContext) {
        this.qonversionSandwich.attachUserToExperiment(str, str2, Utils.getEmptyResultListener(callbackContext));
    }

    @PluginAction(actionName = "detachUserFromExperiment", isAutofinish = false, thread = ExecutionThread.UI)
    public void detachUserFromExperiment(String str, CallbackContext callbackContext) {
        this.qonversionSandwich.detachUserFromExperiment(str, Utils.getEmptyResultListener(callbackContext));
    }

    @PluginAction(actionName = "attachUserToRemoteConfiguration", isAutofinish = false, thread = ExecutionThread.UI)
    public void attachUserToRemoteConfiguration(String str, CallbackContext callbackContext) {
        this.qonversionSandwich.attachUserToRemoteConfiguration(str, Utils.getEmptyResultListener(callbackContext));
    }

    @PluginAction(actionName = "detachUserFromRemoteConfiguration", isAutofinish = false, thread = ExecutionThread.UI)
    public void detachUserFromRemoteConfiguration(String str, CallbackContext callbackContext) {
        this.qonversionSandwich.detachUserFromRemoteConfiguration(str, Utils.getEmptyResultListener(callbackContext));
    }

    @PluginAction(actionName = "isFallbackFileAccessible", isAutofinish = false, thread = ExecutionThread.WORKER)
    public void isFallbackFileAccessible(CallbackContext callbackContext) {
        this.qonversionSandwich.isFallbackFileAccessible(Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "syncPurchases", isAutofinish = false, thread = ExecutionThread.WORKER)
    public void syncPurchases(CallbackContext callbackContext) {
        this.qonversionSandwich.syncPurchases();
        callbackContext.success();
    }

    @PluginAction(actionName = "identify", thread = ExecutionThread.WORKER)
    public void identify(String str, CallbackContext callbackContext) {
        this.qonversionSandwich.identify(str, Utils.getResultListener(callbackContext));
    }

    @PluginAction(actionName = "logout", thread = ExecutionThread.WORKER)
    public void logout(CallbackContext callbackContext) {
        this.qonversionSandwich.logout();
        callbackContext.success();
    }

    @PluginAction(actionName = "userInfo", isAutofinish = false, thread = ExecutionThread.UI)
    public void userInfo(CallbackContext callbackContext) {
        this.qonversionSandwich.userInfo(Utils.getResultListener(callbackContext));
    }

    @Override // io.qonversion.sandwich.QonversionEventsListener
    public void onEntitlementsUpdated(Map<String, ?> map) {
        if (this.entitlementsUpdateDelegate != null) {
            try {
                PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, EntitiesConverter.convertMapToJson(map));
                pluginResult.setKeepCallback(true);
                this.entitlementsUpdateDelegate.sendPluginResult(pluginResult);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
