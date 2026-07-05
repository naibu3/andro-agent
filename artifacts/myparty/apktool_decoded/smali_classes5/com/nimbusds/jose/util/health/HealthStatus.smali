.class public final enum Lcom/nimbusds/jose/util/health/HealthStatus;
.super Ljava/lang/Enum;
.source "HealthStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nimbusds/jose/util/health/HealthStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/nimbusds/jose/util/health/HealthStatus;

.field public static final enum HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;

.field public static final enum NOT_HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;


# direct methods
.method private static synthetic $values()[Lcom/nimbusds/jose/util/health/HealthStatus;
    .locals 2

    .line 27
    sget-object v0, Lcom/nimbusds/jose/util/health/HealthStatus;->HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;

    sget-object v1, Lcom/nimbusds/jose/util/health/HealthStatus;->NOT_HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;

    filled-new-array {v0, v1}, [Lcom/nimbusds/jose/util/health/HealthStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 33
    new-instance v0, Lcom/nimbusds/jose/util/health/HealthStatus;

    const-string v1, "HEALTHY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/util/health/HealthStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/util/health/HealthStatus;->HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;

    .line 39
    new-instance v0, Lcom/nimbusds/jose/util/health/HealthStatus;

    const-string v1, "NOT_HEALTHY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/nimbusds/jose/util/health/HealthStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nimbusds/jose/util/health/HealthStatus;->NOT_HEALTHY:Lcom/nimbusds/jose/util/health/HealthStatus;

    .line 27
    invoke-static {}, Lcom/nimbusds/jose/util/health/HealthStatus;->$values()[Lcom/nimbusds/jose/util/health/HealthStatus;

    move-result-object v0

    sput-object v0, Lcom/nimbusds/jose/util/health/HealthStatus;->$VALUES:[Lcom/nimbusds/jose/util/health/HealthStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nimbusds/jose/util/health/HealthStatus;
    .locals 1

    .line 27
    const-class v0, Lcom/nimbusds/jose/util/health/HealthStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nimbusds/jose/util/health/HealthStatus;

    return-object p0
.end method

.method public static values()[Lcom/nimbusds/jose/util/health/HealthStatus;
    .locals 1

    .line 27
    sget-object v0, Lcom/nimbusds/jose/util/health/HealthStatus;->$VALUES:[Lcom/nimbusds/jose/util/health/HealthStatus;

    invoke-virtual {v0}, [Lcom/nimbusds/jose/util/health/HealthStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nimbusds/jose/util/health/HealthStatus;

    return-object v0
.end method
