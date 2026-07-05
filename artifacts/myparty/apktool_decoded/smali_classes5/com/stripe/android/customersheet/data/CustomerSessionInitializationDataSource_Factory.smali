.class public final Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;
.super Ljava/lang/Object;
.source "CustomerSessionInitializationDataSource_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;",
        ">;"
    }
.end annotation


# instance fields
.field private final elementsSessionManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
            ">;"
        }
    .end annotation
.end field

.field private final savedSelectionDataSourceProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
            ">;"
        }
    .end annotation
.end field

.field private final workContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
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
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;->elementsSessionManagerProvider:Ldagger/internal/Provider;

    .line 40
    iput-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;->savedSelectionDataSourceProvider:Ldagger/internal/Provider;

    .line 41
    iput-object p3, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;->workContextProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;
    .locals 1

    .line 67
    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;->elementsSessionManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;->savedSelectionDataSourceProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;->workContextProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;->newInstance(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource_Factory;->get()Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    move-result-object v0

    return-object v0
.end method
