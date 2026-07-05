.class final Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;
.super Ljava/lang/Object;
.source "OTPElementUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI-RE_urrM(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V
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
    value = "SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,311:1\n149#2:312\n1225#3,6:313\n1225#3,6:319\n1225#3,6:325\n1225#3,6:331\n81#4:337\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1\n*L\n151#1:312\n152#1:313,6\n159#1:319,6\n173#1:325,6\n180#1:331,6\n148#1:337\n*E\n"
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
.field final synthetic $boxTextStyle:Landroidx/compose/ui/text/TextStyle;

.field final synthetic $colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

.field final synthetic $element:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $enabled:Z

.field final synthetic $focusManager:Landroidx/compose/ui/focus/FocusManager;

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $focusedElementIndex$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $index:I

.field final synthetic $isSelected:Z

.field final synthetic $otpInputPlaceholder:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$-_TNl_IR3pWPq5II93zPrpKE_Vc(IZLandroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke$lambda$2$lambda$1(IZLandroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$goLnVPP3FaNggR5AJWYnTXNBqbk(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke$lambda$5$lambda$4(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/uicore/elements/OTPElement;IZLandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/text/TextStyle;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    iput p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    iput-boolean p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$isSelected:Z

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$boxTextStyle:Landroidx/compose/ui/text/TextStyle;

    iput-boolean p7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$enabled:Z

    iput-object p8, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iput-object p9, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$otpInputPlaceholder:Ljava/lang/String;

    iput-object p10, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusedElementIndex$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$invoke$lambda$0(Landroidx/compose/runtime/State;)Ljava/lang/String;
    .locals 0

    .line 147
    invoke-static {p0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(Landroidx/compose/runtime/State;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 337
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final invoke$lambda$2$lambda$1(IZLandroidx/compose/runtime/MutableIntState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "focusState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    invoke-interface {p3}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    invoke-static {p2, p0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->access$OTPElementUI_RE_urrM$lambda$7$lambda$5(Landroidx/compose/runtime/MutableIntState;I)V

    goto :goto_0

    .line 155
    :cond_0
    invoke-interface {p3}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    move-result p0

    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    const/4 p0, -0x1

    .line 156
    invoke-static {p2, p0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->access$OTPElementUI_RE_urrM$lambda$7$lambda$5(Landroidx/compose/runtime/MutableIntState;I)V

    .line 158
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$5$lambda$4(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 173
    invoke-static {p0, v0}, Landroidx/compose/ui/semantics/SemanticsProperties_androidKt;->setTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 147
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 148
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 195
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 148
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.elements.OTPElementUI.<anonymous>.<anonymous>.<anonymous> (OTPElementUI.kt:147)"

    const v2, -0x411571ad

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/OTPController;->getFieldValues$stripe_ui_core_release()Ljava/util/List;

    move-result-object p2

    iget v0, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p2, v0, p1, v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p2

    .line 150
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/16 v4, 0x38

    int-to-float v4, v4

    .line 312
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 151
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v4, 0x1ab8f9bb

    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    iget-boolean v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$isSelected:Z

    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v5

    or-int/2addr v4, v5

    .line 152
    iget v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    iget-boolean v6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$isSelected:Z

    iget-object v7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusedElementIndex$delegate:Landroidx/compose/runtime/MutableIntState;

    .line 313
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_3

    .line 314
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v8, v4, :cond_4

    .line 152
    :cond_3
    new-instance v8, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v8, v5, v6, v7}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda0;-><init>(IZLandroidx/compose/runtime/MutableIntState;)V

    .line 316
    invoke-interface {p1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 152
    :cond_4
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v3, v8}, Landroidx/compose/ui/focus/FocusChangedModifierKt;->onFocusChanged(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v4, 0x1ab9256c

    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    .line 159
    iget v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    iget-object v6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    iget-object v7, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    .line 319
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_5

    .line 320
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v8, v4, :cond_6

    .line 159
    :cond_5
    new-instance v4, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;

    invoke-direct {v4, v5, v6, v7, p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$textFieldModifier$2$1;-><init>(ILandroidx/compose/ui/focus/FocusManager;Lcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/runtime/State;)V

    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 322
    invoke-interface {p1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 159
    :cond_6
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v3, v8}, Landroidx/compose/ui/input/key/KeyInputModifierKt;->onPreviewKeyEvent(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 172
    iget v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "OTP-"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v4, 0x1ab97fb0

    .line 173
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 325
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .line 326
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_7

    .line 327
    new-instance v4, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda1;

    invoke-direct {v4}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$$ExternalSyntheticLambda1;-><init>()V

    .line 328
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 173
    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v3, v1, v4, v2, v0}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, 0x1ab98712

    .line 150
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 175
    iget v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    if-nez v1, :cond_a

    .line 177
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusRequester:Landroidx/compose/ui/focus/FocusRequester;

    invoke-static {v0, v1}, Landroidx/compose/ui/focus/FocusRequesterModifierKt;->focusRequester(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 179
    sget-object v1, Landroidx/compose/ui/autofill/AutofillType;->SmsOtpCode:Landroidx/compose/ui/autofill/AutofillType;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 180
    iget-object v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v2

    const v3, 0x1ab9a7f4

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    .line 331
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    .line 332
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_9

    .line 180
    :cond_8
    new-instance v3, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$1$1;

    invoke-direct {v3, v2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v4, v3

    check-cast v4, Lkotlin/reflect/KFunction;

    .line 334
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 180
    :cond_9
    check-cast v4, Lkotlin/reflect/KFunction;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x30

    .line 178
    invoke-static {v0, v1, v4, p1, v2}, Lcom/stripe/android/uicore/text/AutofillModifierKt;->autofill(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_a
    move-object v7, v0

    .line 176
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 185
    invoke-static {p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->invoke$lambda$0(Landroidx/compose/runtime/State;)Ljava/lang/String;

    move-result-object v1

    .line 186
    iget-boolean v2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$isSelected:Z

    .line 192
    iget-object v3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$boxTextStyle:Landroidx/compose/ui/text/TextStyle;

    .line 187
    iget-object v4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$element:Lcom/stripe/android/uicore/elements/OTPElement;

    .line 188
    iget v5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$index:I

    .line 189
    iget-object v6, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    .line 193
    iget-boolean v8, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$enabled:Z

    .line 194
    iget-object v9, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    .line 191
    iget-object v10, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;->$otpInputPlaceholder:Ljava/lang/String;

    const/4 v12, 0x0

    move-object v11, p1

    .line 184
    invoke-static/range {v1 .. v12}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->access$OTPInputBox(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    return-void
.end method
