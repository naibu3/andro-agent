.class public final Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;
.super Ljava/lang/Object;
.source "ECETypes.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/JsonSerializer;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nECETypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ECETypes.kt\ncom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u001f\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\t\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "Landroid/os/Parcelable;",
        "maximum",
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;",
        "minimum",
        "<init>",
        "(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)V",
        "getMaximum",
        "()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;",
        "getMinimum",
        "toJson",
        "Lorg/json/JSONObject;",
        "component1",
        "component2",
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
.field public static final $stable:I = 0x0

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;",
            ">;"
        }
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate$Companion;

.field private static final FIELD_MAXIMUM:Ljava/lang/String; = "maximum"

.field private static final FIELD_MINIMUM:Ljava/lang/String; = "minimum"


# instance fields
.field private final maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

.field private final minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->Companion:Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate$Companion;

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate$Creator;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;-><init>(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)V
    .locals 0

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    .line 167
    iput-object p2, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 165
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;-><init>(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->copy(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;
    .locals 1

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;-><init>(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)V

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
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMaximum()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    return-object v0
.end method

.method public final getMinimum()Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 170
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 171
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    if-eqz v1, :cond_0

    const-string v2, "maximum"

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->toJson()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    if-eqz v1, :cond_1

    const-string v2, "minimum"

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->toJson()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ECEStructuredDeliveryEstimate(maximum="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", minimum="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->maximum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;->minimum:Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
