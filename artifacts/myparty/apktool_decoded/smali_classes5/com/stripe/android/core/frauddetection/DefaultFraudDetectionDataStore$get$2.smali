.class final Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FraudDetectionDataStore.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore$get$2"
    f = "FraudDetectionDataStore.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;


# direct methods
.method public static synthetic $r8$lambda$vNJafaJqQ52XNqLZXiN3ZkTRX2s(Lorg/json/JSONObject;)J
    .locals 2

    invoke-static {p0}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->invokeSuspend$lambda$1$lambda$0(Lorg/json/JSONObject;)J

    move-result-wide v0

    return-wide v0
.end method

.method constructor <init>(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1$lambda$0(Lorg/json/JSONObject;)J
    .locals 3

    .line 32
    const-string v0, "timestamp"

    const-wide/16 v1, -0x1

    invoke-virtual {p0, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;

    iget-object v1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;-><init>(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    iget v0, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->L$0:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 29
    iget-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2;->this$0:Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 30
    new-instance v1, Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;->access$getPrefs(Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v2, "key_fraud_detection_data"

    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 31
    new-instance p1, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2$$ExternalSyntheticLambda0;

    invoke-direct {p1, v1}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$get$2$$ExternalSyntheticLambda0;-><init>(Lorg/json/JSONObject;)V

    .line 34
    new-instance v2, Lcom/stripe/android/core/frauddetection/FraudDetectionDataJsonParser;

    invoke-direct {v2, p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataJsonParser;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v2, v1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/frauddetection/FraudDetectionData;

    move-result-object p1

    .line 29
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 35
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p1

    :goto_1
    return-object v0

    .line 28
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
