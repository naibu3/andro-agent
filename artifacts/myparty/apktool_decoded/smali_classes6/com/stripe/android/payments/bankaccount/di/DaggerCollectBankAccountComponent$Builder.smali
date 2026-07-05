.class final Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerCollectBankAccountComponent.java"

# interfaces
.implements Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private application:Landroid/app/Application;

.field private configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

.field private savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private viewEffect:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic application(Landroid/app/Application;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 0

    .line 51
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->application(Landroid/app/Application;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public application(Landroid/app/Application;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
    .locals 0

    .line 62
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->application:Landroid/app/Application;

    return-object p0
.end method

.method public build()Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;
    .locals 10

    .line 86
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->application:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 87
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->viewEffect:Lkotlinx/coroutines/flow/MutableSharedFlow;

    const-class v1, Lkotlinx/coroutines/flow/MutableSharedFlow;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 88
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 89
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    const-class v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 90
    new-instance v2, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;

    new-instance v3, Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-direct {v3}, Lcom/stripe/android/core/injection/CoroutineContextModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    iget-object v5, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->application:Landroid/app/Application;

    iget-object v6, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->viewEffect:Lkotlinx/coroutines/flow/MutableSharedFlow;

    iget-object v7, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    iget-object v8, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;Lkotlinx/coroutines/flow/MutableSharedFlow;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent-IA;)V

    return-object v2
.end method

.method public bridge synthetic configuration(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 0

    .line 51
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->configuration(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public configuration(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
    .locals 0

    .line 80
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    return-object p0
.end method

.method public bridge synthetic savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 0

    .line 51
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public savedStateHandle(Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
    .locals 0

    .line 74
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-object p0
.end method

.method public bridge synthetic viewEffect(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;
    .locals 0

    .line 51
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->viewEffect(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public viewEffect(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;"
        }
    .end annotation

    .line 68
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/MutableSharedFlow;

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$Builder;->viewEffect:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method
