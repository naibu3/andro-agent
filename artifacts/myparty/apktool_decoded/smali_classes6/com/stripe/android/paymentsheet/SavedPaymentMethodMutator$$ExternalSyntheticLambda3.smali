.class public final synthetic Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->$r8$lambda$JeIUcpse-Gdp_64IGimdwcfHgws(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;ZLjava/util/List;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
