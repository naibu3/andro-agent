package com.appfeel.cordova.annotated.android.plugin;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class AnnotatedCordovaPlugin extends CordovaPlugin {
    private static String TAG = "AnnotatedCordovaPlugin";
    private Map<String, CordovaPluginAction> pluginActions;

    private Map<String, CordovaPluginAction> getPluginActions() throws SecurityException {
        HashMap map = new HashMap();
        for (Method method : getClass().getDeclaredMethods()) {
            PluginAction pluginAction = (PluginAction) method.getAnnotation(PluginAction.class);
            if (pluginAction != null) {
                String strActionName = pluginAction.actionName();
                if (strActionName.isEmpty()) {
                    strActionName = method.getName();
                }
                map.put(strActionName, new CordovaPluginAction(method, pluginAction.thread(), pluginAction.isAutofinish()));
                method.setAccessible(true);
            }
        }
        return map;
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        if (this.pluginActions == null) {
            this.pluginActions = getPluginActions();
        }
        CordovaPluginAction cordovaPluginAction = this.pluginActions.get(str);
        if (cordovaPluginAction != null) {
            return cordovaPluginAction.execute(this.f9cordova, this, jSONArray, callbackContext);
        }
        LOG.d(TAG, String.format("Unknown plugin action: %s", str));
        return false;
    }
}
