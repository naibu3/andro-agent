.class public final Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
.super Ljava/lang/Object;
.source "NoticeSheetViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;,
        Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u0013\u0008\u0016\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\u000cJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;",
        "",
        "pane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "content",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
        "viewEffect",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;)V",
        "arguments",
        "Landroid/os/Bundle;",
        "(Landroid/os/Bundle;)V",
        "getPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getContent",
        "()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
        "getViewEffect",
        "()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "NoticeSheetContent",
        "ViewEffect",
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
.field private final content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

.field private final pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

.field private final viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 7

    .line 119
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination;->Companion:Lcom/stripe/android/financialconnections/navigation/Destination$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/navigation/Destination$Companion;->referrer$financial_connections_release(Landroid/os/Bundle;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    .line 118
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;)V
    .locals 1

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 114
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    .line 115
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 112
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;)Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;
    .locals 1

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getContent()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    return-object v0
.end method

.method public final getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getViewEffect()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->content:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState;->viewEffect:Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$ViewEffect;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NoticeSheetState(pane="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", content="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", viewEffect="

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
