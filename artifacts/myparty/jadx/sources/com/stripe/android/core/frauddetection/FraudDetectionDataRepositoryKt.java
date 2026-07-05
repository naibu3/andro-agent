package com.stripe.android.core.frauddetection;

import com.stripe.android.core.networking.ResponseJsonKt;
import com.stripe.android.core.networking.StripeResponse;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: FraudDetectionDataRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"timestampSupplier", "Lkotlin/Function0;", "", "fraudDetectionJsonParser", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataJsonParser;", "fraudDetectionData", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "Lcom/stripe/android/core/networking/StripeResponse;", "", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FraudDetectionDataRepositoryKt {
    private static final FraudDetectionDataJsonParser fraudDetectionJsonParser;
    private static final Function0<Long> timestampSupplier;

    static {
        Function0<Long> function0 = new Function0() { // from class: com.stripe.android.core.frauddetection.FraudDetectionDataRepositoryKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(FraudDetectionDataRepositoryKt.timestampSupplier$lambda$0());
            }
        };
        timestampSupplier = function0;
        fraudDetectionJsonParser = new FraudDetectionDataJsonParser(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long timestampSupplier$lambda$0() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FraudDetectionData fraudDetectionData(StripeResponse<String> stripeResponse) {
        if (!stripeResponse.getIsOk()) {
            stripeResponse = null;
        }
        if (stripeResponse != null) {
            return fraudDetectionJsonParser.parse(ResponseJsonKt.responseJson(stripeResponse));
        }
        return null;
    }
}
