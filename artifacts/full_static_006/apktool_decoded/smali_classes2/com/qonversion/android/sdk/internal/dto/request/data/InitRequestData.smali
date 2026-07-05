.class public final Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;
.super Ljava/lang/Object;
.source "InitRequestData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000cH\u00c6\u0003JG\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006$"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;",
        "",
        "installDate",
        "",
        "idfa",
        "",
        "purchases",
        "",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "requestTrigger",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V",
        "getCallback",
        "()Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "getIdfa",
        "()Ljava/lang/String;",
        "getInstallDate",
        "()J",
        "getPurchases",
        "()Ljava/util/List;",
        "getRequestTrigger",
        "()Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
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
.field private final callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field private final idfa:Ljava/lang/String;

.field private final installDate:J

.field private final purchases:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;"
        }
    .end annotation
.end field

.field private final requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    const-string v0, "requestTrigger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-wide p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->installDate:J

    .line 9
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->idfa:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->purchases:Ljava/util/List;

    .line 11
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 12
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, p4

    :goto_1
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_2

    move-object v7, v1

    goto :goto_2

    :cond_2
    move-object v7, p5

    :goto_2
    move-object v2, p0

    move-wide v3, p1

    move-object v8, p6

    .line 7
    invoke-direct/range {v2 .. v8}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->installDate:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->idfa:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->purchases:Ljava/util/List;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    :cond_4
    move-object v6, p6

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->copy(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->installDate:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->idfa:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->purchases:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    return-object v0
.end method

.method public final component5()Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")",
            "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;"
        }
    .end annotation

    const-string v0, "requestTrigger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    move-object v1, v0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    iget-wide v3, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->installDate:J

    iget-wide v5, p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->installDate:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->idfa:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->idfa:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->purchases:Ljava/util/List;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->purchases:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    iget-object p1, p1, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCallback()Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    return-object v0
.end method

.method public final getIdfa()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->idfa:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstallDate()J
    .locals 2

    .line 8
    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->installDate:J

    return-wide v0
.end method

.method public final getPurchases()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;"
        }
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->purchases:Ljava/util/List;

    return-object v0
.end method

.method public final getRequestTrigger()Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->installDate:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->idfa:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->purchases:Ljava/util/List;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->installDate:J

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->idfa:Ljava/lang/String;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->purchases:Ljava/util/List;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "InitRequestData(installDate="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", idfa="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", purchases="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", callback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", requestTrigger="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
