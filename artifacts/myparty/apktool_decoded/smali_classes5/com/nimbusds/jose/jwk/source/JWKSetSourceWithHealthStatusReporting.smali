.class public Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting;
.super Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;
.source "JWKSetSourceWithHealthStatusReporting.java"


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/ThreadSafe;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private final healthReportListener:Lcom/nimbusds/jose/util/health/HealthReportListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nimbusds/jose/util/health/HealthReportListener<",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting<",
            "TC;>;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;Lcom/nimbusds/jose/util/health/HealthReportListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSource<",
            "TC;>;",
            "Lcom/nimbusds/jose/util/health/HealthReportListener<",
            "Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting<",
            "TC;>;TC;>;)V"
        }
    .end annotation

    .line 58
    invoke-direct {p0, p1}, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWrapper;-><init>(Lcom/nimbusds/jose/jwk/source/JWKSetSource;)V

    .line 59
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iput-object p2, p0, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting;->healthReportListener:Lcom/nimbusds/jose/util/health/HealthReportListener;

    return-void
.end method


# virtual methods
.method public getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;",
            "JTC;)",
            "Lcom/nimbusds/jose/jwk/JWKSet;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/KeySourceException;
        }
    .end annotation

    .line 70
    :try_start_0
    invoke-virtual {p0}, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting;->getSource()Lcom/nimbusds/jose/jwk/source/JWKSetSource;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/nimbusds/jose/jwk/source/JWKSetSource;->getJWKSet(Lcom/nimbusds/jose/jwk/source/JWKSetCacheRefreshEvaluator;JLcom/nimbusds/jose/proc/SecurityContext;)Lcom/nimbusds/jose/jwk/JWKSet;

    move-result-object p1

    .line 71
    iget-object v0, p0, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting;->healthReportListener:Lcom/nimbusds/jose/util/health/HealthReportListener;

    new-instance v1, Lcom/nimbusds/jose/util/health/HealthReport;

    sget-object v3, Lcom/nimbusds/jose/util/health/HealthStatus;->HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v2, p0

    move-wide v4, p2

    move-object v6, p4

    :try_start_1
    invoke-direct/range {v1 .. v6}, Lcom/nimbusds/jose/util/health/HealthReport;-><init>(Ljava/lang/Object;Lcom/nimbusds/jose/util/health/HealthStatus;JLcom/nimbusds/jose/proc/SecurityContext;)V

    invoke-interface {v0, v1}, Lcom/nimbusds/jose/util/health/HealthReportListener;->notify(Lcom/nimbusds/jose/util/health/HealthReport;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v2, p0

    move-wide v4, p2

    move-object v6, p4

    :goto_0
    move-object p1, v0

    move-object v7, p1

    .line 73
    iget-object p1, v2, Lcom/nimbusds/jose/jwk/source/JWKSetSourceWithHealthStatusReporting;->healthReportListener:Lcom/nimbusds/jose/util/health/HealthReportListener;

    move-wide v8, v4

    new-instance v4, Lcom/nimbusds/jose/util/health/HealthReport;

    move-object v10, v6

    sget-object v6, Lcom/nimbusds/jose/util/health/HealthStatus;->NOT_HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;

    move-object v5, v2

    invoke-direct/range {v4 .. v10}, Lcom/nimbusds/jose/util/health/HealthReport;-><init>(Ljava/lang/Object;Lcom/nimbusds/jose/util/health/HealthStatus;Ljava/lang/Exception;JLcom/nimbusds/jose/proc/SecurityContext;)V

    invoke-interface {p1, v4}, Lcom/nimbusds/jose/util/health/HealthReportListener;->notify(Lcom/nimbusds/jose/util/health/HealthReport;)V

    .line 74
    throw v7
.end method
