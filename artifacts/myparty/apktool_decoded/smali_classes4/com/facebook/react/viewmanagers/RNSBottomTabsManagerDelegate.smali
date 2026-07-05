.class public Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "RNSBottomTabsManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface<",
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

    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 25
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string/jumbo v0, "tabBarItemTitleFontSizeActive"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_1
    const-string/jumbo v0, "tabBarItemTitleFontWeight"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_2
    const-string/jumbo v0, "tabBarItemRippleColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_3
    const-string/jumbo v0, "tabBarItemTitleFontFamily"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "controlNavigationStateInJS"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_5
    const-string/jumbo v0, "tabBarItemIconColorActive"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_6
    const-string/jumbo v0, "tabBarItemActiveIndicatorEnabled"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_7
    const-string/jumbo v0, "tabBarMinimizeBehavior"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_8
    const-string/jumbo v0, "tabBarItemTitleFontStyle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_9
    const-string/jumbo v0, "tabBarItemTitleFontColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_a
    const-string/jumbo v0, "tabBarItemTitleFontSize"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_b
    const-string/jumbo v0, "tabBarBackgroundColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_c
    const-string/jumbo v0, "tabBarItemTitleFontColorActive"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_d
    const-string/jumbo v0, "tabBarItemActiveIndicatorColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_e
    const-string/jumbo v0, "tabBarItemIconColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_f
    const-string/jumbo v0, "tabBarItemLabelVisibilityMode"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    move v3, v1

    goto :goto_0

    :sswitch_10
    const-string/jumbo v0, "tabBarTintColor"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    move v3, v2

    :goto_0
    const/4 v0, 0x0

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    .line 78
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 36
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    if-nez p3, :cond_11

    goto :goto_1

    :cond_11
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_1
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontSizeActive(Landroid/view/View;F)V

    return-void

    .line 39
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    if-nez p3, :cond_12

    goto :goto_2

    :cond_12
    move-object v4, p3

    check-cast v4, Ljava/lang/String;

    :goto_2
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 63
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemRippleColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 30
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    if-nez p3, :cond_13

    goto :goto_3

    :cond_13
    move-object v4, p3

    check-cast v4, Ljava/lang/String;

    :goto_3
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 75
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    if-nez p3, :cond_14

    goto :goto_4

    :cond_14
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_4
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setControlNavigationStateInJS(Landroid/view/View;Z)V

    return-void

    .line 54
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemIconColorActive(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 60
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    if-nez p3, :cond_15

    goto :goto_5

    :cond_15
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_5
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemActiveIndicatorEnabled(Landroid/view/View;Z)V

    return-void

    .line 72
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarMinimizeBehavior(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 42
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    if-nez p3, :cond_16

    goto :goto_6

    :cond_16
    move-object v4, p3

    check-cast v4, Ljava/lang/String;

    :goto_6
    invoke-interface {p2, p1, v4}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontStyle(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 45
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 33
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    if-nez p3, :cond_17

    goto :goto_7

    :cond_17
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_7
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontSize(Landroid/view/View;F)V

    return-void

    .line 27
    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 48
    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemTitleFontColorActive(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 57
    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemActiveIndicatorColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 51
    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemIconColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    .line 66
    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarItemLabelVisibilityMode(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 69
    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;->setTabBarTintColor(Landroid/view/View;Ljava/lang/Integer;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6fa58976 -> :sswitch_10
        -0x66559048 -> :sswitch_f
        -0x459b4b07 -> :sswitch_e
        -0x43feb2b5 -> :sswitch_d
        -0x2b572aed -> :sswitch_c
        -0x8ec3549 -> :sswitch_b
        -0x868c189 -> :sswitch_a
        -0x58e6053 -> :sswitch_9
        -0x4aa7205 -> :sswitch_8
        0x89c876e -> :sswitch_7
        0x2859cf29 -> :sswitch_6
        0x2991c15f -> :sswitch_5
        0x56f6390e -> :sswitch_4
        0x581bf45a -> :sswitch_3
        0x73624de2 -> :sswitch_2
        0x7554db6e -> :sswitch_1
        0x784ab45d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
