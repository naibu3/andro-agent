.class public final synthetic Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;

    check-cast p3, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;

    invoke-static {v0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;->$r8$lambda$M2nb6S92OtZkZLzIbzPnM9Ig6CM(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Ljava/lang/String;Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;)Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;

    move-result-object p1

    return-object p1
.end method
