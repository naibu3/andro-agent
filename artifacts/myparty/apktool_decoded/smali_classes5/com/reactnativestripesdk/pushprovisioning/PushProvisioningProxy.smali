.class public final Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;
.super Ljava/lang/Object;
.source "PushProvisioningProxy.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0008Jk\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052S\u0010\u0019\u001aO\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0008(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u001d\u00a2\u0006\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0008(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u001d\u00a2\u0006\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0008(\u001e\u0012\u0004\u0012\u00020\u000f0\u001aj\u0002`\u001fJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "description",
        "tokenRequiringTokenization",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "getApiVersion",
        "isNFCEnabled",
        "",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "invoke",
        "",
        "view",
        "Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;",
        "cardDescription",
        "ephemeralKey",
        "token",
        "isCardInWallet",
        "activity",
        "Landroid/app/Activity;",
        "cardLastFour",
        "callback",
        "Lkotlin/Function3;",
        "Lkotlin/ParameterName;",
        "name",
        "Lcom/facebook/react/bridge/WritableMap;",
        "error",
        "Lcom/reactnativestripesdk/pushprovisioning/TokenCheckHandler;",
        "createActivityEventListener",
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

.field public static final INSTANCE:Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;

.field private static final TAG:Ljava/lang/String; = "StripePushProvisioning"

.field private static description:Ljava/lang/String;

.field private static tokenRequiringTokenization:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;

    invoke-direct {v0}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;-><init>()V

    sput-object v0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->INSTANCE:Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;

    .line 19
    const-string v0, "Added by Stripe"

    sput-object v0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->description:Ljava/lang/String;

    const/16 v0, 0x8

    sput v0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getDescription$p()Ljava/lang/String;
    .locals 1

    .line 17
    sget-object v0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->description:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getTokenRequiringTokenization$p()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    .line 17
    sget-object v0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->tokenRequiringTokenization:Lcom/facebook/react/bridge/ReadableMap;

    return-object v0
.end method

.method private final createActivityEventListener(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V
    .locals 1

    .line 78
    new-instance v0, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;

    invoke-direct {v0, p2}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy$createActivityEventListener$listener$1;-><init>(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V

    .line 130
    check-cast v0, Lcom/facebook/react/bridge/ActivityEventListener;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactApplicationContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    return-void
.end method


# virtual methods
.method public final getApiVersion()Ljava/lang/String;
    .locals 2

    .line 24
    :try_start_0
    const-string v0, "com.stripe.android.pushProvisioning.PushProvisioningActivity"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    const-string v0, "2019-09-09"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 27
    :catch_0
    const-string v0, "StripePushProvisioning"

    const-string v1, "PushProvisioning dependency not found"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    const-string v0, ""

    return-object v0
.end method

.method public final invoke(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardDescription"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ephemeralKey"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    :try_start_0
    const-string v0, "com.stripe.android.pushProvisioning.PushProvisioningActivityStarter"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 48
    sput-object p3, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->description:Ljava/lang/String;

    .line 49
    sput-object p5, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->tokenRequiringTokenization:Lcom/facebook/react/bridge/ReadableMap;

    .line 50
    invoke-direct {p0, p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->createActivityEventListener(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;)V

    .line 51
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 52
    new-instance p2, Lcom/reactnativestripesdk/pushprovisioning/DefaultPushProvisioningProxy;

    invoke-direct {p2}, Lcom/reactnativestripesdk/pushprovisioning/DefaultPushProvisioningProxy;-><init>()V

    .line 53
    sget-object p3, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;->description:Ljava/lang/String;

    new-instance p5, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;

    invoke-direct {p5, p4}, Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1, p3, p5}, Lcom/reactnativestripesdk/pushprovisioning/DefaultPushProvisioningProxy;->beginPushProvisioning(Landroid/app/Activity;Ljava/lang/String;Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;)V

    return-void

    .line 55
    :cond_0
    move-object p1, p0

    check-cast p1, Lcom/reactnativestripesdk/pushprovisioning/PushProvisioningProxy;

    .line 57
    const-string p1, "Failed"

    const-string p3, "Activity doesn\'t exist yet. You can safely retry."

    invoke-static {p1, p3}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    .line 56
    invoke-virtual {p2, p1}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->dispatchEvent(Lcom/facebook/react/bridge/WritableMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "There was a problem using Stripe Android PushProvisioning: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StripePushProvisioning"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final isCardInWallet(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lcom/facebook/react/bridge/WritableMap;",
            "-",
            "Lcom/facebook/react/bridge/WritableMap;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardLastFour"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    sget-object v0, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy;->INSTANCE:Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy;

    invoke-virtual {v0, p1, p2, p3}, Lcom/reactnativestripesdk/pushprovisioning/TapAndPayProxy;->findExistingToken(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public final isNFCEnabled(Lcom/facebook/react/bridge/ReactApplicationContext;)Z
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactApplicationContext;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.nfc"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 33
    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 34
    invoke-virtual {p1}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method
