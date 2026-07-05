.class public final Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;
.super Lcom/reactnativestripesdk/utils/StripeFragment;
.source "CollectBankAccountLauncherFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016J\u0008\u0010\u0014\u001a\u00020\u0013H\u0016J\u0008\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;",
        "Lcom/reactnativestripesdk/utils/StripeFragment;",
        "<init>",
        "()V",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "publishableKey",
        "",
        "stripeAccountId",
        "clientSecret",
        "isPaymentIntent",
        "",
        "collectParams",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "collectBankAccountLauncher",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;",
        "prepare",
        "",
        "onDestroy",
        "createBankAccountLauncher",
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

.field public static final Companion:Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "collect_bank_account_launcher_fragment"


# instance fields
.field private clientSecret:Ljava/lang/String;

.field private collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

.field private collectParams:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

.field private context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private isPaymentIntent:Z

.field private promise:Lcom/facebook/react/bridge/Promise;

.field private publishableKey:Ljava/lang/String;

.field private stripeAccountId:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$3vocQCDpQrUY9LzepE2SK_6JJMU(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->createBankAccountLauncher$lambda$1(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$QgimMj_2IFHNGn-iG0aMijdPLEE(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->prepare$lambda$0(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->Companion:Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/reactnativestripesdk/utils/StripeFragment;-><init>()V

    return-void
.end method

.method public static final synthetic access$setClientSecret$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->clientSecret:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setCollectParams$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->collectParams:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    return-void
.end method

.method public static final synthetic access$setContext$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method public static final synthetic access$setPaymentIntent$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Z)V
    .locals 0

    .line 21
    iput-boolean p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->isPaymentIntent:Z

    return-void
.end method

.method public static final synthetic access$setPromise$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    return-void
.end method

.method public static final synthetic access$setPublishableKey$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->publishableKey:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setStripeAccountId$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->stripeAccountId:Ljava/lang/String;

    return-void
.end method

.method private final createBankAccountLauncher()Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;
    .locals 3

    .line 67
    sget-object v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->Companion:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;

    move-object v1, p0

    check-cast v1, Landroidx/fragment/app/Fragment;

    new-instance v2, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;->create(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    move-result-object v0

    return-object v0
.end method

.method private static final createBankAccountLauncher$lambda$1(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)Lkotlin/Unit;
    .locals 5

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;

    const-string v1, "Bank account collection was canceled."

    const-string v2, "promise"

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    .line 70
    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    .line 71
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    sget-object v4, Lcom/stripe/android/model/StripeIntent$Status;->RequiresPaymentMethod:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v0, v4, :cond_1

    .line 72
    iget-object p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez p1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    .line 73
    :cond_0
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 72
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 75
    :cond_1
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->RequiresConfirmation:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v0, v1, :cond_8

    .line 76
    iget-object v0, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    .line 77
    :cond_2
    iget-boolean v1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->isPaymentIntent:Z

    if-eqz v1, :cond_3

    .line 80
    const-string v1, "null cannot be cast to non-null type com.stripe.android.model.PaymentIntent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromPaymentIntentResult(Lcom/stripe/android/model/PaymentIntent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 78
    const-string v1, "paymentIntent"

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/MappersKt;->createResult(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    goto :goto_0

    .line 83
    :cond_3
    const-string v1, "null cannot be cast to non-null type com.stripe.android.model.SetupIntent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/model/SetupIntent;

    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromSetupIntentResult(Lcom/stripe/android/model/SetupIntent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v1, "setupIntent"

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/MappersKt;->createResult(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 76
    :goto_0
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_1

    .line 89
    :cond_4
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Cancelled;

    if-eqz v0, :cond_6

    .line 90
    iget-object p1, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez p1, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    .line 91
    :cond_5
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    .line 90
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_1

    .line 95
    :cond_6
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;

    if-eqz v0, :cond_a

    .line 96
    iget-object v0, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v3

    :cond_7
    sget-object v1, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 99
    :cond_8
    :goto_1
    move-object p1, p0

    check-cast p1, Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez p0, :cond_9

    const-string p0, "context"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    move-object v3, p0

    :goto_2
    invoke-static {p1, v3}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 100
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 68
    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final prepare$lambda$0(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromFinancialConnectionsEvent(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 38
    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnFinancialConnectionsEvent(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method


# virtual methods
.method public onDestroy()V
    .locals 0

    .line 60
    invoke-super {p0}, Lcom/reactnativestripesdk/utils/StripeFragment;->onDestroy()V

    .line 63
    invoke-static {}, Lcom/stripe/android/financialconnections/FinancialConnections;->clearEventListener()V

    return-void
.end method

.method public prepare()V
    .locals 7

    .line 32
    invoke-direct {p0}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->createBankAccountLauncher()Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    move-result-object v0

    iput-object v0, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    .line 34
    iget-object v0, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const-class v2, Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {v0, v2}, Lcom/facebook/react/bridge/ReactApplicationContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/reactnativestripesdk/StripeSdkModule;

    if-eqz v0, :cond_1

    .line 36
    new-instance v2, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$$ExternalSyntheticLambda1;

    invoke-direct {v2, v0}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$$ExternalSyntheticLambda1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;)V

    invoke-static {v2}, Lcom/stripe/android/financialconnections/FinancialConnections;->setEventListener(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;)V

    .line 42
    :cond_1
    iget-boolean v0, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->isPaymentIntent:Z

    const-string v2, "collectParams"

    const-string v3, "clientSecret"

    const-string v4, "publishableKey"

    const-string v5, "collectBankAccountLauncher"

    if-eqz v0, :cond_6

    .line 43
    iget-object v0, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-nez v0, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    .line 44
    :cond_2
    iget-object v5, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->publishableKey:Ljava/lang/String;

    if-nez v5, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    .line 45
    :cond_3
    iget-object v4, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->stripeAccountId:Ljava/lang/String;

    .line 46
    iget-object v6, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->clientSecret:Ljava/lang/String;

    if-nez v6, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v1

    .line 47
    :cond_4
    iget-object v3, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->collectParams:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    if-nez v3, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v3

    :goto_0
    check-cast v1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    .line 43
    invoke-interface {v0, v5, v4, v6, v1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->presentWithPaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)V

    return-void

    .line 50
    :cond_6
    iget-object v0, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-nez v0, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    .line 51
    :cond_7
    iget-object v5, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->publishableKey:Ljava/lang/String;

    if-nez v5, :cond_8

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    .line 52
    :cond_8
    iget-object v4, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->stripeAccountId:Ljava/lang/String;

    .line 53
    iget-object v6, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->clientSecret:Ljava/lang/String;

    if-nez v6, :cond_9

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v1

    .line 54
    :cond_9
    iget-object v3, p0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->collectParams:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    if-nez v3, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    move-object v1, v3

    :goto_1
    check-cast v1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    .line 50
    invoke-interface {v0, v5, v4, v6, v1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->presentWithSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)V

    return-void
.end method
