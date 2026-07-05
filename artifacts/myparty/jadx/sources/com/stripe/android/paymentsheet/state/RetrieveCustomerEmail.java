package com.stripe.android.paymentsheet.state;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RetrieveCustomerEmail.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦B¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;", "", "invoke", "", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "customer", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RetrieveCustomerEmail {
    Object invoke(CommonConfiguration commonConfiguration, CustomerRepository.CustomerInfo customerInfo, Continuation<? super String> continuation);
}
