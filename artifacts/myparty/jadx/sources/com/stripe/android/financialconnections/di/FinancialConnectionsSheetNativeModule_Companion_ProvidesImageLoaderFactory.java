package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.uicore.image.StripeImageLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeModule_Companion_ProvidesImageLoaderFactory implements Factory<StripeImageLoader> {
    private final Provider<Application> contextProvider;

    public FinancialConnectionsSheetNativeModule_Companion_ProvidesImageLoaderFactory(Provider<Application> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public StripeImageLoader get() {
        return providesImageLoader(this.contextProvider.get());
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvidesImageLoaderFactory create(javax.inject.Provider<Application> provider) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvidesImageLoaderFactory(Providers.asDaggerProvider(provider));
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvidesImageLoaderFactory create(Provider<Application> provider) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvidesImageLoaderFactory(provider);
    }

    public static StripeImageLoader providesImageLoader(Application application) {
        return (StripeImageLoader) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetNativeModule.INSTANCE.providesImageLoader(application));
    }
}
