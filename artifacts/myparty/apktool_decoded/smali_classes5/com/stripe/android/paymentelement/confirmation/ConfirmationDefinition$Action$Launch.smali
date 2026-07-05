.class public final Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;
.super Ljava/lang/Object;
.source "ConfirmationDefinition.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Launch"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T",
        "LauncherArgs:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action<",
        "TT",
        "LauncherArgs;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u0000*\u0004\u0008\u0005\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\u0006\u0010\u0003\u001a\u00028\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\u0011\u001a\u00028\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J4\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00050\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00028\u00052\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0005\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;",
        "TLauncherArgs",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;",
        "launcherArguments",
        "receivesResultInProcess",
        "",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "<init>",
        "(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V",
        "getLauncherArguments",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "getReceivesResultInProcess",
        "()Z",
        "getDeferredIntentConfirmationType",
        "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;",
        "equals",
        "other",
        "",
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
.field public static final $stable:I


# instance fields
.field private final deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

.field private final launcherArguments:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT",
            "LauncherArgs;"
        }
    .end annotation
.end field

.field private final receivesResultInProcess:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT",
            "LauncherArgs;",
            "Z",
            "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
            ")V"
        }
    .end annotation

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 275
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->launcherArguments:Ljava/lang/Object;

    .line 285
    iput-boolean p2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->receivesResultInProcess:Z

    .line 289
    iput-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->launcherArguments:Ljava/lang/Object;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->receivesResultInProcess:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->copy(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT",
            "LauncherArgs;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->launcherArguments:Ljava/lang/Object;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->receivesResultInProcess:Z

    return v0
.end method

.method public final component3()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    return-object v0
.end method

.method public final copy(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT",
            "LauncherArgs;",
            "Z",
            "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
            ")",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch<",
            "TT",
            "LauncherArgs;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;-><init>(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->launcherArguments:Ljava/lang/Object;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->launcherArguments:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->receivesResultInProcess:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->receivesResultInProcess:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    iget-object p1, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDeferredIntentConfirmationType()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    return-object v0
.end method

.method public final getLauncherArguments()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT",
            "LauncherArgs;"
        }
    .end annotation

    .line 275
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->launcherArguments:Ljava/lang/Object;

    return-object v0
.end method

.method public final getReceivesResultInProcess()Z
    .locals 1

    .line 285
    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->receivesResultInProcess:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->launcherArguments:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->receivesResultInProcess:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->launcherArguments:Ljava/lang/Object;

    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->receivesResultInProcess:Z

    iget-object v2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Launch(launcherArguments="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", receivesResultInProcess="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deferredIntentConfirmationType="

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
