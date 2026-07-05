.class public final Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;
.super Ljava/lang/Object;
.source "ExternalPaymentMethodResultHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u00a2\u0006\u0002\u0008\u000cR\u000e\u0010\r\u001a\u00020\u000eX\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;",
        "",
        "<init>",
        "()V",
        "onExternalPaymentMethodResult",
        "",
        "context",
        "Landroid/content/Context;",
        "externalPaymentMethodResult",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;",
        "createResultIntent",
        "Landroid/content/Intent;",
        "createResultIntent$paymentsheet_release",
        "EXTRA_EXTERNAL_PAYMENT_METHOD_RESULT",
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

.field public static final EXTRA_EXTERNAL_PAYMENT_METHOD_RESULT:Ljava/lang/String; = "external_payment_method_result"

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;->INSTANCE:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final onExternalPaymentMethodResult(Landroid/content/Context;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalPaymentMethodResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    sget-object v0, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;->INSTANCE:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;->createResultIntent$paymentsheet_release(Landroid/content/Context;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final createResultIntent$paymentsheet_release(Landroid/content/Context;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalPaymentMethodResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-class v1, Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x10000000

    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x4000000

    .line 36
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x20000000

    .line 38
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    .line 39
    const-string v0, "external_payment_method_result"

    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
