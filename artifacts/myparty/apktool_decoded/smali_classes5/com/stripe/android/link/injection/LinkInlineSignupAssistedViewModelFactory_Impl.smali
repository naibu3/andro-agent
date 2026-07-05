.class public final Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory_Impl;
.super Ljava/lang/Object;
.source "LinkInlineSignupAssistedViewModelFactory_Impl.java"

# interfaces
.implements Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory;


# instance fields
.field private final delegateFactory:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory_Impl;->delegateFactory:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;

    return-void
.end method

.method public static create(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;)Ljavax/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;",
            ")",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory;",
            ">;"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory_Impl;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;)V

    invoke-static {v0}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p0

    return-object p0
.end method

.method public static createFactoryProvider(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;)Ldagger/internal/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;",
            ")",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory;",
            ">;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory_Impl;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;)V

    invoke-static {v0}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/ui/inline/UserInput;)Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory_Impl;->delegateFactory:Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;

    invoke-virtual {v0, p2, p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->get(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;)Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    move-result-object p1

    return-object p1
.end method
