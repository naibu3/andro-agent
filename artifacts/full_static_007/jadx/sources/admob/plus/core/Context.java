package admob.plus.core;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface Context {
    boolean has(String str);

    Object opt(String str);

    Boolean optBoolean(String str);

    Double optDouble(String str);

    Integer optInt(String str);

    JSONObject optObject(String str);

    String optString(String str);

    List<String> optStringList(String str);

    void reject(String str);

    void resolve();

    void resolve(boolean z);

    static Integer intFromBool(Context context, String str, int i, int i2, int i3) {
        if (!context.has(str)) {
            return null;
        }
        Boolean boolOptBoolean = context.optBoolean(str);
        if (boolOptBoolean == null) {
            return Integer.valueOf(i);
        }
        if (!boolOptBoolean.booleanValue()) {
            i2 = i3;
        }
        return Integer.valueOf(i2);
    }

    default double optDouble(String str, double d) {
        Double dOptDouble = optDouble(str);
        return dOptDouble == null ? d : dOptDouble.doubleValue();
    }

    default Float optFloat(String str) {
        Double dOptDouble = optDouble(str);
        if (dOptDouble == null) {
            return null;
        }
        return Float.valueOf(dOptDouble.floatValue());
    }

    default void reject() {
        reject("unknown error");
    }

    default void reject(LoadAdError loadAdError) {
        reject(loadAdError.getMessage());
    }

    default String optId() {
        return optString("id");
    }

    default Ad optAd() {
        return Helper.getAd(optId());
    }

    default Ad optAdOrError() {
        Ad adOptAd = optAd();
        if (adOptAd == null) {
            reject("Ad not found");
        }
        return adOptAd;
    }

    default String optAdUnitID() {
        return optString("adUnitId");
    }

    default Boolean optAppMuted() {
        return optBoolean("appMuted");
    }

    default Float optAppVolume() {
        return optFloat("appVolume");
    }

    default String optPosition() {
        return optString("position");
    }

    default AdRequest optAdRequest() {
        AdRequest.Builder builder = new AdRequest.Builder();
        if (has("contentUrl")) {
            builder.setContentUrl((String) Objects.requireNonNull(optString("contentUrl")));
        }
        Bundle bundle = new Bundle();
        if (has("npa")) {
            bundle.putString("npa", optString("npa"));
        }
        return builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    default RequestConfiguration optRequestConfiguration() {
        RequestConfiguration.Builder builder = new RequestConfiguration.Builder();
        if (has("maxAdContentRating")) {
            builder.setMaxAdContentRating(optString("maxAdContentRating"));
        }
        Integer numIntFromBool = intFromBool(this, "tagForChildDirectedTreatment", -1, 1, 0);
        if (numIntFromBool != null) {
            builder.setTagForChildDirectedTreatment(numIntFromBool.intValue());
        }
        Integer numIntFromBool2 = intFromBool(this, "tagForUnderAgeOfConsent", -1, 1, 0);
        if (numIntFromBool2 != null) {
            builder.setTagForUnderAgeOfConsent(numIntFromBool2.intValue());
        }
        if (has("testDeviceIds")) {
            builder.setTestDeviceIds(optStringList("testDeviceIds"));
        }
        return builder.build();
    }

    default ServerSideVerificationOptions optServerSideVerificationOptions() {
        JSONObject jSONObjectOptObject = optObject("serverSideVerification");
        if (jSONObjectOptObject == null) {
            return null;
        }
        ServerSideVerificationOptions.Builder builder = new ServerSideVerificationOptions.Builder();
        if (jSONObjectOptObject.has("customData")) {
            builder.setCustomData(jSONObjectOptObject.optString("customData"));
        }
        if (jSONObjectOptObject.has("userId")) {
            builder.setUserId(jSONObjectOptObject.optString("userId"));
        }
        return builder.build();
    }

    default void configure(Helper helper) {
        Boolean boolOptAppMuted = optAppMuted();
        if (boolOptAppMuted != null) {
            MobileAds.setAppMuted(boolOptAppMuted.booleanValue());
        }
        Float fOptAppVolume = optAppVolume();
        if (fOptAppVolume != null) {
            MobileAds.setAppVolume(fOptAppVolume.floatValue());
        }
        MobileAds.setRequestConfiguration(optRequestConfiguration());
        helper.configForTestLab();
        resolve();
    }
}
