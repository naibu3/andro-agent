.class public final Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;
.super Ljava/lang/Object;
.source "FinancialConnectionsLiteRequestExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ2\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u000c0\u000b\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u0002H\u000c0\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J>\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u0002H\u000c0\u000b\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u000c0\u000b0\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;",
        "",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "json",
        "Lkotlinx/serialization/json/Json;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V",
        "execute",
        "Lkotlin/Result;",
        "Response",
        "request",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "responseSerializer",
        "Lkotlinx/serialization/KSerializer;",
        "execute-0E7RQCE",
        "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "executeInternal",
        "decodeResponse",
        "Lkotlin/Function1;",
        "",
        "executeInternal-0E7RQCE",
        "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleApiError",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "response",
        "Lcom/stripe/android/core/networking/StripeResponse;",
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


# instance fields
.field private final json:Lkotlinx/serialization/json/Json;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;


# direct methods
.method public static synthetic $r8$lambda$pFL2sws7AqJRvhHGhK0QAExz0Ko(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Lkotlin/Result;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->execute_0E7RQCE$lambda$1(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Lkotlin/Result;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V
    .locals 1

    const-string v0, "stripeNetworkClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 22
    iput-object p2, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->json:Lkotlinx/serialization/json/Json;

    .line 23
    iput-object p3, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method public static final synthetic access$executeInternal-0E7RQCE(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->executeInternal-0E7RQCE(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final executeInternal-0E7RQCE(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Response:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Lkotlin/Result<",
            "+TResponse;>;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TResponse;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Failed to execute "

    instance-of v1, p3, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;

    iget v2, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget p3, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->label:I

    sub-int/2addr p3, v3

    iput p3, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;

    invoke-direct {v1, p0, p3}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;-><init>(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 36
    iget v3, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->L$2:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object p1, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    iget-object v1, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

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

    .line 40
    iget-object p3, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/core/networking/StripeRequest$Method;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getUrl()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Executing "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, " request to "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p3, v3}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 41
    :try_start_1
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p3, p0

    check-cast p3, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

    .line 42
    iget-object p3, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object p0, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->L$0:Ljava/lang/Object;

    iput-object p1, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->L$1:Ljava/lang/Object;

    iput-object p2, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->L$2:Ljava/lang/Object;

    iput v4, v1, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$executeInternal$1;->label:I

    invoke-interface {p3, p1, v1}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v2, :cond_3

    return-object v2

    :cond_3
    move-object v1, p0

    :goto_1
    :try_start_2
    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    .line 41
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p3

    move-object v1, p0

    :goto_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    .line 43
    :goto_3
    invoke-static {p3}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :try_start_3
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p3, Lcom/stripe/android/core/networking/StripeResponse;

    .line 44
    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result v2

    if-nez v2, :cond_5

    .line 47
    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeResponse;->getBody()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_4

    .line 47
    :cond_4
    const-string p2, "Required value was null."

    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    .line 45
    :cond_5
    invoke-direct {v1, p3}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->handleApiError(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/Exception;

    move-result-object p2

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    .line 43
    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_4

    :cond_6
    invoke-static {p3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 49
    :goto_4
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-nez p3, :cond_7

    goto :goto_5

    :cond_7
    :try_start_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 50
    new-instance p2, Lcom/stripe/android/core/exception/APIConnectionException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p3}, Lcom/stripe/android/core/exception/APIConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_5
    return-object p2
.end method

.method private static final execute_0E7RQCE$lambda$1(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Lkotlin/Result;
    .locals 1

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 31
    iget-object p0, p0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->json:Lkotlinx/serialization/json/Json;

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/json/Json;->decodeFromString(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    .line 30
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p0

    return-object p0
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

    .line 55
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

    .line 56
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result v4

    .line 57
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

    .line 70
    new-instance v1, Lcom/stripe/android/core/exception/APIException;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Ljava/lang/Exception;

    return-object v1

    .line 68
    :cond_1
    new-instance p1, Lcom/stripe/android/core/exception/PermissionException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/PermissionException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Exception;

    return-object p1

    .line 67
    :cond_2
    new-instance p1, Lcom/stripe/android/core/exception/AuthenticationException;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/core/exception/AuthenticationException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Exception;

    return-object p1

    .line 69
    :cond_3
    new-instance v1, Lcom/stripe/android/core/exception/RateLimitException;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/exception/RateLimitException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Ljava/lang/Exception;

    return-object v1

    .line 62
    :cond_4
    new-instance v1, Lcom/stripe/android/core/exception/InvalidRequestException;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Ljava/lang/Exception;

    return-object v1
.end method


# virtual methods
.method public final execute-0E7RQCE(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Response:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lkotlinx/serialization/KSerializer<",
            "TResponse;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TResponse;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;-><init>(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 25
    iget v2, v0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    new-instance p3, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$$ExternalSyntheticLambda0;

    invoke-direct {p3, p0, p2}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lkotlinx/serialization/KSerializer;)V

    iput v3, v0, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor$execute$1;->label:I

    invoke-direct {p0, p1, p3, v0}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->executeInternal-0E7RQCE(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
