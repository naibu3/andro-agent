.class public final Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent;
.super Ljava/lang/Object;
.source "DaggerPaymentSheetLauncherComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$PaymentSheetLauncherComponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$csali_LinkAnalyticsComponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$LinkComponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$PaymentSheetViewModelSubcomponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$csali2_LinkAnalyticsComponentImpl;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$csali_LinkAnalyticsComponentBuilder;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$LinkComponentBuilder;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$csali2_LinkAnalyticsComponentBuilder;,
        Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$PaymentSheetViewModelSubcomponentBuilder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent$Builder;
    .locals 2

    .line 167
    new-instance v0, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent$Builder;-><init>(Lcom/stripe/android/paymentsheet/injection/DaggerPaymentSheetLauncherComponent-IA;)V

    return-object v0
.end method
