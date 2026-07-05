package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class NetworkingLinkSignupViewModel_Factory_Impl implements NetworkingLinkSignupViewModel.Factory {
    private final C0942NetworkingLinkSignupViewModel_Factory delegateFactory;

    NetworkingLinkSignupViewModel_Factory_Impl(C0942NetworkingLinkSignupViewModel_Factory c0942NetworkingLinkSignupViewModel_Factory) {
        this.delegateFactory = c0942NetworkingLinkSignupViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel.Factory
    public NetworkingLinkSignupViewModel create(NetworkingLinkSignupState networkingLinkSignupState) {
        return this.delegateFactory.get(networkingLinkSignupState);
    }

    public static Provider<NetworkingLinkSignupViewModel.Factory> create(C0942NetworkingLinkSignupViewModel_Factory c0942NetworkingLinkSignupViewModel_Factory) {
        return InstanceFactory.create(new NetworkingLinkSignupViewModel_Factory_Impl(c0942NetworkingLinkSignupViewModel_Factory));
    }

    public static dagger.internal.Provider<NetworkingLinkSignupViewModel.Factory> createFactoryProvider(C0942NetworkingLinkSignupViewModel_Factory c0942NetworkingLinkSignupViewModel_Factory) {
        return InstanceFactory.create(new NetworkingLinkSignupViewModel_Factory_Impl(c0942NetworkingLinkSignupViewModel_Factory));
    }
}
