.class public final Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;
.super Ljava/lang/Object;
.source "ConfirmationRequest.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConfirmEventData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "billingDetails",
        "Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;",
        "shippingAddress",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;",
        "shippingRate",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "paymentMethodOptions",
        "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;",
        "<init>",
        "(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;)V",
        "getBillingDetails",
        "()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;",
        "getShippingAddress",
        "()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;",
        "getShippingRate",
        "()Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "getPaymentMethodOptions",
        "()Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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
            "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

.field private final paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

.field private final shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

.field private final shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData$Creator;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;)V
    .locals 1

    const-string v0, "billingDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    .line 14
    iput-object p3, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    .line 15
    iput-object p4, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 11
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;-><init>(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->copy(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;)Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/shoppay/bridge/ECEShippingRate;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;)Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;
    .locals 1

    const-string v0, "billingDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;-><init>(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;)V

    return-object v0
.end method

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
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBillingDetails()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    return-object v0
.end method

.method public final getPaymentMethodOptions()Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    return-object v0
.end method

.method public final getShippingAddress()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    return-object v0
.end method

.method public final getShippingRate()Lcom/stripe/android/shoppay/bridge/ECEShippingRate;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    invoke-virtual {v0}, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    iget-object v3, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ConfirmEventData(billingDetails="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", shippingAddress="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shippingRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingAddress:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->shippingRate:Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;->paymentMethodOptions:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
