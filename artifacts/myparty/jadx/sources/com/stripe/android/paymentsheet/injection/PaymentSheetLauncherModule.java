package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.paymentelement.confirmation.ConfirmationConstantsKt;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.PaymentSheetConstantsKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandlerImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PaymentSheetLauncherModule.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule;", "", "<init>", "()V", "bindsApplicationForContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(subcomponents = {PaymentSheetViewModelSubcomponent.class})
/* loaded from: classes6.dex */
public abstract class PaymentSheetLauncherModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Binds
    public abstract Context bindsApplicationForContext(Application application);

    /* compiled from: PaymentSheetLauncherModule.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule$Companion;", "", "<init>", "()V", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideProductUsageTokens", "", "", "provideAllowsManualConfirmation", "", "provideCVCRecollectionHandler", "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @Singleton
        @Named(ConfirmationConstantsKt.ALLOWS_MANUAL_CONFIRMATION)
        public final boolean provideAllowsManualConfirmation() {
            return false;
        }

        private Companion() {
        }

        @Provides
        @Singleton
        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Complete;
        }

        @Provides
        @Singleton
        @Named(NamedConstantsKt.PRODUCT_USAGE)
        public final Set<String> provideProductUsageTokens() {
            return SetsKt.setOf(PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER);
        }

        @Provides
        @Singleton
        public final CvcRecollectionHandler provideCVCRecollectionHandler() {
            return new CvcRecollectionHandlerImpl();
        }
    }
}
