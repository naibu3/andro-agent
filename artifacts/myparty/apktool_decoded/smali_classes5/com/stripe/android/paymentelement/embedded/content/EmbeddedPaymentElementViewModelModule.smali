.class public interface abstract Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelModule;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElementViewModelComponent.kt"


# annotations
.annotation runtime Ldagger/Module;
    subcomponents = {
        Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementSubcomponent;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 92\u00020\u0001:\u00019J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u001cH\'J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\'J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\'J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\'J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\'J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u001f\u001a\u00020/H\'J\u0010\u00100\u001a\u0002012\u0006\u0010\u001f\u001a\u000202H\'J\u0010\u00103\u001a\u0002042\u0006\u0010\u0018\u001a\u000205H\'J\u0010\u00106\u001a\u0002072\u0006\u0010\u0014\u001a\u000208H\'\u00a8\u0006:"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelModule;",
        "",
        "bindsEmbeddedStateHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
        "stateHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedStateHelper;",
        "bindsPaymentOptionDisplayDataHolder",
        "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;",
        "paymentOptionDisplayDataHolder",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;",
        "bindConfigurationCoordinator",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;",
        "configurationCoordinator",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationCoordinator;",
        "bindsCardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "defaultCardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;",
        "bindsConfigurationHandler",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationHandler;",
        "handler",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler;",
        "bindsLinkHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;",
        "helper",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedLinkHelper;",
        "bindsWalletsHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;",
        "bindsElementsSessionRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "impl",
        "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;",
        "bindPaymentElementLoader",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;",
        "loader",
        "Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;",
        "bindRetrieveCustomerEmail",
        "Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;",
        "retrieveCustomerEmail",
        "Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;",
        "bindSelectionChooser",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSelectionChooser;",
        "chooser",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSelectionChooser;",
        "bindsUserFacingLogger",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
        "Lcom/stripe/android/core/utils/RealUserFacingLogger;",
        "bindsLinkAccountStatusProvider",
        "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
        "Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;",
        "bindsEmbeddedContentHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;",
        "bindsEmbeddedRowSelectionImmediateActionHandler",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;",
        "Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;",
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
.field public static final Companion:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelModule$Companion;->$$INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelModule$Companion;

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelModule;->Companion:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementViewModelModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindConfigurationCoordinator(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationCoordinator;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindPaymentElementLoader(Lcom/stripe/android/paymentsheet/state/DefaultPaymentElementLoader;)Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindRetrieveCustomerEmail(Lcom/stripe/android/paymentsheet/state/DefaultRetrieveCustomerEmail;)Lcom/stripe/android/paymentsheet/state/RetrieveCustomerEmail;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindSelectionChooser(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSelectionChooser;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSelectionChooser;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCardAccountRangeRepositoryFactory(Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;)Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsConfigurationHandler(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationHandler;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsElementsSessionRepository(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsEmbeddedContentHelper(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedContentHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsEmbeddedRowSelectionImmediateActionHandler(Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedRowSelectionImmediateActionHandler;)Lcom/stripe/android/paymentelement/embedded/EmbeddedRowSelectionImmediateActionHandler;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsEmbeddedStateHelper(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedStateHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkAccountStatusProvider(Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;)Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsLinkHelper(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedLinkHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedLinkHelper;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsPaymentOptionDisplayDataHolder(Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;)Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsUserFacingLogger(Lcom/stripe/android/core/utils/RealUserFacingLogger;)Lcom/stripe/android/core/utils/UserFacingLogger;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsWalletsHelper(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedWalletsHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedWalletsHelper;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
