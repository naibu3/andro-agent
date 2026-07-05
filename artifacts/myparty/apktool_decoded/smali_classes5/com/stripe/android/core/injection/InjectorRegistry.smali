.class public interface abstract Lcom/stripe/android/core/injection/InjectorRegistry;
.super Ljava/lang/Object;
.source "InjectorRegistry.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008g\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0001\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\'\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/core/injection/InjectorRegistry;",
        "",
        "register",
        "",
        "injector",
        "Lcom/stripe/android/core/injection/Injector;",
        "key",
        "",
        "retrieve",
        "injectorKey",
        "nextKey",
        "prefix",
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
.method public abstract nextKey(Ljava/lang/String;)Ljava/lang/String;
    .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
    .end annotation
.end method

.method public abstract register(Lcom/stripe/android/core/injection/Injector;Ljava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
        .end annotation
    .end param
.end method

.method public abstract retrieve(Ljava/lang/String;)Lcom/stripe/android/core/injection/Injector;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/core/injection/InjectorKey;
        .end annotation
    .end param
.end method
