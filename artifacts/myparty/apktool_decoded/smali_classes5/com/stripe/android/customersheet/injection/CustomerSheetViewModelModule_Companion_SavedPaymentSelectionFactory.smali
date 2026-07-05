.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory;
    .locals 1

    .line 33
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory;

    return-object v0
.end method

.method public static savedPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    .line 37
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->savedPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    .line 29
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory;->savedPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_SavedPaymentSelectionFactory;->get()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v0

    return-object v0
.end method
