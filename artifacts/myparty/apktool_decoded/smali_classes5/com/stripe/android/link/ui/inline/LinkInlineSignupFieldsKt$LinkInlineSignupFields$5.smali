.class final Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;
.super Ljava/lang/Object;
.source "LinkInlineSignupFields.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt;->LinkInlineSignupFields(Ljava/lang/Integer;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZZZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V
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

.field final synthetic $didShowAllFields:Z

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
.method constructor <init>(ZLcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/uicore/elements/TextFieldController;Landroidx/compose/ui/focus/FocusRequester;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ZLcom/stripe/android/uicore/elements/TextFieldController;Landroidx/compose/ui/focus/FocusRequester;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "ZZ",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Landroidx/compose/ui/focus/FocusRequester;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$isShowingPhoneFirst:Z

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$allowsDefaultOptIn:Z

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$enabled:Z

    iput-object p5, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p6, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$phoneFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p7, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p8, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p9, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$errorMessage:Ljava/lang/String;

    iput-boolean p10, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$didShowAllFields:Z

    iput-object p11, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$onShowingAllFields:Lkotlin/jvm/functions/Function0;

    iput-boolean p12, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$requiresNameCollection:Z

    iput-object p13, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p14, p0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$nameFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 67
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 68
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 68
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous> (LinkInlineSignupFields.kt:67)"

    const v4, 0xcaf7f73

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-boolean v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$isShowingPhoneFirst:Z

    const/4 v13, 0x0

    if-eqz v1, :cond_5

    const v1, 0x6508c5e0

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 73
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    sget-object v2, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-ne v1, v2, :cond_3

    .line 74
    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    move-result v1

    goto :goto_1

    .line 76
    :cond_3
    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v1

    :goto_1
    move v9, v1

    .line 79
    iget-boolean v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$allowsDefaultOptIn:Z

    if-nez v1, :cond_4

    sget-object v1, Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupFieldsKt;->INSTANCE:Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupFieldsKt;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupFieldsKt;->getLambda-1$paymentsheet_release()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    move-object v8, v1

    goto :goto_2

    :cond_4
    move-object v8, v13

    .line 70
    :goto_2
    iget-boolean v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$enabled:Z

    .line 71
    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    .line 78
    iget-object v7, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$phoneFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    .line 73
    sget v3, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    const/high16 v4, 0x30000

    or-int v11, v3, v4

    const/16 v12, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object/from16 v10, p1

    .line 69
    invoke-static/range {v1 .. v12}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI-Rts_TWA(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;II)V

    move-object v7, v10

    .line 68
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_5

    :cond_5
    const v1, 0x651312ef

    .line 87
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 89
    iget-boolean v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$enabled:Z

    .line 90
    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 91
    iget-object v3, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    .line 92
    sget-object v4, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-ne v3, v4, :cond_6

    .line 93
    sget-object v4, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    move-result v4

    goto :goto_3

    .line 95
    :cond_6
    sget-object v4, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v4

    .line 97
    :goto_3
    iget-object v5, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    .line 98
    iget-boolean v6, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$allowsDefaultOptIn:Z

    if-nez v6, :cond_7

    sget-object v6, Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupFieldsKt;->INSTANCE:Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupFieldsKt;

    invoke-virtual {v6}, Lcom/stripe/android/link/ui/inline/ComposableSingletons$LinkInlineSignupFieldsKt;->getLambda-2$paymentsheet_release()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    goto :goto_4

    :cond_7
    move-object v6, v13

    :goto_4
    const/4 v9, 0x0

    const/16 v10, 0x20

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v8, p1

    .line 88
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/link/ui/inline/LinkOptionalInlineSignupKt;->EmailCollection-7FxtGnE(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ILandroidx/compose/ui/focus/FocusRequester;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    .line 87
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 109
    :goto_5
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    sget-object v2, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v1, v2, :cond_8

    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$errorMessage:Ljava/lang/String;

    if-eqz v1, :cond_8

    move v1, v11

    goto :goto_6

    :cond_8
    move v1, v10

    .line 110
    :goto_6
    new-instance v2, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$1;

    iget-object v3, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$errorMessage:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$1;-><init>(Ljava/lang/String;)V

    const v3, 0x46228d9b

    const/16 v12, 0x36

    invoke-static {v3, v11, v2, v7, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function3;

    const/high16 v8, 0x30000

    const/16 v9, 0x1e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 108
    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 120
    iget-boolean v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$didShowAllFields:Z

    if-nez v1, :cond_a

    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    sget-object v2, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-ne v1, v2, :cond_9

    goto :goto_7

    :cond_9
    move v1, v10

    goto :goto_8

    :cond_a
    :goto_7
    move v1, v11

    .line 121
    :goto_8
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v3, 0x0

    invoke-static {v2, v3, v11, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 122
    new-instance v13, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;

    iget-object v14, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$onShowingAllFields:Lkotlin/jvm/functions/Function0;

    iget-boolean v15, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$isShowingPhoneFirst:Z

    iget-boolean v3, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$enabled:Z

    iget-object v4, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v5, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-boolean v6, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$requiresNameCollection:Z

    iget-object v8, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iget-boolean v9, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$allowsDefaultOptIn:Z

    iget-object v10, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v11, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$phoneFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iget-object v12, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    move/from16 v27, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$nameFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5;->$errorMessage:Ljava/lang/String;

    move-object/from16 v26, v1

    move/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move/from16 v19, v6

    move-object/from16 v20, v8

    move/from16 v21, v9

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    invoke-direct/range {v13 .. v26}, Lcom/stripe/android/link/ui/inline/LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2;-><init>(Lkotlin/jvm/functions/Function0;ZZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZLandroidx/compose/ui/focus/FocusRequester;ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/uicore/elements/TextFieldController;Landroidx/compose/ui/focus/FocusRequester;Ljava/lang/String;)V

    const v1, 0xf097bc4

    const/16 v3, 0x36

    const/4 v4, 0x1

    invoke-static {v1, v4, v13, v7, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function3;

    const v8, 0x30030

    const/16 v9, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v1, v27

    .line 119
    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    return-void
.end method
