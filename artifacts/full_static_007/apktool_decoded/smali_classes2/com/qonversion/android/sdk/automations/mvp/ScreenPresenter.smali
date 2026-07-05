.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
.super Ljava/lang/Object;
.source "ScreenPresenter.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$Presenter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;,
        Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000cH\u0016J\u000c\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u000c*\u00020\u0013H\u0002J\u000c\u0010\u0015\u001a\u00020\u000f*\u00020\u0013H\u0002J\u000c\u0010\u0016\u001a\u00020\u000f*\u00020\u0013H\u0002J\u000c\u0010\u000e\u001a\u00020\u000f*\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$Presenter;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "view",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "confirmScreenView",
        "",
        "screenId",
        "",
        "getHtmlPageForScreen",
        "shouldOverrideUrlLoading",
        "",
        "url",
        "getActionType",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
        "Landroid/net/Uri;",
        "getData",
        "isAutomationsHost",
        "isQScheme",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ACTION:Ljava/lang/String; = "action"

.field public static final Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;

.field private static final DATA:Ljava/lang/String; = "data"

.field private static final HOST:Ljava/lang/String; = "automation"

.field private static final REGEX:Ljava/lang/String; = "qon-.+"

.field private static final SCHEMA:Ljava/lang/String; = "qon-"


# instance fields
.field private final logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

.field private final view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 11
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    .line 14
    new-instance p1, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    invoke-direct {p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    return-void
.end method

.method public static final synthetic access$getView$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
    .locals 0

    .line 9
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    return-object p0
.end method

.method private final getActionType(Landroid/net/Uri;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
    .locals 1

    .line 72
    const-string v0, "action"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 73
    sget-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Companion:Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;->fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    move-result-object p1

    return-object p1
.end method

.method private final getData(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 76
    const-string v0, "data"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getHtmlPageForScreen(Ljava/lang/String;)V
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    new-instance v1, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;Ljava/lang/String;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$2;

    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$2;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->screens(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final isAutomationsHost(Landroid/net/Uri;)Z
    .locals 4

    .line 89
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "automation"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->equals$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final isQScheme(Landroid/net/Uri;)Z
    .locals 2

    .line 81
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 82
    new-instance v0, Lkotlin/text/Regex;

    .line 83
    const-string v1, "qon-.+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 84
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final shouldOverrideUrlLoading(Landroid/net/Uri;)Z
    .locals 1

    .line 78
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->isAutomationsHost(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->isQScheme(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public confirmScreenView(Ljava/lang/String;)V
    .locals 1

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->views(Ljava/lang/String;)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Ljava/lang/String;)Z
    .locals 3

    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "shouldOverrideUrlLoading() -> url:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 23
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->shouldOverrideUrlLoading(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    .line 28
    :cond_1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getActionType(Landroid/net/Uri;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    move-result-object v1

    sget-object v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    return v0

    .line 60
    :pswitch_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-interface {p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->restore()V

    goto :goto_0

    .line 54
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getData(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 56
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->purchase(Ljava/lang/String;)V

    goto :goto_0

    .line 48
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getData(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 50
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getHtmlPageForScreen(Ljava/lang/String;)V

    goto :goto_0

    .line 45
    :pswitch_3
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-static {p1, v2, v0, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View$DefaultImpls;->closeAll$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/automations/dto/QActionResult;ILjava/lang/Object;)V

    goto :goto_0

    .line 42
    :pswitch_4
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-static {p1, v2, v0, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View$DefaultImpls;->close$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/automations/dto/QActionResult;ILjava/lang/Object;)V

    goto :goto_0

    .line 36
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getData(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 38
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->openDeepLink(Ljava/lang/String;)V

    goto :goto_0

    .line 30
    :pswitch_6
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getData(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 32
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->openLink(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
