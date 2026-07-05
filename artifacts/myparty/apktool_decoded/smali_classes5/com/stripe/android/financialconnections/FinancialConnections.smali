.class public final Lcom/stripe/android/financialconnections/FinancialConnections;
.super Ljava/lang/Object;
.source "FinancialConnections.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005H\u0007J\u0008\u0010\t\u001a\u00020\u0007H\u0007J)\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnections;",
        "",
        "<init>",
        "()V",
        "eventListener",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;",
        "setEventListener",
        "",
        "listener",
        "clearEventListener",
        "emitEvent",
        "Lkotlin/Result;",
        "name",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;",
        "metadata",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;",
        "emitEvent-gIAlu-s$financial_connections_release",
        "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;",
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

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

.field private static eventListener:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnections;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/FinancialConnections;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/FinancialConnections;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final declared-synchronized clearEventListener()V
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lcom/stripe/android/financialconnections/FinancialConnections;

    monitor-enter v0

    const/4 v1, 0x0

    .line 28
    :try_start_0
    sput-object v1, Lcom/stripe/android/financialconnections/FinancialConnections;->eventListener:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static synthetic emitEvent-gIAlu-s$financial_connections_release$default(Lcom/stripe/android/financialconnections/FinancialConnections;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 33
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    .line 31
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final declared-synchronized setEventListener(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;)V
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-class v0, Lcom/stripe/android/financialconnections/FinancialConnections;

    monitor-enter v0

    :try_start_0
    const-string v1, "listener"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    sput-object p0, Lcom/stripe/android/financialconnections/FinancialConnections;->eventListener:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final emitEvent-gIAlu-s$financial_connections_release(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/FinancialConnections;

    .line 35
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnections;->eventListener:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;

    if-eqz v0, :cond_0

    .line 36
    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;

    invoke-direct {v1, p1, p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)V

    .line 35
    invoke-interface {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;->onEvent(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
