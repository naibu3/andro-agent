.class final Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;
.super Ljava/lang/Object;
.source "DaggerLinkControllerComponent.java"

# interfaces
.implements Lcom/stripe/android/link/injection/LinkControllerPresenterComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkControllerComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LinkControllerPresenterComponentImpl"
.end annotation


# instance fields
.field private activityResultRegistryOwnerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroidx/activity/result/ActivityResultRegistryOwner;",
            ">;"
        }
    .end annotation
.end field

.field private authenticationCallbackProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkController$AuthenticationCallback;",
            ">;"
        }
    .end annotation
.end field

.field private lifecycleOwnerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/LifecycleOwner;",
            ">;"
        }
    .end annotation
.end field

.field private final linkControllerComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

.field private linkControllerCoordinatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkControllerCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private final linkControllerPresenterComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;

.field private nativeLinkActivityContractProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;"
        }
    .end annotation
.end field

.field private presentPaymentMethodsCallbackProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)V
    .locals 0

    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 292
    iput-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->linkControllerPresenterComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;

    .line 312
    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->linkControllerComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    move-object p1, p0

    .line 314
    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->initialize(Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;Lcom/stripe/android/link/injection/DaggerLinkControllerComponent-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;-><init>(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)V

    return-void
.end method

.method private initialize(Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)V
    .locals 6

    .line 323
    invoke-static {p2}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->lifecycleOwnerProvider:Ldagger/internal/Provider;

    .line 324
    invoke-static {p3}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->activityResultRegistryOwnerProvider:Ldagger/internal/Provider;

    .line 325
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->linkControllerComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    invoke-static {p1}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;->-$$Nest$fgetpaymentElementCallbackIdentifierProvider(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/link/NativeLinkActivityContract_Factory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/link/NativeLinkActivityContract_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->nativeLinkActivityContractProvider:Ldagger/internal/Provider;

    .line 326
    invoke-static {p4}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->presentPaymentMethodsCallbackProvider:Ldagger/internal/Provider;

    .line 327
    invoke-static {p5}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->authenticationCallbackProvider:Ldagger/internal/Provider;

    .line 328
    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->linkControllerComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    invoke-static {p1}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;->-$$Nest$fgetlinkControllerInteractorProvider(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;)Ldagger/internal/Provider;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->lifecycleOwnerProvider:Ldagger/internal/Provider;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->activityResultRegistryOwnerProvider:Ldagger/internal/Provider;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->nativeLinkActivityContractProvider:Ldagger/internal/Provider;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->presentPaymentMethodsCallbackProvider:Ldagger/internal/Provider;

    iget-object v5, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->authenticationCallbackProvider:Ldagger/internal/Provider;

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/link/LinkControllerCoordinator_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/LinkControllerCoordinator_Factory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->linkControllerCoordinatorProvider:Ldagger/internal/Provider;

    return-void
.end method


# virtual methods
.method public getPresenter()Lcom/stripe/android/link/LinkController$Presenter;
    .locals 3

    .line 333
    new-instance v0, Lcom/stripe/android/link/LinkController$Presenter;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->linkControllerCoordinatorProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/LinkControllerCoordinator;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerPresenterComponentImpl;->linkControllerComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;

    invoke-static {v2}, Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;->-$$Nest$fgetlinkControllerInteractorProvider(Lcom/stripe/android/link/injection/DaggerLinkControllerComponent$LinkControllerComponentImpl;)Ldagger/internal/Provider;

    move-result-object v2

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/LinkControllerInteractor;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/LinkController$Presenter;-><init>(Lcom/stripe/android/link/LinkControllerCoordinator;Lcom/stripe/android/link/LinkControllerInteractor;)V

    return-object v0
.end method
