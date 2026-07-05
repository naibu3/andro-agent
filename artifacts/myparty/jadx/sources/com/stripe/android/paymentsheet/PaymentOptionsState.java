package com.stripe.android.paymentsheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentOptionsStateFactory.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsState;", "", AlertFragment.ARG_ITEMS, "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "selectedItem", "<init>", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;)V", "getItems", "()Ljava/util/List;", "getSelectedItem", "()Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentOptionsState {
    public static final int $stable = 8;
    private final List<PaymentOptionsItem> items;
    private final PaymentOptionsItem selectedItem;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentOptionsState copy$default(PaymentOptionsState paymentOptionsState, List list, PaymentOptionsItem paymentOptionsItem, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paymentOptionsState.items;
        }
        if ((i & 2) != 0) {
            paymentOptionsItem = paymentOptionsState.selectedItem;
        }
        return paymentOptionsState.copy(list, paymentOptionsItem);
    }

    public final List<PaymentOptionsItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentOptionsItem getSelectedItem() {
        return this.selectedItem;
    }

    public final PaymentOptionsState copy(List<? extends PaymentOptionsItem> items, PaymentOptionsItem selectedItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new PaymentOptionsState(items, selectedItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOptionsState)) {
            return false;
        }
        PaymentOptionsState paymentOptionsState = (PaymentOptionsState) other;
        return Intrinsics.areEqual(this.items, paymentOptionsState.items) && Intrinsics.areEqual(this.selectedItem, paymentOptionsState.selectedItem);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        PaymentOptionsItem paymentOptionsItem = this.selectedItem;
        return iHashCode + (paymentOptionsItem == null ? 0 : paymentOptionsItem.hashCode());
    }

    public String toString() {
        return "PaymentOptionsState(items=" + this.items + ", selectedItem=" + this.selectedItem + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsState(List<? extends PaymentOptionsItem> items, PaymentOptionsItem paymentOptionsItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.selectedItem = paymentOptionsItem;
    }

    public /* synthetic */ PaymentOptionsState(List list, PaymentOptionsItem paymentOptionsItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : paymentOptionsItem);
    }

    public final List<PaymentOptionsItem> getItems() {
        return this.items;
    }

    public final PaymentOptionsItem getSelectedItem() {
        return this.selectedItem;
    }
}
