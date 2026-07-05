.class public final Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;
.super Ljava/lang/Object;
.source "ReactNativeCustomerAdapter.kt"

# interfaces
.implements Lcom/stripe/android/customersheet/CustomerAdapter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReactNativeCustomerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeCustomerAdapter.kt\ncom/reactnativestripesdk/ReactNativeCustomerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010+\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00140,H\u0096@\u00a2\u0006\u0002\u0010-J\u001c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00150,2\u0006\u0010/\u001a\u00020%H\u0096@\u00a2\u0006\u0002\u00100J\u001c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00150,2\u0006\u0010/\u001a\u00020%H\u0096@\u00a2\u0006\u0002\u00100J\u001e\u00102\u001a\u0008\u0012\u0004\u0012\u00020!0,2\u0008\u00103\u001a\u0004\u0018\u000104H\u0096@\u00a2\u0006\u0002\u00105J\u0016\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040,H\u0096@\u00a2\u0006\u0002\u0010-J\u0014\u00107\u001a\u0008\u0012\u0004\u0012\u00020%0,H\u0096@\u00a2\u0006\u0002\u0010-J$\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00150,2\u0006\u0010/\u001a\u00020%2\u0006\u00109\u001a\u00020:H\u0096A\u00a2\u0006\u0002\u0010;R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017\"\u0004\u0008\u001c\u0010\u0019R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u0017\"\u0004\u0008\u001f\u0010\u0019R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u0017\"\u0004\u0008#\u0010\u0019R$\u0010$\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u0017\"\u0004\u0008\'\u0010\u0019R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u0017\"\u0004\u0008*\u0010\u0019R\u0012\u0010<\u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u001a\u0010?\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010A\u00a8\u0006B"
    }
    d2 = {
        "Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;",
        "Lcom/stripe/android/customersheet/CustomerAdapter;",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "adapter",
        "overridesFetchPaymentMethods",
        "",
        "overridesAttachPaymentMethod",
        "overridesDetachPaymentMethod",
        "overridesSetSelectedPaymentOption",
        "overridesFetchSelectedPaymentOption",
        "overridesSetupIntentClientSecretForCustomerAttach",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/customersheet/CustomerAdapter;ZZZZZZ)V",
        "getContext",
        "()Lcom/facebook/react/bridge/ReactApplicationContext;",
        "stripeSdkModule",
        "Lcom/reactnativestripesdk/StripeSdkModule;",
        "fetchPaymentMethodsCallback",
        "Lkotlinx/coroutines/CompletableDeferred;",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "getFetchPaymentMethodsCallback$stripe_stripe_react_native_release",
        "()Lkotlinx/coroutines/CompletableDeferred;",
        "setFetchPaymentMethodsCallback$stripe_stripe_react_native_release",
        "(Lkotlinx/coroutines/CompletableDeferred;)V",
        "attachPaymentMethodCallback",
        "getAttachPaymentMethodCallback$stripe_stripe_react_native_release",
        "setAttachPaymentMethodCallback$stripe_stripe_react_native_release",
        "detachPaymentMethodCallback",
        "getDetachPaymentMethodCallback$stripe_stripe_react_native_release",
        "setDetachPaymentMethodCallback$stripe_stripe_react_native_release",
        "setSelectedPaymentOptionCallback",
        "",
        "getSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release",
        "setSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release",
        "fetchSelectedPaymentOptionCallback",
        "",
        "getFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release",
        "setFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release",
        "setupIntentClientSecretForCustomerAttachCallback",
        "getSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release",
        "setSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release",
        "retrievePaymentMethods",
        "Lcom/stripe/android/customersheet/CustomerAdapter$Result;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "attachPaymentMethod",
        "paymentMethodId",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "detachPaymentMethod",
        "setSelectedPaymentOption",
        "paymentOption",
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;",
        "(Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "retrieveSelectedPaymentOption",
        "setupIntentClientSecretForCustomerAttach",
        "updatePaymentMethod",
        "params",
        "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
        "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "canCreateSetupIntents",
        "getCanCreateSetupIntents",
        "()Z",
        "paymentMethodTypes",
        "getPaymentMethodTypes",
        "()Ljava/util/List;",
        "stripe_stripe-react-native_release"
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
.field private final adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

.field private attachPaymentMethodCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private detachPaymentMethodCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private fetchPaymentMethodsCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation
.end field

.field private fetchSelectedPaymentOptionCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final overridesAttachPaymentMethod:Z

.field private final overridesDetachPaymentMethod:Z

.field private final overridesFetchPaymentMethods:Z

.field private final overridesFetchSelectedPaymentOption:Z

.field private final overridesSetSelectedPaymentOption:Z

.field private final overridesSetupIntentClientSecretForCustomerAttach:Z

.field private setSelectedPaymentOptionCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private setupIntentClientSecretForCustomerAttachCallback:Lkotlinx/coroutines/CompletableDeferred;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/stripe/android/customersheet/CustomerAdapter;ZZZZZZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 12
    iput-object p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    .line 13
    iput-boolean p3, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesFetchPaymentMethods:Z

    .line 14
    iput-boolean p4, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesAttachPaymentMethod:Z

    .line 15
    iput-boolean p5, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesDetachPaymentMethod:Z

    .line 16
    iput-boolean p6, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesSetSelectedPaymentOption:Z

    .line 17
    iput-boolean p7, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesFetchSelectedPaymentOption:Z

    .line 18
    iput-boolean p8, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesSetupIntentClientSecretForCustomerAttach:Z

    .line 20
    const-class p2, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactApplicationContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    check-cast p1, Lcom/reactnativestripesdk/StripeSdkModule;

    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    return-void
.end method


# virtual methods
.method public attachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;

    iget v1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;

    invoke-direct {v0, p0, p2}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;-><init>(Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 42
    iget v2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    iget-boolean p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesAttachPaymentMethod:Z

    if-eqz p2, :cond_6

    const/4 p2, 0x0

    .line 44
    invoke-static {p2, v4, p2}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p2

    .line 45
    iput-object p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->attachPaymentMethodCallback:Lkotlinx/coroutines/CompletableDeferred;

    .line 46
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    const-string v3, "paymentMethodId"

    invoke-interface {v2, v3, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "also(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    if-eqz p1, :cond_4

    check-cast v2, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p1, v2}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnCustomerAdapterAttachPaymentMethodCallback(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 48
    :cond_4
    iput v4, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;->label:I

    invoke-interface {p2, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    .line 42
    :cond_5
    :goto_1
    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    .line 49
    sget-object p1, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1

    .line 53
    :cond_6
    iget-object p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    iput v3, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$attachPaymentMethod$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->attachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    return-object p1
.end method

.method public detachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;

    iget v1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;

    invoke-direct {v0, p0, p2}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;-><init>(Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 56
    iget v2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    iget-boolean p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesDetachPaymentMethod:Z

    if-eqz p2, :cond_6

    const/4 p2, 0x0

    .line 58
    invoke-static {p2, v4, p2}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p2

    .line 59
    iput-object p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->detachPaymentMethodCallback:Lkotlinx/coroutines/CompletableDeferred;

    .line 60
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    const-string v3, "paymentMethodId"

    invoke-interface {v2, v3, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "also(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    if-eqz p1, :cond_4

    check-cast v2, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p1, v2}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnCustomerAdapterDetachPaymentMethodCallback(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 62
    :cond_4
    iput v4, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;->label:I

    invoke-interface {p2, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    .line 56
    :cond_5
    :goto_1
    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    .line 63
    sget-object p1, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1

    .line 67
    :cond_6
    iget-object p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    iput v3, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$detachPaymentMethod$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->detachPaymentMethod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    return-object p1
.end method

.method public final getAttachPaymentMethodCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->attachPaymentMethodCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method public getCanCreateSetupIntents()Z
    .locals 1

    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    invoke-interface {v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->getCanCreateSetupIntents()Z

    move-result v0

    return v0
.end method

.method public final getContext()Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object v0
.end method

.method public final getDetachPaymentMethodCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->detachPaymentMethodCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method public final getFetchPaymentMethodsCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->fetchPaymentMethodsCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method public final getFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->fetchSelectedPaymentOptionCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method public getPaymentMethodTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    invoke-interface {v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->setSelectedPaymentOptionCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method public final getSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->setupIntentClientSecretForCustomerAttachCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-object v0
.end method

.method public retrievePaymentMethods(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;

    iget v1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;

    invoke-direct {v0, p0, p1}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;-><init>(Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 29
    iget v2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    iget-boolean p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesFetchPaymentMethods:Z

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    .line 31
    invoke-static {p1, v4, p1}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->fetchPaymentMethodsCallback:Lkotlinx/coroutines/CompletableDeferred;

    .line 33
    iget-object v2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnCustomerAdapterFetchPaymentMethodsCallback()V

    .line 34
    :cond_4
    iput v4, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;->label:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    .line 29
    :cond_5
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 35
    sget-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1

    .line 39
    :cond_6
    iget-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    iput v3, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrievePaymentMethods$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->retrievePaymentMethods(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    return-object p1
.end method

.method public retrieveSelectedPaymentOption(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;

    iget v1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;

    invoke-direct {v0, p0, p1}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;-><init>(Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 84
    iget v2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 85
    iget-boolean p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesFetchSelectedPaymentOption:Z

    if-eqz p1, :cond_7

    .line 86
    invoke-static {v4, v5, v4}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    .line 87
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->fetchSelectedPaymentOptionCallback:Lkotlinx/coroutines/CompletableDeferred;

    .line 88
    iget-object v2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnCustomerAdapterFetchSelectedPaymentOptionCallback()V

    .line 89
    :cond_4
    iput v5, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;->label:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    .line 84
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 90
    sget-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    if-eqz p1, :cond_6

    .line 92
    sget-object v1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;

    invoke-virtual {v1, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;->fromId(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    move-result-object v4

    .line 90
    :cond_6
    invoke-virtual {v0, v4}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1

    .line 100
    :cond_7
    iget-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    iput v3, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$retrieveSelectedPaymentOption$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->retrieveSelectedPaymentOption(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    return-object p1
.end method

.method public final setAttachPaymentMethodCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->attachPaymentMethodCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public final setDetachPaymentMethodCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)V"
        }
    .end annotation

    .line 24
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->detachPaymentMethodCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public final setFetchPaymentMethodsCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)V"
        }
    .end annotation

    .line 22
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->fetchPaymentMethodsCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public final setFetchSelectedPaymentOptionCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 26
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->fetchSelectedPaymentOptionCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public setSelectedPaymentOption(Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;

    iget v1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;

    invoke-direct {v0, p0, p2}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;-><init>(Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 70
    iget v2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    iget-boolean p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesSetSelectedPaymentOption:Z

    if-eqz p2, :cond_7

    const/4 p2, 0x0

    .line 72
    invoke-static {p2, v4, p2}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object v2

    .line 73
    iput-object v2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->setSelectedPaymentOptionCallback:Lkotlinx/coroutines/CompletableDeferred;

    .line 74
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v3

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->getId()Ljava/lang/String;

    move-result-object p2

    :cond_4
    const-string p1, "paymentOption"

    invoke-interface {v3, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "also(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    if-eqz p1, :cond_5

    check-cast v3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p1, v3}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnCustomerAdapterSetSelectedPaymentOptionCallback(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 76
    :cond_5
    iput v4, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->label:I

    invoke-interface {v2, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    .line 77
    :cond_6
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    sget-object p2, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1

    .line 81
    :cond_7
    iget-object p2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    iput v3, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setSelectedPaymentOption$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->setSelectedPaymentOption(Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    return-object p1
.end method

.method public final setSetSelectedPaymentOptionCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 25
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->setSelectedPaymentOptionCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public final setSetupIntentClientSecretForCustomerAttachCallback$stripe_stripe_react_native_release(Lkotlinx/coroutines/CompletableDeferred;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CompletableDeferred<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->setupIntentClientSecretForCustomerAttachCallback:Lkotlinx/coroutines/CompletableDeferred;

    return-void
.end method

.method public setupIntentClientSecretForCustomerAttach(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;

    iget v1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;

    invoke-direct {v0, p0, p1}, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;-><init>(Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 103
    iget v2, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 104
    iget-boolean p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->overridesSetupIntentClientSecretForCustomerAttach:Z

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    .line 105
    invoke-static {p1, v4, p1}, Lkotlinx/coroutines/CompletableDeferredKt;->CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    .line 106
    iput-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->setupIntentClientSecretForCustomerAttachCallback:Lkotlinx/coroutines/CompletableDeferred;

    .line 107
    iget-object v2, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnCustomerAdapterSetupIntentClientSecretForCustomerAttachCallback()V

    .line 108
    :cond_4
    iput v4, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;->label:I

    invoke-interface {p1, v0}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    .line 103
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 109
    sget-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1

    .line 113
    :cond_6
    iget-object p1, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    iput v3, v0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/customersheet/CustomerAdapter;->setupIntentClientSecretForCustomerAttach(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    return-object p1
.end method

.method public updatePaymentMethod(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;->adapter:Lcom/stripe/android/customersheet/CustomerAdapter;

    invoke-interface {v0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerAdapter;->updatePaymentMethod(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
