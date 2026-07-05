package admob.plus.cordova;

import admob.plus.cordova.ads.Banner;
import admob.plus.core.Ad;
import admob.plus.core.Context;
import admob.plus.core.Helper;
import android.app.Activity;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.AdSize;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ExecuteContext implements Context {
    public static AdMob plugin;
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

    @Override // admob.plus.core.Context
    public boolean has(String str) {
        return this.opts.has(str);
    }

    @Override // admob.plus.core.Context
    public Object opt(String str) {
        return this.opts.opt(str);
    }

    @Override // admob.plus.core.Context
    public Boolean optBoolean(String str) {
        if (this.opts.has(str)) {
            return Boolean.valueOf(this.opts.optBoolean(str));
        }
        return null;
    }

    @Override // admob.plus.core.Context
    public Double optDouble(String str) {
        if (this.opts.has(str)) {
            return Double.valueOf(this.opts.optDouble(str));
        }
        return null;
    }

    @Override // admob.plus.core.Context
    public Integer optInt(String str) {
        if (this.opts.has(str)) {
            return Integer.valueOf(this.opts.optInt(str));
        }
        return null;
    }

    @Override // admob.plus.core.Context
    public String optString(String str) {
        if (this.opts.has(str)) {
            return this.opts.optString(str);
        }
        return null;
    }

    @Override // admob.plus.core.Context
    public List<String> optStringList(String str) {
        return Helper.jsonArray2stringList(this.opts.optJSONArray(str));
    }

    @Override // admob.plus.core.Context
    public JSONObject optObject(String str) {
        return this.opts.optJSONObject(str);
    }

    @Override // admob.plus.core.Context
    public void resolve() {
        this.callbackContext.success();
    }

    @Override // admob.plus.core.Context
    public void resolve(boolean z) {
        sendResult(new PluginResult(PluginResult.Status.OK, z));
    }

    @Override // admob.plus.core.Context
    public void reject(String str) {
        this.callbackContext.error(str);
    }

    public Integer optOffset() {
        if (this.opts.has(TypedValues.CycleType.S_WAVE_OFFSET)) {
            return Integer.valueOf(this.opts.optInt(TypedValues.CycleType.S_WAVE_OFFSET));
        }
        return null;
    }

    public <T extends Ad> T optAdOrCreate(Class<T> cls) {
        Ad adOptAd = optAd();
        if (adOptAd != null) {
            try {
                return cls.cast(adOptAd);
            } catch (ClassCastException unused) {
                reject("Wrong ad type");
                return null;
            }
        }
        try {
            return cls.getDeclaredConstructor(ExecuteContext.class).newInstance(this);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            reject("Fail to create ad");
            return null;
        }
    }

    public AdSize optAdSize() {
        if (!this.opts.has("size")) {
            return AdSize.SMART_BANNER;
        }
        JSONObject jSONObjectOptJSONObject = this.opts.optJSONObject("size");
        AdSize adSize = Banner.AdSizeType.getAdSize(this.opts.optInt("size"));
        if (jSONObjectOptJSONObject == null) {
            return adSize != null ? adSize : AdSize.SMART_BANNER;
        }
        String strOptString = jSONObjectOptJSONObject.optString("adaptive");
        int iPxToDp = Helper.pxToDp(jSONObjectOptJSONObject.has("width") ? jSONObjectOptJSONObject.optInt("width") : Resources.getSystem().getDisplayMetrics().widthPixels);
        if ("inline".equals(strOptString)) {
            if (jSONObjectOptJSONObject.has("maxHeight")) {
                return AdSize.getInlineAdaptiveBannerAdSize(iPxToDp, Helper.pxToDp(jSONObjectOptJSONObject.optInt("maxHeight")));
            }
            return new AdSize(iPxToDp, Helper.pxToDp(jSONObjectOptJSONObject.optInt("height")));
        }
        String strOptString2 = jSONObjectOptJSONObject.optString("orientation");
        strOptString2.hashCode();
        if (strOptString2.equals("portrait")) {
            return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(getActivity(), iPxToDp);
        }
        if (strOptString2.equals("landscape")) {
            return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(getActivity(), iPxToDp);
        }
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(getActivity(), iPxToDp);
    }

    public Activity getActivity() {
        return plugin.f9cordova.getActivity();
    }

    public void sendResult(PluginResult pluginResult) {
        this.callbackContext.sendPluginResult(pluginResult);
    }
}
