.class public final Lcom/reactnativestripesdk/StripeSdkPackage;
.super Lcom/facebook/react/BaseReactPackage;
.source "StripeSdkPackage.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0008\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u000e0\r2\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/reactnativestripesdk/StripeSdkPackage;",
        "Lcom/facebook/react/BaseReactPackage;",
        "<init>",
        "()V",
        "getModule",
        "Lcom/facebook/react/bridge/NativeModule;",
        "name",
        "",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "getReactModuleInfoProvider",
        "Lcom/facebook/react/module/model/ReactModuleInfoProvider;",
        "createViewManagers",
        "",
        "Lcom/facebook/react/uimanager/ViewManager;",
        "stripe_stripe-react-native_release"
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


# direct methods
.method public static synthetic $r8$lambda$yxErHalTfs3ThV8IxHuWr68ni0I(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/reactnativestripesdk/StripeSdkPackage;->getReactModuleInfoProvider$lambda$0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/facebook/react/BaseReactPackage;-><init>()V

    return-void
.end method

.method private static final getReactModuleInfoProvider$lambda$0(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager<",
            "**>;>;"
        }
    .end annotation

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    .line 45
    new-array v0, v0, [Lcom/facebook/react/uimanager/ViewManager;

    new-instance v1, Lcom/reactnativestripesdk/CardFieldViewManager;

    invoke-direct {v1}, Lcom/reactnativestripesdk/CardFieldViewManager;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 46
    new-instance v1, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;

    invoke-direct {v1}, Lcom/reactnativestripesdk/AuBECSDebitFormViewManager;-><init>()V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 47
    new-instance v1, Lcom/reactnativestripesdk/StripeContainerManager;

    invoke-direct {v1}, Lcom/reactnativestripesdk/StripeContainerManager;-><init>()V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 48
    new-instance v1, Lcom/reactnativestripesdk/CardFormViewManager;

    invoke-direct {v1}, Lcom/reactnativestripesdk/CardFormViewManager;-><init>()V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 49
    new-instance v1, Lcom/reactnativestripesdk/GooglePayButtonManager;

    invoke-direct {v1}, Lcom/reactnativestripesdk/GooglePayButtonManager;-><init>()V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 50
    new-instance v1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;

    check-cast p1, Landroid/content/Context;

    invoke-direct {v1, p1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x5

    aput-object v1, v0, p1

    .line 51
    new-instance p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;

    invoke-direct {p1}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;-><init>()V

    const/4 v1, 0x6

    aput-object p1, v0, v1

    .line 52
    new-instance p1, Lcom/reactnativestripesdk/EmbeddedPaymentElementViewManager;

    invoke-direct {p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementViewManager;-><init>()V

    const/4 v1, 0x7

    aput-object p1, v0, v1

    .line 44
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    const-string v0, "StripeSdk"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-direct {p1, p2}, Lcom/reactnativestripesdk/StripeSdkModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    check-cast p1, Lcom/facebook/react/bridge/NativeModule;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getReactModuleInfoProvider()Lcom/facebook/react/module/model/ReactModuleInfoProvider;
    .locals 11

    const/4 v0, 0x1

    .line 26
    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Lcom/reactnativestripesdk/StripeSdkModule;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 27
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 28
    aget-object v0, v0, v2

    .line 29
    const-class v2, Lcom/facebook/react/module/annotations/ReactModule;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/module/annotations/ReactModule;

    if-nez v2, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v2}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    move-result-object v3

    .line 31
    new-instance v4, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 32
    invoke-interface {v2}, Lcom/facebook/react/module/annotations/ReactModule;->name()Ljava/lang/String;

    move-result-object v5

    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v0, "getName(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-interface {v2}, Lcom/facebook/react/module/annotations/ReactModule;->needsEagerInit()Z

    move-result v8

    .line 36
    invoke-interface {v2}, Lcom/facebook/react/module/annotations/ReactModule;->isCxxModule()Z

    move-result v9

    const/4 v10, 0x1

    const/4 v7, 0x1

    .line 31
    invoke-direct/range {v4 .. v10}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 30
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :goto_0
    new-instance v0, Lcom/reactnativestripesdk/StripeSdkPackage$$ExternalSyntheticLambda0;

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/StripeSdkPackage$$ExternalSyntheticLambda0;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
