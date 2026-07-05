.class public final synthetic Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;->$r8$lambda$DZjpFIhxyqV62rvyQwYPjmIBdmw(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object p1

    return-object p1
.end method
