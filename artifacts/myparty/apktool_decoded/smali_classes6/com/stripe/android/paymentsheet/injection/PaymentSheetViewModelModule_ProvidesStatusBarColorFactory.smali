.class public final Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvidesStatusBarColorFactory;
.super Ljava/lang/Object;
.source "PaymentSheetViewModelModule_ProvidesStatusBarColorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvidesStatusBarColorFactory;->module:Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvidesStatusBarColorFactory;
    .locals 1

    .line 40
    new-instance v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvidesStatusBarColorFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvidesStatusBarColorFactory;-><init>(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)V

    return-object v0
.end method

.method public static providesStatusBarColor(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)Ljava/lang/Integer;
    .locals 0

    .line 44
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;->providesStatusBarColor()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public get()Ljava/lang/Integer;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvidesStatusBarColorFactory;->module:Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvidesStatusBarColorFactory;->providesStatusBarColor(Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetViewModelModule_ProvidesStatusBarColorFactory;->get()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
