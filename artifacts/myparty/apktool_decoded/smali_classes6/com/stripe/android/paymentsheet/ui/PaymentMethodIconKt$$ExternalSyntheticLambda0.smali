.class public final synthetic Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Landroidx/compose/ui/Modifier;

.field public final synthetic f$5:Landroidx/compose/ui/Alignment;

.field public final synthetic f$6:I

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$0:I

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$3:Z

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$4:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$5:Landroidx/compose/ui/Alignment;

    iput p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$6:I

    iput p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$0:I

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$3:Z

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$4:Landroidx/compose/ui/Modifier;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$5:Landroidx/compose/ui/Alignment;

    iget v6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$6:I

    iget v7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda0;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt;->$r8$lambda$fkY2rXVVV2s8ywqTOM_mxxbT8Xc(ILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
