.class final Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;
.super Ljava/lang/Object;
.source "LinkInlineSignupFields.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->invoke(Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLinkInlineSignupFields.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignupFields.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,244:1\n1225#2,6:245\n86#3:251\n83#3,6:252\n89#3:286\n93#3:292\n79#4,6:258\n86#4,4:273\n90#4,2:283\n94#4:291\n368#5,9:264\n377#5:285\n378#5,2:289\n4034#6,6:277\n169#7:287\n169#7:288\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignupFields.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2\n*L\n123#1:245,6\n127#1:251\n127#1:252,6\n127#1:286\n127#1:292\n127#1:258,6\n127#1:273,4\n127#1:283,2\n127#1:291\n127#1:264,9\n127#1:285\n127#1:289,2\n127#1:277,6\n134#1:287\n167#1:288\n*E\n"
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
.field final synthetic $allowsDefaultOptIn:Z

.field final synthetic $emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $enabled:Z

.field final synthetic $errorMessage:Ljava/lang/String;

.field final synthetic $isShowingPhoneFirst:Z

.field final synthetic $nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $nameFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $onShowingAllFields:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $phoneFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requiresNameCollection:Z

.field final synthetic $signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function0;ZZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZLandroidx/compose/ui/focus/FocusRequester;ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/uicore/elements/TextFieldController;Landroidx/compose/ui/focus/FocusRequester;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;ZZ",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "Z",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Z",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$onShowingAllFields:Lkotlin/jvm/functions/Function0;

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$isShowingPhoneFirst:Z

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$enabled:Z

    iput-object p4, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p5, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iput-boolean p6, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$requiresNameCollection:Z

    iput-object p7, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-boolean p8, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$allowsDefaultOptIn:Z

    iput-object p9, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p10, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$phoneFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p11, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p12, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$nameFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p13, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$errorMessage:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 122
    check-cast p1, Landroidx/compose/animation/AnimatedVisibilityScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v6, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:122)"

    const v3, 0xf097bc4

    move/from16 v4, p3

    .line 123
    invoke-static {v3, v4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v2, -0x6a8c412e

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$onShowingAllFields:Lkotlin/jvm/functions/Function0;

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$onShowingAllFields:Lkotlin/jvm/functions/Function0;

    .line 245
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v2, :cond_1

    .line 246
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_2

    .line 123
    :cond_1
    new-instance v2, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1;

    invoke-direct {v2, v3, v5}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 248
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 123
    :cond_2
    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v2, 0x6

    invoke-static {v1, v4, v6, v2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 128
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/4 v2, 0x0

    const/4 v14, 0x1

    .line 129
    invoke-static {v1, v2, v14, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 130
    const-string v2, "LinkInlineSignupRemainingFields"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 127
    iget-boolean v9, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$isShowingPhoneFirst:Z

    iget-boolean v10, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$enabled:Z

    iget-object v11, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v12, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-boolean v13, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$requiresNameCollection:Z

    iget-object v15, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iget-boolean v2, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$allowsDefaultOptIn:Z

    iget-object v3, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v4, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$phoneFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iget-object v5, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v7, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$nameFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iget-object v8, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;->$errorMessage:Ljava/lang/String;

    const v14, -0x1cd0f17e

    const-string v0, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    .line 251
    invoke-static {v6, v14, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 252
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    .line 253
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v14

    move/from16 p3, v13

    const/4 v13, 0x0

    .line 256
    invoke-static {v0, v14, v6, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v0

    const v14, -0x4ee9b9da

    move/from16 v16, v2

    .line 257
    const-string v2, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 258
    invoke-static {v6, v14, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 259
    invoke-static {v6, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v2

    .line 260
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v14

    .line 261
    invoke-static {v6, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 263
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    move/from16 v17, v2

    const v2, -0x2942ffcf

    move-object/from16 v19, v3

    .line 262
    const-string v3, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 264
    invoke-static {v6, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 265
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v2

    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    if-nez v2, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 266
    :cond_3
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 267
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 268
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    .line 270
    :cond_4
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 272
    :goto_0
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .line 273
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v2, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 274
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v2, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 276
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 278
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 279
    :cond_5
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 280
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 283
    :cond_6
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v2, v1, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x16ef5699

    .line 285
    const-string v1, "C88@4444L9:Column.kt#2w3rfo"

    .line 286
    invoke-static {v6, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    .line 133
    sget-object v1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v2, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v1, v6, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v2

    .line 134
    sget-object v1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v13, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v1, v6, v13}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v1

    .line 287
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    move-object v13, v7

    const/4 v7, 0x0

    move-object v14, v8

    const/16 v8, 0x9

    move-object/from16 v17, v4

    move v4, v1

    const/4 v1, 0x0

    move-object/from16 v20, v5

    const/4 v5, 0x0

    .line 132
    invoke-static/range {v1 .. v8}, Landroidx/compose/material/DividerKt;->Divider-oMI9zvI(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    if-eqz v9, :cond_8

    const v1, 0x3fb9a1ac

    .line 137
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz p3, :cond_7

    .line 143
    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    move-result v1

    goto :goto_1

    .line 145
    :cond_7
    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v1

    :goto_1
    move v4, v1

    const/4 v9, 0x0

    move v1, v10

    const/16 v10, 0x60

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, p2

    move-object v2, v11

    move-object v3, v12

    move-object v5, v15

    .line 138
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt;->EmailCollection-7FxtGnE(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ILandroidx/compose/ui/focus/FocusRequester;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    .line 137
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move/from16 v10, p3

    move v9, v1

    goto :goto_4

    :cond_8
    move v1, v10

    const v2, 0x3fc17414

    .line 149
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v16, :cond_9

    .line 155
    invoke-virtual/range {v19 .. v19}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getInitialPhoneNumber()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_9

    const/4 v5, 0x1

    goto :goto_2

    :cond_9
    const/4 v5, 0x0

    :goto_2
    if-eqz p3, :cond_a

    .line 157
    sget-object v2, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    move-result v2

    goto :goto_3

    .line 159
    :cond_a
    sget-object v2, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v2

    :goto_3
    move v9, v2

    .line 156
    sget v2, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    shl-int/lit8 v11, v2, 0x3

    const/16 v12, 0x8c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    move-object v10, v6

    move-object/from16 v7, v17

    move-object/from16 v2, v19

    move/from16 v6, p3

    .line 150
    invoke-static/range {v1 .. v12}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI-Rts_TWA(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    move v10, v6

    move-object v6, v9

    move v9, v1

    .line 149
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 166
    :goto_4
    sget-object v1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v2, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v1, v6, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v2

    .line 167
    sget-object v1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v4, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v1, v6, v4}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v1

    .line 288
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    const/4 v7, 0x0

    const/16 v8, 0x9

    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 165
    invoke-static/range {v1 .. v8}, Landroidx/compose/material/DividerKt;->Divider-oMI9zvI(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    const v1, 0x2317315b

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz v10, :cond_b

    .line 173
    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v3

    const/16 v12, 0x180

    move-object v8, v13

    const/16 v13, 0x378

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v1, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v11, p2

    move v2, v1

    move-object/from16 v1, v20

    const/16 v18, 0x0

    .line 171
    invoke-static/range {v1 .. v13}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextField-ZkbtPhE(Lcom/stripe/android/uicore/elements/TextFieldController;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/ui/focus/FocusRequester;ZZLandroidx/compose/runtime/Composer;II)V

    move-object v6, v11

    goto :goto_5

    :cond_b
    const/16 v18, 0x0

    :goto_5
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz v14, :cond_c

    const/4 v2, 0x1

    goto :goto_6

    :cond_c
    move/from16 v2, v18

    .line 179
    :goto_6
    new-instance v1, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$2$1;

    invoke-direct {v1, v14}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$2$1;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x36

    const v4, 0x7436ffb6

    const/4 v5, 0x1

    invoke-static {v4, v5, v1, v6, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function3;

    const v9, 0x180006

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v8, p2

    move-object v1, v0

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 286
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 289
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 264
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 258
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 251
    invoke-static/range {p2 .. p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 292
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    return-void
.end method
