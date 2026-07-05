package com.stripe.android.financialconnections.utils;

import android.app.Application;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRequestFactory;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore;
import com.stripe.android.core.frauddetection.FraudDetectionEnabledProvider;
import com.stripe.android.core.frauddetection.FraudDetectionErrorReporter;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FinancialConnectionsFraudDetectionRepositoryFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"DefaultFraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;", "application", "Landroid/app/Application;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsFraudDetectionRepositoryFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DefaultFraudDetectionDataRepository$lambda$1() {
        return true;
    }

    public static final DefaultFraudDetectionDataRepository DefaultFraudDetectionDataRepository(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Application application2 = application;
        CoroutineDispatcher io = Dispatchers.getIO();
        return new DefaultFraudDetectionDataRepository(new DefaultFraudDetectionDataStore(application2, io), new DefaultFraudDetectionDataRequestFactory(application2), new DefaultStripeNetworkClient(io, null, null, 0, null, 30, null), new FraudDetectionErrorReporter() { // from class: com.stripe.android.financialconnections.utils.FinancialConnectionsFraudDetectionRepositoryFactoryKt$$ExternalSyntheticLambda0
            @Override // com.stripe.android.core.frauddetection.FraudDetectionErrorReporter
            public final void reportFraudDetectionError(StripeException stripeException) {
                Intrinsics.checkNotNullParameter(stripeException, "it");
            }
        }, io, new FraudDetectionEnabledProvider() { // from class: com.stripe.android.financialconnections.utils.FinancialConnectionsFraudDetectionRepositoryFactoryKt$$ExternalSyntheticLambda1
            @Override // com.stripe.android.core.frauddetection.FraudDetectionEnabledProvider
            public final boolean provideFraudDetectionEnabled() {
                return FinancialConnectionsFraudDetectionRepositoryFactoryKt.DefaultFraudDetectionDataRepository$lambda$1();
            }
        });
    }
}
