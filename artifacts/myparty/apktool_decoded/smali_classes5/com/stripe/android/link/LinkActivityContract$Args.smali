.class public final Lcom/stripe/android/link/LinkActivityContract$Args;
.super Ljava/lang/Object;
.source "LinkActivityContract.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkActivityContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Args"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0015J\u000e\u0010\u0016\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0017J\u000e\u0010\u0018\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0019J\u000e\u0010\u001a\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\u0008\u001bJ6\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c0\u0001\u00a2\u0006\u0002\u0008\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0008\u001a\u00020\tX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkExpressMode",
        "Lcom/stripe/android/link/LinkExpressMode;",
        "linkAccountInfo",
        "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
        "launchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;)V",
        "getConfiguration$paymentsheet_release",
        "()Lcom/stripe/android/link/LinkConfiguration;",
        "getLinkExpressMode$paymentsheet_release",
        "()Lcom/stripe/android/link/LinkExpressMode;",
        "getLinkAccountInfo$paymentsheet_release",
        "()Lcom/stripe/android/link/LinkAccountUpdate$Value;",
        "getLaunchMode$paymentsheet_release",
        "()Lcom/stripe/android/link/LinkLaunchMode;",
        "component1",
        "component1$paymentsheet_release",
        "component2",
        "component2$paymentsheet_release",
        "component3",
        "component3$paymentsheet_release",
        "component4",
        "component4$paymentsheet_release",
        "copy",
        "copy$paymentsheet_release",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private final launchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private final linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

.field private final linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkExpressMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 40
    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    .line 41
    iput-object p3, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    .line 42
    iput-object p4, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->launchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-void
.end method

.method public static synthetic copy$paymentsheet_release$default(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;ILjava/lang/Object;)Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->launchMode:Lcom/stripe/android/link/LinkLaunchMode;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/LinkActivityContract$Args;->copy$paymentsheet_release(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1$paymentsheet_release()Lcom/stripe/android/link/LinkConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object v0
.end method

.method public final component2$paymentsheet_release()Lcom/stripe/android/link/LinkExpressMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    return-object v0
.end method

.method public final component3$paymentsheet_release()Lcom/stripe/android/link/LinkAccountUpdate$Value;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    return-object v0
.end method

.method public final component4$paymentsheet_release()Lcom/stripe/android/link/LinkLaunchMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->launchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object v0
.end method

.method public final copy$paymentsheet_release(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkExpressMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/link/LinkActivityContract$Args;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/LinkActivityContract$Args;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityContract$Args;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityContract$Args;->linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->launchMode:Lcom/stripe/android/link/LinkLaunchMode;

    iget-object p1, p1, Lcom/stripe/android/link/LinkActivityContract$Args;->launchMode:Lcom/stripe/android/link/LinkLaunchMode;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getConfiguration$paymentsheet_release()Lcom/stripe/android/link/LinkConfiguration;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object v0
.end method

.method public final getLaunchMode$paymentsheet_release()Lcom/stripe/android/link/LinkLaunchMode;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->launchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object v0
.end method

.method public final getLinkAccountInfo$paymentsheet_release()Lcom/stripe/android/link/LinkAccountUpdate$Value;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    return-object v0
.end method

.method public final getLinkExpressMode$paymentsheet_release()Lcom/stripe/android/link/LinkExpressMode;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkExpressMode;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->launchMode:Lcom/stripe/android/link/LinkLaunchMode;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    iget-object v2, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->linkAccountInfo:Lcom/stripe/android/link/LinkAccountUpdate$Value;

    iget-object v3, p0, Lcom/stripe/android/link/LinkActivityContract$Args;->launchMode:Lcom/stripe/android/link/LinkLaunchMode;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Args(configuration="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", linkExpressMode="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkAccountInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", launchMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
