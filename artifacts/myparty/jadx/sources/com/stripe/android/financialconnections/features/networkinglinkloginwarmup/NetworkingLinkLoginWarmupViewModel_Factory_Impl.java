package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class NetworkingLinkLoginWarmupViewModel_Factory_Impl implements NetworkingLinkLoginWarmupViewModel.Factory {
    private final C0929NetworkingLinkLoginWarmupViewModel_Factory delegateFactory;

    NetworkingLinkLoginWarmupViewModel_Factory_Impl(C0929NetworkingLinkLoginWarmupViewModel_Factory c0929NetworkingLinkLoginWarmupViewModel_Factory) {
        this.delegateFactory = c0929NetworkingLinkLoginWarmupViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel.Factory
    public NetworkingLinkLoginWarmupViewModel create(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState) {
        return this.delegateFactory.get(networkingLinkLoginWarmupState);
    }

    public static Provider<NetworkingLinkLoginWarmupViewModel.Factory> create(C0929NetworkingLinkLoginWarmupViewModel_Factory c0929NetworkingLinkLoginWarmupViewModel_Factory) {
        return InstanceFactory.create(new NetworkingLinkLoginWarmupViewModel_Factory_Impl(c0929NetworkingLinkLoginWarmupViewModel_Factory));
    }

    public static dagger.internal.Provider<NetworkingLinkLoginWarmupViewModel.Factory> createFactoryProvider(C0929NetworkingLinkLoginWarmupViewModel_Factory c0929NetworkingLinkLoginWarmupViewModel_Factory) {
        return InstanceFactory.create(new NetworkingLinkLoginWarmupViewModel_Factory_Impl(c0929NetworkingLinkLoginWarmupViewModel_Factory));
    }
}
