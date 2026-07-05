package com.qonversion.android.sdk.internal.purchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseHistory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "", "type", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "historyRecord", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lcom/android/billingclient/api/PurchaseHistoryRecord;)V", "getHistoryRecord", "()Lcom/android/billingclient/api/PurchaseHistoryRecord;", "getType", "()Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class PurchaseHistory {
    private final PurchaseHistoryRecord historyRecord;
    private final QStoreProductType type;

    public static /* synthetic */ PurchaseHistory copy$default(PurchaseHistory purchaseHistory, QStoreProductType qStoreProductType, PurchaseHistoryRecord purchaseHistoryRecord, int i, Object obj) {
        if ((i & 1) != 0) {
            qStoreProductType = purchaseHistory.type;
        }
        if ((i & 2) != 0) {
            purchaseHistoryRecord = purchaseHistory.historyRecord;
        }
        return purchaseHistory.copy(qStoreProductType, purchaseHistoryRecord);
    }

    /* renamed from: component1, reason: from getter */
    public final QStoreProductType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final PurchaseHistoryRecord getHistoryRecord() {
        return this.historyRecord;
    }

    public final PurchaseHistory copy(QStoreProductType type, PurchaseHistoryRecord historyRecord) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        return new PurchaseHistory(type, historyRecord);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHistory)) {
            return false;
        }
        PurchaseHistory purchaseHistory = (PurchaseHistory) other;
        return this.type == purchaseHistory.type && Intrinsics.areEqual(this.historyRecord, purchaseHistory.historyRecord);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.historyRecord.hashCode();
    }

    public String toString() {
        return "PurchaseHistory(type=" + this.type + ", historyRecord=" + this.historyRecord + ")";
    }

    public PurchaseHistory(QStoreProductType type, PurchaseHistoryRecord historyRecord) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.type = type;
        this.historyRecord = historyRecord;
    }

    public final QStoreProductType getType() {
        return this.type;
    }

    public final PurchaseHistoryRecord getHistoryRecord() {
        return this.historyRecord;
    }
}
