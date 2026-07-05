.class final Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElementView.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $embedded:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

.field final synthetic this$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;->$embedded:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    iput-object p2, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;->this$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;

    iget v1, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;

    invoke-direct {v0, p0, p2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 241
    iget v2, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;->label:I

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

    .line 243
    instance-of p2, p1, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Configure;

    if-eqz p2, :cond_7

    .line 246
    iget-object p2, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;->$embedded:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    .line 247
    check-cast p1, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Configure;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Configure;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v2

    .line 248
    invoke-virtual {p1}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Configure;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object p1

    .line 246
    iput v3, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1$emit$1;->label:I

    invoke-virtual {p2, v2, p1, v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->configure(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 241
    :cond_3
    :goto_1
    check-cast p2, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult;

    .line 252
    instance-of p1, p2, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult$Succeeded;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;->this$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->access$reportHeightChange(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;F)V

    goto :goto_2

    .line 253
    :cond_4
    instance-of p1, p2, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult$Failed;

    if-eqz p1, :cond_6

    .line 255
    check-cast p2, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult$Failed;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    .line 256
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_5

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p2

    .line 259
    :cond_5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 260
    const-string v0, "message"

    invoke-interface {p1, v0, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const-string p2, "apply(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    iget-object p2, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;->this$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    invoke-static {p2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->access$requireStripeSdkModule(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)Lcom/reactnativestripesdk/StripeSdkModule;

    move-result-object p2

    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p2, p1}, Lcom/reactnativestripesdk/StripeSdkModule;->emitEmbeddedPaymentElementLoadingFailed(Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_2

    .line 251
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 267
    :cond_7
    instance-of p2, p1, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$Confirm;

    if-eqz p2, :cond_8

    .line 268
    iget-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;->$embedded:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->confirm()V

    goto :goto_2

    .line 270
    :cond_8
    instance-of p1, p1, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event$ClearPaymentOption;

    if-eqz p1, :cond_9

    .line 271
    iget-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;->$embedded:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->clearPaymentOption()V

    .line 274
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 242
    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 241
    check-cast p1, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$1$1$1;->emit(Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
