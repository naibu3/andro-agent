.class public abstract Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;
.super Ljava/lang/Object;
.source "AuthSessionEvent.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;,
        Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;,
        Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Launched;,
        Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Loaded;,
        Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$OAuthLaunched;,
        Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;,
        Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B/\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;",
        "",
        "name",
        "",
        "timestamp",
        "Ljava/util/Date;",
        "rawEventDetails",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V",
        "getName",
        "()Ljava/lang/String;",
        "getTimestamp",
        "()Ljava/util/Date;",
        "getRawEventDetails",
        "()Ljava/util/Map;",
        "toMap",
        "Launched",
        "OAuthLaunched",
        "Loaded",
        "Success",
        "Failure",
        "Cancel",
        "Retry",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Launched;",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Loaded;",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$OAuthLaunched;",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;",
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
.field private final name:Ljava/lang/String;

.field private final rawEventDetails:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final timestamp:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->name:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->timestamp:Ljava/util/Date;

    .line 10
    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->rawEventDetails:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 10
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    :cond_0
    const/4 p4, 0x0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRawEventDetails()Ljava/util/Map;
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

    .line 10
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->rawEventDetails:Ljava/util/Map;

    return-object v0
.end method

.method public getTimestamp()Ljava/util/Date;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->timestamp:Ljava/util/Date;

    return-object v0
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

    const/4 v0, 0x4

    .line 67
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "event_namespace"

    const-string v2, "partner-auth-lifecycle"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 68
    const-string v1, "event_name"

    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->name:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 69
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->getTimestamp()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "client_timestamp"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 70
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->getRawEventDetails()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "raw_event_details"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 66
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
