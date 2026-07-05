.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;",
        "",
        "<init>",
        "()V",
        "setPaymentSheetCallbacks",
        "",
        "callbacks",
        "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;",
        "setFlowControllerCallbacks",
        "resetCustomer",
        "context",
        "Landroid/content/Context;",
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

    .line 3828
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$setFlowControllerCallbacks(Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V
    .locals 0

    .line 3828
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;->setFlowControllerCallbacks(Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V

    return-void
.end method

.method public static final synthetic access$setPaymentSheetCallbacks(Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V
    .locals 0

    .line 3828
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;->setPaymentSheetCallbacks(Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V

    return-void
.end method

.method private final setFlowControllerCallbacks(Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V
    .locals 2

    .line 3834
    sget-object v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    const-string v1, "FlowController"

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->set(Ljava/lang/String;Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V

    return-void
.end method

.method private final setPaymentSheetCallbacks(Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V
    .locals 2

    .line 3830
    sget-object v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    const-string v1, "PaymentSheet"

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->set(Ljava/lang/String;Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;)V

    return-void
.end method


# virtual methods
.method public final resetCustomer(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3847
    new-instance v0, Lcom/stripe/android/link/account/LinkStore;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/account/LinkStore;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkStore;->clear()V

    return-void
.end method
