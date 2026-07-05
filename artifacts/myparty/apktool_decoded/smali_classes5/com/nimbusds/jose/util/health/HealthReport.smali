.class public Lcom/nimbusds/jose/util/health/HealthReport;
.super Ljava/lang/Object;
.source "HealthReport.java"

# interfaces
.implements Lcom/nimbusds/jose/util/events/Event;


# annotations
.annotation runtime Lcom/nimbusds/jose/shaded/jcip/Immutable;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        "C::",
        "Lcom/nimbusds/jose/proc/SecurityContext;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nimbusds/jose/util/events/Event<",
        "TS;TC;>;"
    }
.end annotation


# instance fields
.field private final context:Lcom/nimbusds/jose/proc/SecurityContext;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field

.field private final exception:Ljava/lang/Exception;

.field private final source:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field private final status:Lcom/nimbusds/jose/util/health/HealthStatus;

.field private final timestamp:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/nimbusds/jose/util/health/HealthStatus;JLcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Lcom/nimbusds/jose/util/health/HealthStatus;",
            "JTC;)V"
        }
    .end annotation

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p3

    move-object v6, p5

    .line 81
    invoke-direct/range {v0 .. v6}, Lcom/nimbusds/jose/util/health/HealthReport;-><init>(Ljava/lang/Object;Lcom/nimbusds/jose/util/health/HealthStatus;Ljava/lang/Exception;JLcom/nimbusds/jose/proc/SecurityContext;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/nimbusds/jose/util/health/HealthStatus;Ljava/lang/Exception;JLcom/nimbusds/jose/proc/SecurityContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Lcom/nimbusds/jose/util/health/HealthStatus;",
            "Ljava/lang/Exception;",
            "JTC;)V"
        }
    .end annotation

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    iput-object p1, p0, Lcom/nimbusds/jose/util/health/HealthReport;->source:Ljava/lang/Object;

    .line 104
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    iput-object p2, p0, Lcom/nimbusds/jose/util/health/HealthReport;->status:Lcom/nimbusds/jose/util/health/HealthStatus;

    if-eqz p3, :cond_1

    .line 106
    sget-object p1, Lcom/nimbusds/jose/util/health/HealthStatus;->HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;

    invoke-virtual {p1, p2}, Lcom/nimbusds/jose/util/health/HealthStatus;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 107
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Exception not accepted for a healthy status"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 109
    :cond_1
    :goto_0
    iput-object p3, p0, Lcom/nimbusds/jose/util/health/HealthReport;->exception:Ljava/lang/Exception;

    .line 110
    iput-wide p4, p0, Lcom/nimbusds/jose/util/health/HealthReport;->timestamp:J

    .line 111
    iput-object p6, p0, Lcom/nimbusds/jose/util/health/HealthReport;->context:Lcom/nimbusds/jose/proc/SecurityContext;

    return-void
.end method


# virtual methods
.method public getContext()Lcom/nimbusds/jose/proc/SecurityContext;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/nimbusds/jose/util/health/HealthReport;->context:Lcom/nimbusds/jose/proc/SecurityContext;

    return-object v0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/nimbusds/jose/util/health/HealthReport;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public getHealthStatus()Lcom/nimbusds/jose/util/health/HealthStatus;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/nimbusds/jose/util/health/HealthReport;->status:Lcom/nimbusds/jose/util/health/HealthStatus;

    return-object v0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/nimbusds/jose/util/health/HealthReport;->source:Ljava/lang/Object;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 154
    iget-wide v0, p0, Lcom/nimbusds/jose/util/health/HealthReport;->timestamp:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HealthReport{source="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    iget-object v1, p0, Lcom/nimbusds/jose/util/health/HealthReport;->source:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nimbusds/jose/util/health/HealthReport;->status:Lcom/nimbusds/jose/util/health/HealthStatus;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    const-string v1, ", exception="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nimbusds/jose/util/health/HealthReport;->exception:Ljava/lang/Exception;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/nimbusds/jose/util/health/HealthReport;->timestamp:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 165
    const-string v1, ", context="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nimbusds/jose/util/health/HealthReport;->context:Lcom/nimbusds/jose/proc/SecurityContext;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
