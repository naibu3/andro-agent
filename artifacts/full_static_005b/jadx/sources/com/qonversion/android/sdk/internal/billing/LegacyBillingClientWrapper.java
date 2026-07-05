package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper;
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

/* compiled from: LegacyBillingClientWrapper.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004H\u0016JV\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u00142!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00120\u0014H\u0016JH\u0010\u001c\u001a\u00020\u00122\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u00142\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0004\u0012\u00020\u00120\u0014H\u0002J(\u0010!\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\u0010\u0010#\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u001eH\u0002J^\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u00032\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u0014H\u0016¢\u0006\u0002\u0010.J2\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u001a2 \u00101\u001a\u001c\u0012\u0004\u0012\u000203\u0012\f\u0012\n\u0012\u0004\u0012\u000204\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001202H\u0016J,\u00105\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u000203\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u001202H\u0016JT\u00106\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u00142'\u00101\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002070\u001e¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00120\u0014H\u0016JP\u00109\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00032\u0010\u0010#\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u001e2\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001e\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0002JK\u0010:\u001a\u00020\u00122\u0010\u0010;\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u001e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120=H\u0016R$\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\fX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000e¨\u0006>"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;", "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "", "Lcom/qonversion/android/sdk/internal/billing/LegacyStoreId;", "Lcom/android/billingclient/api/SkuDetails;", "billingClientHolder", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "skuDetails", "", "getSkuDetails$annotations", "()V", "getStoreData", "storeId", "getStoreProductType", "", "onFailed", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onSuccess", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "type", "loadProducts", "productIds", "", "onQuerySkuFailed", "onQuerySkuCompleted", "logSkuDetails", "skuDetailsList", "skuList", "makePurchase", "activity", "Landroid/app/Activity;", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "offerId", "applyOffer", "", "updatePurchaseInfo", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Lkotlin/jvm/functions/Function1;)V", "queryPurchaseHistory", "productType", "onCompleted", "Lkotlin/Function2;", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "queryPurchaseHistoryForProduct", "queryPurchases", "Lcom/android/billingclient/api/Purchase;", "purchases", "querySkuDetailsAsync", "withStoreDataLoaded", "storeIds", "onReady", "Lkotlin/Function0;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LegacyBillingClientWrapper extends BillingClientWrapperBase implements IBillingClientWrapper<String, SkuDetails> {
    private Map<String, ? extends SkuDetails> skuDetails;

    private static /* synthetic */ void getSkuDetails$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyBillingClientWrapper(BillingClientHolder billingClientHolder, Logger logger) {
        super(billingClientHolder, logger);
        Intrinsics.checkNotNullParameter(billingClientHolder, "billingClientHolder");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.skuDetails = MapsKt.emptyMap();
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void withStoreDataLoaded(List<? extends String> storeIds, Function1<? super BillingError, Unit> onFailed, final Function0<Unit> onReady) {
        Intrinsics.checkNotNullParameter(storeIds, "storeIds");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onReady, "onReady");
        ArrayList arrayList = new ArrayList();
        for (Object obj : storeIds) {
            if (!this.skuDetails.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            onReady.invoke();
        } else {
            loadProducts(arrayList2, onFailed, new Function1<List<? extends SkuDetails>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper.withStoreDataLoaded.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends SkuDetails> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends SkuDetails> details) {
                    Intrinsics.checkNotNullParameter(details, "details");
                    List<? extends SkuDetails> list = details;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (Object obj2 : list) {
                        linkedHashMap.put(((SkuDetails) obj2).getSku(), obj2);
                    }
                    LegacyBillingClientWrapper legacyBillingClientWrapper = LegacyBillingClientWrapper.this;
                    legacyBillingClientWrapper.skuDetails = MapsKt.plus(legacyBillingClientWrapper.skuDetails, MapsKt.toMutableMap(linkedHashMap));
                    onReady.invoke();
                }
            });
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public SkuDetails getStoreData(String storeId) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        return this.skuDetails.get(storeId);
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void makePurchase(Activity activity, QProduct product, String offerId, Boolean applyOffer, UpdatePurchaseInfo updatePurchaseInfo, Function1<? super BillingError, Unit> onFailed) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        SkuDetails skuDetail = product.getSkuDetail();
        if (skuDetail == null) {
            return;
        }
        getLogger().debug("makePurchase() -> Purchasing the sku: " + skuDetail.getSku());
        BillingFlowParams.Builder skuDetails = BillingFlowParams.newBuilder().setSkuDetails(skuDetail);
        Intrinsics.checkNotNullExpressionValue(skuDetails, "setSkuDetails(...)");
        BillingFlowParams billingFlowParamsBuild = setSubscriptionUpdateParams(skuDetails, updatePurchaseInfo).build();
        Intrinsics.checkNotNullExpressionValue(billingFlowParamsBuild, "build(...)");
        launchBillingFlow(activity, billingFlowParamsBuild);
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchaseHistoryForProduct(QProduct product, Function2<? super BillingResult, ? super PurchaseHistoryRecord, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        SkuDetails skuDetail = product.getSkuDetail();
        if (skuDetail == null) {
            return;
        }
        getBillingClientHolder().withReadyClient(new C01451(skuDetail, onCompleted));
    }

    /* compiled from: LegacyBillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1, reason: invalid class name and case insensitive filesystem */
    static final class C01451 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ Function2<BillingResult, PurchaseHistoryRecord, Unit> $onCompleted;
        final /* synthetic */ SkuDetails $skuDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01451(SkuDetails skuDetails, Function2<? super BillingResult, ? super PurchaseHistoryRecord, Unit> function2) {
            super(1);
            this.$skuDetails = skuDetails;
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
            LegacyBillingClientWrapper.this.getLogger().debug("queryPurchaseHistoryForProduct() -> Querying purchase history for " + this.$skuDetails.getSku() + " with type " + this.$skuDetails.getType());
            String type = this.$skuDetails.getType();
            final Function2<BillingResult, PurchaseHistoryRecord, Unit> function2 = this.$onCompleted;
            final SkuDetails skuDetails = this.$skuDetails;
            withReadyClient.queryPurchaseHistoryAsync(type, new PurchaseHistoryResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
                public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                    LegacyBillingClientWrapper.C01451.invoke$lambda$1(function2, skuDetails, billingResult, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void invoke$lambda$1(Function2 onCompleted, SkuDetails skuDetails, BillingResult billingResult, List list) {
            Intrinsics.checkNotNullParameter(onCompleted, "$onCompleted");
            Intrinsics.checkNotNullParameter(skuDetails, "$skuDetails");
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            PurchaseHistoryRecord purchaseHistoryRecord = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String sku = skuDetails.getSku();
                    ArrayList<String> skus = ((PurchaseHistoryRecord) next).getSkus();
                    Intrinsics.checkNotNullExpressionValue(skus, "getSkus(...)");
                    if (Intrinsics.areEqual(sku, CollectionsKt.firstOrNull((List) skus))) {
                        purchaseHistoryRecord = next;
                        break;
                    }
                }
                purchaseHistoryRecord = purchaseHistoryRecord;
            }
            onCompleted.invoke(billingResult, purchaseHistoryRecord);
        }
    }

    /* compiled from: LegacyBillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    static final class C01441 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ Function2<BillingResult, List<? extends PurchaseHistoryRecord>, Unit> $onCompleted;
        final /* synthetic */ QStoreProductType $productType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01441(QStoreProductType qStoreProductType, Function2<? super BillingResult, ? super List<? extends PurchaseHistoryRecord>, Unit> function2) {
            super(1);
            this.$productType = qStoreProductType;
            this.$onCompleted = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            invoke2(billingClient);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(Function2 tmp0, BillingResult p0, List list) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            Intrinsics.checkNotNullParameter(p0, "p0");
            tmp0.invoke(p0, list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BillingClient withReadyClient) {
            Intrinsics.checkNotNullParameter(withReadyClient, "$this$withReadyClient");
            String skuType = this.$productType.toSkuType();
            final Function2<BillingResult, List<? extends PurchaseHistoryRecord>, Unit> function2 = this.$onCompleted;
            withReadyClient.queryPurchaseHistoryAsync(skuType, new PurchaseHistoryResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchaseHistory$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
                public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                    LegacyBillingClientWrapper.C01441.invoke$lambda$0(function2, billingResult, list);
                }
            });
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void queryPurchaseHistory(QStoreProductType productType, Function2<? super BillingResult, ? super List<? extends PurchaseHistoryRecord>, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        getBillingClientHolder().withReadyClient(new C01441(productType, onCompleted));
    }

    /* compiled from: LegacyBillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C01461 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ Function1<List<? extends Purchase>, Unit> $onCompleted;
        final /* synthetic */ Function1<BillingError, Unit> $onFailed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01461(Function1<? super BillingError, Unit> function1, Function1<? super List<? extends Purchase>, Unit> function12) {
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
            final LegacyBillingClientWrapper legacyBillingClientWrapper = LegacyBillingClientWrapper.this;
            final Function1<BillingError, Unit> function1 = this.$onFailed;
            final Function1<List<? extends Purchase>, Unit> function12 = this.$onCompleted;
            withReadyClient.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    LegacyBillingClientWrapper.C01461.invoke$lambda$3(legacyBillingClientWrapper, function1, withReadyClient, function12, billingResult, list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(final LegacyBillingClientWrapper this$0, final Function1 onFailed, BillingClient this_withReadyClient, final Function1 onCompleted, final BillingResult subsResult, final List activeSubs) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(onFailed, "$onFailed");
            Intrinsics.checkNotNullParameter(this_withReadyClient, "$this_withReadyClient");
            Intrinsics.checkNotNullParameter(onCompleted, "$onCompleted");
            Intrinsics.checkNotNullParameter(subsResult, "subsResult");
            Intrinsics.checkNotNullParameter(activeSubs, "activeSubs");
            if (!UtilsKt.isOk(subsResult)) {
                this$0.handlePurchasesQueryError(subsResult, "subscription", onFailed);
            } else {
                this_withReadyClient.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda0
                    @Override // com.android.billingclient.api.PurchasesResponseListener
                    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                        LegacyBillingClientWrapper.C01461.invoke$lambda$3$lambda$2(this$0, subsResult, onFailed, activeSubs, onCompleted, billingResult, list);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3$lambda$2(LegacyBillingClientWrapper this$0, BillingResult subsResult, Function1 onFailed, List activeSubs, Function1 onCompleted, BillingResult inAppsResult, List unconsumedInApp) {
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
        getBillingClientHolder().withReadyClient(new C01461(onFailed, onCompleted));
    }

    @Override // com.qonversion.android.sdk.internal.billing.IBillingClientWrapper
    public void getStoreProductType(final String storeId, final Function1<? super BillingError, Unit> onFailed, final Function1<? super QStoreProductType, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        SkuDetails skuDetails = this.skuDetails.get(storeId);
        if (skuDetails != null) {
            QStoreProductType.Companion companion = QStoreProductType.INSTANCE;
            String type = skuDetails.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            onSuccess.invoke(companion.fromSkuType(type));
            return;
        }
        loadProducts(CollectionsKt.listOf(storeId), onFailed, new Function1<List<? extends SkuDetails>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper.getStoreProductType.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends SkuDetails> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends SkuDetails> details) {
                Intrinsics.checkNotNullParameter(details, "details");
                SkuDetails skuDetails2 = (SkuDetails) CollectionsKt.firstOrNull((List) details);
                Unit unit = null;
                if (skuDetails2 != null) {
                    if (!Intrinsics.areEqual(skuDetails2.getSku(), storeId)) {
                        skuDetails2 = null;
                    }
                    if (skuDetails2 != null) {
                        Function1<QStoreProductType, Unit> function1 = onSuccess;
                        QStoreProductType.Companion companion2 = QStoreProductType.INSTANCE;
                        String type2 = skuDetails2.getType();
                        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                        function1.invoke(companion2.fromSkuType(type2));
                        unit = Unit.INSTANCE;
                    }
                }
                if (unit == null) {
                    onFailed.invoke(new BillingError(4, "Product not found"));
                }
            }
        });
    }

    private final void loadProducts(final List<String> productIds, final Function1<? super BillingError, Unit> onQuerySkuFailed, final Function1<? super List<? extends SkuDetails>, Unit> onQuerySkuCompleted) {
        querySkuDetailsAsync("subs", productIds, new Function1<List<? extends SkuDetails>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper.loadProducts.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends SkuDetails> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final List<? extends SkuDetails> skuDetailsSubs) {
                Intrinsics.checkNotNullParameter(skuDetailsSubs, "skuDetailsSubs");
                List<? extends SkuDetails> list = skuDetailsSubs;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SkuDetails) it.next()).getSku());
                }
                List listMinus = CollectionsKt.minus((Iterable) productIds, (Iterable) CollectionsKt.toSet(arrayList));
                if (!listMinus.isEmpty()) {
                    LegacyBillingClientWrapper legacyBillingClientWrapper = this;
                    final Function1<List<? extends SkuDetails>, Unit> function1 = onQuerySkuCompleted;
                    legacyBillingClientWrapper.querySkuDetailsAsync("inapp", listMinus, new Function1<List<? extends SkuDetails>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper.loadProducts.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends SkuDetails> list2) {
                            invoke2(list2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<? extends SkuDetails> skuDetailsInApp) {
                            Intrinsics.checkNotNullParameter(skuDetailsInApp, "skuDetailsInApp");
                            function1.invoke(CollectionsKt.plus((Collection) skuDetailsSubs, (Iterable) skuDetailsInApp));
                        }
                    }, onQuerySkuFailed);
                    return;
                }
                onQuerySkuCompleted.invoke(skuDetailsSubs);
            }
        }, onQuerySkuFailed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void querySkuDetailsAsync(String productType, List<String> skuList, Function1<? super List<? extends SkuDetails>, Unit> onQuerySkuCompleted, Function1<? super BillingError, Unit> onQuerySkuFailed) {
        SkuDetailsParams skuDetailsParamsBuild = SkuDetailsParams.newBuilder().setType(productType).setSkusList(skuList).build();
        Intrinsics.checkNotNullExpressionValue(skuDetailsParamsBuild, "build(...)");
        getBillingClientHolder().withReadyClient(new C01471(skuDetailsParamsBuild, this, skuList, onQuerySkuCompleted, onQuerySkuFailed));
    }

    /* compiled from: LegacyBillingClientWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$querySkuDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    static final class C01471 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ Function1<List<? extends SkuDetails>, Unit> $onQuerySkuCompleted;
        final /* synthetic */ Function1<BillingError, Unit> $onQuerySkuFailed;
        final /* synthetic */ SkuDetailsParams $params;
        final /* synthetic */ List<String> $skuList;
        final /* synthetic */ LegacyBillingClientWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01471(SkuDetailsParams skuDetailsParams, LegacyBillingClientWrapper legacyBillingClientWrapper, List<String> list, Function1<? super List<? extends SkuDetails>, Unit> function1, Function1<? super BillingError, Unit> function12) {
            super(1);
            this.$params = skuDetailsParams;
            this.this$0 = legacyBillingClientWrapper;
            this.$skuList = list;
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
            SkuDetailsParams skuDetailsParams = this.$params;
            final LegacyBillingClientWrapper legacyBillingClientWrapper = this.this$0;
            final List<String> list = this.$skuList;
            final Function1<List<? extends SkuDetails>, Unit> function1 = this.$onQuerySkuCompleted;
            final Function1<BillingError, Unit> function12 = this.$onQuerySkuFailed;
            withReadyClient.querySkuDetailsAsync(skuDetailsParams, new SkuDetailsResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.LegacyBillingClientWrapper$querySkuDetailsAsync$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.SkuDetailsResponseListener
                public final void onSkuDetailsResponse(BillingResult billingResult, List list2) {
                    LegacyBillingClientWrapper.C01471.invoke$lambda$0(legacyBillingClientWrapper, list, function1, function12, billingResult, list2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(LegacyBillingClientWrapper this$0, List skuList, Function1 onQuerySkuCompleted, Function1 onQuerySkuFailed, BillingResult billingResult, List list) {
            String str;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(skuList, "$skuList");
            Intrinsics.checkNotNullParameter(onQuerySkuCompleted, "$onQuerySkuCompleted");
            Intrinsics.checkNotNullParameter(onQuerySkuFailed, "$onQuerySkuFailed");
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            if (UtilsKt.isOk(billingResult) && list != null) {
                this$0.logSkuDetails(list, skuList);
                onQuerySkuCompleted.invoke(list);
                return;
            }
            if (list != null) {
                str = "Failed to fetch products. ";
            } else {
                str = "Failed to fetch products. SkuDetails list for " + skuList + " is null. ";
            }
            onQuerySkuFailed.invoke(new BillingError(billingResult.getResponseCode(), str + " " + UtilsKt.getDescription(billingResult)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logSkuDetails(List<? extends SkuDetails> skuDetailsList, List<String> skuList) {
        Unit unit = null;
        if (skuDetailsList.isEmpty()) {
            skuDetailsList = null;
        }
        if (skuDetailsList != null) {
            Iterator<T> it = skuDetailsList.iterator();
            while (it.hasNext()) {
                getLogger().debug("querySkuDetailsAsync() -> " + ((SkuDetails) it.next()));
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            getLogger().warn("querySkuDetailsAsync() -> SkuDetails list for " + skuList + " is empty.");
        }
    }
}
