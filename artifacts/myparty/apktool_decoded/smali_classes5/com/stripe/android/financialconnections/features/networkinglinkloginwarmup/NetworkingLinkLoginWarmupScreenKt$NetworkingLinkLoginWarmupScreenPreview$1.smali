.class final Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1;
.super Ljava/lang/Object;
.source "NetworkingLinkLoginWarmupScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt;->NetworkingLinkLoginWarmupScreenPreview(Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nNetworkingLinkLoginWarmupScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingLinkLoginWarmupScreen.kt\ncom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,215:1\n1225#2,6:216\n1225#2,6:222\n*S KotlinDebug\n*F\n+ 1 NetworkingLinkLoginWarmupScreen.kt\ncom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1\n*L\n210#1:216,6\n211#1:222,6\n*E\n"
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
.field final synthetic $state:Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;


# direct methods
.method public static synthetic $r8$lambda$AcH2qAfDpzIjONiODVxWo7Cv_yk()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1;->invoke$lambda$1$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$vDwE4FZvzXS6VXMu8y_PuLM-T1w()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1;->invoke$lambda$3$lambda$2()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method constructor <init>(Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1;->$state:Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 210
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$3$lambda$2()Lkotlin/Unit;
    .locals 1

    .line 211
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 207
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 208
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 212
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 208
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupScreenPreview.<anonymous> (NetworkingLinkLoginWarmupScreen.kt:207)"

    const v2, -0x3bedf9d4

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 209
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1;->$state:Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;

    const v0, -0x5aea4e89

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 216
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 217
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    .line 218
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1$$ExternalSyntheticLambda0;-><init>()V

    .line 219
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 210
    :cond_3
    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v1, -0x5aea4a89

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 222
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 223
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_4

    .line 224
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt$NetworkingLinkLoginWarmupScreenPreview$1$$ExternalSyntheticLambda1;-><init>()V

    .line 225
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 211
    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v2, 0x1b0

    .line 208
    invoke-static {p2, v0, v1, p1, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupScreenKt;->access$NetworkingLinkLoginWarmupContent(Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
