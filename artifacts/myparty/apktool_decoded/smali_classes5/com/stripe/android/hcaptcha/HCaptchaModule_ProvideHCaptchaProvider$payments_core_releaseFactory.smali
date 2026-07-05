.class public final Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory;
.super Ljava/lang/Object;
.source "HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/hcaptcha/HCaptchaProvider;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory;
    .locals 1

    .line 33
    sget-object v0, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory;

    return-object v0
.end method

.method public static provideHCaptchaProvider$payments_core_release()Lcom/stripe/android/hcaptcha/HCaptchaProvider;
    .locals 1

    .line 37
    sget-object v0, Lcom/stripe/android/hcaptcha/HCaptchaModule;->INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaModule;

    invoke-virtual {v0}, Lcom/stripe/android/hcaptcha/HCaptchaModule;->provideHCaptchaProvider$payments_core_release()Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/hcaptcha/HCaptchaProvider;
    .locals 1

    .line 29
    invoke-static {}, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory;->provideHCaptchaProvider$payments_core_release()Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/stripe/android/hcaptcha/HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory;->get()Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    move-result-object v0

    return-object v0
.end method
