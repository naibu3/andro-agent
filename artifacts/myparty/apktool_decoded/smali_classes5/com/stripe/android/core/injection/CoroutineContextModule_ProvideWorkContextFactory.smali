.class public final Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;
.super Ljava/lang/Object;
.source "CoroutineContextModule_ProvideWorkContextFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lkotlin/coroutines/CoroutineContext;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/core/injection/CoroutineContextModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->module:Lcom/stripe/android/core/injection/CoroutineContextModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;
    .locals 1

    .line 41
    new-instance v0, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;)V

    return-object v0
.end method

.method public static provideWorkContext(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    .line 45
    invoke-virtual {p0}, Lcom/stripe/android/core/injection/CoroutineContextModule;->provideWorkContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->get()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->module:Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-static {v0}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->provideWorkContext(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    return-object v0
.end method
