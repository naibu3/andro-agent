package com.stripe.android.paymentelement;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticEventCallback.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent;", "", "<init>", "()V", "PresentedSheet", "SelectedPaymentMethodType", "DisplayedPaymentMethodForm", "StartedInteractionWithPaymentMethodForm", "CompletedPaymentMethodForm", "TappedConfirmButton", "SelectedSavedPaymentMethod", "RemovedSavedPaymentMethod", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AnalyticEvent {
    public static final int $stable = 0;

    /* compiled from: AnalyticEventCallback.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent$PresentedSheet;", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "<init>", "()V", InAppPurchaseConstants.METHOD_TO_STRING, "", "equals", "", "other", "", "hashCode", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PresentedSheet extends AnalyticEvent {
        public static final int $stable = 0;

        public String toString() {
            String simpleName = getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }

        public boolean equals(Object other) {
            return other instanceof PresentedSheet;
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }

    /* compiled from: AnalyticEventCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent$SelectedPaymentMethodType;", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "paymentMethodType", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectedPaymentMethodType extends AnalyticEvent {
        public static final int $stable = 0;
        private final String paymentMethodType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedPaymentMethodType) && Intrinsics.areEqual(this.paymentMethodType, ((SelectedPaymentMethodType) obj).paymentMethodType);
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        public String toString() {
            return "SelectedPaymentMethodType(paymentMethodType=" + this.paymentMethodType + ")";
        }

        public SelectedPaymentMethodType(String paymentMethodType) {
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }
    }

    /* compiled from: AnalyticEventCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent$DisplayedPaymentMethodForm;", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "paymentMethodType", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DisplayedPaymentMethodForm extends AnalyticEvent {
        public static final int $stable = 0;
        private final String paymentMethodType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayedPaymentMethodForm) && Intrinsics.areEqual(this.paymentMethodType, ((DisplayedPaymentMethodForm) obj).paymentMethodType);
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        public String toString() {
            return "DisplayedPaymentMethodForm(paymentMethodType=" + this.paymentMethodType + ")";
        }

        public DisplayedPaymentMethodForm(String paymentMethodType) {
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }
    }

    /* compiled from: AnalyticEventCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent$StartedInteractionWithPaymentMethodForm;", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "paymentMethodType", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartedInteractionWithPaymentMethodForm extends AnalyticEvent {
        public static final int $stable = 0;
        private final String paymentMethodType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartedInteractionWithPaymentMethodForm) && Intrinsics.areEqual(this.paymentMethodType, ((StartedInteractionWithPaymentMethodForm) obj).paymentMethodType);
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        public String toString() {
            return "StartedInteractionWithPaymentMethodForm(paymentMethodType=" + this.paymentMethodType + ")";
        }

        public StartedInteractionWithPaymentMethodForm(String paymentMethodType) {
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }
    }

    /* compiled from: AnalyticEventCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent$CompletedPaymentMethodForm;", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "paymentMethodType", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompletedPaymentMethodForm extends AnalyticEvent {
        public static final int $stable = 0;
        private final String paymentMethodType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CompletedPaymentMethodForm) && Intrinsics.areEqual(this.paymentMethodType, ((CompletedPaymentMethodForm) obj).paymentMethodType);
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        public String toString() {
            return "CompletedPaymentMethodForm(paymentMethodType=" + this.paymentMethodType + ")";
        }

        public CompletedPaymentMethodForm(String paymentMethodType) {
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }
    }

    /* compiled from: AnalyticEventCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent$TappedConfirmButton;", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "paymentMethodType", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TappedConfirmButton extends AnalyticEvent {
        public static final int $stable = 0;
        private final String paymentMethodType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TappedConfirmButton) && Intrinsics.areEqual(this.paymentMethodType, ((TappedConfirmButton) obj).paymentMethodType);
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        public String toString() {
            return "TappedConfirmButton(paymentMethodType=" + this.paymentMethodType + ")";
        }

        public TappedConfirmButton(String paymentMethodType) {
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }
    }

    /* compiled from: AnalyticEventCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent$SelectedSavedPaymentMethod;", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "paymentMethodType", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectedSavedPaymentMethod extends AnalyticEvent {
        public static final int $stable = 0;
        private final String paymentMethodType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedSavedPaymentMethod) && Intrinsics.areEqual(this.paymentMethodType, ((SelectedSavedPaymentMethod) obj).paymentMethodType);
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        public String toString() {
            return "SelectedSavedPaymentMethod(paymentMethodType=" + this.paymentMethodType + ")";
        }

        public SelectedSavedPaymentMethod(String paymentMethodType) {
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }
    }

    /* compiled from: AnalyticEventCallback.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/AnalyticEvent$RemovedSavedPaymentMethod;", "Lcom/stripe/android/paymentelement/AnalyticEvent;", "paymentMethodType", "", "<init>", "(Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemovedSavedPaymentMethod extends AnalyticEvent {
        public static final int $stable = 0;
        private final String paymentMethodType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemovedSavedPaymentMethod) && Intrinsics.areEqual(this.paymentMethodType, ((RemovedSavedPaymentMethod) obj).paymentMethodType);
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        public String toString() {
            return "RemovedSavedPaymentMethod(paymentMethodType=" + this.paymentMethodType + ")";
        }

        public RemovedSavedPaymentMethod(String paymentMethodType) {
            Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
        }

        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }
    }
}
