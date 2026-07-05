.class public final Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;
.super Ljava/lang/Object;
.source "NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
        ">;"
    }
.end annotation


# instance fields
.field private final factoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;",
            ">;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;->factoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;",
            ">;)",
            "Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;",
            ">;)",
            "Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static provideLinkConfirmationHandlerFactory(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;
    .locals 1

    .line 55
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule;->Companion:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;->provideLinkConfirmationHandlerFactory(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;->factoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;

    invoke-static {v0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;->provideLinkConfirmationHandlerFactory(Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLinkConfirmationHandlerFactoryFactory;->get()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;

    move-result-object v0

    return-object v0
.end method
