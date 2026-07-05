package cordova.plugins.screenorientation;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class CDVOrientation extends CordovaPlugin {
    private static final String ANY = "any";
    private static final String LANDSCAPE = "landscape";
    private static final String LANDSCAPE_PRIMARY = "landscape-primary";
    private static final String LANDSCAPE_SECONDARY = "landscape-secondary";
    private static final String PORTRAIT = "portrait";
    private static final String PORTRAIT_PRIMARY = "portrait-primary";
    private static final String PORTRAIT_SECONDARY = "portrait-secondary";
    private static final String TAG = "YoikScreenOrientation";

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        Log.d(TAG, "execute action: " + str);
        if (str.equals("screenOrientation")) {
            return routeScreenOrientation(jSONArray, callbackContext);
        }
        callbackContext.error("action not recognised");
        return false;
    }

    private boolean routeScreenOrientation(JSONArray jSONArray, CallbackContext callbackContext) {
        jSONArray.optString(0);
        String strOptString = jSONArray.optString(1);
        Log.d(TAG, "Requested ScreenOrientation: " + strOptString);
        AppCompatActivity activity = this.f9cordova.getActivity();
        if (strOptString.equals(ANY)) {
            activity.setRequestedOrientation(-1);
        } else if (strOptString.equals(LANDSCAPE_PRIMARY)) {
            activity.setRequestedOrientation(0);
        } else if (strOptString.equals(PORTRAIT_PRIMARY)) {
            activity.setRequestedOrientation(1);
        } else if (strOptString.equals(LANDSCAPE)) {
            activity.setRequestedOrientation(6);
        } else if (strOptString.equals(PORTRAIT)) {
            activity.setRequestedOrientation(7);
        } else if (strOptString.equals(LANDSCAPE_SECONDARY)) {
            activity.setRequestedOrientation(8);
        } else if (strOptString.equals(PORTRAIT_SECONDARY)) {
            activity.setRequestedOrientation(9);
        }
        callbackContext.success();
        return true;
    }
}
