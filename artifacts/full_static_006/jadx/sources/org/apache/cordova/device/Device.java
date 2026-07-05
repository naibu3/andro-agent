package org.apache.cordova.device;

import android.os.Build;
import android.provider.Settings;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Device extends CordovaPlugin {
    private static final String ANDROID_PLATFORM = "Android";
    public static String uuid;

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
        uuid = getUuid();
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (!"getDeviceInfo".equals(str)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uuid", uuid);
        jSONObject.put("version", getOSVersion());
        jSONObject.put("platform", getPlatform());
        jSONObject.put("model", getModel());
        jSONObject.put("manufacturer", getManufacturer());
        jSONObject.put("isVirtual", isVirtual());
        jSONObject.put("serial", getSerialNumber());
        jSONObject.put("sdkVersion", getSDKVersion());
        callbackContext.success(jSONObject);
        return true;
    }

    public String getPlatform() {
        return ANDROID_PLATFORM;
    }

    public String getUuid() {
        return Settings.Secure.getString(this.f9cordova.getContext().getContentResolver(), "android_id");
    }

    public String getModel() {
        return Build.MODEL;
    }

    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public String getSerialNumber() {
        return Build.SERIAL;
    }

    public String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    public String getSDKVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public boolean isVirtual() {
        return Build.FINGERPRINT.contains("generic") || Build.PRODUCT.contains("sdk");
    }
}
