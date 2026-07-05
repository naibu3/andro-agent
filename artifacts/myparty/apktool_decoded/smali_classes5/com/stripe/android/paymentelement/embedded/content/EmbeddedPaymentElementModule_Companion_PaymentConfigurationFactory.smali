.class public final Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/PaymentConfiguration;",
        ">;"
    }
.end annotation


# instance fields
.field private final applicationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
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
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;->applicationProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static paymentConfiguration(Landroid/app/Application;)Lcom/stripe/android/PaymentConfiguration;
    .locals 1

    .line 54
    sget-object v0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule;->Companion:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule$Companion;->paymentConfiguration(Landroid/app/Application;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/PaymentConfiguration;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/PaymentConfiguration;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;->applicationProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;->paymentConfiguration(Landroid/app/Application;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule_Companion_PaymentConfigurationFactory;->get()Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    return-object v0
.end method
