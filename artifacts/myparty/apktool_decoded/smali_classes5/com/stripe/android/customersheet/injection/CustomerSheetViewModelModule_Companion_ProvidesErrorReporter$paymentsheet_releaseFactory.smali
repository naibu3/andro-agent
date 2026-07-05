.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        ">;"
    }
.end annotation


# instance fields
.field private final analyticsRequestExecutorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private final analyticsRequestFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
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
            "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;->analyticsRequestFactoryProvider:Ldagger/internal/Provider;

    .line 40
    iput-object p2, p0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;->analyticsRequestExecutorProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;)",
            "Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;"
        }
    .end annotation

    .line 57
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;)",
            "Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;"
        }
    .end annotation

    .line 51
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static providesErrorReporter$paymentsheet_release(Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 1

    .line 63
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->providesErrorReporter$paymentsheet_release(Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;->analyticsRequestFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    iget-object v1, p0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;->analyticsRequestExecutorProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    invoke-static {v0, v1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;->providesErrorReporter$paymentsheet_release(Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesErrorReporter$paymentsheet_releaseFactory;->get()Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v0

    return-object v0
.end method
