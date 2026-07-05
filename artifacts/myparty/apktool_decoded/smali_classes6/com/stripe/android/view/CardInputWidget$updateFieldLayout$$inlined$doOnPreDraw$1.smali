.class public final Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;
.super Ljava/lang/Object;
.source "View.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n+ 2 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,414:1\n682#2:415\n683#2,3:418\n686#2:423\n326#3,2:416\n328#3,2:421\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n*L\n682#1:416,2\n682#1:421,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "run",
        "androidx/core/view/ViewKt$doOnPreDraw$1"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $newMarginStart$inlined:I

.field final synthetic $newWidth$inlined:I

.field final synthetic $this_doOnPreDraw:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;II)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;->$this_doOnPreDraw:Landroid/view/View;

    iput p2, p0, Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;->$newWidth$inlined:I

    iput p3, p0, Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;->$newMarginStart$inlined:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 81
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;->$this_doOnPreDraw:Landroid/view/View;

    .line 416
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    .line 417
    move-object v2, v1

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 418
    iget v3, p0, Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;->$newWidth$inlined:I

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 419
    iget v3, p0, Lcom/stripe/android/view/CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1;->$newMarginStart$inlined:I

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout$LayoutParams;->setMarginStart(I)V

    .line 421
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 416
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
