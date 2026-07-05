.class final Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetNativeActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsSheetNativeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetNativeActivity.kt\ncom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,336:1\n1225#2,6:337\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetNativeActivity.kt\ncom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2\n*L\n204#1:337,6\n*E\n"
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
.field final synthetic $initialDestination:Lcom/stripe/android/financialconnections/navigation/Destination;

.field final synthetic $navController:Landroidx/navigation/NavHostController;


# direct methods
.method public static synthetic $r8$lambda$UcKCa9Lz87T_FQohCsLMDjJ6PIk(Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2;->invoke$lambda$1$lambda$0(Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/navigation/NavHostController;Lcom/stripe/android/financialconnections/navigation/Destination;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2;->$navController:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2;->$initialDestination:Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$NavHost"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$Consent;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Consent;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 206
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$IDConsentContent;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$IDConsentContent;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 207
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 208
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 209
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuthDrawer;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuthDrawer;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->bottomSheet$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 210
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$Exit;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Exit;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->bottomSheet$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 211
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 212
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 213
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$Success;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Success;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 214
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$Reset;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Reset;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 215
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$Error;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Error;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 216
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$AttachLinkedPaymentAccount;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$AttachLinkedPaymentAccount;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 217
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkSignup;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkSignup;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 218
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->bottomSheet$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 219
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 220
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 221
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 222
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 223
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$LinkStepUpVerification;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$LinkStepUpVerification;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 224
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntrySuccess;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntrySuccess;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 225
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$Notice;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Notice;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->bottomSheet$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 226
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->bottomSheet$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 227
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$LinkLogin;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$LinkLogin;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p0, v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/navigation/DestinationKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Lcom/stripe/android/financialconnections/navigation/Destination;Ljava/util/List;ILjava/lang/Object;)V

    .line 228
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 200
    check-cast p1, Landroidx/compose/foundation/layout/PaddingValues;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2;->invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move/from16 v1, p3

    const-string v2, "it"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 201
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 228
    :cond_0
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 201
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:200)"

    const v4, 0x463db002    # 12140.002f

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 202
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2;->$navController:Landroidx/navigation/NavHostController;

    .line 203
    iget-object v2, v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2;->$initialDestination:Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/navigation/Destination;->getFullRoute()Ljava/lang/String;

    move-result-object v2

    const v3, -0x783d12f8

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 337
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 338
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_3

    .line 339
    new-instance v3, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2$$ExternalSyntheticLambda0;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$NavHost$2$2$2$$ExternalSyntheticLambda0;-><init>()V

    .line 340
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 204
    :cond_3
    move-object v11, v3

    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v14, 0x6

    const/16 v15, 0x3fc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    .line 201
    invoke-static/range {v1 .. v15}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method
