.class public final Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;
.super Ljava/lang/Object;
.source "GooglePayLauncherFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativestripesdk/GooglePayLauncherFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "buildBillingAddressParameters",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;",
        "params",
        "Lcom/facebook/react/bridge/ReadableMap;",
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

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$buildBillingAddressParameters(Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;
    .locals 0

    .line 126
    invoke-direct {p0, p1}, Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;->buildBillingAddressParameters(Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    move-result-object p0

    return-object p0
.end method

.method private final buildBillingAddressParameters(Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 130
    const-string v2, "isRequired"

    invoke-static {p1, v2, v1}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->getBooleanOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    if-eqz p1, :cond_1

    .line 131
    const-string v3, "isPhoneNumberRequired"

    invoke-static {p1, v3, v1}, Lcom/reactnativestripesdk/utils/ExtensionsKt;->getBooleanOr(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    if-eqz p1, :cond_2

    .line 133
    const-string v0, "format"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    const-string v0, ""

    .line 134
    :cond_3
    const-string p1, "FULL"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;->Full:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;

    goto :goto_2

    .line 135
    :cond_4
    const-string p1, "MIN"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;->Min:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;

    goto :goto_2

    .line 136
    :cond_5
    sget-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;->Min:Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;

    .line 139
    :goto_2
    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;

    if-eqz v2, :cond_6

    .line 140
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_3

    :cond_6
    move v2, v1

    :goto_3
    if-eqz v3, :cond_7

    .line 142
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 139
    :cond_7
    invoke-direct {v0, v2, p1, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;-><init>(ZLcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig$Format;Z)V

    return-object v0
.end method
