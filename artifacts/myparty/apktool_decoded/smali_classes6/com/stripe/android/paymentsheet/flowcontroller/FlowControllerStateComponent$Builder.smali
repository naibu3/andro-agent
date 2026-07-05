.class public interface abstract Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
.super Ljava/lang/Object;
.source "FlowControllerStateComponent.kt"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00002\n\u0008\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\'\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0012\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008H\'J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\'J\u0008\u0010\u000c\u001a\u00020\rH&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;",
        "",
        "statusBarColor",
        "",
        "(Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;",
        "application",
        "Landroid/app/Application;",
        "paymentElementCallbackIdentifier",
        "",
        "flowControllerViewModel",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
        "build",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
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
.method public abstract application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
.end method

.method public abstract flowControllerViewModel(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/inject/Named;
            value = "STATUS_BAR_COLOR"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method
