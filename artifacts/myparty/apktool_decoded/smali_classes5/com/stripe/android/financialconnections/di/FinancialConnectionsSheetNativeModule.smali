.class public interface abstract Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetNativeModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0008H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H\'\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;",
        "",
        "bindsPresentNoticeSheet",
        "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;",
        "impl",
        "Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;",
        "bindsNavigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;",
        "bindsHandleError",
        "Lcom/stripe/android/financialconnections/domain/HandleError;",
        "Lcom/stripe/android/financialconnections/domain/RealHandleError;",
        "bindsProvideApiRequestOptions",
        "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;",
        "bindsAttachConsumerToLinkAccountSession",
        "Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;",
        "Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;",
        "bindsCreateInstantDebitsPaymentMethod",
        "Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;",
        "Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;->$$INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;->Companion:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindsAttachConsumerToLinkAccountSession(Lcom/stripe/android/financialconnections/domain/RealAttachConsumerToLinkAccountSession;)Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCreateInstantDebitsPaymentMethod(Lcom/stripe/android/financialconnections/domain/RealCreateInstantDebitsResult;)Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsHandleError(Lcom/stripe/android/financialconnections/domain/RealHandleError;)Lcom/stripe/android/financialconnections/domain/HandleError;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsNavigationManager(Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsPresentNoticeSheet(Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;)Lcom/stripe/android/financialconnections/features/notice/PresentSheet;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsProvideApiRequestOptions(Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;)Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
