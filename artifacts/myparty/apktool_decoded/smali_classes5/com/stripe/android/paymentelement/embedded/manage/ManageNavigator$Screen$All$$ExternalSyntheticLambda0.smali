.class public final synthetic Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;

    check-cast p1, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;->$r8$lambda$XArr3bxtx0oZiBD7ZmyaWBkHmdM(Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator$Screen$All;Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object p1

    return-object p1
.end method
