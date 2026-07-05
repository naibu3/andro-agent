.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementDefaultsKt;
.super Ljava/lang/Object;
.source "AddressElementDefaults.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\"\u001a\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "AUTOCOMPLETE_DEFAULT_COUNTRIES",
        "",
        "",
        "getAUTOCOMPLETE_DEFAULT_COUNTRIES",
        "()Ljava/util/Set;",
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


# static fields
.field private static final AUTOCOMPLETE_DEFAULT_COUNTRIES:Ljava/util/Set;
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

    const/16 v0, 0x14

    .line 4
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "AU"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "BE"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "BR"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "CA"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "CH"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "DE"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "ES"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "FR"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "GB"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "IE"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "IT"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "MX"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "NO"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "NL"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    .line 5
    const-string v2, "PL"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "RU"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "SE"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "TR"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "US"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "ZA"

    aput-object v2, v0, v1

    .line 3
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementDefaultsKt;->AUTOCOMPLETE_DEFAULT_COUNTRIES:Ljava/util/Set;

    return-void
.end method

.method public static final getAUTOCOMPLETE_DEFAULT_COUNTRIES()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementDefaultsKt;->AUTOCOMPLETE_DEFAULT_COUNTRIES:Ljava/util/Set;

    return-object v0
.end method
