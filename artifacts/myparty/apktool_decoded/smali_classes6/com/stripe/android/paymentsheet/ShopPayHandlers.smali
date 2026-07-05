.class public final Lcom/stripe/android/paymentsheet/ShopPayHandlers;
.super Ljava/lang/Object;
.source "ShopPayHandlers.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedAddress;,
        Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedShippingRate;,
        Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;,
        Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactUpdate;,
        Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;,
        Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingRateUpdate;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001:\u0006\u000c\r\u000e\u000f\u0010\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ShopPayHandlers;",
        "",
        "shippingMethodUpdateHandler",
        "Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;",
        "shippingContactHandler",
        "Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;)V",
        "getShippingMethodUpdateHandler",
        "()Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;",
        "getShippingContactHandler",
        "()Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;",
        "ShippingRateUpdate",
        "ShippingContactUpdate",
        "SelectedAddress",
        "SelectedShippingRate",
        "ShippingMethodHandler",
        "ShippingContactHandler",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final shippingContactHandler:Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;

.field private final shippingMethodUpdateHandler:Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;)V
    .locals 1

    const-string v0, "shippingMethodUpdateHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shippingContactHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ShopPayHandlers;->shippingMethodUpdateHandler:Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ShopPayHandlers;->shippingContactHandler:Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;

    return-void
.end method


# virtual methods
.method public final getShippingContactHandler()Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ShopPayHandlers;->shippingContactHandler:Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;

    return-object v0
.end method

.method public final getShippingMethodUpdateHandler()Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ShopPayHandlers;->shippingMethodUpdateHandler:Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;

    return-object v0
.end method
