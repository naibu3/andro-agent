package cordova.plugin.consent;

import android.app.Activity;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ExecuteContext {
    public static Consent plugin;
    public final String actionKey;
    public final JSONArray args;
    public final CallbackContext callbackContext;
    public final JSONObject opts;

    ExecuteContext(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        this.actionKey = str;
        this.args = jSONArray;
        this.callbackContext = callbackContext;
        this.opts = jSONArray.optJSONObject(0);
    }

    public int optId() {
        JSONObject jSONObject = this.opts;
        if (jSONObject != null) {
            return jSONObject.optInt("id");
        }
        return -1;
    }

    public ConsentRequestParameters optConsentRequestParameters() {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        JSONObject jSONObject = this.opts;
        if (jSONObject != null) {
            if (jSONObject.has("tagForUnderAgeOfConsent")) {
                builder.setTagForUnderAgeOfConsent(this.opts.optBoolean("tagForUnderAgeOfConsent"));
            }
            if (this.opts.has("debugGeography") || this.opts.has("testDeviceIds")) {
                builder.setConsentDebugSettings(optConsentDebugSettings());
            }
        }
        return builder.build();
    }

    public ConsentDebugSettings optConsentDebugSettings() {
        JSONArray jSONArrayOptJSONArray;
        ConsentDebugSettings.Builder builder = new ConsentDebugSettings.Builder(getActivity());
        JSONObject jSONObject = this.opts;
        if (jSONObject == null) {
            return builder.build();
        }
        if (jSONObject.has("debugGeography")) {
            builder.setDebugGeography(this.opts.optInt("debugGeography"));
        }
        if (this.opts.has("testDeviceIds") && (jSONArrayOptJSONArray = this.opts.optJSONArray("testDeviceIds")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (strOptString != null && !strOptString.isEmpty()) {
                    builder.addTestDeviceHashedId(strOptString);
                }
            }
        }
        return builder.build();
    }

    private Activity getActivity() {
        return plugin.f9cordova.getActivity();
    }
}
