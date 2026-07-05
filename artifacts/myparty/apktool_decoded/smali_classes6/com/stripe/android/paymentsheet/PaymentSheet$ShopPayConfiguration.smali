.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ShopPayConfiguration"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0003!\"#BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\t\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;",
        "Landroid/os/Parcelable;",
        "shopId",
        "",
        "billingAddressRequired",
        "",
        "emailRequired",
        "shippingAddressRequired",
        "allowedShippingCountries",
        "",
        "lineItems",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;",
        "shippingRates",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;",
        "<init>",
        "(Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "getShopId",
        "()Ljava/lang/String;",
        "getBillingAddressRequired",
        "()Z",
        "getEmailRequired",
        "getShippingAddressRequired",
        "getAllowedShippingCountries",
        "()Ljava/util/List;",
        "getLineItems",
        "getShippingRates",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "LineItem",
        "ShippingRate",
        "DeliveryEstimate",
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final allowedShippingCountries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final billingAddressRequired:Z

.field private final emailRequired:Z

.field private final lineItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;",
            ">;"
        }
    .end annotation
.end field

.field private final shippingAddressRequired:Z

.field private final shippingRates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;",
            ">;"
        }
    .end annotation
.end field

.field private final shopId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;",
            ">;)V"
        }
    .end annotation

    const-string v0, "shopId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedShippingCountries"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lineItems"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shippingRates"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3256
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shopId:Ljava/lang/String;

    .line 3257
    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->billingAddressRequired:Z

    .line 3258
    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->emailRequired:Z

    .line 3259
    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingAddressRequired:Z

    .line 3260
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->allowedShippingCountries:Ljava/util/List;

    .line 3261
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->lineItems:Ljava/util/List;

    .line 3262
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingRates:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x1

    if-eqz p9, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p8, p8, 0x4

    if-eqz p8, :cond_1

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move p4, v0

    goto :goto_0

    :cond_1
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move p4, p3

    :goto_0
    move p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 3255
    invoke-direct/range {p1 .. p8}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;-><init>(Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shopId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shopId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->billingAddressRequired:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->billingAddressRequired:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->emailRequired:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->emailRequired:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingAddressRequired:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingAddressRequired:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->allowedShippingCountries:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->allowedShippingCountries:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->lineItems:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->lineItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingRates:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingRates:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAllowedShippingCountries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3260
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->allowedShippingCountries:Ljava/util/List;

    return-object v0
.end method

.method public final getBillingAddressRequired()Z
    .locals 1

    .line 3257
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->billingAddressRequired:Z

    return v0
.end method

.method public final getEmailRequired()Z
    .locals 1

    .line 3258
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->emailRequired:Z

    return v0
.end method

.method public final getLineItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;",
            ">;"
        }
    .end annotation

    .line 3261
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->lineItems:Ljava/util/List;

    return-object v0
.end method

.method public final getShippingAddressRequired()Z
    .locals 1

    .line 3259
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingAddressRequired:Z

    return v0
.end method

.method public final getShippingRates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;",
            ">;"
        }
    .end annotation

    .line 3262
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingRates:Ljava/util/List;

    return-object v0
.end method

.method public final getShopId()Ljava/lang/String;
    .locals 1

    .line 3256
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shopId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shopId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->billingAddressRequired:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->emailRequired:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingAddressRequired:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->allowedShippingCountries:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->lineItems:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingRates:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shopId:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->billingAddressRequired:Z

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->emailRequired:Z

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingAddressRequired:Z

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->allowedShippingCountries:Ljava/util/List;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->lineItems:Ljava/util/List;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingRates:Ljava/util/List;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ShopPayConfiguration(shopId="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", billingAddressRequired="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", emailRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shippingAddressRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowedShippingCountries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lineItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shippingRates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shopId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->billingAddressRequired:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->emailRequired:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingAddressRequired:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->allowedShippingCountries:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->lineItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;->shippingRates:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_1
    return-void
.end method
