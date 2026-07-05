.class public interface abstract Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent$Factory;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElementViewModelComponent.kt"


# annotations
.annotation runtime Ldagger/Component$Factory;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0008\u001a\u00020\t2\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0002\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent$Factory;",
        "",
        "build",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "application",
        "Landroid/app/Application;",
        "paymentElementCallbackIdentifier",
        "",
        "statusBarColor",
        "",
        "(Landroidx/lifecycle/SavedStateHandle;Landroid/app/Application;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent;",
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


# virtual methods
.method public abstract build(Landroidx/lifecycle/SavedStateHandle;Landroid/app/Application;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelComponent;
    .param p1    # Landroidx/lifecycle/SavedStateHandle;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p2    # Landroid/app/Application;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation

        .annotation runtime Ldagger/BindsInstance;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Ldagger/BindsInstance;
        .end annotation

        .annotation runtime Ljavax/inject/Named;
            value = "STATUS_BAR_COLOR"
        .end annotation
    .end param
.end method
