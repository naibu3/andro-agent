.class final Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;
.super Ljava/lang/Object;
.source "SuccessContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->SuccessContentInternal-8GFhAUE(ZLandroidx/compose/ui/unit/Dp;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/animation/AnimatedVisibilityScope;",
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
.field final synthetic $completeSessionAsync:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDoneClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $payload$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showSpinner$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->$completeSessionAsync:Lcom/stripe/android/financialconnections/presentation/Async;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->$onDoneClick:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->$payload$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->$showSpinner$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 140
    check-cast p1, Landroidx/compose/animation/AnimatedVisibilityScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.financialconnections.features.success.SuccessContentInternal.<anonymous>.<anonymous>.<anonymous> (SuccessContent.kt:140)"

    const v1, -0x1ada274c

    .line 141
    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 142
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->$payload$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->access$SuccessContentInternal_8GFhAUE$lambda$7(Landroidx/compose/runtime/MutableState;)Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/success/SuccessState$Payload;->getBusinessName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    move-object v3, p1

    .line 143
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->$completeSessionAsync:Lcom/stripe/android/financialconnections/presentation/Async;

    instance-of v1, p1, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    .line 144
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->$showSpinner$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->access$SuccessContentInternal_8GFhAUE$lambda$4(Landroidx/compose/runtime/MutableState;)Z

    move-result p1

    xor-int/lit8 v2, p1, 0x1

    .line 145
    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SuccessContentInternal$2$1$1;->$onDoneClick:Lkotlin/jvm/functions/Function0;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v0, 0x0

    move-object v5, p2

    .line 141
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->access$SuccessFooter(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2
    return-void
.end method
