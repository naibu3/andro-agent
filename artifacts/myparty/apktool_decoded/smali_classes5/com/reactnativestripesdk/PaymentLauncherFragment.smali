.class public final Lcom/reactnativestripesdk/PaymentLauncherFragment;
.super Lcom/reactnativestripesdk/utils/StripeFragment;
.source "PaymentLauncherFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;,
        Lcom/reactnativestripesdk/PaymentLauncherFragment$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0017\u001a\u00020\u0018H\u0016J\u0008\u0010\u0019\u001a\u00020\u0016H\u0002J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/reactnativestripesdk/PaymentLauncherFragment;",
        "Lcom/reactnativestripesdk/utils/StripeFragment;",
        "<init>",
        "()V",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "stripe",
        "Lcom/stripe/android/Stripe;",
        "publishableKey",
        "",
        "stripeAccountId",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "paymentIntentClientSecret",
        "confirmPaymentParams",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "setupIntentClientSecret",
        "confirmSetupParams",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "handleNextActionPaymentIntentClientSecret",
        "handleNextActionSetupIntentClientSecret",
        "paymentLauncher",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "prepare",
        "",
        "createPaymentLauncher",
        "retrieveSetupIntent",
        "clientSecret",
        "retrievePaymentIntent",
        "isNextActionSuccessState",
        "",
        "nextAction",
        "Lcom/stripe/android/model/StripeIntent$NextActionType;",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "payment_launcher_fragment"


# instance fields
.field private confirmPaymentParams:Lcom/stripe/android/model/ConfirmPaymentIntentParams;

.field private confirmSetupParams:Lcom/stripe/android/model/ConfirmSetupIntentParams;

.field private context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private handleNextActionPaymentIntentClientSecret:Ljava/lang/String;

.field private handleNextActionSetupIntentClientSecret:Ljava/lang/String;

.field private paymentIntentClientSecret:Ljava/lang/String;

.field private paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

.field private promise:Lcom/facebook/react/bridge/Promise;

.field private publishableKey:Ljava/lang/String;

.field private setupIntentClientSecret:Ljava/lang/String;

.field private stripe:Lcom/stripe/android/Stripe;

.field private stripeAccountId:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$b3cxC03fLPDaBhKNmuSvnjbFAHQ(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->createPaymentLauncher$lambda$4(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->Companion:Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/reactnativestripesdk/utils/StripeFragment;-><init>()V

    return-void
.end method

.method public static final synthetic access$getContext$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method public static final synthetic access$getPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;)Lcom/facebook/react/bridge/Promise;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    return-object p0
.end method

.method public static final synthetic access$isNextActionSuccessState(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/stripe/android/model/StripeIntent$NextActionType;)Z
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->isNextActionSuccessState(Lcom/stripe/android/model/StripeIntent$NextActionType;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setConfirmPaymentParams$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->confirmPaymentParams:Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    return-void
.end method

.method public static final synthetic access$setConfirmSetupParams$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/stripe/android/model/ConfirmSetupIntentParams;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->confirmSetupParams:Lcom/stripe/android/model/ConfirmSetupIntentParams;

    return-void
.end method

.method public static final synthetic access$setContext$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method public static final synthetic access$setHandleNextActionPaymentIntentClientSecret$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->handleNextActionPaymentIntentClientSecret:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setHandleNextActionSetupIntentClientSecret$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->handleNextActionSetupIntentClientSecret:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setPaymentIntentClientSecret$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->paymentIntentClientSecret:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setPromise$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    return-void
.end method

.method public static final synthetic access$setPublishableKey$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->publishableKey:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setSetupIntentClientSecret$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->setupIntentClientSecret:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setStripe$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/stripe/android/Stripe;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripe:Lcom/stripe/android/Stripe;

    return-void
.end method

.method public static final synthetic access$setStripeAccountId$p(Lcom/reactnativestripesdk/PaymentLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripeAccountId:Ljava/lang/String;

    return-void
.end method

.method private final createPaymentLauncher()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 5

    .line 208
    sget-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    move-object v1, p0

    check-cast v1, Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->publishableKey:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, "publishableKey"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    iget-object v3, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripeAccountId:Ljava/lang/String;

    new-instance v4, Lcom/reactnativestripesdk/PaymentLauncherFragment$$ExternalSyntheticLambda0;

    invoke-direct {v4, p0}, Lcom/reactnativestripesdk/PaymentLauncherFragment$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/PaymentLauncherFragment;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object v0

    return-object v0
.end method

.method private static final createPaymentLauncher$lambda$4(Lcom/reactnativestripesdk/PaymentLauncherFragment;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 4

    const-string v0, "paymentResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 211
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->paymentIntentClientSecret:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 212
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripeAccountId:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->retrievePaymentIntent(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 213
    :cond_0
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->handleNextActionPaymentIntentClientSecret:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 214
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripeAccountId:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->retrievePaymentIntent(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 215
    :cond_1
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->setupIntentClientSecret:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 216
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripeAccountId:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_5

    .line 217
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->handleNextActionSetupIntentClientSecret:Ljava/lang/String;

    if-eqz p1, :cond_3

    .line 218
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripeAccountId:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_3
    if-eqz v1, :cond_4

    goto :goto_1

    .line 219
    :cond_4
    new-instance p0, Ljava/lang/Exception;

    const-string p1, "Failed to create Payment Launcher. No client secret provided."

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_1
    return-void

    .line 221
    :cond_6
    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    const-string v2, "context"

    const-string v3, "promise"

    if-eqz v0, :cond_9

    .line 222
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez p1, :cond_7

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_7
    sget-object v0, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 223
    move-object p1, p0

    check-cast p1, Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez p0, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    move-object v1, p0

    :goto_2
    invoke-static {p1, v1}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void

    .line 225
    :cond_9
    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    if-eqz v0, :cond_c

    .line 226
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_a

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    .line 227
    :cond_a
    sget-object v3, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->Failed:Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;

    invoke-virtual {v3}, Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;->toString()Ljava/lang/String;

    move-result-object v3

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 226
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 229
    move-object p1, p0

    check-cast p1, Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez p0, :cond_b

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    move-object v1, p0

    :goto_3
    invoke-static {p1, v1}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void

    .line 209
    :cond_c
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private final isNextActionSuccessState(Lcom/stripe/android/model/StripeIntent$NextActionType;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 380
    :cond_0
    sget-object v0, Lcom/reactnativestripesdk/PaymentLauncherFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    const/4 p1, 0x1

    return p1

    :pswitch_2
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private final retrievePaymentIntent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 311
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripe:Lcom/stripe/android/Stripe;

    if-nez v0, :cond_0

    const-string v0, "stripe"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 314
    :cond_0
    const-string v1, "payment_method"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 315
    new-instance v2, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrievePaymentIntent$1;

    invoke-direct {v2, p0}, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrievePaymentIntent$1;-><init>(Lcom/reactnativestripesdk/PaymentLauncherFragment;)V

    check-cast v2, Lcom/stripe/android/ApiResultCallback;

    .line 311
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/stripe/android/Stripe;->retrievePaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method

.method private final retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 238
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->stripe:Lcom/stripe/android/Stripe;

    if-nez v0, :cond_0

    const-string v0, "stripe"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 241
    :cond_0
    const-string v1, "payment_method"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 242
    new-instance v2, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;

    invoke-direct {v2, p0}, Lcom/reactnativestripesdk/PaymentLauncherFragment$retrieveSetupIntent$1;-><init>(Lcom/reactnativestripesdk/PaymentLauncherFragment;)V

    check-cast v2, Lcom/stripe/android/ApiResultCallback;

    .line 238
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/stripe/android/Stripe;->retrieveSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/ApiResultCallback;)V

    return-void
.end method


# virtual methods
.method public prepare()V
    .locals 4

    .line 191
    invoke-direct {p0}, Lcom/reactnativestripesdk/PaymentLauncherFragment;->createPaymentLauncher()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object v0

    iput-object v0, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->paymentLauncher:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    .line 192
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->paymentIntentClientSecret:Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "paymentLauncher"

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->confirmPaymentParams:Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    .line 193
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->confirmPaymentParams:Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->confirm(Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V

    return-void

    .line 194
    :cond_1
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->setupIntentClientSecret:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->confirmSetupParams:Lcom/stripe/android/model/ConfirmSetupIntentParams;

    if-eqz v1, :cond_3

    if-nez v0, :cond_2

    .line 195
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->confirmSetupParams:Lcom/stripe/android/model/ConfirmSetupIntentParams;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->confirm(Lcom/stripe/android/model/ConfirmSetupIntentParams;)V

    return-void

    .line 196
    :cond_3
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->handleNextActionPaymentIntentClientSecret:Ljava/lang/String;

    if-eqz v1, :cond_5

    if-nez v0, :cond_4

    .line 197
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->handleNextActionPaymentIntentClientSecret:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->handleNextActionForPaymentIntent(Ljava/lang/String;)V

    return-void

    .line 198
    :cond_5
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->handleNextActionSetupIntentClientSecret:Ljava/lang/String;

    if-eqz v1, :cond_7

    if-nez v0, :cond_6

    .line 199
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_6
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentLauncherFragment;->handleNextActionSetupIntentClientSecret:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->handleNextActionForSetupIntent(Ljava/lang/String;)V

    return-void

    .line 201
    :cond_7
    new-instance v0, Ljava/lang/Exception;

    .line 202
    const-string v1, "Invalid parameters provided to PaymentLauncher. Ensure that you are providing the correct client secret and setup params (if necessary)."

    .line 201
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method
