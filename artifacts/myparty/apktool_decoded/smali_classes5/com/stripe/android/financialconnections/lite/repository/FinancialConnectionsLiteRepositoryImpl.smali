.class public final Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;
.super Ljava/lang/Object;
.source "FinancialConnectionsLiteRepository.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\n\u0010\u0008\u001a\u00020\t*\u00020\nJ&\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000c2\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;",
        "Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepository;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V",
        "apiRequestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "synchronize",
        "Lkotlin/Result;",
        "Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;",
        "configuration",
        "applicationId",
        "",
        "synchronize-0E7RQCE",
        "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getFinancialConnectionsSession",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "getFinancialConnectionsSession-gIAlu-s",
        "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$Companion;

.field public static final PARAMS_APPLICATION_ID:Ljava/lang/String; = "application_id"

.field public static final PARAMS_CLIENT_SECRET:Ljava/lang/String; = "client_secret"

.field public static final PARAMS_FULLSCREEN:Ljava/lang/String; = "fullscreen"

.field public static final PARAMS_HIDE_CLOSE_BUTTON:Ljava/lang/String; = "hide_close_button"

.field public static final PARAMS_MOBILE_SDK_TYPE:Ljava/lang/String; = "mobile_sdk_type"

.field private static final sessionReceiptUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/session_receipt"

.field public static final synchronizeSessionUrl:Ljava/lang/String; = "https://api.stripe.com/v1/financial_connections/sessions/synchronize"


# instance fields
.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private final requestExecutor:Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;


# direct methods
.method public static synthetic $r8$lambda$WHkq4z10QhOkeH5-5Ce-A-xeinA(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->apiRequestOptions$lambda$0(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$f4wnnia_Wu3NHaBQ7f1Ee33FqQc(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->apiRequestOptions$lambda$1(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V
    .locals 1

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

    .line 23
    iput-object p2, p0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    return-void
.end method

.method private static final apiRequestOptions$lambda$0(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Ljava/lang/String;
    .locals 0

    .line 27
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final apiRequestOptions$lambda$1(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Ljava/lang/String;
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final apiRequestOptions(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 27
    new-instance v1, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V

    .line 28
    new-instance v2, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda1;

    invoke-direct {v2, p1}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public getFinancialConnectionsSession-gIAlu-s(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 52
    iget v2, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    iget-object v4, p0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 57
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->apiRequestOptions(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    .line 59
    const-string p2, "client_secret"

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 58
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 55
    const-string v5, "https://api.stripe.com/v1/link_account_sessions/session_receipt"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 62
    iget-object p2, p0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

    .line 63
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 64
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    .line 62
    iput v3, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$getFinancialConnectionsSession$1;->label:I

    invoke-virtual {p2, p1, v2, v0}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->execute-0E7RQCE(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public synchronize-0E7RQCE(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;-><init>(Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 31
    iget v2, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;->label:I

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

    .line 34
    iget-object p3, p0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;

    .line 35
    iget-object v4, p0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 37
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl;->apiRequestOptions(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 v2, 0x3

    .line 39
    new-array v5, v2, [Lkotlin/Pair;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v7

    const-string v8, "locale"

    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v5, v8

    const/4 v7, 0x4

    .line 41
    new-array v7, v7, [Lkotlin/Pair;

    const-string v9, "fullscreen"

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v7, v8

    .line 42
    const-string v9, "hide_close_button"

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v3

    .line 43
    const-string v8, "application_id"

    invoke-static {v8, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v8, 0x2

    aput-object p2, v7, v8

    .line 44
    const-string p2, "mobile_sdk_type"

    const-string v9, "fc_lite"

    invoke-static {p2, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, v7, v2

    .line 40
    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    const-string v2, "mobile"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    aput-object p2, v5, v3

    .line 46
    const-string p2, "client_secret"

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v8

    .line 38
    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 35
    const-string v5, "https://api.stripe.com/v1/financial_connections/sessions/synchronize"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 49
    sget-object p2, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->Companion:Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p2

    .line 34
    iput v3, v0, Lcom/stripe/android/financialconnections/lite/repository/FinancialConnectionsLiteRepositoryImpl$synchronize$1;->label:I

    invoke-virtual {p3, p1, p2, v0}, Lcom/stripe/android/financialconnections/lite/network/FinancialConnectionsLiteRequestExecutor;->execute-0E7RQCE(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
