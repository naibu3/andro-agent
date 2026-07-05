package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel;
import com.stripe.android.polling.IntentStatusPoller;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1137PollingViewModel_Factory implements Factory<PollingViewModel> {
    private final Provider<PollingViewModel.Args> argsProvider;
    private final Provider<IntentStatusPoller> pollerProvider;
    private final Provider<SavedStateHandle> savedStateHandleProvider;
    private final Provider<TimeProvider> timeProvider;

    public C1137PollingViewModel_Factory(Provider<PollingViewModel.Args> provider, Provider<IntentStatusPoller> provider2, Provider<TimeProvider> provider3, Provider<SavedStateHandle> provider4) {
        this.argsProvider = provider;
        this.pollerProvider = provider2;
        this.timeProvider = provider3;
        this.savedStateHandleProvider = provider4;
    }

    @Override // javax.inject.Provider
    public PollingViewModel get() {
        return newInstance(this.argsProvider.get(), this.pollerProvider.get(), this.timeProvider.get(), this.savedStateHandleProvider.get());
    }

    public static C1137PollingViewModel_Factory create(javax.inject.Provider<PollingViewModel.Args> provider, javax.inject.Provider<IntentStatusPoller> provider2, javax.inject.Provider<TimeProvider> provider3, javax.inject.Provider<SavedStateHandle> provider4) {
        return new C1137PollingViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static C1137PollingViewModel_Factory create(Provider<PollingViewModel.Args> provider, Provider<IntentStatusPoller> provider2, Provider<TimeProvider> provider3, Provider<SavedStateHandle> provider4) {
        return new C1137PollingViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static PollingViewModel newInstance(PollingViewModel.Args args, IntentStatusPoller intentStatusPoller, TimeProvider timeProvider, SavedStateHandle savedStateHandle) {
        return new PollingViewModel(args, intentStatusPoller, timeProvider, savedStateHandle);
    }
}
