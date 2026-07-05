.class public final synthetic Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

.field public final synthetic f$1:Lcom/stripe/android/financialconnections/model/PartnerAccount;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda6;->f$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda6;->f$1:Lcom/stripe/android/financialconnections/model/PartnerAccount;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda6;->f$0:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$$ExternalSyntheticLambda6;->f$1:Lcom/stripe/android/financialconnections/model/PartnerAccount;

    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;->$r8$lambda$nDKDMSS9O_LhhG3Lv1MnG9VfOWQ(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
