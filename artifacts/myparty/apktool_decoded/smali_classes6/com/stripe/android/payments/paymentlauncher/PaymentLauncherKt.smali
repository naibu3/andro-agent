.class public final Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherKt;
.super Ljava/lang/Object;
.source "PaymentLauncher.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLauncher.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,179:1\n1225#2,6:180\n1225#2,6:186\n1225#2,6:192\n*S KotlinDebug\n*F\n+ 1 PaymentLauncher.kt\ncom/stripe/android/payments/paymentlauncher/PaymentLauncherKt\n*L\n163#1:180,6\n169#1:186,6\n172#1:192,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "rememberPaymentLauncher",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "publishableKey",
        "",
        "stripeAccountId",
        "callback",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "payments-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final rememberPaymentLauncher(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 6

    const-string v0, "publishableKey"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7c89651d

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 p5, p5, 0x2

    const/4 v1, 0x0

    if-eqz p5, :cond_0

    move-object p1, v1

    .line 158
    :cond_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p5

    if-eqz p5, :cond_1

    const/4 p5, -0x1

    const-string v2, "com.stripe.android.payments.paymentlauncher.rememberPaymentLauncher (PaymentLauncher.kt:159)"

    .line 160
    invoke-static {v0, p4, p5, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    const/4 p5, 0x0

    .line 161
    invoke-static {p3, p5}, Lcom/stripe/android/utils/ComposeUtilsKt;->rememberActivityOrNull(Landroidx/compose/runtime/Composer;I)Landroid/app/Activity;

    move-result-object v0

    const v2, 0x65bd2469

    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit16 v2, p4, 0x380

    xor-int/lit16 v2, v2, 0x180

    const/16 v3, 0x100

    const/4 v4, 0x1

    if-le v2, v3, :cond_2

    .line 163
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    and-int/lit16 v2, p4, 0x180

    if-ne v2, v3, :cond_4

    :cond_3
    move v2, v4

    goto :goto_0

    :cond_4
    move v2, p5

    .line 180
    :goto_0
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    .line 181
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_6

    .line 164
    :cond_5
    invoke-static {p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherUtilsKt;->toInternalResultCallback(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;

    move-result-object v3

    .line 183
    invoke-interface {p3, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 163
    :cond_6
    check-cast v3, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 168
    new-instance p2, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    check-cast p2, Landroidx/activity/result/contract/ActivityResultContract;

    const v2, 0x65bd3b24

    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p3, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    .line 186
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_7

    .line 187
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_8

    .line 169
    :cond_7
    new-instance v2, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1;

    invoke-direct {v2, v3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lkotlin/reflect/KFunction;

    .line 189
    invoke-interface {p3, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 169
    :cond_8
    check-cast v5, Lkotlin/reflect/KFunction;

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 167
    invoke-static {p2, v5, p3, p5}, Landroidx/activity/compose/ActivityResultRegistryKt;->rememberLauncherForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;

    move-result-object p2

    const v2, 0x65bd4280

    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v2, p4, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    if-le v2, v3, :cond_9

    .line 172
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_9
    and-int/lit8 v2, p4, 0x6

    if-ne v2, v3, :cond_b

    :cond_a
    move v2, v4

    goto :goto_1

    :cond_b
    move v2, p5

    :goto_1
    and-int/lit8 v3, p4, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v5, 0x20

    if-le v3, v5, :cond_c

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    and-int/lit8 p4, p4, 0x30

    if-ne p4, v5, :cond_e

    :cond_d
    move p5, v4

    :cond_e
    or-int p4, v2, p5

    .line 192
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_f

    .line 193
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p4

    if-ne p5, p4, :cond_11

    .line 173
    :cond_f
    new-instance p4, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;

    .line 174
    check-cast p2, Landroidx/activity/result/ActivityResultLauncher;

    if-eqz v0, :cond_10

    .line 175
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p5

    if-eqz p5, :cond_10

    invoke-virtual {p5}, Landroid/view/Window;->getStatusBarColor()I

    move-result p5

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 173
    :cond_10
    invoke-direct {p4, p2, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;-><init>(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/Integer;)V

    .line 176
    invoke-virtual {p4, p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherFactory;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p5

    .line 195
    invoke-interface {p3, p5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 172
    :cond_11
    check-cast p5, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_12

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_12
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p5
.end method
