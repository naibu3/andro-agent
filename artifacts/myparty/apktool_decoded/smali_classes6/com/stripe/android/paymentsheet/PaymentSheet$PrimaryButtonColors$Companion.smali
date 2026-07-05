.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors$Companion;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors$Companion;",
        "",
        "<init>",
        "()V",
        "defaultLight",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;",
        "getDefaultLight",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;",
        "defaultDark",
        "getDefaultDark",
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

    .line 2485
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDefaultDark()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;
    .locals 1

    .line 2493
    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;->access$getDefaultDark$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultLight()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;
    .locals 1

    .line 2486
    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;->access$getDefaultLight$cp()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;

    move-result-object v0

    return-object v0
.end method
