.class public final synthetic Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;->$r8$lambda$NufHwBtUXl0McUVuJRSn9SwL0Aw(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;ZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;)Lcom/stripe/android/paymentsheet/verticalmode/VerticalModeFormInteractor$State;

    move-result-object p1

    return-object p1
.end method
