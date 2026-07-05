.class public final Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "AddToWalletButtonManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "AddToWalletButton"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerInterface<",
        "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \'2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\r\u001a\u00020\u000eH\u0016J$\u0010\u000f\u001a\u001e\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J \u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00180\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001eH\u0017J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001eH\u0017J\u001a\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\u000eH\u0017J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020&H\u0017R*\u0010\u0008\u001a\u001e\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \n*\u0004\u0018\u00010\u00000\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;",
        "Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerInterface;",
        "applicationContext",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "delegate",
        "Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "requestManager",
        "Lcom/bumptech/glide/RequestManager;",
        "getName",
        "",
        "getDelegate",
        "onDropViewInstance",
        "",
        "view",
        "onAfterUpdateTransaction",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "setAndroidAssetSource",
        "source",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "setCardDetails",
        "cardDetails",
        "Lcom/facebook/react/bridge/Dynamic;",
        "setEphemeralKey",
        "ephemeralKey",
        "setToken",
        "token",
        "setIOSButtonStyle",
        "value",
        "setTestEnv",
        "",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "AddToWalletButton"


# instance fields
.field private final delegate:Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate<",
            "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;",
            "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;",
            ">;"
        }
    .end annotation
.end field

.field private final requestManager:Lcom/bumptech/glide/RequestManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->Companion:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 20
    new-instance v0, Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->delegate:Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;

    .line 21
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    const-string v0, "with(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->requestManager:Lcom/bumptech/glide/RequestManager;

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;
    .locals 2

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    iget-object v1, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->requestManager:Lcom/bumptech/glide/RequestManager;

    invoke-direct {v0, p1, v1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/bumptech/glide/RequestManager;)V

    return-object v0
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->getDelegate()Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate<",
            "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;",
            "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->delegate:Lcom/facebook/react/viewmanagers/AddToWalletButtonManagerDelegate;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 42
    new-array v1, v0, [Lkotlin/Pair;

    .line 43
    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "registrationName"

    const-string v3, "onCompleteAction"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 42
    const-string v2, "topCompleteAction"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v3

    .line 41
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 23
    const-string v0, "AddToWalletButton"

    return-object v0
.end method

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->onAfterUpdateTransaction(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-super {p0, v0}, Lcom/facebook/react/uimanager/SimpleViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    .line 34
    invoke-virtual {p1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->onAfterUpdateTransaction()V

    return-void
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->onDropViewInstance(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->onDropViewInstance()V

    .line 29
    check-cast p1, Landroid/view/View;

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/SimpleViewManager;->onDropViewInstance(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic setAndroidAssetSource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->setAndroidAssetSource(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setAndroidAssetSource(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "androidAssetSource"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->setSourceMap(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setCardDetails(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->setCardDetails(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setCardDetails(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cardDetails"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->asMapOrNull(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->setCardDetails(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setEphemeralKey(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->setEphemeralKey(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setEphemeralKey(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "ephemeralKey"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ephemeralKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asMap()Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 69
    :cond_0
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->setEphemeralKey(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setIOSButtonStyle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->setIOSButtonStyle(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Ljava/lang/String;)V

    return-void
.end method

.method public setIOSButtonStyle(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "iOSButtonStyle"
    .end annotation

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTestEnv(Landroid/view/View;Z)V
    .locals 0

    .line 15
    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->setTestEnv(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Z)V

    return-void
.end method

.method public setTestEnv(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Z)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "testEnv"
    .end annotation

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setToken(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;->setToken(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setToken(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "token"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asMap()Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 79
    :cond_0
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->setToken(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method
