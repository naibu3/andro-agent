.class public final Lcom/reactnativestripesdk/GooglePayLauncherFragment;
.super Lcom/reactnativestripesdk/utils/StripeFragment;
.source "GooglePayLauncherFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;,
        Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;,
        Lcom/reactnativestripesdk/GooglePayLauncherFragment$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 )2\u00020\u0001:\u0002()B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u001a\u001a\u00020\u0019H\u0016JS\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2+\u0010\u0011\u001a\'\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00190\u0012J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000RB\u0010\u0011\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0018\u0012\u0004\u0012\u00020\u00190\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lcom/reactnativestripesdk/GooglePayLauncherFragment;",
        "Lcom/reactnativestripesdk/utils/StripeFragment;",
        "<init>",
        "()V",
        "launcher",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;",
        "clientSecret",
        "",
        "mode",
        "Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;",
        "configuration",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;",
        "currencyCode",
        "amount",
        "",
        "Ljava/lang/Integer;",
        "label",
        "callback",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
        "Lkotlin/ParameterName;",
        "name",
        "result",
        "Lcom/facebook/react/bridge/WritableMap;",
        "error",
        "",
        "prepare",
        "presentGooglePaySheet",
        "googlePayParams",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "attemptToCleanupPreviousFragment",
        "currentActivity",
        "Landroidx/fragment/app/FragmentActivity;",
        "commitFragmentAndStartFlow",
        "onGooglePayReady",
        "isReady",
        "",
        "onGooglePayResult",
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

.field public static final Companion:Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "google_pay_launcher_fragment"


# instance fields
.field private amount:Ljava/lang/Integer;

.field private callback:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            "-",
            "Lcom/facebook/react/bridge/WritableMap;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private clientSecret:Ljava/lang/String;

.field private configuration:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

.field private currencyCode:Ljava/lang/String;

.field private label:Ljava/lang/String;

.field private launcher:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;

.field private mode:Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->Companion:Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/reactnativestripesdk/utils/StripeFragment;-><init>()V

    return-void
.end method

.method public static final synthetic access$onGooglePayReady(Lcom/reactnativestripesdk/GooglePayLauncherFragment;Z)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->onGooglePayReady(Z)V

    return-void
.end method

.method public static final synthetic access$onGooglePayResult(Lcom/reactnativestripesdk/GooglePayLauncherFragment;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V

    return-void
.end method

.method private final attemptToCleanupPreviousFragment(Landroidx/fragment/app/FragmentActivity;)V
    .locals 1

    .line 84
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 85
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 86
    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 87
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method private final commitFragmentAndStartFlow(Landroidx/fragment/app/FragmentActivity;)V
    .locals 3

    .line 92
    :try_start_0
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 93
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 94
    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/Fragment;

    const-string v1, "google_pay_launcher_fragment"

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 97
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->callback:Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "callback"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    sget-object v2, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v2}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final onGooglePayReady(Z)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    .line 103
    iget-object p1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->mode:Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;

    if-nez p1, :cond_0

    const-string p1, "mode"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    sget-object v1, Lcom/reactnativestripesdk/GooglePayLauncherFragment$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    const-string v2, "clientSecret"

    const-string v3, "launcher"

    if-eq p1, v1, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    .line 108
    iget-object p1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->launcher:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;

    if-nez p1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    iget-object v1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->clientSecret:Ljava/lang/String;

    if-nez v1, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    iget-object v1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->label:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;->presentForPaymentIntent(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 103
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 105
    :cond_4
    iget-object p1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->launcher:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;

    if-nez p1, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_5
    iget-object v1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->clientSecret:Ljava/lang/String;

    if-nez v1, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v0

    :cond_6
    iget-object v2, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->currencyCode:Ljava/lang/String;

    if-nez v2, :cond_7

    const-string v2, "currencyCode"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v0

    :cond_7
    iget-object v3, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->amount:Ljava/lang/Integer;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_8
    iget-object v3, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->label:Ljava/lang/String;

    invoke-virtual {p1, v1, v2, v0, v3}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;->presentForSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    return-void

    .line 112
    :cond_9
    iget-object p1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->callback:Lkotlin/jvm/functions/Function2;

    if-nez p1, :cond_a

    const-string p1, "callback"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    .line 115
    :cond_a
    sget-object v1, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->Failed:Lcom/reactnativestripesdk/utils/GooglePayErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/GooglePayErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    .line 116
    const-string v2, "Google Pay is not available on this device. You can use isPlatformPaySupported to preemptively check for Google Pay support."

    .line 114
    invoke-static {v1, v2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    .line 112
    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->callback:Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "callback"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {v0, p1, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public prepare()V
    .locals 5

    .line 34
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;

    .line 35
    move-object v1, p0

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 36
    iget-object v2, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->configuration:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    if-nez v2, :cond_0

    const-string v2, "configuration"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 37
    :cond_0
    new-instance v3, Lcom/reactnativestripesdk/GooglePayLauncherFragment$prepare$1;

    invoke-direct {v3, p0}, Lcom/reactnativestripesdk/GooglePayLauncherFragment$prepare$1;-><init>(Lcom/reactnativestripesdk/GooglePayLauncherFragment;)V

    check-cast v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;

    .line 38
    new-instance v4, Lcom/reactnativestripesdk/GooglePayLauncherFragment$prepare$2;

    invoke-direct {v4, p0}, Lcom/reactnativestripesdk/GooglePayLauncherFragment$prepare$2;-><init>(Lcom/reactnativestripesdk/GooglePayLauncherFragment;)V

    check-cast v4, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;

    .line 34
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;-><init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;)V

    .line 33
    iput-object v0, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->launcher:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;

    return-void
.end method

.method public final presentGooglePaySheet(Ljava/lang/String;Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReactApplicationContext;Lkotlin/jvm/functions/Function2;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;",
            "Lcom/facebook/react/bridge/ReadableMap;",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;",
            "-",
            "Lcom/facebook/react/bridge/WritableMap;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayParams"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->clientSecret:Ljava/lang/String;

    .line 50
    iput-object p2, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->mode:Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;

    .line 51
    iput-object p5, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->callback:Lkotlin/jvm/functions/Function2;

    .line 52
    const-string p1, "currencyCode"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "USD"

    :cond_0
    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->currencyCode:Ljava/lang/String;

    .line 53
    const-string p1, "amount"

    invoke-static {p3, p1}, Lcom/reactnativestripesdk/utils/MappersKt;->getIntOrNull(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->amount:Ljava/lang/Integer;

    .line 54
    const-string p1, "label"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->label:Ljava/lang/String;

    .line 56
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    .line 58
    const-string p1, "testEnv"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 59
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Test:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    goto :goto_0

    .line 61
    :cond_1
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Production:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    :goto_0
    move-object v1, p1

    .line 63
    const-string p1, "merchantCountryCode"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, ""

    if-nez p1, :cond_2

    move-object v2, p2

    goto :goto_1

    :cond_2
    move-object v2, p1

    .line 64
    :goto_1
    const-string p1, "merchantName"

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    move-object v3, p2

    goto :goto_2

    :cond_3
    move-object v3, p1

    .line 65
    :goto_2
    const-string p1, "isEmailRequired"

    const/4 p2, 0x0

    invoke-static {p3, p1, p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->getBooleanOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z

    move-result v4

    .line 67
    sget-object p1, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->Companion:Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;

    const-string v5, "billingAddressConfig"

    invoke-interface {p3, v5}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v5

    invoke-static {p1, v5}, Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;->access$buildBillingAddressParameters(Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object v5

    .line 69
    const-string p1, "existingPaymentMethodRequired"

    invoke-static {p3, p1, p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->getBooleanOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z

    move-result v6

    .line 70
    const-string p1, "allowCreditCards"

    const/4 p2, 0x1

    invoke-static {p3, p1, p2}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->getBooleanOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z

    move-result v7

    .line 56
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;ZZ)V

    .line 55
    iput-object v0, p0, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->configuration:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;

    .line 73
    invoke-virtual {p4}, Lcom/facebook/react/bridge/ReactApplicationContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    instance-of p2, p1, Landroidx/fragment/app/FragmentActivity;

    const/4 p3, 0x0

    if-eqz p2, :cond_4

    check-cast p1, Landroidx/fragment/app/FragmentActivity;

    goto :goto_3

    :cond_4
    move-object p1, p3

    :goto_3
    if-eqz p1, :cond_5

    .line 74
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->attemptToCleanupPreviousFragment(Landroidx/fragment/app/FragmentActivity;)V

    .line 75
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/GooglePayLauncherFragment;->commitFragmentAndStartFlow(Landroidx/fragment/app/FragmentActivity;)V

    return-void

    .line 77
    :cond_5
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/GooglePayLauncherFragment;

    .line 78
    invoke-static {}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createMissingActivityError()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p5, p3, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
