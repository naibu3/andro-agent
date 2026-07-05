package com.ionicframework.cordova.webview;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public class AndroidProtocolHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "AndroidProtocolHandler";
    private Context context;

    public AndroidProtocolHandler(Context context) {
        this.context = context;
    }

    public InputStream openAsset(String str) throws IOException {
        return this.context.getAssets().open(str, 2);
    }

    public InputStream openResource(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(pathSegments.size() - 2);
        String str2 = pathSegments.get(pathSegments.size() - 1).split("\\.")[0];
        try {
            if (this.context.getApplicationContext() != null) {
                this.context = this.context.getApplicationContext();
            }
            int fieldId = getFieldId(this.context, str, str2);
            if (getValueType(this.context, fieldId) == 3) {
                return this.context.getResources().openRawResource(fieldId);
            }
            Log.e(TAG, "Asset not of type string: " + uri);
            return null;
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "Unable to open resource URL: " + uri, e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "Unable to open resource URL: " + uri, e2);
            return null;
        } catch (NoSuchFieldException e3) {
            Log.e(TAG, "Unable to open resource URL: " + uri, e3);
            return null;
        }
    }

    public InputStream openFile(String str) throws IOException {
        return new FileInputStream(new File(str.replace(WebViewLocalServer.fileStart, "")));
    }

    public InputStream openContentUrl(Uri uri) throws IOException {
        String strReplace;
        Integer numValueOf = Integer.valueOf(uri.getPort());
        if (numValueOf.intValue() == -1) {
            strReplace = uri.toString().replace(uri.getScheme() + "://" + uri.getHost() + WebViewLocalServer.contentStart, "content:/");
        } else {
            strReplace = uri.toString().replace(uri.getScheme() + "://" + uri.getHost() + ":" + numValueOf + WebViewLocalServer.contentStart, "content:/");
        }
        try {
            return this.context.getContentResolver().openInputStream(Uri.parse(strReplace));
        } catch (SecurityException e) {
            Log.e(TAG, "Unable to open content URL: " + uri, e);
            return null;
        }
    }

    private static int getFieldId(Context context, String str, String str2) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        return context.getClassLoader().loadClass(context.getPackageName() + ".R$" + str).getField(str2).getInt(null);
    }

    private static int getValueType(Context context, int i) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }
}
