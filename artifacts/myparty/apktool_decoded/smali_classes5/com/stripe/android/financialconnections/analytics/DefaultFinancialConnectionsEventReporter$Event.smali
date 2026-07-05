.class final Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;
.super Ljava/lang/Object;
.source "DefaultFinancialConnectionsEventReporter.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Event"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0082\u0008\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "eventCode",
        "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;",
        "additionalParams",
        "",
        "",
        "<init>",
        "(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)V",
        "getEventCode",
        "()Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;",
        "getAdditionalParams",
        "()Ljava/util/Map;",
        "eventName",
        "getEventName",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "Code",
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


# instance fields
.field private final additionalParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

.field private final eventName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "eventCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    .line 77
    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->additionalParams:Ljava/util/Map;

    .line 80
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 77
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    .line 75
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->additionalParams:Ljava/util/Map;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->copy(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->additionalParams:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;"
        }
    .end annotation

    const-string v0, "eventCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->additionalParams:Ljava/util/Map;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->additionalParams:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAdditionalParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->additionalParams:Ljava/util/Map;

    return-object v0
.end method

.method public final getEventCode()Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->additionalParams:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->eventCode:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;->additionalParams:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Event(eventCode="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", additionalParams="

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
