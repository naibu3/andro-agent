.class public final Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;
.super Ljava/lang/Object;
.source "ManageModule_Companion_ProvideManageNavigatorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;",
        ">;"
    }
.end annotation


# instance fields
.field private final eventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final initialManageScreenFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final viewModelScopeProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->initialManageScreenFactoryProvider:Ldagger/internal/Provider;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->viewModelScopeProvider:Ldagger/internal/Provider;

    .line 43
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->eventReporterProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;"
        }
    .end annotation

    .line 62
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlinx/coroutines/CoroutineScope;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static provideManageNavigator(Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;
    .locals 1

    .line 68
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule;->Companion:Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;->provideManageNavigator(Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->initialManageScreenFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->viewModelScopeProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->eventReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->provideManageNavigator(Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/analytics/EventReporter;)Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideManageNavigatorFactory;->get()Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;

    move-result-object v0

    return-object v0
.end method
