package nl.xservices.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class Insomnia extends CordovaPlugin {
    private static final String ACTION_ALLOW_SLEEP_AGAIN = "allowSleepAgain";
    private static final String ACTION_KEEP_AWAKE = "keepAwake";

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, final CallbackContext callbackContext) throws JSONException {
        try {
            if (ACTION_KEEP_AWAKE.equals(str)) {
                this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: nl.xservices.plugins.Insomnia.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Insomnia.this.f9cordova.getActivity().getWindow().addFlags(128);
                        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK));
                    }
                });
                return true;
            }
            if (ACTION_ALLOW_SLEEP_AGAIN.equals(str)) {
                this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: nl.xservices.plugins.Insomnia.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Insomnia.this.f9cordova.getActivity().getWindow().clearFlags(128);
                        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK));
                    }
                });
                return true;
            }
            callbackContext.error("insomnia." + str + " is not a supported function. Did you mean 'keepAwake'?");
            return false;
        } catch (Exception e) {
            callbackContext.error(e.getMessage());
            return false;
        }
    }
}
