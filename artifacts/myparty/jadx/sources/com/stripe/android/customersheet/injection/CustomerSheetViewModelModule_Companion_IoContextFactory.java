package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_IoContextFactory implements Factory<CoroutineContext> {
    @Override // javax.inject.Provider
    public CoroutineContext get() {
        return ioContext();
    }

    public static CustomerSheetViewModelModule_Companion_IoContextFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineContext ioContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.ioContext());
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_IoContextFactory INSTANCE = new CustomerSheetViewModelModule_Companion_IoContextFactory();

        private InstanceHolder() {
        }
    }
}
