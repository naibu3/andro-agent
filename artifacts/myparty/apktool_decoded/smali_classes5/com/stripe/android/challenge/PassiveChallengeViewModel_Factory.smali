.class public final Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;
.super Ljava/lang/Object;
.source "PassiveChallengeViewModel_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/challenge/PassiveChallengeViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final hCaptchaServiceProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/hcaptcha/HCaptchaService;",
            ">;"
        }
    .end annotation
.end field

.field private final passiveCaptchaParamsProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/model/PassiveCaptchaParams;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/model/PassiveCaptchaParams;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/hcaptcha/HCaptchaService;",
            ">;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;->passiveCaptchaParamsProvider:Ldagger/internal/Provider;

    .line 38
    iput-object p2, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;->hCaptchaServiceProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/model/PassiveCaptchaParams;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/hcaptcha/HCaptchaService;",
            ">;)",
            "Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/model/PassiveCaptchaParams;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/hcaptcha/HCaptchaService;",
            ">;)",
            "Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/hcaptcha/HCaptchaService;)Lcom/stripe/android/challenge/PassiveChallengeViewModel;
    .locals 1

    .line 60
    new-instance v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/challenge/PassiveChallengeViewModel;-><init>(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/hcaptcha/HCaptchaService;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/challenge/PassiveChallengeViewModel;
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;->passiveCaptchaParamsProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/PassiveCaptchaParams;

    iget-object v1, p0, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;->hCaptchaServiceProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/hcaptcha/HCaptchaService;

    invoke-static {v0, v1}, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;->newInstance(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/hcaptcha/HCaptchaService;)Lcom/stripe/android/challenge/PassiveChallengeViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/stripe/android/challenge/PassiveChallengeViewModel_Factory;->get()Lcom/stripe/android/challenge/PassiveChallengeViewModel;

    move-result-object v0

    return-object v0
.end method
