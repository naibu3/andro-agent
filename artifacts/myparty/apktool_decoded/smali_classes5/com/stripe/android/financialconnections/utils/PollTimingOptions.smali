.class public final Lcom/stripe/android/financialconnections/utils/PollTimingOptions;
.super Ljava/lang/Object;
.source "Errors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/utils/PollTimingOptions;",
        "",
        "initialDelayMs",
        "",
        "maxNumberOfRetries",
        "",
        "retryInterval",
        "<init>",
        "(JIJ)V",
        "getInitialDelayMs",
        "()J",
        "getMaxNumberOfRetries",
        "()I",
        "getRetryInterval",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "financial-connections_release"
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
.field private final initialDelayMs:J

.field private final maxNumberOfRetries:I

.field private final retryInterval:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v6, 0x7

    const/4 v7, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;-><init>(JIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JIJ)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-wide p1, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->initialDelayMs:J

    .line 46
    iput p3, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->maxNumberOfRetries:I

    .line 47
    iput-wide p4, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->retryInterval:J

    return-void
.end method

.method public synthetic constructor <init>(JIJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 45
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const-wide/high16 p1, 0x3ffc000000000000L    # 1.75

    sget-object p7, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2, p7}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide p1

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/16 p3, 0xb4

    :cond_1
    move v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    .line 47
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const-wide/high16 p1, 0x3fd0000000000000L    # 0.25

    sget-object p3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2, p3}, Lkotlin/time/DurationKt;->toDuration(DLkotlin/time/DurationUnit;)J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide p4

    :cond_2
    move-object v0, p0

    move-wide v4, p4

    .line 44
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;-><init>(JIJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/utils/PollTimingOptions;JIJILjava/lang/Object;)Lcom/stripe/android/financialconnections/utils/PollTimingOptions;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->initialDelayMs:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->maxNumberOfRetries:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget-wide p4, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->retryInterval:J

    :cond_2
    move-object v0, p0

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->copy(JIJ)Lcom/stripe/android/financialconnections/utils/PollTimingOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->initialDelayMs:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->maxNumberOfRetries:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->retryInterval:J

    return-wide v0
.end method

.method public final copy(JIJ)Lcom/stripe/android/financialconnections/utils/PollTimingOptions;
    .locals 6

    new-instance v0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;

    move-wide v1, p1

    move v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;-><init>(JIJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;

    iget-wide v3, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->initialDelayMs:J

    iget-wide v5, p1, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->initialDelayMs:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->maxNumberOfRetries:I

    iget v3, p1, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->maxNumberOfRetries:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->retryInterval:J

    iget-wide v5, p1, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->retryInterval:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getInitialDelayMs()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->initialDelayMs:J

    return-wide v0
.end method

.method public final getMaxNumberOfRetries()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->maxNumberOfRetries:I

    return v0
.end method

.method public final getRetryInterval()J
    .locals 2

    .line 47
    iget-wide v0, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->retryInterval:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->initialDelayMs:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->maxNumberOfRetries:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->retryInterval:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->initialDelayMs:J

    iget v2, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->maxNumberOfRetries:I

    iget-wide v3, p0, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;->retryInterval:J

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PollTimingOptions(initialDelayMs="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxNumberOfRetries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", retryInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
