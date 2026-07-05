.class public final synthetic Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/stripe/hcaptcha/config/HCaptchaConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    invoke-static {v0}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->$r8$lambda$Kwf0xtP5_dutB8QyT9V2_Vg1SMw(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
