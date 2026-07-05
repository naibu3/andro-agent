.class public final Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;
.super Ljava/lang/Object;
.source "GooglePayButton.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGooglePayButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButtonKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n77#2:241\n77#2:242\n77#2:256\n77#2:258\n1225#3,6:243\n1225#3,6:249\n1225#3,6:259\n1225#3,6:265\n149#4:255\n1#5:257\n*S KotlinDebug\n*F\n+ 1 GooglePayButton.kt\ncom/stripe/android/paymentsheet/ui/GooglePayButtonKt\n*L\n42#1:241\n43#1:242\n189#1:256\n190#1:258\n45#1:243,6\n74#1:249,6\n194#1:259,6\n206#1:265,6\n186#1:255\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u001aY\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\u00012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u0013\u001a\u000c\u0010\u0014\u001a\u00020\u0015*\u00020\u0007H\u0002\u001ac\u0010\u001c\u001a\u00020\u00012\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000c2\u0006\u0010\u001e\u001a\u00020\u00172\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010!\u001a\u00020\u00152\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010#2\u0008\u0008\u0002\u0010$\u001a\u00020#2\u0008\u0008\u0002\u0010%\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008&\u0010\'\u001a\u0016\u0010(\u001a\u0004\u0018\u00010)*\u00020*2\u0006\u0010+\u001a\u00020,H\u0002\"\u0010\u0010\u0016\u001a\u00020\u00178\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0017X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "GooglePayButton",
        "",
        "state",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
        "allowCreditCards",
        "",
        "buttonType",
        "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;",
        "billingAddressParameters",
        "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;",
        "isEnabled",
        "onPressed",
        "Lkotlin/Function0;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;Landroidx/compose/runtime/Composer;II)V",
        "GooglePrimaryButton",
        "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;Landroidx/compose/runtime/Composer;II)V",
        "toComposeButtonType",
        "Lcom/stripe/android/paymentsheet/ui/ButtonType;",
        "GOOGLE_PAY_BUTTON_TEST_TAG",
        "",
        "GOOGLE_PAY_PRIMARY_BUTTON_TEST_TAG",
        "FULL_ALPHA",
        "",
        "HALF_ALPHA",
        "PayButton",
        "onClick",
        "allowedPaymentMethods",
        "theme",
        "Lcom/stripe/android/paymentsheet/ui/ButtonTheme;",
        "type",
        "height",
        "Landroidx/compose/ui/unit/Dp;",
        "radius",
        "enabled",
        "PayButton-EKdrzYM",
        "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZLandroidx/compose/runtime/Composer;II)V",
        "nestedView",
        "Landroid/view/View;",
        "Landroid/view/ViewGroup;",
        "depth",
        "",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final FULL_ALPHA:F = 1.0f

.field public static final GOOGLE_PAY_BUTTON_TEST_TAG:Ljava/lang/String; = "google-pay-button"

.field public static final GOOGLE_PAY_PRIMARY_BUTTON_TEST_TAG:Ljava/lang/String; = "google-pay-primary-button"

.field private static final HALF_ALPHA:F = 0.5f


# direct methods
.method public static synthetic $r8$lambda$0RXbCeONhSdasIZGU5fCE21Y7tI(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->PayButton_EKdrzYM$lambda$15$lambda$14$lambda$13$lambda$12(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$7Q1QRk-koDXaKbUrscqPiYyS0Jo(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p11}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->PayButton_EKdrzYM$lambda$16(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$8pb1tqwq484Wm1h7jOh1wiYAEyk(Lkotlin/jvm/functions/Function0;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePayButton$lambda$3$lambda$2$lambda$1(Lkotlin/jvm/functions/Function0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$9cXKkQj5pRALnmCYH2jyqS0l4-o(Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;ILjava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/wallet/button/PayButton;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->PayButton_EKdrzYM$lambda$10$lambda$9(Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;ILjava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/wallet/button/PayButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$KGNpBpGOoYNcBTic8RvMAxtXzno(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePayButton$lambda$3$lambda$2(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$N0-Sjo9vbSB_uhJtxz8Hfg2VGmM(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p11}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePayButton$lambda$4(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nPE0v8ZmnHWQghnpJwvRAYkgFNE(ZLjava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/google/android/gms/wallet/button/PayButton;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->PayButton_EKdrzYM$lambda$15$lambda$14(ZLjava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/google/android/gms/wallet/button/PayButton;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$rBw2UCSHUY6vBfdTs7GnKngxewE(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePrimaryButton$lambda$5(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final GooglePayButton(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
            "Z",
            "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;",
            "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v5, p3

    move-object/from16 v0, p5

    move-object/from16 v8, p7

    move/from16 v2, p9

    move/from16 v15, p10

    const-string v4, "buttonType"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onPressed"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "cardBrandFilter"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x60f24c79    # -3.0006413E-20f

    move-object/from16 v6, p8

    .line 41
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v6, v15, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v6, v2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v2, 0x6

    if-nez v6, :cond_2

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v2

    goto :goto_1

    :cond_2
    move v6, v2

    :goto_1
    and-int/lit8 v7, v15, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    move/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v2, 0x30

    move/from16 v13, p1

    if-nez v7, :cond_5

    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v15, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v2, 0x180

    if-nez v7, :cond_8

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, v15, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v6, v6, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v2, 0xc00

    if-nez v7, :cond_c

    and-int/lit16 v7, v2, 0x1000

    if-nez v7, :cond_a

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_6

    :cond_a
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    :goto_6
    if-eqz v7, :cond_b

    const/16 v7, 0x800

    goto :goto_7

    :cond_b
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v6, v7

    :cond_c
    :goto_8
    and-int/lit8 v7, v15, 0x10

    if-eqz v7, :cond_d

    or-int/lit16 v6, v6, 0x6000

    move/from16 v14, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v7, v2, 0x6000

    move/from16 v14, p4

    if-nez v7, :cond_f

    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_e

    const/16 v7, 0x4000

    goto :goto_9

    :cond_e
    const/16 v7, 0x2000

    :goto_9
    or-int/2addr v6, v7

    :cond_f
    :goto_a
    and-int/lit8 v7, v15, 0x20

    const/high16 v16, 0x30000

    if-eqz v7, :cond_10

    or-int v6, v6, v16

    goto :goto_c

    :cond_10
    and-int v7, v2, v16

    if-nez v7, :cond_12

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    const/high16 v7, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v7, 0x10000

    :goto_b
    or-int/2addr v6, v7

    :cond_12
    :goto_c
    and-int/lit8 v7, v15, 0x40

    const/high16 v16, 0x180000

    if-eqz v7, :cond_13

    or-int v6, v6, v16

    move-object/from16 v11, p6

    goto :goto_e

    :cond_13
    and-int v16, v2, v16

    move-object/from16 v11, p6

    if-nez v16, :cond_15

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x100000

    goto :goto_d

    :cond_14
    const/high16 v16, 0x80000

    :goto_d
    or-int v6, v6, v16

    :cond_15
    :goto_e
    and-int/lit16 v9, v15, 0x80

    const/high16 v17, 0xc00000

    if-eqz v9, :cond_16

    or-int v6, v6, v17

    goto :goto_10

    :cond_16
    and-int v9, v2, v17

    if-nez v9, :cond_18

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_17

    const/high16 v9, 0x800000

    goto :goto_f

    :cond_17
    const/high16 v9, 0x400000

    :goto_f
    or-int/2addr v6, v9

    :cond_18
    :goto_10
    const v9, 0x492493

    and-int/2addr v9, v6

    const v10, 0x492492

    if-ne v9, v10, :cond_1a

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v9

    if-nez v9, :cond_19

    goto :goto_11

    .line 96
    :cond_19
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v7, v11

    goto/16 :goto_1e

    :cond_1a
    :goto_11
    if-eqz v7, :cond_1b

    .line 39
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v7, Landroidx/compose/ui/Modifier;

    goto :goto_12

    :cond_1b
    move-object v7, v11

    :goto_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_1c

    const/4 v9, -0x1

    const-string v10, "com.stripe.android.paymentsheet.ui.GooglePayButton (GooglePayButton.kt:40)"

    .line 41
    invoke-static {v4, v6, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 42
    :cond_1c
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v4

    check-cast v4, Landroidx/compose/runtime/CompositionLocal;

    const v9, 0x789c5f52

    .line 241
    const-string v10, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v12, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 42
    check-cast v4, Landroid/content/Context;

    .line 43
    invoke-static {}, Landroidx/compose/ui/platform/InspectionModeKt;->getLocalInspectionMode()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v11

    check-cast v11, Landroidx/compose/runtime/CompositionLocal;

    .line 242
    invoke-static {v12, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 43
    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    const v10, 0x2f38c3c3

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 46
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    .line 47
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v11

    or-int/2addr v10, v11

    and-int/lit16 v11, v6, 0x1c00

    const/16 v8, 0x800

    if-eq v11, v8, :cond_1e

    and-int/lit16 v8, v6, 0x1000

    if-eqz v8, :cond_1d

    .line 48
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1d

    goto :goto_13

    :cond_1d
    const/4 v8, 0x0

    goto :goto_14

    :cond_1e
    :goto_13
    const/4 v8, 0x1

    :goto_14
    or-int/2addr v8, v10

    and-int/lit8 v10, v6, 0x70

    const/16 v11, 0x20

    if-ne v10, v11, :cond_1f

    const/4 v10, 0x1

    goto :goto_15

    :cond_1f
    const/4 v10, 0x0

    :goto_15
    or-int/2addr v8, v10

    .line 243
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_21

    .line 244
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_20

    goto :goto_16

    :cond_20
    move/from16 v16, v6

    move-object v14, v7

    move-object v2, v10

    const/4 v3, 0x1

    const/4 v10, 0x0

    goto :goto_18

    :cond_21
    :goto_16
    if-eqz v9, :cond_22

    .line 52
    const-string v4, ""

    move-object v2, v4

    move/from16 v16, v6

    move-object v14, v7

    const/4 v3, 0x1

    const/4 v10, 0x0

    goto :goto_17

    .line 54
    :cond_22
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    move v9, v6

    .line 55
    new-instance v6, Lcom/stripe/android/GooglePayJsonFactory;

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object v14, v7

    move-object/from16 v2, v16

    const/4 v3, 0x1

    move-object v7, v4

    move/from16 v16, v9

    const/4 v4, 0x0

    move-object/from16 v9, p7

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/GooglePayJsonFactory;-><init>(Landroid/content/Context;ZLcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const/4 v8, 0x4

    const/4 v9, 0x0

    move v10, v4

    move-object v4, v6

    move-object v6, v7

    const/4 v7, 0x0

    .line 55
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/GooglePayJsonFactory;->createCardPaymentMethod$default(Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;ZILjava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    .line 54
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    .line 59
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    .line 53
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 246
    :goto_17
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 45
    :goto_18
    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 63
    invoke-static {v12, v10}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 64
    sget-object v2, Lcom/stripe/android/paymentsheet/ui/ButtonTheme;->Light:Lcom/stripe/android/paymentsheet/ui/ButtonTheme;

    goto :goto_19

    .line 66
    :cond_23
    sget-object v2, Lcom/stripe/android/paymentsheet/ui/ButtonTheme;->Dark:Lcom/stripe/android/paymentsheet/ui/ButtonTheme;

    :goto_19
    move-object v7, v2

    if-eqz v1, :cond_27

    .line 71
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    if-eqz v2, :cond_24

    goto :goto_1b

    .line 90
    :cond_24
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    if-nez v2, :cond_26

    .line 91
    instance-of v2, v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    if-eqz v2, :cond_25

    goto :goto_1a

    :cond_25
    const v0, 0x2f391486

    .line 69
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_26
    :goto_1a
    const v2, 0x2f397503

    .line 91
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    shr-int/lit8 v2, v16, 0x12

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v3, v16, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    invoke-static {v14, v1, v12, v2, v10}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePrimaryButton(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v0, v14

    goto/16 :goto_1d

    :cond_27
    :goto_1b
    const v2, -0x4815987b

    .line 71
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 73
    invoke-static {v14, v2, v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v4, 0x2f3926f2

    .line 74
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/high16 v4, 0x70000

    and-int v4, v16, v4

    const/high16 v6, 0x20000

    if-ne v4, v6, :cond_28

    move v8, v3

    goto :goto_1c

    :cond_28
    move v8, v10

    .line 249
    :goto_1c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v8, :cond_29

    .line 250
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_2a

    .line 74
    :cond_29
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda6;

    invoke-direct {v4, v0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda6;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 252
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 74
    :cond_2a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v6, 0x0

    invoke-static {v2, v10, v4, v3, v6}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 81
    const-string v3, "google-pay-button"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 83
    invoke-static/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->toComposeButtonType(Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;)Lcom/stripe/android/paymentsheet/ui/ButtonType;

    move-result-object v8

    .line 85
    sget-object v2, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;

    const/4 v3, 0x6

    invoke-virtual {v2, v12, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->getShape(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getCornerRadius-D9Ej5fM()F

    move-result v10

    .line 86
    sget-object v2, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;

    invoke-virtual {v2, v12, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->getShape(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getHeight-D9Ej5fM()F

    move-result v2

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    move-result-object v9

    shr-int/lit8 v2, v16, 0xf

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v3, v16, 0x9

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    move-object v11, v14

    const/4 v14, 0x0

    move-object v4, v0

    move v13, v2

    move-object v0, v11

    move/from16 v11, p4

    .line 71
    invoke-static/range {v4 .. v14}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->PayButton-EKdrzYM(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZLandroidx/compose/runtime/Composer;II)V

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 69
    :goto_1d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2b
    move-object v7, v0

    .line 96
    :goto_1e
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_2c

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda7;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p9

    move v10, v15

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda7;-><init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;II)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2c
    return-void
.end method

.method private static final GooglePayButton$lambda$3$lambda$2(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function0;)V

    const/4 p0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p0, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onClick$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 80
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final GooglePayButton$lambda$3$lambda$2$lambda$1(Lkotlin/jvm/functions/Function0;)Z
    .locals 0

    .line 76
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method

.method private static final GooglePayButton$lambda$4(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v10

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePayButton(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final GooglePrimaryButton(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, 0xc4c04a8

    move-object/from16 v4, p2

    .line 102
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v5, v1, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v6, 0x13

    const/16 v9, 0x12

    if-ne v7, v9, :cond_7

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    .line 139
    :cond_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v11, v5

    goto :goto_7

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    .line 100
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v11, v4

    goto :goto_5

    :cond_8
    move-object v11, v5

    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.ui.GooglePrimaryButton (GooglePayButton.kt:101)"

    .line 102
    invoke-static {v3, v6, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 103
    :cond_9
    instance-of v3, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    if-eqz v3, :cond_a

    .line 104
    sget-object v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Completed;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Completed;

    check-cast v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    goto :goto_6

    .line 106
    :cond_a
    sget-object v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;

    check-cast v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;

    .line 110
    :goto_6
    new-instance v12, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    .line 112
    sget v4, Lcom/stripe/android/paymentsheet/R$color;->stripe_paymentsheet_googlepay_primary_button_background_color:I

    const/4 v5, 0x0

    .line 111
    invoke-static {v4, v8, v5}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    .line 115
    sget v4, Lcom/stripe/android/paymentsheet/R$color;->stripe_paymentsheet_googlepay_primary_button_tint_color:I

    .line 114
    invoke-static {v4, v8, v5}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    .line 118
    sget v4, Lcom/stripe/android/paymentsheet/R$color;->stripe_paymentsheet_googlepay_primary_button_background_color:I

    .line 117
    invoke-static {v4, v8, v5}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    .line 121
    sget v4, Lcom/stripe/android/paymentsheet/R$color;->stripe_paymentsheet_googlepay_primary_button_tint_color:I

    .line 120
    invoke-static {v4, v8, v5}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    move-result-wide v19

    const/16 v23, 0x10

    const/16 v24, 0x0

    const-wide/16 v21, 0x0

    .line 110
    invoke-direct/range {v12 .. v24}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;-><init>(JJJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 124
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePrimaryButton$1;

    invoke-direct {v4, v11, v3, v0}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$GooglePrimaryButton$1;-><init>(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    const/16 v3, 0x36

    const v5, -0x4631725d

    const/4 v6, 0x1

    invoke-static {v5, v6, v4, v8, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/16 v9, 0xc00

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, v12

    .line 109
    invoke-static/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt;->PrimaryButtonTheme(Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 139
    :cond_b
    :goto_7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda0;

    invoke-direct {v4, v11, v0, v1, v2}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;II)V

    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_c
    return-void
.end method

.method private static final GooglePrimaryButton$lambda$5(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->GooglePrimaryButton(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final PayButton-EKdrzYM(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZLandroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/stripe/android/paymentsheet/ui/ButtonTheme;",
            "Lcom/stripe/android/paymentsheet/ui/ButtonType;",
            "Landroidx/compose/ui/unit/Dp;",
            "FZ",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, 0x117e72b8

    move-object/from16 v3, p8

    .line 188
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    and-int/lit8 v4, v10, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v9, 0x6

    if-nez v4, :cond_2

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move v4, v9

    :goto_1
    and-int/lit8 v6, v10, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_5

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v10, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v9, 0x180

    if-nez v8, :cond_8

    move-object/from16 v8, p2

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v4, v11

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v8, p2

    :goto_6
    and-int/lit8 v11, v10, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_b

    move-object/from16 v13, p3

    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_7

    :cond_a
    const/16 v14, 0x400

    :goto_7
    or-int/2addr v4, v14

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v13, p3

    :goto_9
    and-int/lit8 v14, v10, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v4, v4, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v5, v9, 0x6000

    if-nez v5, :cond_e

    move-object/from16 v5, p4

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_a

    :cond_d
    const/16 v16, 0x2000

    :goto_a
    or-int v4, v4, v16

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v5, p4

    :goto_c
    and-int/lit8 v16, v10, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v4, v4, v17

    move-object/from16 v7, p5

    goto :goto_e

    :cond_f
    and-int v17, v9, v17

    move-object/from16 v7, p5

    if-nez v17, :cond_11

    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v18, 0x10000

    :goto_d
    or-int v4, v4, v18

    :cond_11
    :goto_e
    and-int/lit8 v18, v10, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v4, v4, v19

    move/from16 v15, p6

    goto :goto_10

    :cond_12
    and-int v19, v9, v19

    move/from16 v15, p6

    if-nez v19, :cond_14

    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v20, 0x80000

    :goto_f
    or-int v4, v4, v20

    :cond_14
    :goto_10
    and-int/lit16 v12, v10, 0x80

    const/high16 v21, 0xc00000

    if-eqz v12, :cond_15

    or-int v4, v4, v21

    move/from16 v0, p7

    goto :goto_12

    :cond_15
    and-int v21, v9, v21

    move/from16 v0, p7

    if-nez v21, :cond_17

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_16

    const/high16 v22, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v22, 0x400000

    :goto_11
    or-int v4, v4, v22

    :cond_17
    :goto_12
    const v22, 0x492493

    and-int v0, v4, v22

    const v5, 0x492492

    if-ne v0, v5, :cond_19

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_14

    .line 227
    :cond_18
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v5, p4

    move/from16 v12, p7

    move-object v6, v7

    move v7, v15

    :goto_13
    move-object v4, v13

    goto/16 :goto_1e

    :cond_19
    :goto_14
    if-eqz v6, :cond_1a

    .line 182
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v8, v0

    :cond_1a
    if-eqz v11, :cond_1b

    .line 183
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonTheme;->Dark:Lcom/stripe/android/paymentsheet/ui/ButtonTheme;

    move-object v13, v0

    :cond_1b
    if-eqz v14, :cond_1c

    .line 184
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Buy:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    goto :goto_15

    :cond_1c
    move-object/from16 v0, p4

    :goto_15
    if-eqz v16, :cond_1d

    const/4 v7, 0x0

    :cond_1d
    if-eqz v18, :cond_1e

    const/16 v6, 0x64

    int-to-float v6, v6

    .line 255
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    goto :goto_16

    :cond_1e
    move v6, v15

    :goto_16
    if-eqz v12, :cond_1f

    const/4 v12, 0x1

    goto :goto_17

    :cond_1f
    move/from16 v12, p7

    .line 187
    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v14

    if-eqz v14, :cond_20

    const/4 v14, -0x1

    const-string v15, "com.stripe.android.paymentsheet.ui.PayButton (GooglePayButton.kt:187)"

    const v5, 0x117e72b8

    .line 188
    invoke-static {v5, v4, v14, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 189
    :cond_20
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    check-cast v5, Landroidx/compose/runtime/CompositionLocal;

    const v14, 0x789c5f52

    .line 256
    const-string v15, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v3, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 189
    check-cast v5, Landroidx/compose/ui/unit/Density;

    invoke-interface {v5, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v5

    float-to-int v5, v5

    .line 190
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Landroidx/compose/runtime/CompositionLocal;

    .line 258
    invoke-static {v3, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 190
    check-cast v11, Landroidx/compose/ui/unit/Density;

    if-eqz v7, :cond_21

    invoke-virtual {v7}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v14

    invoke-interface {v11, v14}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v11

    float-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    goto :goto_18

    :cond_21
    const/4 v11, 0x0

    :goto_18
    const v14, 0x4b0b76a1    # 9139873.0f

    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit16 v14, v4, 0x1c00

    const/16 v15, 0x800

    if-ne v14, v15, :cond_22

    const/4 v14, 0x1

    goto :goto_19

    :cond_22
    const/4 v14, 0x0

    :goto_19
    const v15, 0xe000

    and-int/2addr v15, v4

    move/from16 v16, v4

    const/16 v4, 0x4000

    if-ne v15, v4, :cond_23

    const/4 v4, 0x1

    goto :goto_1a

    :cond_23
    const/4 v4, 0x0

    :goto_1a
    or-int/2addr v4, v14

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v14

    or-int/2addr v4, v14

    and-int/lit8 v14, v16, 0x70

    const/16 v15, 0x20

    if-ne v14, v15, :cond_24

    const/4 v14, 0x1

    goto :goto_1b

    :cond_24
    const/4 v14, 0x0

    :goto_1b
    or-int/2addr v4, v14

    .line 259
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    if-nez v4, :cond_25

    .line 260
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v14, v4, :cond_26

    .line 194
    :cond_25
    new-instance v14, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda2;

    invoke-direct {v14, v13, v0, v5, v2}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;ILjava/lang/String;)V

    .line 262
    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 194
    :cond_26
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v4, 0x4b0bb59b    # 9155995.0f

    .line 193
    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    const/high16 v5, 0x1c00000

    and-int v5, v16, v5

    const/high16 v15, 0x800000

    if-ne v5, v15, :cond_27

    const/4 v5, 0x1

    goto :goto_1c

    :cond_27
    const/4 v5, 0x0

    :goto_1c
    or-int/2addr v4, v5

    and-int/lit8 v5, v16, 0xe

    const/4 v15, 0x4

    if-ne v5, v15, :cond_28

    const/4 v5, 0x1

    goto :goto_1d

    :cond_28
    const/4 v5, 0x0

    :goto_1d
    or-int/2addr v4, v5

    .line 265
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_29

    .line 266
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_2a

    .line 206
    :cond_29
    new-instance v5, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda3;

    invoke-direct {v5, v12, v11, v1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda3;-><init>(ZLjava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    .line 268
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 206
    :cond_2a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    shr-int/lit8 v4, v16, 0x3

    and-int/lit8 v4, v4, 0x70

    const/4 v11, 0x0

    move-object/from16 p5, v3

    move/from16 p6, v4

    move-object/from16 p4, v5

    move-object/from16 p3, v8

    move/from16 p7, v11

    move-object/from16 p2, v14

    .line 192
    invoke-static/range {p2 .. p7}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_2b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2b
    move-object v4, v7

    move v7, v6

    move-object v6, v4

    move-object v5, v0

    goto/16 :goto_13

    .line 227
    :goto_1e
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_2c

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda4;

    move-object v3, v8

    move v8, v12

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda4;-><init>(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZII)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2c
    return-void
.end method

.method private static final PayButton_EKdrzYM$lambda$10$lambda$9(Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;ILjava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/wallet/button/PayButton;
    .locals 1

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    new-instance v0, Lcom/google/android/gms/wallet/button/PayButton;

    invoke-direct {v0, p4}, Lcom/google/android/gms/wallet/button/PayButton;-><init>(Landroid/content/Context;)V

    .line 197
    invoke-static {}, Lcom/google/android/gms/wallet/button/ButtonOptions;->newBuilder()Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p4

    .line 198
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/ButtonTheme;->getValue()I

    move-result p0

    invoke-virtual {p4, p0}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setButtonTheme(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p0

    .line 199
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/ButtonType;->getValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setButtonType(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p0

    .line 200
    invoke-virtual {p0, p2}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setCornerRadius(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p0

    .line 201
    invoke-virtual {p0, p3}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setAllowedPaymentMethods(Ljava/lang/String;)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p0

    .line 202
    invoke-virtual {p0}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->build()Lcom/google/android/gms/wallet/button/ButtonOptions;

    move-result-object p0

    .line 196
    invoke-virtual {v0, p0}, Lcom/google/android/gms/wallet/button/PayButton;->initialize(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    return-object v0
.end method

.method private static final PayButton_EKdrzYM$lambda$15$lambda$14(ZLjava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/google/android/gms/wallet/button/PayButton;)Lkotlin/Unit;
    .locals 2

    const-string v0, "button"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    move-object v0, p3

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->nestedView(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 213
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_1
    if-eqz p0, :cond_2

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    const/high16 p1, 0x3f000000    # 0.5f

    .line 216
    :goto_1
    invoke-virtual {p3, p1}, Lcom/google/android/gms/wallet/button/PayButton;->setAlpha(F)V

    .line 217
    invoke-virtual {p3, p0}, Lcom/google/android/gms/wallet/button/PayButton;->setEnabled(Z)V

    if-eqz p0, :cond_3

    .line 220
    new-instance p0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda5;

    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/wallet/button/PayButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_3
    const/4 p0, 0x0

    .line 222
    invoke-virtual {p3, p0}, Lcom/google/android/gms/wallet/button/PayButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final PayButton_EKdrzYM$lambda$15$lambda$14$lambda$13$lambda$12(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    .line 220
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final PayButton_EKdrzYM$lambda$16(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->PayButton-EKdrzYM(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final nestedView(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 2

    .line 230
    invoke-static {p0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    move-result-object p0

    invoke-static {p0}, Lkotlin/sequences/SequencesKt;->firstOrNull(Lkotlin/sequences/Sequence;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    if-nez p1, :cond_0

    return-object p0

    .line 235
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_1
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_2

    add-int/lit8 p1, p1, -0x1

    .line 237
    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt;->nestedView(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static final toComposeButtonType(Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;)Lcom/stripe/android/paymentsheet/ui/ButtonType;
    .locals 1

    .line 142
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/GooglePayButtonKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 150
    :pswitch_0
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Subscribe:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0

    .line 149
    :pswitch_1
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Plain:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0

    .line 148
    :pswitch_2
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Pay:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0

    .line 147
    :pswitch_3
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Order:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0

    .line 146
    :pswitch_4
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Donate:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0

    .line 145
    :pswitch_5
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Checkout:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0

    .line 144
    :pswitch_6
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Buy:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0

    .line 143
    :pswitch_7
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Book:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
