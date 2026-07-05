.class public final Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$2;
.super Ljava/lang/Object;
.source "DefaultHCaptchaService.kt"

# interfaces
.implements Lcom/stripe/hcaptcha/task/OnFailureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/hcaptcha/DefaultHCaptchaService;->performPassiveHCaptcha(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$2",
        "Lcom/stripe/hcaptcha/task/OnFailureListener;",
        "onFailure",
        "",
        "exception",
        "Lcom/stripe/hcaptcha/HCaptchaException;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $coroutine:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "Lcom/stripe/android/hcaptcha/HCaptchaService$Result;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/hcaptcha/HCaptchaService$Result;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$2;->$coroutine:Lkotlin/coroutines/Continuation;

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lcom/stripe/hcaptcha/HCaptchaException;)V
    .locals 2

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService$performPassiveHCaptcha$2$hcaptcha$1$2;->$coroutine:Lkotlin/coroutines/Continuation;

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v1, Lcom/stripe/android/hcaptcha/HCaptchaService$Result$Failure;

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v1, p1}, Lcom/stripe/android/hcaptcha/HCaptchaService$Result$Failure;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
