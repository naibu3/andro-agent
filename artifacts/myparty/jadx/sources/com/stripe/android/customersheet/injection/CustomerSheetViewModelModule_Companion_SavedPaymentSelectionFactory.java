package com.stripe.android.customersheet.injection;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory implements Factory<PaymentSelection> {
    @Override // javax.inject.Provider
    public PaymentSelection get() {
        return savedPaymentSelection();
    }

    public static CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PaymentSelection savedPaymentSelection() {
        return CustomerSheetViewModelModule.INSTANCE.savedPaymentSelection();
    }

    private static final class InstanceHolder {
        static final CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory INSTANCE = new CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory();

        private InstanceHolder() {
        }
    }
}
