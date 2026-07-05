package admob.plus.cordova.ads;

import admob.plus.cordova.ExecuteContext;
import admob.plus.core.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class WebViewAd extends AdBase {
    private static final String TAG = "AdMobPlus.WebViewAd";

    @Override // admob.plus.core.GenericAd
    public boolean isLoaded() {
        return false;
    }

    public WebViewAd(ExecuteContext executeContext) {
        super(executeContext);
        Log.d(TAG, "WebViewAd");
    }

    @Override // admob.plus.core.GenericAd
    public void load(Context context) {
        context.resolve();
    }

    @Override // admob.plus.core.GenericAd
    public void show(Context context) {
        context.resolve();
    }

    @Override // admob.plus.core.GenericAd
    public void hide(Context context) {
        context.resolve();
    }
}
