.class final Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule_Companion_ProvideCVCRecollectionHandlerFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
