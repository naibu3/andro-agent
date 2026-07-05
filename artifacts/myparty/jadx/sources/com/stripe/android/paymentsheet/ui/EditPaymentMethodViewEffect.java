package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditPaymentMethodViewEffect.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect;", "", "OnRemoveRequested", "OnUpdateRequested", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnRemoveRequested;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EditPaymentMethodViewEffect {

    /* compiled from: EditPaymentMethodViewEffect.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnRemoveRequested;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRemoveRequested implements EditPaymentMethodViewEffect {
        public static final int $stable = PaymentMethod.$stable;
        private final PaymentMethod paymentMethod;

        public static /* synthetic */ OnRemoveRequested copy$default(OnRemoveRequested onRemoveRequested, PaymentMethod paymentMethod, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = onRemoveRequested.paymentMethod;
            }
            return onRemoveRequested.copy(paymentMethod);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final OnRemoveRequested copy(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new OnRemoveRequested(paymentMethod);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnRemoveRequested) && Intrinsics.areEqual(this.paymentMethod, ((OnRemoveRequested) other).paymentMethod);
        }

        public int hashCode() {
            return this.paymentMethod.hashCode();
        }

        public String toString() {
            return "OnRemoveRequested(paymentMethod=" + this.paymentMethod + ")";
        }

        public OnRemoveRequested(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }
    }

    /* compiled from: EditPaymentMethodViewEffect.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect$OnUpdateRequested;", "Lcom/stripe/android/paymentsheet/ui/EditPaymentMethodViewEffect;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "brand", "Lcom/stripe/android/model/CardBrand;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/CardBrand;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUpdateRequested implements EditPaymentMethodViewEffect {
        public static final int $stable = PaymentMethod.$stable;
        private final CardBrand brand;
        private final PaymentMethod paymentMethod;

        public static /* synthetic */ OnUpdateRequested copy$default(OnUpdateRequested onUpdateRequested, PaymentMethod paymentMethod, CardBrand cardBrand, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = onUpdateRequested.paymentMethod;
            }
            if ((i & 2) != 0) {
                cardBrand = onUpdateRequested.brand;
            }
            return onUpdateRequested.copy(paymentMethod, cardBrand);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final CardBrand getBrand() {
            return this.brand;
        }

        public final OnUpdateRequested copy(PaymentMethod paymentMethod, CardBrand brand) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(brand, "brand");
            return new OnUpdateRequested(paymentMethod, brand);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnUpdateRequested)) {
                return false;
            }
            OnUpdateRequested onUpdateRequested = (OnUpdateRequested) other;
            return Intrinsics.areEqual(this.paymentMethod, onUpdateRequested.paymentMethod) && this.brand == onUpdateRequested.brand;
        }

        public int hashCode() {
            return (this.paymentMethod.hashCode() * 31) + this.brand.hashCode();
        }

        public String toString() {
            return "OnUpdateRequested(paymentMethod=" + this.paymentMethod + ", brand=" + this.brand + ")";
        }

        public OnUpdateRequested(PaymentMethod paymentMethod, CardBrand brand) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(brand, "brand");
            this.paymentMethod = paymentMethod;
            this.brand = brand;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }
    }
}
