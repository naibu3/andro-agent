.class final Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;
.super Ljava/lang/Object;
.source "SignUpScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SecondaryFields(Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpScreenState;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,319:1\n149#2:320\n149#2:333\n149#2:334\n1225#3,6:321\n1225#3,6:327\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1\n*L\n228#1:320\n245#1:333\n261#1:334\n229#1:321,6\n244#1:327,6\n*E\n"
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
.field final synthetic $emailFocused$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $nameFocused$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;


# direct methods
.method public static synthetic $r8$lambda$9S8aZqa4B78fBdHFYVSj3qodwPw(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$DhDTZI_zCV87s6EeOmypijUa2o8(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->invoke$lambda$3$lambda$2(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/link/ui/signup/SignUpScreenState;Lcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/runtime/MutableState;Lcom/stripe/android/uicore/elements/TextFieldController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$emailFocused$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$nameFocused$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    invoke-interface {p1}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    move-result p1

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->access$SecondaryFields$lambda$23(Landroidx/compose/runtime/MutableState;Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/focus/FocusState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    invoke-interface {p1}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    move-result p1

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->access$SecondaryFields$lambda$27(Landroidx/compose/runtime/MutableState;Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 225
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 226
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 264
    :cond_0
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 226
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.signup.SecondaryFields.<anonymous>.<anonymous> (SignUpScreen.kt:225)"

    const v5, 0x174daab6

    invoke-static {v5, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 227
    :cond_2
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/4 v2, 0x4

    int-to-float v2, v2

    .line 320
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/4 v3, 0x0

    .line 228
    invoke-static {v1, v14, v2, v15, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v2, 0x63dfb9ed

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$emailFocused$delegate:Landroidx/compose/runtime/MutableState;

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 229
    iget-object v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$emailFocused$delegate:Landroidx/compose/runtime/MutableState;

    .line 321
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_3

    .line 322
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_4

    .line 229
    :cond_3
    new-instance v6, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 324
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 229
    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v1, v6}, Landroidx/compose/ui/focus/FocusChangedModifierKt;->onFocusChanged(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 230
    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->getCanEditForm()Z

    move-result v2

    .line 231
    iget-object v5, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$emailFocused$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v5}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->access$SecondaryFields$lambda$22(Landroidx/compose/runtime/MutableState;)Z

    move-result v5

    .line 233
    iget-object v6, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getInitialPhoneNumber()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_5

    move v7, v15

    goto :goto_1

    :cond_5
    const/4 v6, 0x0

    move v7, v6

    .line 234
    :goto_1
    iget-object v6, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {v6}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->getRequiresNameCollection()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 235
    sget-object v6, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    move-result v6

    goto :goto_2

    .line 237
    :cond_6
    sget-object v6, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v6

    :goto_2
    move v10, v6

    move-object v6, v3

    move-object v3, v1

    move v1, v2

    .line 232
    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    .line 234
    sget v8, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    shl-int/lit8 v12, v8, 0x3

    const/16 v13, 0x1a8

    const/4 v4, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object/from16 v11, p1

    .line 226
    invoke-static/range {v1 .. v13}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionSection-fhH9uAM(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLjava/lang/Integer;ZZLandroidx/compose/ui/focus/FocusRequester;ILandroidx/compose/runtime/Composer;II)V

    move-object v4, v11

    const v1, 0x63dffb8b

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 241
    iget-object v1, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->getRequiresNameCollection()Z

    move-result v1

    const/16 v9, 0x8

    if-eqz v1, :cond_9

    .line 243
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const v2, 0x63e00d2c

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$nameFocused$delegate:Landroidx/compose/runtime/MutableState;

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 244
    iget-object v3, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$nameFocused$delegate:Landroidx/compose/runtime/MutableState;

    .line 327
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_7

    .line 328
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_8

    .line 244
    :cond_7
    new-instance v5, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1$$ExternalSyntheticLambda1;

    invoke-direct {v5, v3}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1$$ExternalSyntheticLambda1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 330
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 244
    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v1, v5}, Landroidx/compose/ui/focus/FocusChangedModifierKt;->onFocusChanged(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v2, v9

    .line 333
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    const/4 v11, 0x0

    .line 245
    invoke-static {v1, v14, v2, v15, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 246
    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$nameFocused$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->access$SecondaryFields$lambda$26(Landroidx/compose/runtime/MutableState;)Z

    move-result v3

    .line 247
    iget-object v2, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 248
    new-instance v5, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1$3;

    iget-object v6, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$signUpScreenState:Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    iget-object v7, v0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    invoke-direct {v5, v6, v7}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SecondaryFields$1$1$3;-><init>(Lcom/stripe/android/link/ui/signup/SignUpScreenState;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    const/16 v6, 0x36

    const v7, -0x2b6abb06

    invoke-static {v7, v15, v5, v4, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/16 v7, 0x6000

    const/16 v8, 0x8

    const/4 v4, 0x0

    move-object/from16 v6, p1

    .line 242
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldSection(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/TextFieldController;ZLjava/lang/Integer;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_9
    const/4 v11, 0x0

    :goto_3
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 259
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 260
    invoke-static {v1, v14, v15, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v1, v9

    .line 334
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 261
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 262
    sget-object v1, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    move-result v3

    .line 263
    sget-object v1, Lcom/stripe/android/link/ui/LinkTermsType;->Full:Lcom/stripe/android/link/ui/LinkTermsType;

    const/16 v5, 0x36

    const/4 v6, 0x0

    move-object/from16 v4, p1

    .line 258
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/ui/LinkTermsKt;->LinkTerms-8iNrtrE(Lcom/stripe/android/link/ui/LinkTermsType;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_a
    return-void
.end method
