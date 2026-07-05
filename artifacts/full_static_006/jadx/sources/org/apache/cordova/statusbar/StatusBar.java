package org.apache.cordova.statusbar;

import android.graphics.Color;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class StatusBar extends CordovaPlugin {
    private static final String ACTION_BACKGROUND_COLOR_BY_HEX_STRING = "backgroundColorByHexString";
    private static final String ACTION_HIDE = "hide";
    private static final String ACTION_OVERLAYS_WEB_VIEW = "overlaysWebView";
    private static final String ACTION_READY = "_ready";
    private static final String ACTION_SHOW = "show";
    private static final String ACTION_STYLE_DEFAULT = "styleDefault";
    private static final String ACTION_STYLE_LIGHT_CONTENT = "styleLightContent";
    private static final String STYLE_DEFAULT = "default";
    private static final String STYLE_LIGHT_CONTENT = "lightcontent";
    private static final String TAG = "StatusBar";
    private AppCompatActivity activity;
    private Window window;

    @Override // org.apache.cordova.CordovaPlugin
    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        LOG.v(TAG, "StatusBar: initialization");
        super.initialize(cordovaInterface, cordovaWebView);
        AppCompatActivity activity = this.f9cordova.getActivity();
        this.activity = activity;
        this.window = activity.getWindow();
        this.activity.runOnUiThread(new Runnable() { // from class: org.apache.cordova.statusbar.StatusBar$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1930lambda$initialize$0$orgapachecordovastatusbarStatusBar();
            }
        });
    }

    /* renamed from: lambda$initialize$0$org-apache-cordova-statusbar-StatusBar, reason: not valid java name */
    /* synthetic */ void m1930lambda$initialize$0$orgapachecordovastatusbarStatusBar() {
        this.window.clearFlags(2048);
        setStatusBarTransparent(this.preferences.getBoolean("StatusBarOverlaysWebView", true));
        setStatusBarBackgroundColor(this.preferences.getString("StatusBarBackgroundColor", "#000000"));
        setStatusBarStyle(this.preferences.getString("StatusBarStyle", STYLE_LIGHT_CONTENT).toLowerCase());
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(String str, final CordovaArgs cordovaArgs, CallbackContext callbackContext) {
        LOG.v(TAG, "Executing action: " + str);
        str.hashCode();
        switch (str) {
            case "_ready":
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, (this.window.getAttributes().flags & 1024) == 0));
                return true;
            case "styleDefault":
                this.activity.runOnUiThread(new Runnable() { // from class: org.apache.cordova.statusbar.StatusBar$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1928lambda$execute$5$orgapachecordovastatusbarStatusBar();
                    }
                });
                return true;
            case "styleLightContent":
                this.activity.runOnUiThread(new Runnable() { // from class: org.apache.cordova.statusbar.StatusBar$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1929lambda$execute$6$orgapachecordovastatusbarStatusBar();
                    }
                });
                return true;
            case "hide":
                this.activity.runOnUiThread(new Runnable() { // from class: org.apache.cordova.statusbar.StatusBar$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1925lambda$execute$2$orgapachecordovastatusbarStatusBar();
                    }
                });
                return true;
            case "show":
                this.activity.runOnUiThread(new Runnable() { // from class: org.apache.cordova.statusbar.StatusBar$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1924lambda$execute$1$orgapachecordovastatusbarStatusBar();
                    }
                });
                return true;
            case "overlaysWebView":
                this.activity.runOnUiThread(new Runnable() { // from class: org.apache.cordova.statusbar.StatusBar$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1927lambda$execute$4$orgapachecordovastatusbarStatusBar(cordovaArgs);
                    }
                });
                return true;
            case "backgroundColorByHexString":
                this.activity.runOnUiThread(new Runnable() { // from class: org.apache.cordova.statusbar.StatusBar$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1926lambda$execute$3$orgapachecordovastatusbarStatusBar(cordovaArgs);
                    }
                });
                return true;
            default:
                return false;
        }
    }

    /* renamed from: lambda$execute$1$org-apache-cordova-statusbar-StatusBar, reason: not valid java name */
    /* synthetic */ void m1924lambda$execute$1$orgapachecordovastatusbarStatusBar() {
        this.window.getDecorView().setSystemUiVisibility(this.window.getDecorView().getSystemUiVisibility() & (-1029));
        this.window.clearFlags(1024);
    }

    /* renamed from: lambda$execute$2$org-apache-cordova-statusbar-StatusBar, reason: not valid java name */
    /* synthetic */ void m1925lambda$execute$2$orgapachecordovastatusbarStatusBar() {
        this.window.getDecorView().setSystemUiVisibility(this.window.getDecorView().getSystemUiVisibility() | 1028);
        this.window.addFlags(1024);
    }

    /* renamed from: lambda$execute$3$org-apache-cordova-statusbar-StatusBar, reason: not valid java name */
    /* synthetic */ void m1926lambda$execute$3$orgapachecordovastatusbarStatusBar(CordovaArgs cordovaArgs) {
        try {
            setStatusBarBackgroundColor(cordovaArgs.getString(0));
        } catch (JSONException unused) {
            LOG.e(TAG, "Invalid hexString argument, use f.i. '#777777'");
        }
    }

    /* renamed from: lambda$execute$4$org-apache-cordova-statusbar-StatusBar, reason: not valid java name */
    /* synthetic */ void m1927lambda$execute$4$orgapachecordovastatusbarStatusBar(CordovaArgs cordovaArgs) {
        try {
            setStatusBarTransparent(cordovaArgs.getBoolean(0));
        } catch (JSONException unused) {
            LOG.e(TAG, "Invalid boolean argument");
        }
    }

    /* renamed from: lambda$execute$5$org-apache-cordova-statusbar-StatusBar, reason: not valid java name */
    /* synthetic */ void m1928lambda$execute$5$orgapachecordovastatusbarStatusBar() {
        setStatusBarStyle("default");
    }

    /* renamed from: lambda$execute$6$org-apache-cordova-statusbar-StatusBar, reason: not valid java name */
    /* synthetic */ void m1929lambda$execute$6$orgapachecordovastatusbarStatusBar() {
        setStatusBarStyle(STYLE_LIGHT_CONTENT);
    }

    private void setStatusBarBackgroundColor(String str) {
        if (str.isEmpty()) {
            return;
        }
        try {
            int color = Color.parseColor(str);
            this.window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            this.window.addFlags(Integer.MIN_VALUE);
            this.window.setStatusBarColor(color);
        } catch (IllegalArgumentException unused) {
            LOG.e(TAG, "Invalid hexString argument, use f.i. '#999999'");
        }
    }

    private void setStatusBarTransparent(boolean z) {
        Window window = this.f9cordova.getActivity().getWindow();
        window.getDecorView().setSystemUiVisibility(z ? 1280 : 256);
        if (z) {
            window.setStatusBarColor(0);
        }
    }

    private void setStatusBarStyle(String str) {
        if (str.isEmpty()) {
            return;
        }
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(this.window, this.window.getDecorView());
        if (str.equals("default")) {
            insetsController.setAppearanceLightStatusBars(true);
        } else if (str.equals(STYLE_LIGHT_CONTENT)) {
            insetsController.setAppearanceLightStatusBars(false);
        } else {
            LOG.e(TAG, "Invalid style, must be either 'default' or 'lightcontent'");
        }
    }
}
