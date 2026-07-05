.class final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;
.super Ljava/lang/Object;
.source "AutocompleteActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->onCreate(Landroid/os/Bundle;)V
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
    value = "SMAP\nAutocompleteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,112:1\n1225#2,6:113\n1225#2,6:119\n*S KotlinDebug\n*F\n+ 1 AutocompleteActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1\n*L\n48#1:113,6\n68#1:119,6\n*E\n"
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
.field final synthetic $appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

.field final synthetic $starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;


# direct methods
.method public static synthetic $r8$lambda$kvzM--YQXHmK5UJFZ1Okb4eQFyE(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->invoke$lambda$2$lambda$1(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->$starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->$appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$2$lambda$1(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lkotlin/Unit;
    .locals 0

    .line 69
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->access$getViewModel(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->onBackPressed()V

    .line 70
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 45
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 46
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 46
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.addresselement.AutocompleteActivity.onCreate.<anonymous> (AutocompleteActivity.kt:45)"

    const v2, -0x32f4ea68

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p2, p2, p1, v0, v1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->rememberStripeBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    move-result-object v1

    .line 48
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v3, -0x6827ec2d

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->$starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->$starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    .line 113
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_3

    .line 114
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_4

    .line 48
    :cond_3
    new-instance v3, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1;

    invoke-direct {v3, v4, v5, v1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 116
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 48
    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function2;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 p2, 0x6

    invoke-static {v2, v6, p1, p2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    const v2, -0x68278afa

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .line 68
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    .line 119
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_5

    .line 120
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_6

    .line 68
    :cond_5
    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$$ExternalSyntheticLambda0;

    invoke-direct {v4, v3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;)V

    .line 122
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 68
    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v2, 0x1

    invoke-static {v0, v4, p1, v0, v2}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 72
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->$appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    new-instance v3, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1;->$appearanceContext:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;

    invoke-direct {v3, v1, v4, v5}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$3;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V

    const/16 v1, 0x36

    const v4, -0x64ca82ca

    invoke-static {v4, v2, v3, p1, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, v1, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;->Theme(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
