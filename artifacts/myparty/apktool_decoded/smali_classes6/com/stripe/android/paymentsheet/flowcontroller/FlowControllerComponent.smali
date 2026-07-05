.class public interface abstract Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;
.super Ljava/lang/Object;
.source "FlowControllerComponent.kt"


# annotations
.annotation runtime Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerScope;
.end annotation

.annotation runtime Ldagger/Subcomponent;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008a\u0018\u00002\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;",
        "",
        "flowController",
        "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;",
        "getFlowController",
        "()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;",
        "stateComponent",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "getStateComponent",
        "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "Builder",
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
.method public abstract getFlowController()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;
.end method

.method public abstract getStateComponent()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
.end method
