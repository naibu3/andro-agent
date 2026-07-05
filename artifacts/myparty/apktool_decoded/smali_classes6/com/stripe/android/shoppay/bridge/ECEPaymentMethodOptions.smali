.class public final Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;
.super Ljava/lang/Object;
.source "ECETypes.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/JsonSerializer;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$Companion;,
        Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nECETypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ECETypes.kt\ncom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\t\u001a\u00020\nH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "Landroid/os/Parcelable;",
        "shopPay",
        "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;",
        "<init>",
        "(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;)V",
        "getShopPay",
        "()Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;",
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
        "ShopPay",
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
            "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;",
            ">;"
        }
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$Companion;

.field private static final FIELD_SHOP_PAY:Ljava/lang/String; = "shopPay"


# instance fields
.field private final shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->Companion:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$Companion;

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$Creator;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;)V
    .locals 0

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->copy(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;
    .locals 1

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;-><init>(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;)V

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
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getShopPay()Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->hashCode()I

    move-result v0

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 229
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 230
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    if-eqz v1, :cond_0

    const-string v2, "shopPay"

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->toJson()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ECEPaymentMethodOptions(shopPay="

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
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;->shopPay:Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
