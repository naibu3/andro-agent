.class public final Lcom/stripe/android/shoppay/di/DaggerShopPayComponent;
.super Ljava/lang/Object;
.source "DaggerShopPayComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;,
        Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .locals 2

    .line 58
    new-instance v0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;-><init>(Lcom/stripe/android/shoppay/di/DaggerShopPayComponent-IA;)V

    return-object v0
.end method
