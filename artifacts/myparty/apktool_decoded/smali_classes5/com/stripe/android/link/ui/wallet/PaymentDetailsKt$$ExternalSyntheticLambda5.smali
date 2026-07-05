.class public final synthetic Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;->f$0:Z

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;->f$1:Z

    iput-object p3, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;->f$2:Lkotlin/jvm/functions/Function0;

    iput p4, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;->f$0:Z

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;->f$1:Z

    iget-object v2, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;->f$2:Lkotlin/jvm/functions/Function0;

    iget v3, p0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt$$ExternalSyntheticLambda5;->f$3:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsKt;->$r8$lambda$oCRS2eVCsDYadCy1kTpa78S1BvY(ZZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
