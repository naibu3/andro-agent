.class public final Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory;
.super Ljava/lang/Object;
.source "CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;",
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

.method public static create()Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory;
    .locals 1

    .line 35
    sget-object v0, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory;

    return-object v0
.end method

.method public static provideCvcRecollectionHandler()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;
    .locals 1

    .line 39
    sget-object v0, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule;->Companion:Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule$Companion;->provideCvcRecollectionHandler()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;
    .locals 1

    .line 30
    invoke-static {}, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory;->provideCvcRecollectionHandler()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/confirmation/cvc/CvcRecollectionConfirmationModule_Companion_ProvideCvcRecollectionHandlerFactory;->get()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    move-result-object v0

    return-object v0
.end method
