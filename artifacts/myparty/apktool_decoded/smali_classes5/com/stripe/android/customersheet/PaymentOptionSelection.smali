.class public abstract Lcom/stripe/android/customersheet/PaymentOptionSelection;
.super Ljava/lang/Object;
.source "CustomerSheetResult.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/PaymentOptionSelection$GooglePay;,
        Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0002\u0008\tB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/PaymentOptionSelection;",
        "",
        "paymentOption",
        "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/model/PaymentOption;)V",
        "getPaymentOption",
        "()Lcom/stripe/android/paymentsheet/model/PaymentOption;",
        "PaymentMethod",
        "GooglePay",
        "Lcom/stripe/android/customersheet/PaymentOptionSelection$GooglePay;",
        "Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;",
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
.field private final paymentOption:Lcom/stripe/android/paymentsheet/model/PaymentOption;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentOption;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/stripe/android/customersheet/PaymentOptionSelection;->paymentOption:Lcom/stripe/android/paymentsheet/model/PaymentOption;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/PaymentOptionSelection;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentOption;)V

    return-void
.end method


# virtual methods
.method public getPaymentOption()Lcom/stripe/android/paymentsheet/model/PaymentOption;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/stripe/android/customersheet/PaymentOptionSelection;->paymentOption:Lcom/stripe/android/paymentsheet/model/PaymentOption;

    return-object v0
.end method
