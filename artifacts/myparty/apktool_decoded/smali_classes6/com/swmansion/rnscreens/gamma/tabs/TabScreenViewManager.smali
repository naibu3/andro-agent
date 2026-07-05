.class public final Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "TabScreenViewManager.kt"

# interfaces
.implements Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "RNSBottomTabsScreen"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$Companion;,
        Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;",
        ">;",
        "Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface<",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTabScreenViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabScreenViewManager.kt\ncom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager\n+ 2 ImageLoader.kt\ncoil3/ImageLoader$Builder\n+ 3 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n*L\n1#1,273:1\n119#2:274\n410#3,9:275\n484#3,11:284\n*S KotlinDebug\n*F\n+ 1 TabScreenViewManager.kt\ncom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager\n*L\n42#1:274\n217#1:275,9\n220#1:284,11\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 E2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002DEB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0014J\u000e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0014J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0002H\u0014J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016J\u001f\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010$H\u0017\u00a2\u0006\u0002\u0010%J\u001c\u0010&\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\'\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010 \u001a\u0004\u0018\u00010(H\u0016J\u001c\u0010)\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010*\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010 \u001a\u0004\u0018\u00010(H\u0016J\u001c\u0010+\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020-H\u0017J\u001a\u0010.\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0017J\u001a\u0010/\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0017J\u001a\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0017J\u001a\u00101\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010(H\u0016J\u0018\u00102\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020-H\u0016J\u001f\u00103\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010$H\u0017\u00a2\u0006\u0002\u0010%J\u001a\u00104\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0017J\u001a\u00105\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0016J\u001a\u00106\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\tH\u0016J\u001a\u00107\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010(H\u0017J;\u00108\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u0002092\u0006\u0010:\u001a\u00020;2!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110>\u00a2\u0006\u000c\u0008?\u0012\u0008\u0008@\u0012\u0004\u0008\u0008(A\u0012\u0004\u0012\u00020\u001d0=H\u0002J\u001a\u0010B\u001a\u0004\u0018\u00010;2\u0006\u0010\u0010\u001a\u0002092\u0006\u0010C\u001a\u00020\tH\u0002R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006F"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;",
        "Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;",
        "<init>",
        "()V",
        "delegate",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "getName",
        "",
        "imageLoader",
        "Lcoil3/ImageLoader;",
        "getImageLoader",
        "()Lcoil3/ImageLoader;",
        "setImageLoader",
        "(Lcoil3/ImageLoader;)V",
        "context",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getContext",
        "()Lcom/facebook/react/uimanager/ThemedReactContext;",
        "setContext",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)V",
        "createViewInstance",
        "reactContext",
        "getDelegate",
        "getExportedCustomDirectEventTypeConstants",
        "",
        "",
        "addEventEmitters",
        "",
        "view",
        "setStandardAppearance",
        "value",
        "Lcom/facebook/react/bridge/Dynamic;",
        "setScrollEdgeAppearance",
        "setTabBarItemBadgeBackgroundColor",
        "",
        "(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/Integer;)V",
        "setIconType",
        "setIconImageSource",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "setIconSfSymbolName",
        "setSelectedIconImageSource",
        "setSelectedIconSfSymbolName",
        "setIsFocused",
        "",
        "setTabKey",
        "setBadgeValue",
        "setTitle",
        "setSpecialEffects",
        "setOverrideScrollViewContentInsetAdjustmentBehavior",
        "setTabBarItemBadgeTextColor",
        "setIconResourceName",
        "setOrientation",
        "setSystemItem",
        "setIconResource",
        "loadUsingCoil",
        "Landroid/content/Context;",
        "source",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;",
        "onLoad",
        "Lkotlin/Function1;",
        "Landroid/graphics/drawable/Drawable;",
        "Lkotlin/ParameterName;",
        "name",
        "img",
        "resolveSource",
        "uri",
        "RNSImageSource",
        "Companion",
        "react-native-screens_release"
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
.field public static final Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$Companion;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSBottomTabsScreen"


# instance fields
.field private context:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private final delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;",
            ">;"
        }
    .end annotation
.end field

.field private imageLoader:Lcoil3/ImageLoader;


# direct methods
.method public static synthetic $r8$lambda$XdeYpufErE8D6-aMbiGQgh0R2MA(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Landroid/graphics/drawable/Drawable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setIconResource$lambda$1(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Landroid/graphics/drawable/Drawable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 28
    invoke-direct {p0, v0, v1, v0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    new-instance v0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;

    move-object v1, p0

    check-cast v1, Lcom/facebook/react/uimanager/BaseViewManager;

    invoke-direct {v0, v1}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    check-cast v0, Lcom/facebook/react/uimanager/ViewManagerDelegate;

    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-void
.end method

.method private final loadUsingCoil(Landroid/content/Context;Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 209
    instance-of v0, p2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$DrawableRes;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$DrawableRes;

    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$DrawableRes;->getResId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    .line 210
    :cond_0
    instance-of v0, p2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$UriString;

    if-eqz v0, :cond_2

    check-cast p2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$UriString;

    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$UriString;->getUri()Ljava/lang/String;

    move-result-object p2

    .line 215
    :goto_0
    new-instance v0, Lcoil3/request/ImageRequest$Builder;

    invoke-direct {v0, p1}, Lcoil3/request/ImageRequest$Builder;-><init>(Landroid/content/Context;)V

    .line 216
    invoke-virtual {v0, p2}, Lcoil3/request/ImageRequest$Builder;->data(Ljava/lang/Object;)Lcoil3/request/ImageRequest$Builder;

    move-result-object v0

    .line 279
    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$loadUsingCoil$$inlined$target$default$1;

    invoke-direct {v1, p1, p3}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$loadUsingCoil$$inlined$target$default$1;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lcoil3/target/Target;

    invoke-virtual {v0, v1}, Lcoil3/request/ImageRequest$Builder;->target(Lcoil3/target/Target;)Lcoil3/request/ImageRequest$Builder;

    move-result-object p1

    .line 289
    new-instance p3, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$loadUsingCoil$$inlined$listener$default$1;

    invoke-direct {p3, p2, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$loadUsingCoil$$inlined$listener$default$1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast p3, Lcoil3/request/ImageRequest$Listener;

    invoke-virtual {p1, p3}, Lcoil3/request/ImageRequest$Builder;->listener(Lcoil3/request/ImageRequest$Listener;)Lcoil3/request/ImageRequest$Builder;

    move-result-object p1

    .line 227
    invoke-virtual {p1}, Lcoil3/request/ImageRequest$Builder;->build()Lcoil3/request/ImageRequest;

    move-result-object p1

    .line 229
    iget-object p2, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->imageLoader:Lcoil3/ImageLoader;

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Lcoil3/ImageLoader;->enqueue(Lcoil3/request/ImageRequest;)Lcoil3/request/Disposable;

    :cond_1
    return-void

    .line 208
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final resolveSource(Landroid/content/Context;Ljava/lang/String;)Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;
    .locals 4

    .line 240
    const-string v0, "_"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 241
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p2, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$DrawableRes;

    invoke-direct {p1, v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$DrawableRes;-><init>(I)V

    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;

    return-object p1

    .line 246
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "raw"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, v1, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    .line 248
    new-instance p2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$DrawableRes;

    invoke-direct {p2, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$DrawableRes;-><init>(I)V

    check-cast p2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;

    return-object p2

    .line 251
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Resource not found in drawable or raw: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "[RNScreens]"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v3

    .line 256
    :cond_2
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$UriString;

    invoke-direct {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource$UriString;-><init>(Ljava/lang/String;)V

    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;

    return-object p1
.end method

.method private static final setIconResource$lambda$1(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Landroid/graphics/drawable/Drawable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 197
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V
    .locals 0

    .line 26
    check-cast p2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    move-object v0, p2

    check-cast v0, Landroid/view/View;

    invoke-super {p0, p1, v0}, Lcom/facebook/react/uimanager/ViewGroupManager;->addEventEmitters(Lcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)V

    .line 65
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->onViewManagerAddEventEmitters$react_native_screens_release()V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;
    .locals 8

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    new-instance v0, Lcoil3/ImageLoader$Builder;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcoil3/ImageLoader$Builder;-><init>(Landroid/content/Context;)V

    .line 274
    new-instance v1, Lcoil3/ComponentRegistry$Builder;

    invoke-direct {v1}, Lcoil3/ComponentRegistry$Builder;-><init>()V

    .line 43
    new-instance v2, Lcoil3/svg/SvgDecoder$Factory;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcoil3/svg/SvgDecoder$Factory;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcoil3/decode/Decoder$Factory;

    invoke-virtual {v1, v2}, Lcoil3/ComponentRegistry$Builder;->add(Lcoil3/decode/Decoder$Factory;)Lcoil3/ComponentRegistry$Builder;

    .line 44
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 274
    invoke-virtual {v1}, Lcoil3/ComponentRegistry$Builder;->build()Lcoil3/ComponentRegistry;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcoil3/ImageLoader$Builder;->components(Lcoil3/ComponentRegistry;)Lcoil3/ImageLoader$Builder;

    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lcoil3/ImageLoader$Builder;->build()Lcoil3/ImageLoader;

    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->imageLoader:Lcoil3/ImageLoader;

    .line 45
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 46
    sget-object v0, Lcom/swmansion/rnscreens/utils/RNSLog;->INSTANCE:Lcom/swmansion/rnscreens/utils/RNSLog;

    const-string v1, "RNSBottomTabsScreen"

    const-string v2, "createViewInstance"

    invoke-virtual {v0, v1, v2}, Lcom/swmansion/rnscreens/utils/RNSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    return-object v0
.end method

.method public final getContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/ViewManagerDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
            "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->delegate:Lcom/facebook/react/uimanager/ViewManagerDelegate;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 54
    new-array v0, v0, [Lkotlin/Pair;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenWillAppearEvent;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenWillAppearEvent$Companion;

    check-cast v1, Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;

    invoke-static {v1}, Lcom/swmansion/rnscreens/gamma/helpers/EventHelpersKt;->makeEventRegistrationInfo(Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 55
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidAppearEvent;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidAppearEvent$Companion;

    check-cast v1, Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;

    invoke-static {v1}, Lcom/swmansion/rnscreens/gamma/helpers/EventHelpersKt;->makeEventRegistrationInfo(Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 56
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenWillDisappearEvent;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenWillDisappearEvent$Companion;

    check-cast v1, Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;

    invoke-static {v1}, Lcom/swmansion/rnscreens/gamma/helpers/EventHelpersKt;->makeEventRegistrationInfo(Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 57
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidDisappearEvent;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/event/TabScreenDidDisappearEvent$Companion;

    check-cast v1, Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;

    invoke-static {v1}, Lcom/swmansion/rnscreens/gamma/helpers/EventHelpersKt;->makeEventRegistrationInfo(Lcom/swmansion/rnscreens/gamma/common/NamingAwareEventType;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 53
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mutableMapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getImageLoader()Lcoil3/ImageLoader;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->imageLoader:Lcoil3/ImageLoader;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 32
    const-string v0, "RNSBottomTabsScreen"

    return-object v0
.end method

.method public bridge synthetic setBadgeValue(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setBadgeValue(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setBadgeValue(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "badgeValue"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setBadgeValue(Ljava/lang/String;)V

    return-void
.end method

.method public final setContext(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->context:Lcom/facebook/react/uimanager/ThemedReactContext;

    return-void
.end method

.method public bridge synthetic setIconImageSource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setIconImageSource(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setIconImageSource(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic setIconResource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setIconResource(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setIconResource(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "iconResource"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 188
    const-string v0, "uri"

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 191
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 192
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v0, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->resolveSource(Landroid/content/Context;Ljava/lang/String;)Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 195
    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$$ExternalSyntheticLambda0;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    invoke-direct {p0, v0, p2, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->loadUsingCoil(Landroid/content/Context;Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager$RNSImageSource;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic setIconResourceName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setIconResourceName(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setIconResourceName(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "iconResourceName"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setIconResourceName(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setIconSfSymbolName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setIconSfSymbolName(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setIconSfSymbolName(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic setIconType(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setIconType(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setIconType(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final setImageLoader(Lcoil3/ImageLoader;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->imageLoader:Lcoil3/ImageLoader;

    return-void
.end method

.method public bridge synthetic setIsFocused(Landroid/view/View;Z)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setIsFocused(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Z)V

    return-void
.end method

.method public setIsFocused(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Z)V
    .locals 4
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "isFocused"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    sget-object v0, Lcom/swmansion/rnscreens/utils/RNSLog;->INSTANCE:Lcom/swmansion/rnscreens/utils/RNSLog;

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->getId()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TabScreen ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] setIsFocused "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RNSBottomTabsScreen"

    invoke-virtual {v0, v2, v1}, Lcom/swmansion/rnscreens/utils/RNSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setFocusedTab(Z)V

    return-void
.end method

.method public bridge synthetic setOrientation(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setOrientation(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setOrientation(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 0

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setOverrideScrollViewContentInsetAdjustmentBehavior(Landroid/view/View;Z)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setOverrideScrollViewContentInsetAdjustmentBehavior(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Z)V

    return-void
.end method

.method public setOverrideScrollViewContentInsetAdjustmentBehavior(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Z)V
    .locals 0

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setScrollEdgeAppearance(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setScrollEdgeAppearance(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setScrollEdgeAppearance(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setSelectedIconImageSource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setSelectedIconImageSource(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setSelectedIconImageSource(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic setSelectedIconSfSymbolName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setSelectedIconSfSymbolName(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setSelectedIconSfSymbolName(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic setSpecialEffects(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setSpecialEffects(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setSpecialEffects(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setStandardAppearance(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setStandardAppearance(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setStandardAppearance(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setSystemItem(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setSystemItem(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setSystemItem(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 0

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemBadgeBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setTabBarItemBadgeBackgroundColor(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarItemBadgeBackgroundColor(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarItemBadgeBackgroundColor"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setTabBarItemBadgeBackgroundColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabBarItemBadgeTextColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setTabBarItemBadgeTextColor(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTabBarItemBadgeTextColor(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        customType = "Color"
        name = "tabBarItemBadgeTextColor"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setTabBarItemBadgeTextColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTabKey(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setTabKey(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setTabKey(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "tabKey"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setTabKey(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTitle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;->setTitle(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V

    return-void
.end method

.method public setTitle(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "title"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setTabTitle(Ljava/lang/String;)V

    return-void
.end method
