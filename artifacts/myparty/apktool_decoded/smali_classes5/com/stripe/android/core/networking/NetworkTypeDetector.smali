.class public final Lcom/stripe/android/core/networking/NetworkTypeDetector;
.super Ljava/lang/Object;
.source "NetworkTypeDetector.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u000b\u0010\t\u001a\u0004\u0018\u00010\nH\u0086\u0002J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/NetworkTypeDetector;",
        "",
        "connectivityManager",
        "Landroid/net/ConnectivityManager;",
        "<init>",
        "(Landroid/net/ConnectivityManager;)V",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "invoke",
        "",
        "determineMobileNetworkType",
        "Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;",
        "subtype",
        "",
        "NetworkType",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final connectivityManager:Landroid/net/ConnectivityManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 14
    invoke-direct {p0, p1}, Lcom/stripe/android/core/networking/NetworkTypeDetector;-><init>(Landroid/net/ConnectivityManager;)V

    return-void
.end method

.method private constructor <init>(Landroid/net/ConnectivityManager;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/core/networking/NetworkTypeDetector;->connectivityManager:Landroid/net/ConnectivityManager;

    return-void
.end method

.method private final determineMobileNetworkType(I)Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 67
    sget-object p1, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Unknown:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    return-object p1

    .line 64
    :pswitch_0
    sget-object p1, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile5G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    return-object p1

    .line 61
    :pswitch_1
    sget-object p1, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile4G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    return-object p1

    .line 55
    :pswitch_2
    sget-object p1, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile3G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    return-object p1

    .line 43
    :pswitch_3
    sget-object p1, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Mobile2G:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke()Ljava/lang/String;
    .locals 2

    .line 20
    iget-object v0, p0, Lcom/stripe/android/core/networking/NetworkTypeDetector;->connectivityManager:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 22
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    if-eq v1, v0, :cond_1

    .line 29
    sget-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->Unknown:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    goto :goto_0

    .line 27
    :cond_1
    sget-object v0, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->WiFi:Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/stripe/android/core/networking/NetworkTypeDetector;->determineMobileNetworkType(I)Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;

    move-result-object v0

    .line 32
    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method
