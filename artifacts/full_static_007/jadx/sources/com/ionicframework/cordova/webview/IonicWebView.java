package com.ionicframework.cordova.webview;

import android.content.SharedPreferences;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class IonicWebView extends CordovaPlugin {
    public static final String CDV_SERVER_PATH = "serverBasePath";
    public static final String WEBVIEW_PREFS_NAME = "WebViewSettings";

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (str.equals("setServerBasePath")) {
            final String string = jSONArray.getString(0);
            this.f9cordova.getActivity().runOnUiThread(new Runnable() { // from class: com.ionicframework.cordova.webview.IonicWebView.1
                @Override // java.lang.Runnable
                public void run() {
                    ((IonicWebViewEngine) IonicWebView.this.webView.getEngine()).setServerBasePath(string);
                }
            });
            return true;
        }
        if (str.equals("getServerBasePath")) {
            callbackContext.success(((IonicWebViewEngine) this.webView.getEngine()).getServerBasePath());
            return true;
        }
        if (!str.equals("persistServerBasePath")) {
            return false;
        }
        String serverBasePath = ((IonicWebViewEngine) this.webView.getEngine()).getServerBasePath();
        SharedPreferences.Editor editorEdit = this.f9cordova.getActivity().getApplicationContext().getSharedPreferences(WEBVIEW_PREFS_NAME, 0).edit();
        editorEdit.putString(CDV_SERVER_PATH, serverBasePath);
        editorEdit.apply();
        return true;
    }
}
