.class public final Lcom/stripe/android/Stripe$Companion;
.super Ljava/lang/Object;
.source "Stripe.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/Stripe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0007\u0010\u0003R\u0016\u0010\u0008\u001a\u00020\u00058\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\t\u0010\u0003R&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000c\u0010\u0003\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0013\u0010\u0003\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/Stripe$Companion;",
        "",
        "<init>",
        "()V",
        "API_VERSION",
        "",
        "VERSION_NAME",
        "getVERSION_NAME$annotations",
        "VERSION",
        "getVERSION$annotations",
        "appInfo",
        "Lcom/stripe/android/core/AppInfo;",
        "getAppInfo$annotations",
        "getAppInfo",
        "()Lcom/stripe/android/core/AppInfo;",
        "setAppInfo",
        "(Lcom/stripe/android/core/AppInfo;)V",
        "advancedFraudSignalsEnabled",
        "",
        "getAdvancedFraudSignalsEnabled$annotations",
        "getAdvancedFraudSignalsEnabled",
        "()Z",
        "setAdvancedFraudSignalsEnabled",
        "(Z)V",
        "payments-core_release"
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

    .line 1864
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/Stripe$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getAdvancedFraudSignalsEnabled$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method

.method public static synthetic getAppInfo$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method

.method public static synthetic getVERSION$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use StripeSdkVersion.VERSION instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "StripeSdkVersion.VERSION"
            imports = {
                "com.stripe.android.core.version.StripeSdkVersion"
            }
        .end subannotation
    .end annotation

    return-void
.end method

.method public static synthetic getVERSION_NAME$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use StripeSdkVersion.VERSION_NAME instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "StripeSdkVersion.VERSION_NAME"
            imports = {
                "com.stripe.android.core.version.StripeSdkVersion"
            }
        .end subannotation
    .end annotation

    return-void
.end method


# virtual methods
.method public final getAdvancedFraudSignalsEnabled()Z
    .locals 1

    .line 1904
    invoke-static {}, Lcom/stripe/android/Stripe;->access$getAdvancedFraudSignalsEnabled$cp()Z

    move-result v0

    return v0
.end method

.method public final getAppInfo()Lcom/stripe/android/core/AppInfo;
    .locals 1

    .line 1891
    invoke-static {}, Lcom/stripe/android/Stripe;->access$getAppInfo$cp()Lcom/stripe/android/core/AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public final setAdvancedFraudSignalsEnabled(Z)V
    .locals 0

    .line 1904
    invoke-static {p1}, Lcom/stripe/android/Stripe;->access$setAdvancedFraudSignalsEnabled$cp(Z)V

    return-void
.end method

.method public final setAppInfo(Lcom/stripe/android/core/AppInfo;)V
    .locals 0

    .line 1891
    invoke-static {p1}, Lcom/stripe/android/Stripe;->access$setAppInfo$cp(Lcom/stripe/android/core/AppInfo;)V

    return-void
.end method
