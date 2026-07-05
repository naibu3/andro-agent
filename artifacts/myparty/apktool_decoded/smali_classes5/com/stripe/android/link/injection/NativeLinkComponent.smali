.class public interface abstract Lcom/stripe/android/link/injection/NativeLinkComponent;
.super Ljava/lang/Object;
.source "NativeLinkComponent.kt"


# annotations
.annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
.end annotation

.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/link/injection/NativeLinkModule;,
        Lcom/stripe/android/link/injection/LinkViewModelModule;,
        Lcom/stripe/android/common/di/ApplicationIdModule;,
        Lcom/stripe/android/paymentelement/confirmation/injection/DefaultConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationModule;,
        Lcom/stripe/android/ui/core/di/CardScanModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/NativeLinkComponent$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008a\u0018\u00002\u00020\u0001:\u0001BR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0012\u0010\"\u001a\u00020#X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0012\u0010&\u001a\u00020\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0012\u0010*\u001a\u00020+X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-R\u0012\u0010.\u001a\u00020/X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u0012\u00102\u001a\u000203X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u00105R\u0012\u00106\u001a\u000207X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0012\u0010:\u001a\u00020;X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010=R\u0012\u0010>\u001a\u00020?X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010A\u00a8\u0006C"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/NativeLinkComponent;",
        "",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "getLinkAccountManager",
        "()Lcom/stripe/android/link/account/LinkAccountManager;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "getConfiguration",
        "()Lcom/stripe/android/link/LinkConfiguration;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "getLinkEventsReporter",
        "()Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "getErrorReporter",
        "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "linkConfirmationHandlerFactory",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
        "getLinkConfirmationHandlerFactory",
        "()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
        "webLinkActivityContract",
        "Lcom/stripe/android/link/WebLinkActivityContract;",
        "getWebLinkActivityContract",
        "()Lcom/stripe/android/link/WebLinkActivityContract;",
        "cardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "getCardAccountRangeRepositoryFactory",
        "()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "linkAuth",
        "Lcom/stripe/android/link/account/LinkAuth;",
        "getLinkAuth",
        "()Lcom/stripe/android/link/account/LinkAuth;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "getSavedStateHandle",
        "()Landroidx/lifecycle/SavedStateHandle;",
        "viewModel",
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "getViewModel",
        "()Lcom/stripe/android/link/LinkActivityViewModel;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "getEventReporter",
        "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "getNavigationManager",
        "()Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "dismissalCoordinator",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "getDismissalCoordinator",
        "()Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "getLinkLaunchMode",
        "()Lcom/stripe/android/link/LinkLaunchMode;",
        "autocompleteLauncher",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;",
        "getAutocompleteLauncher",
        "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;",
        "Builder",
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


# virtual methods
.method public abstract getAutocompleteLauncher()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;
.end method

.method public abstract getCardAccountRangeRepositoryFactory()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;
.end method

.method public abstract getConfiguration()Lcom/stripe/android/link/LinkConfiguration;
.end method

.method public abstract getDismissalCoordinator()Lcom/stripe/android/link/LinkDismissalCoordinator;
.end method

.method public abstract getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
.end method

.method public abstract getEventReporter()Lcom/stripe/android/paymentsheet/analytics/EventReporter;
.end method

.method public abstract getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;
.end method

.method public abstract getLinkAuth()Lcom/stripe/android/link/account/LinkAuth;
.end method

.method public abstract getLinkConfirmationHandlerFactory()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;
.end method

.method public abstract getLinkEventsReporter()Lcom/stripe/android/link/analytics/LinkEventsReporter;
.end method

.method public abstract getLinkLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;
.end method

.method public abstract getLogger()Lcom/stripe/android/core/Logger;
.end method

.method public abstract getNavigationManager()Lcom/stripe/android/uicore/navigation/NavigationManager;
.end method

.method public abstract getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;
.end method

.method public abstract getViewModel()Lcom/stripe/android/link/LinkActivityViewModel;
.end method

.method public abstract getWebLinkActivityContract()Lcom/stripe/android/link/WebLinkActivityContract;
.end method
