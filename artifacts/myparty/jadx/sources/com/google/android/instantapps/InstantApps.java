package com.google.android.instantapps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class InstantApps {
    static final String ACTION_QUICK_INSTALL = "com.google.android.finsky.action.IA_INSTALL";
    private static final String EXTRA_POST_INSTALL_INTENT = "postInstallIntent";
    private static Boolean isInstantApp;
    private static Context lastApplicationContext;
    private static PackageManagerWrapper packageManagerWrapper;

    private InstantApps() {
    }

    public static boolean isInstantApp(Context context) throws ClassNotFoundException {
        if (context == null) {
            throw new IllegalArgumentException("Context must be non-null");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalStateException("Application context is null!");
        }
        if (isInstantApp != null && applicationContext.equals(lastApplicationContext)) {
            return isInstantApp.booleanValue();
        }
        Boolean boolIsInstantApp = null;
        isInstantApp = null;
        if (isAtLeastO()) {
            if (packageManagerWrapper == null || !applicationContext.equals(lastApplicationContext)) {
                packageManagerWrapper = new PackageManagerWrapper(applicationContext.getPackageManager());
            }
            boolIsInstantApp = packageManagerWrapper.isInstantApp();
        }
        lastApplicationContext = applicationContext;
        if (boolIsInstantApp != null) {
            isInstantApp = boolIsInstantApp;
        } else {
            try {
                applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                isInstantApp = true;
            } catch (ClassNotFoundException unused) {
                isInstantApp = false;
            }
        }
        return isInstantApp.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    static class PackageManagerWrapper {
        private static Method isInstantAppMethod;
        private final PackageManager packageManager;

        PackageManagerWrapper(PackageManager packageManager) {
            this.packageManager = packageManager;
        }

        Boolean isInstantApp() {
            if (!InstantApps.isAtLeastO()) {
                return null;
            }
            if (isInstantAppMethod == null) {
                try {
                    isInstantAppMethod = PackageManager.class.getDeclaredMethod(NamedConstantsKt.IS_INSTANT_APP, new Class[0]);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return (Boolean) isInstantAppMethod.invoke(this.packageManager, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return null;
            }
        }
    }

    @Deprecated
    public static boolean showInstallPrompt(Activity activity, int requestCode, String referrer) {
        return showInstallPromptImpl(activity, null, requestCode, referrer);
    }

    public static boolean showInstallPrompt(Activity activity, Intent postInstallIntent, int requestCode, String referrer) {
        return showInstallPromptImpl(activity, postInstallIntent, requestCode, referrer);
    }

    private static boolean showInstallPromptImpl(Activity activity, Intent postInstallIntent, int requestCode, String referrer) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity must not be null");
        }
        if (!isInstantApp(activity)) {
            return false;
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", activity.getPackageName());
        if (!TextUtils.isEmpty(referrer)) {
            builderAppendQueryParameter.appendQueryParameter(Destination.KEY_REFERRER, referrer);
        }
        Intent intent = new Intent(ACTION_QUICK_INSTALL).setData(builderAppendQueryParameter.build()).setPackage("com.android.vending");
        intent.putExtra(EXTRA_POST_INSTALL_INTENT, postInstallIntent);
        if (postInstallIntent != null && storeSupportsQuickInstall(activity, intent)) {
            return showInstallPromptImplWithIntent(activity, intent, requestCode);
        }
        return showInstallPromptFallback(activity, requestCode, referrer);
    }

    private static boolean showInstallPromptImplWithIntent(Activity activity, Intent intent, int requestCode) {
        activity.startActivityForResult(intent, requestCode);
        return true;
    }

    private static boolean showInstallPromptFallback(Activity activity, int requestCode, String referrer) {
        Intent intentPutExtra = new Intent("android.intent.action.VIEW").setPackage("com.android.vending").addCategory("android.intent.category.DEFAULT").putExtra("callerId", activity.getPackageName()).putExtra("overlay", true);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", activity.getPackageName());
        if (!TextUtils.isEmpty(referrer)) {
            builderAppendQueryParameter.appendQueryParameter(Destination.KEY_REFERRER, referrer);
        }
        intentPutExtra.setData(builderAppendQueryParameter.build());
        activity.startActivityForResult(intentPutExtra, requestCode);
        return true;
    }

    private static boolean storeSupportsQuickInstall(Context context, Intent intent) {
        return context.getPackageManager().resolveActivity(intent, 0) != null;
    }
}
