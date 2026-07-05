.class public final Lcom/stripe/android/financialconnections/domain/GetCachedAccountsKt;
.super Ljava/lang/Object;
.source "GetCachedAccounts.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGetCachedAccounts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCachedAccounts.kt\ncom/stripe/android/financialconnections/domain/GetCachedAccountsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1557#2:33\n1628#2,3:34\n*S KotlinDebug\n*F\n+ 1 GetCachedAccounts.kt\ncom/stripe/android/financialconnections/domain/GetCachedAccountsKt\n*L\n30#1:33\n30#1:34,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toCachedPartnerAccounts",
        "",
        "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "financial-connections_release"
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
.method public static final toCachedPartnerAccounts(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    check-cast p0, Ljava/lang/Iterable;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 34
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 35
    check-cast v1, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    .line 30
    new-instance v2, Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getLinkedAccountId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 36
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method
