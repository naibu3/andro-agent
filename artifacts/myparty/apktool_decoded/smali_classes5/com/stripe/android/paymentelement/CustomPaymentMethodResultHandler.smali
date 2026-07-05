.class public final Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;
.super Ljava/lang/Object;
.source "CustomPaymentMethodResultHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002R\u000e\u0010\u000c\u001a\u00020\rX\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;",
        "",
        "<init>",
        "()V",
        "handleCustomPaymentMethodResult",
        "",
        "context",
        "Landroid/content/Context;",
        "customPaymentMethodResult",
        "Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;",
        "createResultIntent",
        "Landroid/content/Intent;",
        "EXTRA_CUSTOM_PAYMENT_METHOD_RESULT",
        "",
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
.field public static final $stable:I = 0x0

.field public static final EXTRA_CUSTOM_PAYMENT_METHOD_RESULT:Ljava/lang/String; = "custom_payment_method_result"

.field public static final INSTANCE:Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;->INSTANCE:Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createResultIntent(Landroid/content/Context;Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;)Landroid/content/Intent;
    .locals 2

    .line 29
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-class v1, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodProxyActivity;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x10000000

    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x4000000

    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x20000000

    .line 36
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    .line 37
    const-string v0, "custom_payment_method_result"

    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static final handleCustomPaymentMethodResult(Landroid/content/Context;Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customPaymentMethodResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;->INSTANCE:Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;->createResultIntent(Landroid/content/Context;Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
