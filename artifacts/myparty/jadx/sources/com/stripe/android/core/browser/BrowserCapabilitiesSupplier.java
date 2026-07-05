package com.stripe.android.core.browser;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrowserCapabilitiesSupplier.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "get", "Lcom/stripe/android/core/browser/BrowserCapabilities;", "isCustomTabsSupported", "", "NoopCustomTabsServiceConnection", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrowserCapabilitiesSupplier {
    private static final String CHROME_PACKAGE = "com.android.chrome";
    private static final Companion Companion = new Companion(null);
    private final Context context;

    /* compiled from: BrowserCapabilitiesSupplier.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$NoopCustomTabsServiceConnection;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "<init>", "()V", "onCustomTabsServiceConnected", "", "componentName", "Landroid/content/ComponentName;", "customTabsClient", "Landroidx/browser/customtabs/CustomTabsClient;", "onServiceDisconnected", "name", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class NoopCustomTabsServiceConnection extends CustomTabsServiceConnection {
        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(customTabsClient, "customTabsClient");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    public BrowserCapabilitiesSupplier(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final BrowserCapabilities get() {
        return isCustomTabsSupported() ? BrowserCapabilities.CustomTabs : BrowserCapabilities.Unknown;
    }

    private final boolean isCustomTabsSupported() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            BrowserCapabilitiesSupplier browserCapabilitiesSupplier = this;
            objM9118constructorimpl = Result.m9118constructorimpl(Boolean.valueOf(CustomTabsClient.bindCustomTabsService(this.context, CHROME_PACKAGE, new NoopCustomTabsServiceConnection())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = false;
        }
        return ((Boolean) objM9118constructorimpl).booleanValue();
    }

    /* compiled from: BrowserCapabilitiesSupplier.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/browser/BrowserCapabilitiesSupplier$Companion;", "", "<init>", "()V", "CHROME_PACKAGE", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
