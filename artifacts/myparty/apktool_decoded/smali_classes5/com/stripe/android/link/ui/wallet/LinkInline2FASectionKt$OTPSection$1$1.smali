.class final Lcom/stripe/android/link/ui/wallet/LinkInline2FASectionKt$OTPSection$1$1;
.super Ljava/lang/Object;
.source "LinkInline2FASection.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/LinkInline2FASectionKt;->OTPSection(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nLinkInline2FASection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInline2FASection.kt\ncom/stripe/android/link/ui/wallet/LinkInline2FASectionKt$OTPSection$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,371:1\n149#2:372\n149#2:373\n149#2:374\n159#2:375\n*S KotlinDebug\n*F\n+ 1 LinkInline2FASection.kt\ncom/stripe/android/link/ui/wallet/LinkInline2FASectionKt$OTPSection$1$1\n*L\n170#1:372\n171#1:373\n176#1:374\n185#1:375\n*E\n"
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
.field final synthetic $otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $state:Lcom/stripe/android/link/ui/verification/VerificationViewState;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/uicore/elements/OTPElement;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/LinkInline2FASectionKt$OTPSection$1$1;->$state:Lcom/stripe/android/link/ui/verification/VerificationViewState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/LinkInline2FASectionKt$OTPSection$1$1;->$otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 166
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/LinkInline2FASectionKt$OTPSection$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 167
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 167
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.wallet.OTPSection.<anonymous>.<anonymous> (LinkInline2FASection.kt:166)"

    const v4, 0x42488002

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 168
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/LinkInline2FASectionKt$OTPSection$1$1;->$state:Lcom/stripe/android/link/ui/verification/VerificationViewState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const/16 v2, 0x8

    int-to-float v2, v2

    .line 372
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 373
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 173
    sget-object v2, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    const/4 v3, 0x6

    invoke-virtual {v2, v12, v3}, Lcom/stripe/android/link/theme/LinkTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkShapes;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/theme/LinkShapes;->getDefault()Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v2

    .line 174
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    const/16 v5, 0x148

    int-to-float v5, v5

    .line 374
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 176
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 177
    const-string v5, "verification_otp_tag"

    invoke-static {v4, v5}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 179
    sget-object v5, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v5, v12, v3}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkColors;->getBorderSelected-0d7_KjU()J

    move-result-wide v14

    .line 180
    sget-object v5, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v5, v12, v3}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v16

    .line 181
    sget-object v5, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v5, v12, v3}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkColors;->getSurfacePrimary-0d7_KjU()J

    move-result-wide v20

    .line 182
    sget-object v5, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v5, v12, v3}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/theme/LinkColors;->getSurfacePrimary-0d7_KjU()J

    move-result-wide v18

    .line 183
    sget-object v5, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v5, v12, v3}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkColors;->getBorderDefault-0d7_KjU()J

    move-result-wide v22

    .line 178
    new-instance v13, Lcom/stripe/android/uicore/elements/OTPElementColors;

    const/16 v24, 0x0

    invoke-direct/range {v13 .. v24}, Lcom/stripe/android/uicore/elements/OTPElementColors;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v8

    .line 375
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    move-object v3, v2

    .line 169
    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/LinkInline2FASectionKt$OTPSection$1$1;->$otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    .line 173
    check-cast v3, Landroidx/compose/ui/graphics/Shape;

    .line 185
    sget v5, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    const v8, 0x30db0180

    or-int/2addr v5, v8

    sget v8, Lcom/stripe/android/uicore/elements/OTPElementColors;->$stable:I

    shl-int/lit8 v8, v8, 0x18

    or-int/2addr v5, v8

    const/4 v14, 0x0

    const/16 v15, 0x410

    move-object v9, v13

    move v13, v5

    const/4 v5, 0x0

    .line 167
    const-string v8, " "

    const/4 v11, 0x0

    move-object/from16 v25, v4

    move-object v4, v3

    move-object/from16 v3, v25

    invoke-static/range {v1 .. v15}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI-RE_urrM(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
