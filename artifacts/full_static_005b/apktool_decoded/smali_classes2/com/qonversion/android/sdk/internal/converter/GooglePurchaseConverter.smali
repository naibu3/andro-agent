.class public final Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;
.super Ljava/lang/Object;
.source "GooglePurchaseConverter.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGooglePurchaseConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePurchaseConverter.kt\ncom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1549#2:36\n1620#2,3:37\n*S KotlinDebug\n*F\n+ 1 GooglePurchaseConverter.kt\ncom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter\n*L\n14#1:36\n14#1:37,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016J2\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\n2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u000cH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;",
        "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;",
        "()V",
        "convertPurchase",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "purchase",
        "Lcom/android/billingclient/api/Purchase;",
        "options",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "convertPurchases",
        "",
        "purchases",
        "",
        "",
        "formatOriginalTransactionId",
        "transactionId",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final formatOriginalTransactionId(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\.{2}.*"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 32
    check-cast p1, Ljava/lang/CharSequence;

    const-string v1, ""

    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public convertPurchase(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;
    .locals 10

    const-string v0, "purchase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 19
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getOrderId()Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    if-nez v1, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object v4, v1

    .line 21
    :goto_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getOrderId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    invoke-direct {p0, v3}, Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;->formatOriginalTransactionId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getPurchaseTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->milliSecondsToSeconds(J)J

    move-result-wide v6

    .line 23
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object p1

    const-string v1, "getPurchaseToken(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    .line 24
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getContextKeys$sdk_release()Ljava/util/List;

    move-result-object v3

    move-object v8, v3

    goto :goto_2

    :cond_2
    move-object v8, v1

    :goto_2
    if-eqz p2, :cond_3

    .line 25
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getScreenUid$sdk_release()Ljava/lang/String;

    move-result-object p2

    move-object v9, p2

    goto :goto_3

    :cond_3
    move-object v9, v1

    :goto_3
    move-object v1, v0

    move-object v3, v4

    move-object v4, v5

    move-wide v5, v6

    move-object v7, p1

    .line 18
    invoke-direct/range {v1 .. v9}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public convertPurchases(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;"
        }
    .end annotation

    const-string v0, "purchases"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    check-cast p1, Ljava/lang/Iterable;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 37
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 38
    check-cast v1, Lcom/android/billingclient/api/Purchase;

    if-eqz p2, :cond_0

    .line 14
    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p0, v1, v2}, Lcom/qonversion/android/sdk/internal/converter/GooglePurchaseConverter;->convertPurchase(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    move-result-object v1

    .line 38
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 39
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method
