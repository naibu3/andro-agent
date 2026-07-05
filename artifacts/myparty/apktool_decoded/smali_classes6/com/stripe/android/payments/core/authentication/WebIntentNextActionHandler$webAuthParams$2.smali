.class final Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$webAuthParams$2;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "WebIntentNextActionHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;->webAuthParams(Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.payments.core.authentication.WebIntentNextActionHandler"
    f = "WebIntentNextActionHandler.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x92,
        0x9d
    }
    m = "webAuthParams"
    n = {
        "$this$webAuthParams",
        "$this$webAuthParams"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;


# direct methods
.method constructor <init>(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;",
            "Lkotlin/coroutines/Continuation<",
            "Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$webAuthParams$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$webAuthParams$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$webAuthParams$2;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$webAuthParams$2;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$webAuthParams$2;->label:I

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$webAuthParams$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-static {p1, v0, v0, v1}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;->access$webAuthParams(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
