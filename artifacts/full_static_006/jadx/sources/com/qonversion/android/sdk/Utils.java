package com.qonversion.android.sdk;

import io.qonversion.sandwich.ResultListener;
import io.qonversion.sandwich.SandwichError;
import java.util.Map;
import org.apache.cordova.CallbackContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Utils {
    static ResultListener getEmptyResultListener(final CallbackContext callbackContext) {
        return new ResultListener() { // from class: com.qonversion.android.sdk.Utils.1
            @Override // io.qonversion.sandwich.ResultListener
            public void onSuccess(Map<String, ?> map) {
                callbackContext.success(new JSONObject());
            }

            @Override // io.qonversion.sandwich.ResultListener
            public void onError(SandwichError sandwichError) throws JSONException {
                Utils.rejectWithError(sandwichError, callbackContext);
            }
        };
    }

    static ResultListener getResultListener(final CallbackContext callbackContext) {
        return new ResultListener() { // from class: com.qonversion.android.sdk.Utils.2
            @Override // io.qonversion.sandwich.ResultListener
            public void onSuccess(Map<String, ?> map) {
                try {
                    callbackContext.success(EntitiesConverter.convertMapToJson(map));
                } catch (JSONException e) {
                    e.printStackTrace();
                    callbackContext.error(e.getMessage());
                }
            }

            @Override // io.qonversion.sandwich.ResultListener
            public void onError(SandwichError sandwichError) throws JSONException {
                Utils.rejectWithError(sandwichError, callbackContext);
            }
        };
    }

    static void rejectWithError(SandwichError sandwichError, CallbackContext callbackContext) throws JSONException {
        rejectWithError(sandwichError, callbackContext, null);
    }

    static void rejectWithError(SandwichError sandwichError, CallbackContext callbackContext, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", sandwichError.getDescription());
            jSONObject.put("additionalMessage", sandwichError.getAdditionalMessage());
            if (str == null) {
                str = sandwichError.getCode();
            }
            jSONObject.put("code", str);
            callbackContext.error(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            callbackContext.error(e.getMessage());
        }
    }
}
