.class final Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;
.super Lkotlin/jvm/internal/Lambda;
.source "LegacyBillingClientWrapper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->queryPurchases(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/android/billingclient/api/BillingClient;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLegacyBillingClientWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyBillingClientWrapper.kt\ncom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n1#2:230\n1855#3,2:231\n*S KotlinDebug\n*F\n+ 1 LegacyBillingClientWrapper.kt\ncom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1\n*L\n120#1:231,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/android/billingclient/api/BillingClient;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $onCompleted:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onFailed:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;


# direct methods
.method public static synthetic $r8$lambda$-5VUFkHSnFeMrICJiyC_KfAeymM(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->invoke$lambda$3$lambda$2(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic $r8$lambda$NbFphooUXT840oZjYN21oJPcdQo(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingClient;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->invoke$lambda$3(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingClient;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
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

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->$onFailed:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->$onCompleted:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method private static final invoke$lambda$3(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingClient;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onFailed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_withReadyClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onCompleted"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subsResult"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeSubs"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-static {p4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    const-string p2, "subscription"

    invoke-virtual {p0, p4, p2, p1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->handlePurchasesQueryError(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 109
    :cond_0
    new-instance v6, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p4

    move-object v3, p1

    move-object v4, p5

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda0;-><init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    const-string p0, "inapp"

    invoke-virtual {p2, p0, v6}, Lcom/android/billingclient/api/BillingClient;->queryPurchasesAsync(Ljava/lang/String;Lcom/android/billingclient/api/PurchasesResponseListener;)V

    return-void
.end method

.method private static final invoke$lambda$3$lambda$2(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$subsResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onFailed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$activeSubs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onCompleted"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppsResult"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unconsumedInApp"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    invoke-static {p5}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result p5

    if-nez p5, :cond_0

    .line 111
    const-string p3, "in-app"

    invoke-virtual {p0, p1, p3, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->handlePurchasesQueryError(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    .line 115
    :cond_0
    check-cast p3, Ljava/util/Collection;

    check-cast p6, Ljava/lang/Iterable;

    invoke-static {p3, p6}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 116
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, p3

    :goto_0
    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    .line 231
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/Purchase;

    .line 121
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p3

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "queryPurchases() -> purchases cache is retrieved "

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 232
    :cond_2
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    if-nez p3, :cond_4

    .line 123
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p0

    const-string p1, "queryPurchases() -> purchases cache is empty."

    invoke-interface {p0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->release(Ljava/lang/String;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 102
    check-cast p1, Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->invoke(Lcom/android/billingclient/api/BillingClient;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingClient;)V
    .locals 4

    const-string v0, "$this$withReadyClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->$onFailed:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->$onCompleted:Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;

    invoke-direct {v3, v0, v1, p1, v2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1$$ExternalSyntheticLambda1;-><init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingClient;Lkotlin/jvm/functions/Function1;)V

    const-string v0, "subs"

    invoke-virtual {p1, v0, v3}, Lcom/android/billingclient/api/BillingClient;->queryPurchasesAsync(Ljava/lang/String;Lcom/android/billingclient/api/PurchasesResponseListener;)V

    return-void
.end method
