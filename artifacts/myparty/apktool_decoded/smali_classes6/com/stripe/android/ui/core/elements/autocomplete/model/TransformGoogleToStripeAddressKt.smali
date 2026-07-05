.class public final Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;
.super Ljava/lang/Object;
.source "TransformGoogleToStripeAddress.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTransformGoogleToStripeAddress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGoogleToStripeAddress.kt\ncom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1#2:266\n1863#3,2:267\n*S KotlinDebug\n*F\n+ 1 TransformGoogleToStripeAddress.kt\ncom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt\n*L\n188#1:267,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u001a \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a,\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u000c\u0010\u0014\u001a\u00020\u0010*\u00020\u0010H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0007\"\u001a\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0019"
    }
    d2 = {
        "STREET_NAME_FIRST_COUNTRIES",
        "",
        "",
        "getSTREET_NAME_FIRST_COUNTRIES",
        "()Ljava/util/Set;",
        "filter",
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;",
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;",
        "type",
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;",
        "composeAddressLine1",
        "context",
        "Landroid/content/Context;",
        "addressLine1",
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;",
        "address",
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;",
        "composeJapaneseAddressLine1",
        "localityComponent",
        "premiseComponent",
        "combineDependentLocalityWithLine2",
        "modifyStripeAddressByCountry",
        "place",
        "transformGoogleToStripeAddress",
        "Lcom/stripe/android/model/Address;",
        "payments-ui-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final STREET_NAME_FIRST_COUNTRIES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xd

    .line 34
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "BE"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 35
    const-string v2, "BR"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 36
    const-string v2, "CH"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 37
    const-string v2, "DE"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 38
    const-string v2, "ES"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    .line 39
    const-string v2, "ID"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    .line 40
    const-string v2, "IT"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    .line 41
    const-string v2, "MX"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    .line 42
    const-string v2, "NL"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    .line 43
    const-string v2, "NO"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    .line 44
    const-string v2, "PL"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    .line 45
    const-string v2, "RU"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    .line 46
    const-string v2, "SE"

    aput-object v2, v0, v1

    .line 33
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->STREET_NAME_FIRST_COUNTRIES:Ljava/util/Set;

    return-void
.end method

.method public static final combineDependentLocalityWithLine2(Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    .line 127
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->copy$default(Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;

    move-result-object p0

    .line 128
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getDependentLocality()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 129
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getAddressLine2()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getAddressLine2()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getDependentLocality()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getDependentLocality()Ljava/lang/String;

    move-result-object v0

    .line 129
    :goto_0
    invoke-virtual {p0, v0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setAddressLine2(Ljava/lang/String;)V

    :cond_1
    return-object p0
.end method

.method public static final composeAddressLine1(Landroid/content/Context;Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;)Ljava/lang/String;
    .locals 6

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressLine1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->getStreetNumber()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v0, v1

    .line 59
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->getRoute()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    move-object v2, v1

    .line 60
    :cond_1
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getLocality()Ljava/lang/String;

    move-result-object v3

    .line 61
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 63
    const-string v5, "JP"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 64
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getAddressLine2()Ljava/lang/String;

    move-result-object p2

    .line 65
    invoke-static {p0, p1, v3, p2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->composeJapaneseAddressLine1(Landroid/content/Context;Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 66
    :cond_2
    move-object p0, v0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_4

    move-object p0, v2

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    return-object v1

    .line 69
    :cond_4
    :goto_0
    sget-object p0, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->STREET_NAME_FIRST_COUNTRIES:Ljava/util/Set;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0, v4}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    const-string p1, " "

    if-eqz p0, :cond_5

    .line 70
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 72
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final composeJapaneseAddressLine1(Landroid/content/Context;Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressLine1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->getSubLocalityLevel2()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 87
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->getSubLocalityLevel3()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->getSubLocalityLevel4()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    .line 89
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->getSubLocalityLevel3()Ljava/lang/String;

    move-result-object v2

    .line 90
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->getSubLocalityLevel4()Ljava/lang/String;

    move-result-object v3

    .line 91
    const-string v4, ""

    if-nez p3, :cond_1

    move-object p3, v4

    :cond_1
    if-nez p2, :cond_2

    move-object p2, v4

    .line 93
    :cond_2
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->getSubLocalityLevel2()Ljava/lang/String;

    move-result-object p1

    .line 98
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object p0

    .line 103
    sget-object v1, Ljava/util/Locale;->JAPANESE:Ljava/util/Locale;

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const-string v1, "-"

    if-eqz p0, :cond_4

    if-eqz v0, :cond_3

    .line 107
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 111
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    if-eqz v0, :cond_5

    .line 116
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 120
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p3, " "

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final filter(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;)Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;->getAddressComponents()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getTypes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_1
    check-cast v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    :cond_2
    return-object v0
.end method

.method public static final getSTREET_NAME_FIRST_COUNTRIES()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 33
    sget-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->STREET_NAME_FIRST_COUNTRIES:Ljava/util/Set;

    return-object v0
.end method

.method public static final modifyStripeAddressByCountry(Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "place"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    sget-object v0, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-static {p1, v0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->filter(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;)Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 140
    :goto_0
    sget-object v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-static {p1, v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->filter(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;)Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    const/16 v10, 0x7f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    .line 141
    invoke-static/range {v2 .. v11}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->copy$default(Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;

    move-result-object p0

    .line 142
    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0x850

    if-eq v4, v5, :cond_f

    const/16 v5, 0x8ae

    if-eq v4, v5, :cond_d

    const/16 v5, 0x91c

    if-eq v4, v5, :cond_b

    const/16 p1, 0x92b

    if-eq v4, p1, :cond_a

    const/16 p1, 0x946

    if-eq v4, p1, :cond_8

    const/16 p1, 0x9f8

    if-eq v4, p1, :cond_6

    const/16 p1, 0xa7e

    if-eq v4, p1, :cond_5

    const/16 p1, 0xb27    # 4.001E-42f

    if-eq v4, p1, :cond_4

    const/16 p1, 0x9ab

    if-eq v4, p1, :cond_3

    const/16 p1, 0x9ac

    if-eq v4, p1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string p1, "MY"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_2

    :cond_3
    const-string p1, "MX"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_2

    :cond_4
    const-string p1, "ZA"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_2

    :cond_5
    const-string p1, "TR"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_2

    :cond_6
    const-string p1, "PH"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    .line 174
    :cond_7
    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->combineDependentLocalityWithLine2(Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;

    move-result-object p0

    return-object p0

    .line 142
    :cond_8
    const-string p1, "JP"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_2

    .line 152
    :cond_9
    invoke-virtual {p0, v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setAddressLine2(Ljava/lang/String;)V

    return-object p0

    .line 142
    :cond_a
    const-string p1, "IT"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_2

    :cond_b
    const-string v0, "IE"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_2

    :cond_c
    if-eqz p1, :cond_12

    .line 145
    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setAdministrativeArea(Ljava/lang/String;)V

    .line 146
    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->combineDependentLocalityWithLine2(Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;

    move-result-object p0

    return-object p0

    .line 142
    :cond_d
    const-string p1, "ES"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_2

    :cond_e
    if-eqz v0, :cond_12

    .line 170
    invoke-virtual {p0, v0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setAdministrativeArea(Ljava/lang/String;)V

    return-object p0

    .line 142
    :cond_f
    const-string p1, "BR"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_2

    .line 158
    :cond_10
    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getLocality()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_11

    if-eqz v0, :cond_11

    .line 159
    invoke-virtual {p0, v0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setLocality(Ljava/lang/String;)V

    .line 161
    :cond_11
    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->combineDependentLocalityWithLine2(Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;

    move-result-object p0

    :cond_12
    :goto_2
    return-object p0
.end method

.method public static final transformGoogleToStripeAddress(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Landroid/content/Context;)Lcom/stripe/android/model/Address;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    new-instance v1, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 186
    new-instance v2, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 188
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;->getAddressComponents()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_12

    check-cast v0, Ljava/lang/Iterable;

    .line 267
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    .line 189
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getTypes()Ljava/util/List;

    move-result-object v4

    .line 192
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->STREET_NUMBER:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 193
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->setStreetNumber(Ljava/lang/String;)V

    goto :goto_0

    .line 195
    :cond_1
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ROUTE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 196
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->setRoute(Ljava/lang/String;)V

    goto :goto_0

    .line 198
    :cond_2
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->PREMISE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 199
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setAddressLine2(Ljava/lang/String;)V

    goto :goto_0

    .line 201
    :cond_3
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 202
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getLocality()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    .line 203
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setDependentLocality(Ljava/lang/String;)V

    goto :goto_0

    .line 205
    :cond_4
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setLocality(Ljava/lang/String;)V

    goto :goto_0

    .line 208
    :cond_5
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 209
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->setSubLocalityLevel2(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 211
    :cond_6
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_3:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 212
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->setSubLocalityLevel3(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 214
    :cond_7
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY_LEVEL_4:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 215
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;->setSubLocalityLevel4(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 217
    :cond_8
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->LOCALITY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    .line 218
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->SUBLOCALITY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    .line 219
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->POSTAL_TOWN:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    goto/16 :goto_1

    .line 222
    :cond_9
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_1:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 223
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setAdministrativeArea(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 225
    :cond_a
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_3:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 226
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getLocality()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    .line 227
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setLocality(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 230
    :cond_b
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->ADMINISTRATIVE_AREA_LEVEL_2:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 231
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getAdministrativeArea()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_c

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getDependentLocality()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_c

    .line 232
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setDependentLocality(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 234
    :cond_c
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setAdministrativeArea(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 237
    :cond_d
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->NEIGHBORHOOD:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 238
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getLocality()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_e

    .line 239
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setLocality(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 241
    :cond_e
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setDependentLocality(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 244
    :cond_f
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->POSTAL_CODE:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 245
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setPostalCode(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 247
    :cond_10
    sget-object v5, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->COUNTRY:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place$Type;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 248
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setCountry(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 220
    :cond_11
    :goto_1
    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setLocality(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 253
    :cond_12
    invoke-static {p1, v2, v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->composeAddressLine1(Landroid/content/Context;Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->setAddressLine1(Ljava/lang/String;)V

    .line 254
    invoke-static {v1, p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->modifyStripeAddressByCountry(Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;)Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;

    move-result-object p0

    .line 256
    new-instance p1, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {p1}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    .line 257
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getAddressLine1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/Address$Builder;->setLine1(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    .line 258
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getAddressLine2()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/Address$Builder;->setLine2(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    .line 259
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getLocality()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/Address$Builder;->setCity(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    .line 260
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getAdministrativeArea()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/Address$Builder;->setState(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    .line 261
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/Address$Builder;->setCountry(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    .line 262
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p0

    .line 263
    invoke-virtual {p0}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object p0

    return-object p0
.end method
