.class public final Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;
.super Ljava/lang/Object;
.source "UpdateCardScreenViewModel_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final billingDetailsUpdateFlowProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
            ">;"
        }
    .end annotation
.end field

.field private final completeLinkFlowProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
            ">;"
        }
    .end annotation
.end field

.field private final configurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final dismissWithResultProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private final dismissalCoordinatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccountManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;"
        }
    .end annotation
.end field

.field private final linkLaunchModeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentDetailsIdProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
            ">;)V"
        }
    .end annotation

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->loggerProvider:Ldagger/internal/Provider;

    .line 70
    iput-object p2, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->linkAccountManagerProvider:Ldagger/internal/Provider;

    .line 71
    iput-object p3, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->navigationManagerProvider:Ldagger/internal/Provider;

    .line 72
    iput-object p4, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->dismissalCoordinatorProvider:Ldagger/internal/Provider;

    .line 73
    iput-object p5, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->configurationProvider:Ldagger/internal/Provider;

    .line 74
    iput-object p6, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->linkLaunchModeProvider:Ldagger/internal/Provider;

    .line 75
    iput-object p7, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->completeLinkFlowProvider:Ldagger/internal/Provider;

    .line 76
    iput-object p8, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->dismissWithResultProvider:Ldagger/internal/Provider;

    .line 77
    iput-object p9, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->paymentDetailsIdProvider:Ldagger/internal/Provider;

    .line 78
    iput-object p10, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->billingDetailsUpdateFlowProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;>;",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
            ">;)",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;"
        }
    .end annotation

    .line 110
    new-instance v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;>;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
            ">;)",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;"
        }
    .end annotation

    .line 97
    new-instance v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;

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

    invoke-static/range {p5 .. p5}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v6

    invoke-static/range {p6 .. p6}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v7

    invoke-static/range {p7 .. p7}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v8

    invoke-static/range {p8 .. p8}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v9

    invoke-static/range {p9 .. p9}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
            ")",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;"
        }
    .end annotation

    .line 119
    new-instance v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;-><init>(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;
    .locals 11

    .line 83
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->loggerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->linkAccountManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->navigationManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/uicore/navigation/NavigationManager;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->dismissalCoordinatorProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/link/LinkDismissalCoordinator;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->configurationProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/link/LinkConfiguration;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->linkLaunchModeProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/link/LinkLaunchMode;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->completeLinkFlowProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->dismissWithResultProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->paymentDetailsIdProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->billingDetailsUpdateFlowProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->newInstance(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel_Factory;->get()Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    move-result-object v0

    return-object v0
.end method
