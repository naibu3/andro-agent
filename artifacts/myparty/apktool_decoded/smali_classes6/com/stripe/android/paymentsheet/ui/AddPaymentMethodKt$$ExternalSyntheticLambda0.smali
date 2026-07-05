.class public final synthetic Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;

    check-cast p1, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->$r8$lambda$BiLteZYbcNtjabrSCP2Z4hW23-g(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
