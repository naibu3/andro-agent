.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;
.super Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;
.source "FinancialConnectionsSheetState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FinishWithResult"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;",
        "result",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "finishToast",
        "",
        "<init>",
        "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)V",
        "getResult",
        "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "getFinishToast",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "copy",
        "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;",
        "equals",
        "",
        "other",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final finishToast:Ljava/lang/Integer;

.field private final result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 110
    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 108
    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    .line 109
    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->finishToast:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 107
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->finishToast:Ljava/lang/Integer;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->copy(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->finishToast:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->finishToast:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->finishToast:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFinishToast()Ljava/lang/Integer;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->finishToast:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getResult()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->finishToast:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->result:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;->finishToast:Ljava/lang/Integer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "FinishWithResult(result="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", finishToast="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
