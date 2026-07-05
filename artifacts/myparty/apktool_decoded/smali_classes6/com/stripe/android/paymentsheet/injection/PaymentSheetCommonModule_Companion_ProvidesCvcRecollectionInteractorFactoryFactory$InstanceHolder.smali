.class final Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule_Companion_ProvidesCvcRecollectionInteractorFactoryFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
