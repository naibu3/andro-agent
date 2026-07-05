.class public final Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;
.super Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.source "PaymentSheetEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ExperimentExposure"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentSheetEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetEvent.kt\ncom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,846:1\n477#2:847\n423#2:848\n1246#3,4:849\n*S KotlinDebug\n*F\n+ 1 PaymentSheetEvent.kt\ncom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure\n*L\n673#1:847\n673#1:848\n673#1:849,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;",
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;",
        "isDeferred",
        "",
        "isSpt",
        "linkEnabled",
        "googlePaySupported",
        "experiment",
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;",
        "<init>",
        "(ZZZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment;)V",
        "()Z",
        "getLinkEnabled",
        "getGooglePaySupported",
        "eventName",
        "",
        "getEventName",
        "()Ljava/lang/String;",
        "additionalParams",
        "",
        "",
        "getAdditionalParams",
        "()Ljava/util/Map;",
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
.field private final additionalParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final eventName:Ljava/lang/String;

.field private final googlePaySupported:Z

.field private final isDeferred:Z

.field private final isSpt:Z

.field private final linkEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment;)V
    .locals 2

    const-string v0, "experiment"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 667
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 662
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->isDeferred:Z

    .line 663
    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->isSpt:Z

    .line 664
    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->linkEnabled:Z

    .line 665
    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->googlePaySupported:Z

    .line 668
    const-string p1, "elements.experiment_exposure"

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->eventName:Ljava/lang/String;

    const/4 p1, 0x3

    .line 670
    new-array p1, p1, [Lkotlin/Pair;

    invoke-virtual {p5}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->getExperiment()Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;->getExperimentValue()Ljava/lang/String;

    move-result-object p2

    const-string p3, "experiment_retrieved"

    invoke-static {p3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x0

    aput-object p2, p1, p3

    .line 671
    const-string p2, "arb_id"

    invoke-virtual {p5}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->getArbId()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    .line 672
    const-string p2, "assignment_group"

    invoke-virtual {p5}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->getGroup()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x2

    aput-object p2, p1, p3

    .line 669
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 673
    invoke-virtual {p5}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;->getDimensions()Ljava/util/Map;

    move-result-object p2

    .line 847
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p4

    invoke-static {p4}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast p3, Ljava/util/Map;

    .line 848
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 849
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 850
    check-cast p4, Ljava/util/Map$Entry;

    .line 673
    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dimensions-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    .line 848
    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    .line 850
    invoke-interface {p3, p5, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 669
    :cond_0
    invoke-static {p1, p3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->additionalParams:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method protected getAdditionalParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 669
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->additionalParams:Ljava/util/Map;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 668
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method protected getGooglePaySupported()Z
    .locals 1

    .line 665
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->googlePaySupported:Z

    return v0
.end method

.method protected getLinkEnabled()Z
    .locals 1

    .line 664
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->linkEnabled:Z

    return v0
.end method

.method protected isDeferred()Z
    .locals 1

    .line 662
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->isDeferred:Z

    return v0
.end method

.method protected isSpt()Z
    .locals 1

    .line 663
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ExperimentExposure;->isSpt:Z

    return v0
.end method
