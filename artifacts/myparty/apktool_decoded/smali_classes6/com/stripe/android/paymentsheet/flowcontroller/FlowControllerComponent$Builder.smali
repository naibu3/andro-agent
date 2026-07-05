.class public interface abstract Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
.super Ljava/lang/Object;
.source "FlowControllerComponent.kt"


# annotations
.annotation runtime Ldagger/Subcomponent$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008H\'J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000cH\'J\u0012\u0010\r\u001a\u00020\u00002\u0008\u0008\u0001\u0010\r\u001a\u00020\u000eH\'J\u0008\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;",
        "",
        "lifeCycleOwner",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "activityResultRegistryOwner",
        "Landroidx/activity/result/ActivityResultRegistryOwner;",
        "paymentOptionResultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;",
        "paymentResultCallback",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "initializedViaCompose",
        "",
        "build",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;",
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
.method public abstract activityResultCaller(Landroidx/activity/result/ActivityResultCaller;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract activityResultRegistryOwner(Landroidx/activity/result/ActivityResultRegistryOwner;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;
.end method

.method public abstract initializedViaCompose(Z)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
    .param p1    # Z
        .annotation runtime Lcom/stripe/android/paymentsheet/InitializedViaCompose;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract lifeCycleOwner(Landroidx/lifecycle/LifecycleOwner;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract paymentOptionResultCallback(Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract paymentResultCallback(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method
