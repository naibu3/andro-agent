.class public final Lcom/reactnativestripesdk/CardFieldViewManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "CardFieldViewManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/CardFieldManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "CardField"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/CardFieldViewManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/reactnativestripesdk/CardFieldView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/CardFieldManagerInterface<",
        "Lcom/reactnativestripesdk/CardFieldView;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardFieldViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFieldViewManager.kt\ncom/reactnativestripesdk/CardFieldViewManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n808#2,11:142\n1#3:153\n*S KotlinDebug\n*F\n+ 1 CardFieldViewManager.kt\ncom/reactnativestripesdk/CardFieldViewManager\n*L\n119#1:142,11\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 -2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001-B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J$\u0010\r\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J \u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u000c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u000f0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0017H\u0017J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0017J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u001a\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\u000cH\u0017J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0008\u0010\"\u001a\u0004\u0018\u00010\u000cH\u0017J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001eH\u0017J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0017H\u0017J\u001a\u0010\'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0008\u0010(\u001a\u0004\u0018\u00010)H\u0017J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R*\u0010\u0006\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."
    }
    d2 = {
        "Lcom/reactnativestripesdk/CardFieldViewManager;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/reactnativestripesdk/CardFieldView;",
        "Lcom/facebook/react/viewmanagers/CardFieldManagerInterface;",
        "<init>",
        "()V",
        "delegate",
        "Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "reactContextRef",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getName",
        "",
        "getDelegate",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "createViewInstance",
        "reactContext",
        "onDropViewInstance",
        "",
        "view",
        "setDangerouslyGetFullCardDetails",
        "dangerouslyGetFullCardDetails",
        "",
        "setPostalCodeEnabled",
        "postalCodeEnabled",
        "setAutofocus",
        "autofocus",
        "setCardStyle",
        "cardStyle",
        "Lcom/facebook/react/bridge/Dynamic;",
        "setCountryCode",
        "countryCode",
        "setOnBehalfOf",
        "onBehalfOf",
        "setPlaceholders",
        "placeholders",
        "setDisabled",
        "isDisabled",
        "setPreferredNetworks",
        "preferredNetworks",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "blur",
        "focus",
        "clear",
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

.field public static final Companion:Lcom/reactnativestripesdk/CardFieldViewManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "CardField"


# instance fields
.field private final delegate:Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate<",
            "Lcom/reactnativestripesdk/CardFieldView;",
            "Lcom/reactnativestripesdk/CardFieldViewManager;",
            ">;"
        }
    .end annotation
.end field

.field private reactContextRef:Lcom/facebook/react/uimanager/ThemedReactContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/CardFieldViewManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/CardFieldViewManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/CardFieldViewManager;->Companion:Lcom/reactnativestripesdk/CardFieldViewManager$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/CardFieldViewManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 17
    new-instance v0, Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/CardFieldViewManager;->delegate:Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;

    return-void
.end method


# virtual methods
.method public bridge synthetic blur(Landroid/view/View;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFieldViewManager;->blur(Lcom/reactnativestripesdk/CardFieldView;)V

    return-void
.end method

.method public blur(Lcom/reactnativestripesdk/CardFieldView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    invoke-virtual {p1}, Lcom/reactnativestripesdk/CardFieldView;->requestBlurFromJS()V

    return-void
.end method

.method public bridge synthetic clear(Landroid/view/View;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFieldViewManager;->clear(Lcom/reactnativestripesdk/CardFieldView;)V

    return-void
.end method

.method public clear(Lcom/reactnativestripesdk/CardFieldView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    invoke-virtual {p1}, Lcom/reactnativestripesdk/CardFieldView;->requestClearFromJS()V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFieldViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/CardFieldView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/CardFieldView;
    .locals 2

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    const-class v0, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 33
    new-instance v1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-direct {v1, p1}, Lcom/reactnativestripesdk/CardFieldView;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    .line 35
    iput-object p1, p0, Lcom/reactnativestripesdk/CardFieldViewManager;->reactContextRef:Lcom/facebook/react/uimanager/ThemedReactContext;

    if-eqz v0, :cond_0

    .line 37
    invoke-virtual {v0, v1}, Lcom/reactnativestripesdk/StripeSdkModule;->setCardFieldView(Lcom/reactnativestripesdk/CardFieldView;)V

    :cond_0
    return-object v1
.end method

.method public bridge synthetic focus(Landroid/view/View;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFieldViewManager;->focus(Lcom/reactnativestripesdk/CardFieldView;)V

    return-void
.end method

.method public focus(Lcom/reactnativestripesdk/CardFieldView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    invoke-virtual {p1}, Lcom/reactnativestripesdk/CardFieldView;->requestFocusFromJS()V

    return-void
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/reactnativestripesdk/CardFieldViewManager;->getDelegate()Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate<",
            "Lcom/reactnativestripesdk/CardFieldView;",
            "Lcom/reactnativestripesdk/CardFieldViewManager;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/reactnativestripesdk/CardFieldViewManager;->delegate:Lcom/facebook/react/viewmanagers/CardFieldManagerDelegate;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 6
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

    const/4 v0, 0x2

    .line 26
    new-array v0, v0, [Lkotlin/Pair;

    const/4 v1, 0x1

    new-array v2, v1, [Lkotlin/Pair;

    const-string v3, "onFocusChange"

    const-string v4, "registrationName"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "topFocusChange"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v5

    .line 27
    new-array v2, v1, [Lkotlin/Pair;

    const-string v3, "onCardChange"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "topCardChange"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v1

    .line 25
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 20
    const-string v0, "CardField"

    return-object v0
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFieldViewManager;->onDropViewInstance(Lcom/reactnativestripesdk/CardFieldView;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/reactnativestripesdk/CardFieldView;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    check-cast p1, Landroid/view/View;

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/SimpleViewManager;->onDropViewInstance(Landroid/view/View;)V

    .line 45
    iget-object p1, p0, Lcom/reactnativestripesdk/CardFieldViewManager;->reactContextRef:Lcom/facebook/react/uimanager/ThemedReactContext;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-class v1, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {p1, v1}, Lcom/facebook/react/uimanager/ThemedReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    .line 46
    invoke-virtual {p1, v0}, Lcom/reactnativestripesdk/StripeSdkModule;->setCardFieldView(Lcom/reactnativestripesdk/CardFieldView;)V

    .line 47
    :cond_1
    iput-object v0, p0, Lcom/reactnativestripesdk/CardFieldViewManager;->reactContextRef:Lcom/facebook/react/uimanager/ThemedReactContext;

    return-void
.end method

.method public bridge synthetic setAutofocus(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setAutofocus(Lcom/reactnativestripesdk/CardFieldView;Z)V

    return-void
.end method

.method public setAutofocus(Lcom/reactnativestripesdk/CardFieldView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "autofocus"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setAutofocus(Z)V

    return-void
.end method

.method public bridge synthetic setCardStyle(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setCardStyle(Lcom/reactnativestripesdk/CardFieldView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setCardStyle(Lcom/reactnativestripesdk/CardFieldView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cardStyle"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->asMapOrNull(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setCardStyle(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setCountryCode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setCountryCode(Lcom/reactnativestripesdk/CardFieldView;Ljava/lang/String;)V

    return-void
.end method

.method public setCountryCode(Lcom/reactnativestripesdk/CardFieldView;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "countryCode"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setCountryCode(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setDangerouslyGetFullCardDetails(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setDangerouslyGetFullCardDetails(Lcom/reactnativestripesdk/CardFieldView;Z)V

    return-void
.end method

.method public setDangerouslyGetFullCardDetails(Lcom/reactnativestripesdk/CardFieldView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "dangerouslyGetFullCardDetails"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setDangerouslyGetFullCardDetails(Z)V

    return-void
.end method

.method public bridge synthetic setDisabled(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setDisabled(Lcom/reactnativestripesdk/CardFieldView;Z)V

    return-void
.end method

.method public setDisabled(Lcom/reactnativestripesdk/CardFieldView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "disabled"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setDisabled(Z)V

    return-void
.end method

.method public bridge synthetic setOnBehalfOf(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setOnBehalfOf(Lcom/reactnativestripesdk/CardFieldView;Ljava/lang/String;)V

    return-void
.end method

.method public setOnBehalfOf(Lcom/reactnativestripesdk/CardFieldView;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "onBehalfOf"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setOnBehalfOf(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPlaceholders(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setPlaceholders(Lcom/reactnativestripesdk/CardFieldView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setPlaceholders(Lcom/reactnativestripesdk/CardFieldView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "placeholders"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->asMapOrNull(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setPlaceHolders(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setPostalCodeEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setPostalCodeEnabled(Lcom/reactnativestripesdk/CardFieldView;Z)V

    return-void
.end method

.method public setPostalCodeEnabled(Lcom/reactnativestripesdk/CardFieldView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "postalCodeEnabled"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setPostalCodeEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setPreferredNetworks(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFieldView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFieldViewManager;->setPreferredNetworks(Lcom/reactnativestripesdk/CardFieldView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setPreferredNetworks(Lcom/reactnativestripesdk/CardFieldView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "preferredNetworks"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    .line 119
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    .line 142
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 151
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 152
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 119
    new-instance p2, Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    .line 120
    :goto_1
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFieldView;->setPreferredNetworks(Ljava/util/ArrayList;)V

    return-void
.end method
