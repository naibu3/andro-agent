package com.stripe.android.ui.core.di;

import com.stripe.android.ui.core.DefaultIsStripeCardScanAvailable;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;

/* compiled from: CardScanModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/ui/core/di/CardScanModule;", "", "<init>", "()V", "providesIsStripeCardScanAvailable", "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class CardScanModule {
    public static final int $stable = 0;
    public static final CardScanModule INSTANCE = new CardScanModule();

    private CardScanModule() {
    }

    @Provides
    public final IsStripeCardScanAvailable providesIsStripeCardScanAvailable() {
        return new DefaultIsStripeCardScanAvailable();
    }
}
