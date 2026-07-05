package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CreateIntentCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "", "onCreateIntent", "Lcom/stripe/android/paymentsheet/CreateIntentResult;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "shouldSavePaymentMethod", "", "(Lcom/stripe/android/model/PaymentMethod;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CreateIntentCallback {
    Object onCreateIntent(PaymentMethod paymentMethod, boolean z, Continuation<? super CreateIntentResult> continuation);
}
