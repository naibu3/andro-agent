.class final Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElementView.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/CreateIntentCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->Content(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmbeddedPaymentElementView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedPaymentElementView.kt\ncom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n1#2:347\n*E\n"
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
.field final synthetic this$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1;->this$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

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

    instance-of v0, p3, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;

    iget v1, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;

    invoke-direct {v0, p0, p3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;-><init>(Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 160
    iget v2, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    iget-object p2, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 163
    :try_start_0
    iget-object p3, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1;->this$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    invoke-static {p3}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->access$requireStripeSdkModule(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)Lcom/reactnativestripesdk/StripeSdkModule;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    new-instance v2, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    iget-object v4, p0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1;->this$0:Lcom/reactnativestripesdk/EmbeddedPaymentElementView;

    invoke-static {v4}, Lcom/reactnativestripesdk/EmbeddedPaymentElementView;->access$getReactContext(Lcom/reactnativestripesdk/EmbeddedPaymentElementView;)Lcom/facebook/react/uimanager/ThemedReactContext;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/react/uimanager/ThemedReactContext;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v4

    invoke-direct {v2, v4}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-virtual {v2}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->start()V

    .line 179
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v4

    .line 180
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    const-string v5, "paymentMethod"

    invoke-interface {v4, v5, p1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 181
    const-string p1, "shouldSavePaymentMethod"

    invoke-interface {v4, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 179
    const-string p1, "apply(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    check-cast v4, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p3, v4}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnConfirmHandlerCallback(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 186
    invoke-virtual {p3}, Lcom/reactnativestripesdk/StripeSdkModule;->getEmbeddedIntentCreationCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    iput-object p3, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/reactnativestripesdk/EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;->label:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p2, p3

    move-object p3, p1

    move-object p1, v2

    .line 160
    :goto_1
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    const/4 v0, 0x0

    .line 188
    invoke-static {v0, v3, v0}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/reactnativestripesdk/StripeSdkModule;->setEmbeddedIntentCreationCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V

    .line 190
    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->stop()V

    .line 192
    const-string p1, "clientSecret"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 193
    new-instance p2, Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;

    invoke-direct {p2, p1}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Success;-><init>(Ljava/lang/String;)V

    .line 192
    check-cast p2, Lcom/stripe/android/paymentsheet/CreateIntentResult;

    return-object p2

    .line 195
    :cond_4
    const-string p1, "error"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    .line 196
    new-instance p2, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;

    .line 197
    new-instance p3, Ljava/lang/Exception;

    if-eqz p1, :cond_5

    const-string v1, "message"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    move-object v1, v0

    :goto_2
    invoke-direct {p3, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    .line 198
    const-string v0, "localizedMessage"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 196
    :cond_6
    invoke-direct {p2, p3, v0}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 194
    check-cast p2, Lcom/stripe/android/paymentsheet/CreateIntentResult;

    return-object p2

    .line 165
    :catch_0
    new-instance p1, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;

    .line 167
    new-instance p2, Ljava/lang/Exception;

    .line 168
    const-string p3, "Tried to call confirmHandler, but no callback was found. Please file an issue: https://github.com/stripe/stripe-react-native/issues"

    .line 167
    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 170
    const-string p3, "An unexpected error occurred"

    .line 165
    invoke-direct {p1, p2, p3}, Lcom/stripe/android/paymentsheet/CreateIntentResult$Failure;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    return-object p1
.end method
