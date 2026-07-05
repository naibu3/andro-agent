.class final Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;
.super Ljava/lang/Object;
.source "FormActivityUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt;->FormActivityUI(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
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
.field final synthetic $interactor:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDismissed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onProcessingCompleted:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scrollState:Landroidx/compose/foundation/ScrollState;

.field final synthetic $state:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/ScrollState;Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/ScrollState;",
            "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$interactor:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$onDismissed:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$state:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    iput-object p5, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$onProcessingCompleted:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$onClick:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 53
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 54
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 54
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentelement.embedded.form.FormActivityUI.<anonymous> (FormActivityUI.kt:53)"

    const v2, 0x7591dc8a

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 55
    :cond_2
    new-instance p2, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1$1;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$interactor:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$onDismissed:Lkotlin/jvm/functions/Function0;

    invoke-direct {p2, v0, v1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1$1;-><init>(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;Lkotlin/jvm/functions/Function0;)V

    const v0, -0x19a6dcd7

    const/4 v1, 0x1

    const/16 v2, 0x36

    invoke-static {v0, v1, p2, p1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 61
    new-instance p2, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1$2;

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$interactor:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    iget-object v4, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$state:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    iget-object v5, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$onProcessingCompleted:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$onClick:Lkotlin/jvm/functions/Function0;

    invoke-direct {p2, v0, v4, v5, v6}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1$2;-><init>(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    const v0, 0x56607008

    invoke-static {v0, v1, p2, p1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 76
    iget-object v6, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt$FormActivityUI$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    const/16 v8, 0x36

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object v7, p1

    .line 54
    invoke-static/range {v3 .. v9}, Lcom/stripe/android/common/ui/BottomSheetScaffoldKt;->BottomSheetScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
