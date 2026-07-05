.class public interface abstract Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;
.super Ljava/lang/Object;
.source "CustomerSessionElementsSessionManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0003H\u00a6@\u00a2\u0006\u0004\u0008\t\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
        "",
        "fetchCustomerSessionEphemeralKey",
        "Lkotlin/Result;",
        "Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;",
        "fetchCustomerSessionEphemeralKey-IoAF18A",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchElementsSession",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
        "fetchElementsSession-IoAF18A",
        "paymentsheet_release"
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
.method public abstract fetchCustomerSessionEphemeralKey-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract fetchElementsSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
