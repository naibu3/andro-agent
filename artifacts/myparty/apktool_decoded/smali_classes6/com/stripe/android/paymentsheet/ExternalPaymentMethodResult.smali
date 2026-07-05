.class public abstract Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
.super Ljava/lang/Object;
.source "ExternalPaymentMethodResultHandler.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;,
        Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;,
        Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Completed;,
        Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \n2\u00020\u0001:\u0004\u0007\u0008\t\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H \u00a2\u0006\u0002\u0008\u0006\u0082\u0001\u0003\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "toPaymentResult",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "toPaymentResult$paymentsheet_release",
        "Completed",
        "Canceled",
        "Failed",
        "Companion",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Canceled;",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Completed;",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Failed;",
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


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;->Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;-><init>()V

    return-void
.end method

.method public static final canceled()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;->Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;->canceled()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    move-result-object v0

    return-object v0
.end method

.method public static final completed()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;->Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;->completed()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    move-result-object v0

    return-object v0
.end method

.method public static final failed()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;->Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;->failed()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    move-result-object v0

    return-object v0
.end method

.method public static final failed(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;->Companion:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult$Companion;->failed(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract toPaymentResult$paymentsheet_release()Lcom/stripe/android/payments/paymentlauncher/PaymentResult;
.end method
