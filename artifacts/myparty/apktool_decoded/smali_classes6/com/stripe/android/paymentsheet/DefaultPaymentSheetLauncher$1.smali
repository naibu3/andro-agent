.class public final Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1;
.super Ljava/lang/Object;
.source "DefaultPaymentSheetLauncher.kt"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "onDestroy",
        "",
        "owner",
        "Landroidx/lifecycle/LifecycleOwner;",
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


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1;->this$0:Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    sget-object v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1;->this$0:Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->access$getPaymentElementCallbackIdentifier$p(Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->remove(Ljava/lang/String;)V

    .line 35
    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method
