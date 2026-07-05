.class public final Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory_Impl;
.super Ljava/lang/Object;
.source "NetworkingSaveToLinkVerificationViewModel_Factory_Impl.java"

# interfaces
.implements Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel$Factory;


# instance fields
.field private final delegateFactory:Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory_Impl;->delegateFactory:Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;

    return-void
.end method

.method public static create(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;)Ljavax/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;",
            ")",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel$Factory;",
            ">;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory_Impl;-><init>(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;)V

    invoke-static {v0}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p0

    return-object p0
.end method

.method public static createFactoryProvider(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;)Ldagger/internal/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;",
            ")",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel$Factory;",
            ">;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory_Impl;-><init>(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;)V

    invoke-static {v0}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;)Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory_Impl;->delegateFactory:Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel_Factory;->get(Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationState;)Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel;

    move-result-object p1

    return-object p1
.end method
