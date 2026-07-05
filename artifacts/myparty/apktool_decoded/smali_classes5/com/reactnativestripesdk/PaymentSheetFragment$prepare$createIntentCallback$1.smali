.class final Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1;
.super Ljava/lang/Object;
.source "PaymentSheetFragment.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/CreateIntentCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/PaymentSheetFragment;->prepare()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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
.field final synthetic this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/PaymentSheetFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1;->this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreateIntent(Lcom/stripe/android/model/PaymentMethod;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/CreateIntentResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;

    iget v1, v0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;

    invoke-direct {v0, p0, p3}, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;-><init>(Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 188
    iget v2, v0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 189
    iget-object p3, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1;->this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;

    invoke-static {p3}, Lcom/reactnativestripesdk/PaymentSheetFragment;->access$getContext$p(Lcom/reactnativestripesdk/PaymentSheetFragment;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p3

    if-nez p3, :cond_3

    const-string p3, "context"

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p3, v4

    :cond_3
    const-class v2, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {p3, v2}, Lcom/facebook/react/bridge/ReactApplicationContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p3

    check-cast p3, Lcom/reactnativestripesdk/StripeSdkModule;

    .line 191
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    .line 192
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    const-string v5, "paymentMethod"

    invoke-interface {v2, v5, p1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 193
    const-string p1, "shouldSavePaymentMethod"

    invoke-interface {v2, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 191
    const-string p1, "apply(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_4

    .line 196
    check-cast v2, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p3, v2}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnConfirmHandlerCallback(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 198
    :cond_4
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1;->this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/PaymentSheetFragment;->getPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    iput v3, v0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;->label:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    .line 188
    :cond_5
    :goto_1
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 200
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$prepare$createIntentCallback$1;->this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;

    invoke-static {v4, v3, v4}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment;->setPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V

    .line 202
    const-string p1, "clientSecret"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 203
    new-instance p2, Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;

    invoke-direct {p2, p1}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;-><init>(Ljava/lang/String;)V

    .line 202
    check-cast p2, Lcom/stripe/android/paymentsheet/CreateIntentResult;

    return-object p2

    .line 206
    :cond_6
    const-string p1, "error"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    .line 207
    new-instance p2, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;

    .line 208
    new-instance p3, Ljava/lang/Exception;

    if-eqz p1, :cond_7

    const-string v0, "message"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_7
    move-object v0, v4

    :goto_2
    invoke-direct {p3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_8

    .line 209
    const-string v0, "localizedMessage"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 207
    :cond_8
    invoke-direct {p2, p3, v4}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 205
    check-cast p2, Lcom/stripe/android/paymentsheet/CreateIntentResult;

    return-object p2
.end method
