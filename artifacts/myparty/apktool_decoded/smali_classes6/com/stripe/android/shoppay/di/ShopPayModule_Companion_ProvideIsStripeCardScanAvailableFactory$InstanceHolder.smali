.class final Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
