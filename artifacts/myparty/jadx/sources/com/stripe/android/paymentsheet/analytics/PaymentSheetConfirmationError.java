package com.stripe.android.paymentsheet.analytics;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetConfirmationError.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "", "<init>", "()V", "analyticsValue", "", "getAnalyticsValue", "()Ljava/lang/String;", "errorCode", "getErrorCode", "Stripe", "GooglePay", "ExternalPaymentMethod", "InvalidState", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$ExternalPaymentMethod;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$InvalidState;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$Stripe;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentSheetConfirmationError extends Throwable {
    public static final int $stable = 0;

    public /* synthetic */ PaymentSheetConfirmationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getAnalyticsValue();

    public abstract String getErrorCode();

    private PaymentSheetConfirmationError() {
    }

    /* compiled from: PaymentSheetConfirmationError.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$Stripe;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "analyticsValue", "getAnalyticsValue", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stripe extends PaymentSheetConfirmationError {
        public static final int $stable = 8;
        private final Throwable cause;
        private final String errorCode;
        private final StripeException stripeException;

        public static /* synthetic */ Stripe copy$default(Stripe stripe, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = stripe.cause;
            }
            return stripe.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Stripe copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Stripe(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe) && Intrinsics.areEqual(this.cause, ((Stripe) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Stripe(cause=" + this.cause + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Stripe(Throwable cause) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
            StripeException stripeExceptionCreate = StripeException.INSTANCE.create(getCause());
            this.stripeException = stripeExceptionCreate;
            StripeError stripeError = stripeExceptionCreate.getStripeError();
            this.errorCode = stripeError != null ? stripeError.getCode() : null;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError
        public String getAnalyticsValue() {
            return this.stripeException.analyticsValue();
        }
    }

    /* compiled from: PaymentSheetConfirmationError.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$GooglePay;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "errorCodeInt", "", "<init>", "(I)V", "getErrorCodeInt", "()I", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "analyticsValue", "getAnalyticsValue", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GooglePay extends PaymentSheetConfirmationError {
        public static final int $stable = 0;
        private final String errorCode;
        private final int errorCodeInt;

        public static /* synthetic */ GooglePay copy$default(GooglePay googlePay, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = googlePay.errorCodeInt;
            }
            return googlePay.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCodeInt() {
            return this.errorCodeInt;
        }

        public final GooglePay copy(int errorCodeInt) {
            return new GooglePay(errorCodeInt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GooglePay) && this.errorCodeInt == ((GooglePay) other).errorCodeInt;
        }

        public int hashCode() {
            return Integer.hashCode(this.errorCodeInt);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GooglePay(errorCodeInt=" + this.errorCodeInt + ")";
        }

        public GooglePay(int i) {
            super(null);
            this.errorCodeInt = i;
            this.errorCode = String.valueOf(i);
        }

        public final int getErrorCodeInt() {
            return this.errorCodeInt;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError
        public String getAnalyticsValue() {
            return "googlePay_" + getErrorCode();
        }
    }

    /* compiled from: PaymentSheetConfirmationError.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$ExternalPaymentMethod;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "<init>", "()V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "analyticsValue", "getAnalyticsValue", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExternalPaymentMethod extends PaymentSheetConfirmationError {
        public static final int $stable = 0;
        public static final ExternalPaymentMethod INSTANCE = new ExternalPaymentMethod();
        private static final String errorCode = null;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExternalPaymentMethod)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1706746466;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ExternalPaymentMethod";
        }

        private ExternalPaymentMethod() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError
        public String getErrorCode() {
            return errorCode;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError
        public String getAnalyticsValue() {
            return "externalPaymentMethodError";
        }
    }

    /* compiled from: PaymentSheetConfirmationError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError$InvalidState;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "<init>", "()V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "analyticsValue", "getAnalyticsValue", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InvalidState extends PaymentSheetConfirmationError {
        public static final int $stable = 0;
        public static final InvalidState INSTANCE = new InvalidState();
        private static final String errorCode = null;

        private InvalidState() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError
        public String getErrorCode() {
            return errorCode;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError
        public String getAnalyticsValue() {
            return "invalidState";
        }
    }
}
