.class public final Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
.super Ljava/lang/Object;
.source "AttributionRequest.kt"


# annotations
.annotation runtime Lcom/squareup/moshi/JsonClass;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J=\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000c\"\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000c\u00a8\u0006!"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
        "",
        "d",
        "Lcom/qonversion/android/sdk/internal/dto/Environment;",
        "v",
        "",
        "accessToken",
        "providerData",
        "Lcom/qonversion/android/sdk/internal/dto/ProviderData;",
        "clientUid",
        "(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)V",
        "getAccessToken",
        "()Ljava/lang/String;",
        "getClientUid",
        "setClientUid",
        "(Ljava/lang/String;)V",
        "getD",
        "()Lcom/qonversion/android/sdk/internal/dto/Environment;",
        "getProviderData",
        "()Lcom/qonversion/android/sdk/internal/dto/ProviderData;",
        "getV",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final accessToken:Ljava/lang/String;

.field private clientUid:Ljava/lang/String;

.field private final d:Lcom/qonversion/android/sdk/internal/dto/Environment;

.field private final providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

.field private final v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/Environment;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "d"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "v"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "access_token"
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/internal/dto/ProviderData;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "provider_data"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "client_uid"
        .end annotation
    .end param

    const-string v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "v"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "providerData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->d:Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 11
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->v:Ljava/lang/String;

    .line 12
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->accessToken:Ljava/lang/String;

    .line 13
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    .line 14
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->d:Lcom/qonversion/android/sdk/internal/dto/Environment;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->v:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->accessToken:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->copy(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/qonversion/android/sdk/internal/dto/Environment;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->d:Lcom/qonversion/android/sdk/internal/dto/Environment;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->v:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/qonversion/android/sdk/internal/dto/ProviderData;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
    .locals 7
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/Environment;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "d"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "v"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "access_token"
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/internal/dto/ProviderData;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "provider_data"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "client_uid"
        .end annotation
    .end param

    const-string v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "v"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "providerData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;-><init>(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->d:Lcom/qonversion/android/sdk/internal/dto/Environment;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->d:Lcom/qonversion/android/sdk/internal/dto/Environment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->v:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->v:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->accessToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->accessToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAccessToken()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getClientUid()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    return-object v0
.end method

.method public final getD()Lcom/qonversion/android/sdk/internal/dto/Environment;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->d:Lcom/qonversion/android/sdk/internal/dto/Environment;

    return-object v0
.end method

.method public final getProviderData()Lcom/qonversion/android/sdk/internal/dto/ProviderData;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    return-object v0
.end method

.method public final getV()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->v:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->d:Lcom/qonversion/android/sdk/internal/dto/Environment;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/Environment;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->v:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->accessToken:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/ProviderData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setClientUid(Ljava/lang/String;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->d:Lcom/qonversion/android/sdk/internal/dto/Environment;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->v:Ljava/lang/String;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->accessToken:Ljava/lang/String;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->providerData:Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->clientUid:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "AttributionRequest(d="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", v="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accessToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", providerData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", clientUid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
