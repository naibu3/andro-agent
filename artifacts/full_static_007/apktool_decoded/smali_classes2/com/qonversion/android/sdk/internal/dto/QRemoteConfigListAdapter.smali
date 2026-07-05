.class public final Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigListAdapter;
.super Ljava/lang/Object;
.source "QonversionMappingAdapters.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0003\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigListAdapter;",
        "",
        "()V",
        "fromJson",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
        "remoteConfigs",
        "",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "toJson",
        "remoteConfigList",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final toJson(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)Ljava/util/List;
    .locals 0
    .annotation runtime Lcom/squareup/moshi/ToJson;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
            ")",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 193
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method public final fromJson(Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QRemoteConfigList;
    .locals 1
    .annotation runtime Lcom/squareup/moshi/FromJson;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;"
        }
    .end annotation

    const-string v0, "remoteConfigs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 202
    :cond_0
    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;-><init>(Ljava/util/List;)V

    return-object v0
.end method
