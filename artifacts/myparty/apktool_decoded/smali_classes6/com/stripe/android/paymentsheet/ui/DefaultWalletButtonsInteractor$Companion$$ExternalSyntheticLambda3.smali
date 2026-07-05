.class public final synthetic Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;->$r8$lambda$-V5sbCw8A3Blzfpv6DOaEJ4wZds(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
