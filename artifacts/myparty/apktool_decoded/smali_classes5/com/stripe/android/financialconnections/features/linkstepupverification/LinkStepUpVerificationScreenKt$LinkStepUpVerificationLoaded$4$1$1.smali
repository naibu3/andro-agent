.class final Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$4$1$1;
.super Ljava/lang/Object;
.source "LinkStepUpVerificationScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt;->LinkStepUpVerificationLoaded(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
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
.field final synthetic $payload:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$4$1$1;->$payload:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 124
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$4$1$1;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V
    .locals 2

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 125
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationLoaded.<anonymous>.<anonymous>.<anonymous> (LinkStepUpVerificationScreen.kt:124)"

    const v1, 0x477d1e5f

    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationLoaded$4$1$1;->$payload:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->getEmail()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt;->access$HeaderSection(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
