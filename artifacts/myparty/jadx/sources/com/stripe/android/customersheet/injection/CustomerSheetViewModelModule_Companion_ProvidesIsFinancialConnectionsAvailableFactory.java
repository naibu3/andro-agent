package com.stripe.android.customersheet.injection;

import com.stripe.android.payments.financialconnections.IsFinancialConnectionsSdkAvailable;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory implements Factory<IsFinancialConnectionsSdkAvailable> {
    @Override // javax.inject.Provider
    public IsFinancialConnectionsSdkAvailable get() {
        return providesIsFinancialConnectionsAvailable();
    }

    public static CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static IsFinancialConnectionsSdkAvailable providesIsFinancialConnectionsAvailable() {
        return (IsFinancialConnectionsSdkAvailable) Preconditions.checkNotNullFromProvides(CustomerSheetViewModelModule.INSTANCE.providesIsFinancialConnectionsAvailable());
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory INSTANCE = new CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory();

        private InstanceHolder() {
        }
    }
}
