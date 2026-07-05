.class public final Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;
.super Ljava/lang/Object;
.source "BridgeResponse.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/BridgeResponse;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/bridge/BridgeResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Data"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/stripe/android/shoppay/bridge/BridgeResponse<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u0000*\u0008\u0008\u0001\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0008J \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u000bH\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;",
        "T",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "Lcom/stripe/android/shoppay/bridge/BridgeResponse;",
        "data",
        "<init>",
        "(Lcom/stripe/android/shoppay/bridge/JsonSerializer;)V",
        "getData",
        "()Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "type",
        "",
        "getType",
        "()Ljava/lang/String;",
        "toJson",
        "Lorg/json/JSONObject;",
        "component1",
        "copy",
        "(Lcom/stripe/android/shoppay/bridge/JsonSerializer;)Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;",
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
.field private final data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/shoppay/bridge/JsonSerializer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    .line 8
    const-string p1, "data"

    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->type:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;Lcom/stripe/android/shoppay/bridge/JsonSerializer;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->copy(Lcom/stripe/android/shoppay/bridge/JsonSerializer;)Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/shoppay/bridge/JsonSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/shoppay/bridge/JsonSerializer;)Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;-><init>(Lcom/stripe/android/shoppay/bridge/JsonSerializer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getData()Lcom/stripe/android/shoppay/bridge/JsonSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 10
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 11
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/stripe/android/shoppay/bridge/JsonSerializer;->toJson()Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "data"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    const-string v1, "type"

    invoke-virtual {p0}, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;->data:Lcom/stripe/android/shoppay/bridge/JsonSerializer;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Data(data="

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
