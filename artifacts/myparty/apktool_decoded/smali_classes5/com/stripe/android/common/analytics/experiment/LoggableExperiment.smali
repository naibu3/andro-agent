.class public abstract Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;
.super Ljava/lang/Object;
.source "LoggableExperiment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0001\u0012B5\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u0082\u0001\u0001\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;",
        "",
        "experiment",
        "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
        "arbId",
        "",
        "group",
        "dimensions",
        "",
        "<init>",
        "(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "getExperiment",
        "()Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
        "getArbId",
        "()Ljava/lang/String;",
        "getGroup",
        "getDimensions",
        "()Ljava/util/Map;",
        "LinkHoldback",
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;",
        "paymentsheet_release"
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
.field private final arbId:Ljava/lang/String;

.field private final dimensions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

.field private final group:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    .line 11
    iput-object p2, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->arbId:Ljava/lang/String;

    .line 12
    iput-object p3, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->group:Ljava/lang/String;

    .line 13
    iput-object p4, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->dimensions:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;-><init>(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public getArbId()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->arbId:Ljava/lang/String;

    return-object v0
.end method

.method public getDimensions()Ljava/util/Map;
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

    .line 13
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->dimensions:Ljava/util/Map;

    return-object v0
.end method

.method public getExperiment()Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    return-object v0
.end method

.method public getGroup()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->group:Ljava/lang/String;

    return-object v0
.end method
