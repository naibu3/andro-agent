package com.stripe.android.customersheet.util;

import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SyncDefaultPaymentMethodUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\"\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¨\u0006\r"}, d2 = {"filterToSupportedPaymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "isSyncDefaultPaymentMethodFeatureEnabled", "", "getDefaultPaymentMethodsEnabledForCustomerSheet", "elementsSession", "Lcom/stripe/android/model/ElementsSession;", "getDefaultPaymentMethodAsPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethods", "defaultPaymentMethodId", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SyncDefaultPaymentMethodUtilsKt {
    public static final List<PaymentMethod> filterToSupportedPaymentMethods(List<PaymentMethod> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listListOf = CollectionsKt.listOf((Object[]) new PaymentMethod.Type[]{PaymentMethod.Type.Card, PaymentMethod.Type.USBankAccount});
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            if (!z || CollectionsKt.contains(listListOf, paymentMethod.type)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean getDefaultPaymentMethodsEnabledForCustomerSheet(ElementsSession elementsSession) {
        ElementsSession.Customer.Session session;
        ElementsSession.Customer.Components components;
        Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
        ElementsSession.Customer customer = elementsSession.getCustomer();
        ElementsSession.Customer.Components.CustomerSheet customerSheet = (customer == null || (session = customer.getSession()) == null || (components = session.getComponents()) == null) ? null : components.getCustomerSheet();
        if (customerSheet instanceof ElementsSession.Customer.Components.CustomerSheet.Enabled) {
            return ((ElementsSession.Customer.Components.CustomerSheet.Enabled) customerSheet).isPaymentMethodSyncDefaultEnabled();
        }
        if (Intrinsics.areEqual(customerSheet, ElementsSession.Customer.Components.CustomerSheet.Disabled.INSTANCE) || customerSheet == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PaymentSelection getDefaultPaymentMethodAsPaymentSelection(List<PaymentMethod> paymentMethods, String str) {
        Object next;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Iterator<T> it = paymentMethods.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PaymentMethod) next).id, str)) {
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) next;
        return paymentMethod != null ? new PaymentSelection.Saved(paymentMethod, null, null, 6, null) : null;
    }
}
