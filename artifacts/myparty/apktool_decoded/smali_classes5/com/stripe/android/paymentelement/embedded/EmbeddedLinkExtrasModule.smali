.class public interface abstract Lcom/stripe/android/paymentelement/embedded/EmbeddedLinkExtrasModule;
.super Ljava/lang/Object;
.source "EmbeddedLinkExtrasModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/link/injection/LinkCommonModule;
    }
    subcomponents = {
        Lcom/stripe/android/link/injection/LinkAnalyticsComponent;,
        Lcom/stripe/android/link/injection/LinkComponent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\'\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedLinkExtrasModule;",
        "",
        "bindLinkGateFactory",
        "Lcom/stripe/android/link/gate/LinkGate$Factory;",
        "linkGateFactory",
        "Lcom/stripe/android/link/gate/DefaultLinkGate$Factory;",
        "bindsLinkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "impl",
        "Lcom/stripe/android/link/RealLinkConfigurationCoordinator;",
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
.method public abstract bindLinkGateFactory(Lcom/stripe/android/link/gate/DefaultLinkGate$Factory;)Lcom/stripe/android/link/gate/LinkGate$Factory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkConfigurationCoordinator(Lcom/stripe/android/link/RealLinkConfigurationCoordinator;)Lcom/stripe/android/link/LinkConfigurationCoordinator;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
