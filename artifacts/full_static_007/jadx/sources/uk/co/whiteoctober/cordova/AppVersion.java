package uk.co.whiteoctober.cordova;

import android.content.pm.PackageManager;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class AppVersion extends CordovaPlugin {
    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        try {
            if (str.equals("getAppName")) {
                PackageManager packageManager = this.f9cordova.getActivity().getPackageManager();
                callbackContext.success((String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f9cordova.getActivity().getPackageName(), 0)));
                return true;
            }
            if (str.equals("getPackageName")) {
                callbackContext.success(this.f9cordova.getActivity().getPackageName());
                return true;
            }
            if (str.equals("getVersionNumber")) {
                callbackContext.success(this.f9cordova.getActivity().getPackageManager().getPackageInfo(this.f9cordova.getActivity().getPackageName(), 0).versionName);
                return true;
            }
            if (!str.equals("getVersionCode")) {
                return false;
            }
            callbackContext.success(this.f9cordova.getActivity().getPackageManager().getPackageInfo(this.f9cordova.getActivity().getPackageName(), 0).versionCode);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            callbackContext.success("N/A");
            return true;
        }
    }
}
