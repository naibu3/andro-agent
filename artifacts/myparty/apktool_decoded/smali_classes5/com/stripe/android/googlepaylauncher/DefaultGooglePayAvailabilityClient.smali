.class public final Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;
.super Ljava/lang/Object;
.source "GooglePayAvailabilityClient.kt"

# interfaces
.implements Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;",
        "paymentsClient",
        "Lcom/google/android/gms/wallet/PaymentsClient;",
        "<init>",
        "(Lcom/google/android/gms/wallet/PaymentsClient;)V",
        "isReady",
        "",
        "request",
        "Lcom/google/android/gms/wallet/IsReadyToPayRequest;",
        "(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Factory",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/wallet/PaymentsClient;)V
    .locals 1

    const-string v0, "paymentsClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;->paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

    return-void
.end method


# virtual methods
.method public isReady(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wallet/IsReadyToPayRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;

    iget v1, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;-><init>(Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 21
    iget v2, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 22
    iget-object p2, p0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient;->paymentsClient:Lcom/google/android/gms/wallet/PaymentsClient;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/wallet/PaymentsClient;->isReadyToPay(Lcom/google/android/gms/wallet/IsReadyToPayRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string p2, "isReadyToPay(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput v3, v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$isReady$1;->label:I

    invoke-static {p1, v0}, Lkotlinx/coroutines/tasks/TasksKt;->await(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string p1, "await(...)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method
