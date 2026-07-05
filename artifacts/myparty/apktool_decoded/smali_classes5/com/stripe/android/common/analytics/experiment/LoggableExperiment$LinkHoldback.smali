.class public final Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;
.super Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;
.source "LoggableExperiment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LinkHoldback"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;,
        Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u000223BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0008H\u00c6\u0003J\t\u0010%\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\'\u001a\u00020\rH\u00c6\u0003J\t\u0010(\u001a\u00020\u0008H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0008H\u00c6\u0003Jo\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010,\u001a\u00020\u00082\u0008\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0018\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;",
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;",
        "arbId",
        "",
        "group",
        "experiment",
        "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
        "isReturningLinkUser",
        "",
        "useLinkNative",
        "emailRecognitionSource",
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;",
        "providedDefaultValues",
        "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;",
        "spmEnabled",
        "integrationShape",
        "linkDisplayed",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;ZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;ZLjava/lang/String;Z)V",
        "getArbId",
        "()Ljava/lang/String;",
        "getGroup",
        "getExperiment",
        "()Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;",
        "()Z",
        "getUseLinkNative",
        "getEmailRecognitionSource",
        "()Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;",
        "getProvidedDefaultValues",
        "()Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;",
        "getSpmEnabled",
        "getIntegrationShape",
        "getLinkDisplayed",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "EmailRecognitionSource",
        "ProvidedDefaultValues",
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
.field public static final $stable:I


# instance fields
.field private final arbId:Ljava/lang/String;

.field private final emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

.field private final experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

.field private final group:Ljava/lang/String;

.field private final integrationShape:Ljava/lang/String;

.field private final isReturningLinkUser:Z

.field private final linkDisplayed:Z

.field private final providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

.field private final spmEnabled:Z

.field private final useLinkNative:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;ZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;ZLjava/lang/String;Z)V
    .locals 8

    move-object/from16 v0, p9

    const-string v1, "arbId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "group"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "experiment"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "providedDefaultValues"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "integrationShape"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    .line 31
    new-array v1, v1, [Lkotlin/Pair;

    const-string v2, "integration_type"

    const-string v3, "mpe_android"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 32
    const-string v2, "is_returning_link_user"

    invoke-static {p4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 33
    const-string v2, "dvs_provided"

    invoke-virtual {p7}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;->toDimension()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 34
    const-string v2, "use_link_native"

    invoke-static {p5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    if-eqz p6, :cond_0

    .line 35
    invoke-virtual {p6}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;->getDimension()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "recognition_type"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 36
    const-string v2, "has_spms"

    invoke-static/range {p8 .. p8}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 37
    const-string v2, "integration_shape"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 38
    const-string v2, "link_displayed"

    invoke-static/range {p10 .. p10}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 30
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .line 39
    invoke-static {v1}, Lcom/stripe/android/utils/MapUtilsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v3, p3

    .line 26
    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;-><init>(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->arbId:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->group:Ljava/lang/String;

    .line 18
    iput-object p3, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    .line 19
    iput-boolean p4, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->isReturningLinkUser:Z

    .line 20
    iput-boolean p5, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->useLinkNative:Z

    .line 21
    iput-object p6, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    .line 22
    iput-object p7, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    move/from16 p1, p8

    .line 23
    iput-boolean p1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->spmEnabled:Z

    .line 24
    iput-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->integrationShape:Ljava/lang/String;

    move/from16 p1, p10

    .line 25
    iput-boolean p1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->linkDisplayed:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;ZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;ZLjava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->arbId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->group:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->isReturningLinkUser:Z

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->useLinkNative:Z

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-boolean p8, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->spmEnabled:Z

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->integrationShape:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-boolean p10, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->linkDisplayed:Z

    :cond_9
    move-object p11, p9

    move p12, p10

    move-object p9, p7

    move p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;ZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;ZLjava/lang/String;Z)Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->arbId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->linkDisplayed:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->group:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->isReturningLinkUser:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->useLinkNative:Z

    return v0
.end method

.method public final component6()Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->spmEnabled:Z

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->integrationShape:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;ZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;ZLjava/lang/String;Z)Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;
    .locals 12

    const-string v0, "arbId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "group"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experiment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "providedDefaultValues"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationShape"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;ZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;ZLjava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;

    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->arbId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->arbId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->group:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->group:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    iget-object v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->isReturningLinkUser:Z

    iget-boolean v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->isReturningLinkUser:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->useLinkNative:Z

    iget-boolean v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->useLinkNative:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    iget-object v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    iget-object v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->spmEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->spmEnabled:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->integrationShape:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->integrationShape:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->linkDisplayed:Z

    iget-boolean p1, p1, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->linkDisplayed:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public getArbId()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->arbId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmailRecognitionSource()Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    return-object v0
.end method

.method public getExperiment()Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    return-object v0
.end method

.method public getGroup()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->group:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntegrationShape()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->integrationShape:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkDisplayed()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->linkDisplayed:Z

    return v0
.end method

.method public final getProvidedDefaultValues()Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    return-object v0
.end method

.method public final getSpmEnabled()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->spmEnabled:Z

    return v0
.end method

.method public final getUseLinkNative()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->useLinkNative:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->arbId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->group:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->isReturningLinkUser:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->useLinkNative:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    invoke-virtual {v1}, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->spmEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->integrationShape:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->linkDisplayed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isReturningLinkUser()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->isReturningLinkUser:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->arbId:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->group:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->experiment:Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;

    iget-boolean v3, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->isReturningLinkUser:Z

    iget-boolean v4, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->useLinkNative:Z

    iget-object v5, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->emailRecognitionSource:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;

    iget-object v6, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->providedDefaultValues:Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;

    iget-boolean v7, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->spmEnabled:Z

    iget-object v8, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->integrationShape:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;->linkDisplayed:Z

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "LinkHoldback(arbId="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, ", group="

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", experiment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isReturningLinkUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", useLinkNative="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", emailRecognitionSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", providedDefaultValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", spmEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", integrationShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkDisplayed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
