.class public final Lcom/stripe/android/cards/CbcTestCardDelegate;
.super Ljava/lang/Object;
.source "CbcTestCardDelegate.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCbcTestCardDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CbcTestCardDelegate.kt\ncom/stripe/android/cards/CbcTestCardDelegate\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,54:1\n487#2,7:55\n*S KotlinDebug\n*F\n+ 1 CbcTestCardDelegate.kt\ncom/stripe/android/cards/CbcTestCardDelegate\n*L\n50#1:55,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\n\u001a\u00020\u000bR \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/cards/CbcTestCardDelegate;",
        "",
        "<init>",
        "()V",
        "testAccountRanges",
        "",
        "",
        "",
        "Lcom/stripe/android/model/AccountRange;",
        "onCardNumberChanged",
        "cardNumber",
        "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/cards/CbcTestCardDelegate;

.field private static final testAccountRanges:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lcom/stripe/android/cards/CbcTestCardDelegate;

    invoke-direct {v0}, Lcom/stripe/android/cards/CbcTestCardDelegate;-><init>()V

    sput-object v0, Lcom/stripe/android/cards/CbcTestCardDelegate;->INSTANCE:Lcom/stripe/android/cards/CbcTestCardDelegate;

    const/4 v0, 0x2

    .line 11
    new-array v1, v0, [Lkotlin/Pair;

    .line 12
    new-array v2, v0, [Lcom/stripe/android/model/AccountRange;

    new-instance v3, Lcom/stripe/android/model/AccountRange;

    .line 13
    new-instance v4, Lcom/stripe/android/model/BinRange;

    const-string v10, "4000000000000000"

    const-string v11, "4999999999999999"

    invoke-direct {v4, v10, v11}, Lcom/stripe/android/model/BinRange;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    sget-object v6, Lcom/stripe/android/model/AccountRange$BrandInfo;->CartesBancaires:Lcom/stripe/android/model/AccountRange$BrandInfo;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/16 v5, 0x10

    const/4 v7, 0x0

    .line 12
    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/model/AccountRange;-><init>(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 20
    new-instance v12, Lcom/stripe/android/model/AccountRange;

    .line 21
    new-instance v13, Lcom/stripe/android/model/BinRange;

    invoke-direct {v13, v10, v11}, Lcom/stripe/android/model/BinRange;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    sget-object v15, Lcom/stripe/android/model/AccountRange$BrandInfo;->Visa:Lcom/stripe/android/model/AccountRange$BrandInfo;

    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v14, 0x10

    const/16 v16, 0x0

    .line 20
    invoke-direct/range {v12 .. v18}, Lcom/stripe/android/model/AccountRange;-><init>(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x1

    aput-object v12, v2, v3

    .line 11
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v5, "4000002500001001"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v4

    .line 30
    new-array v0, v0, [Lcom/stripe/android/model/AccountRange;

    new-instance v5, Lcom/stripe/android/model/AccountRange;

    .line 31
    new-instance v6, Lcom/stripe/android/model/BinRange;

    const-string v2, "5100000000000000"

    const-string v12, "5599999999999999"

    invoke-direct {v6, v2, v12}, Lcom/stripe/android/model/BinRange;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    sget-object v8, Lcom/stripe/android/model/AccountRange$BrandInfo;->CartesBancaires:Lcom/stripe/android/model/AccountRange$BrandInfo;

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/16 v7, 0x10

    .line 30
    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/model/AccountRange;-><init>(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v5, v0, v4

    .line 38
    new-instance v13, Lcom/stripe/android/model/AccountRange;

    .line 39
    new-instance v14, Lcom/stripe/android/model/BinRange;

    invoke-direct {v14, v2, v12}, Lcom/stripe/android/model/BinRange;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    sget-object v16, Lcom/stripe/android/model/AccountRange$BrandInfo;->Mastercard:Lcom/stripe/android/model/AccountRange$BrandInfo;

    const/16 v18, 0x8

    const/16 v19, 0x0

    const/16 v15, 0x10

    const/16 v17, 0x0

    .line 38
    invoke-direct/range {v13 .. v19}, Lcom/stripe/android/model/AccountRange;-><init>(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v13, v0, v3

    .line 29
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "5555552500001001"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v3

    .line 10
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/cards/CbcTestCardDelegate;->testAccountRanges:Ljava/util/Map;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/cards/CbcTestCardDelegate;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCardNumberChanged(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;"
        }
    .end annotation

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    sget-object v0, Lcom/stripe/android/cards/CbcTestCardDelegate;->testAccountRanges:Ljava/util/Map;

    .line 55
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 56
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 57
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getNormalized()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v5, v4, v6, v7, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 58
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 61
    :cond_1
    check-cast v1, Ljava/util/Map;

    .line 51
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/util/List;

    :cond_2
    if-nez v3, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v3
.end method
