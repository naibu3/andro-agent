.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/lang/String;",
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

.method public static create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;

    return-object v0
.end method

.method public static providesPaymentElementCallbackIdentifier()Ljava/lang/String;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->providesPaymentElementCallbackIdentifier()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;->get()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/String;
    .locals 1

    .line 29
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesPaymentElementCallbackIdentifierFactory;->providesPaymentElementCallbackIdentifier()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
