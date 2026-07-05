.class public interface abstract Lcom/stripe/android/ApiResultCallback;
.super Ljava/lang/Object;
.source "ApiResultCallback.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultType::",
        "Lcom/stripe/android/core/model/StripeModel;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u0000*\n\u0008\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u0008\u001a\u00020\u00052\n\u0010\t\u001a\u00060\nj\u0002`\u000bH&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/ApiResultCallback;",
        "ResultType",
        "Lcom/stripe/android/core/model/StripeModel;",
        "",
        "onSuccess",
        "",
        "result",
        "(Lcom/stripe/android/core/model/StripeModel;)V",
        "onError",
        "e",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
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


# virtual methods
.method public abstract onError(Ljava/lang/Exception;)V
.end method

.method public abstract onSuccess(Lcom/stripe/android/core/model/StripeModel;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultType;)V"
        }
    .end annotation
.end method
