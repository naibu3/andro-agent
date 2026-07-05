.class public final Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;
.super Ljava/lang/Object;
.source "FinancialConnectionsEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Metadata"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010$\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0008\u0000\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J4\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c0\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;",
        "",
        "institutionName",
        "",
        "manualEntry",
        "",
        "errorCode",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)V",
        "getInstitutionName",
        "()Ljava/lang/String;",
        "getManualEntry",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getErrorCode",
        "()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;",
        "toMap",
        "",
        "component1",
        "component2",
        "component3",
        "copy",
        "copy$financial_connections_release",
        "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

.field private final institutionName:Ljava/lang/String;

.field private final manualEntry:Ljava/lang/Boolean;


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

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    .line 14
    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 11
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)V

    return-void
.end method

.method public static synthetic copy$financial_connections_release$default(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->copy$financial_connections_release(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    return-object v0
.end method

.method public final copy$financial_connections_release(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getErrorCode()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    return-object v0
.end method

.method public final getInstitutionName()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    return-object v0
.end method

.method public final getManualEntry()Ljava/lang/Boolean;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final toMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    .line 18
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "institution_name"

    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 19
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->getValue()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "error_code"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 20
    const-string v1, "manual_entry"

    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 17
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->institutionName:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->manualEntry:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;->errorCode:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Metadata(institutionName="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", manualEntry="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorCode="

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
