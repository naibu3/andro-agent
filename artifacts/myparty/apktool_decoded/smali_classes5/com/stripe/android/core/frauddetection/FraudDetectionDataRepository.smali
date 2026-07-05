.class public interface abstract Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;
.super Ljava/lang/Object;
.source "FraudDetectionDataRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008g\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
        "",
        "refresh",
        "",
        "getCached",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
        "getLatest",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "save",
        "fraudDetectionData",
        "stripe-core_release"
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
.method public abstract getCached()Lcom/stripe/android/core/frauddetection/FraudDetectionData;
.end method

.method public abstract getLatest(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract refresh()V
.end method

.method public abstract save(Lcom/stripe/android/core/frauddetection/FraudDetectionData;)V
.end method
