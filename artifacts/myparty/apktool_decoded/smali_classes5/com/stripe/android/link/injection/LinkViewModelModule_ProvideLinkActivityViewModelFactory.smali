.class public final Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;
.super Ljava/lang/Object;
.source "LinkViewModelModule_ProvideLinkActivityViewModelFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final autocompleteLauncherProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
            ">;"
        }
    .end annotation
.end field

.field private final componentProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/injection/NativeLinkComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final defaultConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccountHolderProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
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

.field private final linkAttestationCheckProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
            ">;"
        }
    .end annotation
.end field

.field private final linkConfigurationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final linkConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private final linkExpressModeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkExpressMode;",
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

.field private final navigationManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandleProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/injection/NativeLinkComponent;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkExpressMode;",
            ">;)V"
        }
    .end annotation

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->componentProvider:Ldagger/internal/Provider;

    .line 83
    iput-object p2, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->defaultConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;

    .line 84
    iput-object p3, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkAccountManagerProvider:Ldagger/internal/Provider;

    .line 85
    iput-object p4, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkAccountHolderProvider:Ldagger/internal/Provider;

    .line 86
    iput-object p5, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->eventReporterProvider:Ldagger/internal/Provider;

    .line 87
    iput-object p6, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkConfigurationProvider:Ldagger/internal/Provider;

    .line 88
    iput-object p7, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkAttestationCheckProvider:Ldagger/internal/Provider;

    .line 89
    iput-object p8, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;

    .line 90
    iput-object p9, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->navigationManagerProvider:Ldagger/internal/Provider;

    .line 91
    iput-object p10, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->savedStateHandleProvider:Ldagger/internal/Provider;

    .line 92
    iput-object p11, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkLaunchModeProvider:Ldagger/internal/Provider;

    .line 93
    iput-object p12, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->autocompleteLauncherProvider:Ldagger/internal/Provider;

    .line 94
    iput-object p13, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkExpressModeProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/injection/NativeLinkComponent;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/LinkExpressMode;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;"
        }
    .end annotation

    .line 133
    new-instance v0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/injection/NativeLinkComponent;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/LinkExpressMode;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;"
        }
    .end annotation

    .line 116
    new-instance v0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v1

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v3

    invoke-static/range {p3 .. p3}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v4

    invoke-static/range {p4 .. p4}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

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

    invoke-static/range {p10 .. p10}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v11

    invoke-static/range {p11 .. p11}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v12

    invoke-static/range {p12 .. p12}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v13

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static provideLinkActivityViewModel(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/attestation/LinkAttestationCheck;Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;Lcom/stripe/android/uicore/navigation/NavigationManager;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 14

    .line 145
    sget-object v0, Lcom/stripe/android/link/injection/LinkViewModelModule;->INSTANCE:Lcom/stripe/android/link/injection/LinkViewModelModule;

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-virtual/range {v0 .. v13}, Lcom/stripe/android/link/injection/LinkViewModelModule;->provideLinkActivityViewModel(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/attestation/LinkAttestationCheck;Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;Lcom/stripe/android/uicore/navigation/NavigationManager;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/LinkActivityViewModel;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 14

    .line 99
    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->componentProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/link/injection/NativeLinkComponent;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->defaultConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkAccountManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkAccountHolderProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/link/account/LinkAccountHolder;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->eventReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkConfigurationProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/link/LinkConfiguration;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkAttestationCheckProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/link/attestation/LinkAttestationCheck;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkConfirmationHandlerFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->navigationManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/uicore/navigation/NavigationManager;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->savedStateHandleProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroidx/lifecycle/SavedStateHandle;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkLaunchModeProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/stripe/android/link/LinkLaunchMode;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->autocompleteLauncherProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->linkExpressModeProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/stripe/android/link/LinkExpressMode;

    invoke-static/range {v1 .. v13}, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->provideLinkActivityViewModel(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/attestation/LinkAttestationCheck;Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;Lcom/stripe/android/uicore/navigation/NavigationManager;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Lcom/stripe/android/link/LinkExpressMode;)Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/LinkViewModelModule_ProvideLinkActivityViewModelFactory;->get()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v0

    return-object v0
.end method
