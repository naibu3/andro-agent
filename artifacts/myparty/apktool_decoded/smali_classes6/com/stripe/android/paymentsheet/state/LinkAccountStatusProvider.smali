.class public interface abstract Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;
.super Ljava/lang/Object;
.source "LinkAccountStatusProvider.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e0\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6B\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
        "",
        "invoke",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.method public abstract invoke(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
