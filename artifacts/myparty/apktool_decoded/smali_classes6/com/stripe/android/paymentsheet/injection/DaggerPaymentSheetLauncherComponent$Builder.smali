.class final Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerPaymentSheetLauncherComponent.java"

# interfaces
.implements Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private application:Landroid/app/Application;

.field private paymentElementCallbackIdentifier:Ljava/lang/String;

.field private savedStateHandle:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;
    .locals 0

    .line 179
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->application:Landroid/app/Application;

    return-object p0
.end method

.method public bridge synthetic application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;
    .locals 0

    .line 170
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;
    .locals 12

    .line 197
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->application:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 198
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 199
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 200
    new-instance v2, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$PaymentSheetLauncherComponentImpl;

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

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->application:Landroid/app/Application;

    iget-object v9, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    iget-object v10, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$PaymentSheetLauncherComponentImpl;-><init>(Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/common/di/MobileSessionIdModule;Lcom/stripe/android/paymentsheet/injection/LinkHoldbackExposureModule;Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent-IA;)V

    return-object v2
.end method

.method public paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;
    .locals 0

    .line 191
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;
    .locals 0

    .line 170
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;
    .locals 0

    .line 185
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-object p0
.end method

.method public bridge synthetic savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;
    .locals 0

    .line 170
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;->savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method
