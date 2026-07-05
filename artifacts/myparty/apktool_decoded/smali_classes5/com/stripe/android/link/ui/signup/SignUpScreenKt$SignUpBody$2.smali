.class final Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;
.super Ljava/lang/Object;
.source "SignUpScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBody(Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpScreenState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,319:1\n149#2:320\n149#2:321\n149#2:322\n1225#3,6:323\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2\n*L\n101#1:320\n110#1:321\n144#1:322\n155#1:323,6\n*E\n"
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
.field final synthetic $emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $isSigningUp:Z

.field final synthetic $keyboardController:Landroidx/compose/ui/platform/SoftwareKeyboardController;

.field final synthetic $nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $onSignUpClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;


# direct methods
.method public static synthetic $r8$lambda$NsNf_08Yue32_ukcrfdQTAUZmxs(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(ZLcom/stripe/android/link/ui/signup/SignUpScreenState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lcom/stripe/android/uicore/elements/TextFieldController;Landroidx/compose/ui/focus/FocusRequester;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/platform/SoftwareKeyboardController;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            ")V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$isSigningUp:Z

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$keyboardController:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    iput-object p5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    iput-object p7, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p8, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Lkotlin/Unit;
    .locals 0

    .line 156
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 157
    invoke-interface {p1}, Landroidx/compose/ui/platform/SoftwareKeyboardController;->hide()V

    .line 158
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 96
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    const-string v2, "$this$ScrollableTopLevelColumn"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    .line 97
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    .line 159
    :cond_2
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 97
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous> (SignUpScreen.kt:96)"

    const v6, 0xd5ed933

    invoke-static {v6, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 98
    :cond_4
    sget v4, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_sign_up_header_v2:I

    const/4 v5, 0x0

    invoke-static {v4, v8, v5}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    .line 99
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    .line 100
    const-string v7, "signUpHeaderTag"

    invoke-static {v6, v7}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v3, v3

    .line 320
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    .line 101
    invoke-static {v6, v9, v7, v10, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 102
    sget-object v7, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    move-result v7

    .line 103
    sget-object v12, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    const/4 v13, 0x6

    invoke-virtual {v12, v8, v13}, Lcom/stripe/android/link/theme/LinkTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkTypography;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/link/theme/LinkTypography;->getTitle()Landroidx/compose/ui/text/TextStyle;

    move-result-object v22

    .line 104
    sget-object v12, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v12, v8, v13}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/link/theme/LinkColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v14

    .line 102
    invoke-static {v7}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    move-result-object v7

    const/16 v25, 0x0

    const v26, 0xfdf8

    move v12, v3

    move/from16 v16, v5

    move-object v3, v6

    move-wide/from16 v34, v14

    move v15, v2

    move-object v2, v4

    move-object v14, v7

    move-wide/from16 v4, v34

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    move/from16 v19, v12

    const-wide/16 v11, 0x0

    move/from16 v21, v13

    const/4 v13, 0x0

    move/from16 v23, v15

    move/from16 v24, v16

    const-wide/16 v15, 0x0

    move/from16 v27, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v24

    const/16 v24, 0x30

    move/from16 v27, v23

    move/from16 v1, v32

    move-object/from16 v23, p2

    .line 97
    invoke-static/range {v2 .. v26}, Landroidx/compose/material/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v23

    .line 107
    sget v2, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_sign_up_message_v2:I

    invoke-static {v2, v8, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    .line 108
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    .line 109
    invoke-static {v3, v5, v6, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 321
    invoke-static/range {v29 .. v29}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v11

    const/16 v3, 0x1e

    int-to-float v3, v3

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v13

    const/4 v14, 0x5

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    .line 110
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 111
    sget-object v7, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    move-result v7

    .line 112
    sget-object v9, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    const/4 v10, 0x6

    invoke-virtual {v9, v8, v10}, Lcom/stripe/android/link/theme/LinkTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkTypography;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/link/theme/LinkTypography;->getBody()Landroidx/compose/ui/text/TextStyle;

    move-result-object v22

    .line 113
    sget-object v9, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v9, v8, v10}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/link/theme/LinkColors;->getTextTertiary-0d7_KjU()J

    move-result-wide v9

    .line 111
    invoke-static {v7}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    move-result-object v14

    move/from16 v28, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v30, v4

    move/from16 v17, v5

    move-wide v4, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move/from16 v33, v17

    const/16 v17, 0x0

    move/from16 v1, v28

    .line 106
    invoke-static/range {v2 .. v26}, Landroidx/compose/material/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v23

    .line 115
    sget-object v2, Lcom/stripe/android/uicore/SectionStyle;->Bordered:Lcom/stripe/android/uicore/SectionStyle;

    new-instance v3, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;

    iget-object v4, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    iget-object v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v6, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$emailFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpScreenState;Lcom/stripe/android/uicore/elements/TextFieldController;Landroidx/compose/ui/focus/FocusRequester;)V

    const v4, 0x70357fbe

    const/16 v11, 0x36

    invoke-static {v4, v1, v3, v8, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x0

    invoke-static {v2, v3, v8, v11, v4}, Lcom/stripe/android/link/theme/ColorKt;->StripeThemeForLink(Lcom/stripe/android/uicore/SectionStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 125
    iget-boolean v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$isSigningUp:Z

    if-nez v2, :cond_5

    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->getErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    if-eqz v2, :cond_5

    move v2, v1

    goto :goto_3

    :cond_5
    move v2, v4

    .line 126
    :goto_3
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static {v3, v13, v1, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 127
    new-instance v5, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$2;

    iget-object v6, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-direct {v5, v6}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$2;-><init>(Lcom/stripe/android/link/ui/signup/SignUpScreenState;)V

    const v6, 0x6e6735b

    invoke-static {v6, v1, v5, v8, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lkotlin/jvm/functions/Function3;

    and-int/lit8 v14, v27, 0xe

    const v5, 0x180180

    or-int v9, v14, v5

    const/16 v10, 0x1c

    move/from16 v32, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v15, v1

    move-object/from16 v1, p1

    .line 124
    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 135
    iget-boolean v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$isSigningUp:Z

    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$3;

    iget-object v3, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v4, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-direct {v1, v3, v4, v5}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$3;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpScreenState;)V

    const v3, 0xb12d104

    invoke-static {v3, v15, v1, v8, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function3;

    const/high16 v1, 0x180000

    or-int v9, v14, v1

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 144
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/16 v2, 0x10

    int-to-float v2, v2

    .line 322
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 144
    invoke-static {v1, v13, v2, v15, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 145
    iget-boolean v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$isSigningUp:Z

    if-eqz v2, :cond_6

    const v2, 0x3e3a1620

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 146
    sget v2, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_sign_up:I

    const/4 v4, 0x0

    invoke-static {v2, v8, v4}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    .line 145
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    const v2, 0x3e3b5516

    .line 147
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 148
    sget v2, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_log_in_or_sign_up:I

    invoke-static {v2, v8, v4}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    .line 147
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 151
    :goto_4
    iget-object v3, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->isSubmitting()Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Lcom/stripe/android/link/ui/PrimaryButtonState;->Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_5

    .line 152
    :cond_7
    iget-object v3, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->getSignUpEnabled()Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_5

    .line 153
    :cond_8
    sget-object v3, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    :goto_5
    const v4, -0x16c41990

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v4, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$keyboardController:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    .line 155
    iget-object v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    iget-object v6, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2;->$keyboardController:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 323
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_9

    .line 324
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_a

    .line 155
    :cond_9
    new-instance v7, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$$ExternalSyntheticLambda0;

    invoke-direct {v7, v5, v6}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$2$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V

    .line 326
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 155
    :cond_a
    move-object v4, v7

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v8, 0x6

    const/16 v9, 0x30

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p2

    .line 143
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->PrimaryButton(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    return-void
.end method
