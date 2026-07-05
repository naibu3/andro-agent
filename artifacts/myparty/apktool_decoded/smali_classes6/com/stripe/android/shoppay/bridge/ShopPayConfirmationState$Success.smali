.class public final Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;
.super Ljava/lang/Object;
.source "ShopPayConfirmationState.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Success"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;",
        "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState;",
        "externalSourceId",
        "",
        "billingDetails",
        "Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;",
        "shippingAddressData",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;)V",
        "getExternalSourceId",
        "()Ljava/lang/String;",
        "getBillingDetails",
        "()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;",
        "getShippingAddressData",
        "()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field private final billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

.field private final externalSourceId:Ljava/lang/String;

.field private final shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;)V
    .locals 1

    const-string v0, "externalSourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->externalSourceId:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    .line 8
    iput-object p3, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->externalSourceId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->copy(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;)Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->externalSourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;)Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;
    .locals 1

    const-string v0, "externalSourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;-><init>(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->externalSourceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->externalSourceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBillingDetails()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    return-object v0
.end method

.method public final getExternalSourceId()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->externalSourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getShippingAddressData()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->externalSourceId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->externalSourceId:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->billingDetails:Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->shippingAddressData:Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Success(externalSourceId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", billingDetails="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shippingAddressData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
