.class public final Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;
.super Ljava/lang/Object;
.source "CollectBankAccountLauncherFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JB\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "create",
        "Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "publishableKey",
        "stripeAccountId",
        "clientSecret",
        "isPaymentIntent",
        "",
        "collectParams",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;",
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

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;Lcom/facebook/react/bridge/Promise;ILjava/lang/Object;)Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;
    .locals 8

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move-object v7, p7

    .line 105
    invoke-virtual/range {v0 .. v7}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;->create(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;Lcom/facebook/react/bridge/Promise;)Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;Lcom/facebook/react/bridge/Promise;)Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collectParams"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    new-instance v0, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;

    invoke-direct {v0}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;-><init>()V

    .line 115
    invoke-static {v0, p1}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->access$setContext$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 116
    invoke-static {v0, p2}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->access$setPublishableKey$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Ljava/lang/String;)V

    .line 117
    invoke-static {v0, p3}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->access$setStripeAccountId$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Ljava/lang/String;)V

    .line 118
    invoke-static {v0, p4}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->access$setClientSecret$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Ljava/lang/String;)V

    .line 119
    invoke-static {v0, p5}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->access$setPaymentIntent$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Z)V

    .line 120
    invoke-static {v0, p6}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->access$setCollectParams$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;)V

    .line 121
    invoke-static {v0, p7}, Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;->access$setPromise$p(Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;Lcom/facebook/react/bridge/Promise;)V

    return-object v0
.end method
