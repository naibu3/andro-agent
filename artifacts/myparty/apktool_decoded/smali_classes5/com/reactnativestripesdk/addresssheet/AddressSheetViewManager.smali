.class public final Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "AddressSheetViewManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "AddressSheetView"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/reactnativestripesdk/addresssheet/AddressSheetView;",
        ">;",
        "Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface<",
        "Lcom/reactnativestripesdk/addresssheet/AddressSheetView;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAddressSheetViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressSheetViewManager.kt\ncom/reactnativestripesdk/addresssheet/AddressSheetViewManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n808#2,11:126\n808#2,11:137\n*S KotlinDebug\n*F\n+ 1 AddressSheetViewManager.kt\ncom/reactnativestripesdk/addresssheet/AddressSheetViewManager\n*L\n68#1:126,11\n76#1:137,11\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 )2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001)B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J \u0010\u000c\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\r0\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0017J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\u001a\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\u001a\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010\"\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0008\u0010$\u001a\u0004\u0018\u00010\nH\u0017J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(H\u0014R*\u0010\u0006\u001a\u001e\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00020\u0002\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;",
        "Lcom/facebook/react/uimanager/SimpleViewManager;",
        "Lcom/reactnativestripesdk/addresssheet/AddressSheetView;",
        "Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;",
        "<init>",
        "()V",
        "delegate",
        "Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;",
        "kotlin.jvm.PlatformType",
        "getName",
        "",
        "getDelegate",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "setVisible",
        "",
        "view",
        "visibility",
        "",
        "setAppearance",
        "appearance",
        "Lcom/facebook/react/bridge/Dynamic;",
        "setDefaultValues",
        "defaults",
        "setAdditionalFields",
        "fields",
        "setAllowedCountries",
        "countries",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "setAutocompleteCountries",
        "setPrimaryButtonTitle",
        "title",
        "setSheetTitle",
        "setGooglePlacesApiKey",
        "key",
        "setPresentationStyle",
        "value",
        "setAnimationStyle",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
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

.field public static final Companion:Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "AddressSheetView"


# instance fields
.field private final delegate:Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate<",
            "Lcom/reactnativestripesdk/addresssheet/AddressSheetView;",
            "Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->Companion:Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    .line 17
    new-instance v0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    iput-object v0, p0, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->delegate:Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativestripesdk/addresssheet/AddressSheetView;
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    new-instance v0, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-direct {v0, p1}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    return-object v0
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->getDelegate()Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate<",
            "Lcom/reactnativestripesdk/addresssheet/AddressSheetView;",
            "Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->delegate:Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;

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

    .line 25
    new-array v0, v0, [Lkotlin/Pair;

    const/4 v1, 0x1

    .line 26
    new-array v2, v1, [Lkotlin/Pair;

    const-string v3, "onSubmitAction"

    const-string v4, "registrationName"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    .line 25
    const-string v3, "topSubmitAction"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v5

    .line 28
    new-array v2, v1, [Lkotlin/Pair;

    const-string v3, "onErrorAction"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    .line 27
    const-string v3, "topErrorAction"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v1

    .line 24
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 19
    const-string v0, "AddressSheetView"

    return-object v0
.end method

.method public bridge synthetic setAdditionalFields(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setAdditionalFields(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setAdditionalFields(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "additionalFields"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-static {p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->asMapOrNull(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setAdditionalFields(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setAllowedCountries(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setAllowedCountries(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setAllowedCountries(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "allowedCountries"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    .line 68
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 135
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 136
    :cond_1
    check-cast v0, Ljava/util/List;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 68
    :goto_1
    invoke-virtual {p1, v0}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setAllowedCountries(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic setAnimationStyle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setAnimationStyle(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V

    return-void
.end method

.method public setAnimationStyle(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "animationStyle"
    .end annotation

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setAppearance(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setAppearance(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setAppearance(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "appearance"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appearance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asMap()Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setAppearance(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setAutocompleteCountries(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setAutocompleteCountries(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setAutocompleteCountries(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "autocompleteCountries"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    .line 76
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Iterable;

    .line 137
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 146
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 147
    :cond_1
    check-cast v0, Ljava/util/List;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 76
    :goto_1
    invoke-virtual {p1, v0}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setAutocompleteCountries(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic setDefaultValues(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setDefaultValues(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setDefaultValues(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "defaultValues"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaults"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asMap()Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setDefaultValues(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public bridge synthetic setGooglePlacesApiKey(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setGooglePlacesApiKey(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V

    return-void
.end method

.method public setGooglePlacesApiKey(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "googlePlacesApiKey"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setGooglePlacesApiKey(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPresentationStyle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setPresentationStyle(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V

    return-void
.end method

.method public setPresentationStyle(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "presentationStyle"
    .end annotation

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPrimaryButtonTitle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setPrimaryButtonTitle(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V

    return-void
.end method

.method public setPrimaryButtonTitle(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "primaryButtonTitle"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setPrimaryButtonTitle(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setSheetTitle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setSheetTitle(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V

    return-void
.end method

.method public setSheetTitle(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "sheetTitle"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setSheetTitle(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setVisible(Landroid/view/View;Z)V
    .locals 0

    .line 13
    check-cast p1, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetViewManager;->setVisible(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Z)V

    return-void
.end method

.method public setVisible(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "visible"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->setVisible(Z)V

    return-void
.end method
