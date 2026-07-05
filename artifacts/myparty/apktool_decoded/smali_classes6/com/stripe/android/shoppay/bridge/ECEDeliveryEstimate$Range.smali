.class public final Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;
.super Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;
.source "ECETypes.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/JsonSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Range"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;",
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "value",
        "Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;",
        "<init>",
        "(Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;)V",
        "getValue",
        "()Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;",
        "toJson",
        "Lorg/json/JSONObject;",
        "component1",
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
            "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range$Creator;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 157
    invoke-direct {p0, v0}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->copy(Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;-><init>(Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getValue()Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    invoke-virtual {v0}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->hashCode()I

    move-result v0

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    invoke-virtual {v0}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Range(value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;->value:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
