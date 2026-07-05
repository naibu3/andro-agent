.class public final Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;
.super Ljava/lang/Object;
.source "GooglePayPaymentMethodLauncherFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "create",
        "Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "isTestEnv",
        "",
        "paymentMethodRequired",
        "promise",
        "Lcom/facebook/react/bridge/Promise;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/facebook/react/bridge/ReactApplicationContext;ZZLcom/facebook/react/bridge/Promise;)Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    new-instance v0, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;

    invoke-direct {v0}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;-><init>()V

    .line 61
    invoke-static {v0, p1}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->access$setContext$p(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 62
    invoke-static {v0, p2}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->access$setTestEnv$p(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Z)V

    .line 63
    invoke-static {v0, p3}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->access$setPaymentMethodRequired$p(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Z)V

    .line 64
    invoke-static {v0, p4}, Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;->access$setPromise$p(Lcom/reactnativestripesdk/GooglePayPaymentMethodLauncherFragment;Lcom/facebook/react/bridge/Promise;)V

    return-object v0
.end method
