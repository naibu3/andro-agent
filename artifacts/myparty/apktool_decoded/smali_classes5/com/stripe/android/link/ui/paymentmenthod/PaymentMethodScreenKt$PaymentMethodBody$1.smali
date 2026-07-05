.class final Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;
.super Ljava/lang/Object;
.source "PaymentMethodScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt;->PaymentMethodBody(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nPaymentMethodScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodScreen.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,84:1\n149#2:85\n1225#3,6:86\n*S KotlinDebug\n*F\n+ 1 PaymentMethodScreen.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1\n*L\n71#1:85\n74#1:86,6\n*E\n"
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
.field final synthetic $focusManager:Landroidx/compose/ui/focus/FocusManager;

.field final synthetic $onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPayClicked:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

.field final synthetic $uuid:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$oJiVUYgZUnaOjLuQp-c4fCUTQ_s(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->invoke$lambda$1$lambda$0(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;",
            "Landroidx/compose/ui/focus/FocusManager;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$onPayClicked:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$uuid:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 75
    invoke-static {p0, v2, v0, v1}, Landroidx/compose/ui/focus/FocusManager;->clearFocus$default(Landroidx/compose/ui/focus/FocusManager;ZILjava/lang/Object;)V

    .line 76
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 77
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 46
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move-object/from16 v6, p2

    const-string v0, "$this$ScrollableTopLevelColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {v6, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    .line 47
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    .line 79
    :cond_2
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 47
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.link.ui.paymentmenthod.PaymentMethodBody.<anonymous> (PaymentMethodScreen.kt:46)"

    const v3, -0xd570f91

    invoke-static {v3, v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    new-instance v1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;

    iget-object v2, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$uuid:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    iget-object v4, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$1;-><init>(Ljava/lang/String;Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lkotlin/jvm/functions/Function1;)V

    const v2, -0x3214b1fc

    const/4 v10, 0x1

    const/16 v3, 0x36

    invoke-static {v2, v10, v1, v6, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/16 v2, 0x30

    const/4 v11, 0x0

    invoke-static {v11, v1, v6, v2, v10}, Lcom/stripe/android/link/theme/ColorKt;->StripeThemeForLink(Lcom/stripe/android/uicore/SectionStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 58
    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->getErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    const/4 v12, 0x0

    if-eqz v1, :cond_5

    move v1, v10

    goto :goto_3

    :cond_5
    move v1, v12

    .line 59
    :goto_3
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v13, 0x0

    invoke-static {v2, v13, v10, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 60
    new-instance v4, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$2;

    iget-object v5, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-direct {v4, v5}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$2;-><init>(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;)V

    const v5, 0x339ea547

    invoke-static {v5, v10, v4, v6, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function3;

    and-int/lit8 v0, v0, 0xe

    const v4, 0x180180

    or-int v8, v0, v4

    const/16 v9, 0x1c

    move-object v6, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object/from16 v7, p2

    .line 57
    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v7

    .line 71
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p1, Landroidx/compose/ui/Modifier;

    const/16 v0, 0x10

    int-to-float v0, v0

    .line 85
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 71
    invoke-static {p1, v13, v0, v10, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 72
    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->getPrimaryButtonLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-static {p1, v6, v12}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    .line 73
    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v2

    const p1, 0x29f521a4

    invoke-interface {v6, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    invoke-interface {v6, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p1

    iget-object v3, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$onPayClicked:Lkotlin/jvm/functions/Function0;

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p1, v3

    .line 74
    iget-object v3, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    iget-object v4, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->$onPayClicked:Lkotlin/jvm/functions/Function0;

    .line 86
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez p1, :cond_6

    .line 87
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne v5, p1, :cond_7

    .line 74
    :cond_6
    new-instance v5, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$$ExternalSyntheticLambda0;

    invoke-direct {v5, v3, v4}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;)V

    .line 89
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 74
    :cond_7
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 78
    sget p1, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_lock:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x6

    const/16 v8, 0x10

    const/4 v4, 0x0

    .line 70
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->PrimaryButton(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_8
    return-void
.end method
