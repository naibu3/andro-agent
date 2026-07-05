.class public final Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;
.super Ljava/lang/Object;
.source "IntentConfirmationDefinition.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
        "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;",
        "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001.B)\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\u0008\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J$\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\tH\u0016J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\"\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0008\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0005H\u0016J \u0010\'\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0008\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006/"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;",
        "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;",
        "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;",
        "intentConfirmationInterceptor",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;",
        "paymentLauncherFactory",
        "Lkotlin/Function1;",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "<init>",
        "(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lkotlin/jvm/functions/Function1;)V",
        "key",
        "",
        "getKey",
        "()Ljava/lang/String;",
        "option",
        "confirmationOption",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
        "action",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;",
        "confirmationParameters",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
        "(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createLauncher",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "onResult",
        "",
        "launch",
        "launcher",
        "arguments",
        "toResult",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "result",
        "launchNextAction",
        "clientSecret",
        "intent",
        "Lcom/stripe/android/model/StripeIntent;",
        "launchConfirm",
        "confirmStripeIntentParams",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "Args",
        "paymentsheet_release"
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
.field private final intentConfirmationInterceptor:Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;

.field private final key:Ljava/lang/String;

.field private final paymentLauncherFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;+",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
            ">;)V"
        }
    .end annotation

    const-string v0, "intentConfirmationInterceptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentLauncherFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->intentConfirmationInterceptor:Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;

    .line 21
    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->paymentLauncherFactory:Lkotlin/jvm/functions/Function1;

    .line 28
    const-string p1, "IntentConfirmation"

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->key:Ljava/lang/String;

    return-void
.end method

.method private final launchConfirm(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;Lcom/stripe/android/model/ConfirmStripeIntentParams;)V
    .locals 1

    .line 146
    instance-of v0, p2, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    if-eqz v0, :cond_0

    .line 147
    check-cast p2, Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    invoke-interface {p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->confirm(Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V

    return-void

    .line 149
    :cond_0
    instance-of v0, p2, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    if-eqz v0, :cond_1

    .line 150
    check-cast p2, Lcom/stripe/android/model/ConfirmSetupIntentParams;

    invoke-interface {p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->confirm(Lcom/stripe/android/model/ConfirmSetupIntentParams;)V

    return-void

    .line 145
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final launchNextAction(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V
    .locals 1

    .line 132
    instance-of v0, p3, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_0

    .line 133
    invoke-interface {p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->handleNextActionForPaymentIntent(Ljava/lang/String;)V

    return-void

    .line 135
    :cond_0
    instance-of p3, p3, Lcom/stripe/android/model/SetupIntent;

    if-eqz p3, :cond_1

    .line 136
    invoke-interface {p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->handleNextActionForSetupIntent(Ljava/lang/String;)V

    return-void

    .line 131
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic action(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 19
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->action(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public action(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action<",
            "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;

    iget v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;-><init>(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p3, v6, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 34
    iget v1, v6, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;

    iget-object p1, v6, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->intentConfirmationInterceptor:Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;

    .line 40
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v3

    .line 41
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v4

    .line 42
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v5

    .line 38
    iput-object p1, v6, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->L$0:Ljava/lang/Object;

    iput-object p2, v6, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->L$1:Ljava/lang/Object;

    iput v2, v6, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$action$1;->label:I

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptorKtxKt;->intercept(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    move-object p1, v2

    .line 34
    :goto_1
    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;

    .line 45
    invoke-interface {p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;->getDeferredIntentConfirmationType()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    move-result-object v0

    .line 48
    instance-of v1, p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 50
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$NextAction;

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$NextAction;-><init>(Ljava/lang/String;)V

    .line 49
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;

    invoke-direct {p2, p1, v2, v0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;-><init>(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;

    return-object p2

    .line 55
    :cond_4
    instance-of v1, p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;

    if-eqz v1, :cond_5

    .line 57
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$Confirm;

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;

    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;->getConfirmParams()Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$Confirm;-><init>(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V

    .line 56
    new-instance p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;

    invoke-direct {p2, p1, v2, v0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;-><init>(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;

    return-object p2

    .line 62
    :cond_5
    instance-of v1, p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    if-eqz v1, :cond_6

    .line 63
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Fail;

    .line 64
    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;

    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    .line 65
    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;->getMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p3

    .line 66
    sget-object v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Payment;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Payment;

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;

    .line 63
    invoke-direct {p1, p2, p3, v0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Fail;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;

    return-object p1

    .line 69
    :cond_6
    instance-of v1, p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;

    if-eqz v1, :cond_7

    .line 70
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;

    .line 71
    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p2

    .line 72
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    .line 74
    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;

    invoke-virtual {p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;->getCompletedFullPaymentFlow()Z

    move-result p3

    .line 70
    invoke-direct {v1, p2, p1, v0, p3}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;

    return-object v1

    .line 47
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic canConfirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z
    .locals 0

    .line 19
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->canConfirm(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z

    move-result p1

    return p1
.end method

.method public canConfirm(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z
    .locals 0

    .line 19
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$DefaultImpls;->canConfirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z

    move-result p1

    return p1
.end method

.method public createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultCaller;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;"
        }
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->paymentLauncherFactory:Lkotlin/jvm/functions/Function1;

    .line 86
    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;

    invoke-direct {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;-><init>()V

    check-cast v1, Landroidx/activity/result/contract/ActivityResultContract;

    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$sam$androidx_activity_result_ActivityResultCallback$0;

    .line 87
    invoke-direct {v2, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$sam$androidx_activity_result_ActivityResultCallback$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Landroidx/activity/result/ActivityResultCallback;

    .line 85
    invoke-interface {p1, v1, v2}, Landroidx/activity/result/ActivityResultCaller;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    .line 84
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    return-object p1
.end method

.method public bridge synthetic createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 0

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->createLauncher(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->key:Ljava/lang/String;

    return-object v0
.end method

.method public launch(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V
    .locals 1

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationOption"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationParameters"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    instance-of p3, p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$Confirm;

    if-eqz p3, :cond_0

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$Confirm;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$Confirm;->getConfirmNextParams()Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->launchConfirm(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;Lcom/stripe/android/model/ConfirmStripeIntentParams;)V

    return-void

    .line 100
    :cond_0
    instance-of p3, p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$NextAction;

    if-eqz p3, :cond_1

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$NextAction;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$NextAction;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->launchNextAction(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    return-void

    .line 98
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic launch(Ljava/lang/Object;Ljava/lang/Object;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    check-cast p2, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;

    check-cast p3, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->launch(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V

    return-void
.end method

.method public bridge synthetic option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p1
.end method

.method public option(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;
    .locals 1

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    instance-of v0, p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic toResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Landroid/os/Parcelable;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;
    .locals 0

    .line 19
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    check-cast p4, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->toResult(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    move-result-object p1

    return-object p1
.end method

.method public toResult(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;
    .locals 6

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationParameters"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    instance-of p1, p4, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Completed;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;

    .line 112
    check-cast p4, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Completed;

    invoke-virtual {p4}, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Completed;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p3

    .line 111
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    return-object v0

    .line 115
    :cond_0
    instance-of p1, p4, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;

    if-eqz p1, :cond_1

    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;

    .line 116
    check-cast p4, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;

    invoke-virtual {p4}, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object p2

    .line 117
    invoke-virtual {p4}, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object p3

    invoke-static {p3}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p3

    .line 118
    sget-object p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Payment;->INSTANCE:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Payment;

    check-cast p4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;

    .line 115
    invoke-direct {p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    return-object p1

    .line 120
    :cond_1
    instance-of p1, p4, Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult$Canceled;

    if-eqz p1, :cond_2

    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;

    .line 121
    sget-object p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;->InformCancellation:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;

    .line 120
    invoke-direct {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;-><init>(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;)V

    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;

    return-object p1

    .line 110
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public unregister(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;)V
    .locals 0

    .line 19
    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$DefaultImpls;->unregister(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic unregister(Ljava/lang/Object;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;->unregister(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;)V

    return-void
.end method
