package com.appfeel.cordova.annotated.android.plugin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CordovaPluginAction {
    private static String TAG = "CordovaPluginAction";
    private ExecutionThread executionThread;
    private boolean isAutofinish;
    private Method method;

    CordovaPluginAction(Method method, ExecutionThread executionThread, boolean z) {
        this.method = method;
        this.executionThread = executionThread;
        this.isAutofinish = z;
    }

    private static Object[] getMethodArgs(JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        int length = jSONArray.length();
        Object[] objArr = new Object[length + 1];
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (JSONObject.NULL.equals(objOpt)) {
                objOpt = null;
            }
            objArr[i] = objOpt;
        }
        objArr[length] = callbackContext;
        return objArr;
    }

    private Runnable createRunnable(final Object[] objArr, final AnnotatedCordovaPlugin annotatedCordovaPlugin, final CallbackContext callbackContext) {
        return new Runnable() { // from class: com.appfeel.cordova.annotated.android.plugin.CordovaPluginAction.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CordovaPluginAction.this.method.invoke(annotatedCordovaPlugin, objArr);
                    if (callbackContext.isFinished() || !CordovaPluginAction.this.isAutofinish) {
                        return;
                    }
                    callbackContext.success();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof InvocationTargetException) {
                        th = ((InvocationTargetException) th).getTargetException();
                    }
                    LOG.e(CordovaPluginAction.TAG, "Uncaught exception at " + getClass().getSimpleName() + "@" + CordovaPluginAction.this.method.getName(), th);
                    callbackContext.error(th.getMessage());
                }
            }
        };
    }

    public boolean execute(CordovaInterface cordovaInterface, AnnotatedCordovaPlugin annotatedCordovaPlugin, JSONArray jSONArray, CallbackContext callbackContext) throws JSONException {
        Runnable runnableCreateRunnable = createRunnable(getMethodArgs(jSONArray, callbackContext), annotatedCordovaPlugin, callbackContext);
        if (this.executionThread == ExecutionThread.WORKER) {
            cordovaInterface.getThreadPool().execute(runnableCreateRunnable);
            return true;
        }
        if (this.executionThread == ExecutionThread.UI) {
            cordovaInterface.getActivity().runOnUiThread(runnableCreateRunnable);
            return true;
        }
        runnableCreateRunnable.run();
        return true;
    }
}
