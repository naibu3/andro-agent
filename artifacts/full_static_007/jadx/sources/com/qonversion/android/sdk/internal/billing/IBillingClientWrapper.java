package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: IBillingClientWrapper.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJV\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u000eH&J`\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000eH&¢\u0006\u0002\u0010 J2\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00142 \u0010#\u001a\u001c\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010&\u0012\u0004\u0012\u00020\u00050$H&J,\u0010(\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u00050$H&JT\u0010)\u001a\u00020\u00052!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000e2'\u0010#\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020*0&¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00050\u000eH&JG\u0010,\u001a\u00020\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000&2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050/H&¨\u00060"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "StoreId", "StoreData", "", "acknowledge", "", "purchaseToken", "", "consume", "getStoreData", "storeId", "(Ljava/lang/Object;)Ljava/lang/Object;", "getStoreProductType", "onFailed", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onSuccess", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "type", "makePurchase", "activity", "Landroid/app/Activity;", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "offerId", "applyOffer", "", "updatePurchaseInfo", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Lkotlin/jvm/functions/Function1;)V", "queryPurchaseHistory", "productType", "onCompleted", "Lkotlin/Function2;", "Lcom/android/billingclient/api/BillingResult;", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "queryPurchaseHistoryForProduct", "queryPurchases", "Lcom/android/billingclient/api/Purchase;", "purchases", "withStoreDataLoaded", "storeIds", "onReady", "Lkotlin/Function0;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface IBillingClientWrapper<StoreId, StoreData> {
    void acknowledge(String purchaseToken);

    void consume(String purchaseToken);

    StoreData getStoreData(StoreId storeId);

    void getStoreProductType(String storeId, Function1<? super BillingError, Unit> onFailed, Function1<? super QStoreProductType, Unit> onSuccess);

    void makePurchase(Activity activity, QProduct product, String offerId, Boolean applyOffer, UpdatePurchaseInfo updatePurchaseInfo, Function1<? super BillingError, Unit> onFailed);

    void queryPurchaseHistory(QStoreProductType productType, Function2<? super BillingResult, ? super List<? extends PurchaseHistoryRecord>, Unit> onCompleted);

    void queryPurchaseHistoryForProduct(QProduct product, Function2<? super BillingResult, ? super PurchaseHistoryRecord, Unit> onCompleted);

    void queryPurchases(Function1<? super BillingError, Unit> onFailed, Function1<? super List<? extends Purchase>, Unit> onCompleted);

    void withStoreDataLoaded(List<? extends StoreId> storeIds, Function1<? super BillingError, Unit> onFailed, Function0<Unit> onReady);

    /* compiled from: IBillingClientWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void makePurchase$default(IBillingClientWrapper iBillingClientWrapper, Activity activity, QProduct qProduct, String str, Boolean bool, UpdatePurchaseInfo updatePurchaseInfo, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePurchase");
            }
            if ((i & 8) != 0) {
                bool = true;
            }
            iBillingClientWrapper.makePurchase(activity, qProduct, str, bool, updatePurchaseInfo, function1);
        }
    }
}
