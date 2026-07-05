package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import com.facebook.hermes.intl.Constants;
import com.stripe.android.Stripe;
import com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment;
import com.stripe.android.common.analytics.experiment.LogLinkHoldbackExperiment;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkHoldbackExposureModule.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J^\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/LinkHoldbackExposureModule;", "", "<init>", "()V", "providesLogLinkGlobalHoldbackExposure", "Lcom/stripe/android/common/analytics/experiment/LogLinkHoldbackExperiment;", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/common/analytics/experiment/DefaultLogLinkHoldbackExperiment;", "providesLinkRepository", "Lcom/stripe/android/link/repositories/LinkRepository;", "application", "Landroid/app/Application;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "logger", "Lcom/stripe/android/core/Logger;", "locale", "Ljava/util/Locale;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class LinkHoldbackExposureModule {
    public static final int $stable = 0;

    @Provides
    public final LogLinkHoldbackExperiment providesLogLinkGlobalHoldbackExposure(DefaultLogLinkHoldbackExperiment defaultLogLinkHoldbackExperiment) {
        Intrinsics.checkNotNullParameter(defaultLogLinkHoldbackExperiment, "default");
        return defaultLogLinkHoldbackExperiment;
    }

    @LinkDisabledApiRepository
    @Provides
    public final LinkRepository providesLinkRepository(Application application, @Named("publishableKey") Function0<String> publishableKeyProvider, @Named(NamedConstantsKt.STRIPE_ACCOUNT_ID) Function0<String> stripeAccountIdProvider, StripeRepository stripeRepository, @IOContext CoroutineContext workContext, Logger logger, Locale locale, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        AppInfo appInfo = Stripe.INSTANCE.getAppInfo();
        return new LinkApiRepository(application, publishableKeyProvider, stripeAccountIdProvider, stripeRepository, new ConsumersApiServiceImpl(new DefaultStripeNetworkClient(workContext, null, null, 0, logger, 14, null), Stripe.API_VERSION, "AndroidBindings/21.22.2", appInfo), workContext, locale, errorReporter);
    }
}
