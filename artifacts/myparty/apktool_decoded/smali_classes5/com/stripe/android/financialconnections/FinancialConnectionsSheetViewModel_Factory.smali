.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetViewModel_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final analyticsTrackerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final applicationIdProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final browserManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/browser/BrowserManager;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final fetchFinancialConnectionsSessionForTokenProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
            ">;"
        }
    .end annotation
.end field

.field private final fetchFinancialConnectionsSessionProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field

.field private final getOrFetchSyncProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
            ">;"
        }
    .end annotation
.end field

.field private final initialStateProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
            ">;"
        }
    .end annotation
.end field

.field private final integrityRequestManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/attestation/IntegrityRequestManager;",
            ">;"
        }
    .end annotation
.end field

.field private final integrityVerdictManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
            ">;"
        }
    .end annotation
.end field

.field private final ioDispatcherProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineDispatcher;",
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

.field private final nativeAuthFlowCoordinatorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private final nativeRouterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
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
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/attestation/IntegrityRequestManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/browser/BrowserManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineDispatcher;",
            ">;)V"
        }
    .end annotation

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->applicationIdProvider:Ldagger/internal/Provider;

    .line 86
    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->savedStateHandleProvider:Ldagger/internal/Provider;

    .line 87
    iput-object p3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->getOrFetchSyncProvider:Ldagger/internal/Provider;

    .line 88
    iput-object p4, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->integrityRequestManagerProvider:Ldagger/internal/Provider;

    .line 89
    iput-object p5, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->integrityVerdictManagerProvider:Ldagger/internal/Provider;

    .line 90
    iput-object p6, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->fetchFinancialConnectionsSessionProvider:Ldagger/internal/Provider;

    .line 91
    iput-object p7, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->fetchFinancialConnectionsSessionForTokenProvider:Ldagger/internal/Provider;

    .line 92
    iput-object p8, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->loggerProvider:Ldagger/internal/Provider;

    .line 93
    iput-object p9, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->browserManagerProvider:Ldagger/internal/Provider;

    .line 94
    iput-object p10, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->eventReporterProvider:Ldagger/internal/Provider;

    .line 95
    iput-object p11, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->analyticsTrackerProvider:Ldagger/internal/Provider;

    .line 96
    iput-object p12, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->nativeRouterProvider:Ldagger/internal/Provider;

    .line 97
    iput-object p13, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->nativeAuthFlowCoordinatorProvider:Ldagger/internal/Provider;

    .line 98
    iput-object p14, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->initialStateProvider:Ldagger/internal/Provider;

    .line 99
    iput-object p15, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->ioDispatcherProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ldagger/internal/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/attestation/IntegrityRequestManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/browser/BrowserManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineDispatcher;",
            ">;)",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;"
        }
    .end annotation

    .line 140
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

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

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroidx/lifecycle/SavedStateHandle;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/attestation/IntegrityRequestManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/browser/BrowserManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlinx/coroutines/CoroutineDispatcher;",
            ">;)",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;"
        }
    .end annotation

    .line 123
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;

    invoke-static/range {p0 .. p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

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

    invoke-static/range {p13 .. p13}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v14

    invoke-static/range {p14 .. p14}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object v15

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
    .locals 16

    .line 153
    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

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

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v0 .. v15}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;-><init>(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlinx/coroutines/CoroutineDispatcher;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
    .locals 17

    move-object/from16 v0, p0

    .line 104
    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->applicationIdProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->savedStateHandleProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/lifecycle/SavedStateHandle;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->getOrFetchSyncProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->integrityRequestManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/stripe/attestation/IntegrityRequestManager;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->integrityVerdictManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->fetchFinancialConnectionsSessionProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->fetchFinancialConnectionsSessionForTokenProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->loggerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/stripe/android/core/Logger;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->browserManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/financialconnections/browser/BrowserManager;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->eventReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->analyticsTrackerProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->nativeRouterProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->nativeAuthFlowCoordinatorProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->initialStateProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->ioDispatcherProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lkotlinx/coroutines/CoroutineDispatcher;

    invoke-static/range {v2 .. v16}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->newInstance(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/browser/BrowserManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->get()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v0

    return-object v0
.end method
