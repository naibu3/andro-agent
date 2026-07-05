package com.stripe.android.customersheet.util;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"sortPaymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetUtilsKt {
    public static final List<PaymentMethod> sortPaymentMethods(List<PaymentMethod> paymentMethods, PaymentSelection.Saved saved) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        if (saved != null) {
            final PaymentMethod paymentMethod = saved.getPaymentMethod();
            final Function2 function2 = new Function2() { // from class: com.stripe.android.customersheet.util.CustomerSheetUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(CustomerSheetUtilsKt.sortPaymentMethods$lambda$2$lambda$0(paymentMethod, (PaymentMethod) obj, (PaymentMethod) obj2));
                }
            };
            List<PaymentMethod> listSortedWith = CollectionsKt.sortedWith(paymentMethods, new Comparator() { // from class: com.stripe.android.customersheet.util.CustomerSheetUtilsKt$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return CustomerSheetUtilsKt.sortPaymentMethods$lambda$2$lambda$1(function2, obj, obj2);
                }
            });
            if (listSortedWith != null) {
                return listSortedWith;
            }
        }
        return paymentMethods;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortPaymentMethods$lambda$2$lambda$1(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortPaymentMethods$lambda$2$lambda$0(PaymentMethod paymentMethod, PaymentMethod paymentMethod2, PaymentMethod paymentMethod3) {
        if (Intrinsics.areEqual(paymentMethod2.id, paymentMethod.id)) {
            return -1;
        }
        return Intrinsics.areEqual(paymentMethod3.id, paymentMethod.id) ? 1 : 0;
    }
}
