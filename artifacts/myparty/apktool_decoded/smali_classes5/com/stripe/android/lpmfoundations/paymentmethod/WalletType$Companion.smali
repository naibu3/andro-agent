.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;
.super Ljava/lang/Object;
.source "WalletType.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalletType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletType.kt\ncom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n774#2:52\n865#2,2:53\n1279#2,2:55\n1293#2,4:57\n*S KotlinDebug\n*F\n+ 1 WalletType.kt\ncom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion\n*L\n18#1:52\n18#1:53,2\n31#1:55,2\n31#1:57,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J.\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;",
        "",
        "<init>",
        "()V",
        "listFrom",
        "",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;",
        "elementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "isGooglePayReady",
        "",
        "linkState",
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "isShopPayAvailable",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final listFrom(Lcom/stripe/android/model/ElementsSession;ZLcom/stripe/android/paymentsheet/state/LinkState;Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession;",
            "Z",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;",
            ">;"
        }
    .end annotation

    const-string v0, "elementsSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-static {}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    .line 19
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession;->getOrderedPaymentMethodTypesAndWallets()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    .line 20
    sget-object v5, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->ordinal()I

    move-result v3

    aget v3, v5, v3

    const/4 v5, 0x1

    if-eq v3, v5, :cond_3

    const/4 v5, 0x2

    if-eq v3, v5, :cond_2

    const/4 v5, 0x3

    if-ne v3, v5, :cond_1

    if-eqz p4, :cond_0

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    if-eqz p3, :cond_0

    goto :goto_1

    :cond_3
    if-eqz p2, :cond_0

    if-eqz v4, :cond_0

    .line 53
    :goto_1
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 54
    :cond_4
    check-cast v1, Ljava/util/List;

    .line 31
    check-cast v1, Ljava/lang/Iterable;

    .line 55
    new-instance p2, Ljava/util/LinkedHashMap;

    const/16 p3, 0xa

    invoke-static {v1, p3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result p3

    const/16 p4, 0x10

    invoke-static {p3, p4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 57
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 58
    move-object v0, p2

    check-cast v0, Ljava/util/Map;

    move-object v2, p4

    check-cast v2, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    .line 32
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession;->getOrderedPaymentMethodTypesAndWallets()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->getCode()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    .line 34
    sget-object v4, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->Link:Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    const/4 v5, -0x1

    if-ne v2, v4, :cond_5

    .line 35
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_3

    :cond_5
    if-ne v3, v5, :cond_6

    const/4 v2, 0x0

    goto :goto_3

    .line 39
    :cond_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 58
    :goto_3
    invoke-interface {v0, p4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 60
    :cond_7
    check-cast p2, Ljava/util/Map;

    .line 44
    invoke-static {}, Lkotlin/comparisons/ComparisonsKt;->naturalOrder()Ljava/util/Comparator;

    move-result-object p1

    invoke-static {p1}, Lkotlin/comparisons/ComparisonsKt;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$listFrom$$inlined$compareBy$1;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion$listFrom$$inlined$compareBy$1;-><init>(Ljava/util/Comparator;Ljava/util/Map;)V

    check-cast p3, Ljava/util/Comparator;

    .line 43
    invoke-static {v1, p3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
