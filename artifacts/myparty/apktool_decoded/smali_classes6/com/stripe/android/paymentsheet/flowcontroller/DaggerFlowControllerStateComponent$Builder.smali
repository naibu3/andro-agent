.class final Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerFlowControllerStateComponent.java"

# interfaces
.implements Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private application:Landroid/app/Application;

.field private flowControllerViewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

.field private paymentElementCallbackIdentifier:Ljava/lang/String;

.field private statusBarColor:Ljava/lang/Integer;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;
    .locals 0

    .line 230
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->application:Landroid/app/Application;

    return-object p0
.end method

.method public bridge synthetic application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .locals 0

    .line 213
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
    .locals 13

    .line 248
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->application:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 249
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 250
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->flowControllerViewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    const-class v1, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 251
    new-instance v2, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;

    new-instance v3, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;

    invoke-direct {v3}, Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoroutineContextModule;-><init>()V

    new-instance v5, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v5}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    new-instance v6, Lcom/stripe/android/common/di/MobileSessionIdModule;

    invoke-direct {v6}, Lcom/stripe/android/common/di/MobileSessionIdModule;-><init>()V

    new-instance v7, Lcom/stripe/android/paymentsheet/injection/LinkHoldbackExposureModule;

    invoke-direct {v7}, Lcom/stripe/android/paymentsheet/injection/LinkHoldbackExposureModule;-><init>()V

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->statusBarColor:Ljava/lang/Integer;

    iget-object v9, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->application:Landroid/app/Application;

    iget-object v10, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    iget-object v11, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->flowControllerViewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;-><init>(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Lcom/stripe/android/paymentsheet/injection/LinkHoldbackExposureModule;Ljava/lang/Integer;Landroid/app/Application;Ljava/lang/String;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent-IA;)V

    return-object v2
.end method

.method public flowControllerViewModel(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;
    .locals 0

    .line 242
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->flowControllerViewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    return-object p0
.end method

.method public bridge synthetic flowControllerViewModel(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .locals 0

    .line 213
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->flowControllerViewModel(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;
    .locals 0

    .line 236
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .locals 0

    .line 213
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->statusBarColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public bridge synthetic statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .locals 0

    .line 213
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;->statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;

    move-result-object p1

    return-object p1
.end method
