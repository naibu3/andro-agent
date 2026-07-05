.class public interface abstract Lcom/stripe/android/link/injection/NativeLinkModule;
.super Ljava/lang/Object;
.source "NativeLinkModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/NativeLinkModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 72\u00020\u0001:\u00017J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\'J\u0010\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020$H\'J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\'J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020+H\'J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020.H\'J\u0010\u0010/\u001a\u0002002\u0006\u0010\u0010\u001a\u000201H\'J\u0010\u00102\u001a\u0002032\u0006\u0010\u0010\u001a\u000204H\'J\u0010\u00105\u001a\u0002062\u0006\u0010\u0010\u001a\u000204H\'\u00a8\u00068"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/NativeLinkModule;",
        "",
        "bindLinkRepository",
        "Lcom/stripe/android/link/repositories/LinkRepository;",
        "linkApiRepository",
        "Lcom/stripe/android/link/repositories/LinkApiRepository;",
        "bindLinkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;",
        "bindLinkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/DefaultLinkAccountManager;",
        "bindsNavigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "impl",
        "Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;",
        "bindsErrorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/RealErrorReporter;",
        "bindsCardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "defaultCardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;",
        "bindsEventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;",
        "bindsLinkGate",
        "Lcom/stripe/android/link/gate/LinkGate;",
        "linkGate",
        "Lcom/stripe/android/link/gate/DefaultLinkGate;",
        "bindsLinkAuth",
        "Lcom/stripe/android/link/account/LinkAuth;",
        "Lcom/stripe/android/link/account/DefaultLinkAuth;",
        "bindsLinkAttestationCheck",
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
        "linkAttestationCheck",
        "Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;",
        "bindsUserFacingLogger",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
        "Lcom/stripe/android/core/utils/RealUserFacingLogger;",
        "bindsAnalyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "bindsDismissalCoordinator",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "Lcom/stripe/android/link/RealLinkDismissalCoordinator;",
        "bindsAutocompleteActivityLauncher",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;",
        "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
        "bindsAutocompleteLauncher",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;",
        "Companion",
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
.field public static final Companion:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;->$$INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    sput-object v0, Lcom/stripe/android/link/injection/NativeLinkModule;->Companion:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindLinkAccountManager(Lcom/stripe/android/link/account/DefaultLinkAccountManager;)Lcom/stripe/android/link/account/LinkAccountManager;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindLinkEventsReporter(Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;)Lcom/stripe/android/link/analytics/LinkEventsReporter;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindLinkRepository(Lcom/stripe/android/link/repositories/LinkApiRepository;)Lcom/stripe/android/link/repositories/LinkRepository;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsAnalyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsAutocompleteActivityLauncher(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsAutocompleteLauncher(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCardAccountRangeRepositoryFactory(Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;)Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsDismissalCoordinator(Lcom/stripe/android/link/RealLinkDismissalCoordinator;)Lcom/stripe/android/link/LinkDismissalCoordinator;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsErrorReporter(Lcom/stripe/android/payments/core/analytics/RealErrorReporter;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsEventReporter(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkAttestationCheck(Lcom/stripe/android/link/attestation/DefaultLinkAttestationCheck;)Lcom/stripe/android/link/attestation/LinkAttestationCheck;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkAuth(Lcom/stripe/android/link/account/DefaultLinkAuth;)Lcom/stripe/android/link/account/LinkAuth;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkGate(Lcom/stripe/android/link/gate/DefaultLinkGate;)Lcom/stripe/android/link/gate/LinkGate;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsNavigationManager(Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .annotation runtime Lcom/stripe/android/link/injection/NativeLinkScope;
    .end annotation

    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsUserFacingLogger(Lcom/stripe/android/core/utils/RealUserFacingLogger;)Lcom/stripe/android/core/utils/UserFacingLogger;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
