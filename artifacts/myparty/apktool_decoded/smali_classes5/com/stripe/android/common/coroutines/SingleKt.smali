.class public final Lcom/stripe/android/common/coroutines/SingleKt;
.super Ljava/lang/Object;
.source "Single.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0080@\u00a2\u0006\u0004\u0008\t\u0010\n\u001a \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\u0008\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000cH\u0000\u00a8\u0006\r"
    }
    d2 = {
        "awaitWithTimeout",
        "Lkotlin/Result;",
        "T",
        "Lcom/stripe/android/common/coroutines/Single;",
        "timeout",
        "Lkotlin/time/Duration;",
        "timeoutMessage",
        "Lkotlin/Function0;",
        "",
        "awaitWithTimeout-dWUq8MI",
        "(Lcom/stripe/android/common/coroutines/Single;JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "asSingle",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final asSingle(Lkotlinx/coroutines/flow/StateFlow;)Lcom/stripe/android/common/coroutines/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+TT;>;)",
            "Lcom/stripe/android/common/coroutines/Single<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/stripe/android/common/coroutines/SingleKt$asSingle$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/common/coroutines/SingleKt$asSingle$1;-><init>(Lkotlinx/coroutines/flow/StateFlow;)V

    check-cast v0, Lcom/stripe/android/common/coroutines/Single;

    return-object v0
.end method

.method public static final awaitWithTimeout-dWUq8MI(Lcom/stripe/android/common/coroutines/Single;JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/stripe/android/common/coroutines/Single<",
            "TT;>;J",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;

    iget v1, v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;

    invoke-direct {v0, p4}, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 13
    iget v2, v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;->L$0:Ljava/lang/Object;

    move-object p3, p0

    check-cast p3, Lkotlin/jvm/functions/Function0;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    new-instance p4, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$result$1;

    const/4 v2, 0x0

    invoke-direct {p4, p0, v2}, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$result$1;-><init>(Lcom/stripe/android/common/coroutines/Single;Lkotlin/coroutines/Continuation;)V

    check-cast p4, Lkotlin/jvm/functions/Function2;

    iput-object p3, v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/common/coroutines/SingleKt$awaitWithTimeout$1;->label:I

    invoke-static {p1, p2, p4, v0}, Lkotlinx/coroutines/TimeoutKt;->withTimeoutOrNull-KLykuaI(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-eqz p4, :cond_4

    .line 19
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 21
    :cond_4
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
