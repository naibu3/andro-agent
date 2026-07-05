package com.stripe.android.paymentsheet.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes6.dex */
public final class AddressElementViewModelModule_ProvidesProductUsageFactory implements Factory<Set<String>> {
    private final AddressElementViewModelModule module;

    public AddressElementViewModelModule_ProvidesProductUsageFactory(AddressElementViewModelModule addressElementViewModelModule) {
        this.module = addressElementViewModelModule;
    }

    @Override // javax.inject.Provider
    public Set<String> get() {
        return providesProductUsage(this.module);
    }

    public static AddressElementViewModelModule_ProvidesProductUsageFactory create(AddressElementViewModelModule addressElementViewModelModule) {
        return new AddressElementViewModelModule_ProvidesProductUsageFactory(addressElementViewModelModule);
    }

    public static Set<String> providesProductUsage(AddressElementViewModelModule addressElementViewModelModule) {
        return (Set) Preconditions.checkNotNullFromProvides(addressElementViewModelModule.providesProductUsage());
    }
}
