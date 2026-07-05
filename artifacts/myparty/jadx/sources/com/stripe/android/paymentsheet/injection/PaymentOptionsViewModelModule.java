package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: PaymentOptionsViewModelModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelModule;", "", "<init>", "()V", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(subcomponents = {PaymentOptionsViewModelSubcomponent.class})
/* loaded from: classes6.dex */
public final class PaymentOptionsViewModelModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    public final EventReporter.Mode provideEventReporterMode() {
        return EventReporter.Mode.Custom;
    }
}
