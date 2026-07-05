.class final Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2;
.super Ljava/lang/Object;
.source "SuccessContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->SpinnerToSuccessAnimation-8GFhAUE(ZLandroidx/compose/ui/unit/Dp;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/Boolean;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSuccessContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessContent.kt\ncom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,402:1\n1225#2,6:403\n*S KotlinDebug\n*F\n+ 1 SuccessContent.kt\ncom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2\n*L\n210#1:403,6\n*E\n"
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
.field final synthetic $targetCheckmarkScale$delegate:Landroidx/compose/runtime/MutableFloatState;


# direct methods
.method public static synthetic $r8$lambda$66B_nF1ovKv49uYYz522SkRYD8k(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2;->invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableFloatState;)F

    move-result p0

    return p0
.end method

.method constructor <init>(Landroidx/compose/runtime/MutableFloatState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2;->$targetCheckmarkScale$delegate:Landroidx/compose/runtime/MutableFloatState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 210
    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->access$SpinnerToSuccessAnimation_8GFhAUE$lambda$17(Landroidx/compose/runtime/MutableFloatState;)F

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 207
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2;->invoke(ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(ZLandroidx/compose/runtime/Composer;I)V
    .locals 9

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    .line 208
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 211
    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 208
    :cond_3
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.success.SpinnerToSuccessAnimation.<anonymous>.<anonymous> (SuccessContent.kt:207)"

    const v2, -0x121b259c

    invoke-static {v2, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    const v0, -0x4dea84e2

    .line 209
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2;->$targetCheckmarkScale$delegate:Landroidx/compose/runtime/MutableFloatState;

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .line 210
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2;->$targetCheckmarkScale$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 403
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5

    .line 404
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_6

    .line 210
    :cond_5
    new-instance v2, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$2$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableFloatState;)V

    .line 406
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 210
    :cond_6
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    and-int/lit8 v7, p3, 0xe

    const/4 v8, 0x4

    const/4 v5, 0x0

    move v3, p1

    move-object v6, p2

    .line 208
    invoke-static/range {v3 .. v8}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->access$SpinnerToCheckmark(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
