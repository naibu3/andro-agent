.class public final Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;
.super Lcom/stripe/android/customersheet/PaymentOptionSelection;
.source "CustomerSheetResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/PaymentOptionSelection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PaymentMethod"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;",
        "Lcom/stripe/android/customersheet/PaymentOptionSelection;",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentOption",
        "Lcom/stripe/android/paymentsheet/model/PaymentOption;",
        "<init>",
        "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentOption;)V",
        "getPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "getPaymentOption",
        "()Lcom/stripe/android/paymentsheet/model/PaymentOption;",
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
.field private final paymentMethod:Lcom/stripe/android/model/PaymentMethod;

.field private final paymentOption:Lcom/stripe/android/paymentsheet/model/PaymentOption;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentOption;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOption"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p2, v0}, Lcom/stripe/android/customersheet/PaymentOptionSelection;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentOption;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    iput-object p1, p0, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    .line 54
    iput-object p2, p0, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;->paymentOption:Lcom/stripe/android/paymentsheet/model/PaymentOption;

    return-void
.end method


# virtual methods
.method public final getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;->paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public getPaymentOption()Lcom/stripe/android/paymentsheet/model/PaymentOption;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/stripe/android/customersheet/PaymentOptionSelection$PaymentMethod;->paymentOption:Lcom/stripe/android/paymentsheet/model/PaymentOption;

    return-object v0
.end method
