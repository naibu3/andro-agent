.class final Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;
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
        "Landroidx/compose/animation/AnimatedVisibilityScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSuccessContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessContent.kt\ncom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1225#2,6:403\n1#3:409\n*S KotlinDebug\n*F\n+ 1 SuccessContent.kt\ncom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3\n*L\n221#1:403,6\n*E\n"
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
.field final synthetic $content:Lcom/stripe/android/financialconnections/ui/TextResource;

.field final synthetic $density:Landroidx/compose/ui/unit/Density;

.field final synthetic $successBodyHeight$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $title:Lcom/stripe/android/financialconnections/ui/TextResource;


# direct methods
.method public static synthetic $r8$lambda$DNaXy623Iv2qrC97NlFIo7Eoruc(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->invoke$lambda$2$lambda$1(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/ui/TextResource;",
            "Lcom/stripe/android/financialconnections/ui/TextResource;",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$content:Lcom/stripe/android/financialconnections/ui/TextResource;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$title:Lcom/stripe/android/financialconnections/ui/TextResource;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$successBodyHeight$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$2$lambda$1(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/layout/LayoutCoordinates;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    invoke-interface {p2}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    move-result p2

    invoke-interface {p0, p2}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    move-result p0

    invoke-static {p1, p0}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->access$SpinnerToSuccessAnimation_8GFhAUE$lambda$21(Landroidx/compose/runtime/MutableState;F)V

    .line 223
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 217
    check-cast p1, Landroidx/compose/animation/AnimatedVisibilityScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V

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

    const-string v0, "com.stripe.android.financialconnections.features.success.SpinnerToSuccessAnimation.<anonymous>.<anonymous> (SuccessContent.kt:217)"

    const v1, -0x9f61315

    .line 218
    invoke-static {v1, p3, p1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 219
    :cond_0
    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$content:Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 220
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$title:Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 221
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p1, Landroidx/compose/ui/Modifier;

    const p3, -0x4dea5c37

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$density:Landroidx/compose/ui/unit/Density;

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$density:Landroidx/compose/ui/unit/Density;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3;->$successBodyHeight$delegate:Landroidx/compose/runtime/MutableState;

    .line 403
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez p3, :cond_1

    .line 404
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne v4, p3, :cond_2

    .line 221
    :cond_1
    new-instance v4, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3$$ExternalSyntheticLambda0;

    invoke-direct {v4, v0, v1}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt$SpinnerToSuccessAnimation$2$3$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;)V

    .line 406
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 221
    :cond_2
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {p1, v4}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p2

    .line 218
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/financialconnections/features/success/SuccessContentKt;->access$SuccessBody(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
