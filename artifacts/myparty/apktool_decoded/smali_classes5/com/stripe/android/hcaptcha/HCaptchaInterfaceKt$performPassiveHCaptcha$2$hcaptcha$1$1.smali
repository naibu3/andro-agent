.class public final Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1;
.super Ljava/lang/Object;
.source "HCaptchaInterface.kt"

# interfaces
.implements Lcom/stripe/hcaptcha/task/OnSuccessListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt;->performPassiveHCaptcha(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/hcaptcha/task/OnSuccessListener<",
        "Lcom/stripe/hcaptcha/HCaptchaTokenResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1",
        "Lcom/stripe/hcaptcha/task/OnSuccessListener;",
        "Lcom/stripe/hcaptcha/HCaptchaTokenResponse;",
        "onSuccess",
        "",
        "result",
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
.field final synthetic $coroutine:Lkotlinx/coroutines/CancellableContinuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CancellableContinuation<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlinx/coroutines/CancellableContinuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CancellableContinuation<",
            "-",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1;->$coroutine:Lkotlinx/coroutines/CancellableContinuation;

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Lcom/stripe/hcaptcha/HCaptchaTokenResponse;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1;->$coroutine:Lkotlinx/coroutines/CancellableContinuation;

    invoke-virtual {p1}, Lcom/stripe/hcaptcha/HCaptchaTokenResponse;->getTokenResult()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1$onSuccess$1;->INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1$onSuccess$1;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1, v1}, Lkotlinx/coroutines/CancellableContinuation;->resume(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/stripe/hcaptcha/HCaptchaTokenResponse;

    invoke-virtual {p0, p1}, Lcom/stripe/android/hcaptcha/HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1;->onSuccess(Lcom/stripe/hcaptcha/HCaptchaTokenResponse;)V

    return-void
.end method
