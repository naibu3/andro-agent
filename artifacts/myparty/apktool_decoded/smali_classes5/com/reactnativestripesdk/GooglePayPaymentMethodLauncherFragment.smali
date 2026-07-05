.class public final Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;
.super Landroidx/fragment/app/Fragment;
.source "GooglePayPaymentMethodLauncherFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGooglePayPaymentMethodLauncherFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayPaymentMethodLauncherFragment.kt\ncom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000c2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "isTestEnv",
        "",
        "paymentMethodRequired",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "",
        "view",
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

.field public static final Companion:Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;

.field public static final TAG:Ljava/lang/String; = "google_pay_support_fragment"


# instance fields
.field private context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private isTestEnv:Z

.field private paymentMethodRequired:Z

.field private promise:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public static synthetic $r8$lambda$5n9GdNzY0bocQtcC_jmQ0KxcuKA(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V
    .locals 0

    invoke-static {p0}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->onViewCreated$lambda$2(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V

    return-void
.end method

.method public static synthetic $r8$lambda$O0_n6u74_PKT51mxmpGaP49qHP8(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->onViewCreated$lambda$1(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Z)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->Companion:Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static final synthetic access$setContext$p(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method public static final synthetic access$setPaymentMethodRequired$p(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Z)V
    .locals 0

    .line 15
    iput-boolean p1, p0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->paymentMethodRequired:Z

    return-void
.end method

.method public static final synthetic access$setPromise$p(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    return-void
.end method

.method public static final synthetic access$setTestEnv$p(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Z)V
    .locals 0

    .line 15
    iput-boolean p1, p0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->isTestEnv:Z

    return-void
.end method

.method private static final onViewCreated$lambda$1(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Z)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->promise:Lcom/facebook/react/bridge/Promise;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "promise"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 45
    move-object p1, p0

    check-cast p1, Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-nez p0, :cond_1

    const-string p0, "context"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    invoke-static {p1, v1}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->removeFragment(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method private static final onViewCreated$lambda$2(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance p1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 11

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 32
    new-instance p1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;

    .line 33
    move-object p2, p0

    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 37
    iget-boolean v0, p0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->isTestEnv:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Test:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;->Production:Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;

    :goto_0
    move-object v2, v0

    .line 38
    iget-boolean v7, p0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->paymentMethodRequired:Z

    .line 35
    new-instance v1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;

    const/16 v9, 0x58

    const/4 v10, 0x0

    const-string v3, ""

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    new-instance v0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;)V

    .line 47
    new-instance v2, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$$ExternalSyntheticLambda1;

    invoke-direct {v2}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$$ExternalSyntheticLambda1;-><init>()V

    .line 32
    invoke-direct {p1, p2, v1, v0, v2}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;-><init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;)V

    return-void
.end method
