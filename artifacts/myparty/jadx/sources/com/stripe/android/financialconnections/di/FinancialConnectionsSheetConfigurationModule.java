package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetConfigurationModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;", "", "<init>", "()V", "providesPublishableKey", "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "providesStripeAccountId", "providesEnableLogging", "", "providesApplicationId", "application", "Landroid/app/Application;", "providesApiVersion", "Lcom/stripe/android/core/ApiVersion;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetConfigurationModule {
    public static final int $stable = 0;
    public static final FinancialConnectionsSheetConfigurationModule INSTANCE = new FinancialConnectionsSheetConfigurationModule();

    @Provides
    @ActivityRetainedScope
    @Named(com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING)
    public final boolean providesEnableLogging() {
        return false;
    }

    private FinancialConnectionsSheetConfigurationModule() {
    }

    @Provides
    @ActivityRetainedScope
    @Named("publishableKey")
    public final String providesPublishableKey(FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration.getPublishableKey();
    }

    @Provides
    @ActivityRetainedScope
    @Named(com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID)
    public final String providesStripeAccountId(FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration.getStripeAccountId();
    }

    @Provides
    @ActivityRetainedScope
    @Named(NamedConstantsKt.APPLICATION_ID)
    public final String providesApplicationId(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        String packageName = application.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    @Provides
    @ActivityRetainedScope
    public final ApiVersion providesApiVersion() {
        return new ApiVersion(SetsKt.setOf("financial_connections_client_api_beta=v1"));
    }
}
