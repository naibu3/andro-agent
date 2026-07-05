package com.stripe.android.customersheet.data;

import com.stripe.android.customersheet.CustomerSheet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CustomerSheetInitializationDataSource.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;", "", "loadCustomerSheetSession", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSheetInitializationDataSource {
    Object loadCustomerSheetSession(CustomerSheet.Configuration configuration, Continuation<? super CustomerSheetDataResult<CustomerSheetSession>> continuation);
}
