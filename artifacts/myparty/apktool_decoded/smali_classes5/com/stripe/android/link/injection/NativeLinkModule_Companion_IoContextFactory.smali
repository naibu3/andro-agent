.class public final Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory;
.super Ljava/lang/Object;
.source "NativeLinkModule_Companion_IoContextFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lkotlin/coroutines/CoroutineContext;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory;

    return-object v0
.end method

.method public static ioContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule;->Companion:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;->ioContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory;->get()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    .line 30
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_IoContextFactory;->ioContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    return-object v0
.end method
