package com.stripe.android.financialconnections.browser;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BrowserManager.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u0010\u001a\u00020\u000f*\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/browser/BrowserManager;", "", "context", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "getContext", "()Landroid/app/Application;", "canOpenHttpsUrl", "", "getPackageToHandleUri", "", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "createBrowserIntentForUrl", "Landroid/content/Intent;", "toIntent", "getPackageToHandleIntent", SDKConstants.PARAM_INTENT, "createCustomTabIntent", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrowserManager {
    public static final int $stable = 8;
    private final Application context;

    @Inject
    public BrowserManager(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Application getContext() {
        return this.context;
    }

    public final boolean canOpenHttpsUrl() {
        Uri uri = Uri.parse("https://");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return getPackageToHandleUri(uri) != null;
    }

    public final String getPackageToHandleUri(Uri uri) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            Result.Companion companion = Result.INSTANCE;
            BrowserManager browserManager = this;
            objM9118constructorimpl = Result.m9118constructorimpl(getPackageToHandleIntent(toIntent(uri)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = null;
        }
        return (String) objM9118constructorimpl;
    }

    public final Intent createBrowserIntentForUrl(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = toIntent(uri);
        String packageToHandleIntent = getPackageToHandleIntent(intent);
        return (packageToHandleIntent == null || !StringsKt.contains$default((CharSequence) packageToHandleIntent, (CharSequence) "org.mozilla", false, 2, (Object) null)) ? createCustomTabIntent(uri) : intent;
    }

    private final Intent toIntent(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    private final String getPackageToHandleIntent(Intent intent) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoResolveActivity = this.context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    private final Intent createCustomTabIntent(Uri uri) {
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().setShareState(2).build();
        customTabsIntentBuild.intent.setData(uri);
        Intent intent = customTabsIntentBuild.intent;
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        return intent;
    }
}
