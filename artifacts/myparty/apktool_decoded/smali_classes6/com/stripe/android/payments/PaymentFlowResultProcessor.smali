.class public abstract Lcom/stripe/android/payments/PaymentFlowResultProcessor;
.super Ljava/lang/Object;
.source "PaymentFlowResultProcessor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;,
        Lcom/stripe/android/payments/PaymentFlowResultProcessor$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/stripe/android/model/StripeIntent;",
        "S:",
        "Lcom/stripe/android/StripeIntentResult<",
        "+TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 D*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0010\u0008\u0001\u0010\u0003 \u0001*\u0008\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001DBA\u0008\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020 H\u0002J\u0018\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0002J4\u0010*\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\n0/H\u00a4@\u00a2\u0006\u0004\u00080\u00101J4\u00102\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\n0/H\u00a4@\u00a2\u0006\u0004\u00083\u00101J.\u00104\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u00105\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-H\u0082@\u00a2\u0006\u0004\u00086\u00107J.\u00108\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u00109\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020\nH\u00a4@\u00a2\u0006\u0004\u0008;\u0010<J\'\u0010=\u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\u0006\u0010>\u001a\u00020%2\u0008\u0010?\u001a\u0004\u0018\u00010\nH$\u00a2\u0006\u0002\u0010@J\u001b\u0010A\u001a\u00020 2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001aH\u0002\u00a2\u0006\u0002\u0010CR\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u000cX\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0001\u0002EF\u00a8\u0006G"
    }
    d2 = {
        "Lcom/stripe/android/payments/PaymentFlowResultProcessor;",
        "T",
        "Lcom/stripe/android/model/StripeIntent;",
        "S",
        "Lcom/stripe/android/StripeIntentResult;",
        "",
        "context",
        "Landroid/content/Context;",
        "publishableKeyProvider",
        "Ljavax/inject/Provider;",
        "",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "retryDelaySupplier",
        "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
        "<init>",
        "(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V",
        "getStripeRepository",
        "()Lcom/stripe/android/networking/StripeRepository;",
        "failureMessageFactory",
        "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;",
        "processResult",
        "Lkotlin/Result;",
        "unvalidatedResult",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "processResult-gIAlu-s",
        "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "shouldCancelIntentSource",
        "",
        "stripeIntent",
        "shouldCancelSource",
        "shouldRefreshIntent",
        "flowOutcome",
        "",
        "determineFlowOutcome",
        "intent",
        "originalFlowOutcome",
        "shouldCallRefreshIntent",
        "retrieveStripeIntent",
        "clientSecret",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "expandFields",
        "",
        "retrieveStripeIntent-BWLJW6A",
        "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "refreshStripeIntent",
        "refreshStripeIntent-BWLJW6A",
        "refreshStripeIntentUntilTerminalState",
        "originalIntent",
        "refreshStripeIntentUntilTerminalState-BWLJW6A",
        "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cancelStripeIntentSource",
        "stripeIntentId",
        "sourceId",
        "cancelStripeIntentSource-BWLJW6A",
        "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createStripeIntentResult",
        "outcomeFromFlow",
        "failureMessage",
        "(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;",
        "shouldRetry",
        "stripeIntentResult",
        "(Ljava/lang/Object;)Z",
        "Companion",
        "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;",
        "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

.field private static final EXPAND_PAYMENT_METHOD:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MAX_RETRIES:I = 0x5


# instance fields
.field private final failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final publishableKeyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->Companion:Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->$stable:I

    .line 279
    const-string v0, "payment_method"

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
            ")V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->publishableKeyProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p3, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 39
    iput-object p4, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->logger:Lcom/stripe/android/core/Logger;

    .line 40
    iput-object p5, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 41
    iput-object p6, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

    .line 43
    new-instance p2, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    invoke-direct {p2, p1}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_0

    .line 41
    new-instance p6, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;

    invoke-direct {p6}, Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;-><init>()V

    check-cast p6, Lcom/stripe/android/core/networking/RetryDelaySupplier;

    :cond_0
    move-object v6, p6

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 35
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;-><init>(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;-><init>(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V

    return-void
.end method

.method public static final synthetic access$determineFlowOutcome(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;I)I
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->determineFlowOutcome(Lcom/stripe/android/model/StripeIntent;I)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getEXPAND_PAYMENT_METHOD$cp()Ljava/util/List;
    .locals 1

    .line 35
    sget-object v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getFailureMessageFactory$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPublishableKeyProvider$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Ljavax/inject/Provider;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->publishableKeyProvider:Ljavax/inject/Provider;

    return-object p0
.end method

.method public static final synthetic access$getRetryDelaySupplier$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/core/networking/RetryDelaySupplier;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

    return-object p0
.end method

.method public static final synthetic access$refreshStripeIntentUntilTerminalState-BWLJW6A(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->refreshStripeIntentUntilTerminalState-BWLJW6A(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$shouldCallRefreshIntent(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;)Z
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldCallRefreshIntent(Lcom/stripe/android/model/StripeIntent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$shouldCancelIntentSource(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;Z)Z
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldCancelIntentSource(Lcom/stripe/android/model/StripeIntent;Z)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$shouldRefreshIntent(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;I)Z
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldRefreshIntent(Lcom/stripe/android/model/StripeIntent;I)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$shouldRetry(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Ljava/lang/Object;)Z
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldRetry(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final determineFlowOutcome(Lcom/stripe/android/model/StripeIntent;I)I
    .locals 2

    .line 164
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    return p2

    :cond_1
    return v0
.end method

.method private final refreshStripeIntentUntilTerminalState-BWLJW6A(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    instance-of v5, v4, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;

    iget v6, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    const/high16 v7, -0x80000000

    and-int/2addr v6, v7

    if-eqz v6, :cond_0

    iget v4, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    sub-int/2addr v4, v7

    iput v4, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;

    invoke-direct {v5, v0, v4}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;-><init>(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v4, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 205
    iget v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v7, :cond_3

    if-eq v7, v10, :cond_2

    if-eq v7, v9, :cond_2

    if-ne v7, v8, :cond_1

    iget-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iget-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$6:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$5:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$4:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v9, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v10, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/model/StripeIntent;

    iget-object v12, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v4, Lkotlin/Result;

    invoke-virtual {v4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v22, v4

    move-object v4, v2

    move-object v2, v10

    move-object v10, v7

    move-object v7, v3

    move-object v3, v9

    move-object/from16 v9, v22

    goto :goto_2

    :cond_3
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 210
    invoke-interface {v1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v4

    if-eqz v4, :cond_4

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/stripe/android/model/PaymentMethod$Type;->getAfterRedirectAction$payments_core_release()Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {v4}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;->getRetryCount()I

    move-result v4

    goto :goto_1

    :cond_4
    const/4 v4, 0x5

    .line 211
    :goto_1
    new-instance v7, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    iput v4, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 213
    new-instance v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldCallRefreshIntent(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 217
    sget-object v9, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    .line 214
    iput-object v0, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    iput-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    iput-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$4:Ljava/lang/Object;

    iput-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$5:Ljava/lang/Object;

    iput-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$6:Ljava/lang/Object;

    iput v4, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iput v10, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    invoke-virtual {v0, v2, v3, v9, v5}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->refreshStripeIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_5

    goto :goto_4

    :cond_5
    move-object v12, v0

    move-object v10, v7

    move-object v7, v11

    move-object v11, v1

    move v1, v4

    move-object v4, v7

    :goto_2
    move-object/from16 v19, v2

    move-object/from16 v20, v3

    move-object v15, v7

    move-object/from16 v16, v10

    move-object/from16 v18, v11

    move-object v14, v12

    goto :goto_3

    .line 223
    :cond_6
    sget-object v10, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    .line 220
    iput-object v0, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    iput-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    iput-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$4:Ljava/lang/Object;

    iput-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$5:Ljava/lang/Object;

    iput-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$6:Ljava/lang/Object;

    iput v4, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iput v9, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    invoke-virtual {v0, v2, v3, v10, v5}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retrieveStripeIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_5

    goto :goto_4

    .line 213
    :goto_3
    iput-object v9, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 227
    iget-object v2, v14, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

    invoke-interface {v2, v1}, Lcom/stripe/android/core/networking/RetryDelaySupplier;->maxDuration-5sfh64U(I)J

    move-result-wide v2

    new-instance v13, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;

    const/16 v21, 0x0

    move/from16 v17, v1

    invoke-direct/range {v13 .. v21}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2;-><init>(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$IntRef;ILcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V

    check-cast v13, Lkotlin/jvm/functions/Function2;

    iput-object v15, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$4:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$5:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$6:Ljava/lang/Object;

    iput v8, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    invoke-static {v2, v3, v13, v5}, Lkotlinx/coroutines/TimeoutKt;->withTimeoutOrNull-KLykuaI(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_7

    :goto_4
    return-object v6

    :cond_7
    move-object v1, v15

    .line 251
    :goto_5
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-object v1
.end method

.method private final shouldCallRefreshIntent(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 0

    .line 178
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethod$Type;->getAfterRedirectAction$payments_core_release()Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    instance-of p1, p1, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;

    return p1
.end method

.method private final shouldCancelIntentSource(Lcom/stripe/android/model/StripeIntent;Z)Z
    .locals 0

    if-eqz p2, :cond_0

    .line 128
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final shouldRefreshIntent(Lcom/stripe/android/model/StripeIntent;I)Z
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    .line 139
    invoke-static {p1}, Lcom/stripe/android/model/StripeIntentKtxKt;->shouldRefresh(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x3

    if-ne p2, v4, :cond_2

    .line 145
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/model/StripeIntent$Status;->Processing:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v5, v6, :cond_2

    .line 146
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    sget-object v6, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v5, v6, :cond_2

    move v5, v1

    goto :goto_2

    :cond_2
    move v5, v0

    :goto_2
    if-ne p2, v4, :cond_4

    .line 151
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p2

    sget-object v4, Lcom/stripe/android/model/StripeIntent$Status;->RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p2, v4, :cond_4

    .line 152
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object v3, p2, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    :cond_3
    sget-object p2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v3, p2, :cond_4

    .line 153
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionType()Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object p2

    sget-object v3, Lcom/stripe/android/model/StripeIntent$NextActionType;->UseStripeSdk:Lcom/stripe/android/model/StripeIntent$NextActionType;

    if-ne p2, v3, :cond_4

    move p2, v1

    goto :goto_3

    :cond_4
    move p2, v0

    .line 157
    :goto_3
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 158
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethod$Type;->getAfterRedirectAction$payments_core_release()Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;->getShouldRefresh()Z

    move-result p1

    if-ne p1, v1, :cond_5

    move p1, v1

    goto :goto_4

    :cond_5
    move p1, v0

    :goto_4
    if-nez v2, :cond_7

    if-nez v5, :cond_7

    if-nez p2, :cond_7

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_6
    return v0

    :cond_7
    :goto_5
    return v1
.end method

.method private final shouldRetry(Ljava/lang/Object;)Z
    .locals 6

    .line 271
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    :cond_0
    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    const/4 v0, 0x1

    if-nez p1, :cond_1

    return v0

    .line 272
    :cond_1
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result v2

    .line 273
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/model/StripeIntent$Status;->Processing:Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v5, 0x0

    if-ne v3, v4, :cond_3

    .line 274
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    :cond_2
    sget-object p1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v1, p1, :cond_3

    move p1, v0

    goto :goto_0

    :cond_3
    move p1, v5

    :goto_0
    if-nez v2, :cond_5

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    return v5

    :cond_5
    :goto_1
    return v0
.end method


# virtual methods
.method protected abstract cancelStripeIntentSource-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method protected abstract createStripeIntentResult(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Ljava/lang/String;",
            ")TS;"
        }
    .end annotation
.end method

.method protected final getStripeRepository()Lcom/stripe/android/networking/StripeRepository;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object v0
.end method

.method public final processResult-gIAlu-s(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TS;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;

    iget v1, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;-><init>(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 45
    iget v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;->label:I

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

    .line 47
    iget-object p2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;-><init>(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$1;->label:I

    invoke-static {p2, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract refreshStripeIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method protected abstract retrieveStripeIntent-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
