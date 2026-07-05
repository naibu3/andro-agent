.class public final Lcom/stripe/android/view/CardInputWidget$onAttachedToWindow$lambda$18$$inlined$launchAndCollect$default$1$1$1;
.super Ljava/lang/Object;
.source "CardWidgetViewModel.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardInputWidget$onAttachedToWindow$lambda$18$$inlined$launchAndCollect$default$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardWidgetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardWidgetViewModel.kt\ncom/stripe/android/view/CardWidgetViewModelKt$launchAndCollect$1$1$1\n+ 2 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n*L\n1#1,127:1\n425#2,2:128\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/CardInputWidget;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget$onAttachedToWindow$lambda$18$$inlined$launchAndCollect$default$1$1$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 126
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 128
    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget$onAttachedToWindow$lambda$18$$inlined$launchAndCollect$default$1$1$1;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidget;->getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/stripe/android/view/CardBrandView;->setCbcEligible(Z)V

    .line 127
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
