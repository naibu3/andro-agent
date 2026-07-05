package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditPaymentMethodViewAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;", "", "OnBrandChoiceOptionsShown", "OnBrandChoiceOptionsDismissed", "OnBrandChoiceChanged", "OnRemovePressed", "OnRemoveConfirmed", "OnUpdatePressed", "OnRemoveConfirmationDismissed", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnBrandChoiceChanged;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnBrandChoiceOptionsDismissed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnBrandChoiceOptionsShown;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnRemoveConfirmationDismissed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnRemoveConfirmed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnRemovePressed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnUpdatePressed;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EditPaymentMethodViewAction {

    /* compiled from: EditPaymentMethodViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnBrandChoiceOptionsShown;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBrandChoiceOptionsShown implements EditPaymentMethodViewAction {
        public static final int $stable = 0;
        public static final OnBrandChoiceOptionsShown INSTANCE = new OnBrandChoiceOptionsShown();

        private OnBrandChoiceOptionsShown() {
        }
    }

    /* compiled from: EditPaymentMethodViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnBrandChoiceOptionsDismissed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBrandChoiceOptionsDismissed implements EditPaymentMethodViewAction {
        public static final int $stable = 0;
        public static final OnBrandChoiceOptionsDismissed INSTANCE = new OnBrandChoiceOptionsDismissed();

        private OnBrandChoiceOptionsDismissed() {
        }
    }

    /* compiled from: EditPaymentMethodViewAction.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnBrandChoiceChanged;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;", "choice", "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "<init>", "(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;)V", "getChoice", "()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBrandChoiceChanged implements EditPaymentMethodViewAction {
        public static final int $stable = 0;
        private final CardBrandChoice choice;

        public static /* synthetic */ OnBrandChoiceChanged copy$default(OnBrandChoiceChanged onBrandChoiceChanged, CardBrandChoice cardBrandChoice, int i, Object obj) {
            if ((i & 1) != 0) {
                cardBrandChoice = onBrandChoiceChanged.choice;
            }
            return onBrandChoiceChanged.copy(cardBrandChoice);
        }

        /* renamed from: component1, reason: from getter */
        public final CardBrandChoice getChoice() {
            return this.choice;
        }

        public final OnBrandChoiceChanged copy(CardBrandChoice choice) {
            Intrinsics.checkNotNullParameter(choice, "choice");
            return new OnBrandChoiceChanged(choice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnBrandChoiceChanged) && Intrinsics.areEqual(this.choice, ((OnBrandChoiceChanged) other).choice);
        }

        public int hashCode() {
            return this.choice.hashCode();
        }

        public String toString() {
            return "OnBrandChoiceChanged(choice=" + this.choice + ")";
        }

        public OnBrandChoiceChanged(CardBrandChoice choice) {
            Intrinsics.checkNotNullParameter(choice, "choice");
            this.choice = choice;
        }

        public final CardBrandChoice getChoice() {
            return this.choice;
        }
    }

    /* compiled from: EditPaymentMethodViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnRemovePressed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRemovePressed implements EditPaymentMethodViewAction {
        public static final int $stable = 0;
        public static final OnRemovePressed INSTANCE = new OnRemovePressed();

        private OnRemovePressed() {
        }
    }

    /* compiled from: EditPaymentMethodViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnRemoveConfirmed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRemoveConfirmed implements EditPaymentMethodViewAction {
        public static final int $stable = 0;
        public static final OnRemoveConfirmed INSTANCE = new OnRemoveConfirmed();

        private OnRemoveConfirmed() {
        }
    }

    /* compiled from: EditPaymentMethodViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnUpdatePressed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUpdatePressed implements EditPaymentMethodViewAction {
        public static final int $stable = 0;
        public static final OnUpdatePressed INSTANCE = new OnUpdatePressed();

        private OnUpdatePressed() {
        }
    }

    /* compiled from: EditPaymentMethodViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction$OnRemoveConfirmationDismissed;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewAction;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRemoveConfirmationDismissed implements EditPaymentMethodViewAction {
        public static final int $stable = 0;
        public static final OnRemoveConfirmationDismissed INSTANCE = new OnRemoveConfirmationDismissed();

        private OnRemoveConfirmationDismissed() {
        }
    }
}
