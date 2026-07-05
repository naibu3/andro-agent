.class public final Lcom/stripe/android/view/ViewWidthAnimator;
.super Ljava/lang/Object;
.source "ViewWidthAnimator.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nViewWidthAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewWidthAnimator.kt\ncom/stripe/android/view/ViewWidthAnimator\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,44:1\n310#2:45\n326#2,4:46\n311#2:50\n*S KotlinDebug\n*F\n+ 1 ViewWidthAnimator.kt\ncom/stripe/android/view/ViewWidthAnimator\n*L\n23#1:45\n23#1:46,4\n23#1:50\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/view/ViewWidthAnimator;",
        "",
        "view",
        "Landroid/view/View;",
        "duration",
        "",
        "<init>",
        "(Landroid/view/View;J)V",
        "animate",
        "",
        "startWidth",
        "",
        "endWidth",
        "onAnimationEnd",
        "Lkotlin/Function0;",
        "payments-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final duration:J

.field private final view:Landroid/view/View;


# direct methods
.method public static synthetic $r8$lambda$gPaXDPi4hH4Nnbgz_OuUDNKiV7M(Lcom/stripe/android/view/ViewWidthAnimator;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/ViewWidthAnimator;->animate$lambda$2$lambda$1(Lcom/stripe/android/view/ViewWidthAnimator;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;J)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/view/ViewWidthAnimator;->view:Landroid/view/View;

    .line 11
    iput-wide p2, p0, Lcom/stripe/android/view/ViewWidthAnimator;->duration:J

    return-void
.end method

.method public static final synthetic access$getView$p(Lcom/stripe/android/view/ViewWidthAnimator;)Landroid/view/View;
    .locals 0

    .line 9
    iget-object p0, p0, Lcom/stripe/android/view/ViewWidthAnimator;->view:Landroid/view/View;

    return-object p0
.end method

.method private static final animate$lambda$2$lambda$1(Lcom/stripe/android/view/ViewWidthAnimator;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "valueAnimator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 23
    iget-object p0, p0, Lcom/stripe/android/view/ViewWidthAnimator;->view:Landroid/view/View;

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 24
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 48
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 46
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final animate(IILkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onAnimationEnd"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    filled-new-array {p1, p2}, [I

    move-result-object p1

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 20
    iget-wide v0, p0, Lcom/stripe/android/view/ViewWidthAnimator;->duration:J

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 21
    new-instance v0, Lcom/stripe/android/view/ViewWidthAnimator$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/ViewWidthAnimator$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/view/ViewWidthAnimator;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 29
    new-instance v0, Lcom/stripe/android/view/ViewWidthAnimator$animate$1$2;

    invoke-direct {v0, p0, p3, p2}, Lcom/stripe/android/view/ViewWidthAnimator$animate$1$2;-><init>(Lcom/stripe/android/view/ViewWidthAnimator;Lkotlin/jvm/functions/Function0;I)V

    check-cast v0, Landroid/animation/Animator$AnimatorListener;

    .line 28
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 41
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
