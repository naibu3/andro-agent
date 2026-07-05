package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: ElementsSessionRepository.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "", "get", "Lkotlin/Result;", "Lcom/stripe/android/model/ElementsSession;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customPaymentMethods", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "externalPaymentMethods", "", "savedPaymentMethodSelectionId", "get-hUnOzRk", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ElementsSessionRepository {
    /* renamed from: get-hUnOzRk, reason: not valid java name */
    Object mo8420gethUnOzRk(PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.CustomerConfiguration customerConfiguration, List<PaymentSheet.CustomPaymentMethod> list, List<String> list2, String str, Continuation<? super Result<ElementsSession>> continuation);
}
