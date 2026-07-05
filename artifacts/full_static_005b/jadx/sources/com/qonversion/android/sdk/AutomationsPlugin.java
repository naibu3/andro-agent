package com.qonversion.android.sdk;

import androidx.core.app.NotificationCompat;
import com.appfeel.cordova.annotated.android.plugin.AnnotatedCordovaPlugin;
import com.appfeel.cordova.annotated.android.plugin.ExecutionThread;
import com.appfeel.cordova.annotated.android.plugin.PluginAction;
import io.qonversion.sandwich.AutomationsEventListener;
import io.qonversion.sandwich.AutomationsSandwich;
import io.qonversion.sandwich.ResultListener;
import io.qonversion.sandwich.SandwichError;
import java.util.Map;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AutomationsPlugin extends AnnotatedCordovaPlugin implements AutomationsEventListener {
    private CallbackContext automationsEventDelegate = null;
    private AutomationsSandwich automationsSandwich;

    @Override // org.apache.cordova.CordovaPlugin
    public void pluginInitialize() {
        super.pluginInitialize();
        this.automationsSandwich = new AutomationsSandwich();
    }

    @PluginAction(actionName = "subscribe", isAutofinish = false, thread = ExecutionThread.MAIN)
    public void subscribe(CallbackContext callbackContext) {
        this.automationsEventDelegate = callbackContext;
        this.automationsSandwich.setDelegate(this);
        PluginResult pluginResult = new PluginResult(PluginResult.Status.NO_RESULT);
        pluginResult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginResult);
    }

    @PluginAction(actionName = "showScreen", isAutofinish = false, thread = ExecutionThread.UI)
    public void showScreen(String str, final CallbackContext callbackContext) {
        this.automationsSandwich.showScreen(str, new ResultListener() { // from class: com.qonversion.android.sdk.AutomationsPlugin.1
            @Override // io.qonversion.sandwich.ResultListener
            public void onSuccess(Map<String, ?> map) {
                callbackContext.success();
            }

            @Override // io.qonversion.sandwich.ResultListener
            public void onError(SandwichError sandwichError) throws JSONException {
                Utils.rejectWithError(sandwichError, callbackContext);
            }
        });
    }

    @PluginAction(actionName = "setScreenPresentationConfig", thread = ExecutionThread.WORKER)
    public void setScreenPresentationConfig(JSONObject jSONObject, String str, CallbackContext callbackContext) {
        try {
            this.automationsSandwich.setScreenPresentationConfig(EntitiesConverter.toMap(jSONObject), str);
            callbackContext.success();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // io.qonversion.sandwich.AutomationsEventListener
    public void onAutomationEvent(AutomationsEventListener.Event event, Map<String, ?> map) throws JSONException {
        JSONObject jSONObjectConvertMapToJson;
        if (this.automationsEventDelegate != null) {
            if (map != null) {
                try {
                    jSONObjectConvertMapToJson = EntitiesConverter.convertMapToJson(map);
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                jSONObjectConvertMapToJson = null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, event.getKey());
            jSONObject.put("payload", jSONObjectConvertMapToJson);
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, jSONObject);
            pluginResult.setKeepCallback(true);
            this.automationsEventDelegate.sendPluginResult(pluginResult);
        }
    }
}
