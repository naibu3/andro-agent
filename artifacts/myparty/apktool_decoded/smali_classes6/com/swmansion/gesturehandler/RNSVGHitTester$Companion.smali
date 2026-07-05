.class public final Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;
.super Ljava/lang/Object;
.source "RNSVGHitTester.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/gesturehandler/RNSVGHitTester;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0001J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;",
        "",
        "<init>",
        "()V",
        "getRootSvgView",
        "Lcom/horcrux/svg/SvgView;",
        "view",
        "Landroid/view/View;",
        "isSvgElement",
        "",
        "hitTest",
        "posX",
        "",
        "posY",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$FFejZSvlhQrtkk4BMFTiclGk9rM(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;->hitTest$lambda$0(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;-><init>()V

    return-void
.end method

.method private final getRootSvgView(Landroid/view/View;)Lcom/horcrux/svg/SvgView;
    .locals 3

    .line 13
    instance-of v0, p1, Lcom/horcrux/svg/VirtualView;

    const-string v1, "null cannot be cast to non-null type com.horcrux.svg.SvgView"

    if-eqz v0, :cond_0

    .line 14
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/horcrux/svg/SvgView;

    .line 19
    :goto_0
    invoke-virtual {p1}, Lcom/horcrux/svg/SvgView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v2, "getParent(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;->isSvgElement(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 20
    invoke-virtual {p1}, Lcom/horcrux/svg/SvgView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Lcom/horcrux/svg/VirtualView;

    if-eqz v0, :cond_1

    .line 21
    invoke-virtual {p1}, Lcom/horcrux/svg/SvgView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.horcrux.svg.VirtualView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1}, Lcom/horcrux/svg/SvgView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/horcrux/svg/SvgView;

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method private static final hitTest$lambda$0(Landroid/view/View;)I
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final hitTest(Landroid/view/View;FF)Z
    .locals 10

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion;->getRootSvgView(Landroid/view/View;)Lcom/horcrux/svg/SvgView;

    move-result-object v0

    const/4 v1, 0x0

    .line 34
    filled-new-array {v1, v1}, [I

    move-result-object v2

    .line 35
    filled-new-array {v1, v1}, [I

    move-result-object v3

    .line 37
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 38
    invoke-virtual {v0, v3}, Lcom/horcrux/svg/SvgView;->getLocationOnScreen([I)V

    .line 41
    aget v4, v2, v1

    int-to-float v4, v4

    add-float/2addr v4, p2

    aget v5, v3, v1

    int-to-float v5, v5

    sub-float/2addr v4, v5

    const/4 v5, 0x1

    .line 42
    aget v2, v2, v5

    int-to-float v2, v2

    add-float/2addr v2, p3

    aget v3, v3, v5

    int-to-float v3, v3

    sub-float/2addr v2, v3

    .line 44
    invoke-virtual {v0, v4, v2}, Lcom/horcrux/svg/SvgView;->reactTagForTouch(FF)I

    move-result v0

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    if-ne v2, v0, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v1

    .line 51
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-double v3, v3

    float-to-double v6, p2

    const-wide/16 v8, 0x0

    cmpg-double p2, v8, v6

    if-gtz p2, :cond_1

    cmpg-double p2, v6, v3

    if-gtz p2, :cond_1

    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-double v3, p2

    float-to-double p2, p3

    cmpg-double v6, v8, p2

    if-gtz v6, :cond_1

    cmpg-double p2, p2, v3

    if-gtz p2, :cond_1

    move p2, v5

    goto :goto_1

    :cond_1
    move p2, v1

    .line 54
    :goto_1
    instance-of p3, p1, Lcom/horcrux/svg/SvgView;

    if-eqz p3, :cond_4

    .line 55
    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    move-result-object p1

    new-instance p3, Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion$$ExternalSyntheticLambda0;

    invoke-direct {p3}, Lcom/swmansion/gesturehandler/RNSVGHitTester$Companion$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {p1, p3}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p1, p3}, Lkotlin/sequences/SequencesKt;->contains(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Z

    move-result p1

    if-nez v2, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    if-eqz p2, :cond_3

    return v5

    :cond_3
    return v1

    :cond_4
    if-eqz v2, :cond_5

    if-eqz p2, :cond_5

    return v5

    :cond_5
    return v1
.end method

.method public final isSvgElement(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    instance-of v0, p1, Lcom/horcrux/svg/VirtualView;

    if-nez v0, :cond_1

    instance-of p1, p1, Lcom/horcrux/svg/SvgView;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
