.class public final Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;
.super Ljava/lang/Object;
.source "GooglePayRepository.kt"

# interfaces
.implements Lcom/stripe/android/googlepaylauncher/GooglePayRepository;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B1\u0008\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0017J\u000e\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\t0!H\u0016J\u000e\u0010\"\u001a\u00020\tH\u0082@\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
        "context",
        "Landroid/content/Context;",
        "environment",
        "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
        "billingAddressParameters",
        "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;",
        "existingPaymentMethodRequired",
        "",
        "allowCreditCards",
        "paymentsClientFactory",
        "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/googlepaylauncher/PaymentsClientFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/CardBrandFilter;)V",
        "googlePayConfig",
        "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;",
        "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/CardBrandFilter;)V",
        "googlePayJsonFactory",
        "Lcom/stripe/android/GooglePayJsonFactory;",
        "googlePayAvailabilityClient",
        "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;",
        "getGooglePayAvailabilityClient",
        "()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;",
        "googlePayAvailabilityClient$delegate",
        "Lkotlin/Lazy;",
        "isReady",
        "Lkotlinx/coroutines/flow/Flow;",
        "isReadyAsync",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final allowCreditCards:Z

.field private final billingAddressParameters:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final context:Landroid/content/Context;

.field private final environment:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final existingPaymentMethodRequired:Z

.field private final googlePayAvailabilityClient$delegate:Lkotlin/Lazy;

.field private final googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final paymentsClientFactory:Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;


# direct methods
.method public static synthetic $r8$lambda$2VfZ-QZEUlQqG9zRLxdJ6tWhjf8(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;)Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->googlePayAvailabilityClient_delegate$lambda$0(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;)Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/googlepaylauncher/PaymentsClientFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/CardBrandFilter;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingAddressParameters"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentsClientFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->context:Landroid/content/Context;

    .line 46
    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->environment:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    .line 47
    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->billingAddressParameters:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    .line 48
    iput-boolean p4, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->existingPaymentMethodRequired:Z

    .line 49
    iput-boolean p5, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->allowCreditCards:Z

    .line 50
    iput-object p6, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->paymentsClientFactory:Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;

    .line 51
    iput-object p7, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 52
    iput-object p8, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->logger:Lcom/stripe/android/core/Logger;

    .line 53
    iput-object p9, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    move-object p2, p1

    .line 75
    new-instance p1, Lcom/stripe/android/GooglePayJsonFactory;

    const/4 p5, 0x2

    const/4 p6, 0x0

    const/4 p3, 0x0

    move-object p4, p9

    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Landroid/content/Context;ZLcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    .line 77
    new-instance p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->googlePayAvailabilityClient$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/googlepaylauncher/PaymentsClientFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 50
    new-instance v1, Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;

    invoke-direct {v1, p1}, Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;-><init>(Landroid/content/Context;)V

    check-cast v1, Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    .line 52
    sget-object v1, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/core/Logger$Companion;->noop()Lcom/stripe/android/core/Logger;

    move-result-object v1

    move-object v10, v1

    goto :goto_1

    :cond_1
    move-object/from16 v10, p8

    :goto_1
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_2

    .line 53
    sget-object v0, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    check-cast v0, Lcom/stripe/android/CardBrandFilter;

    move-object v11, v0

    goto :goto_2

    :cond_2
    move-object/from16 v11, p9

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v9, p7

    .line 44
    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/googlepaylauncher/PaymentsClientFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/CardBrandFilter;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/CardBrandFilter;)V
    .locals 11
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    move-object/from16 v10, p5

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "getApplicationContext(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getEnvironment()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    move-result-object v3

    .line 66
    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getBillingAddressConfig()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/googlepaylauncher/ConvertKt;->convert(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;)Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    move-result-object v4

    .line 67
    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getExistingPaymentMethodRequired()Z

    move-result v5

    .line 68
    invoke-virtual {p2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;->getAllowCreditCards()Z

    move-result v6

    .line 69
    new-instance p2, Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;

    invoke-direct {p2, p1}, Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;-><init>(Landroid/content/Context;)V

    move-object v7, p2

    check-cast v7, Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;

    move-object v1, p0

    move-object v9, p3

    move-object v8, p4

    .line 63
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;-><init>(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/googlepaylauncher/PaymentsClientFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/CardBrandFilter;)V

    return-void
.end method

.method public static final synthetic access$isReadyAsync(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->isReadyAsync(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getGooglePayAvailabilityClient()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->googlePayAvailabilityClient$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;

    return-object v0
.end method

.method private static final googlePayAvailabilityClient_delegate$lambda$0(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;)Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;
    .locals 2

    .line 78
    sget-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository;->Companion:Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;->getGooglePayAvailabilityClientFactory()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;

    move-result-object v0

    .line 79
    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->paymentsClientFactory:Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;

    iget-object p0, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->environment:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    invoke-interface {v1, p0}, Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;->create(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)Lcom/google/android/gms/wallet/PaymentsClient;

    move-result-object p0

    .line 78
    invoke-interface {v0, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;->create(Lcom/google/android/gms/wallet/PaymentsClient;)Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;

    move-result-object p0

    return-object p0
.end method

.method private final isReadyAsync(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;

    iget v1, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;-><init>(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object p1, v0

    iget-object v0, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 93
    iget v2, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    .line 96
    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->googlePayJsonFactory:Lcom/stripe/android/GooglePayJsonFactory;

    .line 97
    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->billingAddressParameters:Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;

    .line 98
    iget-boolean v5, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->existingPaymentMethodRequired:Z

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 99
    iget-boolean v6, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->allowCreditCards:Z

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 96
    invoke-virtual {v0, v2, v5, v6}, Lcom/stripe/android/GooglePayJsonFactory;->createIsReadyToPayRequest(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lorg/json/JSONObject;

    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 95
    invoke-static {v0}, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->fromJson(Ljava/lang/String;)Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    move-result-object v0

    .line 94
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 102
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_6

    const-string v2, "getOrElse(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    .line 113
    :try_start_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;

    .line 114
    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->getGooglePayAvailabilityClient()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;

    move-result-object v2

    iput-object p0, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;->L$0:Ljava/lang/Object;

    iput v4, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReadyAsync$1;->label:I

    invoke-interface {v2, v0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;->isReady(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_2
    :try_start_3
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 113
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object p1, p0

    :goto_3
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 115
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 116
    iget-object v4, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 117
    sget-object v2, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->GOOGLE_PAY_IS_READY_API_CALL:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 118
    sget-object v2, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v2, v1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 116
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 121
    iget-object v2, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->logger:Lcom/stripe/android/core/Logger;

    const-string v4, "Google Pay check failed."

    invoke-interface {v2, v4, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    :cond_4
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v0, v1

    :cond_5
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 124
    iget-object p1, p1, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Google Pay ready? "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/Logger;->info(Ljava/lang/String;)V

    .line 126
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 103
    :cond_6
    iget-object v4, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 104
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->GOOGLE_PAY_JSON_REQUEST_PARSING:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v5, p1

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 105
    sget-object p1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {p1, v2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 103
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 108
    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;->logger:Lcom/stripe/android/core/Logger;

    const-string v0, "Google Pay json parsing failed."

    invoke-interface {p1, v0, v2}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public isReady()Lkotlinx/coroutines/flow/Flow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 89
    new-instance v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReady$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository$isReady$1;-><init>(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method
