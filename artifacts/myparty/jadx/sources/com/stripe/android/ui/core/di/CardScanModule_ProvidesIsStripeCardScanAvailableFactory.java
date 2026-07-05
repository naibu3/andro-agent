package com.stripe.android.ui.core.di;

import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes6.dex */
public final class CardScanModule_ProvidesIsStripeCardScanAvailableFactory implements Factory<IsStripeCardScanAvailable> {
    @Override // javax.inject.Provider
    public IsStripeCardScanAvailable get() {
        return providesIsStripeCardScanAvailable();
    }

    public static CardScanModule_ProvidesIsStripeCardScanAvailableFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static IsStripeCardScanAvailable providesIsStripeCardScanAvailable() {
        return (IsStripeCardScanAvailable) Preconditions.checkNotNullFromProvides(CardScanModule.INSTANCE.providesIsStripeCardScanAvailable());
    }

    private static final class InstanceHolder {
        static final CardScanModule_ProvidesIsStripeCardScanAvailableFactory INSTANCE = new CardScanModule_ProvidesIsStripeCardScanAvailableFactory();

        private InstanceHolder() {
        }
    }
}
