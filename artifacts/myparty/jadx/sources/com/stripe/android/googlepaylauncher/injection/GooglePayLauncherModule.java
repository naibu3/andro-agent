package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.Logger;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayLauncherModule.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;", "", "<init>", "()V", "provideGooglePayRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "appContext", "Landroid/content/Context;", "logger", "Lcom/stripe/android/core/Logger;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class GooglePayLauncherModule {
    public static final int $stable = 0;

    @Provides
    public final Function1<GooglePayEnvironment, GooglePayRepository> provideGooglePayRepositoryFactory(final Context appContext, final Logger logger, final ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        return new Function1() { // from class: com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GooglePayLauncherModule.provideGooglePayRepositoryFactory$lambda$0(appContext, errorReporter, logger, (GooglePayEnvironment) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultGooglePayRepository provideGooglePayRepositoryFactory$lambda$0(Context context, ErrorReporter errorReporter, Logger logger, GooglePayEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        return new DefaultGooglePayRepository(context, environment, new GooglePayJsonFactory.BillingAddressParameters(false, null, false, 7, null), true, true, null, errorReporter, logger, null, 288, null);
    }
}
