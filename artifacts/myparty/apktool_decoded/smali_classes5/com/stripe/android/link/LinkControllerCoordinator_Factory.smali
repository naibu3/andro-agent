.class public final Lcom/stripe/android/link/LinkControllerCoordinator_Factory;
.super Ljava/lang/Object;
.source "LinkControllerCoordinator_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/link/LinkControllerCoordinator;",
        ">;"
    }
.end annotation


# instance fields
.field private final activityResultRegistryOwnerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroidx/activity/result/ActivityResultRegistryOwner;",
            ">;"
        }
    .end annotation
.end field

.field private final authenticationCallbackProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkController$AuthenticationCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final interactorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkControllerInteractor;",
            ">;"
        }
    .end annotation
.end field

.field private final lifecycleOwnerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/LifecycleOwner;",
            ">;"
        }
    .end annotation
.end field

.field private final linkActivityContractProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedPaymentMethodCallbackProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkControllerInteractor;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/LifecycleOwner;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/activity/result/ActivityResultRegistryOwner;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkController$AuthenticationCallback;",
            ">;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->interactorProvider:Ldagger/internal/Provider;

    .line 49
    iput-object p2, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->lifecycleOwnerProvider:Ldagger/internal/Provider;

    .line 50
    iput-object p3, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->activityResultRegistryOwnerProvider:Ldagger/internal/Provider;

    .line 51
    iput-object p4, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->linkActivityContractProvider:Ldagger/internal/Provider;

    .line 52
    iput-object p5, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->selectedPaymentMethodCallbackProvider:Ldagger/internal/Provider;

    .line 53
    iput-object p6, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->authenticationCallbackProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/LinkControllerCoordinator_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkControllerInteractor;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/LifecycleOwner;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/activity/result/ActivityResultRegistryOwner;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkController$AuthenticationCallback;",
            ">;)",
            "Lcom/stripe/android/link/LinkControllerCoordinator_Factory;"
        }
    .end annotation

    .line 78
    new-instance v0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/link/LinkControllerCoordinator_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkControllerInteractor;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroidx/lifecycle/LifecycleOwner;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroidx/activity/result/ActivityResultRegistryOwner;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkController$AuthenticationCallback;",
            ">;)",
            "Lcom/stripe/android/link/LinkControllerCoordinator_Factory;"
        }
    .end annotation

    .line 68
    new-instance v0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v1

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v2

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v3

    invoke-static {p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v4

    invoke-static {p4}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v5

    invoke-static {p5}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/link/LinkControllerInteractor;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)Lcom/stripe/android/link/LinkControllerCoordinator;
    .locals 7

    .line 86
    new-instance v0, Lcom/stripe/android/link/LinkControllerCoordinator;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/LinkControllerCoordinator;-><init>(Lcom/stripe/android/link/LinkControllerInteractor;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/LinkControllerCoordinator;
    .locals 7

    .line 58
    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->interactorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/link/LinkControllerInteractor;

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->lifecycleOwnerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/LifecycleOwner;

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->activityResultRegistryOwnerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/activity/result/ActivityResultRegistryOwner;

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->linkActivityContractProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/link/NativeLinkActivityContract;

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->selectedPaymentMethodCallbackProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;

    iget-object v0, p0, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->authenticationCallbackProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/link/LinkController$AuthenticationCallback;

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->newInstance(Lcom/stripe/android/link/LinkControllerInteractor;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)Lcom/stripe/android/link/LinkControllerCoordinator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->get()Lcom/stripe/android/link/LinkControllerCoordinator;

    move-result-object v0

    return-object v0
.end method
