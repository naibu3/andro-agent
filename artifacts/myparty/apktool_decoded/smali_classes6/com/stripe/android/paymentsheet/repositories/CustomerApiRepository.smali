.class public final Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;
.super Ljava/lang/Object;
.source "CustomerApiRepository.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerApiRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerApiRepository.kt\ncom/stripe/android/paymentsheet/repositories/CustomerApiRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,311:1\n774#2:312\n865#2,2:313\n774#2:315\n865#2,2:316\n1663#2,8:318\n774#2:326\n865#2,2:327\n1557#2:329\n1628#2,3:330\n*S KotlinDebug\n*F\n+ 1 CustomerApiRepository.kt\ncom/stripe/android/paymentsheet/repositories/CustomerApiRepository\n*L\n201#1:312\n201#1:313,2\n212#1:315\n212#1:316,2\n215#1:318,8\n265#1:326\n265#1:327,2\n276#1:329\n276#1:330,3\n*E\n"
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001BI\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u0012\u000e\u0008\u0003\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J:\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0004\u0008\u001f\u0010 J.\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0004\u0008$\u0010%J&\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\'\u0010(J.\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+H\u0096@\u00a2\u0006\u0004\u0008,\u0010-J(\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0096@\u00a2\u0006\u0004\u0008/\u0010(J\u001c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u001c\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J*\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0018*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u00085\u00106R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "lazyPaymentConfig",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "productUsageTokens",
        "",
        "",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lcom/stripe/android/core/Logger;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V",
        "retrieveCustomer",
        "Lcom/stripe/android/model/Customer;",
        "customerInfo",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
        "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getPaymentMethods",
        "Lkotlin/Result;",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "types",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "silentlyFail",
        "",
        "getPaymentMethods-BWLJW6A",
        "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "detachPaymentMethod",
        "paymentMethodId",
        "canRemoveDuplicates",
        "detachPaymentMethod-BWLJW6A",
        "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachPaymentMethod",
        "attachPaymentMethod-0E7RQCE",
        "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updatePaymentMethod",
        "params",
        "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
        "updatePaymentMethod-BWLJW6A",
        "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setDefaultPaymentMethod",
        "setDefaultPaymentMethod-0E7RQCE",
        "filterPaymentMethods",
        "allPaymentMethods",
        "getLinkPaymentMethods",
        "paymentMethods",
        "detachPaymentMethodAndDuplicates",
        "detachPaymentMethodAndDuplicates-BWLJW6A",
        "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "paymentsheet_release"
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
.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final lazyPaymentConfig:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final productUsageTokens:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lcom/stripe/android/core/Logger;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V
    .locals 1
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .param p6    # Ljava/util/Set;
        .annotation runtime Ljavax/inject/Named;
            value = "productUsage"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lazyPaymentConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 32
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    .line 33
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->logger:Lcom/stripe/android/core/Logger;

    .line 34
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 35
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 36
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->productUsageTokens:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lcom/stripe/android/core/Logger;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 36
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 30
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;-><init>(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lcom/stripe/android/core/Logger;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic access$detachPaymentMethodAndDuplicates-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->detachPaymentMethodAndDuplicates-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$filterPaymentMethods(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->filterPaymentMethods(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getErrorReporter$p(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object p0
.end method

.method public static final synthetic access$getLazyPaymentConfig$p(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;)Ljavax/inject/Provider;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getProductUsageTokens$p(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;)Ljava/util/Set;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->productUsageTokens:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$getStripeRepository$p(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;)Lcom/stripe/android/networking/StripeRepository;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method private final detachPaymentMethodAndDuplicates-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    instance-of v4, v3, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;

    iget v5, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->label:I

    const/high16 v6, -0x80000000

    and-int/2addr v5, v6

    if-eqz v5, :cond_0

    iget v3, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->label:I

    sub-int/2addr v3, v6

    iput v3, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;

    invoke-direct {v4, v0, v3}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v3, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 234
    iget v6, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->label:I

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v6, :cond_5

    if-eq v6, v10, :cond_4

    if-eq v6, v9, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/Result;

    invoke-virtual {v3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v6, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    iget-object v8, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/Result;

    invoke-virtual {v3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_4
    iget-object v1, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v2, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v6, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    iget-object v10, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/Result;

    invoke-virtual {v3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v6

    move-object v6, v15

    move-object v15, v10

    goto :goto_1

    :cond_5
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 237
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v3}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    .line 241
    sget-object v6, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 238
    iput-object v1, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$0:Ljava/lang/Object;

    iput-object v2, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$1:Ljava/lang/Object;

    move-object/from16 v13, p3

    iput-object v13, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$2:Ljava/lang/Object;

    iput-object v3, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$3:Ljava/lang/Object;

    iput v10, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->label:I

    invoke-interface {v1, v2, v6, v11, v4}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->getPaymentMethods-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_6

    goto/16 :goto_8

    :cond_6
    move-object v15, v1

    move-object v1, v13

    .line 243
    :goto_1
    invoke-static {v6}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v10

    if-nez v10, :cond_13

    check-cast v6, Ljava/util/List;

    .line 247
    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lcom/stripe/android/model/PaymentMethod;

    .line 248
    iget-object v14, v14, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_7

    goto :goto_2

    :cond_8
    move-object v13, v12

    .line 247
    :goto_2
    check-cast v13, Lcom/stripe/android/model/PaymentMethod;

    if-nez v13, :cond_a

    .line 254
    iput-object v12, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$0:Ljava/lang/Object;

    iput-object v12, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$1:Ljava/lang/Object;

    iput-object v12, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$2:Ljava/lang/Object;

    iput-object v12, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$3:Ljava/lang/Object;

    iput v9, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->label:I

    invoke-interface {v15, v2, v1, v11, v4}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->detachPaymentMethod-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_9

    goto/16 :goto_8

    :cond_9
    return-object v1

    .line 326
    :cond_a
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .line 327
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v14, v10

    check-cast v14, Lcom/stripe/android/model/PaymentMethod;

    .line 266
    iget-object v11, v14, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v7, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v11, v7, :cond_d

    .line 267
    iget-object v7, v14, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v7, :cond_b

    iget-object v7, v7, Lcom/stripe/android/model/PaymentMethod$Card;->fingerprint:Ljava/lang/String;

    goto :goto_4

    :cond_b
    move-object v7, v12

    :goto_4
    iget-object v11, v13, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v11, :cond_c

    iget-object v11, v11, Lcom/stripe/android/model/PaymentMethod$Card;->fingerprint:Ljava/lang/String;

    goto :goto_5

    :cond_c
    move-object v11, v12

    :goto_5
    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    .line 268
    iget-object v7, v14, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    .line 327
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_d
    const/4 v7, 0x4

    const/4 v11, 0x0

    goto :goto_3

    .line 328
    :cond_e
    check-cast v9, Ljava/util/List;

    .line 271
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v17, v6

    check-cast v17, Ljava/util/List;

    .line 276
    check-cast v9, Ljava/lang/Iterable;

    .line 329
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v9, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 330
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 331
    move-object v14, v9

    check-cast v14, Lcom/stripe/android/model/PaymentMethod;

    .line 277
    new-instance v13, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1;

    const/16 v18, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v13 .. v18}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v9, v16

    move-object/from16 v2, v17

    move-object/from16 v19, v13

    check-cast v19, Lkotlin/jvm/functions/Function2;

    const/16 v20, 0x3

    const/16 v21, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v16 .. v21}, Lkotlinx/coroutines/BuildersKt;->async$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;

    move-result-object v3

    .line 331
    invoke-interface {v6, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v17, v2

    move-object v2, v9

    move-object/from16 v3, v16

    goto :goto_6

    :cond_f
    move-object v9, v2

    move-object/from16 v2, v17

    .line 332
    check-cast v6, Ljava/util/List;

    .line 297
    check-cast v6, Ljava/util/Collection;

    iput-object v15, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$0:Ljava/lang/Object;

    iput-object v9, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$1:Ljava/lang/Object;

    iput-object v1, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$2:Ljava/lang/Object;

    iput-object v2, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$3:Ljava/lang/Object;

    iput v8, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->label:I

    invoke-static {v6, v4}, Lkotlinx/coroutines/AwaitKt;->awaitAll(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_10

    goto :goto_8

    :cond_10
    move-object v6, v2

    move-object v2, v1

    move-object v1, v6

    move-object v6, v9

    move-object v8, v15

    .line 299
    :goto_7
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_11

    .line 300
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v2, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;-><init>(Ljava/util/List;)V

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 304
    :cond_11
    iput-object v12, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$0:Ljava/lang/Object;

    iput-object v12, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$1:Ljava/lang/Object;

    iput-object v12, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$2:Ljava/lang/Object;

    iput-object v12, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->L$3:Ljava/lang/Object;

    const/4 v1, 0x4

    iput v1, v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethodAndDuplicates$1;->label:I

    const/4 v1, 0x0

    invoke-interface {v8, v6, v2, v1, v4}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->detachPaymentMethod-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_12

    :goto_8
    return-object v5

    :cond_12
    return-object v1

    .line 244
    :cond_13
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v10}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method private final filterPaymentMethods(Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 188
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 190
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->getLinkPaymentMethods(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 192
    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v1, 0x4

    .line 195
    new-array v1, v1, [Lcom/stripe/android/model/wallets/Wallet$Type;

    sget-object v2, Lcom/stripe/android/model/wallets/Wallet$Type;->ApplePay:Lcom/stripe/android/model/wallets/Wallet$Type;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 196
    sget-object v2, Lcom/stripe/android/model/wallets/Wallet$Type;->GooglePay:Lcom/stripe/android/model/wallets/Wallet$Type;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const/4 v2, 0x2

    .line 197
    sget-object v5, Lcom/stripe/android/model/wallets/Wallet$Type;->SamsungPay:Lcom/stripe/android/model/wallets/Wallet$Type;

    aput-object v5, v1, v2

    const/4 v2, 0x3

    .line 198
    sget-object v5, Lcom/stripe/android/model/wallets/Wallet$Type;->Link:Lcom/stripe/android/model/wallets/Wallet$Type;

    aput-object v5, v1, v2

    .line 194
    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 201
    check-cast p1, Ljava/lang/Iterable;

    .line 312
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 313
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/stripe/android/model/PaymentMethod;

    .line 202
    iget-object v7, v6, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v8, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v7, v8, :cond_2

    .line 203
    move-object v7, v1

    check-cast v7, Ljava/lang/Iterable;

    iget-object v6, v6, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v6, :cond_1

    iget-object v6, v6, Lcom/stripe/android/model/PaymentMethod$Card;->wallet:Lcom/stripe/android/model/wallets/Wallet;

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/stripe/android/model/wallets/Wallet;->getWalletType()Lcom/stripe/android/model/wallets/Wallet$Type;

    move-result-object v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v4

    goto :goto_2

    :cond_2
    move v6, v3

    :goto_2
    if-nez v6, :cond_0

    .line 313
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 314
    :cond_3
    check-cast v2, Ljava/util/List;

    .line 312
    check-cast v2, Ljava/util/Collection;

    .line 200
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method private final getLinkPaymentMethods(Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 212
    check-cast p1, Ljava/lang/Iterable;

    .line 315
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 316
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    .line 213
    iget-object v4, v3, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v5, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v4, v5, :cond_0

    .line 214
    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Card;->wallet:Lcom/stripe/android/model/wallets/Wallet;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/stripe/android/model/wallets/Wallet;->getWalletType()Lcom/stripe/android/model/wallets/Wallet$Type;

    move-result-object v2

    :cond_1
    sget-object v3, Lcom/stripe/android/model/wallets/Wallet$Type;->Link:Lcom/stripe/android/model/wallets/Wallet$Type;

    if-ne v2, v3, :cond_0

    .line 316
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 317
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 315
    check-cast v0, Ljava/lang/Iterable;

    .line 318
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 319
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 320
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 321
    move-object v4, v3

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    .line 216
    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v4, :cond_4

    .line 218
    iget-object v5, v4, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object v5, v2

    :goto_2
    if-eqz v4, :cond_5

    iget-object v6, v4, Lcom/stripe/android/model/PaymentMethod$Card;->expiryMonth:Ljava/lang/Integer;

    goto :goto_3

    :cond_5
    move-object v6, v2

    :goto_3
    if-eqz v4, :cond_6

    iget-object v7, v4, Lcom/stripe/android/model/PaymentMethod$Card;->expiryYear:Ljava/lang/Integer;

    goto :goto_4

    :cond_6
    move-object v7, v2

    :goto_4
    if-eqz v4, :cond_7

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_7
    move-object v4, v2

    :goto_5
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v8, "-"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 322
    invoke-virtual {p1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 323
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 325
    :cond_8
    check-cast v1, Ljava/util/List;

    return-object v1
.end method


# virtual methods
.method public attachPaymentMethod-0E7RQCE(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;

    iget v2, v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v1

    iget-object v0, v7, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 143
    iget v2, v7, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v7, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, v7, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 147
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 148
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getId()Ljava/lang/String;

    move-result-object v0

    .line 149
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->productUsageTokens:Ljava/util/Set;

    .line 151
    new-instance v6, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 152
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v9

    .line 153
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v8, v6

    .line 151
    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 147
    iput-object p0, v7, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->L$0:Ljava/lang/Object;

    move-object/from16 v5, p2

    iput-object v5, v7, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v3, v7, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$attachPaymentMethod$1;->label:I

    move-object v3, v0

    invoke-interface/range {v2 .. v7}, Lcom/stripe/android/networking/StripeRepository;->attachPaymentMethod-yxL6bBk(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p0

    move-object/from16 p1, p2

    .line 155
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 156
    iget-object v1, v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->logger:Lcom/stripe/android/core/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to attach payment method "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v3, "."

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v2}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-object v0
.end method

.method public detachPaymentMethod-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v3, p2

    move-object/from16 v0, p4

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;

    iget v2, v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->label:I

    sub-int/2addr v0, v4

    iput v0, v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v5, v1

    iget-object v0, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 105
    iget v1, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->label:I

    const/4 v2, 0x3

    const/4 v4, 0x2

    const/4 v7, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v7, :cond_1

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/Result;

    invoke-virtual {v0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p3, :cond_4

    .line 111
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iput-object p0, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v7, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->label:I

    invoke-direct {p0, v0, p1, p2, v5}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->detachPaymentMethodAndDuplicates-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6

    goto :goto_1

    .line 116
    :cond_4
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 117
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 118
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v1

    .line 119
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->productUsageTokens:Ljava/util/Set;

    .line 121
    new-instance v7, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 122
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v8

    .line 123
    iget-object v9, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v9}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v9}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    .line 121
    invoke-direct/range {v7 .. v12}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 117
    iput-object p0, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v4, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->label:I

    move-object v4, v7

    invoke-interface/range {v0 .. v5}, Lcom/stripe/android/networking/StripeRepository;->detachPaymentMethod-yxL6bBk(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6

    goto :goto_1

    .line 127
    :cond_5
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 128
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->productUsageTokens:Ljava/util/Set;

    .line 130
    new-instance v7, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 131
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v8

    .line 132
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v4}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    .line 130
    invoke-direct/range {v7 .. v12}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 127
    iput-object p0, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v2, v5, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$detachPaymentMethod$1;->label:I

    invoke-interface {v0, v1, p2, v7, v5}, Lcom/stripe/android/networking/StripeRepository;->detachPaymentMethod-BWLJW6A(Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6

    :goto_1
    return-object v6

    :cond_6
    move-object v2, p0

    move-object v1, v3

    .line 138
    :goto_2
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 139
    iget-object v2, v2, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->logger:Lcom/stripe/android/core/Logger;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to detach payment method "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "."

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, v3}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object v0
.end method

.method public getPaymentMethods-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            ">;Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 52
    iget v2, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    iget-object p4, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$2;

    const/4 v9, 0x0

    move-object v6, p0

    move-object v7, p1

    move-object v5, p2

    move v8, p3

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$2;-><init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;ZLkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    iput v3, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$getPaymentMethods$1;->label:I

    invoke-static {p4, v4, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public retrieveCustomer(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/Customer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 39
    iget v2, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 42
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 43
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getId()Ljava/lang/String;

    move-result-object v2

    .line 44
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->productUsageTokens:Ljava/util/Set;

    .line 45
    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 46
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v6

    .line 47
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 45
    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    iput v3, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$retrieveCustomer$1;->label:I

    invoke-interface {p2, v2, v4, v5, v0}, Lcom/stripe/android/networking/StripeRepository;->retrieveCustomer-BWLJW6A(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 49
    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p1, 0x0

    :cond_4
    return-object p1
.end method

.method public setDefaultPaymentMethod-0E7RQCE(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/Customer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 175
    iget v2, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;->label:I

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

    .line 178
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 180
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getId()Ljava/lang/String;

    move-result-object v2

    .line 181
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 182
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v5

    .line 183
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 181
    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 178
    iput v3, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$setDefaultPaymentMethod$1;->label:I

    invoke-interface {p3, v2, p2, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->setDefaultPaymentMethod-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public updatePaymentMethod-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 159
    iget v2, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p3

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 164
    iget-object p4, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 167
    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 168
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v5

    .line 169
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->lazyPaymentConfig:Ljavax/inject/Provider;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 167
    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 164
    iput-object p0, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository$updatePaymentMethod$1;->label:I

    invoke-interface {p4, p2, p3, v4, v0}, Lcom/stripe/android/networking/StripeRepository;->updatePaymentMethod-BWLJW6A(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 171
    :goto_1
    invoke-static {p3}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p4

    if-eqz p4, :cond_4

    .line 172
    iget-object p1, p1, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;->logger:Lcom/stripe/android/core/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to update payment method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2, p4}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-object p3
.end method
