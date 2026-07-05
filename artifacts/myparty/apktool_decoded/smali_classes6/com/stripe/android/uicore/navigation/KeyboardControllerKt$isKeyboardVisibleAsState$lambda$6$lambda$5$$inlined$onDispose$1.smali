.class public final Lcom/stripe/android/uicore/navigation/KeyboardControllerKt$isKeyboardVisibleAsState$lambda$6$lambda$5$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "Effects.kt"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/navigation/KeyboardControllerKt;->isKeyboardVisibleAsState(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 KeyboardController.kt\ncom/stripe/android/uicore/navigation/KeyboardControllerKt\n*L\n1#1,490:1\n63#2,2:491\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "dispose",
        "",
        "runtime_release"
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
.field final synthetic $onGlobalListener$inlined:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field final synthetic $view$inlined:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/navigation/KeyboardControllerKt$isKeyboardVisibleAsState$lambda$6$lambda$5$$inlined$onDispose$1;->$view$inlined:Landroid/view/View;

    iput-object p2, p0, Lcom/stripe/android/uicore/navigation/KeyboardControllerKt$isKeyboardVisibleAsState$lambda$6$lambda$5$$inlined$onDispose$1;->$onGlobalListener$inlined:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 491
    iget-object v0, p0, Lcom/stripe/android/uicore/navigation/KeyboardControllerKt$isKeyboardVisibleAsState$lambda$6$lambda$5$$inlined$onDispose$1;->$view$inlined:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/uicore/navigation/KeyboardControllerKt$isKeyboardVisibleAsState$lambda$6$lambda$5$$inlined$onDispose$1;->$onGlobalListener$inlined:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method
