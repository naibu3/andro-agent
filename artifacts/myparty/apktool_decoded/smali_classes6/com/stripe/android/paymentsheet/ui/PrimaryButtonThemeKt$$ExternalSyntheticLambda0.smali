.class public final synthetic Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

.field public final synthetic f$1:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

.field public final synthetic f$2:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$4:I

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function2;

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$4:I

    iput p6, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function2;

    iget v4, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$4:I

    iget v5, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt$$ExternalSyntheticLambda0;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt;->$r8$lambda$7ehPwszSamKC5pri2L9B9LCRS3I(Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
