package admob.plus.core;

import admob.plus.core.Helper;
import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class Ad {
    public final String adUnitId;
    public final String id;

    protected abstract Helper.Adapter getAdapter();

    public Ad(String str, String str2) {
        this.id = str;
        this.adUnitId = str2;
        Helper.ads.put(str, this);
    }

    public Ad(Context context) {
        this((String) Objects.requireNonNull(context.optId()), (String) Objects.requireNonNull(context.optAdUnitID()));
    }

    public void destroy() {
        Helper.ads.remove(this.id);
    }

    public Activity getActivity() {
        return getAdapter().getActivity();
    }

    public ViewGroup getContentView() {
        return (ViewGroup) getActivity().findViewById(R.id.content);
    }

    protected void emit(String str) {
        emit(str, new HashMap());
    }

    protected void emit(String str, AdError adError) {
        emit(str, new HashMap<String, Object>(adError) { // from class: admob.plus.core.Ad.1
            final /* synthetic */ AdError val$error;

            {
                this.val$error = adError;
                put("code", Integer.valueOf(adError.getCode()));
                put("message", adError.getMessage());
                put("cause", adError.getCause());
            }
        });
    }

    protected void emit(String str, final RewardItem rewardItem) {
        emit(str, new HashMap<String, Object>() { // from class: admob.plus.core.Ad.2
            {
                put("reward", new HashMap<String, Object>() { // from class: admob.plus.core.Ad.2.1
                    {
                        put("amount", Integer.valueOf(rewardItem.getAmount()));
                        put("type", rewardItem.getType());
                    }
                });
            }
        });
    }

    protected void emit(String str, Map<String, Object> map) {
        getAdapter().emit(str, new HashMap<String, Object>(map) { // from class: admob.plus.core.Ad.3
            {
                put("adId", Ad.this.id);
            }
        });
    }
}
