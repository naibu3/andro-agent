.class public final synthetic Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

.field public final synthetic f$1:Lcom/stripe/android/ui/core/Amount;

.field public final synthetic f$2:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

.field public final synthetic f$5:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

.field public final synthetic f$6:Z


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$1:Lcom/stripe/android/ui/core/Amount;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$2:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$3:Z

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$4:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$5:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$6:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$1:Lcom/stripe/android/ui/core/Amount;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$2:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$3:Z

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$4:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$5:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    iget-boolean v6, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$$ExternalSyntheticLambda3;->f$6:Z

    move-object v7, p1

    check-cast v7, Lcom/stripe/android/paymentsheet/navigation/BuyButtonState;

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->$r8$lambda$-VXD5KXv7GQLs2gTip3DfM3bGWc(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;ZLcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;ZLcom/stripe/android/paymentsheet/navigation/BuyButtonState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object p1

    return-object p1
.end method
