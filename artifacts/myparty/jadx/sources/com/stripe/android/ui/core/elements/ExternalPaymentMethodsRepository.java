package com.stripe.android.ui.core.elements;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPaymentMethodsRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsRepository;", "", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "getExternalPaymentMethodSpecs", "", "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "externalPaymentMethodData", "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalPaymentMethodsRepository {
    public static final int $stable = 8;
    private final ErrorReporter errorReporter;

    @Inject
    public ExternalPaymentMethodsRepository(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    public final List<ExternalPaymentMethodSpec> getExternalPaymentMethodSpecs(String externalPaymentMethodData) {
        String str = externalPaymentMethodData;
        if (str == null || str.length() == 0) {
            return CollectionsKt.emptyList();
        }
        Object objM8652deserializeListIoAF18A = ExternalPaymentMethodsSerializer.INSTANCE.m8652deserializeListIoAF18A(externalPaymentMethodData);
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8652deserializeListIoAF18A);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
        }
        if (Result.m9121exceptionOrNullimpl(objM8652deserializeListIoAF18A) != null) {
            objM8652deserializeListIoAF18A = CollectionsKt.emptyList();
        }
        return (List) objM8652deserializeListIoAF18A;
    }
}
