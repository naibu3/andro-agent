.class public final Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;
.super Ljava/lang/Object;
.source "FinancialConnectionsRequestExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J*\u0010\u000c\u001a\u0002H\u0011\"\u0004\u0008\u0000\u0010\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u0002H\u00110\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014J0\u0010\u0015\u001a\u0002H\u0011\"\u0004\u0008\u0000\u0010\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u00110\u0017H\u0082@\u00a2\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "eventEmitter",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;",
        "json",
        "Lkotlinx/serialization/json/Json;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V",
        "execute",
        "",
        "request",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Response",
        "responseSerializer",
        "Lkotlinx/serialization/KSerializer;",
        "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "executeInternal",
        "decodeResponse",
        "Lkotlin/Function1;",
        "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleApiError",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "response",
        "Lcom/stripe/android/core/networking/StripeResponse;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final eventEmitter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;

.field private final json:Lkotlinx/serialization/json/Json;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;


# direct methods
.method public static synthetic $r8$lambda$9irfRAEVucUdvL7w0bk3PbWSV3Q(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$G-SnnzIChNedx7QkyaEOSVlhW8U(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute$lambda$1(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "stripeNetworkClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventEmitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 24
    iput-object p2, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->eventEmitter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;

    .line 25
    iput-object p3, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->json:Lkotlinx/serialization/json/Json;

    .line 26
    iput-object p4, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method public static final synthetic access$executeInternal(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->executeInternal(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final execute$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "body"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final execute$lambda$1(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object p0, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->json:Lkotlinx/serialization/json/Json;

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/json/Json;->decodeFromString(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final executeInternal(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Response:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+TResponse;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TResponse;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    const-string v0, "Executing "

    instance-of v1, p3, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;

    iget v2, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget p3, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->label:I

    sub-int/2addr p3, v3

    iput p3, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;

    invoke-direct {v1, p0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;-><init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 54
    iget v3, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->L$2:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object p1, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    iget-object v0, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p3, p0

    check-cast p3, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 63
    iget-object p3, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/core/networking/StripeRequest$Method;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getUrl()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " request to "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 64
    iget-object p3, p0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object p0, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->L$0:Ljava/lang/Object;

    iput-object p1, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->L$1:Ljava/lang/Object;

    iput-object p2, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->L$2:Ljava/lang/Object;

    iput v4, v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$executeInternal$1;->label:I

    invoke-interface {p3, p1, v1}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v2, :cond_3

    return-object v2

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_2
    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    .line 62
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p3

    move-object v0, p0

    :goto_2
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    .line 65
    :goto_3
    invoke-static {p3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_7

    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    .line 67
    iget-object p1, v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->eventEmitter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;

    invoke-virtual {p1, p3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->emitIfPresent(Lcom/stripe/android/core/networking/StripeResponse;)Lkotlin/Unit;

    .line 75
    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result p1

    const/16 v1, 0xca

    if-eq p1, v1, :cond_6

    .line 76
    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result p1

    if-nez p1, :cond_5

    .line 77
    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeResponse;->getBody()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 76
    :cond_5
    invoke-direct {v0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/Exception;

    move-result-object p1

    throw p1

    .line 75
    :cond_6
    invoke-direct {v0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/Exception;

    move-result-object p1

    throw p1

    .line 81
    :cond_7
    new-instance p2, Lcom/stripe/android/core/exception/APIConnectionException;

    .line 82
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Failed to execute "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 81
    invoke-direct {p2, p1, v1}, Lcom/stripe/android/core/exception/APIConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private final handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/Exception;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Exception;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .line 94
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getRequestId()Lcom/stripe/android/core/networking/RequestId;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/RequestId;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v3, v0

    .line 95
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result v4

    .line 96
    new-instance v0, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;-><init>()V

    invoke-static {p1}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/StripeError;

    move-result-object v2

    const/16 p1, 0xca

    if-eq v4, p1, :cond_4

    const/16 p1, 0x1ad

    if-eq v4, p1, :cond_3

    const/16 p1, 0x190

    if-eq v4, p1, :cond_4

    const/16 p1, 0x191

    if-eq v4, p1, :cond_2

    const/16 p1, 0x193

    if-eq v4, p1, :cond_1

    const/16 p1, 0x194

    if-eq v4, p1, :cond_4

    .line 108
    new-instance v1, Lcom/stripe/android/core/exception/APIException;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Ljava/lang/Throwable;

    goto :goto_1

    .line 106
    :cond_1
    new-instance p1, Lcom/stripe/android/core/exception/PermissionException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/PermissionException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/Throwable;

    goto :goto_1

    .line 105
    :cond_2
    new-instance p1, Lcom/stripe/android/core/exception/AuthenticationException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/AuthenticationException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/Throwable;

    goto :goto_1

    .line 107
    :cond_3
    new-instance v1, Lcom/stripe/android/core/exception/RateLimitException;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/RateLimitException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Ljava/lang/Throwable;

    goto :goto_1

    .line 100
    :cond_4
    new-instance v1, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Ljava/lang/Throwable;

    .line 108
    :goto_1
    throw v1
.end method


# virtual methods
.method public final execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {p0, p1, v0, p2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->executeInternal(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Response:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lkotlinx/serialization/KSerializer<",
            "TResponse;>;",
            "Lkotlin/coroutines/Continuation<",
            "-TResponse;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/InvalidRequestException;,
            Lcom/stripe/android/core/exception/AuthenticationException;,
            Lcom/stripe/android/core/exception/APIException;
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lkotlinx/serialization/KSerializer;)V

    invoke-direct {p0, p1, v0, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->executeInternal(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
