.class public final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;
.super Ljava/lang/Object;
.source "QonversionBillingService.kt"

# interfaces
.implements Lcom/android/billingclient/api/PurchasesUpdatedListener;
.implements Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;
.implements Lcom/qonversion/android/sdk/internal/billing/BillingService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;,
        Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQonversionBillingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QonversionBillingService.kt\ncom/qonversion/android/sdk/internal/billing/QonversionBillingService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n1747#2,3:457\n1855#2,2:460\n766#2:462\n857#2,2:463\n1855#2,2:465\n1855#2,2:467\n1855#2,2:470\n766#2:472\n857#2,2:473\n1549#2:475\n1620#2,3:476\n1#3:469\n*S KotlinDebug\n*F\n+ 1 QonversionBillingService.kt\ncom/qonversion/android/sdk/internal/billing/QonversionBillingService\n*L\n44#1:457,3\n84#1:460,2\n138#1:462\n138#1:463,2\n139#1:465,2\n164#1:467,2\n369#1:470,2\n51#1:472\n51#1:473,2\n52#1:475\n52#1:476,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001VB?\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010#\u001a\u00020\u001a2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020&0%H\u0016J\u0016\u0010\'\u001a\u00020\u001a2\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0%H\u0016J\u0016\u0010*\u001a\u00020\u001a2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020!0%H\u0016Jb\u0010,\u001a\u00020\u001a2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020!0%2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020\u001a0\u00152\'\u0010/\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020!0%\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(+\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016J\u001e\u00100\u001a\u00020\u001a2\u0014\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001a0\u0015H\u0002J\u0008\u00102\u001a\u00020\u001aH\u0002J$\u00103\u001a\u0008\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u0002052\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u0002060%H\u0002JV\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001d2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020\u001a0\u00152!\u00109\u001a\u001d\u0012\u0013\u0012\u001105\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(:\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016J=\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020=2\u0006\u0010 \u001a\u00020!2\u0008\u0010>\u001a\u0004\u0018\u00010\u001d2\u0008\u0010?\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010@\u001a\u0004\u0018\u00010AH\u0002\u00a2\u0006\u0002\u0010BJ\u0008\u0010C\u001a\u00020\u001aH\u0016J\u0010\u0010D\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u0016H\u0016J \u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020G2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010%H\u0016J\u0018\u0010H\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020=2\u0006\u0010I\u001a\u00020JH\u0016J>\u0010K\u001a\u00020\u001a2\u0006\u00104\u001a\u0002052\u0018\u0010L\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0%\u0012\u0004\u0012\u00020\u001a0\u00152\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0\u0015H\u0002JT\u0010N\u001a\u00020\u001a2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020\u001a0\u00152\'\u0010O\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020)0%\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008((\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016JT\u0010P\u001a\u00020\u001a2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(.\u0012\u0004\u0012\u00020\u001a0\u00152\'\u0010O\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020&0%\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008((\u0012\u0004\u0012\u00020\u001a0\u0015H\u0016JC\u0010Q\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020=2\u0006\u0010 \u001a\u00020!2\u0008\u0010>\u001a\u0004\u0018\u00010\u001d2\u0008\u0010?\u001a\u0004\u0018\u00010\u000b2\u0006\u0010R\u001a\u00020!2\u0008\u0010S\u001a\u0004\u0018\u00010TH\u0002\u00a2\u0006\u0002\u0010UR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R1\u0010\u0013\u001a%\u0012!\u0012\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(\u0019\u0012\u0004\u0012\u00020\u001a0\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006W"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
        "Lcom/android/billingclient/api/PurchasesUpdatedListener;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingService;",
        "mainHandler",
        "Landroid/os/Handler;",
        "purchasesListener",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "isAnalyticsMode",
        "",
        "billingClientHolder",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "billingClientWrapper",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
        "legacyBillingClientWrapper",
        "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
        "(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/logger/Logger;ZLcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)V",
        "requestsQueue",
        "Ljava/util/concurrent/ConcurrentLinkedQueue;",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "Lkotlin/ParameterName;",
        "name",
        "billingSetupError",
        "",
        "acknowledge",
        "purchaseToken",
        "",
        "chooseBillingClientWrapperForProductPurchase",
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;",
        "product",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "consume",
        "consumeHistoryRecords",
        "historyRecords",
        "",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "consumePurchases",
        "purchases",
        "Lcom/android/billingclient/api/Purchase;",
        "enrichStoreData",
        "products",
        "enrichStoreDataAsync",
        "onFailed",
        "error",
        "onEnriched",
        "executeOnMainThread",
        "request",
        "executeRequestsFromQueue",
        "getPurchaseHistoryFromHistoryRecords",
        "productType",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "getStoreProductType",
        "storeId",
        "onSuccess",
        "type",
        "makePurchase",
        "activity",
        "Landroid/app/Activity;",
        "offerId",
        "applyOffer",
        "updatePurchaseInfo",
        "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V",
        "onBillingClientConnected",
        "onBillingClientUnavailable",
        "onPurchasesUpdated",
        "billingResult",
        "Lcom/android/billingclient/api/BillingResult;",
        "purchase",
        "purchaseModel",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;",
        "queryPurchaseHistoryAsync",
        "onQueryHistoryCompleted",
        "onQueryHistoryFailed",
        "queryPurchases",
        "onCompleted",
        "queryPurchasesHistory",
        "updatePurchase",
        "oldProduct",
        "updatePolicy",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V",
        "PurchasesListener",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

.field private final billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

.field private final isAnalyticsMode:Z

.field private final legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

.field private final mainHandler:Landroid/os/Handler;

.field private final purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

.field private final requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$Da89vBYQgXlsHm22lWCypY_qcRY(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->onBillingClientUnavailable$lambda$17$lambda$16$lambda$15(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    return-void
.end method

.method public static synthetic $r8$lambda$pWLyjwOwK-TNy706YINhKWPNQrc(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeRequestsFromQueue$lambda$14$lambda$13$lambda$12(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/logger/Logger;ZLcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)V
    .locals 1

    const-string v0, "mainHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchasesListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingClientHolder"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingClientWrapper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legacyBillingClientWrapper"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->mainHandler:Landroid/os/Handler;

    .line 17
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    .line 18
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 19
    iput-boolean p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->isAnalyticsMode:Z

    .line 20
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 21
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 22
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    .line 25
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 36
    move-object p1, p0

    check-cast p1, Lcom/android/billingclient/api/PurchasesUpdatedListener;

    invoke-virtual {p5, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->subscribeOnPurchasesUpdates(Lcom/android/billingclient/api/PurchasesUpdatedListener;)V

    return-void
.end method

.method public static final synthetic access$acknowledge(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->acknowledge(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$consume(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->consume(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$enrichStoreDataAsync$fetchProductDetails(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 15
    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->enrichStoreDataAsync$fetchProductDetails(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getBillingClientWrapper$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    return-object p0
.end method

.method public static final synthetic access$getLegacyBillingClientWrapper$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPurchaseHistoryFromHistoryRecords(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->getPurchaseHistoryFromHistoryRecords(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPurchasesListener$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    return-object p0
.end method

.method public static final synthetic access$makePurchase(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V
    .locals 0

    .line 15
    invoke-direct/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V

    return-void
.end method

.method public static final synthetic access$purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V
    .locals 0

    .line 15
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic access$queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$queryPurchasesHistory$fireOnFailed(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 0

    .line 15
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchasesHistory$fireOnFailed(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    return-void
.end method

.method private final acknowledge(Ljava/lang/String;)V
    .locals 3

    .line 318
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "acknowledge() -> Acknowledging purchase with token "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 319
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$acknowledge$1;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$acknowledge$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ")",
            "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper<",
            "**>;"
        }
    .end annotation

    .line 448
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 450
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getBasePlanID()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;

    goto :goto_0

    .line 451
    :cond_1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;

    :goto_0
    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private final consume(Ljava/lang/String;)V
    .locals 3

    .line 307
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "consume() -> Consuming purchase with token "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 308
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consume$1;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consume$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final enrichStoreDataAsync$fetchProductDetails(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 51
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    .line 472
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 473
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 51
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 473
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 474
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 472
    check-cast v1, Ljava/lang/Iterable;

    .line 475
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 476
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 477
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 52
    new-instance v9, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;

    .line 53
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 54
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getBasePlanID()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, v9

    .line 52
    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 477
    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 478
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 56
    iget-object v1, p1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$fetchProductDetails$1;

    invoke-direct {v2, p1, p0, p3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$fetchProductDetails$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1, v0, p2, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->withStoreDataLoaded(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private final executeOnMainThread(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 379
    monitor-enter p0

    .line 380
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 381
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->isConnected()Z

    move-result p1

    if-nez p1, :cond_0

    .line 382
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->startConnection(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;)V

    goto :goto_0

    .line 384
    :cond_0
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeRequestsFromQueue()V

    .line 386
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final executeRequestsFromQueue()V
    .locals 3

    .line 390
    monitor-enter p0

    .line 391
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove()Ljava/lang/Object;

    move-result-object v0

    .line 393
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 394
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->mainHandler:Landroid/os/Handler;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda1;

    invoke-direct {v2, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 399
    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 390
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private static final executeRequestsFromQueue$lambda$14$lambda$13$lambda$12(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x0

    .line 395
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final getPurchaseHistoryFromHistoryRecords(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;"
        }
    .end annotation

    .line 366
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 368
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v2

    .line 369
    :goto_0
    const-string v1, "queryPurchaseHistoryAsync() -> purchase history for "

    if-eqz p2, :cond_2

    .line 368
    check-cast p2, Ljava/lang/Iterable;

    .line 470
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 370
    new-instance v3, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;

    invoke-direct {v3, p1, v2}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;-><init>(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lcom/android/billingclient/api/PurchaseHistoryRecord;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 371
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-static {v2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " is retrieved "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 471
    :cond_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v2, :cond_3

    .line 373
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " is empty."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->release(Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method

.method private final makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V
    .locals 8

    .line 280
    new-instance v7, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/dto/products/QProduct;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v7}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method static synthetic makePurchase$default(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 273
    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V

    return-void
.end method

.method private static final onBillingClientUnavailable$lambda$17$lambda$16$lambda$15(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 1

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V
    .locals 17

    .line 102
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v0

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getHasAnyStoreDetails(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v4

    .line 106
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOfferId$sdk_release()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v1

    .line 107
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getApplyOffer$sdk_release()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_1
    move-object v6, v1

    .line 108
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v7

    .line 109
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getUpdatePolicy()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object v8

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    .line 103
    invoke-direct/range {v2 .. v8}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V

    goto :goto_2

    .line 113
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v11

    .line 114
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOfferId$sdk_release()Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    goto :goto_1

    :cond_3
    move-object v12, v1

    .line 115
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getApplyOffer$sdk_release()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_4
    move-object v13, v1

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    .line 111
    invoke-static/range {v9 .. v16}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->makePurchase$default(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;ILjava/lang/Object;)V

    :goto_2
    return-void
.end method

.method private final queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 331
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    sget-object v1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Companion:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "queryPurchaseHistoryAsync() -> Querying purchase history for type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 333
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final queryPurchasesHistory$fireOnFailed(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            ")V"
        }
    .end annotation

    .line 177
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    iget-object p0, p1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "queryPurchasesHistory() -> "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    return-void
.end method

.method private final updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V
    .locals 11

    move-object v8, p0

    move-object v3, p2

    .line 239
    invoke-direct {p0, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;

    move-result-object v9

    if-nez v9, :cond_0

    return-void

    .line 241
    :cond_0
    new-instance v10, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/products/QProduct;)V

    check-cast v10, Lkotlin/jvm/functions/Function2;

    move-object/from16 v0, p5

    invoke-interface {v9, v0, v10}, Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;->queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method


# virtual methods
.method public consumeHistoryRecords(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "historyRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->isAnalyticsMode:Z

    if-eqz v0, :cond_0

    return-void

    .line 164
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 467
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;

    .line 165
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getType()Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    move-result-object v1

    sget-object v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    const-string v3, "getPurchaseToken(...)"

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 167
    :cond_1
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->acknowledge(Ljava/lang/String;)V

    goto :goto_0

    .line 166
    :cond_2
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->consume(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public consumePurchases(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "purchases"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->isAnalyticsMode:Z

    if-eqz v0, :cond_0

    return-void

    .line 137
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 462
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 463
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/android/billingclient/api/Purchase;

    .line 138
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase;->getPurchaseState()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 463
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 464
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 462
    check-cast v0, Ljava/lang/Iterable;

    .line 465
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/Purchase;

    .line 140
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    return-void

    .line 141
    :cond_3
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$1;

    invoke-direct {v2, p0, v1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;

    invoke-direct {v3, p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/android/billingclient/api/Purchase;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->getStoreProductType(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public enrichStoreData(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)V"
        }
    .end annotation

    const-string v0, "products"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    check-cast p1, Ljava/lang/Iterable;

    .line 460
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 85
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 87
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getStoreData(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->setSkuDetail(Lcom/android/billingclient/api/SkuDetails;)V

    .line 89
    new-instance v7, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;

    .line 91
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getBasePlanID()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    .line 89
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    invoke-virtual {v1, v7}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getStoreData(Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;)Lcom/android/billingclient/api/ProductDetails;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 94
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->setStoreProductDetails$sdk_release(Lcom/android/billingclient/api/ProductDetails;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public enrichStoreDataAsync(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "products"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFailed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnriched"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 457
    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 458
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 44
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 65
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;

    invoke-direct {v0, p0, p2, p1, p3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 45
    :cond_2
    :goto_0
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public getStoreProductType(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "storeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFailed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, p1, v1, p3}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getStoreProductType(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onBillingClientConnected()V
    .locals 0

    .line 428
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeRequestsFromQueue()V

    return-void
.end method

.method public onBillingClientUnavailable(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 432
    monitor-enter p0

    .line 433
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 435
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->mainHandler:Landroid/os/Handler;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 438
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 432
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 404
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onPurchasesUpdated() -> purchases updated. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 405
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;->onPurchasesCompleted(Ljava/util/List;)V

    goto :goto_1

    .line 407
    :cond_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object v0

    .line 408
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    .line 409
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    .line 410
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    .line 409
    invoke-direct {v2, p1, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    if-nez p2, :cond_1

    .line 413
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, p2

    .line 408
    :goto_0
    invoke-interface {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;->onPurchasesFailed(Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;)V

    .line 416
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onPurchasesUpdated() -> failed to update purchases "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 417
    move-object p1, p2

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 418
    :cond_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 419
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .line 420
    const-string p2, ", "

    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    .line 419
    sget-object p2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$onPurchasesUpdated$1;->INSTANCE:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$onPurchasesUpdated$1;

    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Purchases: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 418
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->release(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v0

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getHasAnyStoreDetails(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    invoke-static {p2, p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 124
    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/products/QProduct;

    const/4 v1, 0x0

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 123
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$1;

    invoke-direct {v1, p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;

    invoke-direct {v2, p2, p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;-><init>(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->enrichStoreDataAsync(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :goto_0
    return-void
.end method

.method public queryPurchases(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onFailed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCompleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    const-string v1, "queryPurchases() -> Querying purchases from cache for subs and inapp"

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 203
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchases$1;

    invoke-direct {v0, p1, p0, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchases$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public queryPurchasesHistory(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onFailed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCompleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    sget-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Subscription:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 181
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance p2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;

    invoke-direct {p2, p1, p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;-><init>(Lkotlin/jvm/functions/Function1;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
