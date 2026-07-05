package com.stripe.android.customersheet.injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_UiContextFactory implements Factory<CoroutineContext> {
    @Override // javax.inject.Provider
    public CoroutineContext get() {
        return uiContext();
    }

    public static CustomerSheetViewModelModule_Companion_UiContextFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineContext uiContext() {
        return (CoroutineContext) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.uiContext());
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_UiContextFactory INSTANCE = new CustomerSheetViewModelModule_Companion_UiContextFactory();

        private InstanceHolder() {
        }
    }
}
