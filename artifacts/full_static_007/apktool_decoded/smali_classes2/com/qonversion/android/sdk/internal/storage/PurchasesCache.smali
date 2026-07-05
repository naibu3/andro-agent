.class public final Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
.super Ljava/lang/Object;
.source "PurchasesCache.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010#\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010J\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rJ\u001a\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u0016\u0010\u001b\u001a\u00020\u00142\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "",
        "preferences",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)V",
        "collectionPurchaseOptionsType",
        "Ljava/lang/reflect/Type;",
        "collectionPurchaseType",
        "moshi",
        "Lcom/squareup/moshi/Moshi;",
        "kotlin.jvm.PlatformType",
        "purchasesJsonAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "purchasesOptionsJsonAdapter",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "clearPurchase",
        "",
        "purchase",
        "loadProcessingPurchasesOptions",
        "loadPurchases",
        "saveProcessingPurchasesOptions",
        "options",
        "savePurchase",
        "savePurchasesAsJson",
        "purchases",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;

.field private static final MAX_OLD_PURCHASES_NUMBER:I = 0x1

.field private static final MAX_PURCHASES_NUMBER:I = 0x5

.field private static final PURCHASE_KEY:Ljava/lang/String; = "purchase"

.field private static final PURCHASE_OPTIONS_KEY:Ljava/lang/String; = "purchase_options"


# instance fields
.field private final collectionPurchaseOptionsType:Ljava/lang/reflect/Type;

.field private final collectionPurchaseType:Ljava/lang/reflect/Type;

.field private final moshi:Lcom/squareup/moshi/Moshi;

.field private final preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

.field private final purchasesJsonAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Set<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;>;"
        }
    .end annotation
.end field

.field private final purchasesOptionsJsonAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->Companion:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)V
    .locals 7

    const-string v0, "preferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 14
    new-instance p1, Lcom/squareup/moshi/Moshi$Builder;

    invoke-direct {p1}, Lcom/squareup/moshi/Moshi$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/squareup/moshi/Moshi$Builder;->build()Lcom/squareup/moshi/Moshi;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->moshi:Lcom/squareup/moshi/Moshi;

    .line 15
    const-class v0, Ljava/util/Set;

    check-cast v0, Ljava/lang/reflect/Type;

    const/4 v1, 0x1

    .line 17
    new-array v2, v1, [Ljava/lang/reflect/Type;

    const-class v3, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 15
    invoke-static {v0, v2}, Lcom/squareup/moshi/Types;->newParameterizedType(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v0

    const-string v2, "newParameterizedType(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/reflect/Type;

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->collectionPurchaseType:Ljava/lang/reflect/Type;

    .line 19
    const-class v3, Ljava/util/Map;

    check-cast v3, Ljava/lang/reflect/Type;

    const/4 v5, 0x2

    .line 21
    new-array v5, v5, [Ljava/lang/reflect/Type;

    const-class v6, Ljava/lang/String;

    aput-object v6, v5, v4

    const-class v4, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    aput-object v4, v5, v1

    .line 19
    invoke-static {v3, v5}, Lcom/squareup/moshi/Types;->newParameterizedType(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/reflect/Type;

    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->collectionPurchaseOptionsType:Ljava/lang/reflect/Type;

    .line 25
    invoke-virtual {p1, v0}, Lcom/squareup/moshi/Moshi;->adapter(Ljava/lang/reflect/Type;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    const-string v2, "adapter(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesJsonAdapter:Lcom/squareup/moshi/JsonAdapter;

    .line 27
    invoke-virtual {p1, v1}, Lcom/squareup/moshi/Moshi;->adapter(Ljava/lang/reflect/Type;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesOptionsJsonAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method

.method private final savePurchasesAsJson(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesJsonAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    const-string v1, "purchase"

    invoke-virtual {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final clearPurchase(Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 1

    const-string v0, "purchase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->loadPurchases()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 56
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 58
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->savePurchasesAsJson(Ljava/util/Set;)V

    return-void
.end method

.method public final loadProcessingPurchasesOptions()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    const-string v1, "purchase_options"

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesOptionsJsonAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getObject(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final loadPurchases()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    const-string v1, "purchase"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 43
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 47
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesJsonAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, v0}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_1

    .line 48
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 50
    :catch_0
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0

    .line 44
    :cond_2
    :goto_1
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final saveProcessingPurchasesOptions(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;)V"
        }
    .end annotation

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    const-string v1, "purchase_options"

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesOptionsJsonAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, v1, p1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->putObject(Ljava/lang/String;Ljava/lang/Object;Lcom/squareup/moshi/JsonAdapter;)V

    return-void
.end method

.method public final savePurchase(Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 2

    const-string v0, "purchase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->loadPurchases()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 31
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p1

    const/4 v1, 0x5

    if-lt p1, v1, :cond_0

    .line 34
    move-object p1, v0

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    .line 35
    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 38
    :cond_0
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->savePurchasesAsJson(Ljava/util/Set;)V

    return-void
.end method
