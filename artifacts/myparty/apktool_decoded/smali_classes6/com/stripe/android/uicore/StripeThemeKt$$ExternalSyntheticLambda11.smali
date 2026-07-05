.class public final synthetic Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/uicore/StripeColors;

.field public final synthetic f$1:Lcom/stripe/android/uicore/StripeShapes;

.field public final synthetic f$2:Lcom/stripe/android/uicore/StripeTypography;

.field public final synthetic f$3:Ljava/lang/Float;

.field public final synthetic f$4:Lcom/stripe/android/uicore/SectionStyle;

.field public final synthetic f$5:Lcom/stripe/android/uicore/FormInsets;

.field public final synthetic f$6:Lcom/stripe/android/uicore/IconStyle;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$8:I

.field public final synthetic f$9:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$0:Lcom/stripe/android/uicore/StripeColors;

    iput-object p2, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$1:Lcom/stripe/android/uicore/StripeShapes;

    iput-object p3, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$2:Lcom/stripe/android/uicore/StripeTypography;

    iput-object p4, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$3:Ljava/lang/Float;

    iput-object p5, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$4:Lcom/stripe/android/uicore/SectionStyle;

    iput-object p6, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$5:Lcom/stripe/android/uicore/FormInsets;

    iput-object p7, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$6:Lcom/stripe/android/uicore/IconStyle;

    iput-object p8, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$7:Lkotlin/jvm/functions/Function2;

    iput p9, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$8:I

    iput p10, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$9:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$0:Lcom/stripe/android/uicore/StripeColors;

    iget-object v1, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$1:Lcom/stripe/android/uicore/StripeShapes;

    iget-object v2, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$2:Lcom/stripe/android/uicore/StripeTypography;

    iget-object v3, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$3:Ljava/lang/Float;

    iget-object v4, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$4:Lcom/stripe/android/uicore/SectionStyle;

    iget-object v5, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$5:Lcom/stripe/android/uicore/FormInsets;

    iget-object v6, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$6:Lcom/stripe/android/uicore/IconStyle;

    iget-object v7, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$7:Lkotlin/jvm/functions/Function2;

    iget v8, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$8:I

    iget v9, p0, Lcom/stripe/android/uicore/StripeThemeKt$$ExternalSyntheticLambda11;->f$9:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/stripe/android/uicore/StripeThemeKt;->$r8$lambda$lw2YW3I10ywtC6gMMcv2SZeOyNs(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
