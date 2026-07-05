.class public final Lcom/qonversion/android/sdk/dto/QRemoteConfigList;
.super Ljava/lang/Object;
.source "QRemoteConfigList.kt"


# annotations
.annotation runtime Lcom/squareup/moshi/JsonClass;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQRemoteConfigList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRemoteConfigList.kt\ncom/qonversion/android/sdk/dto/QRemoteConfigList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0015\u0008\u0000\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\u000c\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
        "",
        "remoteConfigs",
        "",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "(Ljava/util/List;)V",
        "remoteConfigForEmptyContextKey",
        "getRemoteConfigForEmptyContextKey",
        "()Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "getRemoteConfigs",
        "()Ljava/util/List;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "remoteConfigForContextKey",
        "key",
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
.field private final remoteConfigForEmptyContextKey:Lcom/qonversion/android/sdk/dto/QRemoteConfig;

.field private final remoteConfigs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;)V"
        }
    .end annotation

    const-string v0, "remoteConfigs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    .line 12
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 13
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 12
    :goto_0
    check-cast v0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigForEmptyContextKey:Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QRemoteConfigList;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->copy(Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QRemoteConfigList;
    .locals 1
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

    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getRemoteConfigForEmptyContextKey()Lcom/qonversion/android/sdk/dto/QRemoteConfig;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigForEmptyContextKey:Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    return-object v0
.end method

.method public final getRemoteConfigs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final remoteConfigForContextKey(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigs:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QRemoteConfigList(remoteConfigs="

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
