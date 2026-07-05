.class public final synthetic Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->$r8$lambda$86h2B5cq3vUchtyJCjYmcwP2huI(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/stripe/android/paymentsheet/state/WalletsState;

    move-result-object p1

    return-object p1
.end method
