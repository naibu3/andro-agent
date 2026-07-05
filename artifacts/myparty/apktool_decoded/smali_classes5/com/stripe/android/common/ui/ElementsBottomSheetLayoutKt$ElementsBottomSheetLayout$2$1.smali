.class final Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ElementsBottomSheetLayout.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt;->ElementsBottomSheetLayout-TN_CM5M(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.common.ui.ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1"
    f = "ElementsBottomSheetLayout.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $layoutInfo:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;

.field final synthetic $statusBarColorAlpha$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $systemUiController:Lcom/google/accompanist/systemuicontroller/SystemUiController;

.field label:I


# direct methods
.method constructor <init>(Lcom/google/accompanist/systemuicontroller/SystemUiController;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/accompanist/systemuicontroller/SystemUiController;",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$systemUiController:Lcom/google/accompanist/systemuicontroller/SystemUiController;

    iput-object p2, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$layoutInfo:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;

    iput-object p3, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$statusBarColorAlpha$delegate:Landroidx/compose/runtime/State;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;

    iget-object v0, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$systemUiController:Lcom/google/accompanist/systemuicontroller/SystemUiController;

    iget-object v1, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$layoutInfo:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;

    iget-object v2, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$statusBarColorAlpha$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;-><init>(Lcom/google/accompanist/systemuicontroller/SystemUiController;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 49
    iget v0, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    iget-object v1, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$systemUiController:Lcom/google/accompanist/systemuicontroller/SystemUiController;

    .line 51
    iget-object p1, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$layoutInfo:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetLayoutInfo;->getScrimColor-0d7_KjU()J

    move-result-wide v2

    iget-object p1, p0, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1;->$statusBarColorAlpha$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/stripe/android/common/ui/ElementsBottomSheetLayoutKt;->access$ElementsBottomSheetLayout_TN_CM5M$lambda$1(Landroidx/compose/runtime/State;)F

    move-result v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 50
    invoke-static/range {v1 .. v7}, Lcom/google/accompanist/systemuicontroller/SystemUiController;->setStatusBarColor-ek8zF_U$default(Lcom/google/accompanist/systemuicontroller/SystemUiController;JZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 54
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
