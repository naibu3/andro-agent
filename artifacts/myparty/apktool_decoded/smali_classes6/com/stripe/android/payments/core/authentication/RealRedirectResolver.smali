.class public final Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;
.super Ljava/lang/Object;
.source "RedirectResolver.kt"

# interfaces
.implements Lcom/stripe/android/payments/core/authentication/RedirectResolver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B,\u0012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007\u00a2\u0006\u0002\u0008\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bB\u0013\u0008\u0017\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000cJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B\u00a2\u0006\u0002\u0010\u0010R#\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007\u00a2\u0006\u0002\u0008\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;",
        "Lcom/stripe/android/payments/core/authentication/RedirectResolver;",
        "configureSSL",
        "Lkotlin/Function1;",
        "Ljavax/net/ssl/HttpsURLConnection;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "Lcom/stripe/android/payments/core/authentication/ConfigureSslHandler;",
        "ioDispatcher",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V",
        "(Lkotlin/coroutines/CoroutineContext;)V",
        "invoke",
        "",
        "url",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "payments-core_release"
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
.field private final configureSSL:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljavax/net/ssl/HttpsURLConnection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final ioDispatcher:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static synthetic $r8$lambda$XQdps1hHHPKSsDQaOUCdS2VIrIM(Ljavax/net/ssl/HttpsURLConnection;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;->_init_$lambda$0(Ljavax/net/ssl/HttpsURLConnection;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "ioDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljavax/net/ssl/HttpsURLConnection;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    const-string v0, "configureSSL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;->configureSSL:Lkotlin/jvm/functions/Function1;

    .line 21
    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;->ioDispatcher:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method private static final _init_$lambda$0(Ljavax/net/ssl/HttpsURLConnection;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$getConfigureSSL$p(Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;->configureSSL:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method


# virtual methods
.method public invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;

    iget v1, v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;-><init>(Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 29
    iget v2, v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    iget-object p2, p0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;->ioDispatcher:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$2;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p0, v4}, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$2;-><init>(Ljava/lang/String;Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/payments/core/authentication/RealRedirectResolver$invoke$1;->label:I

    invoke-static {p2, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string p1, "withContext(...)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method
