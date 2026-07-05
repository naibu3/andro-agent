.class final Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$2;
.super Ljava/lang/Object;
.source "PaymentMethodScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nPaymentMethodScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodScreen.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,84:1\n149#2:85\n*S KotlinDebug\n*F\n+ 1 PaymentMethodScreen.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$2\n*L\n65#1:85\n*E\n"
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
.field final synthetic $state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$2;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 60
    check-cast p1, Landroidx/compose/animation/AnimatedVisibilityScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$2;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    const-string v0, "$this$AnimatedVisibility"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.paymentmenthod.PaymentMethodBody.<anonymous>.<anonymous> (PaymentMethodScreen.kt:60)"

    const v2, 0x339ea547

    move/from16 v3, p3

    .line 61
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 62
    :cond_0
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 63
    const-string v1, "payment_method_error_tag"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 64
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v0, 0x10

    int-to-float v0, v0

    .line 85
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 65
    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 v0, p0

    .line 66
    iget-object v1, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodScreenKt$PaymentMethodBody$1$2;->$state:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->getErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    if-nez v1, :cond_1

    move-object/from16 v14, p2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    move-object/from16 v14, p2

    invoke-static {v1, v14, v2}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    if-nez v3, :cond_2

    const-string v3, ""

    :cond_2
    move-object v11, v3

    const/16 v15, 0x30

    const/16 v16, 0x4

    const/4 v13, 0x0

    .line 61
    invoke-static/range {v11 .. v16}, Lcom/stripe/android/link/ui/ErrorTextKt;->ErrorText(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/ui/ErrorTextStyle;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
