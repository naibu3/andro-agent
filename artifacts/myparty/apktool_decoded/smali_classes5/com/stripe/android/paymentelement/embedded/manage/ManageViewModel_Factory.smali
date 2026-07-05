.class public final Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;
.super Ljava/lang/Object;
.source "ManageViewModel_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final componentProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final customViewModelScopeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;->componentProvider:Ldagger/internal/Provider;

    .line 36
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;->customViewModelScopeProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;"
        }
    .end annotation

    .line 52
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;
    .locals 1

    .line 57
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;Lkotlinx/coroutines/CoroutineScope;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;->componentProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;->customViewModelScopeProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v0, v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;->newInstance(Lcom/stripe/android/paymentelement/embedded/manage/ManageComponent;Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel_Factory;->get()Lcom/stripe/android/paymentelement/embedded/manage/ManageViewModel;

    move-result-object v0

    return-object v0
.end method
