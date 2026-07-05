.class public final Lcom/stripe/android/cards/DefaultStaticCardAccountRanges$Companion;
.super Ljava/lang/Object;
.source "DefaultStaticCardAccountRanges.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000e\u0010\u0003\u001a\u0004\u0008\u000f\u0010\u000bR\"\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0011\u0010\u0003\u001a\u0004\u0008\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0003\u001a\u0004\u0008\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/cards/DefaultStaticCardAccountRanges$Companion;",
        "",
        "<init>",
        "()V",
        "VISA_ACCOUNTS",
        "",
        "Lcom/stripe/android/model/AccountRange;",
        "MASTERCARD_ACCOUNTS",
        "AMEX_ACCOUNTS",
        "DISCOVER_ACCOUNTS",
        "getDISCOVER_ACCOUNTS$payments_core_release",
        "()Ljava/util/List;",
        "JCB_ACCOUNTS",
        "UNIONPAY16_ACCOUNTS",
        "getUNIONPAY16_ACCOUNTS$payments_core_release$annotations",
        "getUNIONPAY16_ACCOUNTS$payments_core_release",
        "UNIONPAY19_ACCOUNTS",
        "getUNIONPAY19_ACCOUNTS$payments_core_release$annotations",
        "getUNIONPAY19_ACCOUNTS$payments_core_release",
        "DINERSCLUB16_ACCOUNT_RANGES",
        "DINERSCLUB14_ACCOUNT_RANGES",
        "CARTES_BANCAIRES_ACCOUNT_RANGES",
        "getCARTES_BANCAIRES_ACCOUNT_RANGES$annotations",
        "getCARTES_BANCAIRES_ACCOUNT_RANGES",
        "ACCOUNTS",
        "getACCOUNTS$payments_core_release",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getCARTES_BANCAIRES_ACCOUNT_RANGES$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUNIONPAY16_ACCOUNTS$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getUNIONPAY19_ACCOUNTS$payments_core_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getACCOUNTS$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;"
        }
    .end annotation

    .line 199
    invoke-static {}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;->access$getACCOUNTS$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getCARTES_BANCAIRES_ACCOUNT_RANGES()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;"
        }
    .end annotation

    .line 179
    invoke-static {}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;->access$getCARTES_BANCAIRES_ACCOUNT_RANGES$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getDISCOVER_ACCOUNTS$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;"
        }
    .end annotation

    .line 69
    invoke-static {}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;->access$getDISCOVER_ACCOUNTS$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getUNIONPAY16_ACCOUNTS$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;"
        }
    .end annotation

    .line 105
    invoke-static {}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;->access$getUNIONPAY16_ACCOUNTS$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getUNIONPAY19_ACCOUNTS$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;"
        }
    .end annotation

    .line 129
    invoke-static {}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;->access$getUNIONPAY19_ACCOUNTS$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
