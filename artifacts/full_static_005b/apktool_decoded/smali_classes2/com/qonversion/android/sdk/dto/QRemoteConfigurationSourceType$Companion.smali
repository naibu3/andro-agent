.class public final Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType$Companion;
.super Ljava/lang/Object;
.source "QRemoteConfigurationSourceType.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType$Companion;",
        "",
        "()V",
        "fromType",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;",
        "type",
        "",
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
.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x35530ba5    # -5667373.5f

    if-eq v0, v1, :cond_4

    const v1, -0x1bc6b343

    if-eq v0, v1, :cond_2

    const v1, 0x53fe2fb6

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "experiment_treatment_group"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->ExperimentTreatmentGroup:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    goto :goto_1

    .line 11
    :cond_2
    const-string v0, "remote_configuration"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 14
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->RemoteConfiguration:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    goto :goto_1

    .line 11
    :cond_4
    const-string v0, "experiment_control_group"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 15
    :goto_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->Unknown:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    goto :goto_1

    .line 12
    :cond_5
    sget-object p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->ExperimentControlGroup:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    :goto_1
    return-object p1
.end method
