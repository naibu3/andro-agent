.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory;
    .locals 1

    .line 35
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory;

    return-object v0
.end method

.method public static providesIsFinancialConnectionsAvailable()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;
    .locals 1

    .line 39
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->providesIsFinancialConnectionsAvailable()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;
    .locals 1

    .line 30
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory;->providesIsFinancialConnectionsAvailable()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesIsFinancialConnectionsAvailableFactory;->get()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;

    move-result-object v0

    return-object v0
.end method
