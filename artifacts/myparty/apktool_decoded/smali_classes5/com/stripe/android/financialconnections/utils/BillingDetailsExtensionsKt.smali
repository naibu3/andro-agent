.class public final Lcom/stripe/android/financialconnections/utils/BillingDetailsExtensionsKt;
.super Ljava/lang/Object;
.source "BillingDetailsExtensions.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBillingDetailsExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingDetailsExtensions.kt\ncom/stripe/android/financialconnections/utils/BillingDetailsExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,59:1\n1#2:60\n503#3,7:61\n535#3:68\n520#3,6:69\n503#3,7:75\n*S KotlinDebug\n*F\n+ 1 BillingDetailsExtensions.kt\ncom/stripe/android/financialconnections/utils/BillingDetailsExtensionsKt\n*L\n21#1:61,7\n42#1:68\n42#1:69,6\n53#1:75,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "toApiParams",
        "",
        "",
        "",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;",
        "toConsumerBillingAddressParams",
        "financial-connections-core_release"
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
.method public static final toApiParams(Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getAddress()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 14
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v1

    .line 15
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getLine1()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "line1"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 16
    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getLine2()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "line2"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 17
    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "postal_code"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 18
    :cond_2
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getCity()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v3, "city"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 19
    :cond_3
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getState()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v3, "state"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 20
    :cond_4
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getCountry()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v2, "country"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_5
    invoke-static {v1}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 61
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 62
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 63
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 22
    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 64
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 67
    :cond_7
    check-cast v1, Ljava/util/Map;

    goto :goto_1

    :cond_8
    const/4 v1, 0x0

    :goto_1
    const/4 v0, 0x4

    .line 26
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "name"

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    .line 27
    const-string v2, "email"

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    .line 28
    const-string v2, "phone"

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v2, 0x2

    aput-object p0, v0, v2

    .line 29
    const-string p0, "address"

    invoke-static {p0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x3

    aput-object p0, v0, v1

    .line 25
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toConsumerBillingAddressParams(Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v0

    .line 41
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "name"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_0
    invoke-static {v0}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 68
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 69
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 43
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 71
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 46
    :cond_2
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v0

    .line 47
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getAddress()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getLine1()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v3, "line_1"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 48
    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getAddress()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getLine2()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v3, "line_2"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 49
    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getAddress()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    const-string v3, "postal_code"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 50
    :cond_5
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getAddress()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getCity()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    const-string v3, "locality"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 51
    :cond_6
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getAddress()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getState()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    const-string v3, "administrative_area"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 52
    :cond_7
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;->getAddress()Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails$Address;->getCountry()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_8

    const-string v2, "country_code"

    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    :cond_8
    invoke-static {v0}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    .line 75
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 76
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_9
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 77
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 54
    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 78
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 81
    :cond_a
    check-cast v0, Ljava/util/Map;

    .line 57
    invoke-static {v1, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method
