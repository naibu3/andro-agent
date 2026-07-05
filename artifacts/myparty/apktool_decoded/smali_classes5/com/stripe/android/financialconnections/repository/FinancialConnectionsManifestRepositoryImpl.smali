.class final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;
.super Ljava/lang/Object;
.source "FinancialConnectionsManifestRepository.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsManifestRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsManifestRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,655:1\n116#2,10:656\n116#2,10:667\n1#3:666\n1567#4:677\n1598#4,4:678\n1567#4:689\n1598#4,4:690\n535#5:682\n520#5,6:683\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsManifestRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl\n*L\n233#1:656,10\n265#1:667,10\n340#1:677\n340#1:678,4\n470#1:689\n470#1:690,4\n430#1:682\n430#1:683,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\"\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0002\u0018\u0000 a2\u00020\u0001:\u0001aB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ:\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0&H\u0096@\u00a2\u0006\u0002\u0010\'J&\u0010(\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0082@\u00a2\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010,J&\u0010-\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0096@\u00a2\u0006\u0002\u00101J\u001e\u00102\u001a\u0002032\u0006\u0010 \u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0096@\u00a2\u0006\u0002\u00104J4\u00105\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020!2\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020;0:H\u0096@\u00a2\u0006\u0002\u0010<J\u001e\u0010=\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010>J\u001e\u0010?\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010>J&\u0010@\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u0010A\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010BJ(\u0010C\u001a\u00020.2\u0006\u0010 \u001a\u00020!2\u0006\u00108\u001a\u00020!2\u0008\u0010D\u001a\u0004\u0018\u00010!H\u0096@\u00a2\u0006\u0002\u0010BJ\u0016\u0010E\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010,JX\u0010F\u001a\u00020+2\u0006\u0010 \u001a\u00020!2\u0008\u0010G\u001a\u0004\u0018\u00010!2\u0008\u0010H\u001a\u0004\u0018\u00010!2\u0008\u0010\u0008\u001a\u0004\u0018\u00010!2\u0008\u0010I\u001a\u0004\u0018\u00010!2\u0008\u0010J\u001a\u0004\u0018\u00010!2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010LH\u0096@\u00a2\u0006\u0002\u0010MJ*\u0010N\u001a\u00020+2\u0006\u0010 \u001a\u00020!2\u0008\u0010O\u001a\u0004\u0018\u00010!2\u0008\u0010P\u001a\u0004\u0018\u00010!H\u0096@\u00a2\u0006\u0002\u0010BJ\u0016\u0010Q\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010,J\u0016\u0010R\u001a\u00020+2\u0006\u0010 \u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010,J\u001c\u0010S\u001a\u00020T2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0&H\u0016J\u0018\u0010V\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u0010X\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0006\u0010Y\u001a\u00020.H\u0002J\u0018\u0010Z\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0006\u0010[\u001a\u00020\rH\u0002J\u0018\u0010\\\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0006\u0010]\u001a\u00020+H\u0002J\u001a\u0010^\u001a\u00020T2\u0006\u0010W\u001a\u00020!2\u0008\u0010_\u001a\u0004\u0018\u00010`H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;",
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
        "initialSync",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V",
        "getRequestExecutor",
        "()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "getApiRequestFactory",
        "()Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "getProvideApiRequestOptions",
        "()Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "getLocale",
        "()Ljava/util/Locale;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "mutex",
        "Lkotlinx/coroutines/sync/Mutex;",
        "getMutex",
        "()Lkotlinx/coroutines/sync/Mutex;",
        "cachedSynchronizeSessionResponse",
        "getOrSynchronizeFinancialConnectionsSession",
        "clientSecret",
        "",
        "applicationId",
        "supportsAppVerification",
        "",
        "reFetchCondition",
        "Lkotlin/Function1;",
        "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "synchronize",
        "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "markConsentAcquired",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postAuthorizationSession",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "selectInstitution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postAuthorizationSessionEvent",
        "clientTimestamp",
        "Ljava/util/Date;",
        "sessionId",
        "authSessionEvents",
        "",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cancelAuthorizationSession",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveAuthorizationSession",
        "repairAuthorizationSession",
        "coreAuthorization",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "completeAuthorizationSession",
        "publicToken",
        "postMarkLinkingMoreAccounts",
        "postSaveAccountsToLink",
        "email",
        "country",
        "phoneNumber",
        "consumerSessionClientSecret",
        "selectedAccounts",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "disableNetworking",
        "disabledReason",
        "clientSuggestedNextPaneOnDisableNetworking",
        "postMarkLinkVerified",
        "postMarkLinkStepUpVerified",
        "updateLocalManifest",
        "",
        "block",
        "updateActiveInstitution",
        "source",
        "updateCachedActiveAuthSession",
        "authSession",
        "updateCachedSynchronizeSessionResponse",
        "synchronizeSessionResponse",
        "updateCachedManifest",
        "manifest",
        "updateIDConsentContentPane",
        "pane",
        "Lcom/stripe/android/financialconnections/model/IDConsentContentPane;",
        "Companion",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;

.field public static final PARAMS_FULLSCREEN:Ljava/lang/String; = "fullscreen"

.field public static final PARAMS_HIDE_CLOSE_BUTTON:Ljava/lang/String; = "hide_close_button"

.field public static final PARAMS_SUPPORT_APP_VERIFICATION:Ljava/lang/String; = "supports_app_verification"

.field public static final PARAMS_VERIFY_APP_ID:Ljava/lang/String; = "verified_app_id"

.field public static final cancelAuthSessionUrl:Ljava/lang/String; = "https://api.stripe.com/v1/connections/auth_sessions/cancel"

.field public static final consentAcquiredUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/consent_acquired"

.field public static final disableNetworking:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/disable_networking"

.field public static final eventsAuthSessionUrl:Ljava/lang/String; = "https://api.stripe.com/v1/connections/auth_sessions/events"

.field public static final generateRepairUrl:Ljava/lang/String; = "https://api.stripe.com/v1/connections/repair_sessions/generate_url"

.field private static final institutionSelectedUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/institution_selected"

.field public static final linkMoreAccountsUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/link_more_accounts"

.field public static final linkStepUpVerifiedUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/link_step_up_authentication_verified"

.field public static final linkVerifiedUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/link_verified"

.field public static final retrieveAuthSessionUrl:Ljava/lang/String; = "https://api.stripe.com/v1/connections/auth_sessions/retrieve"

.field public static final saveAccountToLinkUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/save_accounts_to_link"

.field public static final synchronizeSessionUrl:Ljava/lang/String; = "https://api.stripe.com/v1/financial_connections/sessions/synchronize"


# instance fields
.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

.field private final locale:Ljava/util/Locale;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final mutex:Lkotlinx/coroutines/sync/Mutex;

.field private final provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

.field private final requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 1

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 214
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 215
    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    .line 216
    iput-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->locale:Ljava/util/Locale;

    .line 217
    iput-object p5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 225
    invoke-static {p3, p1, p2}, Lkotlinx/coroutines/sync/MutexKt;->Mutex$default(ZILjava/lang/Object;)Lkotlinx/coroutines/sync/Mutex;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 226
    iput-object p6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    return-void
.end method

.method public static final synthetic access$synchronize(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 212
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->synchronize(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final synchronize(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 238
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 242
    iget-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 243
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 245
    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {v2, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 v2, 0x5

    .line 247
    new-array v5, v2, [Lkotlin/Pair;

    const-string v7, "manifest.active_auth_session"

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v8, "expand"

    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v5, v8

    .line 248
    const-string v7, "emit_events"

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v5, v3

    .line 249
    iget-object v7, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->locale:Ljava/util/Locale;

    invoke-virtual {v7}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v7

    const-string v9, "locale"

    invoke-static {v9, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v9, 0x2

    aput-object v7, v5, v9

    .line 251
    new-array v2, v2, [Lkotlin/Pair;

    const-string v7, "fullscreen"

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v2, v8

    .line 252
    const-string v7, "hide_close_button"

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v2, v3

    .line 253
    const-string v7, "supports_app_verification"

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-static {v7, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    aput-object p3, v2, v9

    .line 254
    const-string p3, "verified_app_id"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v7, 0x3

    aput-object p3, v2, v7

    .line 255
    const-string p3, "application_id"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p3, 0x4

    aput-object p1, v2, p3

    .line 250
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v2, "mobile"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v7

    .line 257
    const-string p1, "client_secret"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, p3

    .line 246
    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 243
    const-string v5, "https://api.stripe.com/v1/financial_connections/sessions/synchronize"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 260
    sget-object p2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->Companion:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p2

    .line 242
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronize$1;->label:I

    invoke-virtual {p4, p1, p2, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 261
    :goto_1
    move-object p2, p4

    check-cast p2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    const-string p3, "get/fetch"

    invoke-direct {p1, p3, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedSynchronizeSessionResponse(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V

    return-object p4
.end method

.method private final updateActiveInstitution(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V
    .locals 52

    move-object/from16 v0, p0

    .line 567
    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SYNC_CACHE: updating local active institution from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 568
    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    if-eqz v2, :cond_0

    const/16 v50, 0x3fff

    const/16 v51, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const v49, -0x1000001

    move-object/from16 v27, p2

    invoke-static/range {v2 .. v51}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 569
    const-string v2, "updating active institution"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    :cond_0
    return-void
.end method

.method private final updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V
    .locals 52

    move-object/from16 v0, p0

    .line 576
    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SYNC_CACHE: updating local active auth session from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 577
    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    if-eqz v2, :cond_0

    const/16 v50, 0x3fff

    const/16 v51, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const v49, -0x800001

    move-object/from16 v26, p2

    invoke-static/range {v2 .. v51}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 578
    const-string v2, "updating active auth session"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    :cond_0
    return-void
.end method

.method private final updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V
    .locals 7

    .line 593
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SYNC_CACHE: updating local manifest from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 594
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v1, :cond_0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->copy$default(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/VisualUpdate;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    return-void
.end method

.method private final updateCachedSynchronizeSessionResponse(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 3

    .line 585
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SYNC_CACHE: updating local sync object from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 586
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    return-void
.end method

.method private final updateIDConsentContentPane(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)V
    .locals 13

    .line 603
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SYNC_CACHE: updating local sync object from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " with ID consent content pane"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 604
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    const/4 p1, 0x0

    if-eqz v1, :cond_1

    .line 606
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object v2

    if-eqz v2, :cond_0

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, p2

    invoke-static/range {v2 .. v12}, Lcom/stripe/android/financialconnections/model/TextUpdate;->copy$default(Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object p1

    :cond_0
    move-object v3, p1

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 605
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->copy$default(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/VisualUpdate;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    return-void
.end method


# virtual methods
.method public cancelAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 350
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 354
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 356
    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p3, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p3, 0x2

    .line 358
    new-array p3, p3, [Lkotlin/Pair;

    const-string v2, "id"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, p3, v2

    .line 359
    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p3, v3

    .line 357
    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 354
    const-string v5, "https://api.stripe.com/v1/connections/auth_sessions/cancel"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 362
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 363
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 364
    sget-object p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 362
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 365
    :goto_1
    move-object p2, p3

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 366
    const-string v0, "cancelAuthorizationSession"

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object p3
.end method

.method public completeAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 418
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 423
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 425
    iget-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p4, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p4, 0x3

    .line 427
    new-array p4, p4, [Lkotlin/Pair;

    const-string v2, "id"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, p4, v2

    .line 428
    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p4, v3

    .line 429
    const-string p1, "public_token"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, p4, p2

    .line 426
    invoke-static {p4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 682
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v7, p2

    check-cast v7, Ljava/util/Map;

    .line 683
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 430
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 685
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v7, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 423
    const-string v5, "https://api.stripe.com/v1/connections/auth_sessions/authorized"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 432
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 433
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 434
    sget-object p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 432
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    move-object p1, p0

    .line 435
    :goto_2
    move-object p2, p4

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 436
    const-string p3, "completeAuthorizationSession"

    invoke-direct {p1, p3, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object p4
.end method

.method public disableNetworking(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 494
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 499
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 501
    iget-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x0

    invoke-interface {p4, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p4, 0x4

    .line 503
    new-array p4, p4, [Lkotlin/Pair;

    const-string v5, "client_secret"

    invoke-static {v5, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p4, v2

    .line 504
    const-string p1, "active_auth_session"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v2, "expand"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p4, v3

    .line 505
    const-string p1, "client_requested_next_pane_on_disable_networking"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p3, 0x2

    aput-object p1, p4, p3

    .line 506
    const-string p1, "disabled_reason"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, p4, p2

    .line 502
    invoke-static {p4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 507
    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 499
    const-string v5, "https://api.stripe.com/v1/link_account_sessions/disable_networking"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 509
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 510
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 511
    sget-object p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 509
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$disableNetworking$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 512
    :goto_1
    move-object p2, p4

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    .line 513
    const-string p3, "postSaveAccountsToLink"

    invoke-direct {p1, p3, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    return-object p4
.end method

.method public final getApiRequestFactory()Lcom/stripe/android/core/networking/ApiRequest$Factory;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    return-object v0
.end method

.method public final getLocale()Ljava/util/Locale;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->locale:Ljava/util/Locale;

    return-object v0
.end method

.method public final getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method public final getMutex()Lkotlinx/coroutines/sync/Mutex;
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    return-object v0
.end method

.method public getOrSynchronizeFinancialConnectionsSession(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->label:I

    sub-int/2addr p5, v2

    iput p5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;

    invoke-direct {v0, p0, p5}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 228
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/sync/Mutex;

    :try_start_0
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p2

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->Z$0:Z

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$4:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/sync/Mutex;

    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    move-object p4, p2

    check-cast p4, Lkotlin/jvm/functions/Function1;

    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p5, p1

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 233
    iget-object p5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 661
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    iput-object p5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$4:Ljava/lang/Object;

    iput-boolean p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->Z$0:Z

    iput v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->label:I

    invoke-interface {p5, v5, v0}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, p0

    .line 234
    :goto_1
    :try_start_1
    iget-object v2, v4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v2, :cond_5

    invoke-interface {p4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-nez p4, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, v5

    :goto_2
    if-nez v2, :cond_7

    .line 235
    iput-object p5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->L$4:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrSynchronizeFinancialConnectionsSession$1;->label:I

    invoke-direct {v4, p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->synchronize(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    move-object v6, p5

    move-object p5, p1

    move-object p1, v6

    .line 228
    :goto_4
    :try_start_2
    move-object v2, p5

    check-cast v2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p5, p1

    .line 665
    :cond_7
    invoke-interface {p5, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    return-object v2

    :catchall_1
    move-exception p2

    move-object p1, p5

    :goto_5
    invoke-interface {p1, v5}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    throw p2
.end method

.method public final getProvideApiRequestOptions()Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    return-object v0
.end method

.method public final getRequestExecutor()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    return-object v0
.end method

.method public markConsentAcquired(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 263
    iget v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/sync/Mutex;

    iget-object v2, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lkotlinx/coroutines/sync/Mutex;

    iget-object v8, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v17, v8

    move-object v8, v4

    move-object/from16 v4, v17

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 265
    iget-object v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:Lkotlinx/coroutines/sync/Mutex;

    .line 672
    iput-object v1, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$0:Ljava/lang/Object;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$2:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    invoke-interface {v0, v7, v2}, Lkotlinx/coroutines/sync/Mutex;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v8, v0

    move-object v9, v1

    .line 266
    :goto_1
    :try_start_1
    iget-object v10, v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 267
    const-string v11, "https://api.stripe.com/v1/link_account_sessions/consent_acquired"

    .line 268
    iget-object v0, v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v12, 0x0

    invoke-interface {v0, v12}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v0

    .line 270
    new-array v13, v5, [Lkotlin/Pair;

    const-string v14, "expand"

    const-string v15, "active_auth_session"

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    aput-object v14, v13, v12

    .line 271
    const-string v12, "client_secret"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v13, v6

    .line 269
    invoke-static {v13}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v13

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v12, v0

    .line 266
    invoke-static/range {v10 .. v16}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    .line 274
    iget-object v4, v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 275
    check-cast v0, Lcom/stripe/android/core/networking/StripeRequest;

    .line 276
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v6

    .line 274
    iput-object v9, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$2:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    invoke-virtual {v4, v0, v6, v2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    move-object v3, v8

    move-object v2, v9

    .line 277
    :goto_3
    :try_start_2
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    const-string v5, "consent acquired"

    invoke-direct {v2, v5, v4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 676
    invoke-interface {v3, v7}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v3, v8

    :goto_4
    invoke-interface {v3, v7}, Lkotlinx/coroutines/sync/Mutex;->unlock(Ljava/lang/Object;)V

    throw v0
.end method

.method public postAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 280
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->L$1:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 285
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 287
    iget-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p4, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p4, 0x5

    .line 289
    new-array p4, p4, [Lkotlin/Pair;

    const-string v2, "client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, p4, v2

    .line 290
    const-string p1, "use_mobile_handoff"

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p4, v3

    .line 291
    const-string p1, "use_abstract_flow"

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x2

    aput-object p1, p4, v2

    .line 292
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "auth-redirect/"

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "return_url"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, p4, p2

    .line 293
    const-string p1, "institution"

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, p4, p2

    .line 288
    invoke-static {p4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 285
    const-string v5, "https://api.stripe.com/v1/connections/auth_sessions"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 296
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 297
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 298
    sget-object p4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p4

    .line 296
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    invoke-virtual {p2, p1, p4, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 299
    :goto_1
    move-object p2, p4

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 300
    const-string v0, "postAuthorizationSession"

    invoke-direct {p1, v0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateActiveInstitution(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    .line 301
    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object p4
.end method

.method public postAuthorizationSessionEvent(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 333
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 335
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v1

    const/4 v3, 0x3

    .line 337
    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "client_secret"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    .line 338
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string p2, "client_timestamp"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v2

    .line 339
    const-string p1, "id"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v3, p2

    .line 336
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 340
    check-cast p4, Ljava/lang/Iterable;

    .line 677
    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p4, p3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p2, Ljava/util/Collection;

    .line 679
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    add-int/lit8 v2, v4, 0x1

    if-gez v4, :cond_0

    .line 680
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast p4, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;

    .line 341
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "frontend_events["

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->toMap()Ljava/util/Map;

    move-result-object p4

    invoke-static {v3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p4

    .line 680
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v2

    goto :goto_0

    .line 681
    :cond_1
    check-cast p2, Ljava/util/List;

    .line 677
    check-cast p2, Ljava/lang/Iterable;

    .line 336
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, v1

    .line 333
    const-string v1, "https://api.stripe.com/v1/connections/auth_sessions/events"

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 344
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 345
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 346
    sget-object p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 344
    invoke-virtual {p2, p1, p3, p5}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public postMarkLinkStepUpVerified(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 536
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 539
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 541
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x0

    invoke-interface {p2, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p2, 0x2

    .line 543
    new-array p2, p2, [Lkotlin/Pair;

    const-string v5, "client_secret"

    invoke-static {v5, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p2, v2

    .line 544
    const-string p1, "active_auth_session"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v2, "expand"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p2, v3

    .line 542
    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 539
    const-string v5, "https://api.stripe.com/v1/link_account_sessions/link_step_up_authentication_verified"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 547
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 548
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 549
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    .line 547
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkStepUpVerified$1;->label:I

    invoke-virtual {p2, p1, v2, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 550
    :goto_1
    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    .line 551
    const-string v1, "postMarkLinkStepUpVerified"

    invoke-direct {p1, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    return-object p2
.end method

.method public postMarkLinkVerified(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 517
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 520
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 522
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x0

    invoke-interface {p2, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p2, 0x2

    .line 524
    new-array p2, p2, [Lkotlin/Pair;

    const-string v5, "client_secret"

    invoke-static {v5, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p2, v2

    .line 525
    const-string p1, "active_auth_session"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v2, "expand"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p2, v3

    .line 523
    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 520
    const-string v5, "https://api.stripe.com/v1/link_account_sessions/link_verified"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 528
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 529
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 530
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    .line 528
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkVerified$1;->label:I

    invoke-virtual {p2, p1, v2, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 531
    :goto_1
    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    .line 532
    const-string v1, "postMarkLinkVerified"

    invoke-direct {p1, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    return-object p2
.end method

.method public postMarkLinkingMoreAccounts(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 440
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 443
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 445
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p2, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p2, 0x2

    .line 447
    new-array p2, p2, [Lkotlin/Pair;

    const-string v2, "active_auth_session"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v5, "expand"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, p2, v5

    .line 448
    const-string v2, "client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p2, v3

    .line 446
    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 443
    const-string v5, "https://api.stripe.com/v1/link_account_sessions/link_more_accounts"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 451
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 452
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 453
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    .line 451
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    invoke-virtual {p2, p1, v2, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 454
    :goto_1
    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    .line 455
    const-string v1, "postMarkLinkingMoreAccounts"

    invoke-direct {p1, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    return-object p2
.end method

.method public postSaveAccountsToLink(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p8

    instance-of v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;

    iget v2, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 459
    iget v3, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p7, :cond_5

    .line 469
    move-object/from16 v3, p7

    check-cast v3, Ljava/lang/Iterable;

    .line 689
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 691
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v6, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v6, 0x1

    if-gez v6, :cond_3

    .line 692
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v7, Ljava/lang/String;

    .line 470
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "selected_accounts["

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v9, "]"

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    .line 692
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v6, v8

    goto :goto_1

    .line 693
    :cond_4
    check-cast v5, Ljava/util/List;

    .line 469
    check-cast v5, Ljava/lang/Iterable;

    .line 471
    invoke-static {v5}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_5

    goto :goto_2

    .line 472
    :cond_5
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    .line 473
    :goto_2
    iget-object v5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 475
    iget-object v6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {v6, v0}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 v7, 0x7

    .line 477
    new-array v7, v7, [Lkotlin/Pair;

    const-string v8, "client_secret"

    invoke-static {v8, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v7, v0

    .line 478
    const-string p1, "consumer_session_client_secret"

    move-object/from16 v0, p6

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v7, v4

    .line 479
    const-string p1, "active_auth_session"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v0, "expand"

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v0, 0x2

    aput-object p1, v7, v0

    .line 480
    const-string p1, "country"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p3, 0x3

    aput-object p1, v7, p3

    .line 481
    const-string p1, "locale"

    invoke-static {p1, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p3, 0x4

    aput-object p1, v7, p3

    .line 482
    const-string p1, "email_address"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x5

    aput-object p1, v7, p2

    .line 483
    const-string p1, "phone_number"

    move-object/from16 p2, p5

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x6

    aput-object p1, v7, p2

    .line 476
    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 484
    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 476
    invoke-static {p1, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p4

    const/16 p1, 0x8

    const/4 p2, 0x0

    .line 473
    const-string p3, "https://api.stripe.com/v1/link_account_sessions/save_accounts_to_link"

    const/4 v0, 0x0

    move/from16 p6, p1

    move-object/from16 p7, p2

    move-object p2, p3

    move/from16 p5, v0

    move-object p1, v5

    move-object p3, v6

    invoke-static/range {p1 .. p7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 486
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 487
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 488
    sget-object p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 486
    iput-object p0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;->L$0:Ljava/lang/Object;

    iput v4, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postSaveAccountsToLink$1;->label:I

    invoke-virtual {p2, p1, p3, v1}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_6

    return-object v2

    :cond_6
    move-object p1, p0

    .line 489
    :goto_3
    move-object p2, v0

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    .line 490
    const-string p3, "postSaveAccountsToLink"

    invoke-direct {p1, p3, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    return-object v0
.end method

.method public repairAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 388
    iget v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 393
    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 394
    iget-object v6, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 396
    iget-object v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {v4, v5}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v8

    const/4 v4, 0x3

    .line 398
    new-array v4, v4, [Lkotlin/Pair;

    const-string v7, "client_secret"

    move-object/from16 v9, p1

    invoke-static {v7, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v9, 0x0

    aput-object v7, v4, v9

    .line 399
    const-string v7, "core_authorization"

    move-object/from16 v9, p2

    invoke-static {v7, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v4, v5

    .line 400
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "auth-redirect/"

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v9, p3

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v9, "return_url"

    invoke-static {v9, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v9, 0x2

    aput-object v7, v4, v9

    .line 397
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v9

    const/16 v11, 0x8

    const/4 v12, 0x0

    .line 394
    const-string v7, "https://api.stripe.com/v1/connections/repair_sessions/generate_url"

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/networking/StripeRequest;

    .line 403
    sget-object v6, Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;->Companion:Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v6

    .line 393
    iput-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$repairAuthorizationSession$1;->label:I

    invoke-virtual {v1, v4, v6, v2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v0

    .line 388
    :goto_1
    check-cast v1, Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;

    .line 407
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;->getId()Ljava/lang/String;

    move-result-object v4

    .line 408
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;->getUrl()Ljava/lang/String;

    move-result-object v10

    .line 409
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;->getFlow()Ljava/lang/String;

    move-result-object v6

    .line 410
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;->getDisplay()Lcom/stripe/android/financialconnections/model/Display;

    move-result-object v13

    .line 411
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;->isOAuth()Z

    move-result v1

    .line 412
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 406
    new-instance v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 411
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v12

    const/16 v14, 0xb8

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    .line 406
    invoke-direct/range {v3 .. v15}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 414
    const-string v1, "repairAuthorizationSession"

    invoke-direct {v2, v1, v3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object v3
.end method

.method public retrieveAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 370
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 373
    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 374
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 376
    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {v2, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 v2, 0x3

    .line 378
    new-array v2, v2, [Lkotlin/Pair;

    const-string v5, "id"

    invoke-static {v5, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v5, 0x0

    aput-object p2, v2, v5

    .line 379
    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v2, v3

    .line 380
    const-string p1, "emit_events"

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v2, p2

    .line 377
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 374
    const-string v5, "https://api.stripe.com/v1/connections/auth_sessions/retrieve"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 383
    sget-object p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p2

    .line 373
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$retrieveAuthorizationSession$1;->label:I

    invoke-virtual {p3, p1, p2, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 384
    :goto_1
    move-object p2, p3

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    .line 385
    const-string v0, "retrieveAuthorizationSession"

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object p3
.end method

.method public selectInstitution(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 305
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 309
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 311
    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p3, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p3, 0x2

    .line 313
    new-array p3, p3, [Lkotlin/Pair;

    const-string v2, "client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, p3, v2

    .line 314
    const-string p1, "currently_selected_institution"

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p3, v3

    .line 312
    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 309
    const-string v5, "https://api.stripe.com/v1/link_account_sessions/institution_selected"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 317
    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 318
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 319
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    .line 317
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$selectInstitution$1;->label:I

    invoke-virtual {p3, p1, v2, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 320
    :goto_1
    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;

    .line 321
    const-string v1, "selectInstitution"

    invoke-direct {p1, v1, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateActiveInstitution(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    .line 322
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p2

    invoke-direct {p1, v1, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    .line 323
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getIdConsentContentPane()Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    move-result-object p2

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    :goto_2
    invoke-direct {p1, v1, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateIDConsentContentPane(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)V

    return-object p3
.end method

.method public updateLocalManifest(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 558
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 559
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    if-eqz p1, :cond_0

    .line 560
    const-string v0, "updateLocalManifest"

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    :cond_0
    return-void
.end method
