.class public final Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
.super Ljava/lang/Object;
.source "IDConsentContentState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;,
        Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB3\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;",
        "",
        "payload",
        "Lcom/stripe/android/financialconnections/presentation/Async;",
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;",
        "acceptConsent",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "viewEffect",
        "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;)V",
        "getPayload",
        "()Lcom/stripe/android/financialconnections/presentation/Async;",
        "getAcceptConsent",
        "getViewEffect",
        "()Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;",
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
        "Payload",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;"
        }
    .end annotation
.end field

.field private final payload:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field private final viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;",
            ">;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;",
            ")V"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptConsent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 10
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 11
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 9
    sget-object p1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 10
    sget-object p2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p2, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->copy(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;",
            ">;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;",
            ")",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptConsent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAcceptConsent()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;"
        }
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getPayload()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;",
            ">;"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getViewEffect()Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;

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
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->acceptConsent:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;->viewEffect:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "IDConsentContentState(payload="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", acceptConsent="

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
