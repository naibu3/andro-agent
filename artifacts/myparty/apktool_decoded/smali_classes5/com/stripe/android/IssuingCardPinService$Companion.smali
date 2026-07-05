.class public final Lcom/stripe/android/IssuingCardPinService$Companion;
.super Ljava/lang/Object;
.source "IssuingCardPinService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/IssuingCardPinService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0007J,\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\rH\u0007R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/IssuingCardPinService$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "Ljava/lang/String;",
        "create",
        "Lcom/stripe/android/IssuingCardPinService;",
        "context",
        "Landroid/content/Context;",
        "keyProvider",
        "Lcom/stripe/android/EphemeralKeyProvider;",
        "publishableKey",
        "stripeAccountId",
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


# direct methods
.method public static synthetic $r8$lambda$TkUGQ4dIp_T1BiA3Bq_HTqiFdZU(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/IssuingCardPinService$Companion;->create$lambda$1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$vN4Ogq2YMGoYMMvtKVZnTps9GS0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/IssuingCardPinService$Companion;->create$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/IssuingCardPinService$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/IssuingCardPinService$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyProvider;ILjava/lang/Object;)Lcom/stripe/android/IssuingCardPinService;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    .line 359
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/IssuingCardPinService$Companion;->create(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyProvider;)Lcom/stripe/android/IssuingCardPinService;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method

.method private static final create$lambda$1(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public final create(Landroid/content/Context;Lcom/stripe/android/EphemeralKeyProvider;)Lcom/stripe/android/IssuingCardPinService;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    .line 347
    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v1

    .line 348
    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v0

    .line 345
    invoke-virtual {p0, p1, v1, v0, p2}, Lcom/stripe/android/IssuingCardPinService$Companion;->create(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyProvider;)Lcom/stripe/android/IssuingCardPinService;

    move-result-object p1

    return-object p1
.end method

.method public final create(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyProvider;)Lcom/stripe/android/IssuingCardPinService;
    .locals 8
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/IssuingCardPinService$Companion;->create$default(Lcom/stripe/android/IssuingCardPinService$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyProvider;ILjava/lang/Object;)Lcom/stripe/android/IssuingCardPinService;

    move-result-object p1

    return-object p1
.end method

.method public final create(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/EphemeralKeyProvider;)Lcom/stripe/android/IssuingCardPinService;
    .locals 19
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "publishableKey"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "keyProvider"

    move-object/from16 v3, p4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    invoke-static {}, Lcom/stripe/android/IssuingCardPinService;->access$getTAG$cp()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Please use Issuing Elements instead: https://stripe.com/docs/issuing/elements"

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 368
    new-instance v18, Lcom/stripe/android/IssuingCardPinService;

    .line 370
    new-instance v2, Lcom/stripe/android/networking/StripeApiRepository;

    move-object v4, v2

    .line 372
    new-instance v2, Lcom/stripe/android/IssuingCardPinService$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0}, Lcom/stripe/android/IssuingCardPinService$Companion$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    .line 373
    sget-object v5, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/Stripe$Companion;->getAppInfo()Lcom/stripe/android/core/AppInfo;

    move-result-object v5

    .line 374
    new-instance v11, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    .line 376
    new-instance v6, Lcom/stripe/android/IssuingCardPinService$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v6, v0}, Lcom/stripe/android/IssuingCardPinService$Companion$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;)V

    .line 377
    const-string v0, "IssuingCardPinService"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 374
    invoke-direct {v11, v1, v6, v0}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    const/16 v16, 0x7bf8

    const/16 v17, 0x0

    move-object v0, v4

    const/4 v4, 0x0

    move-object v3, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 370
    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/frauddetection/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/networking/StripeRepository;

    .line 380
    new-instance v0, Lcom/stripe/android/StripeOperationIdFactory;

    invoke-direct {v0}, Lcom/stripe/android/StripeOperationIdFactory;-><init>()V

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/OperationIdFactory;

    const/16 v9, 0x10

    move-object/from16 v7, p3

    move-object/from16 v4, p4

    move-object/from16 v3, v18

    .line 368
    invoke-direct/range {v3 .. v10}, Lcom/stripe/android/IssuingCardPinService;-><init>(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/OperationIdFactory;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method
