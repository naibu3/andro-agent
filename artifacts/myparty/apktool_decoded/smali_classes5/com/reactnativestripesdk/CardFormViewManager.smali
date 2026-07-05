.class public final Lcom/reactnativestripesdk/CardFormViewManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "CardFormViewManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/CardFormManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "CardForm"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/CardFormViewManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/reactnativestripesdk/CardFormView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/CardFormManagerInterface<",
        "Lcom/reactnativestripesdk/CardFormView;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardFormViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFormViewManager.kt\ncom/reactnativestripesdk/CardFormViewManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n808#2,11:130\n1#3:141\n*S KotlinDebug\n*F\n+ 1 CardFormViewManager.kt\ncom/reactnativestripesdk/CardFormViewManager\n*L\n91#1:130,11\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 *2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001*B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J$\u0010\r\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J \u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u000c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u000f0\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0017J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0017J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0019H\u0017J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0019H\u0017J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0014H\u0017J\u001a\u0010\"\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0017J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\nH\u0014J\u0010\u0010\'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R*\u0010\u0006\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/reactnativestripesdk/CardFormViewManager;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/reactnativestripesdk/CardFormView;",
        "Lcom/facebook/react/viewmanagers/CardFormManagerInterface;",
        "<init>",
        "()V",
        "delegate",
        "Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "reactContextRef",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getName",
        "",
        "getDelegate",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "setDangerouslyGetFullCardDetails",
        "",
        "view",
        "dangerouslyGetFullCardDetails",
        "",
        "setPostalCodeEnabled",
        "postalCodeEnabled",
        "setPlaceholders",
        "placeholders",
        "Lcom/facebook/react/bridge/Dynamic;",
        "setAutofocus",
        "autofocus",
        "setCardStyle",
        "cardStyle",
        "setDefaultValues",
        "defaults",
        "setDisabled",
        "isDisabled",
        "setPreferredNetworks",
        "preferredNetworks",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "createViewInstance",
        "reactContext",
        "onDropViewInstance",
        "blur",
        "focus",
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

.field public static final Companion:Lcom/reactnativestripesdk/CardFormViewManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "CardForm"


# instance fields
.field private final delegate:Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/CardFormManagerDelegate<",
            "Lcom/reactnativestripesdk/CardFormView;",
            "Lcom/reactnativestripesdk/CardFormViewManager;",
            ">;"
        }
    .end annotation
.end field

.field private reactContextRef:Lcom/facebook/react/uimanager/ThemedReactContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/CardFormViewManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/CardFormViewManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/CardFormViewManager;->Companion:Lcom/reactnativestripesdk/CardFormViewManager$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/CardFormViewManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 17
    new-instance v0, Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/CardFormViewManager;->delegate:Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;

    return-void
.end method


# virtual methods
.method public bridge synthetic blur(Landroid/view/View;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFormViewManager;->blur(Lcom/reactnativestripesdk/CardFormView;)V

    return-void
.end method

.method public blur(Lcom/reactnativestripesdk/CardFormView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-virtual {p1}, Lcom/reactnativestripesdk/CardFormView;->requestBlurFromJS()V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFormViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/CardFormView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/CardFormView;
    .locals 2

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    const-class v0, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 98
    new-instance v1, Lcom/reactnativestripesdk/CardFormView;

    invoke-direct {v1, p1}, Lcom/reactnativestripesdk/CardFormView;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    .line 100
    iput-object p1, p0, Lcom/reactnativestripesdk/CardFormViewManager;->reactContextRef:Lcom/facebook/react/uimanager/ThemedReactContext;

    if-eqz v0, :cond_0

    .line 102
    invoke-virtual {v0, v1}, Lcom/reactnativestripesdk/StripeSdkModule;->setCardFormView(Lcom/reactnativestripesdk/CardFormView;)V

    :cond_0
    return-object v1
.end method

.method public bridge synthetic focus(Landroid/view/View;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFormViewManager;->focus(Lcom/reactnativestripesdk/CardFormView;)V

    return-void
.end method

.method public focus(Lcom/reactnativestripesdk/CardFormView;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-virtual {p1}, Lcom/reactnativestripesdk/CardFormView;->requestFocusFromJS()V

    return-void
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/reactnativestripesdk/CardFormViewManager;->getDelegate()Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/viewmanagers/CardFormManagerDelegate<",
            "Lcom/reactnativestripesdk/CardFormView;",
            "Lcom/reactnativestripesdk/CardFormViewManager;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/reactnativestripesdk/CardFormViewManager;->delegate:Lcom/facebook/react/viewmanagers/CardFormManagerDelegate;

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

    const-string v3, "onFormComplete"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "topFormComplete"

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
    const-string v0, "CardForm"

    return-object v0
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/CardFormViewManager;->onDropViewInstance(Lcom/reactnativestripesdk/CardFormView;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/reactnativestripesdk/CardFormView;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    check-cast p1, Landroid/view/View;

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/SimpleViewManager;->onDropViewInstance(Landroid/view/View;)V

    .line 110
    iget-object p1, p0, Lcom/reactnativestripesdk/CardFormViewManager;->reactContextRef:Lcom/facebook/react/uimanager/ThemedReactContext;

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

    .line 111
    invoke-virtual {p1, v0}, Lcom/reactnativestripesdk/StripeSdkModule;->setCardFormView(Lcom/reactnativestripesdk/CardFormView;)V

    .line 112
    :cond_1
    iput-object v0, p0, Lcom/reactnativestripesdk/CardFormViewManager;->reactContextRef:Lcom/facebook/react/uimanager/ThemedReactContext;

    return-void
.end method

.method public bridge synthetic setAutofocus(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFormViewManager;->setAutofocus(Lcom/reactnativestripesdk/CardFormView;Z)V

    return-void
.end method

.method public setAutofocus(Lcom/reactnativestripesdk/CardFormView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "autofocus"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFormView;->setAutofocus(Z)V

    return-void
.end method

.method public bridge synthetic setCardStyle(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFormViewManager;->setCardStyle(Lcom/reactnativestripesdk/CardFormView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setCardStyle(Lcom/reactnativestripesdk/CardFormView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "cardStyle"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->asMapOrNull(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFormView;->setCardStyle(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setDangerouslyGetFullCardDetails(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFormViewManager;->setDangerouslyGetFullCardDetails(Lcom/reactnativestripesdk/CardFormView;Z)V

    return-void
.end method

.method public setDangerouslyGetFullCardDetails(Lcom/reactnativestripesdk/CardFormView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "dangerouslyGetFullCardDetails"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFormView;->setDangerouslyGetFullCardDetails(Z)V

    return-void
.end method

.method public bridge synthetic setDefaultValues(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFormViewManager;->setDefaultValues(Lcom/reactnativestripesdk/CardFormView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setDefaultValues(Lcom/reactnativestripesdk/CardFormView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "defaultValues"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaults"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->asMapOrNull(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFormView;->setDefaultValues(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setDisabled(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFormViewManager;->setDisabled(Lcom/reactnativestripesdk/CardFormView;Z)V

    return-void
.end method

.method public setDisabled(Lcom/reactnativestripesdk/CardFormView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "disabled"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFormView;->setDisabled(Z)V

    return-void
.end method

.method public bridge synthetic setPlaceholders(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFormViewManager;->setPlaceholders(Lcom/reactnativestripesdk/CardFormView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setPlaceholders(Lcom/reactnativestripesdk/CardFormView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "placeholders"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->asMapOrNull(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFormView;->setPlaceHolders(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setPostalCodeEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFormViewManager;->setPostalCodeEnabled(Lcom/reactnativestripesdk/CardFormView;Z)V

    return-void
.end method

.method public setPostalCodeEnabled(Lcom/reactnativestripesdk/CardFormView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "postalCodeEnabled"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFormView;->setPostalCodeEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setPreferredNetworks(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/CardFormView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/CardFormViewManager;->setPreferredNetworks(Lcom/reactnativestripesdk/CardFormView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setPreferredNetworks(Lcom/reactnativestripesdk/CardFormView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "preferredNetworks"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    .line 91
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 139
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

    .line 140
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 91
    new-instance p2, Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    .line 92
    :goto_1
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/CardFormView;->setPreferredNetworks(Ljava/util/ArrayList;)V

    return-void
.end method
