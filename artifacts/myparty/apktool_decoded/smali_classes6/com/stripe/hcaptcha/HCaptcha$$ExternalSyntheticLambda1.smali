.class public final synthetic Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/hcaptcha/HCaptcha;

.field public final synthetic f$1:Lcom/stripe/hcaptcha/config/HCaptchaConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/hcaptcha/HCaptcha;

    iput-object p2, p0, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/hcaptcha/HCaptcha;

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptcha$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/stripe/hcaptcha/HCaptcha;->$r8$lambda$axZtnPOVcpWnhLV6nau5KNJAug8(Lcom/stripe/hcaptcha/HCaptcha;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
