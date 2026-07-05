.class public Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;
.super Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.source "AddressSheetViewManagerDelegate.java"


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
        "Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface<",
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

    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 26
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "autocompleteCountries"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "appearance"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "defaultValues"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_3
    const-string/jumbo v0, "visible"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_4
    const-string v0, "primaryButtonTitle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_5
    const-string v0, "additionalFields"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_6
    const-string v0, "googlePlacesApiKey"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_7
    const-string v0, "animationStyle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_8
    const-string/jumbo v0, "sheetTitle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_9
    const-string v0, "allowedCountries"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_a
    const-string v0, "presentationStyle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    move v2, v1

    :goto_0
    const/4 v0, 0x0

    packed-switch v2, :pswitch_data_0

    .line 61
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 49
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setAutocompleteCountries(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void

    .line 37
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setAppearance(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    return-void

    .line 40
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setDefaultValues(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    return-void

    .line 28
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    if-nez p3, :cond_b

    goto :goto_1

    :cond_b
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_1
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setVisible(Landroid/view/View;Z)V

    return-void

    .line 52
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    if-nez p3, :cond_c

    goto :goto_2

    :cond_c
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_2
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setPrimaryButtonTitle(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 43
    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setAdditionalFields(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    return-void

    .line 58
    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    if-nez p3, :cond_d

    goto :goto_3

    :cond_d
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_3
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setGooglePlacesApiKey(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 34
    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    if-nez p3, :cond_e

    const-string/jumbo p3, "slide"

    goto :goto_4

    :cond_e
    check-cast p3, Ljava/lang/String;

    :goto_4
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setAnimationStyle(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 55
    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    if-nez p3, :cond_f

    goto :goto_5

    :cond_f
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_5
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setSheetTitle(Landroid/view/View;Ljava/lang/String;)V

    return-void

    .line 46
    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setAllowedCountries(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void

    .line 31
    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    check-cast p2, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;

    if-nez p3, :cond_10

    const-string p3, "popover"

    goto :goto_6

    :cond_10
    check-cast p3, Ljava/lang/String;

    :goto_6
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/viewmanagers/AddressSheetViewManagerInterface;->setPresentationStyle(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6e5d7149 -> :sswitch_a
        -0x6438ea14 -> :sswitch_9
        -0x61c5a7c7 -> :sswitch_8
        -0x56ea5b73 -> :sswitch_7
        -0x4409d1d6 -> :sswitch_6
        -0x53b9640 -> :sswitch_5
        0x1afcdee4 -> :sswitch_4
        0x1bd1f072 -> :sswitch_3
        0x3e1aeac3 -> :sswitch_2
        0x6b17bc64 -> :sswitch_1
        0x6bcf2fac -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
