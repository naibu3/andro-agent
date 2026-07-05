.class public final synthetic Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic f$0:Lcom/stripe/hcaptcha/HCaptchaDialogFragment;

.field public final synthetic f$1:Lcom/stripe/hcaptcha/config/HCaptchaConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/hcaptcha/HCaptchaDialogFragment;

    iput-object p2, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/hcaptcha/HCaptchaDialogFragment;

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaDialogFragment$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/stripe/hcaptcha/HCaptchaDialogFragment;->$r8$lambda$XvfaCJZ0CuCvef9bUkrJ_ER8PmA(Lcom/stripe/hcaptcha/HCaptchaDialogFragment;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
