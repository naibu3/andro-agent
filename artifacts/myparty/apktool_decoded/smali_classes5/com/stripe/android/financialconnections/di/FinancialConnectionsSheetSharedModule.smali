.class public interface abstract Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetSharedModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0008H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H\'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\'\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;",
        "",
        "bindsAnalyticsRequestV2Storage",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;",
        "impl",
        "Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;",
        "bindsAnalyticsRequestV2Executor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;",
        "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;",
        "bindsConsumerSessionRepository",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;",
        "Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;",
        "bindsConsumerSessionProvider",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;",
        "bindsIsLinkWithStripe",
        "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;",
        "Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;",
        "bindsIsNetworkingRelinkSession",
        "Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;",
        "Lcom/stripe/android/financialconnections/domain/RealIsNetworkingRelinkSession;",
        "bindsContext",
        "Landroid/content/Context;",
        "application",
        "Landroid/app/Application;",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$Companion;->$$INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$Companion;

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule;->Companion:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindsAnalyticsRequestV2Executor(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsAnalyticsRequestV2Storage(Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsConsumerSessionProvider(Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;)Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsConsumerSessionRepository(Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;)Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsContext(Landroid/app/Application;)Landroid/content/Context;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsIsLinkWithStripe(Lcom/stripe/android/financialconnections/domain/RealIsLinkWithStripe;)Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsIsNetworkingRelinkSession(Lcom/stripe/android/financialconnections/domain/RealIsNetworkingRelinkSession;)Lcom/stripe/android/financialconnections/domain/IsNetworkingRelinkSession;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
