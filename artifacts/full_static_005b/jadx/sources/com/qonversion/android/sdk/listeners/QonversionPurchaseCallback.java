package com.qonversion.android.sdk.listeners;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.Purchase;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionCallback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "onSuccess", "", "entitlements", "", "", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "purchase", "Lcom/android/billingclient/api/Purchase;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface QonversionPurchaseCallback extends QonversionEntitlementsCallback {
    void onSuccess(Map<String, QEntitlement> entitlements, Purchase purchase);

    /* compiled from: QonversionCallback.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static void onSuccess(QonversionPurchaseCallback qonversionPurchaseCallback, Map<String, QEntitlement> entitlements, Purchase purchase) {
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            qonversionPurchaseCallback.onSuccess(entitlements);
        }
    }
}
