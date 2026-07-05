.class public final Lcom/qonversion/android/sdk/internal/api/Api$DefaultImpls;
.super Ljava/lang/Object;
.source "Api.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/api/Api;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic crashLogs$default(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ljava/lang/String;ILjava/lang/Object;)Lretrofit2/Call;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 81
    const-string p2, "https://sdk-logs.qonversion.io/sdk.log"

    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/api/Api;->crashLogs(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: crashLogs"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic remoteConfigList$default(Lcom/qonversion/android/sdk/internal/api/Api;Ljava/lang/String;ZILjava/lang/Object;)Lretrofit2/Call;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 90
    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/api/Api;->remoteConfigList(Ljava/lang/String;Z)Lretrofit2/Call;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: remoteConfigList"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
