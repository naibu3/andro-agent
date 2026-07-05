.class public final Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;
.super Ljava/lang/Object;
.source "ErrorViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/error/ErrorState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;",
        "",
        "error",
        "",
        "disableLinkMoreAccounts",
        "",
        "allowManualEntry",
        "<init>",
        "(Ljava/lang/Throwable;ZZ)V",
        "getError",
        "()Ljava/lang/Throwable;",
        "getDisableLinkMoreAccounts",
        "()Z",
        "getAllowManualEntry",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final allowManualEntry:Z

.field private final disableLinkMoreAccounts:Z

.field private final error:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;ZZ)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->error:Ljava/lang/Throwable;

    .line 143
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->disableLinkMoreAccounts:Z

    .line 144
    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->allowManualEntry:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;Ljava/lang/Throwable;ZZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->error:Ljava/lang/Throwable;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->disableLinkMoreAccounts:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->allowManualEntry:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->copy(Ljava/lang/Throwable;ZZ)Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->disableLinkMoreAccounts:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->allowManualEntry:Z

    return v0
.end method

.method public final copy(Ljava/lang/Throwable;ZZ)Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;-><init>(Ljava/lang/Throwable;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->error:Ljava/lang/Throwable;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->error:Ljava/lang/Throwable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->disableLinkMoreAccounts:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->disableLinkMoreAccounts:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->allowManualEntry:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->allowManualEntry:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAllowManualEntry()Z
    .locals 1

    .line 144
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->allowManualEntry:Z

    return v0
.end method

.method public final getDisableLinkMoreAccounts()Z
    .locals 1

    .line 143
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->disableLinkMoreAccounts:Z

    return v0
.end method

.method public final getError()Ljava/lang/Throwable;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->error:Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Throwable;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->disableLinkMoreAccounts:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->allowManualEntry:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->error:Ljava/lang/Throwable;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->disableLinkMoreAccounts:Z

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/error/ErrorState$Payload;->allowManualEntry:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Payload(error="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", disableLinkMoreAccounts="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowManualEntry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
