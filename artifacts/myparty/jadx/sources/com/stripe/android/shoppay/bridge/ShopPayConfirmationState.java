package com.stripe.android.shoppay.bridge;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayConfirmationState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;", "", "Pending", "Success", "Failure", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Failure;", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Pending;", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ShopPayConfirmationState {

    /* compiled from: ShopPayConfirmationState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Pending;", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Pending implements ShopPayConfirmationState {
        public static final int $stable = 0;
        public static final Pending INSTANCE = new Pending();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pending)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1015115017;
        }

        public String toString() {
            return "Pending";
        }

        private Pending() {
        }
    }

    /* compiled from: ShopPayConfirmationState.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;", "externalSourceId", "", "billingDetails", "Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;", "shippingAddressData", "Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;)V", "getExternalSourceId", "()Ljava/lang/String;", "getBillingDetails", "()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;", "getShippingAddressData", "()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements ShopPayConfirmationState {
        public static final int $stable = 0;
        private final ECEBillingDetails billingDetails;
        private final String externalSourceId;
        private final ECEShippingAddressData shippingAddressData;

        public static /* synthetic */ Success copy$default(Success success, String str, ECEBillingDetails eCEBillingDetails, ECEShippingAddressData eCEShippingAddressData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.externalSourceId;
            }
            if ((i & 2) != 0) {
                eCEBillingDetails = success.billingDetails;
            }
            if ((i & 4) != 0) {
                eCEShippingAddressData = success.shippingAddressData;
            }
            return success.copy(str, eCEBillingDetails, eCEShippingAddressData);
        }

        /* renamed from: component1, reason: from getter */
        public final String getExternalSourceId() {
            return this.externalSourceId;
        }

        /* renamed from: component2, reason: from getter */
        public final ECEBillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        /* renamed from: component3, reason: from getter */
        public final ECEShippingAddressData getShippingAddressData() {
            return this.shippingAddressData;
        }

        public final Success copy(String externalSourceId, ECEBillingDetails billingDetails, ECEShippingAddressData shippingAddressData) {
            Intrinsics.checkNotNullParameter(externalSourceId, "externalSourceId");
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new Success(externalSourceId, billingDetails, shippingAddressData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.externalSourceId, success.externalSourceId) && Intrinsics.areEqual(this.billingDetails, success.billingDetails) && Intrinsics.areEqual(this.shippingAddressData, success.shippingAddressData);
        }

        public int hashCode() {
            int iHashCode = ((this.externalSourceId.hashCode() * 31) + this.billingDetails.hashCode()) * 31;
            ECEShippingAddressData eCEShippingAddressData = this.shippingAddressData;
            return iHashCode + (eCEShippingAddressData == null ? 0 : eCEShippingAddressData.hashCode());
        }

        public String toString() {
            return "Success(externalSourceId=" + this.externalSourceId + ", billingDetails=" + this.billingDetails + ", shippingAddressData=" + this.shippingAddressData + ")";
        }

        public Success(String externalSourceId, ECEBillingDetails billingDetails, ECEShippingAddressData eCEShippingAddressData) {
            Intrinsics.checkNotNullParameter(externalSourceId, "externalSourceId");
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            this.externalSourceId = externalSourceId;
            this.billingDetails = billingDetails;
            this.shippingAddressData = eCEShippingAddressData;
        }

        public final String getExternalSourceId() {
            return this.externalSourceId;
        }

        public final ECEBillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public final ECEShippingAddressData getShippingAddressData() {
            return this.shippingAddressData;
        }
    }

    /* compiled from: ShopPayConfirmationState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Failure;", "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure implements ShopPayConfirmationState {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.cause;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Failure copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Failure(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.cause, ((Failure) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "Failure(cause=" + this.cause + ")";
        }

        public Failure(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }
}
