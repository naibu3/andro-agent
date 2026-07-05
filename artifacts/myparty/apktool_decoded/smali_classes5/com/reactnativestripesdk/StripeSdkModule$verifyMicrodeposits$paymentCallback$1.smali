.class public final Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$paymentCallback$1;
.super Ljava/lang/Object;
.source "StripeSdkModule.kt"

# interfaces
.implements Lcom/stripe/android/ApiResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/StripeSdkModule;->verifyMicrodeposits(ZLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ApiResultCallback<",
        "Lcom/stripe/android/model/PaymentIntent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$paymentCallback$1",
        "Lcom/stripe/android/ApiResultCallback;",
        "Lcom/stripe/android/model/PaymentIntent;",
        "onError",
        "",
        "e",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "onSuccess",
        "result",
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


# instance fields
.field final synthetic $promise:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$paymentCallback$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 1002
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1004
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$paymentCallback$1;->$promise:Lcom/facebook/react/bridge/Promise;

    sget-object v1, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Lcom/stripe/android/core/model/StripeModel;)V
    .locals 0

    .line 1002
    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$paymentCallback$1;->onSuccess(Lcom/stripe/android/model/PaymentIntent;)V

    return-void
.end method

.method public onSuccess(Lcom/stripe/android/model/PaymentIntent;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1008
    iget-object v0, p0, Lcom/reactnativestripesdk/StripeSdkModule$verifyMicrodeposits$paymentCallback$1;->$promise:Lcom/facebook/react/bridge/Promise;

    const-string v1, "paymentIntent"

    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromPaymentIntentResult(Lcom/stripe/android/model/PaymentIntent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/MappersKt;->createResult(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method
