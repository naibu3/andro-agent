.class public final Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;
.super Ljava/lang/Object;
.source "HCaptchaJSInterface.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0008\u0010\u0015\u001a\u00020\u0010H\u0007J\u0008\u0010\u0016\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0004\u001a\u00020\n8GX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;",
        "Ljava/io/Serializable;",
        "handler",
        "Landroid/os/Handler;",
        "config",
        "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "captchaVerifier",
        "Lcom/stripe/hcaptcha/IHCaptchaVerifier;",
        "<init>",
        "(Landroid/os/Handler;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/IHCaptchaVerifier;)V",
        "",
        "getConfig",
        "()Ljava/lang/String;",
        "config$delegate",
        "Lkotlin/Lazy;",
        "onPass",
        "",
        "token",
        "onError",
        "errCode",
        "",
        "onLoaded",
        "onOpen",
        "Companion",
        "hcaptcha_release"
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
.field public static final Companion:Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$Companion;

.field public static final JS_INTERFACE_TAG:Ljava/lang/String; = "JSInterface"

.field private static final serialVersionUID:J = -0x430a70a24a0b6bd1L


# instance fields
.field private final transient captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

.field private final config$delegate:Lkotlin/Lazy;

.field private final transient handler:Landroid/os/Handler;


# direct methods
.method public static synthetic $r8$lambda$6MyevluetyDT_L3omaqq_8Y7s-A(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->onLoaded$lambda$3(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;)V

    return-void
.end method

.method public static synthetic $r8$lambda$FPPY1komR6dHAtX_WIdk5DvwLlE(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;Lcom/stripe/hcaptcha/HCaptchaError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->onError$lambda$2(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;Lcom/stripe/hcaptcha/HCaptchaError;)V

    return-void
.end method

.method public static synthetic $r8$lambda$IrP-6-oeKoVTlbWtxwu-8clZ4Mk(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->onOpen$lambda$4(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Kwf0xtP5_dutB8QyT9V2_Vg1SMw(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->config_delegate$lambda$0(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$MJLof-UgJk0VNC4Lwr3Ily6Sve0(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->onPass$lambda$1(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;Ljava/lang/String;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->Companion:Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lcom/stripe/hcaptcha/IHCaptchaVerifier;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captchaVerifier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->handler:Landroid/os/Handler;

    .line 20
    iput-object p3, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    .line 24
    new-instance p1, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda0;

    invoke-direct {p1, p2}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->config$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private static final config_delegate$lambda$0(Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Ljava/lang/String;
    .locals 1

    .line 25
    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->Companion:Lcom/stripe/hcaptcha/config/HCaptchaConfig$Companion;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    invoke-static {v0, p0}, Lcom/stripe/hcaptcha/encode/EncodeKt;->encodeToJson(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final onError$lambda$2(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;Lcom/stripe/hcaptcha/HCaptchaError;)V
    .locals 3

    .line 36
    iget-object p0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaException;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p1, v1, v2, v1}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lcom/stripe/hcaptcha/HCaptchaError;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lcom/stripe/hcaptcha/IHCaptchaVerifier;->onFailure(Lcom/stripe/hcaptcha/HCaptchaException;)V

    return-void
.end method

.method private static final onLoaded$lambda$3(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;)V
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    invoke-interface {p0}, Lcom/stripe/hcaptcha/IHCaptchaVerifier;->onLoaded()V

    return-void
.end method

.method private static final onOpen$lambda$4(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;)V
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    invoke-interface {p0}, Lcom/stripe/hcaptcha/IHCaptchaVerifier;->onOpen()V

    return-void
.end method

.method private static final onPass$lambda$1(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;Ljava/lang/String;)V
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->captchaVerifier:Lcom/stripe/hcaptcha/IHCaptchaVerifier;

    invoke-interface {p0, p1}, Lcom/stripe/hcaptcha/IHCaptchaVerifier;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getConfig()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->config$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final onError(I)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 35
    sget-object v0, Lcom/stripe/hcaptcha/HCaptchaError;->Companion:Lcom/stripe/hcaptcha/HCaptchaError$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/hcaptcha/HCaptchaError$Companion;->fromId(I)Lcom/stripe/hcaptcha/HCaptchaError;

    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p1}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;Lcom/stripe/hcaptcha/HCaptchaError;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onLoaded()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onOpen()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onPass(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0, p1}, Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/hcaptcha/webview/HCaptchaJSInterface;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
