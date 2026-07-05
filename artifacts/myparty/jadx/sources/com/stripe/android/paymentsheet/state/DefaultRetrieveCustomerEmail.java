package com.stripe.android.paymentsheet.state;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.model.Customer;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetrieveCustomerEmail.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;", "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "<init>", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;)V", "invoke", "", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "customer", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultRetrieveCustomerEmail implements RetrieveCustomerEmail {
    public static final int $stable = 8;
    private final CustomerRepository customerRepository;

    /* compiled from: RetrieveCustomerEmail.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.DefaultRetrieveCustomerEmail", f = "RetrieveCustomerEmail.kt", i = {}, l = {35}, m = "invoke", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.state.DefaultRetrieveCustomerEmail$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultRetrieveCustomerEmail.this.invoke(null, null, this);
        }
    }

    @Inject
    public DefaultRetrieveCustomerEmail(CustomerRepository customerRepository) {
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        this.customerRepository = customerRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentsheet.state.RetrieveCustomerEmail
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(CommonConfiguration commonConfiguration, CustomerRepository.CustomerInfo customerInfo, Continuation<? super String> continuation) {
        AnonymousClass1 anonymousClass1;
        String email;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objRetrieveCustomer = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRetrieveCustomer);
            PaymentSheet.BillingDetails defaultBillingDetails = commonConfiguration.getDefaultBillingDetails();
            if (defaultBillingDetails != null && (email = defaultBillingDetails.getEmail()) != null) {
                return email;
            }
            if (customerInfo == null) {
                return null;
            }
            CustomerRepository customerRepository = this.customerRepository;
            anonymousClass1.label = 1;
            objRetrieveCustomer = customerRepository.retrieveCustomer(customerInfo, anonymousClass1);
            if (objRetrieveCustomer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRetrieveCustomer);
        }
        Customer customer = (Customer) objRetrieveCustomer;
        if (customer != null) {
            return customer.getEmail();
        }
        return null;
    }
}
