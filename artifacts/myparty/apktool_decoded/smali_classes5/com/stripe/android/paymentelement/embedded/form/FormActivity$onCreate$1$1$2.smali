.class final Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;
.super Ljava/lang/Object;
.source "FormActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFormActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormActivity.kt\ncom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,109:1\n1225#2,6:110\n1225#2,6:116\n1225#2,6:122\n*S KotlinDebug\n*F\n+ 1 FormActivity.kt\ncom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2\n*L\n72#1:110,6\n79#1:116,6\n73#1:122,6\n*E\n"
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
.field final synthetic $state$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;


# direct methods
.method public static synthetic $r8$lambda$6B0bmi5qQSQpoOK7S4J-BdHVwGc(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->invoke$lambda$4$lambda$3(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivity;",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->$state$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$4$lambda$3(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)Lkotlin/Unit;
    .locals 1

    .line 74
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getConfirmationHelper()Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;->confirm()Lcom/stripe/android/paymentelement/embedded/form/FormResult;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 75
    invoke-static {p0, v0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->access$setFormResult(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;Lcom/stripe/android/paymentelement/embedded/form/FormResult;)V

    .line 76
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->finish()V

    .line 78
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 68
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 69
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 81
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 69
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentelement.embedded.form.FormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FormActivity.kt:68)"

    const v2, -0x65f37c13

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 70
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getFormInteractor()Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    move-result-object v0

    .line 71
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->getEventReporter()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v1

    .line 72
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    const v2, 0x72d9efbc

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .line 110
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    .line 111
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_4

    .line 72
    :cond_3
    new-instance v2, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2$1$1;

    invoke-direct {v2, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2$1$1;-><init>(Ljava/lang/Object;)V

    move-object v3, v2

    check-cast v3, Lkotlin/reflect/KFunction;

    .line 113
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 72
    :cond_4
    check-cast v3, Lkotlin/reflect/KFunction;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 79
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    const v2, 0x72da1786

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .line 116
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_5

    .line 117
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_6

    .line 79
    :cond_5
    new-instance v2, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2$2$1;

    invoke-direct {v2, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2$2$1;-><init>(Ljava/lang/Object;)V

    move-object v4, v2

    check-cast v4, Lkotlin/reflect/KFunction;

    .line 119
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 79
    :cond_6
    check-cast v4, Lkotlin/reflect/KFunction;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 80
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->$state$delegate:Landroidx/compose/runtime/State;

    invoke-static {p2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1;->access$invoke$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    move-result-object p2

    const v2, 0x72d9f77c

    .line 71
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .line 73
    iget-object v5, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2;->this$0:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    .line 122
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_7

    .line 123
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_8

    .line 73
    :cond_7
    new-instance v6, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2$$ExternalSyntheticLambda0;

    invoke-direct {v6, v5}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity$onCreate$1$1$2$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;)V

    .line 125
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 73
    :cond_8
    move-object v2, v6

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 79
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 72
    move-object v5, v3

    check-cast v5, Lkotlin/jvm/functions/Function0;

    const/4 v7, 0x0

    move-object v6, p1

    move-object v3, v4

    move-object v4, p2

    .line 69
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityUIKt;->FormActivityUI(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    return-void
.end method
