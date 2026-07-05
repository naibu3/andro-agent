.class public final Lcom/qonversion/android/sdk/internal/UtilsKt;
.super Ljava/lang/Object;
.source "utils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0008*\u00020\t8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "daysToMs",
        "",
        "",
        "getDaysToMs",
        "(I)J",
        "daysToSeconds",
        "getDaysToSeconds",
        "shouldFireFallback",
        "",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "getShouldFireFallback",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)Z",
        "sdk_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getDaysToMs(I)J
    .locals 4

    .line 8
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getDaysToSeconds(I)J

    move-result-wide v0

    const/16 p0, 0x3e8

    int-to-long v2, p0

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static final getDaysToSeconds(I)J
    .locals 4

    int-to-long v0, p0

    const-wide/16 v2, 0x18

    mul-long/2addr v0, v2

    const/16 p0, 0x3c

    int-to-long v2, p0

    mul-long/2addr v0, v2

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static final getShouldFireFallback(Lcom/qonversion/android/sdk/dto/QonversionError;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QonversionError;->getCode()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object v0

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    .line 13
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QonversionError;->getHttpCode$sdk_release()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isInternalServerError(I)Z

    move-result p0

    if-ne p0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method
