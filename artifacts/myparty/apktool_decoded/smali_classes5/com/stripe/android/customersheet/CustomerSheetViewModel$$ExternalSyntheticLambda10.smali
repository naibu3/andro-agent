.class public final synthetic Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda10;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda10;->f$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda10;->f$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    check-cast p2, Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->$r8$lambda$eIVuP6TVoaNYbGDDz97NIdHpJyg(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;Z)Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;

    move-result-object p1

    return-object p1
.end method
