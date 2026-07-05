package com.stripe.android.financialconnections.di;

import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetModule.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bJ2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;", "", "<init>", "()V", "providesProvideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "apiRequestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "providesProvideApiRequestOptions$financial_connections_release", "providesFinancialConnectionsManifestRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "provideApiRequestOptions", "locale", "Ljava/util/Locale;", "logger", "Lcom/stripe/android/core/Logger;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetModule {
    public static final int $stable = 0;
    public static final FinancialConnectionsSheetModule INSTANCE = new FinancialConnectionsSheetModule();

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiRequest.Options providesProvideApiRequestOptions$lambda$0(ApiRequest.Options options, boolean z) {
        return options;
    }

    private FinancialConnectionsSheetModule() {
    }

    @Provides
    @ActivityRetainedScope
    public final ProvideApiRequestOptions providesProvideApiRequestOptions$financial_connections_release(final ApiRequest.Options apiRequestOptions) {
        Intrinsics.checkNotNullParameter(apiRequestOptions, "apiRequestOptions");
        return new ProvideApiRequestOptions() { // from class: com.stripe.android.financialconnections.di.FinancialConnectionsSheetModule$$ExternalSyntheticLambda0
            @Override // com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions
            public final ApiRequest.Options invoke(boolean z) {
                return FinancialConnectionsSheetModule.providesProvideApiRequestOptions$lambda$0(apiRequestOptions, z);
            }
        };
    }

    @Provides
    @ActivityRetainedScope
    public final FinancialConnectionsManifestRepository providesFinancialConnectionsManifestRepository(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ProvideApiRequestOptions provideApiRequestOptions, Locale locale, Logger logger) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
        Intrinsics.checkNotNullParameter(logger, "logger");
        FinancialConnectionsManifestRepository.Companion companion = FinancialConnectionsManifestRepository.INSTANCE;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Locale locale2 = locale;
        Intrinsics.checkNotNull(locale2);
        return companion.invoke(requestExecutor, apiRequestFactory, provideApiRequestOptions, logger, locale2, null);
    }
}
