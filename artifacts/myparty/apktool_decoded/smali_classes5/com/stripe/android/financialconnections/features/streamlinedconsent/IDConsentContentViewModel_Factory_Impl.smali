.class public final Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory_Impl;
.super Ljava/lang/Object;
.source "IDConsentContentViewModel_Factory_Impl.java"

# interfaces
.implements Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;


# instance fields
.field private final delegateFactory:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory_Impl;->delegateFactory:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;

    return-void
.end method

.method public static create(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;)Ljavax/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;",
            ")",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;",
            ">;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory_Impl;-><init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;)V

    invoke-static {v0}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p0

    return-object p0
.end method

.method public static createFactoryProvider(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;)Ldagger/internal/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;",
            ")",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;",
            ">;"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory_Impl;-><init>(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;)V

    invoke-static {v0}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory_Impl;->delegateFactory:Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel_Factory;->get(Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;)Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel;

    move-result-object p1

    return-object p1
.end method
