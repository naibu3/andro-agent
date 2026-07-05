.class public final Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;
.super Lcom/qonversion/android/sdk/internal/dto/request/RequestData;
.source "RestoreRequest.kt"


# annotations
.annotation runtime Lcom/squareup/moshi/JsonClass;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B]\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0003\u0010\n\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0007\u0012\u000e\u0008\u0001\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003Ja\u0010$\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u000b\u001a\u00020\u00072\u000e\u0008\u0003\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u0007H\u00d6\u0001R\u0014\u0010\u0008\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0011\u00a8\u0006,"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;",
        "Lcom/qonversion/android/sdk/internal/dto/request/RequestData;",
        "installDate",
        "",
        "device",
        "Lcom/qonversion/android/sdk/internal/dto/Environment;",
        "version",
        "",
        "accessToken",
        "clientUid",
        "receipt",
        "debugMode",
        "history",
        "",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
        "(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "getAccessToken",
        "()Ljava/lang/String;",
        "getClientUid",
        "getDebugMode",
        "getDevice",
        "()Lcom/qonversion/android/sdk/internal/dto/Environment;",
        "getHistory",
        "()Ljava/util/List;",
        "getInstallDate",
        "()J",
        "getReceipt",
        "getVersion",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "",
        "other",
        "",
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

.field private final clientUid:Ljava/lang/String;

.field private final debugMode:Ljava/lang/String;

.field private final device:Lcom/qonversion/android/sdk/internal/dto/Environment;

.field private final history:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;"
        }
    .end annotation
.end field

.field private final installDate:J

.field private final receipt:Ljava/lang/String;

.field private final version:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # J
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "install_date"
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/Environment;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "device"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "access_token"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "q_uid"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "receipt"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "debug_mode"
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "history"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/qonversion/android/sdk/internal/dto/Environment;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;)V"
        }
    .end annotation

    const-string v0, "device"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessToken"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receipt"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugMode"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "history"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/dto/request/RequestData;-><init>()V

    .line 10
    iput-wide p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->installDate:J

    .line 11
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->device:Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 12
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->version:Ljava/lang/String;

    .line 13
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->accessToken:Ljava/lang/String;

    .line 14
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->clientUid:Ljava/lang/String;

    .line 15
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->receipt:Ljava/lang/String;

    .line 16
    iput-object p8, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->debugMode:Ljava/lang/String;

    .line 17
    iput-object p9, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->history:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_0

    .line 15
    const-string v0, ""

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 9
    invoke-direct/range {v1 .. v10}, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->installDate:J

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->device:Lcom/qonversion/android/sdk/internal/dto/Environment;

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->version:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->accessToken:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->clientUid:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->receipt:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->debugMode:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->history:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p9

    :goto_7
    move-wide p1, v2

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->copy(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->installDate:J

    return-wide v0
.end method

.method public final component2()Lcom/qonversion/android/sdk/internal/dto/Environment;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->device:Lcom/qonversion/android/sdk/internal/dto/Environment;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->clientUid:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->receipt:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->debugMode:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->history:Ljava/util/List;

    return-object v0
.end method

.method public final copy(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;
    .locals 11
    .param p1    # J
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "install_date"
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/Environment;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "device"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "access_token"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "q_uid"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "receipt"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "debug_mode"
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "history"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/qonversion/android/sdk/internal/dto/Environment;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;"
        }
    .end annotation

    const-string v0, "device"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessToken"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receipt"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugMode"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "history"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;

    move-object v1, v0

    move-wide v2, p1

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v10}, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;

    iget-wide v3, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->installDate:J

    iget-wide v5, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->installDate:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->device:Lcom/qonversion/android/sdk/internal/dto/Environment;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->device:Lcom/qonversion/android/sdk/internal/dto/Environment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->version:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->version:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->accessToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->accessToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->clientUid:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->clientUid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->receipt:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->receipt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->debugMode:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->debugMode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->history:Ljava/util/List;

    iget-object p1, p1, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->history:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getClientUid()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->clientUid:Ljava/lang/String;

    return-object v0
.end method

.method public getDebugMode()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->debugMode:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice()Lcom/qonversion/android/sdk/internal/dto/Environment;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->device:Lcom/qonversion/android/sdk/internal/dto/Environment;

    return-object v0
.end method

.method public final getHistory()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->history:Ljava/util/List;

    return-object v0
.end method

.method public getInstallDate()J
    .locals 2

    .line 10
    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->installDate:J

    return-wide v0
.end method

.method public getReceipt()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->receipt:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->installDate:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->device:Lcom/qonversion/android/sdk/internal/dto/Environment;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/Environment;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->version:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->accessToken:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->clientUid:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->receipt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->debugMode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->history:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->installDate:J

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->device:Lcom/qonversion/android/sdk/internal/dto/Environment;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->version:Ljava/lang/String;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->accessToken:Ljava/lang/String;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->clientUid:Ljava/lang/String;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->receipt:Ljava/lang/String;

    iget-object v7, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->debugMode:Ljava/lang/String;

    iget-object v8, p0, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;->history:Ljava/util/List;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "RestoreRequest(installDate="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accessToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", clientUid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", receipt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", debugMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", history="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
