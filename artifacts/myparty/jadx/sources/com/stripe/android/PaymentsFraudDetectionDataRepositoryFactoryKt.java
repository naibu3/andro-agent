package com.stripe.android;

import android.content.Context;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRequestFactory;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore;
import com.stripe.android.core.frauddetection.FraudDetectionEnabledProvider;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PaymentsFraudDetectionDataRepositoryFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"DefaultFraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;", "context", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentsFraudDetectionDataRepositoryFactoryKt {
    public static final DefaultFraudDetectionDataRepository DefaultFraudDetectionDataRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DefaultFraudDetectionDataRepository$default(context, null, 2, null);
    }

    public static /* synthetic */ DefaultFraudDetectionDataRepository DefaultFraudDetectionDataRepository$default(Context context, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        return DefaultFraudDetectionDataRepository(context, coroutineContext);
    }

    public static final DefaultFraudDetectionDataRepository DefaultFraudDetectionDataRepository(Context context, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        return new DefaultFraudDetectionDataRepository(new DefaultFraudDetectionDataStore(context, workContext), new DefaultFraudDetectionDataRequestFactory(context), new DefaultStripeNetworkClient(workContext, null, null, 0, null, 30, null), ErrorReporter.INSTANCE.createFallbackInstance(context, SetsKt.emptySet()), workContext, new FraudDetectionEnabledProvider() { // from class: com.stripe.android.PaymentsFraudDetectionDataRepositoryFactoryKt$$ExternalSyntheticLambda0
            @Override // com.stripe.android.core.frauddetection.FraudDetectionEnabledProvider
            public final boolean provideFraudDetectionEnabled() {
                return PaymentsFraudDetectionDataRepositoryFactoryKt.DefaultFraudDetectionDataRepository$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DefaultFraudDetectionDataRepository$lambda$0() {
        return Stripe.INSTANCE.getAdvancedFraudSignalsEnabled();
    }
}
