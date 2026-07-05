.class public final Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;
.super Ljava/lang/Object;
.source "ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;",
        ">;"
    }
.end annotation


# instance fields
.field private final factoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;",
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
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;",
            ">;)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;->factoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;"
        }
    .end annotation

    .line 44
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static provideSavedPaymentMethodMutator(Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;)Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;
    .locals 1

    .line 54
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule;->Companion:Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;->provideSavedPaymentMethodMutator(Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;)Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;->factoryProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;->provideSavedPaymentMethodMutator(Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;)Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageModule_Companion_ProvideSavedPaymentMethodMutatorFactory;->get()Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    move-result-object v0

    return-object v0
.end method
