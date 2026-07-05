.class public final synthetic Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

.field public final synthetic f$1:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

.field public final synthetic f$2:Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion$$ExternalSyntheticLambda0;->f$2:Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultAddPaymentMethodInteractor$Companion;->$r8$lambda$l74MYVKXn_H4wAvkt-XGzuWD2MQ(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    move-result-object p1

    return-object p1
.end method
