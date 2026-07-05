.class public final Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;
.super Ljava/lang/Object;
.source "StripeConnection.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;",
        "",
        "<init>",
        "()V",
        "CHARSET",
        "",
        "kotlin.jvm.PlatformType",
        "getCHARSET$stripe_core_release",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "stripe-core_release"
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

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCHARSET$stripe_core_release()Ljava/lang/String;
    .locals 1

    .line 63
    invoke-static {}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->access$getCHARSET$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
