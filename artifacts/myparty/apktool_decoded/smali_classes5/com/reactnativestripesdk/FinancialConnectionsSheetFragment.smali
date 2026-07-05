.class public final Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;
.super Lcom/reactnativestripesdk/utils/StripeFragment;
.source "FinancialConnectionsSheetFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;,
        Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;,
        Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u0008\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0013H\u0002J8\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;",
        "Lcom/reactnativestripesdk/utils/StripeFragment;",
        "<init>",
        "()V",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "mode",
        "Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;",
        "prepare",
        "",
        "onDestroy",
        "onFinancialConnectionsSheetForTokenResult",
        "result",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;",
        "onFinancialConnectionsSheetForDataResult",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
        "presentFinancialConnectionsSheet",
        "clientSecret",
        "",
        "publishableKey",
        "stripeAccountId",
        "attemptToCleanupPreviousFragment",
        "currentActivity",
        "Landroidx/fragment/app/FragmentActivity;",
        "commitFragmentAndStartFlow",
        "Mode",
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

.field public static final Companion:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "financial_connections_sheet_launch_fragment"


# instance fields
.field private configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

.field private context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private mode:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;

.field private promise:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public static synthetic $r8$lambda$YnmAFH2v4B92jTEO5zbUWJMJqI0(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->prepare$lambda$0(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->Companion:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/reactnativestripesdk/utils/StripeFragment;-><init>()V

    return-void
.end method

.method public static final synthetic access$onFinancialConnectionsSheetForDataResult(Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->onFinancialConnectionsSheetForDataResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V

    return-void
.end method

.method public static final synthetic access$onFinancialConnectionsSheetForTokenResult(Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->onFinancialConnectionsSheetForTokenResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method

.method private final attemptToCleanupPreviousFragment(Landroidx/fragment/app/FragmentActivity;)V
    .locals 1

    .line 144
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 145
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 146
    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 147
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method private final commitFragmentAndStartFlow(Landroidx/fragment/app/FragmentActivity;)V
    .locals 2

    .line 152
    :try_start_0
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 153
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 154
    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/Fragment;

    const-string v1, "financial_connections_sheet_launch_fragment"

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 157
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_0

    const-string v0, "promise"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    sget-object v1, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method private final onFinancialConnectionsSheetForDataResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V
    .locals 4

    .line 92
    instance-of v0, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Canceled;

    const-string v1, "promise"

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 93
    iget-object p1, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    sget-object p1, Lcom/reactnativestripesdk/utils/ErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "The flow has been canceled"

    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 96
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Failed;

    if-eqz v0, :cond_3

    .line 97
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 100
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Completed;

    if-eqz v0, :cond_8

    .line 101
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    .line 102
    :cond_4
    new-instance v1, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v1}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 103
    sget-object v3, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->Companion:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Completed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Completed;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;->access$mapFromSession(Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    const-string v3, "session"

    invoke-virtual {v1, v3, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 101
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 106
    iget-object p1, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez p1, :cond_5

    const-string p1, "context"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_5
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    instance-of v0, p1, Landroidx/fragment/app/FragmentActivity;

    if-eqz v0, :cond_6

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/FragmentActivity;

    :cond_6
    if-eqz v2, :cond_7

    .line 107
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 108
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 109
    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 110
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_7
    return-void

    .line 91
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final onFinancialConnectionsSheetForTokenResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V
    .locals 3

    .line 71
    instance-of v0, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Canceled;

    const-string v1, "promise"

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 72
    iget-object p1, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    sget-object p1, Lcom/reactnativestripesdk/utils/ErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "The flow has been canceled"

    invoke-static {p1, v0}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 75
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Failed;

    if-eqz v0, :cond_3

    .line 76
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    sget-object v0, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v2, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void

    .line 79
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;

    if-eqz v0, :cond_8

    .line 80
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->promise:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    sget-object v1, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->Companion:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;->access$createTokenResult(Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 81
    iget-object p1, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez p1, :cond_5

    const-string p1, "context"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v2

    :cond_5
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    instance-of v0, p1, Landroidx/fragment/app/FragmentActivity;

    if-eqz v0, :cond_6

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/FragmentActivity;

    :cond_6
    if-eqz v2, :cond_7

    .line 82
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 83
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 84
    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 85
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_7
    return-void

    .line 70
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final prepare$lambda$0(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-static {p1}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromFinancialConnectionsEvent(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    if-eqz p0, :cond_0

    .line 42
    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p0, p1}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnFinancialConnectionsEvent(Lcom/facebook/react/bridge/ReadableMap;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onDestroy()V
    .locals 0

    .line 63
    invoke-super {p0}, Lcom/reactnativestripesdk/utils/StripeFragment;->onDestroy()V

    .line 66
    invoke-static {}, Lcom/stripe/android/financialconnections/FinancialConnections;->clearEventListener()V

    return-void
.end method

.method public prepare()V
    .locals 5

    .line 39
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

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

    .line 40
    new-instance v2, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;)V

    invoke-static {v2}, Lcom/stripe/android/financialconnections/FinancialConnections;->setEventListener(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventListener;)V

    .line 45
    iget-object v0, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->mode:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;

    if-nez v0, :cond_1

    const-string v0, "mode"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    sget-object v2, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    const-string v3, "configuration"

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    .line 55
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;

    .line 56
    move-object v2, p0

    check-cast v2, Landroidx/fragment/app/Fragment;

    new-instance v4, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$prepare$3;

    invoke-direct {v4, p0}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$prepare$3;-><init>(Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;)V

    check-cast v4, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;

    invoke-virtual {v0, v2, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;->create(Landroidx/fragment/app/Fragment;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;

    move-result-object v0

    .line 57
    iget-object v2, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    if-nez v2, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->present(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-void

    .line 45
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 47
    :cond_4
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;

    .line 49
    move-object v2, p0

    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 50
    new-instance v4, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$prepare$2;

    invoke-direct {v4, p0}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$prepare$2;-><init>(Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;)V

    check-cast v4, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;

    .line 48
    invoke-virtual {v0, v2, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;->createForBankAccountToken(Landroidx/fragment/app/Fragment;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;

    move-result-object v0

    .line 51
    iget-object v2, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    if-nez v2, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move-object v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->present(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-void
.end method

.method public final presentFinancialConnectionsSheet(Ljava/lang/String;Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    iput-object p5, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->promise:Lcom/facebook/react/bridge/Promise;

    .line 124
    iput-object p6, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 125
    iput-object p2, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->mode:Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;

    .line 127
    new-instance p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-direct {p2, p1, p3, p4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    iput-object p2, p0, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    .line 133
    invoke-virtual {p6}, Lcom/facebook/react/bridge/ReactApplicationContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    instance-of p2, p1, Landroidx/fragment/app/FragmentActivity;

    if-eqz p2, :cond_0

    check-cast p1, Landroidx/fragment/app/FragmentActivity;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 134
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->attemptToCleanupPreviousFragment(Landroidx/fragment/app/FragmentActivity;)V

    .line 135
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;->commitFragmentAndStartFlow(Landroidx/fragment/app/FragmentActivity;)V

    return-void

    .line 137
    :cond_1
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;

    .line 138
    invoke-static {}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createMissingActivityError()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p5, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method
