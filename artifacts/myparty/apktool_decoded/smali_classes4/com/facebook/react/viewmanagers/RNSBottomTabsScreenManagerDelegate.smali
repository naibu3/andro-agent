.class public Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSBottomTabsScreenManagerDelegate.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U:",
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "TT;+",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        ">;:",
        "Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface<",
        "TT;>;>",
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate<",
        "TT;TU;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string/jumbo v0, "tabBarItemBadgeTextColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_1
    const-string/jumbo v0, "tabBarItemBadgeBackgroundColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "iconResource"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "badgeValue"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "selectedIconImageSource"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_5
    const-string/jumbo v0, "systemItem"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "iconSfSymbolName"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_7
    const-string/jumbo v0, "title"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_8
    const-string/jumbo v0, "standardAppearance"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "scrollEdgeAppearance"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "selectedIconSfSymbolName"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "iconType"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_c
    const-string v0, "iconImageSource"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_d
    const-string/jumbo v0, "tabKey"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_e
    const-string v0, "overrideScrollViewContentInsetAdjustmentBehavior"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_f
    const-string v0, "isFocused"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_10
    const-string v0, "orientation"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_11
    const-string v0, "iconResourceName"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    move v3, v1

    goto :goto_0

    :sswitch_12
    const-string/jumbo v0, "specialEffects"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    move v3, v2

    :goto_0
    const/4 v0, 0x0

    packed-switch v3, :pswitch_data_0

    .line 86
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 50
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTabBarItemBadgeTextColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 53
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTabBarItemBadgeBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 47
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIconResource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void

    .line 38
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    if-nez p3, :cond_13

    goto :goto_1

    :cond_13
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_1
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setBadgeValue(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 71
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setSelectedIconImageSource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void

    .line 77
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setSystemItem(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 68
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    if-nez p3, :cond_14

    goto :goto_2

    :cond_14
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_2
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIconSfSymbolName(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 35
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    if-nez p3, :cond_15

    goto :goto_3

    :cond_15
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_3
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTitle(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 56
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setStandardAppearance(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    return-void

    .line 59
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setScrollEdgeAppearance(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    return-void

    .line 74
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    if-nez p3, :cond_16

    goto :goto_4

    :cond_16
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_4
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setSelectedIconSfSymbolName(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 62
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIconType(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 65
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIconImageSource(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void

    .line 32
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    if-nez p3, :cond_17

    goto :goto_5

    :cond_17
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setTabKey(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 83
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    if-nez p3, :cond_18

    goto :goto_6

    :cond_18
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_6
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setOverrideScrollViewContentInsetAdjustmentBehavior(Landroid/view/View;Z)V

    return-void

    .line 29
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    if-nez p3, :cond_19

    goto :goto_7

    :cond_19
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_7
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIsFocused(Landroid/view/View;Z)V

    return-void

    .line 41
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setOrientation(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 44
    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    if-nez p3, :cond_1a

    goto :goto_8

    :cond_1a
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_8
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setIconResourceName(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 80
    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsScreenManagerInterface;->setSpecialEffects(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x698ec1f7 -> :sswitch_12
        -0x5cfb612e -> :sswitch_11
        -0x55cd0a30 -> :sswitch_10
        -0x4bbf2d13 -> :sswitch_f
        -0x46b8123f -> :sswitch_e
        -0x34893d76 -> :sswitch_d
        -0x2e499ce3 -> :sswitch_c
        -0x2bfba4ad -> :sswitch_b
        -0x21f78536 -> :sswitch_a
        -0x101cf9d2 -> :sswitch_9
        0x1b12f01 -> :sswitch_8
        0x6942258 -> :sswitch_7
        0x888da0f -> :sswitch_6
        0x264cb1e2 -> :sswitch_5
        0x3bb23f02 -> :sswitch_4
        0x3fe5d38e -> :sswitch_3
        0x4d13dba7 -> :sswitch_2
        0x5a8bcac3 -> :sswitch_1
        0x5f200ca4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
