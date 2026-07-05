.class public final Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;
.super Landroid/widget/LinearLayout;
.source "TabsHost.kt"

# interfaces
.implements Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$Companion;,
        Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTabsHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabsHost.kt\ncom/swmansion/rnscreens/gamma/tabs/TabsHost\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,431:1\n33#2,3:432\n33#2,3:435\n33#2,3:438\n33#2,3:441\n33#2,3:444\n33#2,3:447\n33#2,3:450\n33#2,3:453\n33#2,3:456\n33#2,3:459\n33#2,3:462\n33#2,3:465\n33#2,3:468\n33#2,3:471\n1#3:474\n1869#4,2:475\n360#4,7:477\n360#4,7:484\n*S KotlinDebug\n*F\n+ 1 TabsHost.kt\ncom/swmansion/rnscreens/gamma/tabs/TabsHost\n*L\n127#1:432,3\n131#1:435,3\n135#1:438,3\n139#1:441,3\n143#1:444,3\n147#1:447,3\n151#1:450,3\n155#1:453,3\n159#1:456,3\n163#1:459,3\n167#1:462,3\n171#1:465,3\n175#1:468,3\n179#1:471,3\n270#1:475,2\n410#1:477,7\n415#1:484,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0010\u0007\n\u0002\u0008\u001b\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0004\u0095\u0001\u0096\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010i\u001a\u00020j\"\u0004\u0008\u0000\u0010k2\u0006\u0010l\u001a\u0002Hk2\u0006\u0010m\u001a\u0002HkH\u0002\u00a2\u0006\u0002\u0010nJ\u0008\u0010o\u001a\u00020jH\u0014J\u001d\u0010p\u001a\u00020j2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020 H\u0000\u00a2\u0006\u0002\u0008tJ\u0015\u0010u\u001a\u00020j2\u0006\u0010s\u001a\u00020 H\u0000\u00a2\u0006\u0002\u0008vJ\u0015\u0010w\u001a\u00020j2\u0006\u0010x\u001a\u00020rH\u0000\u00a2\u0006\u0002\u0008yJ\r\u0010z\u001a\u00020jH\u0000\u00a2\u0006\u0002\u0008{J\u0018\u0010|\u001a\u00020j2\u0006\u0010q\u001a\u00020r2\u0006\u0010}\u001a\u00020#H\u0016J\u0010\u0010~\u001a\u00020j2\u0006\u0010q\u001a\u00020rH\u0016J\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010q\u001a\u00020rH\u0016J\u001b\u0010\u0080\u0001\u001a\u00020j2\u0006\u0010q\u001a\u00020r2\u0008\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\t\u0010\u0083\u0001\u001a\u00020jH\u0002J\t\u0010\u0084\u0001\u001a\u00020jH\u0002J\t\u0010\u0087\u0001\u001a\u00020jH\u0002J\t\u0010\u0088\u0001\u001a\u00020jH\u0016J\u0015\u0010\u0089\u0001\u001a\u00020j2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0014J\u0012\u0010\u008b\u0001\u001a\u00020j2\u0007\u0010\u008c\u0001\u001a\u00020 H\u0002J\t\u0010\u008d\u0001\u001a\u00020jH\u0002J\u0014\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001e2\u0007\u0010\u008f\u0001\u001a\u00020 H\u0002J\u0010\u0010\u0090\u0001\u001a\u0004\u0018\u00010 H\u0002\u00a2\u0006\u0002\u0010)J\u0014\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u00012\u0006\u0010q\u001a\u00020rH\u0002J\u000f\u0010\u0093\u0001\u001a\u00020jH\u0000\u00a2\u0006\u0003\u0008\u0094\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\'\u001a\u0004\u0018\u00010 2\u0008\u0010&\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008,\u0010-\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R/\u0010.\u001a\u0004\u0018\u00010 2\u0008\u0010&\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00081\u0010-\u001a\u0004\u0008/\u0010)\"\u0004\u00080\u0010+R+\u00102\u001a\u00020#2\u0006\u0010&\u001a\u00020#8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00086\u0010-\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R/\u00107\u001a\u0004\u0018\u00010 2\u0008\u0010&\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008:\u0010-\u001a\u0004\u00088\u0010)\"\u0004\u00089\u0010+R/\u0010<\u001a\u0004\u0018\u00010;2\u0008\u0010&\u001a\u0004\u0018\u00010;8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008A\u0010-\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R/\u0010B\u001a\u0004\u0018\u00010 2\u0008\u0010&\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008E\u0010-\u001a\u0004\u0008C\u0010)\"\u0004\u0008D\u0010+R/\u0010F\u001a\u0004\u0018\u00010 2\u0008\u0010&\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008I\u0010-\u001a\u0004\u0008G\u0010)\"\u0004\u0008H\u0010+R/\u0010J\u001a\u0004\u0018\u00010 2\u0008\u0010&\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008M\u0010-\u001a\u0004\u0008K\u0010)\"\u0004\u0008L\u0010+R/\u0010O\u001a\u0004\u0018\u00010N2\u0008\u0010&\u001a\u0004\u0018\u00010N8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008T\u0010-\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR/\u0010U\u001a\u0004\u0018\u00010N2\u0008\u0010&\u001a\u0004\u0018\u00010N8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008X\u0010-\u001a\u0004\u0008V\u0010Q\"\u0004\u0008W\u0010SR/\u0010Y\u001a\u0004\u0018\u00010;2\u0008\u0010&\u001a\u0004\u0018\u00010;8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\\\u0010-\u001a\u0004\u0008Z\u0010>\"\u0004\u0008[\u0010@R/\u0010]\u001a\u0004\u0018\u00010;2\u0008\u0010&\u001a\u0004\u0018\u00010;8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008`\u0010-\u001a\u0004\u0008^\u0010>\"\u0004\u0008_\u0010@R/\u0010a\u001a\u0004\u0018\u00010 2\u0008\u0010&\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008d\u0010-\u001a\u0004\u0008b\u0010)\"\u0004\u0008c\u0010+R/\u0010e\u001a\u0004\u0018\u00010;2\u0008\u0010&\u001a\u0004\u0018\u00010;8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008h\u0010-\u001a\u0004\u0008f\u0010>\"\u0004\u0008g\u0010@R\u0010\u0010\u0085\u0001\u001a\u00030\u0086\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0097\u0001"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;",
        "Landroid/widget/LinearLayout;",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "<init>",
        "(Lcom/facebook/react/uimanager/ThemedReactContext;)V",
        "getReactContext",
        "()Lcom/facebook/react/uimanager/ThemedReactContext;",
        "containerUpdateCoordinator",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;",
        "wrappedContext",
        "Landroidx/appcompat/view/ContextThemeWrapper;",
        "bottomNavigationView",
        "Lcom/google/android/material/bottomnavigation/BottomNavigationView;",
        "contentView",
        "Landroid/widget/FrameLayout;",
        "eventEmitter",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;",
        "getEventEmitter$react_native_screens_release",
        "()Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;",
        "setEventEmitter$react_native_screens_release",
        "(Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;)V",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "requireFragmentManager",
        "getRequireFragmentManager",
        "()Landroidx/fragment/app/FragmentManager;",
        "tabScreenFragments",
        "",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;",
        "lastAppliedUiMode",
        "",
        "Ljava/lang/Integer;",
        "isLayoutEnqueued",
        "",
        "appearanceCoordinator",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;",
        "<set-?>",
        "tabBarBackgroundColor",
        "getTabBarBackgroundColor",
        "()Ljava/lang/Integer;",
        "setTabBarBackgroundColor",
        "(Ljava/lang/Integer;)V",
        "tabBarBackgroundColor$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "tabBarItemActiveIndicatorColor",
        "getTabBarItemActiveIndicatorColor",
        "setTabBarItemActiveIndicatorColor",
        "tabBarItemActiveIndicatorColor$delegate",
        "isTabBarItemActiveIndicatorEnabled",
        "()Z",
        "setTabBarItemActiveIndicatorEnabled",
        "(Z)V",
        "isTabBarItemActiveIndicatorEnabled$delegate",
        "tabBarItemIconColor",
        "getTabBarItemIconColor",
        "setTabBarItemIconColor",
        "tabBarItemIconColor$delegate",
        "",
        "tabBarItemTitleFontFamily",
        "getTabBarItemTitleFontFamily",
        "()Ljava/lang/String;",
        "setTabBarItemTitleFontFamily",
        "(Ljava/lang/String;)V",
        "tabBarItemTitleFontFamily$delegate",
        "tabBarItemIconColorActive",
        "getTabBarItemIconColorActive",
        "setTabBarItemIconColorActive",
        "tabBarItemIconColorActive$delegate",
        "tabBarItemTitleFontColor",
        "getTabBarItemTitleFontColor",
        "setTabBarItemTitleFontColor",
        "tabBarItemTitleFontColor$delegate",
        "tabBarItemTitleFontColorActive",
        "getTabBarItemTitleFontColorActive",
        "setTabBarItemTitleFontColorActive",
        "tabBarItemTitleFontColorActive$delegate",
        "",
        "tabBarItemTitleFontSize",
        "getTabBarItemTitleFontSize",
        "()Ljava/lang/Float;",
        "setTabBarItemTitleFontSize",
        "(Ljava/lang/Float;)V",
        "tabBarItemTitleFontSize$delegate",
        "tabBarItemTitleFontSizeActive",
        "getTabBarItemTitleFontSizeActive",
        "setTabBarItemTitleFontSizeActive",
        "tabBarItemTitleFontSizeActive$delegate",
        "tabBarItemTitleFontWeight",
        "getTabBarItemTitleFontWeight",
        "setTabBarItemTitleFontWeight",
        "tabBarItemTitleFontWeight$delegate",
        "tabBarItemTitleFontStyle",
        "getTabBarItemTitleFontStyle",
        "setTabBarItemTitleFontStyle",
        "tabBarItemTitleFontStyle$delegate",
        "tabBarItemRippleColor",
        "getTabBarItemRippleColor",
        "setTabBarItemRippleColor",
        "tabBarItemRippleColor$delegate",
        "tabBarItemLabelVisibilityMode",
        "getTabBarItemLabelVisibilityMode",
        "setTabBarItemLabelVisibilityMode",
        "tabBarItemLabelVisibilityMode$delegate",
        "updateNavigationMenuIfNeeded",
        "",
        "T",
        "oldValue",
        "newValue",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "onAttachedToWindow",
        "mountReactSubviewAt",
        "tabScreen",
        "Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;",
        "index",
        "mountReactSubviewAt$react_native_screens_release",
        "unmountReactSubviewAt",
        "unmountReactSubviewAt$react_native_screens_release",
        "unmountReactSubview",
        "reactSubview",
        "unmountReactSubview$react_native_screens_release",
        "unmountAllReactSubviews",
        "unmountAllReactSubviews$react_native_screens_release",
        "onTabFocusChangedFromJS",
        "isFocused",
        "onMenuItemAttributesChange",
        "getFragmentForTabScreen",
        "onFragmentConfigurationChange",
        "config",
        "Landroid/content/res/Configuration;",
        "updateBottomNavigationViewAppearance",
        "updateSelectedTab",
        "layoutCallback",
        "Landroid/view/Choreographer$FrameCallback;",
        "refreshLayout",
        "requestLayout",
        "onConfigurationChanged",
        "newConfig",
        "applyDayNightUiModeIfNeeded",
        "uiMode",
        "forceSubtreeMeasureAndLayoutPass",
        "getFragmentForMenuItemId",
        "itemId",
        "getSelectedTabScreenFragmentId",
        "getMenuItemForTabScreen",
        "Landroid/view/MenuItem;",
        "onViewManagerAddEventEmitters",
        "onViewManagerAddEventEmitters$react_native_screens_release",
        "ContainerUpdateCoordinator",
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

.field public static final Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$Companion;

.field public static final TAG:Ljava/lang/String; = "TabsHost"


# instance fields
.field private final appearanceCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;

.field private final bottomNavigationView:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

.field private final containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

.field private final contentView:Landroid/widget/FrameLayout;

.field public eventEmitter:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;

.field private fragmentManager:Landroidx/fragment/app/FragmentManager;

.field private isLayoutEnqueued:Z

.field private final isTabBarItemActiveIndicatorEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

.field private lastAppliedUiMode:Ljava/lang/Integer;

.field private final layoutCallback:Landroid/view/Choreographer$FrameCallback;

.field private final reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private final tabBarBackgroundColor$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemActiveIndicatorColor$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemIconColor$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemIconColorActive$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemLabelVisibilityMode$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemRippleColor$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemTitleFontColor$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemTitleFontColorActive$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemTitleFontFamily$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemTitleFontSize$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemTitleFontSizeActive$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemTitleFontStyle$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabBarItemTitleFontWeight$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final tabScreenFragments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;",
            ">;"
        }
    .end annotation
.end field

.field private final wrappedContext:Landroidx/appcompat/view/ContextThemeWrapper;


# direct methods
.method public static synthetic $r8$lambda$1KAy5q5su929oxSWgKUoE2I9QkU(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->layoutCallback$lambda$43(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;J)V

    return-void
.end method

.method public static synthetic $r8$lambda$2lRRw1k2fkYMah6YHUlZxhQ93iI(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;Landroid/view/MenuItem;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->_init_$lambda$20(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$WDaHbyfRLC_4hCnGOWlKrTPOoLA(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->unmountReactSubview$lambda$27(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$YVCzkbHiTfAcCg6VZgsSKrxcaIg(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->unmountReactSubview$lambda$28(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$kzW6I7PG-FDZBuAdEagA_QcvLNg(Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->_init_$lambda$19(Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic $r8$lambda$xw3bDxkQNS22V1ju-tI9iAryc_o(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V
    .locals 0

    invoke-static {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->updateBottomNavigationViewAppearance$lambda$38(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 6

    const/16 v0, 0xe

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 127
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarBackgroundColor"

    const-string v3, "getTabBarBackgroundColor()Ljava/lang/Integer;"

    const-class v4, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    .line 131
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemActiveIndicatorColor"

    const-string v3, "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 135
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "isTabBarItemActiveIndicatorEnabled"

    const-string v3, "isTabBarItemActiveIndicatorEnabled()Z"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 139
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemIconColor"

    const-string v3, "getTabBarItemIconColor()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 143
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemTitleFontFamily"

    const-string v3, "getTabBarItemTitleFontFamily()Ljava/lang/String;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 147
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemIconColorActive"

    const-string v3, "getTabBarItemIconColorActive()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 151
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemTitleFontColor"

    const-string v3, "getTabBarItemTitleFontColor()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 155
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemTitleFontColorActive"

    const-string v3, "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 159
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemTitleFontSize"

    const-string v3, "getTabBarItemTitleFontSize()Ljava/lang/Float;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 163
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemTitleFontSizeActive"

    const-string v3, "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 167
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemTitleFontWeight"

    const-string v3, "getTabBarItemTitleFontWeight()Ljava/lang/String;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 171
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemTitleFontStyle"

    const-string v3, "getTabBarItemTitleFontStyle()Ljava/lang/String;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 175
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemRippleColor"

    const-string v3, "getTabBarItemRippleColor()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    .line 179
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "tabBarItemLabelVisibilityMode"

    const-string v3, "getTabBarItemLabelVisibilityMode()Ljava/lang/String;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->Companion:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 5

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    move-object v0, p1

    check-cast v0, Landroid/content/Context;

    invoke-direct {p0, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 20
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 86
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    .line 89
    new-instance v0, Landroidx/appcompat/view/ContextThemeWrapper;

    .line 90
    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    .line 91
    sget v2, Lcom/google/android/material/R$style;->Theme_Material3_DayNight_NoActionBar:I

    .line 89
    invoke-direct {v0, v1, v2}, Landroidx/appcompat/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->wrappedContext:Landroidx/appcompat/view/ContextThemeWrapper;

    .line 95
    new-instance v1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;-><init>(Landroid/content/Context;)V

    .line 96
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    check-cast v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v2}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    iput-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->bottomNavigationView:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 100
    new-instance v2, Landroid/widget/FrameLayout;

    check-cast p1, Landroid/content/Context;

    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 103
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v3, 0x3f800000    # 1.0f

    .line 107
    iput v3, p1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 106
    check-cast p1, Landroid/view/ViewGroup$LayoutParams;

    .line 101
    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 109
    sget-object p1, Lcom/swmansion/rnscreens/gamma/helpers/ViewIdGenerator;->INSTANCE:Lcom/swmansion/rnscreens/gamma/helpers/ViewIdGenerator;

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/helpers/ViewIdGenerator;->generateViewId()I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->setId(I)V

    .line 100
    iput-object v2, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->contentView:Landroid/widget/FrameLayout;

    .line 118
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    .line 125
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;

    invoke-direct {v3, v0, v1, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;-><init>(Landroidx/appcompat/view/ContextThemeWrapper;Lcom/google/android/material/bottomnavigation/BottomNavigationView;Ljava/util/List;)V

    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->appearanceCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;

    .line 127
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 432
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$1;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast p1, Lkotlin/properties/ReadWriteProperty;

    .line 127
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarBackgroundColor$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 131
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 435
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$2;

    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast p1, Lkotlin/properties/ReadWriteProperty;

    .line 131
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemActiveIndicatorColor$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 135
    sget-object p1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 438
    new-instance v4, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$3;

    invoke-direct {v4, v3, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$3;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v4, Lkotlin/properties/ReadWriteProperty;

    .line 135
    iput-object v4, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->isTabBarItemActiveIndicatorEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 139
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 441
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$4;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$4;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 139
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemIconColor$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 143
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 444
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$5;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$5;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 143
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontFamily$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 147
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 447
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$6;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$6;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 147
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemIconColorActive$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 151
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 450
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$7;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$7;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 151
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontColor$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 155
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 453
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$8;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$8;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 155
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontColorActive$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 159
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 456
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$9;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$9;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 159
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontSize$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 163
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 459
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$10;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$10;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 163
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontSizeActive$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 167
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 462
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$11;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$11;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 167
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontWeight$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 171
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 465
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$12;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$12;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 171
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontStyle$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 175
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 468
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$13;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$13;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 175
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemRippleColor$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 179
    sget-object v3, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 471
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$14;

    invoke-direct {v3, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$special$$inlined$observable$14;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    check-cast v3, Lkotlin/properties/ReadWriteProperty;

    .line 179
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemLabelVisibilityMode$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 196
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->setOrientation(I)V

    .line 197
    check-cast v2, Landroid/view/View;

    invoke-virtual {p0, v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->addView(Landroid/view/View;)V

    .line 198
    move-object p1, v1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->addView(Landroid/view/View;)V

    .line 200
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda0;

    invoke-direct {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 207
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda1;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    invoke-virtual {v1, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setOnItemSelectedListener(Lcom/google/android/material/navigation/NavigationBarView$OnItemSelectedListener;)V

    .line 340
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda2;

    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda2;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->layoutCallback:Landroid/view/Choreographer$FrameCallback;

    return-void
.end method

.method private static final _init_$lambda$19(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 201
    sget-object p0, Lcom/swmansion/rnscreens/utils/RNSLog;->INSTANCE:Lcom/swmansion/rnscreens/utils/RNSLog;

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    .line 203
    new-instance p5, Ljava/lang/StringBuilder;

    const-string p6, "BottomNavigationView layout changed {"

    invoke-direct {p5, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p5, ", "

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, "} {"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, "}"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 201
    const-string p2, "TabsHost"

    invoke-virtual {p0, p2, p1}, Lcom/swmansion/rnscreens/utils/RNSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final _init_$lambda$20(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;Landroid/view/MenuItem;)Z
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    sget-object v0, Lcom/swmansion/rnscreens/utils/RNSLog;->INSTANCE:Lcom/swmansion/rnscreens/utils/RNSLog;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Item selected "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TabsHost"

    invoke-virtual {v0, v2, v1}, Lcom/swmansion/rnscreens/utils/RNSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getFragmentForMenuItemId(I)Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 210
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;->getTabScreen$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->getTabKey()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, "undefined"

    .line 211
    :cond_1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getEventEmitter$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;->emitOnNativeFocusChange(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final synthetic access$updateBottomNavigationViewAppearance(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->updateBottomNavigationViewAppearance()V

    return-void
.end method

.method public static final synthetic access$updateNavigationMenuIfNeeded(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->updateNavigationMenuIfNeeded(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$updateSelectedTab(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->updateSelectedTab()V

    return-void
.end method

.method private final applyDayNightUiModeIfNeeded(I)V
    .locals 2

    .line 374
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->lastAppliedUiMode:Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq p1, v0, :cond_3

    :goto_0
    const/16 v0, 0x10

    if-eq p1, v0, :cond_2

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    .line 386
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->wrappedContext:Landroidx/appcompat/view/ContextThemeWrapper;

    sget v1, Lcom/google/android/material/R$style;->Theme_Material3_DayNight_NoActionBar:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/ContextThemeWrapper;->setTheme(I)V

    goto :goto_1

    .line 378
    :cond_1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->wrappedContext:Landroidx/appcompat/view/ContextThemeWrapper;

    sget v1, Lcom/google/android/material/R$style;->Theme_Material3_Dark_NoActionBar:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/ContextThemeWrapper;->setTheme(I)V

    goto :goto_1

    .line 382
    :cond_2
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->wrappedContext:Landroidx/appcompat/view/ContextThemeWrapper;

    sget v1, Lcom/google/android/material/R$style;->Theme_Material3_Light_NoActionBar:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/ContextThemeWrapper;->setTheme(I)V

    .line 390
    :goto_1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->appearanceCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;

    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;->updateTabAppearance(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    .line 391
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->lastAppliedUiMode:Ljava/lang/Integer;

    :cond_3
    return-void
.end method

.method private final forceSubtreeMeasureAndLayoutPass()V
    .locals 4

    .line 397
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 398
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getHeight()I

    move-result v2

    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 396
    invoke-virtual {p0, v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->measure(II)V

    .line 401
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getRight()I

    move-result v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getBottom()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->layout(IIII)V

    return-void
.end method

.method private final getFragmentForMenuItemId(I)Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;
    .locals 1

    .line 404
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    return-object p1
.end method

.method private final getMenuItemForTabScreen(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)Landroid/view/MenuItem;
    .locals 4

    .line 414
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    .line 485
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 486
    check-cast v2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    .line 415
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;->getTabScreen$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object v2

    if-ne v2, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 416
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-eq v0, v3, :cond_2

    goto :goto_2

    :cond_2
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_3

    .line 417
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 418
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->bottomNavigationView:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    invoke-virtual {v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->getMenu()Landroid/view/Menu;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v1
.end method

.method private final getRequireFragmentManager()Landroidx/fragment/app/FragmentManager;
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "[RNScreens] Nullish fragment manager"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final getSelectedTabScreenFragmentId()Ljava/lang/Integer;
    .locals 3

    .line 407
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 410
    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    .line 478
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 479
    check-cast v2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    .line 410
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;->getTabScreen$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object v2

    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->isFocusedTab()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, -0x1

    .line 483
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method private static final layoutCallback$lambda$43(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;J)V
    .locals 0

    const/4 p1, 0x0

    .line 341
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->isLayoutEnqueued:Z

    .line 342
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->forceSubtreeMeasureAndLayoutPass()V

    return-void
.end method

.method private final refreshLayout()V
    .locals 3

    .line 347
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->isLayoutEnqueued:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->layoutCallback:Landroid/view/Choreographer$FrameCallback;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 348
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->isLayoutEnqueued:Z

    .line 351
    sget-object v0, Lcom/facebook/react/modules/core/ReactChoreographer;->Companion:Lcom/facebook/react/modules/core/ReactChoreographer$Companion;

    .line 352
    invoke-virtual {v0}, Lcom/facebook/react/modules/core/ReactChoreographer$Companion;->getInstance()Lcom/facebook/react/modules/core/ReactChoreographer;

    move-result-object v0

    .line 354
    sget-object v1, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->NATIVE_ANIMATED_MODULE:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 355
    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->layoutCallback:Landroid/view/Choreographer$FrameCallback;

    .line 353
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V

    :cond_0
    return-void
.end method

.method private static final unmountReactSubview$lambda$27(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;->getTabScreen$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final unmountReactSubview$lambda$28(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 260
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final updateBottomNavigationViewAppearance()V
    .locals 3

    .line 304
    sget-object v0, Lcom/swmansion/rnscreens/utils/RNSLog;->INSTANCE:Lcom/swmansion/rnscreens/utils/RNSLog;

    const-string v1, "TabsHost"

    const-string v2, "updateBottomNavigationViewAppearance"

    invoke-virtual {v0, v1, v2}, Lcom/swmansion/rnscreens/utils/RNSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->appearanceCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;

    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;->updateTabAppearance(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    .line 308
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->bottomNavigationView:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 309
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getSelectedTabScreenFragmentId()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 308
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setSelectedItemId(I)V

    .line 311
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda3;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V

    invoke-virtual {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 309
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "[RNScreens] A single selected tab must be present"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final updateBottomNavigationViewAppearance$lambda$38(Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;)V
    .locals 2

    .line 312
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->refreshLayout()V

    .line 313
    sget-object p0, Lcom/swmansion/rnscreens/utils/RNSLog;->INSTANCE:Lcom/swmansion/rnscreens/utils/RNSLog;

    const-string v0, "TabsHost"

    const-string v1, "BottomNavigationView request layout"

    invoke-virtual {p0, v0, v1}, Lcom/swmansion/rnscreens/utils/RNSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final updateNavigationMenuIfNeeded(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;)V"
        }
    .end annotation

    .line 187
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 188
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    .line 189
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->invalidateNavigationMenu()V

    .line 190
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->postContainerUpdateIfNeeded()V

    :cond_0
    return-void
.end method

.method private final updateSelectedTab()V
    .locals 4

    .line 319
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;->getTabScreen$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object v2

    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->isFocusedTab()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_5

    check-cast v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    .line 321
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getRequireFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_4

    .line 322
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getRequireFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    const-string v3, "getFragments(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-ne v1, v0, :cond_2

    return-void

    .line 328
    :cond_2
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getRequireFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    .line 329
    invoke-virtual {v3}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v3

    .line 330
    invoke-virtual {v3, v2}, Landroidx/fragment/app/FragmentTransaction;->setReorderingAllowed(Z)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v2

    if-eqz v0, :cond_3

    .line 333
    invoke-virtual {v2, v0}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 335
    :cond_3
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->contentView:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getId()I

    move-result v0

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {v2, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 336
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    return-void

    .line 321
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "[RNScreens] There can be only a single focused tab"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 319
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "[RNScreens] No focused tab present"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getEventEmitter$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->eventEmitter:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "eventEmitter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic getFragmentForTabScreen(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getFragmentForTabScreen(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    return-object p1
.end method

.method public getFragmentForTabScreen(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;
    .locals 3

    const-string v0, "tabScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;->getTabScreen$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    return-object v1
.end method

.method public final getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    return-object v0
.end method

.method public final getTabBarBackgroundColor()Ljava/lang/Integer;
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarBackgroundColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;
    .locals 3

    .line 131
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemActiveIndicatorColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabBarItemIconColor()Ljava/lang/Integer;
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemIconColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabBarItemIconColorActive()Ljava/lang/Integer;
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemIconColorActive$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabBarItemLabelVisibilityMode()Ljava/lang/String;
    .locals 3

    .line 179
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemLabelVisibilityMode$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getTabBarItemRippleColor()Ljava/lang/Integer;
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemRippleColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabBarItemTitleFontColor()Ljava/lang/Integer;
    .locals 3

    .line 151
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabBarItemTitleFontColorActive()Ljava/lang/Integer;
    .locals 3

    .line 155
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontColorActive$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTabBarItemTitleFontFamily()Ljava/lang/String;
    .locals 3

    .line 143
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontFamily$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getTabBarItemTitleFontSize()Ljava/lang/Float;
    .locals 3

    .line 159
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontSize$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    return-object v0
.end method

.method public final getTabBarItemTitleFontSizeActive()Ljava/lang/Float;
    .locals 3

    .line 163
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontSizeActive$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    return-object v0
.end method

.method public final getTabBarItemTitleFontStyle()Ljava/lang/String;
    .locals 3

    .line 171
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontStyle$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getTabBarItemTitleFontWeight()Ljava/lang/String;
    .locals 3

    .line 167
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontWeight$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final isTabBarItemActiveIndicatorEnabled()Z
    .locals 3

    .line 135
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->isTabBarItemActiveIndicatorEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final mountReactSubviewAt$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;I)V
    .locals 2

    const-string v0, "tabScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->bottomNavigationView:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    invoke-virtual {v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->getMaxItemCount()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 240
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    .line 241
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    invoke-interface {v1, p2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 242
    move-object p2, p0

    check-cast p2, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;)V

    .line 243
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    .line 244
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->invalidateAll()V

    .line 245
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->postContainerUpdateIfNeeded()V

    return-void

    .line 237
    :cond_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->bottomNavigationView:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    invoke-virtual {p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->getMaxItemCount()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[RNScreens] Attempt to insert TabScreen at index "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, "; BottomNavigationView supports at most "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, " items"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 236
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .line 217
    sget-object v0, Lcom/swmansion/rnscreens/utils/RNSLog;->INSTANCE:Lcom/swmansion/rnscreens/utils/RNSLog;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getId()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TabsHost ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] attached to window"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TabsHost"

    invoke-virtual {v0, v2, v1}, Lcom/swmansion/rnscreens/utils/RNSLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 220
    sget-object v0, Lcom/swmansion/rnscreens/gamma/helpers/FragmentManagerHelper;->INSTANCE:Lcom/swmansion/rnscreens/gamma/helpers/FragmentManagerHelper;

    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/gamma/helpers/FragmentManagerHelper;->findFragmentManagerForView(Landroid/view/ViewGroup;)Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 219
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 225
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    .line 226
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->invalidateAll()V

    .line 227
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->runContainerUpdate()V

    return-void

    .line 220
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "[RNScreens] Nullish fragment manager - can\'t run container operations"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 366
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    if-eqz p1, :cond_0

    .line 369
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->applyDayNightUiModeIfNeeded(I)V

    :cond_0
    return-void
.end method

.method public onFragmentConfigurationChange(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Landroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "tabScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "config"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    invoke-virtual {p0, p2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onMenuItemAttributesChange(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V
    .locals 2

    const-string v0, "tabScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getMenuItemForTabScreen(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)Landroid/view/MenuItem;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 290
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->appearanceCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;

    invoke-virtual {v1, v0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostAppearanceCoordinator;->updateMenuItemAppearance(Landroid/view/MenuItem;Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    :cond_0
    return-void
.end method

.method public onTabFocusChangedFromJS(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;Z)V
    .locals 0

    const-string p2, "tabScreen"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    .line 283
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->invalidateAll()V

    .line 284
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->postContainerUpdateIfNeeded()V

    return-void
.end method

.method public final onViewManagerAddEventEmitters$react_native_screens_release()V
    .locals 3

    .line 423
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 424
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;

    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->reactContext:Lcom/facebook/react/uimanager/ThemedReactContext;

    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactContext;I)V

    invoke-virtual {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->setEventEmitter$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;)V

    return-void

    .line 423
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "[RNScreens] TabsHost must have its tag set when registering event emitters"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public requestLayout()V
    .locals 0

    .line 361
    invoke-super {p0}, Landroid/widget/LinearLayout;->requestLayout()V

    .line 362
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->refreshLayout()V

    return-void
.end method

.method public final setEventEmitter$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->eventEmitter:Lcom/swmansion/rnscreens/gamma/tabs/TabsHostEventEmitter;

    return-void
.end method

.method public final setTabBarBackgroundColor(Ljava/lang/Integer;)V
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarBackgroundColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemActiveIndicatorColor(Ljava/lang/Integer;)V
    .locals 3

    .line 131
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemActiveIndicatorColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemActiveIndicatorEnabled(Z)V
    .locals 3

    .line 135
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->isTabBarItemActiveIndicatorEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemIconColor(Ljava/lang/Integer;)V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemIconColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemIconColorActive(Ljava/lang/Integer;)V
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemIconColorActive$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemLabelVisibilityMode(Ljava/lang/String;)V
    .locals 3

    .line 179
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemLabelVisibilityMode$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemRippleColor(Ljava/lang/Integer;)V
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemRippleColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemTitleFontColor(Ljava/lang/Integer;)V
    .locals 3

    .line 151
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontColor$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemTitleFontColorActive(Ljava/lang/Integer;)V
    .locals 3

    .line 155
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontColorActive$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemTitleFontFamily(Ljava/lang/String;)V
    .locals 3

    .line 143
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontFamily$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemTitleFontSize(Ljava/lang/Float;)V
    .locals 3

    .line 159
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontSize$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemTitleFontSizeActive(Ljava/lang/Float;)V
    .locals 3

    .line 163
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontSizeActive$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemTitleFontStyle(Ljava/lang/String;)V
    .locals 3

    .line 171
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontStyle$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setTabBarItemTitleFontWeight(Ljava/lang/String;)V
    .locals 3

    .line 167
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabBarItemTitleFontWeight$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final unmountAllReactSubviews$react_native_screens_release()V
    .locals 3

    .line 270
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 475
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    .line 270
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;->getTabScreen$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;)V

    goto :goto_0

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 272
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    .line 273
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->invalidateAll()V

    .line 274
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->postContainerUpdateIfNeeded()V

    return-void
.end method

.method public final unmountReactSubview$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V
    .locals 3

    const-string v0, "reactSubview"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda4;

    invoke-direct {v1, p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda4;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;)V

    new-instance v2, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda5;

    invoke-direct {v2, v1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Ljava/util/List;->removeIf(Ljava/util/function/Predicate;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    invoke-virtual {p1, v2}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;)V

    .line 262
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    .line 263
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->invalidateAll()V

    .line 264
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->postContainerUpdateIfNeeded()V

    :cond_1
    return-void
.end method

.method public final unmountReactSubviewAt$react_native_screens_release(I)V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->tabScreenFragments:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;

    .line 251
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;->getTabScreen$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/swmansion/rnscreens/gamma/tabs/TabScreen;->setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/TabScreenDelegate;)V

    .line 252
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost;->containerUpdateCoordinator:Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;

    .line 253
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->invalidateAll()V

    .line 254
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/TabsHost$ContainerUpdateCoordinator;->postContainerUpdateIfNeeded()V

    return-void
.end method
