.class final Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;
.super Ljava/lang/Object;
.source "DaggerPassiveChallengeComponent.java"

# interfaces
.implements Lcom/stripe/android/challenge/PassiveChallengeComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "PassiveChallengeComponentImpl"
.end annotation


# instance fields
.field private final passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

.field private final passiveChallengeComponentImpl:Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;


# direct methods
.method private constructor <init>(Lcom/stripe/android/model/PassiveCaptchaParams;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p0, p0, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;->passiveChallengeComponentImpl:Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;

    .line 55
    iput-object p1, p0, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;->passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent-IA;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;-><init>(Lcom/stripe/android/model/PassiveCaptchaParams;)V

    return-void
.end method

.method private hCaptchaService()Lcom/stripe/android/hcaptcha/HCaptchaService;
    .locals 1

    .line 60
    invoke-static {}, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory;->provideHCaptchaProvider$payments_core_release()Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaServiceFactory;->provideHCaptchaService(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)Lcom/stripe/android/hcaptcha/HCaptchaService;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getPassiveChallengeViewModel()Lcom/stripe/android/challenge/PassiveChallengeViewModel;
    .locals 3

    .line 65
    new-instance v0, Lcom/stripe/android/challenge/PassiveChallengeViewModel;

    iget-object v1, p0, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;->passiveCaptchaParams:Lcom/stripe/android/model/PassiveCaptchaParams;

    invoke-direct {p0}, Lcom/stripe/android/challenge/DaggerPassiveChallengeComponent$PassiveChallengeComponentImpl;->hCaptchaService()Lcom/stripe/android/hcaptcha/HCaptchaService;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/challenge/PassiveChallengeViewModel;-><init>(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/hcaptcha/HCaptchaService;)V

    return-object v0
.end method
