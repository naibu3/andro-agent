package com.stripe.android.paymentsheet.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes6.dex */
public final class AutocompleteViewModelModule_Companion_ProvidesProductUsageFactory implements Factory<Set<String>> {
    @Override // javax.inject.Provider
    public Set<String> get() {
        return providesProductUsage();
    }

    public static AutocompleteViewModelModule_Companion_ProvidesProductUsageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> providesProductUsage() {
        return (Set) Preconditions.checkNotNullFromProvides(AutocompleteViewModelModule.INSTANCE.providesProductUsage());
    }

    private static final class InstanceHolder {
        static final AutocompleteViewModelModule_Companion_ProvidesProductUsageFactory INSTANCE = new AutocompleteViewModelModule_Companion_ProvidesProductUsageFactory();

        private InstanceHolder() {
        }
    }
}
