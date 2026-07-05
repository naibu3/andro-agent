.class final Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;
.super Ljava/lang/Object;
.source "HCaptchaInterface.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt;->performPassiveHCaptcha(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "Lcom/stripe/hcaptcha/HCaptchaException;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;

    invoke-direct {v0}, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;-><init>()V

    sput-object v0, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;->INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/HCaptchaException;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "exception"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-virtual {p2}, Lcom/stripe/hcaptcha/HCaptchaException;->getHCaptchaError()Lcom/stripe/hcaptcha/HCaptchaError;

    move-result-object p1

    sget-object p2, Lcom/stripe/hcaptcha/HCaptchaError;->SESSION_TIMEOUT:Lcom/stripe/hcaptcha/HCaptchaError;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 43
    check-cast p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    check-cast p2, Lcom/stripe/hcaptcha/HCaptchaException;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1;->invoke(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/HCaptchaException;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
