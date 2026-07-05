.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetNativeModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0007J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\u0008\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007JT\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0007J0\u0010)\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,H\u0007J \u0010-\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J%\u0010/\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00100\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\u00082J1\u00103\u001a\u0002042\u0006\u0010#\u001a\u00020$2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u000207062\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020906H\u0001\u00a2\u0006\u0002\u0008:J\u0017\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010<\u001a\u00020=H\u0001\u00a2\u0006\u0002\u0008>J\u0017\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010<\u001a\u00020=H\u0001\u00a2\u0006\u0002\u0008A\u00a8\u0006B"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;",
        "",
        "<init>",
        "()V",
        "provideConsumersApiService",
        "Lcom/stripe/android/repository/ConsumersApiService;",
        "apiVersion",
        "Lcom/stripe/android/core/ApiVersion;",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "providesImageLoader",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "context",
        "Landroid/app/Application;",
        "providesFinancialConnectionsManifestRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "provideApiRequestOptions",
        "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "locale",
        "Ljava/util/Locale;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "initialSynchronizeSessionResponse",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "providesFinancialConnectionsConsumerSessionRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "consumersApiService",
        "financialConnectionsConsumersApiService",
        "Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;",
        "consumerSessionRepository",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;",
        "isLinkWithStripe",
        "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;",
        "fraudDetectionDataRepository",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
        "elementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "providesFinancialConnectionsAccountsRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "providesFinancialConnectionsInstitutionsRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;",
        "provideFinancialConnectionsConsumersApiService",
        "apiOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "provideFinancialConnectionsConsumersApiService$financial_connections_release",
        "provideLinkSignupHandler",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;",
        "linkSignupHandlerForInstantDebits",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;",
        "linkSignupHandlerForNetworking",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;",
        "provideLinkSignupHandler$financial_connections_release",
        "provideElementsSessionContext",
        "initialState",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        "provideElementsSessionContext$financial_connections_release",
        "providePrefillDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;",
        "providePrefillDetails$financial_connections_release",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;->$$INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideConsumersApiService(Lcom/stripe/android/core/ApiVersion;Lcom/stripe/android/core/networking/StripeNetworkClient;)Lcom/stripe/android/repository/ConsumersApiService;
    .locals 3
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "apiVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-virtual {p1}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object p1

    .line 84
    new-instance v0, Lcom/stripe/android/repository/ConsumersApiServiceImpl;

    .line 86
    const-string v1, "AndroidBindings/21.22.2"

    const/4 v2, 0x0

    .line 84
    invoke-direct {v0, p2, p1, v1, v2}, Lcom/stripe/android/repository/ConsumersApiServiceImpl;-><init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/AppInfo;)V

    check-cast v0, Lcom/stripe/android/repository/ConsumersApiService;

    return-object v0
.end method

.method public final provideElementsSessionContext$financial_connections_release(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p1

    return-object p1
.end method

.method public final provideFinancialConnectionsConsumersApiService$financial_connections_release(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    sget-object v0, Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;->Companion:Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService$Companion;

    invoke-virtual {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService$Companion;->invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;

    move-result-object p1

    return-object p1
.end method

.method public final provideLinkSignupHandler$financial_connections_release(Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;"
        }
    .end annotation

    const-string v0, "isLinkWithStripe"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkSignupHandlerForInstantDebits"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkSignupHandlerForNetworking"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    invoke-interface {p1}, Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;->invoke()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 188
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    .line 187
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;

    return-object p1

    .line 190
    :cond_0
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    .line 189
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;

    return-object p1
.end method

.method public final providePrefillDetails$financial_connections_release(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->getPrefillDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final providesFinancialConnectionsAccountsRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;
    .locals 7
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository$Companion;->invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    move-result-object p1

    return-object p1
.end method

.method public final providesFinancialConnectionsConsumerSessionRepository(Lcom/stripe/android/repository/ConsumersApiService;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/financialconnections/ElementsSessionContext;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;
    .locals 11
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "consumersApiService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsConsumersApiService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkWithStripe"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;

    if-nez p5, :cond_0

    .line 135
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p5

    :goto_0
    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v4, p4

    move-object/from16 v10, p9

    .line 130
    invoke-virtual/range {v1 .. v10}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;->invoke(Lcom/stripe/android/repository/ConsumersApiService;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/financialconnections/ElementsSessionContext;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    move-result-object p1

    return-object p1
.end method

.method public final providesFinancialConnectionsInstitutionsRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;
    .locals 1
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository$Companion;

    invoke-virtual {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository$Companion;->invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;

    move-result-object p1

    return-object p1
.end method

.method public final providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 8
    .param p6    # Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;
        .annotation runtime Ljavax/inject/Named;
            value = "initial_sync_response"
        .end annotation
    .end param
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository$Companion;

    if-nez p4, :cond_0

    .line 113
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p4

    :cond_0
    move-object v6, p4

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    move-object v7, p6

    .line 109
    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository$Companion;->invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/Logger;Ljava/util/Locale;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object p1

    return-object p1
.end method

.method public final providesImageLoader(Landroid/app/Application;)Lcom/stripe/android/uicore/image/StripeImageLoader;
    .locals 9
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    new-instance v1, Lcom/stripe/android/uicore/image/StripeImageLoader;

    .line 96
    move-object v2, p1

    check-cast v2, Landroid/content/Context;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 95
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/uicore/image/StripeImageLoader;-><init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
