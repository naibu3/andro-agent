.class public final Lcom/stripe/android/paymentsheet/ui/PaymentMethodCardKtxKt;
.super Ljava/lang/Object;
.source "PaymentMethodCardKtx.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentMethodCardKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodCardKtx.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodCardKtxKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1557#2:22\n1628#2,3:23\n*S KotlinDebug\n*F\n+ 1 PaymentMethodCardKtx.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodCardKtxKt\n*L\n12#1:22\n12#1:23,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "getPreferredChoice",
        "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
        "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "getAvailableNetworks",
        "",
        "toChoice",
        "Lcom/stripe/android/model/CardBrand;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getAvailableNetworks(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/CardBrandFilter;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
            "Lcom/stripe/android/CardBrandFilter;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->getNetworks()Ljava/util/Set;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 12
    check-cast p0, Ljava/lang/Iterable;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 23
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 13
    sget-object v2, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodCardKtxKt;->toChoice(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/CardBrandFilter;)Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object v1

    .line 24
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 25
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0

    .line 15
    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final getPreferredChoice(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/CardBrandFilter;)Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->getDisplayBrand()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodCardKtxKt;->toChoice(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/CardBrandFilter;)Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object p0

    return-object p0
.end method

.method private static final toChoice(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/CardBrandFilter;)Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;
    .locals 1

    .line 19
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    invoke-interface {p1, p0}, Lcom/stripe/android/CardBrandFilter;->isAccepted(Lcom/stripe/android/model/CardBrand;)Z

    move-result p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;-><init>(Lcom/stripe/android/model/CardBrand;Z)V

    return-object v0
.end method
