.class public final Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;
.super Ljava/lang/Object;
.source "PaymentLauncherFragment.kt"

# interfaces
.implements Lcom/stripe/android/ApiResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/PaymentLauncherFragment;->retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ApiResultCallback<",
        "Lcom/stripe/android/model/SetupIntent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1",
        "Lcom/stripe/android/ApiResultCallback;",
        "Lcom/stripe/android/model/SetupIntent;",
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
.field final synthetic this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/PaymentLauncherFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    .line 242
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "promise"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    sget-object v2, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;

    invoke-virtual {v2}, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 245
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-static {p1}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getContext$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "context"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Lcom/stripe/android/core/model/StripeModel;)V
    .locals 0

    .line 242
    check-cast p1, Lcom/stripe/android/model/SetupIntent;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->onSuccess(Lcom/stripe/android/model/SetupIntent;)V

    return-void
.end method

.method public onSuccess(Lcom/stripe/android/model/SetupIntent;)V
    .locals 5

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const-string v1, "setupIntent"

    const-string v2, "promise"

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    .line 293
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    goto/16 :goto_1

    .line 285
    :pswitch_0
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    .line 287
    :cond_1
    sget-object v1, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    .line 288
    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getLastSetupError()Lcom/stripe/android/model/SetupIntent$Error;

    move-result-object p1

    .line 286
    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$Error;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 285
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 277
    :pswitch_1
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    .line 279
    :cond_2
    sget-object v1, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    .line 280
    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getLastSetupError()Lcom/stripe/android/model/SetupIntent$Error;

    move-result-object p1

    .line 278
    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$Error;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 277
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 258
    :pswitch_2
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getNextActionType()Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$isNextActionSuccessState(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/stripe/android/model/StripeIntent$NextActionType;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 259
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_3
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromSetupIntentResult(Lcom/stripe/android/model/SetupIntent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/MappersKt;->createResult(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 261
    :cond_4
    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getLastSetupError()Lcom/stripe/android/model/SetupIntent$Error;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    .line 262
    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    .line 263
    :cond_5
    sget-object v1, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$Error;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 262
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_2

    .line 266
    :cond_6
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    move-object v0, p0

    check-cast v0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;

    .line 267
    invoke-static {p1}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;

    move-result-object p1

    if-nez p1, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    .line 269
    :cond_7
    sget-object v0, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    .line 270
    const-string v1, "Setup has been canceled"

    .line 268
    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 267
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_2

    .line 255
    :pswitch_3
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_8
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromSetupIntentResult(Lcom/stripe/android/model/SetupIntent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/MappersKt;->createResult(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_2

    .line 295
    :cond_9
    :goto_1
    sget-object v1, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->Unknown:Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    .line 296
    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "unhandled error: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 294
    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 293
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 301
    :goto_2
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;->this$0:Lcom/reactnativestripesdk/PaymentLauncherFragment;

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-static {p1}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->access$getContext$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    if-nez p1, :cond_a

    const-string p1, "context"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    move-object v3, p1

    :goto_3
    invoke-static {v0, v3}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
