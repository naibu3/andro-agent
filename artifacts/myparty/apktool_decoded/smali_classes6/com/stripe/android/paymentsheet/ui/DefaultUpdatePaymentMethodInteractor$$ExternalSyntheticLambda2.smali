.class public final synthetic Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function5;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/core/strings/ResolvableString;

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p5

    check-cast v5, Lcom/stripe/android/paymentsheet/CardUpdateParams;

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->$r8$lambda$6v4Ja6zFnG5bCHu5UN9coi4W-IU(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZLcom/stripe/android/paymentsheet/CardUpdateParams;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    move-result-object p1

    return-object p1
.end method
