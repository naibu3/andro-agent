.class public final Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler$Companion;
.super Ljava/lang/Object;
.source "UnsupportedNextActionHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R%\u0010\u0004\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00080\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler$Companion;",
        "",
        "<init>",
        "()V",
        "ACTION_DEPENDENCY_MAP",
        "",
        "Ljava/lang/Class;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "",
        "getACTION_DEPENDENCY_MAP",
        "()Ljava/util/Map;",
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

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getACTION_DEPENDENCY_MAP()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 51
    invoke-static {}, Lcom/stripe/android/payments/core/authentication/UnsupportedNextActionHandler;->access$getACTION_DEPENDENCY_MAP$cp()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
