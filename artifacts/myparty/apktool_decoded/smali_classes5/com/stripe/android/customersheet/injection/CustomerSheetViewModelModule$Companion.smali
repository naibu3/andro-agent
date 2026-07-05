.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSheetViewModelModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetViewModelModule.kt\ncom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0008\u0010\u0008\u001a\u00020\tH\u0007J\u0008\u0010\n\u001a\u00020\u000bH\u0007J\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\r2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000eH\u0007J\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000eH\u0007J\u001c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\r2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000eH\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001\u00a2\u0006\u0002\u0008\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0008\u0010\u001f\u001a\u00020 H\u0007J\u0008\u0010!\u001a\u00020 H\u0007J\u000e\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\t0#H\u0007J\u0008\u0010$\u001a\u00020\u0011H\u0007J\u0012\u0010%\u001a\u00020&2\u0008\u0008\u0001\u0010\'\u001a\u00020\u0011H\u0007J\n\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u0008\u0010*\u001a\u00020\u0011H\u0007J\n\u0010+\u001a\u0004\u0018\u00010,H\u0007R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;",
        "",
        "<init>",
        "()V",
        "paymentConfiguration",
        "Lcom/stripe/android/PaymentConfiguration;",
        "application",
        "Landroid/app/Application;",
        "providesPaymentElementCallbackIdentifier",
        "",
        "providesIsFinancialConnectionsAvailable",
        "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;",
        "providePublishableKey",
        "Lkotlin/Function0;",
        "Ljavax/inject/Provider;",
        "provideStripeAccountId",
        "isLiveMode",
        "",
        "providesUserFacingLogger",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
        "providesErrorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "analyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "providesErrorReporter$paymentsheet_release",
        "resources",
        "Landroid/content/res/Resources;",
        "context",
        "Landroid/content/Context;",
        "ioContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "uiContext",
        "provideProductUsageTokens",
        "",
        "providesEnableLogging",
        "provideLogger",
        "Lcom/stripe/android/core/Logger;",
        "enableLogging",
        "provideLocale",
        "Ljava/util/Locale;",
        "provideAllowsManualConfirmation",
        "savedPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

.field private static final savedPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;


# direct methods
.method public static synthetic $r8$lambda$3PWvCdH2XWz5ifgdtFR6qY2YNu0(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->providePublishableKey$lambda$0(Ljavax/inject/Provider;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$kQjsylbSCNPjq-73r1xrwba3tRc(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->provideStripeAccountId$lambda$1(Ljavax/inject/Provider;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$l78U3cCSjcI2tXrSc0KGVdJw5Yw(Ljavax/inject/Provider;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->isLiveMode$lambda$2(Ljavax/inject/Provider;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->$$INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final isLiveMode$lambda$2(Ljavax/inject/Provider;)Z
    .locals 4

    .line 107
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "pk_live"

    const/4 v3, 0x0

    invoke-static {p0, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final providePublishableKey$lambda$0(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    .line 95
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final provideStripeAccountId$lambda$1(Ljavax/inject/Provider;)Ljava/lang/String;
    .locals 0

    .line 101
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final context(Landroid/app/Application;)Landroid/content/Context;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    check-cast p1, Landroid/content/Context;

    return-object p1
.end method

.method public final ioContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation runtime Lcom/stripe/android/core/injection/IOContext;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 134
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final isLiveMode(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "isLiveMode"
    .end annotation

    const-string v0, "paymentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda0;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public final paymentConfiguration(Landroid/app/Application;)Lcom/stripe/android/PaymentConfiguration;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {v0, p1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p1

    return-object p1
.end method

.method public final provideAllowsManualConfirmation()Z
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ALLOWS_MANUAL_CONFIRMATION"
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public final provideLocale()Ljava/util/Locale;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 157
    invoke-static {}, Landroidx/core/os/LocaleListCompat;->getAdjustedDefault()Landroidx/core/os/LocaleListCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/os/LocaleListCompat;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/os/LocaleListCompat;->get(I)Ljava/util/Locale;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v2
.end method

.method public final provideLogger(Z)Lcom/stripe/android/core/Logger;
    .locals 1
    .param p1    # Z
        .annotation runtime Ljavax/inject/Named;
            value = "enableLogging"
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 153
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object p1

    return-object p1
.end method

.method public final provideProductUsageTokens()Ljava/util/Set;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "productUsage"
    .end annotation

    .line 145
    const-string v0, "CustomerSheet"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final providePublishableKey(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "publishableKey"
    .end annotation

    const-string v0, "paymentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda2;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda2;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public final provideStripeAccountId(Ljavax/inject/Provider;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;)",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "stripeAccountId"
    .end annotation

    const-string v0, "paymentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion$$ExternalSyntheticLambda1;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public final providesEnableLogging()Z
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "enableLogging"
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public final providesErrorReporter$paymentsheet_release(Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "analyticsRequestFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    new-instance v0, Lcom/stripe/android/payments/core/analytics/RealErrorReporter;

    invoke-direct {v0, p2, p1}, Lcom/stripe/android/payments/core/analytics/RealErrorReporter;-><init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;)V

    check-cast v0, Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object v0
.end method

.method public final providesIsFinancialConnectionsAvailable()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 88
    sget-object v0, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;->INSTANCE:Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;

    check-cast v0, Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;

    return-object v0
.end method

.method public final providesPaymentElementCallbackIdentifier()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 83
    const-string v0, "CustomerSheet"

    return-object v0
.end method

.method public final providesUserFacingLogger()Lcom/stripe/android/core/utils/UserFacingLogger;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final resources(Landroid/app/Application;)Landroid/content/res/Resources;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p1}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const-string v0, "getResources(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final savedPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 164
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->savedPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public final uiContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation runtime Lcom/stripe/android/core/injection/UIContext;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 140
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method
