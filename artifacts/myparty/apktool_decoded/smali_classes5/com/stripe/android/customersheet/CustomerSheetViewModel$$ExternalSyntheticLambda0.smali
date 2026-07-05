.class public final synthetic Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/model/PaymentSelection;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    invoke-static {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->$r8$lambda$OEbJyBZxatLbwNo0-vAO63ayko8(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    move-result-object p1

    return-object p1
.end method
