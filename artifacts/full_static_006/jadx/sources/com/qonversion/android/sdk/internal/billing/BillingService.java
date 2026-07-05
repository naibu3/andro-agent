package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternalEnriched;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: BillingService.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&Jb\u0010\r\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000f2'\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u000fH&JV\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000f2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00030\u000fH&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH&JT\u0010 \u001a\u00020\u00032!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000f2'\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00030\u000fH&JT\u0010\"\u001a\u00020\u00032!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u000f2'\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00030\u000fH&¨\u0006#"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingService;", "", "consumeHistoryRecords", "", "historyRecords", "", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "consumePurchases", "purchases", "Lcom/android/billingclient/api/Purchase;", "enrichStoreData", "products", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "enrichStoreDataAsync", "onFailed", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onEnriched", "getStoreProductType", "storeId", "", "onSuccess", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "type", "purchase", "activity", "Landroid/app/Activity;", "purchaseModel", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "queryPurchases", "onCompleted", "queryPurchasesHistory", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface BillingService {
    void consumeHistoryRecords(List<PurchaseHistory> historyRecords);

    void consumePurchases(List<? extends Purchase> purchases);

    void enrichStoreData(List<QProduct> products);

    void enrichStoreDataAsync(List<QProduct> products, Function1<? super BillingError, Unit> onFailed, Function1<? super List<QProduct>, Unit> onEnriched);

    void getStoreProductType(String storeId, Function1<? super BillingError, Unit> onFailed, Function1<? super QStoreProductType, Unit> onSuccess);

    void purchase(Activity activity, PurchaseModelInternalEnriched purchaseModel);

    void queryPurchases(Function1<? super BillingError, Unit> onFailed, Function1<? super List<? extends Purchase>, Unit> onCompleted);

    void queryPurchasesHistory(Function1<? super BillingError, Unit> onFailed, Function1<? super List<PurchaseHistory>, Unit> onCompleted);
}
