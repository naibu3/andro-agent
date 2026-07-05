package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class NetworkingSaveToLinkVerificationViewModel_Factory_Impl implements NetworkingSaveToLinkVerificationViewModel.Factory {
    private final C0948NetworkingSaveToLinkVerificationViewModel_Factory delegateFactory;

    NetworkingSaveToLinkVerificationViewModel_Factory_Impl(C0948NetworkingSaveToLinkVerificationViewModel_Factory c0948NetworkingSaveToLinkVerificationViewModel_Factory) {
        this.delegateFactory = c0948NetworkingSaveToLinkVerificationViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel.Factory
    public NetworkingSaveToLinkVerificationViewModel create(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState) {
        return this.delegateFactory.get(networkingSaveToLinkVerificationState);
    }

    public static Provider<NetworkingSaveToLinkVerificationViewModel.Factory> create(C0948NetworkingSaveToLinkVerificationViewModel_Factory c0948NetworkingSaveToLinkVerificationViewModel_Factory) {
        return InstanceFactory.create(new NetworkingSaveToLinkVerificationViewModel_Factory_Impl(c0948NetworkingSaveToLinkVerificationViewModel_Factory));
    }

    public static dagger.internal.Provider<NetworkingSaveToLinkVerificationViewModel.Factory> createFactoryProvider(C0948NetworkingSaveToLinkVerificationViewModel_Factory c0948NetworkingSaveToLinkVerificationViewModel_Factory) {
        return InstanceFactory.create(new NetworkingSaveToLinkVerificationViewModel_Factory_Impl(c0948NetworkingSaveToLinkVerificationViewModel_Factory));
    }
}
