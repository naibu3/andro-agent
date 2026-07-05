.class public final synthetic Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Landroid/content/Context;

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;->f$0:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;->f$1:Z

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;->f$2:Landroid/content/Context;

    iput p4, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;->f$0:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;->f$1:Z

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;->f$2:Landroid/content/Context;

    iget v3, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt$$ExternalSyntheticLambda10;->f$3:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodUIKt;->$r8$lambda$7plPXNbXYCdGbTVB49m_lwFreA4(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZLandroid/content/Context;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
