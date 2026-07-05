.class public final Lcom/stripe/android/financialconnections/lite/di/Di;
.super Ljava/lang/Object;
.source "Di.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/lite/di/Di;",
        "",
        "<init>",
        "()V",
        "apiVersion",
        "Lcom/stripe/android/core/ApiVersion;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "json",
        "Lkotlinx/serialization/json/Json;",
        "workContext",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "getWorkContext",
        "()Lkotlinx/coroutines/CoroutineDispatcher;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "repository",
        "Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;",
        "financial-connections-lite_release"
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/lite/di/Di;

.field private static final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private static final apiVersion:Lcom/stripe/android/core/ApiVersion;

.field private static final json:Lkotlinx/serialization/json/Json;

.field private static final logger:Lcom/stripe/android/core/Logger;

.field private static final workContext:Lkotlinx/coroutines/CoroutineDispatcher;


# direct methods
.method public static synthetic $r8$lambda$25rJUaY0kMUcimWkjCWPNR9cyM8(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/lite/di/Di;->json$lambda$0(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/stripe/android/financialconnections/lite/di/Di;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/lite/di/Di;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/lite/di/Di;->INSTANCE:Lcom/stripe/android/financialconnections/lite/di/Di;

    .line 15
    new-instance v0, Lcom/stripe/android/core/ApiVersion;

    .line 16
    const-string v1, "financial_connections_client_api_beta=v1"

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lcom/stripe/android/core/ApiVersion;-><init>(Ljava/util/Set;)V

    sput-object v0, Lcom/stripe/android/financialconnections/lite/di/Di;->apiVersion:Lcom/stripe/android/core/ApiVersion;

    .line 18
    new-instance v2, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 19
    invoke-virtual {v0}, Lcom/stripe/android/core/ApiVersion;->getCode()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 18
    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/core/networking/ApiRequest$Factory;-><init>(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lcom/stripe/android/financialconnections/lite/di/Di;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 22
    new-instance v0, Lcom/stripe/android/financialconnections/lite/di/Di$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/lite/di/Di$$ExternalSyntheticLambda0;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lkotlinx/serialization/json/JsonKt;->Json$default(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/lite/di/Di;->json:Lkotlinx/serialization/json/Json;

    .line 26
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/lite/di/Di;->workContext:Lkotlinx/coroutines/CoroutineDispatcher;

    .line 27
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/lite/di/Di;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final json$lambda$0(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonBuilder;->setIgnoreUnknownKeys(Z)V

    .line 24
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    .line 27
    sget-object v0, Lcom/stripe/android/financialconnections/lite/di/Di;->logger:Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method public final getWorkContext()Lkotlinx/coroutines/CoroutineDispatcher;
    .locals 1

    .line 26
    sget-object v0, Lcom/stripe/android/financialconnections/lite/di/Di;->workContext:Lkotlinx/coroutines/CoroutineDispatcher;

    return-object v0
.end method

.method public final repository()Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;
    .locals 10

    .line 29
    new-instance v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;

    .line 30
    new-instance v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

    .line 31
    new-instance v2, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    .line 32
    sget-object v3, Lcom/stripe/android/financialconnections/lite/di/Di;->workContext:Lkotlinx/coroutines/CoroutineDispatcher;

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    .line 33
    sget-object v7, Lcom/stripe/android/financialconnections/lite/di/Di;->logger:Lcom/stripe/android/core/Logger;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 31
    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 35
    sget-object v3, Lcom/stripe/android/financialconnections/lite/di/Di;->json:Lkotlinx/serialization/json/Json;

    .line 30
    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;-><init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V

    .line 38
    sget-object v2, Lcom/stripe/android/financialconnections/lite/di/Di;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 29
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;-><init>(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V

    check-cast v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;

    return-object v0
.end method
