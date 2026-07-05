package com.stripe.android.customersheet;

import com.stripe.android.customersheet.CustomerAdapter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CustomerAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;", "", "provideCustomerEphemeralKey", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lcom/stripe/android/customersheet/CustomerEphemeralKey;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerEphemeralKeyProvider {
    Object provideCustomerEphemeralKey(Continuation<? super CustomerAdapter.Result<CustomerEphemeralKey>> continuation);
}
