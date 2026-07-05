package com.stripe.android.paymentsheet.repositories;

import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DuplicatePaymentMethodDetachFailureException.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failures", "", "Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;", "<init>", "(Ljava/util/List;)V", "getFailures", "()Ljava/util/List;", "message", "", "getMessage", "()Ljava/lang/String;", "DuplicateDetachFailure", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DuplicatePaymentMethodDetachFailureException extends Exception {
    public static final int $stable = 8;
    private final List<DuplicateDetachFailure> failures;
    private final String message;

    public final List<DuplicateDetachFailure> getFailures() {
        return this.failures;
    }

    public DuplicatePaymentMethodDetachFailureException(List<DuplicateDetachFailure> failures) {
        Intrinsics.checkNotNullParameter(failures, "failures");
        this.failures = failures;
        List<DuplicateDetachFailure> list = failures;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (DuplicateDetachFailure duplicateDetachFailure : list) {
            String paymentMethodId = duplicateDetachFailure.getPaymentMethodId();
            String message = duplicateDetachFailure.getException().getMessage();
            if (message == null) {
                message = "Unknown reason";
            }
            arrayList.add("\n - (paymentMethodId: " + paymentMethodId + ", reason: " + message + ")");
        }
        this.message = "Failed to detach the following duplicates:" + arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* compiled from: DuplicatePaymentMethodDetachFailureException.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$DuplicateDetachFailure;", "", "paymentMethodId", "", NotificationsService.EXCEPTION_KEY, "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getPaymentMethodId", "()Ljava/lang/String;", "getException", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DuplicateDetachFailure {
        public static final int $stable = 8;
        private final Throwable exception;
        private final String paymentMethodId;

        public DuplicateDetachFailure(String paymentMethodId, Throwable exception) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.paymentMethodId = paymentMethodId;
            this.exception = exception;
        }

        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public final Throwable getException() {
            return this.exception;
        }
    }
}
