package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionsStateFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0001H\u0000¨\u0006\u0006"}, d2 = {"findSelectedItem", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "toPaymentSelection", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionsStateFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentOptionsItem findSelectedItem(List<? extends PaymentOptionsItem> list, PaymentSelection paymentSelection) {
        Object next;
        boolean zAreEqual;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PaymentOptionsItem paymentOptionsItem = (PaymentOptionsItem) next;
            if (paymentSelection instanceof PaymentSelection.GooglePay) {
                zAreEqual = paymentOptionsItem instanceof PaymentOptionsItem.GooglePay;
            } else if (paymentSelection instanceof PaymentSelection.Link) {
                zAreEqual = paymentOptionsItem instanceof PaymentOptionsItem.Link;
            } else {
                if (paymentSelection instanceof PaymentSelection.Saved) {
                    if (paymentOptionsItem instanceof PaymentOptionsItem.SavedPaymentMethod) {
                        zAreEqual = Intrinsics.areEqual(((PaymentSelection.Saved) paymentSelection).getPaymentMethod().id, ((PaymentOptionsItem.SavedPaymentMethod) paymentOptionsItem).getPaymentMethod().id);
                    }
                } else if (!(paymentSelection instanceof PaymentSelection.New) && !(paymentSelection instanceof PaymentSelection.CustomPaymentMethod) && !(paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) && !(paymentSelection instanceof PaymentSelection.ShopPay)) {
                    throw new NoWhenBranchMatchedException();
                }
                zAreEqual = false;
            }
            if (zAreEqual) {
                break;
            }
        }
        return (PaymentOptionsItem) next;
    }

    public static final PaymentSelection toPaymentSelection(PaymentOptionsItem paymentOptionsItem) {
        Intrinsics.checkNotNullParameter(paymentOptionsItem, "<this>");
        if (paymentOptionsItem instanceof PaymentOptionsItem.AddCard) {
            return null;
        }
        if (paymentOptionsItem instanceof PaymentOptionsItem.GooglePay) {
            return PaymentSelection.GooglePay.INSTANCE;
        }
        if (paymentOptionsItem instanceof PaymentOptionsItem.Link) {
            return new PaymentSelection.Link(null, null, null, 7, null);
        }
        if (paymentOptionsItem instanceof PaymentOptionsItem.SavedPaymentMethod) {
            return new PaymentSelection.Saved(((PaymentOptionsItem.SavedPaymentMethod) paymentOptionsItem).getPaymentMethod(), null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
