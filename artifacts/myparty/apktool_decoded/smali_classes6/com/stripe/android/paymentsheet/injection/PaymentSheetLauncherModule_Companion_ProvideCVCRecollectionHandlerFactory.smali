.class public final Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;
.super Ljava/lang/Object;
.source "PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory$InstanceHolder;
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

.method public static create()Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;

    return-object v0
.end method

.method public static provideCVCRecollectionHandler()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule;->Companion:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule$Companion;->provideCVCRecollectionHandler()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

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
    invoke-static {}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;->provideCVCRecollectionHandler()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;->get()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;

    move-result-object v0

    return-object v0
.end method
