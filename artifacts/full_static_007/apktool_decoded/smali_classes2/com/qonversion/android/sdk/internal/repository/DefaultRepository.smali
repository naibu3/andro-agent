.class public final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
.super Ljava/lang/Object;
.source "DefaultRepository.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/repository/QRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRepository.kt\ncom/qonversion/android/sdk/internal/repository/DefaultRepository\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,691:1\n125#2:692\n152#2,3:693\n1549#3:696\n1620#3,3:697\n1855#3,2:700\n1603#3,9:702\n1855#3:711\n1856#3:713\n1612#3:714\n1#4:712\n*S KotlinDebug\n*F\n+ 1 DefaultRepository.kt\ncom/qonversion/android/sdk/internal/repository/DefaultRepository\n*L\n311#1:692\n311#1:693,3\n365#1:696\n365#1:697,3\n602#1:700,2\n627#1:702,9\n627#1:711\n627#1:713\n627#1:714\n627#1:712\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 y2\u00020\u0001:\u0001yB7\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJd\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001d2#\u0010\u001e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010 \u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(#\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J \u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020.H\u0016JY\u0010/\u001a\u00020\u001b2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002010\u001d2\u0006\u00102\u001a\u00020\u00102\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001032#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001fH\u0016J\u001c\u00104\u001a\u0008\u0012\u0004\u0012\u000206052\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020805H\u0002J\u001c\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\u0010H\u0002J\u001e\u0010>\u001a\u0008\u0012\u0004\u0012\u00020?052\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020<\u0018\u000105H\u0002JA\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020C2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001b032!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J$\u0010D\u001a\u00020E2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002010\u001d2\u0006\u00102\u001a\u00020\u0010H\u0002J\u0018\u0010F\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010G\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020.H\u0016J&\u0010H\u001a\u00020\u001b2\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u0010052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010*\u001a\u00020JH\u0016JE\u0010K\u001a\u00020\u001b2\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020L05\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J&\u0010M\u001a\u00020\u001b2\u0012\u0010N\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Q0P0O2\u0008\u0010*\u001a\u0004\u0018\u00010RH\u0002JR\u0010S\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020R2\u0006\u0010&\u001a\u00020%2\u0008\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010V\u001a\u00020U2!\u0010W\u001a\u001d\u0012\u0013\u0012\u00110U\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(V\u0012\u0004\u0012\u00020\u001b0\u001fH\u0002\u00a2\u0006\u0002\u0010XJ^\u0010Y\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00102!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(\\\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J\u0010\u0010]\u001a\u00020\u001b2\u0006\u0010^\u001a\u00020_H\u0016J*\u0010;\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<2\u0008\u0010=\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020RH\u0016J4\u0010`\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010;\u001a\u00020<2\u0008\u0010=\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020R2\u0008\u0008\u0002\u0010V\u001a\u00020UH\u0002J\u001a\u0010a\u001a\u00020\u001b2\u0008\u0010b\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020cH\u0016J\u0010\u0010d\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020eH\u0016J&\u0010d\u001a\u00020\u001b2\u000c\u0010f\u001a\u0008\u0012\u0004\u0012\u00020\u0010052\u0006\u0010g\u001a\u00020\u00142\u0006\u0010*\u001a\u00020eH\u0016J.\u0010h\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u000208052\u0006\u0010*\u001a\u00020R2\u0006\u0010i\u001a\u00020jH\u0016J3\u0010k\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u000c\u0010l\u001a\u0008\u0012\u0004\u0012\u000206052\u0006\u0010*\u001a\u00020R2\u0006\u0010m\u001a\u00020jH\u0001\u00a2\u0006\u0002\u0008nJV\u0010o\u001a\u00020\u001b2\u0006\u0010p\u001a\u00020\u00102!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110q\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(r\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016JS\u0010s\u001a\u00020\u001b2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u001b0\u001f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(&\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J\u0010\u0010v\u001a\u00020\u001b2\u0006\u0010p\u001a\u00020\u0010H\u0016J\u0018\u0010w\u001a\u00020\u0010\"\u0004\u0008\u0000\u0010x*\u0008\u0012\u0004\u0012\u0002Hx0OH\u0002R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006z"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "api",
        "Lcom/qonversion/android/sdk/internal/api/Api;",
        "environmentProvider",
        "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
        "config",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "errorMapper",
        "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
        "delayCalculator",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)V",
        "advertisingId",
        "",
        "installDate",
        "",
        "isDebugMode",
        "",
        "key",
        "sdkVersion",
        "uid",
        "getUid",
        "()Ljava/lang/String;",
        "actionPoints",
        "",
        "queryParams",
        "",
        "onSuccess",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;",
        "Lkotlin/ParameterName;",
        "name",
        "actionPoint",
        "onError",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "attachUserToExperiment",
        "experimentId",
        "groupId",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;",
        "attachUserToRemoteConfiguration",
        "remoteConfigurationId",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;",
        "attribution",
        "conversionInfo",
        "",
        "from",
        "Lkotlin/Function0;",
        "convertHistory",
        "",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
        "historyRecords",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "convertPurchaseDetails",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;",
        "purchase",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "qProductId",
        "convertPurchases",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;",
        "purchases",
        "crashReport",
        "crashData",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "createAttributionRequest",
        "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
        "detachUserFromExperiment",
        "detachUserFromRemoteConfiguration",
        "eligibilityForProductIds",
        "productIds",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "getProperties",
        "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
        "handlePermissionsResponse",
        "response",
        "Lretrofit2/Response;",
        "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "handlePurchaseError",
        "errorCode",
        "",
        "attemptIndex",
        "retry",
        "(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;)V",
        "identify",
        "userID",
        "currentUserID",
        "identityID",
        "init",
        "requestData",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;",
        "purchaseRequest",
        "remoteConfig",
        "contextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "remoteConfigList",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "contextKeys",
        "includeEmptyContextKey",
        "restore",
        "requestTrigger",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "restoreRequest",
        "history",
        "trigger",
        "restoreRequest$sdk_release",
        "screens",
        "screenId",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "screen",
        "sendProperties",
        "properties",
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
        "views",
        "getLogMessage",
        "T",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;

.field private static final MAX_RETRIES_COUNT:I = 0x3


# instance fields
.field private advertisingId:Ljava/lang/String;

.field private final api:Lcom/qonversion/android/sdk/internal/api/Api;

.field private final config:Lcom/qonversion/android/sdk/internal/InternalConfig;

.field private final delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

.field private final environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

.field private final errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

.field private installDate:J

.field private final isDebugMode:Z

.field private final key:Ljava/lang/String;

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

.field private final sdkVersion:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->Companion:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environmentProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMapper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delayCalculator"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 60
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    .line 61
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 62
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 63
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    .line 64
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    .line 69
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getProjectKey()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 70
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isSandbox()Z

    move-result p1

    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    .line 71
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getSdkVersion()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getErrorMapper$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    return-object p0
.end method

.method public static final synthetic access$getLogMessage(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lretrofit2/Response;)Ljava/lang/String;
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getLogMessage(Lretrofit2/Response;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-object p0
.end method

.method public static final synthetic access$handlePermissionsResponse(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lretrofit2/Response;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->handlePermissionsResponse(Lretrofit2/Response;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    return-void
.end method

.method public static final synthetic access$handlePurchaseError(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 57
    invoke-direct/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->handlePurchaseError(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$purchaseRequest(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V
    .locals 0

    .line 57
    invoke-direct/range {p0 .. p6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->purchaseRequest(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V

    return-void
.end method

.method private final convertHistory(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;"
        }
    .end annotation

    .line 627
    check-cast p1, Ljava/lang/Iterable;

    .line 702
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 711
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 710
    check-cast v1, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;

    .line 628
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    move-result-object v2

    invoke-static {v2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 633
    :cond_1
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/purchase/History;

    .line 635
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    move-result-object v4

    invoke-virtual {v4}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getPurchaseToken(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 636
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->milliSecondsToSeconds(J)J

    move-result-wide v5

    .line 633
    invoke-direct {v3, v2, v4, v5, v6}, Lcom/qonversion/android/sdk/internal/dto/purchase/History;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_0

    .line 710
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 714
    :cond_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final convertPurchaseDetails(Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;
    .locals 11

    .line 614
    new-instance v10, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    .line 615
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v1

    .line 616
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getPurchaseTime()J

    move-result-wide v2

    .line 617
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getOrderId()Ljava/lang/String;

    move-result-object v4

    .line 618
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getOriginalOrderId()Ljava/lang/String;

    move-result-object v5

    .line 619
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getStoreProductId()Ljava/lang/String;

    move-result-object v0

    const-string v6, ""

    if-nez v0, :cond_0

    move-object v7, v6

    goto :goto_0

    :cond_0
    move-object v7, v0

    :goto_0
    if-nez p2, :cond_1

    move-object p2, v6

    .line 621
    :cond_1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getContextKeys()Ljava/util/List;

    move-result-object v8

    .line 622
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getScreenUid()Ljava/lang/String;

    move-result-object v9

    move-object v0, v10

    move-object v6, v7

    move-object v7, p2

    .line 614
    invoke-direct/range {v0 .. v9}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v10
.end method

.method static synthetic convertPurchaseDetails$default(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 610
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertPurchaseDetails(Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    move-result-object p0

    return-object p0
.end method

.method private final convertPurchases(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;",
            ">;"
        }
    .end annotation

    .line 600
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 602
    check-cast p1, Ljava/lang/Iterable;

    .line 700
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 603
    invoke-static {p0, v1, v3, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertPurchaseDetails$default(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    move-result-object v1

    .line 604
    new-instance v2, Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;

    invoke-direct {v2, v1}, Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;-><init>(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 607
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final createAttributionRequest(Ljava/util/Map;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;"
        }
    .end annotation

    .line 497
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo$default(Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    move-result-object v4

    .line 498
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 499
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 500
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v8

    .line 501
    new-instance v7, Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    invoke-direct {v7, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/ProviderData;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    .line 496
    new-instance p1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;-><init>(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getLogMessage(Lretrofit2/Response;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lretrofit2/Response<",
            "TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 685
    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "success - "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lretrofit2/Response;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "failure - "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getUid()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getUid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final handlePermissionsResponse(Lretrofit2/Response;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Response<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            ")V"
        }
    .end annotation

    .line 676
    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;

    if-eqz v0, :cond_0

    .line 677
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;->getSuccess()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p2, :cond_1

    .line 678
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 680
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lretrofit2/Response;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final handlePurchaseError(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Ljava/lang/Integer;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    if-ge p4, v0, :cond_2

    if-eqz p3, :cond_0

    .line 576
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isInternalServerError(I)Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_0
    add-int/lit8 p1, p4, 0x1

    if-nez p4, :cond_1

    .line 580
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 584
    :cond_1
    :try_start_0
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    add-int/lit8 p4, p4, -0x1

    const/4 p3, 0x0

    invoke-virtual {p2, p3, p4}, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;->countDelay(II)I

    move-result p2

    .line 585
    new-instance p4, Ljava/util/Timer;

    const-string v0, "Delayed retry"

    invoke-direct {p4, v0, p3}, Ljava/util/Timer;-><init>(Ljava/lang/String;Z)V

    new-instance p3, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$handlePurchaseError$1;

    invoke-direct {p3, p5, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$handlePurchaseError$1;-><init>(Lkotlin/jvm/functions/Function1;I)V

    check-cast p3, Ljava/util/TimerTask;

    int-to-long v0, p2

    .line 589
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->secondsToMilliSeconds(J)J

    move-result-wide v0

    .line 585
    invoke-virtual {p4, p3, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 591
    :catch_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 595
    :cond_2
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :goto_0
    return-void
.end method

.method private final purchaseRequest(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V
    .locals 21

    move-object/from16 v8, p0

    .line 515
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;

    .line 517
    iget-object v1, v8, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    iget-object v2, v8, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    move-result-object v12

    .line 518
    iget-object v13, v8, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 519
    iget-object v14, v8, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 520
    invoke-direct/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v15

    .line 521
    iget-boolean v1, v8, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->stringValue(Z)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    .line 522
    invoke-direct {v8, v6, v7}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertPurchaseDetails(Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    move-result-object v18

    const/16 v19, 0x20

    const/16 v20, 0x0

    const/16 v16, 0x0

    move-object v9, v0

    move-wide/from16 v10, p1

    .line 515
    invoke-direct/range {v9 .. v20}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 525
    iget-object v1, v8, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    sget-object v2, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->getKey()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, p6, 0x1

    invoke-interface {v1, v0, v2, v3}, Lcom/qonversion/android/sdk/internal/api/Api;->purchase(Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;Ljava/lang/String;I)Lretrofit2/Call;

    move-result-object v9

    new-instance v10, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p5

    move/from16 v3, p6

    move-wide/from16 v4, p1

    invoke-direct/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IJLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v10}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method static synthetic purchaseRequest$default(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move v6, p6

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 508
    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->purchaseRequest(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V

    return-void
.end method


# virtual methods
.method public actionPoints(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "queryParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/api/Api;->actionPoints(Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$actionPoints$1;

    invoke-direct {v0, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$actionPoints$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 2

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;

    invoke-direct {v0, p2}, Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;-><init>(Ljava/lang/String;)V

    .line 182
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p1, v1, v0}, Lcom/qonversion/android/sdk/internal/api/Api;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attachUserToExperiment$1;

    invoke-direct {p2, p0, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attachUserToExperiment$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 2

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->attachUserToRemoteConfiguration(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attachUserToRemoteConfiguration$1;

    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attachUserToRemoteConfiguration$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public attribution(Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "conversionInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "from"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->createAttributionRequest(Ljava/util/Map;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    move-result-object p1

    .line 289
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/internal/api/Api;->attribution(Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1;

    invoke-direct {p2, p0, p3, p4}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public crashReport(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "crashData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 475
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/Api$DefaultImpls;->crashLogs$default(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ljava/lang/String;ILjava/lang/Object;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$crashReport$1;

    invoke-direct {v0, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$crashReport$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 2

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->detachUserFromExperiment(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromExperiment$1;

    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromExperiment$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 2

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->detachUserFromRemoteConfiguration(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1;

    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public eligibilityForProductIds(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    const-string v3, "productIds"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "callback"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    move-result-object v8

    .line 361
    iget-object v9, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 362
    iget-object v10, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 363
    invoke-direct/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v11

    .line 364
    iget-boolean v3, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->stringValue(Z)Ljava/lang/String;

    move-result-object v13

    .line 365
    check-cast v1, Ljava/lang/Iterable;

    .line 696
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 697
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 698
    check-cast v4, Ljava/lang/String;

    .line 366
    new-instance v5, Lcom/qonversion/android/sdk/internal/dto/eligibility/StoreProductInfo;

    invoke-direct {v5, v4}, Lcom/qonversion/android/sdk/internal/dto/eligibility/StoreProductInfo;-><init>(Ljava/lang/String;)V

    .line 698
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 699
    :cond_0
    move-object v14, v3

    check-cast v14, Ljava/util/List;

    .line 358
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;

    const/4 v12, 0x0

    const/16 v15, 0x20

    const/16 v16, 0x0

    move-object v5, v1

    move-wide/from16 v6, p2

    invoke-direct/range {v5 .. v16}, Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 370
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-interface {v3, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->eligibility(Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;)Lretrofit2/Call;

    move-result-object v1

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;

    invoke-direct {v3, v0, v2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public getProperties(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onSuccess"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->getProperties(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$getProperties$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$getProperties$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public identify(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUserID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;

    invoke-direct {v0, p2, p1}, Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/api/Api;->identify(Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;

    invoke-direct {p2, p0, p3, p4}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public init(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V
    .locals 13

    const-string v0, "requestData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->getIdfa()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    .line 78
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->getInstallDate()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->installDate:J

    .line 80
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->getPurchases()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertPurchases(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    .line 81
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;

    .line 82
    iget-wide v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->installDate:J

    .line 83
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    move-result-object v4

    .line 84
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 85
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 86
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v7

    .line 87
    iget-boolean v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->stringValue(Z)Ljava/lang/String;

    move-result-object v9

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v8, 0x0

    move-object v1, v0

    .line 81
    invoke-direct/range {v1 .. v12}, Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->getRequestTrigger()Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/qonversion/android/sdk/internal/api/Api;->init(Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$init$1;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$init$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public purchase(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 10

    const-string v0, "purchase"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 268
    invoke-static/range {v1 .. v9}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->purchaseRequest$default(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IILjava/lang/Object;)V

    return-void
.end method

.method public remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/api/Api;->remoteConfig(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1;

    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 5

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/qonversion/android/sdk/internal/api/Api$DefaultImpls;->remoteConfigList$default(Lcom/qonversion/android/sdk/internal/api/Api;Ljava/lang/String;ZILjava/lang/Object;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$2;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "contextKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/qonversion/android/sdk/internal/api/Api;->remoteConfigList(Ljava/lang/String;Ljava/util/List;Z)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1;

    invoke-direct {p2, p0, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public restore(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    const-string v0, "historyRecords"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestTrigger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    invoke-direct {p0, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertHistory(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    move-object v1, p0

    move-wide v2, p1

    move-object v5, p4

    move-object v6, p5

    .line 279
    invoke-virtual/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->restoreRequest$sdk_release(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void
.end method

.method public final restoreRequest$sdk_release(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const-string v2, "history"

    move-object/from16 v12, p3

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "callback"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "trigger"

    move-object/from16 v15, p5

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 649
    new-instance v2, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;

    .line 651
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    move-result-object v6

    .line 652
    iget-object v7, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 653
    iget-object v8, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 654
    invoke-direct/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v9

    .line 655
    iget-boolean v3, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->stringValue(Z)Ljava/lang/String;

    move-result-object v11

    const/16 v13, 0x20

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object v3, v2

    move-wide/from16 v4, p1

    .line 649
    invoke-direct/range {v3 .. v14}, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 659
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-virtual/range {p5 .. p5}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Lcom/qonversion/android/sdk/internal/api/Api;->restore(Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v2

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$restoreRequest$1;

    invoke-direct {v3, v0, v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$restoreRequest$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public screens(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/api/Api;->screens(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$screens$1;

    invoke-direct {v0, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$screens$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public sendProperties(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 692
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 693
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 311
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;

    invoke-direct {v3, v2, v1}, Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 695
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 313
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Lcom/qonversion/android/sdk/internal/api/Api;->sendProperties(Ljava/lang/String;Ljava/util/List;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$sendProperties$1;

    invoke-direct {v0, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$sendProperties$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public views(Ljava/lang/String;)V
    .locals 2

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;-><init>(Ljava/lang/String;)V

    .line 438
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-interface {v1, p1, v0}, Lcom/qonversion/android/sdk/internal/api/Api;->views(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$views$1;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$views$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
