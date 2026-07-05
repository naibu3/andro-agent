.class final Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;
.super Ljava/lang/Object;
.source "MultipleEventsCutter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt;->clickableSingle-O2vRcR0(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/ui/Modifier;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultipleEventsCutter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleEventsCutter.kt\ncom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,105:1\n1225#2,6:106\n1225#2,6:112\n*S KotlinDebug\n*F\n+ 1 MultipleEventsCutter.kt\ncom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4\n*L\n94#1:106,6\n100#1:112,6\n*E\n"
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
.field final synthetic $enabled:Z

.field final synthetic $indication:Landroidx/compose/foundation/Indication;

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onClickLabel:Ljava/lang/String;

.field final synthetic $role:Landroidx/compose/ui/semantics/Role;


# direct methods
.method public static synthetic $r8$lambda$9vqBR4zLlFwadjHuQWV8qC2LrPU(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->invoke$lambda$3$lambda$2$lambda$1(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$xciet2KPZEysYxrrrL-i1zs8DVE(Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->invoke$lambda$3$lambda$2(Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/Indication;",
            "Z",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/semantics/Role;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$indication:Landroidx/compose/foundation/Indication;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$enabled:Z

    iput-object p4, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$onClickLabel:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$role:Landroidx/compose/ui/semantics/Role;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$onClick:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$3$lambda$2(Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 1

    .line 100
    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p0, v0}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;->processEvent(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2$lambda$1(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 100
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 8

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x33fa9735    # -3.497246E7f

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.ui.components.clickableSingle.<anonymous> (MultipleEventsCutter.kt:93)"

    .line 94
    invoke-static {p1, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    const p1, -0x62084dd

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 106
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p1

    .line 107
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_1

    .line 94
    sget-object p1, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;->Companion:Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter$Companion;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt;->get(Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter$Companion;)Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;

    move-result-object p1

    .line 109
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 94
    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 95
    sget-object p3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v0, p3

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 96
    iget-object v1, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 97
    iget-object v2, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$indication:Landroidx/compose/foundation/Indication;

    .line 98
    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$enabled:Z

    .line 99
    iget-object v4, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$onClickLabel:Ljava/lang/String;

    .line 101
    iget-object v5, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$role:Landroidx/compose/ui/semantics/Role;

    const p3, -0x6206591

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p3

    iget-object v6, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$onClick:Lkotlin/jvm/functions/Function0;

    invoke-interface {p2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr p3, v6

    .line 100
    iget-object v6, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->$onClick:Lkotlin/jvm/functions/Function0;

    .line 112
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez p3, :cond_2

    .line 113
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne v7, p3, :cond_3

    .line 100
    :cond_2
    new-instance v7, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4$$ExternalSyntheticLambda1;

    invoke-direct {v7, p1, v6}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;Lkotlin/jvm/functions/Function0;)V

    .line 115
    invoke-interface {p2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 100
    :cond_3
    move-object v6, v7

    check-cast v6, Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 95
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/ClickableKt;->clickable-O2vRcR0(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 85
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterKt$clickableSingle$4;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
