.class public final Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
.super Ljava/lang/Object;
.source "ECETypes.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/JsonSerializer;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0006\u0010\u0012\u001a\u00020\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "Landroid/os/Parcelable;",
        "unit",
        "Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;",
        "value",
        "",
        "<init>",
        "(Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;I)V",
        "getUnit",
        "()Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;",
        "getValue",
        "()I",
        "toJson",
        "Lorg/json/JSONObject;",
        "component1",
        "component2",
        "copy",
        "describeContents",
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
            "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;",
            ">;"
        }
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit$Companion;

.field private static final FIELD_UNIT:Ljava/lang/String; = "unit"

.field private static final FIELD_VALUE:Ljava/lang/String; = "value"


# instance fields
.field private final unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->Companion:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit$Companion;

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit$Creator;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;I)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    .line 185
    iput p2, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;IILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->copy(Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;I)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    return v0
.end method

.method public final copy(Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;I)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
    .locals 1

    const-string v0, "unit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;-><init>(Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;I)V

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
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    iget p1, p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getUnit()Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    return-object v0
.end method

.method public final getValue()I
    .locals 1

    .line 185
    iget v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    invoke-virtual {v0}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 188
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 189
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unit"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    const-string v1, "value"

    iget v2, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    iget v1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ECEDeliveryEstimateUnit(unit="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", value="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->unit:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->value:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
