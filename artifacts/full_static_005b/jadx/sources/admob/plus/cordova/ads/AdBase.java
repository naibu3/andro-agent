package admob.plus.cordova.ads;

import admob.plus.cordova.ExecuteContext;
import admob.plus.core.Ad;
import admob.plus.core.GenericAd;
import admob.plus.core.Helper;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdRequest;
import org.apache.cordova.CordovaWebView;

/* loaded from: classes.dex */
public abstract class AdBase extends Ad implements GenericAd {
    protected AdRequest adRequest;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onPause(boolean z) {
    }

    public void onResume(boolean z) {
    }

    public AdBase(ExecuteContext executeContext) {
        super(executeContext);
        this.adRequest = executeContext.optAdRequest();
    }

    public void onDestroy() {
        super.destroy();
    }

    protected CordovaWebView getCordovaWebView() {
        return ExecuteContext.plugin.webView;
    }

    protected View getWebView() {
        return getCordovaWebView().getView();
    }

    protected ViewGroup getWebViewParent() {
        return (ViewGroup) getWebView().getParent();
    }

    @Override // admob.plus.core.Ad
    protected Helper.Adapter getAdapter() {
        return ExecuteContext.plugin;
    }
}
