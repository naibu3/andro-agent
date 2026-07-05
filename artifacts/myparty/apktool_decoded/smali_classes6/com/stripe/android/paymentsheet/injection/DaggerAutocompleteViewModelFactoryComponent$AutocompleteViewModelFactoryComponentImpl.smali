.class final Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;
.super Ljava/lang/Object;
.source "DaggerAutocompleteViewModelFactoryComponent.java"

# interfaces
.implements Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelFactoryComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "AutocompleteViewModelFactoryComponentImpl"
.end annotation


# instance fields
.field private final application:Landroid/app/Application;

.field private applicationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private argsProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final autocompleteViewModelFactoryComponentImpl:Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;

.field private defaultAddressLauncherEventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;"
        }
    .end annotation
.end field

.field private provideEventReporterProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private provideGooglePlacesClient$paymentsheet_releaseProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
            ">;"
        }
    .end annotation
.end field

.field private provideLoggerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private provideWorkContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private providesAutocompleteViewModelArgsProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
            ">;"
        }
    .end annotation
.end field

.field private providesContextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private providesProductUsageProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private providesPublishableKeyProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/app/Application;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p0, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->autocompleteViewModelFactoryComponentImpl:Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;

    .line 96
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->application:Landroid/app/Application;

    .line 97
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/app/Application;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/app/Application;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent-IA;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/app/Application;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V

    return-void
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/app/Application;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;)V
    .locals 0

    .line 105
    invoke-static {p3}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    .line 106
    invoke-static {p3}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesContextFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesContextFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesContextProvider:Ldagger/internal/Provider;

    .line 107
    invoke-static {p4}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->argsProvider:Ldagger/internal/Provider;

    .line 108
    iget-object p4, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesContextProvider:Ldagger/internal/Provider;

    invoke-static {p4, p3}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvideGooglePlacesClient$paymentsheet_releaseFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->provideGooglePlacesClient$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    .line 109
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->argsProvider:Ldagger/internal/Provider;

    invoke-static {p3}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesAutocompleteViewModelArgsFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesAutocompleteViewModelArgsFactory;

    move-result-object p3

    invoke-static {p3}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesAutocompleteViewModelArgsProvider:Ldagger/internal/Provider;

    .line 110
    invoke-static {}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesEnableLoggingFactory;

    move-result-object p3

    invoke-static {p1, p3}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;Ldagger/internal/Provider;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    .line 111
    invoke-static {p2}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    .line 112
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->provideLoggerProvider:Ldagger/internal/Provider;

    invoke-static {p2, p1}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    .line 113
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesContextProvider:Ldagger/internal/Provider;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesPublishableKeyFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesPublishableKeyProvider:Ldagger/internal/Provider;

    .line 114
    invoke-static {}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesProductUsageFactory;->create()Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvidesProductUsageFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesProductUsageProvider:Ldagger/internal/Provider;

    .line 115
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesContextProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesPublishableKeyProvider:Ldagger/internal/Provider;

    invoke-static {p2, p3, p1}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->paymentAnalyticsRequestFactoryProvider:Ldagger/internal/Provider;

    .line 116
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->defaultAnalyticsRequestExecutorProvider:Ldagger/internal/Provider;

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->provideWorkContextProvider:Ldagger/internal/Provider;

    invoke-static {p2, p1, p3}, Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter_Factory;->create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/addresselement/analytics/DefaultAddressLauncherEventReporter_Factory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->defaultAddressLauncherEventReporterProvider:Ldagger/internal/Provider;

    .line 117
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvideEventReporterFactory;->create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelModule_Companion_ProvideEventReporterFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->provideEventReporterProvider:Ldagger/internal/Provider;

    return-void
.end method


# virtual methods
.method public getAutocompleteViewModel()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
    .locals 5

    .line 122
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->provideGooglePlacesClient$paymentsheet_releaseProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->providesAutocompleteViewModelArgsProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->provideEventReporterProvider:Ldagger/internal/Provider;

    invoke-interface {v3}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/injection/DaggerAutocompleteViewModelFactoryComponent$AutocompleteViewModelFactoryComponentImpl;->application:Landroid/app/Application;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;-><init>(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)V

    return-object v0
.end method
