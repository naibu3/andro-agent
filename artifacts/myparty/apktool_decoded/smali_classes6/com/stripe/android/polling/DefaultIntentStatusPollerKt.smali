.class public final Lcom/stripe/android/polling/DefaultIntentStatusPollerKt;
.super Ljava/lang/Object;
.source "DefaultIntentStatusPoller.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "calculateDelay",
        "Lkotlin/time/Duration;",
        "attempts",
        "",
        "(I)J",
        "payments-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final calculateDelay(I)J
    .locals 4

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    int-to-double v2, p0

    add-double/2addr v2, v0

    const/4 p0, 0x2

    int-to-double v0, p0

    .line 78
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    .line 79
    sget-object p0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object p0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p0}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide v0

    return-wide v0
.end method
