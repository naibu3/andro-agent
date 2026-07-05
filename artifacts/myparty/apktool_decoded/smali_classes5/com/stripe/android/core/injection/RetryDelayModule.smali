.class public interface abstract Lcom/stripe/android/core/injection/RetryDelayModule;
.super Ljava/lang/Object;
.source "RetryDelayModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\'J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/core/injection/RetryDelayModule;",
        "",
        "bindsDefaultRetryDelaySupplier",
        "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
        "retryDelaySupplier",
        "Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;",
        "bindsLinearRetryDelaySupplier",
        "Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;",
        "bindsExponentialBackoffRetryDelaySupplier",
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
.method public abstract bindsDefaultRetryDelaySupplier(Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;)Lcom/stripe/android/core/networking/RetryDelaySupplier;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsExponentialBackoffRetryDelaySupplier(Lcom/stripe/android/core/networking/ExponentialBackoffRetryDelaySupplier;)Lcom/stripe/android/core/networking/RetryDelaySupplier;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "exponentialBackoffDelaySupplier"
    .end annotation
.end method

.method public abstract bindsLinearRetryDelaySupplier(Lcom/stripe/android/core/networking/LinearRetryDelaySupplier;)Lcom/stripe/android/core/networking/RetryDelaySupplier;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "linearDelaySupplier"
    .end annotation
.end method
