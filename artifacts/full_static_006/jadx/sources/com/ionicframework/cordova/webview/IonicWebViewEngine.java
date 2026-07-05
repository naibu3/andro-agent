package com.ionicframework.cordova.webview;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.IOException;
import org.apache.cordova.ConfigXmlParser;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.PluginManager;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewClient;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class IonicWebViewEngine extends SystemWebViewEngine {
    private static final String LAST_BINARY_VERSION_CODE = "lastBinaryVersionCode";
    private static final String LAST_BINARY_VERSION_NAME = "lastBinaryVersionName";
    public static final String TAG = "IonicWebViewEngine";
    private String CDV_LOCAL_SERVER;
    private WebViewLocalServer localServer;
    private String scheme;

    public IonicWebViewEngine(Context context, CordovaPreferences cordovaPreferences) {
        super(new SystemWebView(context), cordovaPreferences);
        Log.d(TAG, "Ionic Web View Engine Starting Right Up 1...");
    }

    public IonicWebViewEngine(SystemWebView systemWebView) {
        super(systemWebView, (CordovaPreferences) null);
        Log.d(TAG, "Ionic Web View Engine Starting Right Up 2...");
    }

    public IonicWebViewEngine(SystemWebView systemWebView, CordovaPreferences cordovaPreferences) {
        super(systemWebView, cordovaPreferences);
        Log.d(TAG, "Ionic Web View Engine Starting Right Up 3...");
    }

    @Override // org.apache.cordova.engine.SystemWebViewEngine, org.apache.cordova.CordovaWebViewEngine
    public void init(CordovaWebView cordovaWebView, CordovaInterface cordovaInterface, CordovaWebViewEngine.Client client, CordovaResourceApi cordovaResourceApi, PluginManager pluginManager, NativeToJsMessageQueue nativeToJsMessageQueue) throws XmlPullParserException, IOException {
        ConfigXmlParser configXmlParser = new ConfigXmlParser();
        configXmlParser.parse(cordovaInterface.getActivity());
        String string = this.preferences.getString("Hostname", "localhost");
        this.scheme = this.preferences.getString("Scheme", "http");
        this.CDV_LOCAL_SERVER = this.scheme + "://" + string;
        WebViewLocalServer webViewLocalServer = new WebViewLocalServer(cordovaInterface.getActivity(), string, true, configXmlParser, this.scheme);
        this.localServer = webViewLocalServer;
        webViewLocalServer.hostAssets("www");
        this.webView.setWebViewClient(new ServerClient(this, configXmlParser));
        super.init(cordovaWebView, cordovaInterface, client, cordovaResourceApi, pluginManager, nativeToJsMessageQueue);
        this.webView.getSettings().setMixedContentMode(this.preferences.getInteger("MixedContentMode", 0));
        String string2 = cordovaInterface.getActivity().getApplicationContext().getSharedPreferences(IonicWebView.WEBVIEW_PREFS_NAME, 0).getString(IonicWebView.CDV_SERVER_PATH, null);
        if (!isDeployDisabled() && !isNewBinary() && string2 != null && !string2.isEmpty()) {
            setServerBasePath(string2);
        }
        if (this.preferences.getBoolean("ResolveServiceWorkerRequests", false)) {
            ServiceWorkerController.getInstance().setServiceWorkerClient(new ServiceWorkerClient() { // from class: com.ionicframework.cordova.webview.IonicWebViewEngine.1
                @Override // android.webkit.ServiceWorkerClient
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    return IonicWebViewEngine.this.localServer.shouldInterceptRequest(webResourceRequest.getUrl(), webResourceRequest);
                }
            });
        }
    }

    private boolean isNewBinary() throws PackageManager.NameNotFoundException {
        String string;
        String str;
        PackageInfo packageInfo;
        SharedPreferences sharedPreferences = this.f14cordova.getActivity().getApplicationContext().getSharedPreferences(IonicWebView.WEBVIEW_PREFS_NAME, 0);
        String string2 = sharedPreferences.getString(LAST_BINARY_VERSION_CODE, null);
        String string3 = sharedPreferences.getString(LAST_BINARY_VERSION_NAME, null);
        try {
            packageInfo = this.f14cordova.getActivity().getPackageManager().getPackageInfo(this.f14cordova.getActivity().getPackageName(), 0);
            string = Integer.toString(packageInfo.versionCode);
        } catch (Exception e) {
            e = e;
            string = "";
        }
        try {
            str = packageInfo.versionName;
        } catch (Exception e2) {
            e = e2;
            Log.e(TAG, "Unable to get package info", e);
            str = "";
            if (!string.equals(string2)) {
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(LAST_BINARY_VERSION_CODE, string);
            editorEdit.putString(LAST_BINARY_VERSION_NAME, str);
            editorEdit.putString(IonicWebView.CDV_SERVER_PATH, "");
            editorEdit.apply();
            return true;
        }
        if (!string.equals(string2) && str.equals(string3)) {
            return false;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString(LAST_BINARY_VERSION_CODE, string);
        editorEdit2.putString(LAST_BINARY_VERSION_NAME, str);
        editorEdit2.putString(IonicWebView.CDV_SERVER_PATH, "");
        editorEdit2.apply();
        return true;
    }

    private boolean isDeployDisabled() {
        return this.preferences.getBoolean("DisableDeploy", false);
    }

    private class ServerClient extends SystemWebViewClient {
        private ConfigXmlParser parser;

        public ServerClient(SystemWebViewEngine systemWebViewEngine, ConfigXmlParser configXmlParser) {
            super(systemWebViewEngine);
            this.parser = configXmlParser;
        }

        @Override // org.apache.cordova.engine.SystemWebViewClient, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return IonicWebViewEngine.this.localServer.shouldInterceptRequest(webResourceRequest.getUrl(), webResourceRequest);
        }

        @Override // org.apache.cordova.engine.SystemWebViewClient, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String launchUrl = this.parser.getLaunchUrl();
            if (launchUrl.contains("https") || launchUrl.contains("http") || !str.equals(launchUrl)) {
                return;
            }
            webView.stopLoading();
            String str2 = IonicWebViewEngine.this.CDV_LOCAL_SERVER;
            if (!IonicWebViewEngine.this.scheme.equalsIgnoreCase("https") && !IonicWebViewEngine.this.scheme.equalsIgnoreCase("http")) {
                str2 = str2 + "/";
            }
            webView.loadUrl(str2);
        }

        @Override // org.apache.cordova.engine.SystemWebViewClient, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.loadUrl("javascript:(function() { window.WEBVIEW_SERVER_URL = '" + IonicWebViewEngine.this.CDV_LOCAL_SERVER + "';})()");
        }
    }

    public void setServerBasePath(String str) {
        this.localServer.hostFiles(str);
        this.webView.loadUrl(this.CDV_LOCAL_SERVER);
    }

    public String getServerBasePath() {
        return this.localServer.getBasePath();
    }
}
