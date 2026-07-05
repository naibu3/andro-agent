.class public interface abstract Lcom/stripe/android/core/injection/Injectable;
.super Ljava/lang/Object;
.source "Injectable.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<FallbackInitializeParam:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/core/injection/Injectable;",
        "FallbackInitializeParam",
        "",
        "fallbackInitialize",
        "Lcom/stripe/android/core/injection/Injector;",
        "arg",
        "(Ljava/lang/Object;)Lcom/stripe/android/core/injection/Injector;",
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
.method public abstract fallbackInitialize(Ljava/lang/Object;)Lcom/stripe/android/core/injection/Injector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TFallbackInitializeParam;)",
            "Lcom/stripe/android/core/injection/Injector;"
        }
    .end annotation
.end method
