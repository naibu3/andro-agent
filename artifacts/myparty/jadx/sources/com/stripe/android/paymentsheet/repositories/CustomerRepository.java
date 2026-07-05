package com.stripe.android.paymentsheet.repositories;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerRepository.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001!J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H¦@¢\u0006\u0004\b \u0010\u0019¨\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "", "retrieveCustomer", "Lcom/stripe/android/model/Customer;", "customerInfo", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentMethods", "Lkotlin/Result;", "", "Lcom/stripe/android/model/PaymentMethod;", "types", "Lcom/stripe/android/model/PaymentMethod$Type;", "silentlyFail", "", "getPaymentMethods-BWLJW6A", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "paymentMethodId", "", "canRemoveDuplicates", "detachPaymentMethod-BWLJW6A", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "attachPaymentMethod-0E7RQCE", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "updatePaymentMethod-BWLJW6A", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultPaymentMethod", "setDefaultPaymentMethod-0E7RQCE", "CustomerInfo", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CustomerRepository {
    /* renamed from: attachPaymentMethod-0E7RQCE */
    Object mo8415attachPaymentMethod0E7RQCE(CustomerInfo customerInfo, String str, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: detachPaymentMethod-BWLJW6A */
    Object mo8416detachPaymentMethodBWLJW6A(CustomerInfo customerInfo, String str, boolean z, Continuation<? super Result<PaymentMethod>> continuation);

    /* renamed from: getPaymentMethods-BWLJW6A */
    Object mo8417getPaymentMethodsBWLJW6A(CustomerInfo customerInfo, List<? extends PaymentMethod.Type> list, boolean z, Continuation<? super Result<? extends List<PaymentMethod>>> continuation);

    Object retrieveCustomer(CustomerInfo customerInfo, Continuation<? super Customer> continuation);

    /* renamed from: setDefaultPaymentMethod-0E7RQCE */
    Object mo8418setDefaultPaymentMethod0E7RQCE(CustomerInfo customerInfo, String str, Continuation<? super Result<Customer>> continuation);

    /* renamed from: updatePaymentMethod-BWLJW6A */
    Object mo8419updatePaymentMethodBWLJW6A(CustomerInfo customerInfo, String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super Result<PaymentMethod>> continuation);

    /* compiled from: CustomerRepository.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;", "", "id", "", "ephemeralKeySecret", "customerSessionClientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getEphemeralKeySecret", "getCustomerSessionClientSecret", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomerInfo {
        public static final int $stable = 0;
        private final String customerSessionClientSecret;
        private final String ephemeralKeySecret;
        private final String id;

        public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customerInfo.id;
            }
            if ((i & 2) != 0) {
                str2 = customerInfo.ephemeralKeySecret;
            }
            if ((i & 4) != 0) {
                str3 = customerInfo.customerSessionClientSecret;
            }
            return customerInfo.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEphemeralKeySecret() {
            return this.ephemeralKeySecret;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }

        public final CustomerInfo copy(String id, String ephemeralKeySecret, String customerSessionClientSecret) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
            return new CustomerInfo(id, ephemeralKeySecret, customerSessionClientSecret);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerInfo)) {
                return false;
            }
            CustomerInfo customerInfo = (CustomerInfo) other;
            return Intrinsics.areEqual(this.id, customerInfo.id) && Intrinsics.areEqual(this.ephemeralKeySecret, customerInfo.ephemeralKeySecret) && Intrinsics.areEqual(this.customerSessionClientSecret, customerInfo.customerSessionClientSecret);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.ephemeralKeySecret.hashCode()) * 31;
            String str = this.customerSessionClientSecret;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CustomerInfo(id=" + this.id + ", ephemeralKeySecret=" + this.ephemeralKeySecret + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ")";
        }

        public CustomerInfo(String id, String ephemeralKeySecret, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
            this.id = id;
            this.ephemeralKeySecret = ephemeralKeySecret;
            this.customerSessionClientSecret = str;
        }

        public final String getId() {
            return this.id;
        }

        public final String getEphemeralKeySecret() {
            return this.ephemeralKeySecret;
        }

        public final String getCustomerSessionClientSecret() {
            return this.customerSessionClientSecret;
        }
    }
}
