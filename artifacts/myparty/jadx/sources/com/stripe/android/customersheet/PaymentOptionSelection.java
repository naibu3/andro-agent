package com.stripe.android.customersheet;

import com.stripe.android.paymentsheet.model.PaymentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetResult.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/PaymentOptionSelection;", "", "paymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentOption;)V", "getPaymentOption", "()Lcom/stripe/android/paymentsheet/model/PaymentOption;", "PaymentMethod", "GooglePay", "Lcom/stripe/android/customersheet/PaymentOptionSelection$GooglePay;", "Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PaymentOptionSelection {
    public static final int $stable = 8;
    private final PaymentOption paymentOption;

    public /* synthetic */ PaymentOptionSelection(PaymentOption paymentOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentOption);
    }

    private PaymentOptionSelection(PaymentOption paymentOption) {
        this.paymentOption = paymentOption;
    }

    public PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    /* compiled from: CustomerSheetResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;", "Lcom/stripe/android/customersheet/PaymentOptionSelection;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentOption;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getPaymentOption", "()Lcom/stripe/android/paymentsheet/model/PaymentOption;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethod extends PaymentOptionSelection {
        public static final int $stable = 8;
        private final com.stripe.android.model.PaymentMethod paymentMethod;
        private final PaymentOption paymentOption;

        public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.stripe.android.customersheet.PaymentOptionSelection
        public PaymentOption getPaymentOption() {
            return this.paymentOption;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethod(com.stripe.android.model.PaymentMethod paymentMethod, PaymentOption paymentOption) {
            super(paymentOption, null);
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(paymentOption, "paymentOption");
            this.paymentMethod = paymentMethod;
            this.paymentOption = paymentOption;
        }
    }

    /* compiled from: CustomerSheetResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/customersheet/PaymentOptionSelection$GooglePay;", "Lcom/stripe/android/customersheet/PaymentOptionSelection;", "paymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentOption;)V", "getPaymentOption", "()Lcom/stripe/android/paymentsheet/model/PaymentOption;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GooglePay extends PaymentOptionSelection {
        public static final int $stable = 8;
        private final PaymentOption paymentOption;

        @Override // com.stripe.android.customersheet.PaymentOptionSelection
        public PaymentOption getPaymentOption() {
            return this.paymentOption;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePay(PaymentOption paymentOption) {
            super(paymentOption, null);
            Intrinsics.checkNotNullParameter(paymentOption, "paymentOption");
            this.paymentOption = paymentOption;
        }
    }
}
