.class public final Lio/qonversion/sandwich/QonversionSandwich;
.super Ljava/lang/Object;
.source "QonversionSandwich.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0002,/\u0018\u00002\u00020\u0001:\u0001^B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\"\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0010J\u001e\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0019\u001a\u00020\u000c2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001b2\u0006\u0010\u0014\u001a\u00020\u0015JK\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\u0010\u0008\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001bH\u0002\u00a2\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\'\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`)2\u0006\u0010*\u001a\u00020 H\u0002J\u0015\u0010+\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u00a2\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u00a2\u0006\u0002\u00100J\u0016\u00101\u001a\u00020\u000c2\u0006\u00102\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015JL\u00103\u001a\u00020\u000c2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000e2\n\u0008\u0002\u00108\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010;\u001a\u00020 J\u000e\u0010<\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010=\u001a\u00020\u000c2\u0006\u0010>\u001a\u00020\u000e2\u0008\u0010?\u001a\u0004\u0018\u00010\u000e2\u0006\u0010@\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020\u000cJ\u000e\u0010C\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010D\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0015JS\u0010E\u001a\u00020\u000c2\u0006\u0010>\u001a\u00020\u000e2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010F\u001a\u0004\u0018\u00010\u000e2\u0008\u0010#\u001a\u0004\u0018\u00010\u000e2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010GJ\u0018\u0010H\u001a\u00020\u000c2\u0008\u0010I\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010J\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0015J$\u0010J\u001a\u00020\u000c2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001b2\u0006\u0010K\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010L\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010M\u001a\u00020\u000c2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000eJ\u0016\u0010P\u001a\u00020\u000c2\u0006\u0010Q\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000eJ\u0016\u0010R\u001a\u00020\u000c2\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u000eJ\u0006\u0010U\u001a\u00020\u000cJ\u0006\u0010V\u001a\u00020\u000cJ\u000e\u0010W\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010X\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010Y\u001a\u00020Z*\u00020Z2\u0008\u0010[\u001a\u0004\u0018\u00010\u000eH\u0002J\u000c\u0010\\\u001a\u00020Z*\u00020ZH\u0002J\u0016\u0010]\u001a\u00020Z*\u00020Z2\u0008\u00108\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006_"
    }
    d2 = {
        "Lio/qonversion/sandwich/QonversionSandwich;",
        "",
        "application",
        "Landroid/app/Application;",
        "activityProvider",
        "Lio/qonversion/sandwich/ActivityProvider;",
        "qonversionEventsListener",
        "Lio/qonversion/sandwich/QonversionEventsListener;",
        "(Landroid/app/Application;Lio/qonversion/sandwich/ActivityProvider;Lio/qonversion/sandwich/QonversionEventsListener;)V",
        "noActivityForPurchaseError",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "addAttributionData",
        "",
        "providerKey",
        "",
        "data",
        "",
        "attachUserToExperiment",
        "experimentId",
        "groupId",
        "resultListener",
        "Lio/qonversion/sandwich/ResultListener;",
        "attachUserToRemoteConfiguration",
        "remoteConfigurationId",
        "checkEntitlements",
        "checkTrialIntroEligibility",
        "ids",
        "",
        "configurePurchaseOptions",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "offerId",
        "applyOffer",
        "",
        "oldProduct",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "updatePolicyKey",
        "contextKeys",
        "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "detachUserFromExperiment",
        "detachUserFromRemoteConfiguration",
        "emptyResult",
        "Lio/qonversion/sandwich/BridgeData;",
        "success",
        "getEntitlementsCallback",
        "io/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1",
        "(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;",
        "getUserCallback",
        "io/qonversion/sandwich/QonversionSandwich$getUserCallback$1",
        "(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getUserCallback$1;",
        "identify",
        "userId",
        "initialize",
        "context",
        "Landroid/content/Context;",
        "projectKey",
        "launchModeKey",
        "environmentKey",
        "entitlementsCacheLifetimeKey",
        "proxyUrl",
        "kidsMode",
        "isFallbackFileAccessible",
        "loadProduct",
        "productId",
        "offeringId",
        "callback",
        "Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;",
        "logout",
        "offerings",
        "products",
        "purchase",
        "oldProductId",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/qonversion/sandwich/ResultListener;)V",
        "remoteConfig",
        "contextKey",
        "remoteConfigList",
        "includeEmptyContextKey",
        "restore",
        "setCustomProperty",
        "key",
        "value",
        "setDefinedProperty",
        "propertyKey",
        "storeSdkInfo",
        "source",
        "version",
        "syncHistoricalData",
        "syncPurchases",
        "userInfo",
        "userProperties",
        "setEntitlementsCacheLifetime",
        "Lcom/qonversion/android/sdk/QonversionConfig$Builder;",
        "lifetimeKey",
        "setEntitlementsUpdateListener",
        "setEnvironment",
        "ProductCallback",
        "sandwich_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final activityProvider:Lio/qonversion/sandwich/ActivityProvider;

.field private final application:Landroid/app/Application;

.field private final noActivityForPurchaseError:Lcom/qonversion/android/sdk/dto/QonversionError;

.field private final qonversionEventsListener:Lio/qonversion/sandwich/QonversionEventsListener;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lio/qonversion/sandwich/ActivityProvider;Lio/qonversion/sandwich/QonversionEventsListener;)V
    .locals 7

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qonversionEventsListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lio/qonversion/sandwich/QonversionSandwich;->application:Landroid/app/Application;

    .line 44
    iput-object p2, p0, Lio/qonversion/sandwich/QonversionSandwich;->activityProvider:Lio/qonversion/sandwich/ActivityProvider;

    .line 45
    iput-object p3, p0, Lio/qonversion/sandwich/QonversionSandwich;->qonversionEventsListener:Lio/qonversion/sandwich/QonversionEventsListener;

    .line 48
    new-instance p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 49
    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 48
    const-string v3, "Current Android activity is null, cannot perform the action."

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/qonversion/sandwich/QonversionSandwich;->noActivityForPurchaseError:Lcom/qonversion/android/sdk/dto/QonversionError;

    return-void
.end method

.method public static final synthetic access$configurePurchaseOptions(Lio/qonversion/sandwich/QonversionSandwich;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
    .locals 0

    .line 42
    invoke-direct/range {p0 .. p5}, Lio/qonversion/sandwich/QonversionSandwich;->configurePurchaseOptions(Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$emptyResult(Lio/qonversion/sandwich/QonversionSandwich;Z)Ljava/util/Map;
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->emptyResult(Z)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getQonversionEventsListener$p(Lio/qonversion/sandwich/QonversionSandwich;)Lio/qonversion/sandwich/QonversionEventsListener;
    .locals 0

    .line 42
    iget-object p0, p0, Lio/qonversion/sandwich/QonversionSandwich;->qonversionEventsListener:Lio/qonversion/sandwich/QonversionEventsListener;

    return-object p0
.end method

.method private final configurePurchaseOptions(Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;"
        }
    .end annotation

    .line 359
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;-><init>()V

    if-eqz p3, :cond_0

    .line 362
    invoke-virtual {v0, p3}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setOldProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    :cond_0
    if-eqz p4, :cond_1

    .line 367
    :try_start_0
    invoke-static {p4}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    .line 372
    invoke-virtual {v0, p3}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setUpdatePolicy(Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    :cond_1
    if-eqz p1, :cond_2

    .line 376
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setOfferId(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    :cond_2
    const/4 p1, 0x0

    .line 379
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 380
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->removeOffer()Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    :cond_3
    if-eqz p5, :cond_4

    .line 384
    invoke-virtual {v0, p5}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setContextKeys(Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 387
    :cond_4
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->build()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object p1

    return-object p1
.end method

.method static synthetic configurePurchaseOptions$default(Lio/qonversion/sandwich/QonversionSandwich;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
    .locals 7

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    move-object v6, v0

    goto :goto_2

    :cond_2
    move-object v6, p5

    :goto_2
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    .line 352
    invoke-direct/range {v1 .. v6}, Lio/qonversion/sandwich/QonversionSandwich;->configurePurchaseOptions(Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object p0

    return-object p0
.end method

.method private final emptyResult(Z)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 349
    const-string v0, "success"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final getEntitlementsCallback(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;
    .locals 1

    .line 457
    new-instance v0, Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    invoke-direct {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    return-object v0
.end method

.method private final getUserCallback(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getUserCallback$1;
    .locals 1

    .line 468
    new-instance v0, Lio/qonversion/sandwich/QonversionSandwich$getUserCallback$1;

    invoke-direct {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich$getUserCallback$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    return-object v0
.end method

.method public static synthetic initialize$default(Lio/qonversion/sandwich/QonversionSandwich;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p8, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p4

    :goto_0
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p5

    :goto_1
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    move v9, v0

    goto :goto_3

    :cond_3
    move/from16 v9, p7

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 55
    invoke-virtual/range {v2 .. v9}, Lio/qonversion/sandwich/QonversionSandwich;->initialize(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method private final loadProduct(Ljava/lang/String;Ljava/lang/String;Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;)V
    .locals 2

    if-nez p2, :cond_0

    .line 404
    invoke-interface {p3}, Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;->onLoadingFailed()V

    return-void

    .line 407
    :cond_0
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$loadProduct$1;

    invoke-direct {v1, p2, p3, p1}, Lio/qonversion/sandwich/QonversionSandwich$loadProduct$1;-><init>(Ljava/lang/String;Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;Ljava/lang/String;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/Qonversion;->offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    return-void
.end method

.method private final setEntitlementsCacheLifetime(Lcom/qonversion/android/sdk/QonversionConfig$Builder;Ljava/lang/String;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 2

    if-nez p2, :cond_0

    goto :goto_0

    .line 441
    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    move-result-object v0

    .line 442
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->setEntitlementsCacheLifetime(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 444
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No entitlements cache lifetime found for key "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Qonversion"

    invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object p1
.end method

.method private final setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/QonversionConfig$Builder;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1

    .line 449
    new-instance v0, Lio/qonversion/sandwich/QonversionSandwich$setEntitlementsUpdateListener$1$1;

    invoke-direct {v0, p0}, Lio/qonversion/sandwich/QonversionSandwich$setEntitlementsUpdateListener$1$1;-><init>(Lio/qonversion/sandwich/QonversionSandwich;)V

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    return-object p1
.end method

.method private final setEnvironment(Lcom/qonversion/android/sdk/QonversionConfig$Builder;Ljava/lang/String;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 2

    if-nez p2, :cond_0

    goto :goto_0

    .line 431
    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/qonversion/android/sdk/dto/QEnvironment;->valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QEnvironment;

    move-result-object v0

    .line 432
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->setEnvironment(Lcom/qonversion/android/sdk/dto/QEnvironment;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 434
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No environment found for key "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Qonversion"

    invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final addAttributionData(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "providerKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    :try_start_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    move-result-object p1

    .line 227
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Lcom/qonversion/android/sdk/Qonversion;->attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$attachUserToExperiment$1;

    invoke-direct {v1, p3, p0}, Lio/qonversion/sandwich/QonversionSandwich$attachUserToExperiment$1;-><init>(Lio/qonversion/sandwich/ResultListener;Lio/qonversion/sandwich/QonversionSandwich;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;

    invoke-interface {v0, p1, p2, v1}, Lcom/qonversion/android/sdk/Qonversion;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    return-void
.end method

.method public final attachUserToRemoteConfiguration(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$attachUserToRemoteConfiguration$1;

    invoke-direct {v1, p2, p0}, Lio/qonversion/sandwich/QonversionSandwich$attachUserToRemoteConfiguration$1;-><init>(Lio/qonversion/sandwich/ResultListener;Lio/qonversion/sandwich/QonversionSandwich;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;

    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/Qonversion;->attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    return-void
.end method

.method public final checkEntitlements(Lio/qonversion/sandwich/ResultListener;)V
    .locals 1

    const-string v0, "resultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    invoke-direct {p0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->getEntitlementsCallback(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    move-result-object p1

    .line 132
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/Qonversion;->checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    return-void
.end method

.method public final checkTrialIntroEligibility(Ljava/util/List;Lio/qonversion/sandwich/ResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/qonversion/sandwich/ResultListener;",
            ")V"
        }
    .end annotation

    const-string v0, "ids"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    .line 171
    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$checkTrialIntroEligibility$1;

    invoke-direct {v1, p2}, Lio/qonversion/sandwich/QonversionSandwich$checkTrialIntroEligibility$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    .line 169
    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/Qonversion;->checkTrialIntroEligibility(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    return-void
.end method

.method public final detachUserFromExperiment(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$detachUserFromExperiment$1;

    invoke-direct {v1, p2, p0}, Lio/qonversion/sandwich/QonversionSandwich$detachUserFromExperiment$1;-><init>(Lio/qonversion/sandwich/ResultListener;Lio/qonversion/sandwich/QonversionSandwich;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;

    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/Qonversion;->detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    return-void
.end method

.method public final detachUserFromRemoteConfiguration(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$detachUserFromRemoteConfiguration$1;

    invoke-direct {v1, p2, p0}, Lio/qonversion/sandwich/QonversionSandwich$detachUserFromRemoteConfiguration$1;-><init>(Lio/qonversion/sandwich/ResultListener;Lio/qonversion/sandwich/QonversionSandwich;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;

    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/Qonversion;->detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    return-void
.end method

.method public final identify(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-direct {p0, p2}, Lio/qonversion/sandwich/QonversionSandwich;->getUserCallback(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getUserCallback$1;

    move-result-object p2

    check-cast p2, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/Qonversion;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    return-void
.end method

.method public final initialize(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "projectKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchModeKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-static {p3}, Lcom/qonversion/android/sdk/dto/QLaunchMode;->valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QLaunchMode;

    move-result-object p3

    .line 65
    new-instance v0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    invoke-direct {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/QonversionConfig$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;)V

    .line 66
    invoke-direct {p0, v0, p4}, Lio/qonversion/sandwich/QonversionSandwich;->setEnvironment(Lcom/qonversion/android/sdk/QonversionConfig$Builder;Ljava/lang/String;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    move-result-object p1

    .line 67
    invoke-direct {p0, p1, p5}, Lio/qonversion/sandwich/QonversionSandwich;->setEntitlementsCacheLifetime(Lcom/qonversion/android/sdk/QonversionConfig$Builder;Ljava/lang/String;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    move-result-object p1

    .line 68
    invoke-direct {p0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/QonversionConfig$Builder;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    move-result-object p1

    if-eqz p6, :cond_0

    .line 71
    invoke-virtual {p1, p6}, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->setProxyURL(Ljava/lang/String;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    :cond_0
    if-eqz p7, :cond_1

    .line 75
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->enableKidsMode()Lcom/qonversion/android/sdk/QonversionConfig$Builder;

    .line 78
    :cond_1
    sget-object p2, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->build()Lcom/qonversion/android/sdk/QonversionConfig;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->initialize(Lcom/qonversion/android/sdk/QonversionConfig;)Lcom/qonversion/android/sdk/Qonversion;

    return-void
.end method

.method public final isFallbackFileAccessible(Lio/qonversion/sandwich/ResultListener;)V
    .locals 1

    const-string v0, "resultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/Qonversion;->isFallbackFileAccessible()Z

    move-result v0

    .line 341
    invoke-direct {p0, v0}, Lio/qonversion/sandwich/QonversionSandwich;->emptyResult(Z)Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/qonversion/sandwich/ResultListener;->onSuccess(Ljava/util/Map;)V

    return-void
.end method

.method public final logout()V
    .locals 1

    .line 221
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/Qonversion;->logout()V

    return-void
.end method

.method public final offerings(Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "resultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$offerings$1;

    invoke-direct {v1, p1}, Lio/qonversion/sandwich/QonversionSandwich$offerings$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/Qonversion;->offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    return-void
.end method

.method public final products(Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "resultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$products$1;

    invoke-direct {v1, p1}, Lio/qonversion/sandwich/QonversionSandwich$products$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/Qonversion;->products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    return-void
.end method

.method public final purchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/qonversion/sandwich/ResultListener;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/qonversion/sandwich/ResultListener;",
            ")V"
        }
    .end annotation

    move-object v10, p0

    move-object/from16 v0, p7

    const-string v1, "productId"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "resultListener"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    iget-object v1, v10, Lio/qonversion/sandwich/QonversionSandwich;->activityProvider:Lio/qonversion/sandwich/ActivityProvider;

    invoke-interface {v1}, Lio/qonversion/sandwich/ActivityProvider;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v8

    if-nez v8, :cond_0

    .line 102
    move-object v1, v10

    check-cast v1, Lio/qonversion/sandwich/QonversionSandwich;

    .line 103
    iget-object v1, v10, Lio/qonversion/sandwich/QonversionSandwich;->noActivityForPurchaseError:Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toSandwichError(Lcom/qonversion/android/sdk/dto/QonversionError;)Lio/qonversion/sandwich/SandwichError;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/qonversion/sandwich/ResultListener;->onError(Lio/qonversion/sandwich/SandwichError;)V

    return-void

    .line 107
    :cond_0
    invoke-direct {p0, v0}, Lio/qonversion/sandwich/QonversionSandwich;->getEntitlementsCallback(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    move-result-object v9

    .line 109
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v11

    new-instance v12, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;

    move-object v0, v12

    move-object v1, p1

    move-object/from16 v2, p4

    move-object v3, p0

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Lio/qonversion/sandwich/QonversionSandwich$purchase$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/qonversion/sandwich/QonversionSandwich;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Landroid/app/Activity;Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;)V

    check-cast v12, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    invoke-interface {v11, v12}, Lcom/qonversion/android/sdk/Qonversion;->products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    return-void
.end method

.method public final remoteConfig(Ljava/lang/String;Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    new-instance v0, Lio/qonversion/sandwich/QonversionSandwich$remoteConfig$callback$1;

    invoke-direct {v0, p2}, Lio/qonversion/sandwich/QonversionSandwich$remoteConfig$callback$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    if-eqz p1, :cond_0

    .line 248
    sget-object p2, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object p2

    move-object v1, v0

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    invoke-interface {p2, p1, v1}, Lcom/qonversion/android/sdk/Qonversion;->remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    .line 247
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 249
    move-object p1, p0

    check-cast p1, Lio/qonversion/sandwich/QonversionSandwich;

    .line 250
    sget-object p1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object p1

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/Qonversion;->remoteConfig(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    :cond_1
    return-void
.end method

.method public final remoteConfigList(Lio/qonversion/sandwich/ResultListener;)V
    .locals 1

    const-string v0, "resultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    new-instance v0, Lio/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$2;

    invoke-direct {v0, p1}, Lio/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$2;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    .line 279
    sget-object p1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object p1

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/Qonversion;->remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method

.method public final remoteConfigList(Ljava/util/List;ZLio/qonversion/sandwich/ResultListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/qonversion/sandwich/ResultListener;",
            ")V"
        }
    .end annotation

    const-string v0, "contextKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    new-instance v0, Lio/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$1;

    invoke-direct {v0, p3}, Lio/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    .line 265
    sget-object p3, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {p3}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object p3

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    invoke-interface {p3, p1, p2, v0}, Lcom/qonversion/android/sdk/Qonversion;->remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method

.method public final restore(Lio/qonversion/sandwich/ResultListener;)V
    .locals 1

    const-string v0, "resultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    invoke-direct {p0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->getEntitlementsCallback(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getEntitlementsCallback$1;

    move-result-object p1

    .line 161
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/Qonversion;->restore(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    return-void
.end method

.method public final setCustomProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/Qonversion;->setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setDefinedProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "propertyKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    :try_start_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    move-result-object p1

    .line 198
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/Qonversion;->setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final storeSdkInfo(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lio/qonversion/sandwich/QonversionSandwich;->application:Landroid/app/Application;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 83
    const-string v1, "com.qonversion.keys.sourceVersion"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 84
    const-string p2, "com.qonversion.keys.source"

    invoke-interface {v0, p2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 85
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final syncHistoricalData()V
    .locals 1

    .line 335
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/Qonversion;->syncHistoricalData()V

    return-void
.end method

.method public final syncPurchases()V
    .locals 1

    .line 165
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/Qonversion;->syncPurchases()V

    return-void
.end method

.method public final userInfo(Lio/qonversion/sandwich/ResultListener;)V
    .locals 1

    const-string v0, "resultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/qonversion/sandwich/QonversionSandwich;->getUserCallback(Lio/qonversion/sandwich/ResultListener;)Lio/qonversion/sandwich/QonversionSandwich$getUserCallback$1;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/Qonversion;->userInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    return-void
.end method

.method public final userProperties(Lio/qonversion/sandwich/ResultListener;)V
    .locals 2

    const-string v0, "resultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    new-instance v1, Lio/qonversion/sandwich/QonversionSandwich$userProperties$1;

    invoke-direct {v1, p1}, Lio/qonversion/sandwich/QonversionSandwich$userProperties$1;-><init>(Lio/qonversion/sandwich/ResultListener;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/Qonversion;->userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V

    return-void
.end method
