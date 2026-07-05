package com.stripe.android.customersheet.data;

import com.facebook.internal.NativeProtocol;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CustomerSheetPaymentMethodDataSource.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H¦@¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "", "retrievePaymentMethods", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "", "Lcom/stripe/android/model/PaymentMethod;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", "paymentMethodId", "", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomerSheetPaymentMethodDataSource {
    Object attachPaymentMethod(String str, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation);

    Object detachPaymentMethod(String str, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation);

    Object retrievePaymentMethods(Continuation<? super CustomerSheetDataResult<List<PaymentMethod>>> continuation);

    Object updatePaymentMethod(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation);
}
