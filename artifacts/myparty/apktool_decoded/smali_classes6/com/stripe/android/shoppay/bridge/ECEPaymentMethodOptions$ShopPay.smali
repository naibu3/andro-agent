.class public final Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;
.super Ljava/lang/Object;
.source "ECETypes.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/JsonSerializer;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ShopPay"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "Landroid/os/Parcelable;",
        "externalSourceId",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getExternalSourceId",
        "()Ljava/lang/String;",
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
            "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;",
            ">;"
        }
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay$Companion;

.field private static final FIELD_EXTERNAL_SOURCE_ID:Ljava/lang/String; = "externalSourceId"


# instance fields
.field private final externalSourceId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->Companion:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay$Companion;

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay$Creator;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "externalSourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 215
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->copy(Ljava/lang/String;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;
    .locals 1

    const-string v0, "externalSourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;-><init>(Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getExternalSourceId()Ljava/lang/String;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 218
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 219
    const-string v1, "externalSourceId"

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ShopPay(externalSourceId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->externalSourceId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
