.class public abstract Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;
.super Ljava/lang/Object;
.source "CustomPaymentMethodResultHandler.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Canceled;,
        Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;,
        Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Completed;,
        Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Failed;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "Completed",
        "Canceled",
        "Failed",
        "Companion",
        "Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Canceled;",
        "Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Completed;",
        "Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Failed;",
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

.field public static final Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;-><init>()V

    return-void
.end method

.method public static final canceled()Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;->canceled()Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    move-result-object v0

    return-object v0
.end method

.method public static final completed()Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;->completed()Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    move-result-object v0

    return-object v0
.end method

.method public static final failed()Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;->failed()Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    move-result-object v0

    return-object v0
.end method

.method public static final failed(Ljava/lang/String;)Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;->failed(Ljava/lang/String;)Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    move-result-object p0

    return-object p0
.end method
