.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule_Companion_UiContextFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory$InstanceHolder;
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

.method public static create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;

    return-object v0
.end method

.method public static uiContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->uiContext()Lkotlin/coroutines/CoroutineContext;

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
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;->get()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    .line 30
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;->uiContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    return-object v0
.end method
