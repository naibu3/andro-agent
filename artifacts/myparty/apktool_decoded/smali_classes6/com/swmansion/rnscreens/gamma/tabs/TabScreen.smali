.class public final Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;
.super Landroid/view/ViewGroup;
.source "TabScreen.kt"

# interfaces
.implements Lcom/swmansion/rnscreens/gamma/common/FragmentProviding;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTabScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabScreen.kt\ncom/swmansion/rnscreens/gamma/tabs/TabScreen\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n33#2,3:131\n33#2,3:134\n33#2,3:137\n33#2,3:140\n33#2,3:143\n33#2,3:146\n1#3:149\n*S KotlinDebug\n*F\n+ 1 TabScreen.kt\ncom/swmansion/rnscreens/gamma/tabs/TabScreen\n*L\n43#1:131,3\n48#1:134,3\n52#1:137,3\n56#1:140,3\n61#1:143,3\n67#1:146,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0014J#\u0010A\u001a\u00020\n\"\u0004\u0008\u0000\u0010B2\u0006\u0010C\u001a\u0002HB2\u0006\u0010D\u001a\u0002HBH\u0002\u00a2\u0006\u0002\u0010EJ\u0008\u0010F\u001a\u00020\nH\u0014J\u0017\u0010K\u001a\u00020\n2\u0008\u0010L\u001a\u0004\u0018\u00010\u0014H\u0000\u00a2\u0006\u0002\u0008MJ\n\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0008\u0010P\u001a\u00020\nH\u0002J\u0008\u0010Q\u001a\u00020\nH\u0002J\r\u0010R\u001a\u00020\nH\u0000\u00a2\u0006\u0002\u0008SJ\u001d\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0000\u00a2\u0006\u0002\u0008YR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R/\u0010#\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\"\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008$\u0010\u001f\"\u0004\u0008%\u0010!R/\u0010(\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\"\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008+\u0010\'\u001a\u0004\u0008)\u0010\u001f\"\u0004\u0008*\u0010!R/\u0010,\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\"\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00081\u0010\'\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R/\u00102\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\"\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00085\u0010\'\u001a\u0004\u00083\u0010.\"\u0004\u00084\u00100R/\u00106\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\"\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00089\u0010\'\u001a\u0004\u00087\u0010\u001f\"\u0004\u00088\u0010!R/\u0010;\u001a\u0004\u0018\u00010:2\u0008\u0010\"\u001a\u0004\u0018\u00010:8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008@\u0010\'\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?R$\u0010G\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u000c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010J\u00a8\u0006["
    }
    d2 = {
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;",
        "Landroid/view/ViewGroup;",
        "Lcom/swmansion/rnscreens/gamma/common/FragmentProviding;",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "<init>",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)V",
        "getReactContext",
        "()Lcom/facebook/react/uimanager/ThemedReactContext;",
        "onLayout",
        "",
        "changed",
        "",
        "l",
        "",
        "t",
        "r",
        "b",
        "tabScreenDelegate",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;",
        "eventEmitter",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;",
        "getEventEmitter$react_native_screens_release",
        "()Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;",
        "setEventEmitter$react_native_screens_release",
        "(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;)V",
        "value",
        "",
        "tabKey",
        "getTabKey",
        "()Ljava/lang/String;",
        "setTabKey",
        "(Ljava/lang/String;)V",
        "<set-?>",
        "tabTitle",
        "getTabTitle",
        "setTabTitle",
        "tabTitle$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "badgeValue",
        "getBadgeValue",
        "setBadgeValue",
        "badgeValue$delegate",
        "tabBarItemBadgeTextColor",
        "getTabBarItemBadgeTextColor",
        "()Ljava/lang/Integer;",
        "setTabBarItemBadgeTextColor",
        "(Ljava/lang/Integer;)V",
        "tabBarItemBadgeTextColor$delegate",
        "tabBarItemBadgeBackgroundColor",
        "getTabBarItemBadgeBackgroundColor",
        "setTabBarItemBadgeBackgroundColor",
        "tabBarItemBadgeBackgroundColor$delegate",
        "iconResourceName",
        "getIconResourceName",
        "setIconResourceName",
        "iconResourceName$delegate",
        "Landroid/graphics/drawable/Drawable;",
        "icon",
        "getIcon",
        "()Landroid/graphics/drawable/Drawable;",
        "setIcon",
        "(Landroid/graphics/drawable/Drawable;)V",
        "icon$delegate",
        "updateMenuItemAttributesIfNeeded",
        "T",
        "oldValue",
        "newValue",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "onAttachedToWindow",
        "isFocusedTab",
        "()Z",
        "setFocusedTab",
        "(Z)V",
        "setTabScreenDelegate",
        "delegate",
        "setTabScreenDelegate$react_native_screens_release",
        "getAssociatedFragment",
        "Landroidx/fragment/app/Fragment;",
        "onTabFocusChangedFromJS",
        "onMenuItemAttributesChange",
        "onViewManagerAddEventEmitters",
        "onViewManagerAddEventEmitters$react_native_screens_release",
        "onFragmentConfigurationChange",
        "fragment",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;",
        "config",
        "Landroid/content/res/Configuration;",
        "onFragmentConfigurationChange$react_native_screens_release",
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
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$Companion;

.field public static final TAG:Ljava/lang/String; = "TabScreen"


# instance fields
.field private final badgeValue$delegate:Lkotlin/properties/ReadWriteProperty;

.field public eventEmitter:Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;

.field private final icon$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final iconResourceName$delegate:Lkotlin/properties/ReadWriteProperty;

.field private isFocusedTab:Z

.field private final reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private final tabBarItemBadgeBackgroundColor$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemBadgeTextColor$delegate:Lkotlin/properties/ReadWriteProperty;

.field private tabKey:Ljava/lang/String;

.field private tabScreenDelegate:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;",
            ">;"
        }
    .end annotation
.end field

.field private final tabTitle$delegate:Lkotlin/properties/ReadWriteProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x6

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 43
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabTitle"

    const-string v3, "getTabTitle()Ljava/lang/String;"

    const-class v4, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    .line 48
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "badgeValue"

    const-string v3, "getBadgeValue()Ljava/lang/String;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 52
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemBadgeTextColor"

    const-string v3, "getTabBarItemBadgeTextColor()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 56
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemBadgeBackgroundColor"

    const-string v3, "getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 61
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "iconResourceName"

    const-string v3, "getIconResourceName()Ljava/lang/String;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 67
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "icon"

    const-string v3, "getIcon()Landroid/graphics/drawable/Drawable;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    move-object v0, p1

    check-cast v0, Landroid/content/Context;

    invoke-direct {p0, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 18
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 29
    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabScreenDelegate:Ljava/lang/ref/WeakReference;

    .line 43
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 131
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$1;

    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    check-cast p1, Lkotlin/properties/ReadWriteProperty;

    .line 43
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabTitle$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 48
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 134
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$2;

    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    check-cast p1, Lkotlin/properties/ReadWriteProperty;

    .line 48
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->badgeValue$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 52
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 137
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$3;

    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$3;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    check-cast p1, Lkotlin/properties/ReadWriteProperty;

    .line 52
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabBarItemBadgeTextColor$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 56
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 140
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$4;

    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$4;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    check-cast p1, Lkotlin/properties/ReadWriteProperty;

    .line 56
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabBarItemBadgeBackgroundColor$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 61
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 143
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$5;

    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$5;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    check-cast p1, Lkotlin/properties/ReadWriteProperty;

    .line 61
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->iconResourceName$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 67
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 146
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$6;

    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen$special$$inlined$observable$6;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    check-cast p1, Lkotlin/properties/ReadWriteProperty;

    .line 67
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->icon$delegate:Lkotlin/properties/ReadWriteProperty;

    return-void
.end method

.method public static final synthetic access$updateMenuItemAttributesIfNeeded(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->updateMenuItemAttributesIfNeeded(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final onMenuItemAttributesChange()V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabScreenDelegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;->onMenuItemAttributesChange(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    :cond_0
    return-void
.end method

.method private final onTabFocusChangedFromJS()V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabScreenDelegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->isFocusedTab:Z

    invoke-interface {v0, p0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;->onTabFocusChangedFromJS(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Z)V

    :cond_0
    return-void
.end method

.method private final updateMenuItemAttributesIfNeeded(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;)V"
        }
    .end annotation

    .line 75
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 76
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->onMenuItemAttributesChange()V

    :cond_0
    return-void
.end method


# virtual methods
.method public getAssociatedFragment()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabScreenDelegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;->getFragmentForTabScreen(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBadgeValue()Ljava/lang/String;
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->badgeValue$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getEventEmitter$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->eventEmitter:Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "eventEmitter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIcon()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->icon$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getIconResourceName()Ljava/lang/String;
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->iconResourceName$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    return-object v0
.end method

.method public final getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;
    .locals 3

    .line 56
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabBarItemBadgeBackgroundColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabBarItemBadgeTextColor()Ljava/lang/Integer;
    .locals 3

    .line 52
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabBarItemBadgeTextColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabKey()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getTabTitle()Ljava/lang/String;
    .locals 3

    .line 43
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabTitle$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final isFocusedTab()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->isFocusedTab:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .line 81
    sget-object v0, Lcom/swmansion/rnscreens/utils/RNSLog;->INSTANCE:Lcom/swmansion/rnscreens/utils/RNSLog;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->getId()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TabScreen ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] attached to window"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TabScreen"

    invoke-virtual {v0, v2, v1}, Lcom/swmansion/rnscreens/utils/RNSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    return-void
.end method

.method public final onFragmentConfigurationChange$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "config"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabScreenDelegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;->onFragmentConfigurationChange(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Landroid/content/res/Configuration;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final onViewManagerAddEventEmitters$react_native_screens_release()V
    .locals 3

    .line 109
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 110
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;

    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactContext;I)V

    invoke-virtual {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setEventEmitter$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;)V

    return-void

    .line 109
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "[RNScreens] TabScreen must have its tag set when registering event emitters"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setBadgeValue(Ljava/lang/String;)V
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->badgeValue$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setEventEmitter$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->eventEmitter:Lcom/swmansion/rnscreens/gamma/tabs/TabScreenEventEmitter;

    return-void
.end method

.method public final setFocusedTab(Z)V
    .locals 1

    .line 87
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->isFocusedTab:Z

    if-eq v0, p1, :cond_0

    .line 88
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->isFocusedTab:Z

    .line 89
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->onTabFocusChangedFromJS()V

    :cond_0
    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->icon$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setIconResourceName(Ljava/lang/String;)V
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->iconResourceName$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemBadgeBackgroundColor(Ljava/lang/Integer;)V
    .locals 3

    .line 56
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabBarItemBadgeBackgroundColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemBadgeTextColor(Ljava/lang/Integer;)V
    .locals 3

    .line 52
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabBarItemBadgeTextColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabKey(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 36
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    .line 35
    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabKey:Ljava/lang/String;

    return-void
.end method

.method public final setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;)V
    .locals 1

    .line 94
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabScreenDelegate:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final setTabTitle(Ljava/lang/String;)V
    .locals 3

    .line 43
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->tabTitle$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method
