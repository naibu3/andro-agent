.class public final Lcom/stripe/android/model/ElementsSessionKt;
.super Ljava/lang/Object;
.source "ElementsSession.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\"\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "LinkSupportedFundingSources",
        "",
        "",
        "payments-core_release"
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
.field private static final LinkSupportedFundingSources:Ljava/util/Set;
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

    const/4 v0, 0x2

    .line 9
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "card"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "bank_account"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/ElementsSessionKt;->LinkSupportedFundingSources:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic access$getLinkSupportedFundingSources$p()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Lcom/stripe/android/model/ElementsSessionKt;->LinkSupportedFundingSources:Ljava/util/Set;

    return-object v0
.end method
