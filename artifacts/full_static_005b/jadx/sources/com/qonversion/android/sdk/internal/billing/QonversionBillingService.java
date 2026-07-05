package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import android.os.Handler;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.internal.billing.BillingClientHolder;
import com.qonversion.android.sdk.internal.dto.ProductStoreId;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternalEnriched;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionBillingService.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001VB?\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010#\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0016\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0%H\u0016J\u0016\u0010*\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0%H\u0016Jb\u0010,\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0%2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u001a0\u00152'\u0010/\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020!0%¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016J\u001e\u00100\u001a\u00020\u001a2\u0014\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001a0\u0015H\u0002J\b\u00102\u001a\u00020\u001aH\u0002J$\u00103\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u0002052\f\u0010$\u001a\b\u0012\u0004\u0012\u0002060%H\u0002JV\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001d2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u001a0\u00152!\u00109\u001a\u001d\u0012\u0013\u0012\u001105¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016J=\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020=2\u0006\u0010 \u001a\u00020!2\b\u0010>\u001a\u0004\u0018\u00010\u001d2\b\u0010?\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0002\u0010BJ\b\u0010C\u001a\u00020\u001aH\u0016J\u0010\u0010D\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u0016H\u0016J \u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020G2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010%H\u0016J\u0018\u0010H\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020=2\u0006\u0010I\u001a\u00020JH\u0016J>\u0010K\u001a\u00020\u001a2\u0006\u00104\u001a\u0002052\u0018\u0010L\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%\u0012\u0004\u0012\u00020\u001a0\u00152\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0\u0015H\u0002JT\u0010N\u001a\u00020\u001a2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u001a0\u00152'\u0010O\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020)0%¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016JT\u0010P\u001a\u00020\u001a2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u001a0\u00152'\u0010O\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020&0%¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016JC\u0010Q\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020=2\u0006\u0010 \u001a\u00020!2\b\u0010>\u001a\u0004\u0018\u00010\u001d2\b\u0010?\u001a\u0004\u0018\u00010\u000b2\u0006\u0010R\u001a\u00020!2\b\u0010S\u001a\u0004\u0018\u00010TH\u0002¢\u0006\u0002\u0010UR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\u0013\u001a%\u0012!\u0012\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;", "Lcom/qonversion/android/sdk/internal/billing/BillingService;", "mainHandler", "Landroid/os/Handler;", "purchasesListener", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "isAnalyticsMode", "", "billingClientHolder", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "billingClientWrapper", "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;", "legacyBillingClientWrapper", "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;", "(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/logger/Logger;ZLcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)V", "requestsQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "billingSetupError", "", "acknowledge", "purchaseToken", "", "chooseBillingClientWrapperForProductPurchase", "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;", "product", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "consume", "consumeHistoryRecords", "historyRecords", "", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "consumePurchases", "purchases", "Lcom/android/billingclient/api/Purchase;", "enrichStoreData", "products", "enrichStoreDataAsync", "onFailed", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onEnriched", "executeOnMainThread", "request", "executeRequestsFromQueue", "getPurchaseHistoryFromHistoryRecords", "productType", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "getStoreProductType", "storeId", "onSuccess", "type", "makePurchase", "activity", "Landroid/app/Activity;", "offerId", "applyOffer", "updatePurchaseInfo", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V", "onBillingClientConnected", "onBillingClientUnavailable", "onPurchasesUpdated", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchase", "purchaseModel", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "queryPurchaseHistoryAsync", "onQueryHistoryCompleted", "onQueryHistoryFailed", "queryPurchases", "onCompleted", "queryPurchasesHistory", "updatePurchase", "oldProduct", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V", "PurchasesListener", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QonversionBillingService implements PurchasesUpdatedListener, BillingClientHolder.ConnectionListener, BillingService {
    private final BillingClientHolder billingClientHolder;
    private final BillingClientWrapper billingClientWrapper;
    private final boolean isAnalyticsMode;
    private final LegacyBillingClientWrapper legacyBillingClientWrapper;
    private final Logger logger;
    private final Handler mainHandler;
    private final PurchasesListener purchasesListener;
    private final ConcurrentLinkedQueue<Function1<BillingError, Unit>> requestsQueue;

    /* compiled from: QonversionBillingService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QStoreProductType.values().length];
            try {
                iArr[QStoreProductType.InApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QStoreProductType.Subscription.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public QonversionBillingService(Handler mainHandler, PurchasesListener purchasesListener, Logger logger, boolean z, BillingClientHolder billingClientHolder, BillingClientWrapper billingClientWrapper, LegacyBillingClientWrapper legacyBillingClientWrapper) {
        Intrinsics.checkNotNullParameter(mainHandler, "mainHandler");
        Intrinsics.checkNotNullParameter(purchasesListener, "purchasesListener");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(billingClientHolder, "billingClientHolder");
        Intrinsics.checkNotNullParameter(billingClientWrapper, "billingClientWrapper");
        Intrinsics.checkNotNullParameter(legacyBillingClientWrapper, "legacyBillingClientWrapper");
        this.mainHandler = mainHandler;
        this.purchasesListener = purchasesListener;
        this.logger = logger;
        this.isAnalyticsMode = z;
        this.billingClientHolder = billingClientHolder;
        this.billingClientWrapper = billingClientWrapper;
        this.legacyBillingClientWrapper = legacyBillingClientWrapper;
        this.requestsQueue = new ConcurrentLinkedQueue<>();
        billingClientHolder.subscribeOnPurchasesUpdates(this);
    }

    /* compiled from: QonversionBillingService.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "", "onPurchasesCompleted", "", "purchases", "", "Lcom/android/billingclient/api/Purchase;", "onPurchasesFailed", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface PurchasesListener {
        void onPurchasesCompleted(List<? extends Purchase> purchases);

        void onPurchasesFailed(BillingError error, List<? extends Purchase> purchases);

        /* compiled from: QonversionBillingService.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class DefaultImpls {
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void onPurchasesFailed$default(PurchasesListener purchasesListener, BillingError billingError, List list, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPurchasesFailed");
                }
                if ((i & 2) != 0) {
                    list = CollectionsKt.emptyList();
                }
                purchasesListener.onPurchasesFailed(billingError, list);
            }
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void enrichStoreDataAsync(final List<QProduct> products, final Function1<? super BillingError, Unit> onFailed, final Function1<? super List<QProduct>, Unit> onEnriched) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onEnriched, "onEnriched");
        List<QProduct> list = products;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((QProduct) it.next()).getStoreID() != null) {
                    executeOnMainThread(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.enrichStoreDataAsync.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                            invoke2(billingError);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(BillingError billingError) {
                            if (billingError != null) {
                                QonversionBillingService.this.logger.error("enrichStoreDataAsync() -> " + billingError);
                                onFailed.invoke(billingError);
                                return;
                            }
                            List<QProduct> list2 = products;
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                String storeID = ((QProduct) it2.next()).getStoreID();
                                if (storeID != null) {
                                    arrayList.add(storeID);
                                }
                            }
                            LegacyBillingClientWrapper legacyBillingClientWrapper = QonversionBillingService.this.legacyBillingClientWrapper;
                            final List<QProduct> list3 = products;
                            final QonversionBillingService qonversionBillingService = QonversionBillingService.this;
                            final Function1<BillingError, Unit> function1 = onFailed;
                            final Function1<List<QProduct>, Unit> function12 = onEnriched;
                            Function1<BillingError, Unit> function13 = new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.enrichStoreDataAsync.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError2) {
                                    invoke2(billingError2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(BillingError it3) {
                                    Intrinsics.checkNotNullParameter(it3, "it");
                                    QonversionBillingService.enrichStoreDataAsync$fetchProductDetails(list3, qonversionBillingService, function1, function12);
                                }
                            };
                            final List<QProduct> list4 = products;
                            final QonversionBillingService qonversionBillingService2 = QonversionBillingService.this;
                            final Function1<BillingError, Unit> function14 = onFailed;
                            final Function1<List<QProduct>, Unit> function15 = onEnriched;
                            legacyBillingClientWrapper.withStoreDataLoaded(arrayList, function13, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.enrichStoreDataAsync.2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    QonversionBillingService.enrichStoreDataAsync$fetchProductDetails(list4, qonversionBillingService2, function14, function15);
                                }
                            });
                        }
                    });
                    return;
                }
            }
        }
        onEnriched.invoke(products);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enrichStoreDataAsync$fetchProductDetails(final List<QProduct> list, final QonversionBillingService qonversionBillingService, Function1<? super BillingError, Unit> function1, final Function1<? super List<QProduct>, Unit> function12) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((QProduct) obj).getStoreID() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<QProduct> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (QProduct qProduct : arrayList2) {
            String storeID = qProduct.getStoreID();
            Intrinsics.checkNotNull(storeID);
            arrayList3.add(new ProductStoreId(storeID, qProduct.getBasePlanID(), null, 4, null));
        }
        qonversionBillingService.billingClientWrapper.withStoreDataLoaded(arrayList3, function1, new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService$enrichStoreDataAsync$fetchProductDetails$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.enrichStoreData(list);
                function12.invoke(list);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void enrichStoreData(List<QProduct> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        for (QProduct qProduct : products) {
            String storeID = qProduct.getStoreID();
            if (storeID != null) {
                qProduct.setSkuDetail(this.legacyBillingClientWrapper.getStoreData(storeID));
                ProductDetails storeData = this.billingClientWrapper.getStoreData(new ProductStoreId(storeID, qProduct.getBasePlanID(), null, 4, null));
                if (storeData != null) {
                    qProduct.setStoreProductDetails$sdk_release(storeData);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchase$handlePurchase(PurchaseModelInternalEnriched purchaseModelInternalEnriched, QonversionBillingService qonversionBillingService, Activity activity) {
        if (purchaseModelInternalEnriched.getOldProduct() != null && UtilsKt.getHasAnyStoreDetails(purchaseModelInternalEnriched.getOldProduct())) {
            QProduct product = purchaseModelInternalEnriched.getProduct();
            QPurchaseOptions options = purchaseModelInternalEnriched.getOptions();
            String offerId = options != null ? options.getOfferId() : null;
            QPurchaseOptions options2 = purchaseModelInternalEnriched.getOptions();
            qonversionBillingService.updatePurchase(activity, product, offerId, options2 != null ? Boolean.valueOf(options2.getApplyOffer()) : null, purchaseModelInternalEnriched.getOldProduct(), purchaseModelInternalEnriched.getUpdatePolicy());
            return;
        }
        QProduct product2 = purchaseModelInternalEnriched.getProduct();
        QPurchaseOptions options3 = purchaseModelInternalEnriched.getOptions();
        String offerId2 = options3 != null ? options3.getOfferId() : null;
        QPurchaseOptions options4 = purchaseModelInternalEnriched.getOptions();
        makePurchase$default(qonversionBillingService, activity, product2, offerId2, options4 != null ? Boolean.valueOf(options4.getApplyOffer()) : null, null, 16, null);
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void purchase(final Activity activity, final PurchaseModelInternalEnriched purchaseModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(purchaseModel, "purchaseModel");
        if (UtilsKt.getHasAnyStoreDetails(purchaseModel.getProduct())) {
            purchase$handlePurchase(purchaseModel, this, activity);
        } else {
            enrichStoreDataAsync(CollectionsKt.listOfNotNull((Object[]) new QProduct[]{purchaseModel.getProduct(), purchaseModel.getOldProduct()}), new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.purchase.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                    invoke2(billingError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BillingError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    PurchasesListener.DefaultImpls.onPurchasesFailed$default(QonversionBillingService.this.purchasesListener, error, null, 2, null);
                }
            }, new Function1<List<? extends QProduct>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.purchase.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends QProduct> list) {
                    invoke2((List<QProduct>) list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<QProduct> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    QonversionBillingService.purchase$handlePurchase(purchaseModel, this, activity);
                }
            });
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void consumePurchases(List<? extends Purchase> purchases) {
        final Purchase purchase;
        final String productId;
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        if (this.isAnalyticsMode) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchases) {
            if (((Purchase) obj).getPurchaseState() == 1) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && (productId = UtilsKt.getProductId((purchase = (Purchase) it.next()))) != null) {
            getStoreProductType(productId, new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService$consumePurchases$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                    invoke2(billingError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BillingError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.this$0.logger.error("Failed to fetch product type for purchase " + productId + " - " + error.getMessage());
                }
            }, new Function1<QStoreProductType, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService$consumePurchases$2$2

                /* compiled from: QonversionBillingService.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[QStoreProductType.values().length];
                        try {
                            iArr[QStoreProductType.InApp.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[QStoreProductType.Subscription.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QStoreProductType qStoreProductType) {
                    invoke2(qStoreProductType);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(QStoreProductType productType) {
                    Intrinsics.checkNotNullParameter(productType, "productType");
                    int i = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
                    if (i == 1) {
                        QonversionBillingService qonversionBillingService = this.this$0;
                        String purchaseToken = purchase.getPurchaseToken();
                        Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
                        qonversionBillingService.consume(purchaseToken);
                        return;
                    }
                    if (i == 2 && !purchase.isAcknowledged()) {
                        QonversionBillingService qonversionBillingService2 = this.this$0;
                        String purchaseToken2 = purchase.getPurchaseToken();
                        Intrinsics.checkNotNullExpressionValue(purchaseToken2, "getPurchaseToken(...)");
                        qonversionBillingService2.acknowledge(purchaseToken2);
                    }
                }
            });
        }
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void consumeHistoryRecords(List<PurchaseHistory> historyRecords) {
        Intrinsics.checkNotNullParameter(historyRecords, "historyRecords");
        if (this.isAnalyticsMode) {
            return;
        }
        for (PurchaseHistory purchaseHistory : historyRecords) {
            int i = WhenMappings.$EnumSwitchMapping$0[purchaseHistory.getType().ordinal()];
            if (i == 1) {
                String purchaseToken = purchaseHistory.getHistoryRecord().getPurchaseToken();
                Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
                consume(purchaseToken);
            } else if (i == 2) {
                String purchaseToken2 = purchaseHistory.getHistoryRecord().getPurchaseToken();
                Intrinsics.checkNotNullExpressionValue(purchaseToken2, "getPurchaseToken(...)");
                acknowledge(purchaseToken2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchasesHistory$fireOnFailed(Function1<? super BillingError, Unit> function1, QonversionBillingService qonversionBillingService, BillingError billingError) {
        function1.invoke(billingError);
        qonversionBillingService.logger.error("queryPurchasesHistory() -> " + billingError);
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void queryPurchasesHistory(final Function1<? super BillingError, Unit> onFailed, final Function1<? super List<PurchaseHistory>, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        queryPurchaseHistoryAsync(QStoreProductType.Subscription, new Function1<List<? extends PurchaseHistory>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.queryPurchasesHistory.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends PurchaseHistory> list) {
                invoke2((List<PurchaseHistory>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final List<PurchaseHistory> subsPurchasesList) {
                Intrinsics.checkNotNullParameter(subsPurchasesList, "subsPurchasesList");
                QonversionBillingService qonversionBillingService = QonversionBillingService.this;
                QStoreProductType qStoreProductType = QStoreProductType.InApp;
                final Function1<List<PurchaseHistory>, Unit> function1 = onCompleted;
                Function1<List<? extends PurchaseHistory>, Unit> function12 = new Function1<List<? extends PurchaseHistory>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.queryPurchasesHistory.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends PurchaseHistory> list) {
                        invoke2((List<PurchaseHistory>) list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<PurchaseHistory> inAppPurchasesList) {
                        Intrinsics.checkNotNullParameter(inAppPurchasesList, "inAppPurchasesList");
                        function1.invoke(CollectionsKt.plus((Collection) subsPurchasesList, (Iterable) inAppPurchasesList));
                    }
                };
                final Function1<BillingError, Unit> function13 = onFailed;
                final QonversionBillingService qonversionBillingService2 = QonversionBillingService.this;
                qonversionBillingService.queryPurchaseHistoryAsync(qStoreProductType, function12, new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.queryPurchasesHistory.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                        invoke2(billingError);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BillingError error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        QonversionBillingService.queryPurchasesHistory$fireOnFailed(function13, qonversionBillingService2, error);
                    }
                });
            }
        }, new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.queryPurchasesHistory.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QonversionBillingService.queryPurchasesHistory$fireOnFailed(onFailed, this, error);
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void queryPurchases(final Function1<? super BillingError, Unit> onFailed, final Function1<? super List<? extends Purchase>, Unit> onCompleted) {
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        this.logger.debug("queryPurchases() -> Querying purchases from cache for subs and inapp");
        executeOnMainThread(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.queryPurchases.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError billingError) {
                if (billingError == null) {
                    this.billingClientWrapper.queryPurchases(onFailed, onCompleted);
                } else {
                    onFailed.invoke(billingError);
                }
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingService
    public void getStoreProductType(final String storeId, final Function1<? super BillingError, Unit> onFailed, final Function1<? super QStoreProductType, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.billingClientWrapper.getStoreProductType(storeId, new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.getStoreProductType.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final BillingError actualError) {
                Intrinsics.checkNotNullParameter(actualError, "actualError");
                LegacyBillingClientWrapper legacyBillingClientWrapper = QonversionBillingService.this.legacyBillingClientWrapper;
                String str = storeId;
                final Function1<BillingError, Unit> function1 = onFailed;
                legacyBillingClientWrapper.getStoreProductType(str, new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.getStoreProductType.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                        invoke2(billingError);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BillingError it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        function1.invoke(actualError);
                    }
                }, onSuccess);
            }
        }, onSuccess);
    }

    private final void updatePurchase(final Activity activity, final QProduct product, final String offerId, final Boolean applyOffer, final QProduct oldProduct, final QPurchaseUpdatePolicy updatePolicy) {
        IBillingClientWrapper<?, ?> iBillingClientWrapperChooseBillingClientWrapperForProductPurchase = chooseBillingClientWrapperForProductPurchase(product);
        if (iBillingClientWrapperChooseBillingClientWrapperForProductPurchase == null) {
            return;
        }
        iBillingClientWrapperChooseBillingClientWrapperForProductPurchase.queryPurchaseHistoryForProduct(oldProduct, new Function2<BillingResult, PurchaseHistoryRecord, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.updatePurchase.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(BillingResult billingResult, PurchaseHistoryRecord purchaseHistoryRecord) {
                invoke2(billingResult, purchaseHistoryRecord);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingResult billingResult, PurchaseHistoryRecord purchaseHistoryRecord) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (!UtilsKt.isOk(billingResult)) {
                    String str = "Failed to update purchase: " + UtilsKt.getDescription(billingResult);
                    PurchasesListener.DefaultImpls.onPurchasesFailed$default(QonversionBillingService.this.purchasesListener, new BillingError(billingResult.getResponseCode(), str), null, 2, null);
                    QonversionBillingService.this.logger.error("updatePurchase() -> " + str);
                    return;
                }
                if (purchaseHistoryRecord != null) {
                    QonversionBillingService.this.logger.debug("updatePurchase() -> Purchase was found successfully for store product: " + UtilsKt.getProductId(purchaseHistoryRecord));
                    QonversionBillingService qonversionBillingService = QonversionBillingService.this;
                    Activity activity2 = activity;
                    QProduct qProduct = product;
                    String str2 = offerId;
                    Boolean bool = applyOffer;
                    String purchaseToken = purchaseHistoryRecord.getPurchaseToken();
                    Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
                    qonversionBillingService.makePurchase(activity2, qProduct, str2, bool, new UpdatePurchaseInfo(purchaseToken, updatePolicy));
                    return;
                }
                String str3 = "No existing purchase for Qonversion product: " + oldProduct.getQonversionID();
                PurchasesListener.DefaultImpls.onPurchasesFailed$default(QonversionBillingService.this.purchasesListener, new BillingError(billingResult.getResponseCode(), str3), null, 2, null);
                QonversionBillingService.this.logger.error("updatePurchase() -> " + str3);
            }
        });
    }

    static /* synthetic */ void makePurchase$default(QonversionBillingService qonversionBillingService, Activity activity, QProduct qProduct, String str, Boolean bool, UpdatePurchaseInfo updatePurchaseInfo, int i, Object obj) {
        if ((i & 16) != 0) {
            updatePurchaseInfo = null;
        }
        qonversionBillingService.makePurchase(activity, qProduct, str, bool, updatePurchaseInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makePurchase(final Activity activity, final QProduct product, final String offerId, final Boolean applyOffer, final UpdatePurchaseInfo updatePurchaseInfo) {
        executeOnMainThread(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.makePurchase.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError billingError) {
                if (billingError != null) {
                    return;
                }
                IBillingClientWrapper iBillingClientWrapperChooseBillingClientWrapperForProductPurchase = QonversionBillingService.this.chooseBillingClientWrapperForProductPurchase(product);
                if (iBillingClientWrapperChooseBillingClientWrapperForProductPurchase == null) {
                    PurchasesListener.DefaultImpls.onPurchasesFailed$default(QonversionBillingService.this.purchasesListener, new BillingError(4, "Store details for purchasing Qonversion product " + product.getQonversionID() + " were not found"), null, 2, null);
                    return;
                }
                Activity activity2 = activity;
                QProduct qProduct = product;
                String str = offerId;
                Boolean bool = applyOffer;
                UpdatePurchaseInfo updatePurchaseInfo2 = updatePurchaseInfo;
                final QonversionBillingService qonversionBillingService = QonversionBillingService.this;
                iBillingClientWrapperChooseBillingClientWrapperForProductPurchase.makePurchase(activity2, qProduct, str, bool, updatePurchaseInfo2, new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.makePurchase.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError2) {
                        invoke2(billingError2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BillingError error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        PurchasesListener.DefaultImpls.onPurchasesFailed$default(qonversionBillingService.purchasesListener, error, null, 2, null);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consume(final String purchaseToken) {
        this.logger.debug("consume() -> Consuming purchase with token " + purchaseToken);
        executeOnMainThread(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.consume.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError billingError) {
                if (billingError == null) {
                    QonversionBillingService.this.billingClientWrapper.consume(purchaseToken);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void acknowledge(final String purchaseToken) {
        this.logger.debug("acknowledge() -> Acknowledging purchase with token " + purchaseToken);
        executeOnMainThread(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.acknowledge.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError billingError) {
                if (billingError == null) {
                    QonversionBillingService.this.billingClientWrapper.acknowledge(purchaseToken);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseHistoryAsync(final QStoreProductType productType, final Function1<? super List<PurchaseHistory>, Unit> onQueryHistoryCompleted, final Function1<? super BillingError, Unit> onQueryHistoryFailed) {
        this.logger.debug("queryPurchaseHistoryAsync() -> Querying purchase history for type " + QStoreProductType.INSTANCE);
        executeOnMainThread(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.queryPurchaseHistoryAsync.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError billingError) {
                if (billingError == null) {
                    BillingClientWrapper billingClientWrapper = QonversionBillingService.this.billingClientWrapper;
                    QStoreProductType qStoreProductType = productType;
                    final QonversionBillingService qonversionBillingService = QonversionBillingService.this;
                    final QStoreProductType qStoreProductType2 = productType;
                    final Function1<List<PurchaseHistory>, Unit> function1 = onQueryHistoryCompleted;
                    final Function1<BillingError, Unit> function12 = onQueryHistoryFailed;
                    billingClientWrapper.queryPurchaseHistory(qStoreProductType, new Function2<BillingResult, List<? extends PurchaseHistoryRecord>, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.queryPurchaseHistoryAsync.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
                            invoke2(billingResult, list);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
                            String str;
                            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                            if (UtilsKt.isOk(billingResult) && list != null) {
                                function1.invoke(qonversionBillingService.getPurchaseHistoryFromHistoryRecords(qStoreProductType2, list));
                                return;
                            }
                            if (list != null) {
                                str = "Failed to retrieve purchase history. ";
                            } else {
                                str = "Failed to retrieve purchase history. Purchase history for " + qStoreProductType2 + " is null. ";
                            }
                            function12.invoke(new BillingError(billingResult.getResponseCode(), str + " " + UtilsKt.getDescription(billingResult)));
                        }
                    });
                    return;
                }
                onQueryHistoryFailed.invoke(billingError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PurchaseHistory> getPurchaseHistoryFromHistoryRecords(QStoreProductType productType, List<? extends PurchaseHistoryRecord> historyRecords) {
        ArrayList arrayList = new ArrayList();
        Unit unit = null;
        if (historyRecords.isEmpty()) {
            historyRecords = null;
        }
        if (historyRecords != null) {
            for (PurchaseHistoryRecord purchaseHistoryRecord : historyRecords) {
                arrayList.add(new PurchaseHistory(productType, purchaseHistoryRecord));
                this.logger.debug("queryPurchaseHistoryAsync() -> purchase history for " + productType + " is retrieved " + UtilsKt.getDescription(purchaseHistoryRecord));
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.logger.release("queryPurchaseHistoryAsync() -> purchase history for " + productType + " is empty.");
        }
        return arrayList;
    }

    private final void executeOnMainThread(Function1<? super BillingError, Unit> request) {
        synchronized (this) {
            this.requestsQueue.add(request);
            if (!this.billingClientHolder.isConnected()) {
                this.billingClientHolder.startConnection(this);
            } else {
                executeRequestsFromQueue();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void executeRequestsFromQueue() {
        synchronized (this) {
            while (this.billingClientHolder.isConnected() && !this.requestsQueue.isEmpty()) {
                final Function1<BillingError, Unit> function1Remove = this.requestsQueue.remove();
                this.mainHandler.post(new Runnable() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        function1Remove.invoke(null);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<? extends Purchase> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (UtilsKt.isOk(billingResult) && purchases != null) {
            this.logger.debug("onPurchasesUpdated() -> purchases updated. " + UtilsKt.getDescription(billingResult) + " ");
            this.purchasesListener.onPurchasesCompleted(purchases);
            return;
        }
        String description = UtilsKt.getDescription(billingResult);
        this.purchasesListener.onPurchasesFailed(new BillingError(billingResult.getResponseCode(), description), purchases == null ? CollectionsKt.emptyList() : purchases);
        this.logger.error("onPurchasesUpdated() -> failed to update purchases " + description);
        List<? extends Purchase> list = purchases;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.logger.release("Purchases: " + CollectionsKt.joinToString$default(purchases, ", ", null, null, 0, null, new Function1<Purchase, CharSequence>() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService.onPurchasesUpdated.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Purchase it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return UtilsKt.getDescription(it);
            }
        }, 30, null));
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingClientHolder.ConnectionListener
    public void onBillingClientConnected() {
        executeRequestsFromQueue();
    }

    @Override // com.qonversion.android.sdk.internal.billing.BillingClientHolder.ConnectionListener
    public void onBillingClientUnavailable(final BillingError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        synchronized (this) {
            while (!this.requestsQueue.isEmpty()) {
                final Function1<BillingError, Unit> function1Remove = this.requestsQueue.remove();
                this.mainHandler.post(new Runnable() { // from class: com.qonversion.android.sdk.internal.billing.QonversionBillingService$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        QonversionBillingService.onBillingClientUnavailable$lambda$17$lambda$16$lambda$15(function1Remove, error);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingClientUnavailable$lambda$17$lambda$16$lambda$15(Function1 function1, BillingError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        function1.invoke(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IBillingClientWrapper<?, ?> chooseBillingClientWrapperForProductPurchase(QProduct product) {
        QProductStoreDetails storeDetails = product.getStoreDetails();
        if (storeDetails != null && (product.getBasePlanID() != null || storeDetails.getIsInApp())) {
            return this.billingClientWrapper;
        }
        if (product.getSkuDetail() != null) {
            return this.legacyBillingClientWrapper;
        }
        return null;
    }
}
