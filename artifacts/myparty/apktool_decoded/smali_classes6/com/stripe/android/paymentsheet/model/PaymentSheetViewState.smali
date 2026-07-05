.class public abstract Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;
.super Ljava/lang/Object;
.source "PaymentSheetViewState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;,
        Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;,
        Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;,
        Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0004\u0008\t\n\u000bB\u0015\u0008\u0004\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0003\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
        "",
        "errorMessage",
        "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;)V",
        "getErrorMessage",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;",
        "Reset",
        "StartProcessing",
        "FinishProcessing",
        "UserErrorMessage",
        "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final errorMessage:Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;->errorMessage:Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    move-object p1, p3

    .line 10
    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;)V

    return-void
.end method


# virtual methods
.method public final getErrorMessage()Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;->errorMessage:Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;

    return-object v0
.end method
