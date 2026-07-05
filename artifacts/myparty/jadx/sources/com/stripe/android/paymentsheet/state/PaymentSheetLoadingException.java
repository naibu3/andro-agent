package com.stripe.android.paymentsheet.state;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PaymentSheetLoadingException.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "InvalidConfirmationMethod", "NoPaymentMethodTypesAvailable", "PaymentIntentInTerminalState", "SetupIntentInTerminalState", "MissingAmountOrCurrency", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$InvalidConfirmationMethod;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$MissingAmountOrCurrency;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$NoPaymentMethodTypesAvailable;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$PaymentIntentInTerminalState;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$SetupIntentInTerminalState;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$Unknown;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentSheetLoadingException extends Throwable {
    public static final int $stable = 0;

    public /* synthetic */ PaymentSheetLoadingException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getType();

    private PaymentSheetLoadingException() {
    }

    /* compiled from: PaymentSheetLoadingException.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$InvalidConfirmationMethod;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "confirmationMethod", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "<init>", "(Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;)V", "type", "", "getType", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InvalidConfirmationMethod extends PaymentSheetLoadingException {
        public static final int $stable = 0;
        private final PaymentIntent.ConfirmationMethod confirmationMethod;
        private final String message;
        private final String type;

        /* renamed from: component1, reason: from getter */
        private final PaymentIntent.ConfirmationMethod getConfirmationMethod() {
            return this.confirmationMethod;
        }

        public static /* synthetic */ InvalidConfirmationMethod copy$default(InvalidConfirmationMethod invalidConfirmationMethod, PaymentIntent.ConfirmationMethod confirmationMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                confirmationMethod = invalidConfirmationMethod.confirmationMethod;
            }
            return invalidConfirmationMethod.copy(confirmationMethod);
        }

        public final InvalidConfirmationMethod copy(PaymentIntent.ConfirmationMethod confirmationMethod) {
            Intrinsics.checkNotNullParameter(confirmationMethod, "confirmationMethod");
            return new InvalidConfirmationMethod(confirmationMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidConfirmationMethod) && this.confirmationMethod == ((InvalidConfirmationMethod) other).confirmationMethod;
        }

        public int hashCode() {
            return this.confirmationMethod.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidConfirmationMethod(confirmationMethod=" + this.confirmationMethod + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidConfirmationMethod(PaymentIntent.ConfirmationMethod confirmationMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(confirmationMethod, "confirmationMethod");
            this.confirmationMethod = confirmationMethod;
            this.type = "invalidConfirmationMethod";
            this.message = StringsKt.trimIndent("\n            PaymentIntent with confirmation_method='automatic' is required.\n            The current PaymentIntent has confirmation_method '" + confirmationMethod + "'.\n            See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n        ");
        }

        @Override // com.stripe.android.paymentsheet.state.PaymentSheetLoadingException
        public String getType() {
            return this.type;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    /* compiled from: PaymentSheetLoadingException.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$NoPaymentMethodTypesAvailable;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "requested", "", "<init>", "(Ljava/lang/String;)V", "type", "getType", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoPaymentMethodTypesAvailable extends PaymentSheetLoadingException {
        public static final int $stable = 0;
        private final String requested;
        private final String type;

        /* renamed from: component1, reason: from getter */
        private final String getRequested() {
            return this.requested;
        }

        public static /* synthetic */ NoPaymentMethodTypesAvailable copy$default(NoPaymentMethodTypesAvailable noPaymentMethodTypesAvailable, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noPaymentMethodTypesAvailable.requested;
            }
            return noPaymentMethodTypesAvailable.copy(str);
        }

        public final NoPaymentMethodTypesAvailable copy(String requested) {
            Intrinsics.checkNotNullParameter(requested, "requested");
            return new NoPaymentMethodTypesAvailable(requested);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoPaymentMethodTypesAvailable) && Intrinsics.areEqual(this.requested, ((NoPaymentMethodTypesAvailable) other).requested);
        }

        public int hashCode() {
            return this.requested.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NoPaymentMethodTypesAvailable(requested=" + this.requested + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoPaymentMethodTypesAvailable(String requested) {
            super(null);
            Intrinsics.checkNotNullParameter(requested, "requested");
            this.requested = requested;
            this.type = "noPaymentMethodTypesAvailable";
        }

        @Override // com.stripe.android.paymentsheet.state.PaymentSheetLoadingException
        public String getType() {
            return this.type;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "None of the requested payment methods (" + this.requested + ") are supported.";
        }
    }

    /* compiled from: PaymentSheetLoadingException.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$PaymentIntentInTerminalState;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "<init>", "(Lcom/stripe/android/model/StripeIntent$Status;)V", "type", "", "getType", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentIntentInTerminalState extends PaymentSheetLoadingException {
        public static final int $stable = 0;
        private final StripeIntent.Status status;
        private final String type;

        /* renamed from: component1, reason: from getter */
        private final StripeIntent.Status getStatus() {
            return this.status;
        }

        public static /* synthetic */ PaymentIntentInTerminalState copy$default(PaymentIntentInTerminalState paymentIntentInTerminalState, StripeIntent.Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                status = paymentIntentInTerminalState.status;
            }
            return paymentIntentInTerminalState.copy(status);
        }

        public final PaymentIntentInTerminalState copy(StripeIntent.Status status) {
            return new PaymentIntentInTerminalState(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentIntentInTerminalState) && this.status == ((PaymentIntentInTerminalState) other).status;
        }

        public int hashCode() {
            StripeIntent.Status status = this.status;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PaymentIntentInTerminalState(status=" + this.status + ")";
        }

        public PaymentIntentInTerminalState(StripeIntent.Status status) {
            super(null);
            this.status = status;
            this.type = "paymentIntentInTerminalState";
        }

        @Override // com.stripe.android.paymentsheet.state.PaymentSheetLoadingException
        public String getType() {
            return this.type;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return StringsKt.trimIndent("\n                PaymentSheet cannot set up a PaymentIntent in status '" + this.status + "'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            ");
        }
    }

    /* compiled from: PaymentSheetLoadingException.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$SetupIntentInTerminalState;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "<init>", "(Lcom/stripe/android/model/StripeIntent$Status;)V", "type", "", "getType", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetupIntentInTerminalState extends PaymentSheetLoadingException {
        public static final int $stable = 0;
        private final StripeIntent.Status status;
        private final String type;

        /* renamed from: component1, reason: from getter */
        private final StripeIntent.Status getStatus() {
            return this.status;
        }

        public static /* synthetic */ SetupIntentInTerminalState copy$default(SetupIntentInTerminalState setupIntentInTerminalState, StripeIntent.Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                status = setupIntentInTerminalState.status;
            }
            return setupIntentInTerminalState.copy(status);
        }

        public final SetupIntentInTerminalState copy(StripeIntent.Status status) {
            return new SetupIntentInTerminalState(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetupIntentInTerminalState) && this.status == ((SetupIntentInTerminalState) other).status;
        }

        public int hashCode() {
            StripeIntent.Status status = this.status;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "SetupIntentInTerminalState(status=" + this.status + ")";
        }

        public SetupIntentInTerminalState(StripeIntent.Status status) {
            super(null);
            this.status = status;
            this.type = "setupIntentInTerminalState";
        }

        @Override // com.stripe.android.paymentsheet.state.PaymentSheetLoadingException
        public String getType() {
            return this.type;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return StringsKt.trimIndent("\n                PaymentSheet cannot set up a SetupIntent in status '" + this.status + "'.\n                See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status.\n            ");
        }
    }

    /* compiled from: PaymentSheetLoadingException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$MissingAmountOrCurrency;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "message", "getMessage", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MissingAmountOrCurrency extends PaymentSheetLoadingException {
        public static final int $stable = 0;
        public static final MissingAmountOrCurrency INSTANCE = new MissingAmountOrCurrency();
        private static final String type = "missingAmountOrCurrency";
        private static final String message = "PaymentIntent must contain amount and currency.";

        private MissingAmountOrCurrency() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.state.PaymentSheetLoadingException
        public String getType() {
            return type;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* compiled from: PaymentSheetLoadingException.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException$Unknown;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "type", "", "getType", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unknown extends PaymentSheetLoadingException {
        public static final int $stable = 8;
        private final Throwable cause;
        private final String message;

        public static /* synthetic */ Unknown copy$default(Unknown unknown, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = unknown.cause;
            }
            return unknown.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Unknown copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Unknown(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && Intrinsics.areEqual(this.cause, ((Unknown) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(cause=" + this.cause + ")";
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(Throwable cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
            this.message = getCause().getMessage();
        }

        @Override // com.stripe.android.paymentsheet.state.PaymentSheetLoadingException
        public String getType() {
            return StripeException.INSTANCE.create(getCause()).analyticsValue();
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }
}
