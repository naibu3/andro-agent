package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QHandledPurchasesCache.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;", "", "()V", "handledOrderIDs", "", "", "saveHandledPurchase", "", "purchase", "Lcom/android/billingclient/api/Purchase;", "saveHandledPurchases", "purchases", "", "shouldHandlePurchase", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QHandledPurchasesCache {
    private final Set<String> handledOrderIDs = new LinkedHashSet();

    @Inject
    public QHandledPurchasesCache() {
    }

    public final boolean shouldHandlePurchase(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        return !CollectionsKt.contains(this.handledOrderIDs, purchase.getOrderId());
    }

    public final void saveHandledPurchase(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        String orderId = purchase.getOrderId();
        if (orderId != null) {
            this.handledOrderIDs.add(orderId);
        }
    }

    public final void saveHandledPurchases(Collection<? extends Purchase> purchases) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        Set<String> set = this.handledOrderIDs;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = purchases.iterator();
        while (it.hasNext()) {
            String orderId = ((Purchase) it.next()).getOrderId();
            if (orderId != null) {
                arrayList.add(orderId);
            }
        }
        set.addAll(arrayList);
    }
}
