package com.stripe.android.financialconnections.features.networkinglinkverification;

import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class NetworkingLinkVerificationViewModel_Factory_Impl implements NetworkingLinkVerificationViewModel.Factory {
    private final C0945NetworkingLinkVerificationViewModel_Factory delegateFactory;

    NetworkingLinkVerificationViewModel_Factory_Impl(C0945NetworkingLinkVerificationViewModel_Factory c0945NetworkingLinkVerificationViewModel_Factory) {
        this.delegateFactory = c0945NetworkingLinkVerificationViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel.Factory
    public NetworkingLinkVerificationViewModel create(NetworkingLinkVerificationState networkingLinkVerificationState) {
        return this.delegateFactory.get(networkingLinkVerificationState);
    }

    public static Provider<NetworkingLinkVerificationViewModel.Factory> create(C0945NetworkingLinkVerificationViewModel_Factory c0945NetworkingLinkVerificationViewModel_Factory) {
        return InstanceFactory.create(new NetworkingLinkVerificationViewModel_Factory_Impl(c0945NetworkingLinkVerificationViewModel_Factory));
    }

    public static dagger.internal.Provider<NetworkingLinkVerificationViewModel.Factory> createFactoryProvider(C0945NetworkingLinkVerificationViewModel_Factory c0945NetworkingLinkVerificationViewModel_Factory) {
        return InstanceFactory.create(new NetworkingLinkVerificationViewModel_Factory_Impl(c0945NetworkingLinkVerificationViewModel_Factory));
    }
}
