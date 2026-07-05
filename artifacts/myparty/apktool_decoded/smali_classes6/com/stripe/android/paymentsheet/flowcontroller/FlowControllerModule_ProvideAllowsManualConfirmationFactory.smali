.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideAllowsManualConfirmationFactory;
.super Ljava/lang/Object;
.source "FlowControllerModule_ProvideAllowsManualConfirmationFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideAllowsManualConfirmationFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideAllowsManualConfirmationFactory;
    .locals 1

    .line 32
    sget-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideAllowsManualConfirmationFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideAllowsManualConfirmationFactory;

    return-object v0
.end method

.method public static provideAllowsManualConfirmation()Z
    .locals 1

    .line 36
    sget-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;->INSTANCE:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;->provideAllowsManualConfirmation()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public get()Ljava/lang/Boolean;
    .locals 1

    .line 28
    invoke-static {}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideAllowsManualConfirmationFactory;->provideAllowsManualConfirmation()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideAllowsManualConfirmationFactory;->get()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
