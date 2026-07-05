.class public final Lexpo/modules/blur/ExpoBlurView;
.super Lexpo/modules/kotlin/views/ExpoView;
.source "ExpoBlurView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/blur/ExpoBlurView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\tJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000bJ\u0006\u0010\u001e\u001a\u00020\u0018J\u0008\u0010\u001f\u001a\u00020\u0018H\u0014J\u0008\u0010 \u001a\u00020\u0018H\u0002J\u0008\u0010!\u001a\u00020\u0018H\u0002J\u0008\u0010\"\u001a\u00020#H\u0002J\n\u0010$\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\'H\u0002J\u0008\u0010(\u001a\u00020#H\u0002R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lexpo/modules/blur/ExpoBlurView;",
        "Lexpo/modules/kotlin/views/ExpoView;",
        "context",
        "Landroid/content/Context;",
        "appContext",
        "Lexpo/modules/kotlin/AppContext;",
        "<init>",
        "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V",
        "blurMethod",
        "Lexpo/modules/blur/enums/BlurMethod;",
        "blurReduction",
        "",
        "blurRadius",
        "tint",
        "Lexpo/modules/blur/enums/TintStyle;",
        "getTint$expo_blur_release",
        "()Lexpo/modules/blur/enums/TintStyle;",
        "setTint$expo_blur_release",
        "(Lexpo/modules/blur/enums/TintStyle;)V",
        "isBlurViewConfigured",
        "",
        "blurView",
        "Leightbitlab/com/blurview/BlurView;",
        "setBlurRadius",
        "",
        "radius",
        "setBlurMethod",
        "method",
        "applyBlurReduction",
        "reductionFactor",
        "applyTint",
        "onAttachedToWindow",
        "configureBlurView",
        "applyCurrentBlurSettings",
        "findOptimalBlurRoot",
        "Landroid/view/ViewGroup;",
        "findNearestScreenAncestor",
        "isReactNativeScreen",
        "view",
        "",
        "getAppRootFallback",
        "expo-blur_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private blurMethod:Lexpo/modules/blur/enums/BlurMethod;

.field private blurRadius:F

.field private blurReduction:F

.field private final blurView:Leightbitlab/com/blurview/BlurView;

.field private isBlurViewConfigured:Z

.field private tint:Lexpo/modules/blur/enums/TintStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/views/ExpoView;-><init>(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)V

    .line 18
    sget-object p2, Lexpo/modules/blur/enums/BlurMethod;->NONE:Lexpo/modules/blur/enums/BlurMethod;

    iput-object p2, p0, Lexpo/modules/blur/ExpoBlurView;->blurMethod:Lexpo/modules/blur/enums/BlurMethod;

    const/high16 p2, 0x40800000    # 4.0f

    .line 19
    iput p2, p0, Lexpo/modules/blur/ExpoBlurView;->blurReduction:F

    const/high16 p2, 0x42480000    # 50.0f

    .line 20
    iput p2, p0, Lexpo/modules/blur/ExpoBlurView;->blurRadius:F

    .line 21
    sget-object p2, Lexpo/modules/blur/enums/TintStyle;->DEFAULT:Lexpo/modules/blur/enums/TintStyle;

    iput-object p2, p0, Lexpo/modules/blur/ExpoBlurView;->tint:Lexpo/modules/blur/enums/TintStyle;

    .line 24
    new-instance p2, Leightbitlab/com/blurview/BlurView;

    invoke-direct {p2, p1}, Leightbitlab/com/blurview/BlurView;-><init>(Landroid/content/Context;)V

    .line 25
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    check-cast p1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p2, p1}, Leightbitlab/com/blurview/BlurView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    move-object p1, p2

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lexpo/modules/blur/ExpoBlurView;->addView(Landroid/view/View;)V

    .line 24
    iput-object p2, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    return-void
.end method

.method private final applyCurrentBlurSettings()V
    .locals 1

    .line 121
    iget v0, p0, Lexpo/modules/blur/ExpoBlurView;->blurRadius:F

    invoke-virtual {p0, v0}, Lexpo/modules/blur/ExpoBlurView;->setBlurRadius(F)V

    .line 122
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->blurMethod:Lexpo/modules/blur/enums/BlurMethod;

    invoke-virtual {p0, v0}, Lexpo/modules/blur/ExpoBlurView;->setBlurMethod(Lexpo/modules/blur/enums/BlurMethod;)V

    .line 123
    invoke-virtual {p0}, Lexpo/modules/blur/ExpoBlurView;->applyTint()V

    return-void
.end method

.method private final configureBlurView()V
    .locals 6

    .line 101
    invoke-direct {p0}, Lexpo/modules/blur/ExpoBlurView;->findOptimalBlurRoot()Landroid/view/ViewGroup;

    move-result-object v0

    .line 102
    invoke-virtual {p0}, Lexpo/modules/blur/ExpoBlurView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v1

    invoke-virtual {v1}, Lexpo/modules/kotlin/AppContext;->getThrowingActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 104
    :goto_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_2

    .line 105
    iget-object v3, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    new-instance v4, Leightbitlab/com/blurview/RenderEffectBlur;

    invoke-direct {v4}, Leightbitlab/com/blurview/RenderEffectBlur;-><init>()V

    check-cast v4, Leightbitlab/com/blurview/BlurAlgorithm;

    invoke-virtual {v3, v0, v4}, Leightbitlab/com/blurview/BlurView;->setupWith(Landroid/view/ViewGroup;Leightbitlab/com/blurview/BlurAlgorithm;)Leightbitlab/com/blurview/BlurViewFacade;

    move-result-object v0

    if-eqz v1, :cond_1

    .line 106
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :cond_1
    invoke-interface {v0, v2}, Leightbitlab/com/blurview/BlurViewFacade;->setFrameClearDrawable(Landroid/graphics/drawable/Drawable;)Leightbitlab/com/blurview/BlurViewFacade;

    goto :goto_1

    .line 109
    :cond_2
    iget-object v3, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    new-instance v4, Leightbitlab/com/blurview/RenderScriptBlur;

    invoke-virtual {p0}, Lexpo/modules/blur/ExpoBlurView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Leightbitlab/com/blurview/RenderScriptBlur;-><init>(Landroid/content/Context;)V

    check-cast v4, Leightbitlab/com/blurview/BlurAlgorithm;

    invoke-virtual {v3, v0, v4}, Leightbitlab/com/blurview/BlurView;->setupWith(Landroid/view/ViewGroup;Leightbitlab/com/blurview/BlurAlgorithm;)Leightbitlab/com/blurview/BlurViewFacade;

    move-result-object v0

    if-eqz v1, :cond_3

    .line 110
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :cond_3
    invoke-interface {v0, v2}, Leightbitlab/com/blurview/BlurViewFacade;->setFrameClearDrawable(Landroid/graphics/drawable/Drawable;)Leightbitlab/com/blurview/BlurViewFacade;

    .line 114
    :goto_1
    invoke-direct {p0}, Lexpo/modules/blur/ExpoBlurView;->applyCurrentBlurSettings()V

    return-void
.end method

.method private final findNearestScreenAncestor()Landroid/view/ViewGroup;
    .locals 3

    .line 140
    invoke-virtual {p0}, Lexpo/modules/blur/ExpoBlurView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 142
    invoke-direct {p0, v0}, Lexpo/modules/blur/ExpoBlurView;->isReactNativeScreen(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 143
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0

    :cond_0
    return-object v1

    .line 145
    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private final findOptimalBlurRoot()Landroid/view/ViewGroup;
    .locals 1

    .line 131
    invoke-direct {p0}, Lexpo/modules/blur/ExpoBlurView;->findNearestScreenAncestor()Landroid/view/ViewGroup;

    move-result-object v0

    if-nez v0, :cond_0

    .line 132
    invoke-direct {p0}, Lexpo/modules/blur/ExpoBlurView;->getAppRootFallback()Landroid/view/ViewGroup;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private final getAppRootFallback()Landroid/view/ViewGroup;
    .locals 2

    .line 156
    invoke-virtual {p0}, Lexpo/modules/blur/ExpoBlurView;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getThrowingActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const v1, 0x1020002

    .line 157
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    return-object v0

    .line 158
    :cond_1
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$MissingRootView;

    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$MissingRootView;-><init>()V

    throw v0
.end method

.method private final isReactNativeScreen(Ljava/lang/Object;)Z
    .locals 1

    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 152
    const-string v0, "com.swmansion.rnscreens.Screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final applyBlurReduction(F)V
    .locals 0

    .line 71
    iput p1, p0, Lexpo/modules/blur/ExpoBlurView;->blurReduction:F

    .line 72
    iget p1, p0, Lexpo/modules/blur/ExpoBlurView;->blurRadius:F

    invoke-virtual {p0, p1}, Lexpo/modules/blur/ExpoBlurView;->setBlurRadius(F)V

    return-void
.end method

.method public final applyTint()V
    .locals 3

    .line 76
    iget-boolean v0, p0, Lexpo/modules/blur/ExpoBlurView;->isBlurViewConfigured:Z

    if-nez v0, :cond_0

    return-void

    .line 78
    :cond_0
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->blurMethod:Lexpo/modules/blur/enums/BlurMethod;

    sget-object v1, Lexpo/modules/blur/ExpoBlurView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lexpo/modules/blur/enums/BlurMethod;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 80
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    iget-object v1, p0, Lexpo/modules/blur/ExpoBlurView;->tint:Lexpo/modules/blur/enums/TintStyle;

    iget v2, p0, Lexpo/modules/blur/ExpoBlurView;->blurRadius:F

    invoke-virtual {v1, v2}, Lexpo/modules/blur/enums/TintStyle;->toBlurEffect(F)I

    move-result v1

    invoke-virtual {v0, v1}, Leightbitlab/com/blurview/BlurView;->setOverlayColor(I)Leightbitlab/com/blurview/BlurViewFacade;

    goto :goto_0

    .line 78
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 84
    :cond_2
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->tint:Lexpo/modules/blur/enums/TintStyle;

    iget v1, p0, Lexpo/modules/blur/ExpoBlurView;->blurRadius:F

    invoke-virtual {v0, v1}, Lexpo/modules/blur/enums/TintStyle;->toBlurEffect(F)I

    move-result v0

    invoke-virtual {p0, v0}, Lexpo/modules/blur/ExpoBlurView;->setBackgroundColor(I)V

    .line 87
    :goto_0
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    invoke-virtual {v0}, Leightbitlab/com/blurview/BlurView;->invalidate()V

    return-void
.end method

.method public final getTint$expo_blur_release()Lexpo/modules/blur/enums/TintStyle;
    .locals 1

    .line 21
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->tint:Lexpo/modules/blur/enums/TintStyle;

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 91
    invoke-super {p0}, Lexpo/modules/kotlin/views/ExpoView;->onAttachedToWindow()V

    .line 94
    iget-boolean v0, p0, Lexpo/modules/blur/ExpoBlurView;->isBlurViewConfigured:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 95
    iput-boolean v0, p0, Lexpo/modules/blur/ExpoBlurView;->isBlurViewConfigured:Z

    .line 96
    invoke-direct {p0}, Lexpo/modules/blur/ExpoBlurView;->configureBlurView()V

    :cond_0
    return-void
.end method

.method public final setBlurMethod(Lexpo/modules/blur/enums/BlurMethod;)V
    .locals 3

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iput-object p1, p0, Lexpo/modules/blur/ExpoBlurView;->blurMethod:Lexpo/modules/blur/enums/BlurMethod;

    .line 54
    iget-boolean v0, p0, Lexpo/modules/blur/ExpoBlurView;->isBlurViewConfigured:Z

    if-nez v0, :cond_0

    return-void

    .line 56
    :cond_0
    sget-object v0, Lexpo/modules/blur/ExpoBlurView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lexpo/modules/blur/enums/BlurMethod;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    .line 62
    iget-object p1, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p1, v1}, Leightbitlab/com/blurview/BlurView;->setBlurEnabled(Z)Leightbitlab/com/blurview/BlurViewFacade;

    .line 63
    invoke-virtual {p0, v0}, Lexpo/modules/blur/ExpoBlurView;->setBackgroundColor(I)V

    goto :goto_0

    .line 56
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 58
    :cond_2
    iget-object p1, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p1, v0}, Leightbitlab/com/blurview/BlurView;->setBlurEnabled(Z)Leightbitlab/com/blurview/BlurViewFacade;

    .line 67
    :goto_0
    iget p1, p0, Lexpo/modules/blur/ExpoBlurView;->blurRadius:F

    invoke-virtual {p0, p1}, Lexpo/modules/blur/ExpoBlurView;->setBlurRadius(F)V

    return-void
.end method

.method public final setBlurRadius(F)V
    .locals 4

    .line 30
    iput p1, p0, Lexpo/modules/blur/ExpoBlurView;->blurRadius:F

    .line 32
    iget-boolean v0, p0, Lexpo/modules/blur/ExpoBlurView;->isBlurViewConfigured:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 34
    :cond_0
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->blurMethod:Lexpo/modules/blur/enums/BlurMethod;

    sget-object v1, Lexpo/modules/blur/ExpoBlurView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lexpo/modules/blur/enums/BlurMethod;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    .line 42
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    const/4 v2, 0x0

    cmpg-float v3, p1, v2

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v1, v3

    invoke-virtual {v0, v1}, Leightbitlab/com/blurview/BlurView;->setBlurEnabled(Z)Leightbitlab/com/blurview/BlurViewFacade;

    cmpl-float v0, p1, v2

    if-lez v0, :cond_2

    .line 44
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    iget v1, p0, Lexpo/modules/blur/ExpoBlurView;->blurReduction:F

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Leightbitlab/com/blurview/BlurView;->setBlurRadius(F)Leightbitlab/com/blurview/BlurViewFacade;

    .line 45
    iget-object p1, p0, Lexpo/modules/blur/ExpoBlurView;->blurView:Leightbitlab/com/blurview/BlurView;

    invoke-virtual {p1}, Leightbitlab/com/blurview/BlurView;->invalidate()V

    :cond_2
    :goto_1
    return-void

    .line 34
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 36
    :cond_4
    iget-object v0, p0, Lexpo/modules/blur/ExpoBlurView;->tint:Lexpo/modules/blur/enums/TintStyle;

    invoke-virtual {v0, p1}, Lexpo/modules/blur/enums/TintStyle;->toBlurEffect(F)I

    move-result p1

    invoke-virtual {p0, p1}, Lexpo/modules/blur/ExpoBlurView;->setBackgroundColor(I)V

    return-void
.end method

.method public final setTint$expo_blur_release(Lexpo/modules/blur/enums/TintStyle;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iput-object p1, p0, Lexpo/modules/blur/ExpoBlurView;->tint:Lexpo/modules/blur/enums/TintStyle;

    return-void
.end method
