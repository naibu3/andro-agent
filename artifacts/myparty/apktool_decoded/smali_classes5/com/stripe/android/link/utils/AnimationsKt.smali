.class public final Lcom/stripe/android/link/utils/AnimationsKt;
.super Ljava/lang/Object;
.source "Animations.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LINK_SCREEN_SIZE_ANIMATION_DURATION_MILLIS",
        "",
        "LINK_IME_ANIMATION_DURATION_MILLIS",
        "LINK_DEFAULT_ANIMATION_DELAY_MILLIS",
        "",
        "LinkScreenTransition",
        "Landroidx/compose/animation/ContentTransform;",
        "getLinkScreenTransition",
        "()Landroidx/compose/animation/ContentTransform;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final LINK_DEFAULT_ANIMATION_DELAY_MILLIS:J = 0x28aL

.field private static final LINK_IME_ANIMATION_DURATION_MILLIS:I = 0x15e

.field public static final LINK_SCREEN_SIZE_ANIMATION_DURATION_MILLIS:I = 0x12c

.field private static final LinkScreenTransition:Landroidx/compose/animation/ContentTransform;


# direct methods
.method public static synthetic $r8$lambda$HI_u7HP5EToPtnUpTDWJy0YUQT4(Landroidx/compose/ui/unit/IntSize;Landroidx/compose/ui/unit/IntSize;)Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/utils/AnimationsKt;->LinkScreenTransition$lambda$0(Landroidx/compose/ui/unit/IntSize;Landroidx/compose/ui/unit/IntSize;)Landroidx/compose/animation/core/FiniteAnimationSpec;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 8

    .line 30
    new-instance v0, Landroidx/compose/animation/ContentTransform;

    const/16 v1, 0x12c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    .line 31
    invoke-static {v1, v2, v3, v4, v3}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v5

    check-cast v5, Landroidx/compose/animation/core/FiniteAnimationSpec;

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v5, v6, v7, v3}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    .line 32
    invoke-static {v1, v2, v3, v4, v3}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object v1

    check-cast v1, Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-static {v1, v6, v7, v3}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v1

    .line 33
    new-instance v4, Lcom/stripe/android/link/utils/AnimationsKt$$ExternalSyntheticLambda0;

    invoke-direct {v4}, Lcom/stripe/android/link/utils/AnimationsKt$$ExternalSyntheticLambda0;-><init>()V

    const/4 v6, 0x1

    invoke-static {v2, v4, v6, v3}, Landroidx/compose/animation/AnimatedContentKt;->SizeTransform$default(ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/compose/animation/SizeTransform;

    move-result-object v4

    move-object v2, v1

    move-object v1, v5

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 30
    invoke-direct/range {v0 .. v6}, Landroidx/compose/animation/ContentTransform;-><init>(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;FLandroidx/compose/animation/SizeTransform;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/utils/AnimationsKt;->LinkScreenTransition:Landroidx/compose/animation/ContentTransform;

    return-void
.end method

.method private static final LinkScreenTransition$lambda$0(Landroidx/compose/ui/unit/IntSize;Landroidx/compose/ui/unit/IntSize;)Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 3

    .line 37
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutSlowInEasing()Landroidx/compose/animation/core/Easing;

    move-result-object p0

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/16 v1, 0x12c

    const/4 v2, 0x0

    .line 35
    invoke-static {v1, v2, p0, p1, v0}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/core/FiniteAnimationSpec;

    return-object p0
.end method

.method public static final getLinkScreenTransition()Landroidx/compose/animation/ContentTransform;
    .locals 1

    .line 29
    sget-object v0, Lcom/stripe/android/link/utils/AnimationsKt;->LinkScreenTransition:Landroidx/compose/animation/ContentTransform;

    return-object v0
.end method
