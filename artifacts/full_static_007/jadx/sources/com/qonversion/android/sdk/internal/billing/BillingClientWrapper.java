package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductOfferDetails;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapper;
import com.qonversion.android.sdk.internal.dto.ProductStoreId;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import com.qonversion.android.sdk.internal.logger.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* compiled from: BillingClientWrapper.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0016JV\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\f2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00100\u00122!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00100\u0012H\u0016JD\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00122\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c\u0012\u0004\u0012\u00020\u00100\u0012H\u0002J$\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0002J^\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\f2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00100\u0012H\u0016¢\u0006\u0002\u0010*JL\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c\u0012\u0004\u0012\u00020\u00100\u00122\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012H\u0002J2\u0010/\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00182 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u000201\u0012\f\u0012\n\u0012\u0004\u0012\u000202\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u001000H\u0016J,\u00103\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001000H\u0016JT\u00104\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00100\u00122'\u0010\u001d\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002050\u001c¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00100\u0012H\u0016JG\u00107\u001a\u00020\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00100\u00122\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00100:H\u0016J\u0016\u0010&\u001a\u00020;*\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;", "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;", "Lcom/android/billingclient/api/ProductDetails;", "billingClientHolder", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "productDetails", "", "", "getStoreData", "storeId", "getStoreProductType", "", "onFailed", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onSuccess", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "type", "loadProducts", "productIds", "", "onCompleted", "logProductDetails", "productDetailsList", "makePurchase", "activity", "Landroid/app/Activity;", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "offerId", "applyOffer", "", "updatePurchaseInfo", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Lkotlin/jvm/functions/Function1;)V", "queryProductDetailsAsync", "productType", "onQuerySkuCompleted", "onQuerySkuFailed", "queryPurchaseHistory", "Lkotlin/Function2;", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "queryPurchaseHistoryForProduct", "queryPurchases", "Lcom/android/billingclient/api/Purchase;", "purchases", "withStoreDataLoaded", "storeIds", "onReady", "Lkotlin/Function0;", "Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams$Builder;", "offer", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class BillingClientWrapper extends BillingClientWrapperBase implements IBillingClientWrapper<ProductStoreId, ProductDetails> {
    private Map<String, ProductDetails> productDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingClientWrapper(BillingClientHolder billingClientHolder, Logger logger) {
        super(billingClientHolder, logger);
        Intrinsics.checkNotNullParameter(billingClientHolder, "billingClientHolder");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.productDetails = MapsKt.emptyMap();
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void withStoreDataLoaded(List<? extends ProductStoreId> storeIds, Function1<? super BillingError, Unit> onFailed, final Function0<Unit> onReady) {
        Intrinsics.checkNotNullParameter(storeIds, "storeIds");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onReady, "onReady");
        List<? extends ProductStoreId> list = storeIds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductStoreId) it.next()).getProductId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!this.productDetails.containsKey((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            onReady.invoke();
        } else {
            loadProducts(arrayList3, onFailed, new Function1<List<? extends ProductDetails>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper.withStoreDataLoaded.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductDetails> list2) {
                    invoke2((List<ProductDetails>) list2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<ProductDetails> details) {
                    Intrinsics.checkNotNullParameter(details, "details");
                    List<ProductDetails> list2 = details;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                    for (Object obj2 : list2) {
                        linkedHashMap.put(((ProductDetails) obj2).getProductId(), obj2);
                    }
                    BillingClientWrapper billingClientWrapper = BillingClientWrapper.this;
                    billingClientWrapper.productDetails = MapsKt.plus(billingClientWrapper.productDetails, MapsKt.toMutableMap(linkedHashMap));
                    onReady.invoke();
                }
            });
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public ProductDetails getStoreData(ProductStoreId storeId) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        return this.productDetails.get(storeId.getProductId());
    }

    private static final void makePurchase$fireError(Function1<? super BillingError, Unit> function1, String str) {
        function1.invoke(new BillingError(4, str));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void makePurchase(Activity activity, QProduct product, String offerId, Boolean applyOffer, UpdatePurchaseInfo updatePurchaseInfo, Function1<? super BillingError, Unit> onFailed) {
        QProductOfferDetails defaultSubscriptionOfferDetails;
        QProductOfferDetails qProductOfferDetails;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        QProductStoreDetails storeDetails = product.getStoreDetails();
        if (storeDetails == null) {
            onFailed.invoke(new BillingError(4, "Store details not found for purchase"));
            return;
        }
        getLogger().debug("makePurchase() -> Purchasing the product: " + storeDetails.getProductId());
        if (storeDetails.getIsInApp()) {
            qProductOfferDetails = null;
        } else {
            if (Intrinsics.areEqual((Object) applyOffer, (Object) false)) {
                defaultSubscriptionOfferDetails = storeDetails.getBasePlanSubscriptionOfferDetails();
                if (defaultSubscriptionOfferDetails == null) {
                    makePurchase$fireError(onFailed, "Failed to find base plan offer for Qonversion product " + product.getQonversionID());
                    return;
                }
            } else if (offerId != null && offerId.length() > 0) {
                QProductOfferDetails qProductOfferDetailsFindOffer = storeDetails.findOffer(offerId);
                if (qProductOfferDetailsFindOffer == null) {
                    makePurchase$fireError(onFailed, "Failed to find offer " + offerId + " for Qonversion product " + product.getQonversionID());
                    return;
                }
                qProductOfferDetails = qProductOfferDetailsFindOffer;
            } else {
                defaultSubscriptionOfferDetails = storeDetails.getDefaultSubscriptionOfferDetails();
                if (defaultSubscriptionOfferDetails == null) {
                    makePurchase$fireError(onFailed, "No offer found for purchasing Qonversion subscription product " + product.getQonversionID());
                    return;
                }
            }
            qProductOfferDetails = defaultSubscriptionOfferDetails;
        }
        BillingFlowParams.ProductDetailsParams.Builder productDetails = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(storeDetails.getOriginalProductDetails());
        Intrinsics.checkNotNullExpressionValue(productDetails, "setProductDetails(...)");
        BillingFlowParams.ProductDetailsParams productDetailsParamsBuild = applyOffer(productDetails, qProductOfferDetails).build();
        Intrinsics.checkNotNullExpressionValue(productDetailsParamsBuild, "build(...)");
        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(CollectionsKt.listOf(productDetailsParamsBuild));
        Intrinsics.checkNotNullExpressionValue(productDetailsParamsList, "setProductDetailsParamsList(...)");
        BillingFlowParams billingFlowParamsBuild = setSubscriptionUpdateParams(productDetailsParamsList, updatePurchaseInfo).build();
        Intrinsics.checkNotNullExpressionValue(billingFlowParamsBuild, "build(...)");
        launchBillingFlow(activity, billingFlowParamsBuild);
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchaseHistoryForProduct(QProduct product, Function2<? super BillingResult, ? super PurchaseHistoryRecord, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        QProductStoreDetails storeDetails = product.getStoreDetails();
        if (storeDetails == null) {
            return;
        }
        String productType = storeDetails.getOriginalProductDetails().getProductType();
        Intrinsics.checkNotNullExpressionValue(productType, "getProductType(...)");
        getBillingClientHolder().withReadyClient(new C01391(storeDetails, productType, onCompleted));
    }

    /* compiled from: BillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchaseHistoryForProduct$1, reason: invalid class name and case insensitive filesystem */
    static final class C01391 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ Function2<BillingResult, PurchaseHistoryRecord, Unit> $onCompleted;
        final /* synthetic */ String $productType;
        final /* synthetic */ QProductStoreDetails $storeDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01391(QProductStoreDetails qProductStoreDetails, String str, Function2<? super BillingResult, ? super PurchaseHistoryRecord, Unit> function2) {
            super(1);
            this.$storeDetails = qProductStoreDetails;
            this.$productType = str;
            this.$onCompleted = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            invoke2(billingClient);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BillingClient withReadyClient) {
            Intrinsics.checkNotNullParameter(withReadyClient, "$this$withReadyClient");
            BillingClientWrapper.this.getLogger().debug("queryPurchaseHistoryForProduct() -> Querying purchase history for " + this.$storeDetails.getProductId() + " with type " + this.$productType);
            QueryPurchaseHistoryParams queryPurchaseHistoryParamsBuild = QueryPurchaseHistoryParams.newBuilder().setProductType(this.$productType).build();
            Intrinsics.checkNotNullExpressionValue(queryPurchaseHistoryParamsBuild, "build(...)");
            final Function2<BillingResult, PurchaseHistoryRecord, Unit> function2 = this.$onCompleted;
            final QProductStoreDetails qProductStoreDetails = this.$storeDetails;
            withReadyClient.queryPurchaseHistoryAsync(queryPurchaseHistoryParamsBuild, new PurchaseHistoryResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
                public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                    BillingClientWrapper.C01391.invoke$lambda$1(function2, qProductStoreDetails, billingResult, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void invoke$lambda$1(Function2 onCompleted, QProductStoreDetails storeDetails, BillingResult billingResult, List list) {
            Intrinsics.checkNotNullParameter(onCompleted, "$onCompleted");
            Intrinsics.checkNotNullParameter(storeDetails, "$storeDetails");
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            PurchaseHistoryRecord purchaseHistoryRecord = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) next;
                    String productId = storeDetails.getProductId();
                    Intrinsics.checkNotNull(purchaseHistoryRecord2);
                    if (Intrinsics.areEqual(productId, UtilsKt.getProductId(purchaseHistoryRecord2))) {
                        purchaseHistoryRecord = next;
                        break;
                    }
                }
                purchaseHistoryRecord = purchaseHistoryRecord;
            }
            onCompleted.invoke(billingResult, purchaseHistoryRecord);
        }
    }

    /* compiled from: BillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    static final class C01381 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ Function2<BillingResult, List<? extends PurchaseHistoryRecord>, Unit> $onCompleted;
        final /* synthetic */ QStoreProductType $productType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01381(QStoreProductType qStoreProductType, Function2<? super BillingResult, ? super List<? extends PurchaseHistoryRecord>, Unit> function2) {
            super(1);
            this.$productType = qStoreProductType;
            this.$onCompleted = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            invoke2(billingClient);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BillingClient withReadyClient) {
            Intrinsics.checkNotNullParameter(withReadyClient, "$this$withReadyClient");
            QueryPurchaseHistoryParams queryPurchaseHistoryParamsBuild = QueryPurchaseHistoryParams.newBuilder().setProductType(this.$productType.toProductType()).build();
            Intrinsics.checkNotNullExpressionValue(queryPurchaseHistoryParamsBuild, "build(...)");
            final Function2<BillingResult, List<? extends PurchaseHistoryRecord>, Unit> function2 = this.$onCompleted;
            withReadyClient.queryPurchaseHistoryAsync(queryPurchaseHistoryParamsBuild, new PurchaseHistoryResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchaseHistory$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
                public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                    BillingClientWrapper.C01381.invoke$lambda$0(function2, billingResult, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(Function2 tmp0, BillingResult p0, List list) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            Intrinsics.checkNotNullParameter(p0, "p0");
            tmp0.invoke(p0, list);
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchaseHistory(QStoreProductType productType, Function2<? super BillingResult, ? super List<? extends PurchaseHistoryRecord>, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        getBillingClientHolder().withReadyClient(new C01381(productType, onCompleted));
    }

    /* compiled from: BillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C01401 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ Function1<List<? extends Purchase>, Unit> $onCompleted;
        final /* synthetic */ Function1<BillingError, Unit> $onFailed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01401(Function1<? super BillingError, Unit> function1, Function1<? super List<? extends Purchase>, Unit> function12) {
            super(1);
            this.$onFailed = function1;
            this.$onCompleted = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            invoke2(billingClient);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final BillingClient withReadyClient) {
            Intrinsics.checkNotNullParameter(withReadyClient, "$this$withReadyClient");
            QueryPurchasesParams queryPurchasesParamsBuild = QueryPurchasesParams.newBuilder().setProductType("subs").build();
            Intrinsics.checkNotNullExpressionValue(queryPurchasesParamsBuild, "build(...)");
            final BillingClientWrapper billingClientWrapper = BillingClientWrapper.this;
            final Function1<BillingError, Unit> function1 = this.$onFailed;
            final Function1<List<? extends Purchase>, Unit> function12 = this.$onCompleted;
            withReadyClient.queryPurchasesAsync(queryPurchasesParamsBuild, new PurchasesResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    BillingClientWrapper.C01401.invoke$lambda$3(billingClientWrapper, function1, withReadyClient, function12, billingResult, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(final BillingClientWrapper this$0, final Function1 onFailed, BillingClient this_withReadyClient, final Function1 onCompleted, final BillingResult subsResult, final List activeSubs) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(onFailed, "$onFailed");
            Intrinsics.checkNotNullParameter(this_withReadyClient, "$this_withReadyClient");
            Intrinsics.checkNotNullParameter(onCompleted, "$onCompleted");
            Intrinsics.checkNotNullParameter(subsResult, "subsResult");
            Intrinsics.checkNotNullParameter(activeSubs, "activeSubs");
            if (!UtilsKt.isOk(subsResult)) {
                this$0.handlePurchasesQueryError(subsResult, "subscription", onFailed);
                return;
            }
            QueryPurchasesParams queryPurchasesParamsBuild = QueryPurchasesParams.newBuilder().setProductType("inapp").build();
            Intrinsics.checkNotNullExpressionValue(queryPurchasesParamsBuild, "build(...)");
            this_withReadyClient.queryPurchasesAsync(queryPurchasesParamsBuild, new PurchasesResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    BillingClientWrapper.C01401.invoke$lambda$3$lambda$2(this$0, subsResult, onFailed, activeSubs, onCompleted, billingResult, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3$lambda$2(BillingClientWrapper this$0, BillingResult subsResult, Function1 onFailed, List activeSubs, Function1 onCompleted, BillingResult inAppsResult, List unconsumedInApp) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(subsResult, "$subsResult");
            Intrinsics.checkNotNullParameter(onFailed, "$onFailed");
            Intrinsics.checkNotNullParameter(activeSubs, "$activeSubs");
            Intrinsics.checkNotNullParameter(onCompleted, "$onCompleted");
            Intrinsics.checkNotNullParameter(inAppsResult, "inAppsResult");
            Intrinsics.checkNotNullParameter(unconsumedInApp, "unconsumedInApp");
            if (!UtilsKt.isOk(inAppsResult)) {
                this$0.handlePurchasesQueryError(subsResult, "in-app", onFailed);
                return;
            }
            List<Purchase> listPlus = CollectionsKt.plus((Collection) activeSubs, (Iterable) unconsumedInApp);
            onCompleted.invoke(listPlus);
            Unit unit = null;
            if (listPlus.isEmpty()) {
                listPlus = null;
            }
            if (listPlus != null) {
                for (Purchase purchase : listPlus) {
                    Logger logger = this$0.getLogger();
                    Intrinsics.checkNotNull(purchase);
                    logger.debug("queryPurchases() -> purchases cache is retrieved " + UtilsKt.getDescription(purchase));
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this$0.getLogger().release("queryPurchases() -> purchases cache is empty.");
            }
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchases(Function1<? super BillingError, Unit> onFailed, Function1<? super List<? extends Purchase>, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        getBillingClientHolder().withReadyClient(new C01401(onFailed, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void getStoreProductType(final String storeId, final Function1<? super BillingError, Unit> onFailed, final Function1<? super QStoreProductType, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        ProductDetails productDetails = this.productDetails.get(storeId);
        if (productDetails != null) {
            QStoreProductType.Companion companion = QStoreProductType.INSTANCE;
            String productType = productDetails.getProductType();
            Intrinsics.checkNotNullExpressionValue(productType, "getProductType(...)");
            onSuccess.invoke(companion.fromProductType(productType));
            return;
        }
        loadProducts(CollectionsKt.listOf(storeId), onFailed, new Function1<List<? extends ProductDetails>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper.getStoreProductType.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductDetails> list) {
                invoke2((List<ProductDetails>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<ProductDetails> details) {
                Intrinsics.checkNotNullParameter(details, "details");
                ProductDetails productDetails2 = (ProductDetails) CollectionsKt.firstOrNull((List) details);
                Unit unit = null;
                if (productDetails2 != null) {
                    if (!Intrinsics.areEqual(productDetails2.getProductId(), storeId)) {
                        productDetails2 = null;
                    }
                    if (productDetails2 != null) {
                        Function1<QStoreProductType, Unit> function1 = onSuccess;
                        QStoreProductType.Companion companion2 = QStoreProductType.INSTANCE;
                        String productType2 = productDetails2.getProductType();
                        Intrinsics.checkNotNullExpressionValue(productType2, "getProductType(...)");
                        function1.invoke(companion2.fromProductType(productType2));
                        unit = Unit.INSTANCE;
                    }
                }
                if (unit == null) {
                    onFailed.invoke(new BillingError(4, "Product not found"));
                }
            }
        });
    }

    private final void loadProducts(final List<String> productIds, final Function1<? super BillingError, Unit> onFailed, final Function1<? super List<ProductDetails>, Unit> onCompleted) {
        queryProductDetailsAsync("subs", productIds, new Function1<List<? extends ProductDetails>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper.loadProducts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductDetails> list) {
                invoke2((List<ProductDetails>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final List<ProductDetails> subscriptionProductDetails) {
                Intrinsics.checkNotNullParameter(subscriptionProductDetails, "subscriptionProductDetails");
                List<ProductDetails> list = subscriptionProductDetails;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProductDetails) it.next()).getProductId());
                }
                List listMinus = CollectionsKt.minus((Iterable) productIds, (Iterable) CollectionsKt.toSet(arrayList));
                if (!listMinus.isEmpty()) {
                    BillingClientWrapper billingClientWrapper = this;
                    final Function1<List<ProductDetails>, Unit> function1 = onCompleted;
                    billingClientWrapper.queryProductDetailsAsync("inapp", listMinus, new Function1<List<? extends ProductDetails>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper.loadProducts.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductDetails> list2) {
                            invoke2((List<ProductDetails>) list2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<ProductDetails> inAppProductDetails) {
                            Intrinsics.checkNotNullParameter(inAppProductDetails, "inAppProductDetails");
                            function1.invoke(CollectionsKt.plus((Collection) subscriptionProductDetails, (Iterable) inAppProductDetails));
                        }
                    }, onFailed);
                    return;
                }
                onCompleted.invoke(subscriptionProductDetails);
            }
        }, onFailed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryProductDetailsAsync(String productType, List<String> productIds, Function1<? super List<ProductDetails>, Unit> onQuerySkuCompleted, Function1<? super BillingError, Unit> onQuerySkuFailed) {
        List<String> list = productIds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(productType).build());
        }
        QueryProductDetailsParams queryProductDetailsParamsBuild = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        Intrinsics.checkNotNullExpressionValue(queryProductDetailsParamsBuild, "build(...)");
        getBillingClientHolder().withReadyClient(new C01371(queryProductDetailsParamsBuild, this, productIds, onQuerySkuCompleted, onQuerySkuFailed));
    }

    /* compiled from: BillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryProductDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    static final class C01371 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ Function1<List<ProductDetails>, Unit> $onQuerySkuCompleted;
        final /* synthetic */ Function1<BillingError, Unit> $onQuerySkuFailed;
        final /* synthetic */ QueryProductDetailsParams $params;
        final /* synthetic */ List<String> $productIds;
        final /* synthetic */ BillingClientWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01371(QueryProductDetailsParams queryProductDetailsParams, BillingClientWrapper billingClientWrapper, List<String> list, Function1<? super List<ProductDetails>, Unit> function1, Function1<? super BillingError, Unit> function12) {
            super(1);
            this.$params = queryProductDetailsParams;
            this.this$0 = billingClientWrapper;
            this.$productIds = list;
            this.$onQuerySkuCompleted = function1;
            this.$onQuerySkuFailed = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            invoke2(billingClient);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BillingClient withReadyClient) {
            Intrinsics.checkNotNullParameter(withReadyClient, "$this$withReadyClient");
            QueryProductDetailsParams queryProductDetailsParams = this.$params;
            final BillingClientWrapper billingClientWrapper = this.this$0;
            final List<String> list = this.$productIds;
            final Function1<List<ProductDetails>, Unit> function1 = this.$onQuerySkuCompleted;
            final Function1<BillingError, Unit> function12 = this.$onQuerySkuFailed;
            withReadyClient.queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapper$queryProductDetailsAsync$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.ProductDetailsResponseListener
                public final void onProductDetailsResponse(BillingResult billingResult, List list2) {
                    BillingClientWrapper.C01371.invoke$lambda$0(billingClientWrapper, list, function1, function12, billingResult, list2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(BillingClientWrapper this$0, List productIds, Function1 onQuerySkuCompleted, Function1 onQuerySkuFailed, BillingResult billingResult, List productDetailsList) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(productIds, "$productIds");
            Intrinsics.checkNotNullParameter(onQuerySkuCompleted, "$onQuerySkuCompleted");
            Intrinsics.checkNotNullParameter(onQuerySkuFailed, "$onQuerySkuFailed");
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            Intrinsics.checkNotNullParameter(productDetailsList, "productDetailsList");
            if (UtilsKt.isOk(billingResult)) {
                this$0.logProductDetails(productDetailsList, productIds);
                onQuerySkuCompleted.invoke(productDetailsList);
            } else {
                onQuerySkuFailed.invoke(new BillingError(billingResult.getResponseCode(), "Failed to fetch products. " + UtilsKt.getDescription(billingResult)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logProductDetails(List<ProductDetails> productDetailsList, List<String> productIds) {
        Unit unit = null;
        if (productDetailsList.isEmpty()) {
            productDetailsList = null;
        }
        if (productDetailsList != null) {
            Iterator<T> it = productDetailsList.iterator();
            while (it.hasNext()) {
                getLogger().debug("queryProductDetailsAsync() -> " + ((ProductDetails) it.next()));
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            getLogger().warn("queryProductDetailsAsync() -> ProductDetails list for " + productIds + " is empty.");
        }
    }

    private final BillingFlowParams.ProductDetailsParams.Builder applyOffer(BillingFlowParams.ProductDetailsParams.Builder builder, QProductOfferDetails qProductOfferDetails) {
        if (qProductOfferDetails != null) {
            builder.setOfferToken(qProductOfferDetails.getOfferToken());
        }
        return builder;
    }
}
