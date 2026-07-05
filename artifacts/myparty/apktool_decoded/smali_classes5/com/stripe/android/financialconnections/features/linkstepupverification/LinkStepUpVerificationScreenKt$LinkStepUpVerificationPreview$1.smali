.class final Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1;
.super Ljava/lang/Object;
.source "LinkStepUpVerificationScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt;->LinkStepUpVerificationPreview(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLinkStepUpVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStepUpVerificationScreen.kt\ncom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,205:1\n1225#2,6:206\n1225#2,6:212\n*S KotlinDebug\n*F\n+ 1 LinkStepUpVerificationScreen.kt\ncom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1\n*L\n200#1:206,6\n201#1:212,6\n*E\n"
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
.field final synthetic $state:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;


# direct methods
.method public static synthetic $r8$lambda$hLDTllbwH44ZrOq4rjFZIr4XSkE()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1;->invoke$lambda$3$lambda$2()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$t_41szNT5Hlhbrs2PVkVRdq1hic(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1;->invoke$lambda$1$lambda$0(Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1;->$state:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2()Lkotlin/Unit;
    .locals 1

    .line 201
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 197
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 198
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 198
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationPreview.<anonymous> (LinkStepUpVerificationScreen.kt:197)"

    const v2, 0x810526c

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 199
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1;->$state:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    const v0, -0x798fa943

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 206
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 207
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    .line 208
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1$$ExternalSyntheticLambda0;-><init>()V

    .line 209
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 200
    :cond_3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v1, -0x798fa4c3

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 212
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 213
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_4

    .line 214
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt$LinkStepUpVerificationPreview$1$$ExternalSyntheticLambda1;-><init>()V

    .line 215
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 201
    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget v2, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    or-int/lit16 v2, v2, 0x1b0

    .line 198
    invoke-static {p2, v0, v1, p1, v2}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationScreenKt;->access$LinkStepUpVerificationContent(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
