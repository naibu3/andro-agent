.class final Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1;
.super Ljava/lang/Object;
.source "SharedPartnerAuth.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt;->PartnerAuthPreview(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nSharedPartnerAuth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPartnerAuth.kt\ncom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,542:1\n1225#2,6:543\n1225#2,6:549\n1225#2,6:555\n*S KotlinDebug\n*F\n+ 1 SharedPartnerAuth.kt\ncom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1\n*L\n511#1:543,6\n512#1:549,6\n513#1:555,6\n*E\n"
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
.field final synthetic $state:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;


# direct methods
.method public static synthetic $r8$lambda$8D9puZU822mRtjTQ-A2Mtd6wtdY()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1;->invoke$lambda$3$lambda$2()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$KxPl_xgKpWcLkgwWZGVNpXM08Eo(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1;->invoke$lambda$1$lambda$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$RcbLCQjr0NeZxGT6DyfmiHLJmtI()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1;->invoke$lambda$5$lambda$4()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1;->$state:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 511
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2()Lkotlin/Unit;
    .locals 1

    .line 512
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$5$lambda$4()Lkotlin/Unit;
    .locals 1

    .line 513
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 507
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 508
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 514
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 508
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.common.PartnerAuthPreview.<anonymous> (SharedPartnerAuth.kt:507)"

    const v2, -0x12cf873f

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 509
    :cond_2
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1;->$state:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    const p2, -0x347dd546

    .line 510
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 543
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 544
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_3

    .line 545
    new-instance p2, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda0;-><init>()V

    .line 546
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 511
    :cond_3
    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const p2, -0x347dd106    # -1.7063412E7f

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 549
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 550
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_4

    .line 551
    new-instance p2, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda1;-><init>()V

    .line 552
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 512
    :cond_4
    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const p2, -0x347dcd06    # -1.706546E7f

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 555
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 556
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_5

    .line 557
    new-instance p2, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda2;

    invoke-direct {p2}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt$PartnerAuthPreview$1$$ExternalSyntheticLambda2;-><init>()V

    .line 558
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 513
    :cond_5
    move-object v7, p2

    check-cast v7, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v9, 0x6db0

    const/4 v4, 0x0

    move-object v8, p1

    .line 508
    invoke-static/range {v3 .. v9}, Lcom/stripe/android/financialconnections/features/common/SharedPartnerAuthKt;->access$SharedPartnerAuthContent(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    return-void
.end method
