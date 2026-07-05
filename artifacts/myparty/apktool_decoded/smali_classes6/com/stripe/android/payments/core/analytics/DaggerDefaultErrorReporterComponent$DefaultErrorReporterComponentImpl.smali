.class final Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;
.super Ljava/lang/Object;
.source "DaggerDefaultErrorReporterComponent.java"

# interfaces
.implements Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "DefaultErrorReporterComponentImpl"
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private final defaultErrorReporterComponentImpl:Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;

.field private final productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p0, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->defaultErrorReporterComponentImpl:Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;

    .line 67
    iput-object p1, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->context:Landroid/content/Context;

    .line 68
    iput-object p2, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->productUsage:Ljava/util/Set;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Ljava/util/Set;Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent-IA;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    return-void
.end method

.method private defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;
    .locals 3

    .line 73
    new-instance v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    invoke-static {}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;->provideLogger()Lcom/stripe/android/core/Logger;

    move-result-object v1

    invoke-static {}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideIoContextFactory;->provideIoContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private namedFunction0OfString()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvidePublishableKeyFactory;->providePublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method private paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 4

    .line 81
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v1, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->context:Landroid/content/Context;

    invoke-direct {p0}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->namedFunction0OfString()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->productUsage:Ljava/util/Set;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-object v0
.end method

.method private realErrorReporter()Lcom/stripe/android/payments/core/analytics/RealErrorReporter;
    .locals 3

    .line 85
    new-instance v0, Lcom/stripe/android/payments/core/analytics/RealErrorReporter;

    invoke-direct {p0}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/payments/core/analytics/RealErrorReporter;-><init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;)V

    return-object v0
.end method


# virtual methods
.method public getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 1

    .line 90
    invoke-direct {p0}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;->realErrorReporter()Lcom/stripe/android/payments/core/analytics/RealErrorReporter;

    move-result-object v0

    return-object v0
.end method
