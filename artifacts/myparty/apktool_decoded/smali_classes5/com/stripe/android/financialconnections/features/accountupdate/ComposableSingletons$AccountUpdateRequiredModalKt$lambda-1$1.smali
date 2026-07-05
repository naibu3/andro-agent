.class final Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;
.super Ljava/lang/Object;
.source "AccountUpdateRequiredModal.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt;
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
    value = "SMAP\nAccountUpdateRequiredModal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountUpdateRequiredModal.kt\ncom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,100:1\n1225#2,6:101\n1225#2,6:107\n*S KotlinDebug\n*F\n+ 1 AccountUpdateRequiredModal.kt\ncom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1\n*L\n95#1:101,6\n96#1:107,6\n*E\n"
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


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;


# direct methods
.method public static synthetic $r8$lambda$6m4obKDZr3UqQy2Sp-v398F3xXI()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;->invoke$lambda$1$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$UcJoC_0qYhbzTdIW1uk2rwoUcAI()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;->invoke$lambda$3$lambda$2()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 95
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$3$lambda$2()Lkotlin/Unit;
    .locals 1

    .line 96
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 61
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 62
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 62
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.accountupdate.ComposableSingletons$AccountUpdateRequiredModalKt.lambda-1.<anonymous> (AccountUpdateRequiredModal.kt:61)"

    const v4, 0x3f4feb6f

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 63
    :cond_2
    new-instance v1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    .line 64
    new-instance v2, LFinancialConnectionsGenericInfoScreen;

    .line 66
    new-instance v4, LFinancialConnectionsGenericInfoScreen$Header;

    .line 69
    new-instance v3, Lcom/stripe/android/financialconnections/model/Image;

    const-string v5, "BrandIcon"

    invoke-direct {v3, v5}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 70
    sget-object v5, LAlignment;->Left:LAlignment;

    .line 66
    const-string v6, "Update required"

    const-string v7, "Backend driven update subtitle. An update is required on this account!"

    invoke-direct {v4, v6, v7, v3, v5}, LFinancialConnectionsGenericInfoScreen$Header;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;LAlignment;)V

    .line 73
    new-instance v6, LFinancialConnectionsGenericInfoScreen$Footer;

    .line 74
    new-instance v10, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    .line 76
    const-string v3, "Continue"

    .line 74
    const-string v5, "primaryCta1"

    const/4 v15, 0x0

    invoke-direct {v10, v5, v3, v15}, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;)V

    .line 79
    new-instance v11, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    .line 81
    const-string v3, "Cancel"

    .line 79
    invoke-direct {v11, v5, v3, v15}, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;)V

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v8, v6

    .line 73
    invoke-direct/range {v8 .. v14}, LFinancialConnectionsGenericInfoScreen$Footer;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 86
    new-instance v7, LFinancialConnectionsGenericInfoScreen$Options;

    const/4 v3, 0x1

    .line 87
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 88
    sget-object v5, LVerticalAlignment;->Default:LVerticalAlignment;

    .line 86
    invoke-direct {v7, v3, v5}, LFinancialConnectionsGenericInfoScreen$Options;-><init>(Ljava/lang/Boolean;LVerticalAlignment;)V

    .line 64
    const-string v3, "sampleScreen1"

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, LFinancialConnectionsGenericInfoScreen;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)V

    .line 91
    new-instance v3, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;

    invoke-direct {v3, v15}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    check-cast v3, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;

    .line 63
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;-><init>(LFinancialConnectionsGenericInfoScreen;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;)V

    const v2, -0x4d0ab19c

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 101
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 102
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_3

    .line 103
    new-instance v2, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1$$ExternalSyntheticLambda0;-><init>()V

    .line 104
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 95
    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v3, -0x4d0aae3c

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 107
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 108
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_4

    .line 109
    new-instance v3, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/stripe/android/financialconnections/features/accountupdate/ComposableSingletons$AccountUpdateRequiredModalKt$lambda-1$1$$ExternalSyntheticLambda1;-><init>()V

    .line 110
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 96
    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v4, 0x1b0

    .line 62
    invoke-static {v1, v2, v3, v0, v4}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredModalKt;->access$AccountUpdateRequiredModalContent(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    return-void
.end method
