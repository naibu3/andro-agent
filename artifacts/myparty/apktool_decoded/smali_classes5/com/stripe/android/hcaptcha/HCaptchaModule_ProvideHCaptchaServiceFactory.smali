.class public final Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;
.super Ljava/lang/Object;
.source "HCaptchaModule_ProvideHCaptchaServiceFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/hcaptcha/HCaptchaService;",
        ">;"
    }
.end annotation


# instance fields
.field private final hCaptchaProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/hcaptcha/HCaptchaProvider;",
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
            "Lcom/stripe/android/hcaptcha/HCaptchaProvider;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;->hCaptchaProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/hcaptcha/HCaptchaProvider;",
            ">;)",
            "Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/hcaptcha/HCaptchaProvider;",
            ">;)",
            "Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;"
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static provideHCaptchaService(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)Lcom/stripe/android/hcaptcha/HCaptchaService;
    .locals 1

    .line 51
    sget-object v0, Lcom/stripe/android/hcaptcha/HCaptchaModule;->INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaModule;

    invoke-virtual {v0, p0}, Lcom/stripe/android/hcaptcha/HCaptchaModule;->provideHCaptchaService(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)Lcom/stripe/android/hcaptcha/HCaptchaService;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/hcaptcha/HCaptchaService;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/hcaptcha/HCaptchaService;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;->hCaptchaProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    invoke-static {v0}, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;->provideHCaptchaService(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)Lcom/stripe/android/hcaptcha/HCaptchaService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;->get()Lcom/stripe/android/hcaptcha/HCaptchaService;

    move-result-object v0

    return-object v0
.end method
