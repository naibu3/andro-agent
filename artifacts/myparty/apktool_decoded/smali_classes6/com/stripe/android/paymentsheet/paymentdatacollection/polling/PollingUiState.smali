.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;
.super Ljava/lang/Object;
.source "PollingViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J.\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
        "",
        "durationRemaining",
        "Lkotlin/time/Duration;",
        "ctaText",
        "",
        "pollingState",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;",
        "<init>",
        "(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getDurationRemaining-UwyO8pc",
        "()J",
        "J",
        "getCtaText",
        "()I",
        "getPollingState",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;",
        "component1",
        "component1-UwyO8pc",
        "component2",
        "component3",
        "copy",
        "copy-KLykuaI",
        "(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "paymentsheet_release"
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
.field private final ctaText:I

.field private final durationRemaining:J

.field private final pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V
    .locals 1

    const-string v0, "pollingState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-wide p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    .line 81
    iput p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->ctaText:I

    .line 82
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    return-void
.end method

.method public synthetic constructor <init>(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 82
    sget-object p4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Active:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    :cond_0
    move-object v4, p4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    .line 79
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;-><init>(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;-><init>(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V

    return-void
.end method

.method public static synthetic copy-KLykuaI$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->ctaText:I

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->copy-KLykuaI(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1-UwyO8pc()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->ctaText:I

    return v0
.end method

.method public final component3()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    return-object v0
.end method

.method public final copy-KLykuaI(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;
    .locals 7

    const-string v0, "pollingState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const/4 v6, 0x0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;-><init>(JILcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    iget-wide v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    iget-wide v5, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->ctaText:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->ctaText:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCtaText()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->ctaText:I

    return v0
.end method

.method public final getDurationRemaining-UwyO8pc()J
    .locals 2

    .line 80
    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    return-wide v0
.end method

.method public final getPollingState()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->ctaText:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->durationRemaining:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->ctaText:I

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->pollingState:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PollingUiState(durationRemaining="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", ctaText="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pollingState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
