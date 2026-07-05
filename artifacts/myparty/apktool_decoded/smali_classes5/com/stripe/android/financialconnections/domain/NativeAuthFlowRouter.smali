.class public final Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;
.super Ljava/lang/Object;
.source "NativeAuthFlowRouter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNativeAuthFlowRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeAuthFlowRouter.kt\ncom/stripe/android/financialconnections/domain/NativeAuthFlowRouter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,68:1\n1#2:69\n188#3,3:70\n*S KotlinDebug\n*F\n+ 1 NativeAuthFlowRouter.kt\ncom/stripe/android/financialconnections/domain/NativeAuthFlowRouter\n*L\n45#1:70,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
        "",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "debugConfiguration",
        "Lcom/stripe/android/financialconnections/debug/DebugConfiguration;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/debug/DebugConfiguration;)V",
        "nativeAuthFlowEnabled",
        "",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "logExposure",
        "",
        "nativeKillSwitchActive",
        "nativeExperienceEnabled",
        "shouldLogExposure",
        "Companion",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;

.field private static final EXPERIMENT_VALUE_NATIVE_TREATMENT:Ljava/lang/String; = "treatment"

.field private static final FEATURE_KEY_NATIVE_KILLSWITCH:Ljava/lang/String; = "bank_connections_mobile_native_version_killswitch"


# instance fields
.field private final debugConfiguration:Lcom/stripe/android/financialconnections/debug/DebugConfiguration;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->Companion:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/debug/DebugConfiguration;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "eventTracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugConfiguration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->debugConfiguration:Lcom/stripe/android/financialconnections/debug/DebugConfiguration;

    return-void
.end method

.method private final nativeExperienceEnabled(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 2

    .line 51
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    .line 53
    sget-object v0, Lcom/stripe/android/financialconnections/utils/Experiment;->CONNECTIONS_MOBILE_NATIVE:Lcom/stripe/android/financialconnections/utils/Experiment;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/utils/ExperimentsKt;->experimentAssignment(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/utils/Experiment;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "treatment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    return v1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method private final nativeKillSwitchActive(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 5

    .line 44
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getFeatures()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 70
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 71
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "bank_connections_mobile_native_version_killswitch"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_2
    return v2

    :cond_3
    return v0
.end method

.method private final shouldLogExposure(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 4

    .line 57
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->debugConfiguration:Lcom/stripe/android/financialconnections/debug/DebugConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/debug/DebugConfiguration;->getOverriddenNative$financial_connections_release()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 58
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-nez v0, :cond_2

    if-nez v3, :cond_2

    .line 59
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->nativeKillSwitchActive(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v2
.end method


# virtual methods
.method public final logExposure(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V
    .locals 2

    const-string v0, "manifest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->shouldLogExposure(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    .line 37
    sget-object v1, Lcom/stripe/android/financialconnections/utils/Experiment;->CONNECTIONS_MOBILE_NATIVE:Lcom/stripe/android/financialconnections/utils/Experiment;

    .line 36
    invoke-static {v0, v1, p1}, Lcom/stripe/android/financialconnections/utils/ExperimentsKt;->trackExposure(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/Experiment;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    :cond_0
    return-void
.end method

.method public final nativeAuthFlowEnabled(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 2

    const-string v0, "manifest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    sget-object v0, Lcom/stripe/android/core/utils/FeatureFlags;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlags;

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlags;->getForceEnableNativeFinancialConnections()Lcom/stripe/android/core/utils/FeatureFlag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/utils/FeatureFlag;->isEnabled()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->debugConfiguration:Lcom/stripe/android/financialconnections/debug/DebugConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/debug/DebugConfiguration;->getOverriddenNative$financial_connections_release()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 28
    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->nativeKillSwitchActive(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 29
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->nativeExperienceEnabled(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
