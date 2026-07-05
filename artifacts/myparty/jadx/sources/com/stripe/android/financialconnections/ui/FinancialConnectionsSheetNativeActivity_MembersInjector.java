package com.stripe.android.financialconnections.ui;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.uicore.image.StripeImageLoader;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeActivity_MembersInjector implements MembersInjector<FinancialConnectionsSheetNativeActivity> {
    private final Provider<BrowserManager> browserManagerProvider;
    private final Provider<StripeImageLoader> imageLoaderProvider;
    private final Provider<Logger> loggerProvider;

    public FinancialConnectionsSheetNativeActivity_MembersInjector(Provider<Logger> provider, Provider<StripeImageLoader> provider2, Provider<BrowserManager> provider3) {
        this.loggerProvider = provider;
        this.imageLoaderProvider = provider2;
        this.browserManagerProvider = provider3;
    }

    public static MembersInjector<FinancialConnectionsSheetNativeActivity> create(Provider<Logger> provider, Provider<StripeImageLoader> provider2, Provider<BrowserManager> provider3) {
        return new FinancialConnectionsSheetNativeActivity_MembersInjector(provider, provider2, provider3);
    }

    public static MembersInjector<FinancialConnectionsSheetNativeActivity> create(javax.inject.Provider<Logger> provider, javax.inject.Provider<StripeImageLoader> provider2, javax.inject.Provider<BrowserManager> provider3) {
        return new FinancialConnectionsSheetNativeActivity_MembersInjector(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
        injectLogger(financialConnectionsSheetNativeActivity, this.loggerProvider.get());
        injectImageLoader(financialConnectionsSheetNativeActivity, this.imageLoaderProvider.get());
        injectBrowserManager(financialConnectionsSheetNativeActivity, this.browserManagerProvider.get());
    }

    public static void injectLogger(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, Logger logger) {
        financialConnectionsSheetNativeActivity.logger = logger;
    }

    public static void injectImageLoader(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, StripeImageLoader stripeImageLoader) {
        financialConnectionsSheetNativeActivity.imageLoader = stripeImageLoader;
    }

    public static void injectBrowserManager(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, BrowserManager browserManager) {
        financialConnectionsSheetNativeActivity.browserManager = browserManager;
    }
}
