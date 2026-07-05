package com.stripe.android.link.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.common.di.ApplicationIdModule;
import com.stripe.android.common.di.MobileSessionIdModule;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.link.DefaultLinkConfigurationLoader;
import com.stripe.android.link.LinkConfigurationLoader;
import com.stripe.android.paymentelement.confirmation.injection.ExtendedPaymentElementConfirmationModule;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.LinkHoldbackExposureModule;
import com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule;
import com.stripe.android.ui.core.di.CardScanModule;
import com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkControllerModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/injection/LinkControllerModule;", "", "bindLinkConfigurationLoader", "Lcom/stripe/android/link/LinkConfigurationLoader;", "impl", "Lcom/stripe/android/link/DefaultLinkConfigurationLoader;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {StripeRepositoryModule.class, ExtendedPaymentElementConfirmationModule.class, PaymentSheetCommonModule.class, GooglePayLauncherModule.class, CoroutineContextModule.class, CoreCommonModule.class, ResourceRepositoryModule.class, ApplicationIdModule.class, MobileSessionIdModule.class, CardScanModule.class, LinkHoldbackExposureModule.class}, subcomponents = {LinkControllerPresenterComponent.class, LinkComponent.class})
/* loaded from: classes5.dex */
public interface LinkControllerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Singleton
    @Binds
    LinkConfigurationLoader bindLinkConfigurationLoader(DefaultLinkConfigurationLoader impl);

    /* compiled from: LinkControllerModule.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/stripe/android/link/injection/LinkControllerModule$Companion;", "", "<init>", "()V", "provideAppContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideProductUsageTokens", "", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Singleton
        public final Context provideAppContext(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            Context applicationContext = application.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return applicationContext;
        }

        @Provides
        @Singleton
        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Custom;
        }

        @Provides
        @Singleton
        @Named(NamedConstantsKt.PRODUCT_USAGE)
        public final Set<String> provideProductUsageTokens() {
            return SetsKt.setOf("LinkPaymentMethodLauncher");
        }
    }
}
