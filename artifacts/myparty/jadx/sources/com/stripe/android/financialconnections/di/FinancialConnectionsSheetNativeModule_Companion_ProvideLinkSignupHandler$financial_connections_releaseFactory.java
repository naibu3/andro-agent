package com.stripe.android.financialconnections.di;

import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForNetworking;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactory implements Factory<LinkSignupHandler> {
    private final Provider<IsLinkWithStripe> isLinkWithStripeProvider;
    private final Provider<LinkSignupHandlerForInstantDebits> linkSignupHandlerForInstantDebitsProvider;
    private final Provider<LinkSignupHandlerForNetworking> linkSignupHandlerForNetworkingProvider;

    public FinancialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactory(Provider<IsLinkWithStripe> provider, Provider<LinkSignupHandlerForInstantDebits> provider2, Provider<LinkSignupHandlerForNetworking> provider3) {
        this.isLinkWithStripeProvider = provider;
        this.linkSignupHandlerForInstantDebitsProvider = provider2;
        this.linkSignupHandlerForNetworkingProvider = provider3;
    }

    @Override // javax.inject.Provider
    public LinkSignupHandler get() {
        return provideLinkSignupHandler$financial_connections_release(this.isLinkWithStripeProvider.get(), this.linkSignupHandlerForInstantDebitsProvider, this.linkSignupHandlerForNetworkingProvider);
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactory create(javax.inject.Provider<IsLinkWithStripe> provider, javax.inject.Provider<LinkSignupHandlerForInstantDebits> provider2, javax.inject.Provider<LinkSignupHandlerForNetworking> provider3) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static FinancialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactory create(Provider<IsLinkWithStripe> provider, Provider<LinkSignupHandlerForInstantDebits> provider2, Provider<LinkSignupHandlerForNetworking> provider3) {
        return new FinancialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactory(provider, provider2, provider3);
    }

    public static LinkSignupHandler provideLinkSignupHandler$financial_connections_release(IsLinkWithStripe isLinkWithStripe, javax.inject.Provider<LinkSignupHandlerForInstantDebits> provider, javax.inject.Provider<LinkSignupHandlerForNetworking> provider2) {
        return (LinkSignupHandler) Preconditions.checkNotNullFromProvides(FinancialConnectionsSheetNativeModule.INSTANCE.provideLinkSignupHandler$financial_connections_release(isLinkWithStripe, provider, provider2));
    }
}
