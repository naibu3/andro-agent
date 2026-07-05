.class final Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AnalyticsRequestV2Storage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;->store(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnalyticsRequestV2Storage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsRequestV2Storage.kt\ncom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,62:1\n205#2:63\n*S KotlinDebug\n*F\n+ 1 AnalyticsRequestV2Storage.kt\ncom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2\n*L\n41#1:63\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
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
    c = "com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$store$2"
    f = "AnalyticsRequestV2Storage.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $request:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;


# direct methods
.method constructor <init>(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
            "Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->$request:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iput-object p2, p0, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->this$0:Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance p1, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;

    iget-object v0, p0, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->$request:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v1, p0, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->this$0:Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;-><init>(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 39
    iget v0, p0, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    sget-object v0, Lkotlinx/serialization/json/Json;->Default:Lkotlinx/serialization/json/Json$Default;

    check-cast v0, Lkotlinx/serialization/json/Json;

    iget-object v1, p0, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->$request:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    .line 63
    invoke-virtual {v0}, Lkotlinx/serialization/json/Json;->getSerializersModule()Lkotlinx/serialization/modules/SerializersModule;

    sget-object v2, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->Companion:Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    invoke-virtual {v0, v2, v1}, Lkotlinx/serialization/json/Json;->encodeToString(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage$store$2;->this$0:Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;

    invoke-static {v1}, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;->access$getSharedPrefs(Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 43
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 44
    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 45
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-object p1

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
