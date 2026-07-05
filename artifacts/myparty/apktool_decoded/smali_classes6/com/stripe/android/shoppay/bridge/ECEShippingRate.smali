.class public final Lcom/stripe/android/shoppay/bridge/ECEShippingRate;
.super Ljava/lang/Object;
.source "ECETypes.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/JsonSerializer;
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ECEShippingRate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003J3\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0006\u0010\u001a\u001a\u00020\u0006J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001J\t\u0010 \u001a\u00020\u0004H\u00d6\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "id",
        "",
        "amount",
        "",
        "displayName",
        "deliveryEstimate",
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)V",
        "getId",
        "()Ljava/lang/String;",
        "getAmount",
        "()I",
        "getDisplayName",
        "getDeliveryEstimate",
        "()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;",
        "toJson",
        "Lorg/json/JSONObject;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
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
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;"
        }
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ECEShippingRate$Companion;

.field private static final FIELD_AMOUNT:Ljava/lang/String; = "amount"

.field private static final FIELD_DELIVERY_ESTIMATE:Ljava/lang/String; = "deliveryEstimate"

.field private static final FIELD_DISPLAY_NAME:Ljava/lang/String; = "displayName"

.field private static final FIELD_ID:Ljava/lang/String; = "id"


# instance fields
.field private final amount:I

.field private final deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

.field private final displayName:Ljava/lang/String;

.field private final id:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->Companion:Lcom/stripe/android/shoppay/bridge/ECEShippingRate$Companion;

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate$Creator;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    .line 125
    iput p2, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    .line 126
    iput-object p3, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    .line 127
    iput-object p4, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 123
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ECEShippingRate;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->copy(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)Lcom/stripe/android/shoppay/bridge/ECEShippingRate;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)V

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
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    iget v3, p1, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAmount()I
    .locals 1

    .line 125
    iget v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    return v0
.end method

.method public final getDeliveryEstimate()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    return-object v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 4

    .line 130
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 131
    const-string v1, "id"

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 132
    const-string v1, "amount"

    iget v2, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 133
    const-string v1, "displayName"

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    if-eqz v1, :cond_2

    .line 136
    instance-of v2, v1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Text;

    const-string v3, "deliveryEstimate"

    if-eqz v2, :cond_0

    check-cast v1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Text;

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Text;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0

    .line 137
    :cond_0
    instance-of v2, v1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->getValue()Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->toJson()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0

    .line 135
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    iget v1, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ECEShippingRate(id="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", amount="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deliveryEstimate="

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
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->amount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->displayName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->deliveryEstimate:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
