package admob.plus.core;

import android.app.Activity;
import android.content.res.Resources;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class Helper {
    public static final Map<String, Ad> ads = new ConcurrentHashMap();
    private final Adapter adapter;

    public Helper(Adapter adapter) {
        this.adapter = adapter;
    }

    public static Ad getAd(String str) {
        return ads.get(str);
    }

    public static double dpToPx(double d) {
        return d * Resources.getSystem().getDisplayMetrics().density;
    }

    public static int pxToDp(int i) {
        return Math.round(i / (Resources.getSystem().getDisplayMetrics().xdpi / 160.0f));
    }

    public static List<String> jsonArray2stringList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (strOptString != null) {
                arrayList.add(strOptString);
            }
        }
        return arrayList;
    }

    public static ViewGroup getParentView(View view) {
        if (view == null) {
            return null;
        }
        return (ViewGroup) view.getParent();
    }

    public static ViewGroup removeFromParentView(View view) {
        ViewGroup parentView = getParentView(view);
        if (parentView != null) {
            parentView.removeView(view);
        }
        return parentView;
    }

    public static void NOT_IMPLEMENTED() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    private static String md5(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return String.format("%32s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0');
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public Activity getActivity() {
        return this.adapter.getActivity();
    }

    public boolean isRunningInTestLab() {
        return "true".equals(Settings.System.getString(getActivity().getContentResolver(), "firebase.test.lab"));
    }

    public void configForTestLab() {
        if (isRunningInTestLab()) {
            RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
            List<String> testDeviceIds = requestConfiguration.getTestDeviceIds();
            String deviceId = getDeviceId();
            if (testDeviceIds.contains(deviceId)) {
                return;
            }
            testDeviceIds.add(deviceId);
            RequestConfiguration.Builder builder = requestConfiguration.toBuilder();
            builder.setTestDeviceIds(testDeviceIds);
            MobileAds.setRequestConfiguration(builder.build());
        }
    }

    private String getDeviceId() {
        return md5(Settings.Secure.getString(getActivity().getContentResolver(), "android_id")).toUpperCase();
    }

    public interface Adapter {
        void emit(String str, Map<String, Object> map);

        Activity getActivity();

        default void emit(String str) {
            emit(str, new HashMap());
        }
    }
}
