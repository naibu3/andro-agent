.class public final Lcom/stripe/android/link/LinkForegroundActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "LinkForegroundActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkForegroundActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkForegroundActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkForegroundActivity.kt\ncom/stripe/android/link/LinkForegroundActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,97:1\n29#2:98\n*S KotlinDebug\n*F\n+ 1 LinkForegroundActivity.kt\ncom/stripe/android/link/LinkForegroundActivity\n*L\n80#1:98\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0010\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0008\u0010\u000f\u001a\u00020\u0007H\u0014J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0008\u0010\u0011\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkForegroundActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "hasLaunchedPopup",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onSaveInstanceState",
        "outState",
        "onNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "onResume",
        "handleRedirectIfAvailable",
        "launchPopup",
        "Companion",
        "paymentsheet_release"
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

.field public static final ACTION_REDIRECT:Ljava/lang/String; = "LinkForegroundActivity.redirect"

.field public static final Companion:Lcom/stripe/android/link/LinkForegroundActivity$Companion;

.field public static final EXTRA_FAILURE:Ljava/lang/String; = "LinkFailure"

.field public static final EXTRA_POPUP_URL:Ljava/lang/String; = "LinkPopupUrl"

.field public static final RESULT_COMPLETE:I = 0xc2cf

.field public static final RESULT_FAILURE:I = 0x164e7

.field private static final SAVED_STATE_HAS_LAUNCHED_POPUP:Ljava/lang/String; = "LinkHasLaunchedPopup"


# instance fields
.field private hasLaunchedPopup:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkForegroundActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkForegroundActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkForegroundActivity;->Companion:Lcom/stripe/android/link/LinkForegroundActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkForegroundActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private final handleRedirectIfAvailable(Landroid/content/Intent;)V
    .locals 2

    .line 71
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LinkForegroundActivity.redirect"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0xc2cf

    .line 72
    invoke-virtual {p0, v0, p1}, Lcom/stripe/android/link/LinkForegroundActivity;->setResult(ILandroid/content/Intent;)V

    .line 73
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkForegroundActivity;->finish()V

    :cond_0
    return-void
.end method

.method private final launchPopup()V
    .locals 3

    const/4 v0, 0x1

    .line 78
    iput-boolean v0, p0, Lcom/stripe/android/link/LinkForegroundActivity;->hasLaunchedPopup:Z

    .line 80
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkForegroundActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "LinkPopupUrl"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 98
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 82
    invoke-virtual {p0, v0}, Lcom/stripe/android/link/LinkForegroundActivity;->setResult(I)V

    .line 83
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkForegroundActivity;->finish()V

    return-void

    .line 87
    :cond_1
    :try_start_0
    new-instance v1, Landroidx/browser/customtabs/CustomTabsIntent$Builder;

    invoke-direct {v1}, Landroidx/browser/customtabs/CustomTabsIntent$Builder;-><init>()V

    const/4 v2, 0x2

    .line 88
    invoke-virtual {v1, v2}, Landroidx/browser/customtabs/CustomTabsIntent$Builder;->setShareState(I)Landroidx/browser/customtabs/CustomTabsIntent$Builder;

    move-result-object v1

    .line 89
    invoke-virtual {v1}, Landroidx/browser/customtabs/CustomTabsIntent$Builder;->build()Landroidx/browser/customtabs/CustomTabsIntent;

    move-result-object v1

    .line 90
    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 92
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "LinkFailure"

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    const v1, 0x164e7

    invoke-virtual {p0, v1, v0}, Lcom/stripe/android/link/LinkForegroundActivity;->setResult(ILandroid/content/Intent;)V

    .line 93
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkForegroundActivity;->finish()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 40
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    .line 42
    const-string v0, "LinkHasLaunchedPopup"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkForegroundActivity;->hasLaunchedPopup:Z

    .line 44
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkForegroundActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "getIntent(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkForegroundActivity;->handleRedirectIfAvailable(Landroid/content/Intent;)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 54
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkForegroundActivity;->handleRedirectIfAvailable(Landroid/content/Intent;)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 58
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 60
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkForegroundActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 61
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkForegroundActivity;->hasLaunchedPopup:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0, v0}, Lcom/stripe/android/link/LinkForegroundActivity;->setResult(I)V

    .line 63
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkForegroundActivity;->finish()V

    return-void

    .line 65
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/link/LinkForegroundActivity;->launchPopup()V

    :cond_1
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 49
    const-string v0, "LinkHasLaunchedPopup"

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkForegroundActivity;->hasLaunchedPopup:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
