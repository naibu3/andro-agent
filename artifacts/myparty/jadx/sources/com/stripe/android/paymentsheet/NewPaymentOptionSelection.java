package com.stripe.android.paymentsheet;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewPaymentOptionSelection.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH&J\b\u0010\t\u001a\u00020\u0007H&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getPaymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "getType", "getPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "getPaymentMethodOptionParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "New", "External", TypedValues.Custom.NAME, "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$Custom;", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$External;", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NewPaymentOptionSelection {
    String getPaymentMethodCode();

    PaymentMethodCreateParams getPaymentMethodCreateParams();

    PaymentMethodExtraParams getPaymentMethodExtraParams();

    PaymentMethodOptionsParams getPaymentMethodOptionParams();

    PaymentSelection getPaymentSelection();

    String getType();

    /* compiled from: NewPaymentOptionSelection.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$New;", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "getPaymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "getType", "getPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "getPaymentMethodOptionParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class New implements NewPaymentOptionSelection {
        public static final int $stable = 0;
        private final PaymentSelection.New paymentSelection;

        public static /* synthetic */ New copy$default(New r0, PaymentSelection.New r1, int i, Object obj) {
            if ((i & 1) != 0) {
                r1 = r0.paymentSelection;
            }
            return r0.copy(r1);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSelection.New getPaymentSelection() {
            return this.paymentSelection;
        }

        public final New copy(PaymentSelection.New paymentSelection) {
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            return new New(paymentSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof New) && Intrinsics.areEqual(this.paymentSelection, ((New) other).paymentSelection);
        }

        public int hashCode() {
            return this.paymentSelection.hashCode();
        }

        public String toString() {
            return "New(paymentSelection=" + this.paymentSelection + ")";
        }

        public New(PaymentSelection.New paymentSelection) {
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            this.paymentSelection = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentSelection.New getPaymentSelection() {
            return this.paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public String getPaymentMethodCode() {
            PaymentSelection.New paymentSelection = getPaymentSelection();
            if (paymentSelection instanceof PaymentSelection.New.LinkInline) {
                return PaymentMethod.Type.Card.code;
            }
            if (!(paymentSelection instanceof PaymentSelection.New.Card) && !(paymentSelection instanceof PaymentSelection.New.USBankAccount) && !(paymentSelection instanceof PaymentSelection.New.GenericPaymentMethod)) {
                throw new NoWhenBranchMatchedException();
            }
            return getPaymentSelection().getPaymentMethodCreateParams().getTypeCode();
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public String getType() {
            return getPaymentSelection().getPaymentMethodCreateParams().getTypeCode();
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return getPaymentSelection().getPaymentMethodCreateParams();
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodExtraParams getPaymentMethodExtraParams() {
            return getPaymentSelection().getPaymentMethodExtraParams();
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodOptionsParams getPaymentMethodOptionParams() {
            return getPaymentSelection().getPaymentMethodOptionsParams();
        }
    }

    /* compiled from: NewPaymentOptionSelection.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$External;", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;)V", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;", "getPaymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "getType", "getPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "getPaymentMethodOptionParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class External implements NewPaymentOptionSelection {
        public static final int $stable = 8;
        private final PaymentSelection.ExternalPaymentMethod paymentSelection;

        public static /* synthetic */ External copy$default(External external, PaymentSelection.ExternalPaymentMethod externalPaymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                externalPaymentMethod = external.paymentSelection;
            }
            return external.copy(externalPaymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSelection.ExternalPaymentMethod getPaymentSelection() {
            return this.paymentSelection;
        }

        public final External copy(PaymentSelection.ExternalPaymentMethod paymentSelection) {
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            return new External(paymentSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof External) && Intrinsics.areEqual(this.paymentSelection, ((External) other).paymentSelection);
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodExtraParams getPaymentMethodExtraParams() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodOptionsParams getPaymentMethodOptionParams() {
            return null;
        }

        public int hashCode() {
            return this.paymentSelection.hashCode();
        }

        public String toString() {
            return "External(paymentSelection=" + this.paymentSelection + ")";
        }

        public External(PaymentSelection.ExternalPaymentMethod paymentSelection) {
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            this.paymentSelection = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentSelection.ExternalPaymentMethod getPaymentSelection() {
            return this.paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public String getPaymentMethodCode() {
            return getPaymentSelection().getType();
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public String getType() {
            return getPaymentSelection().getType();
        }
    }

    /* compiled from: NewPaymentOptionSelection.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection$Custom;", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;)V", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;", "getPaymentMethodCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "getType", "getPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "getPaymentMethodOptionParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Custom implements NewPaymentOptionSelection {
        public static final int $stable = 8;
        private final PaymentSelection.CustomPaymentMethod paymentSelection;

        public static /* synthetic */ Custom copy$default(Custom custom, PaymentSelection.CustomPaymentMethod customPaymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                customPaymentMethod = custom.paymentSelection;
            }
            return custom.copy(customPaymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSelection.CustomPaymentMethod getPaymentSelection() {
            return this.paymentSelection;
        }

        public final Custom copy(PaymentSelection.CustomPaymentMethod paymentSelection) {
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            return new Custom(paymentSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Custom) && Intrinsics.areEqual(this.paymentSelection, ((Custom) other).paymentSelection);
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodExtraParams getPaymentMethodExtraParams() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentMethodOptionsParams getPaymentMethodOptionParams() {
            return null;
        }

        public int hashCode() {
            return this.paymentSelection.hashCode();
        }

        public String toString() {
            return "Custom(paymentSelection=" + this.paymentSelection + ")";
        }

        public Custom(PaymentSelection.CustomPaymentMethod paymentSelection) {
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            this.paymentSelection = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public PaymentSelection.CustomPaymentMethod getPaymentSelection() {
            return this.paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public String getPaymentMethodCode() {
            return getPaymentSelection().getId();
        }

        @Override // com.stripe.android.paymentsheet.NewPaymentOptionSelection
        public String getType() {
            return getPaymentSelection().getId();
        }
    }
}
