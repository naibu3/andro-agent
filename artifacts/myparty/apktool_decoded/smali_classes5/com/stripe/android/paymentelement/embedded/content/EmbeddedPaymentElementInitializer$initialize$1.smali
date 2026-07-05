.class public final Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer$initialize$1;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElementInitializer.kt"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;->initialize(Z)V
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
        "com/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer$initialize$1",
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
.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer$initialize$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    sget-object p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->INSTANCE:Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer$initialize$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;->access$getPaymentElementCallbackIdentifier$p(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackReferences;->remove(Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer$initialize$1;->this$0:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;

    invoke-static {p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;->access$getContentHelper$p(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementInitializer;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;->clearSheetLauncher()V

    return-void
.end method
