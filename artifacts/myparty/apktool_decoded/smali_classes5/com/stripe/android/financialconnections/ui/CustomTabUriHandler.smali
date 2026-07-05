.class public final Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;
.super Ljava/lang/Object;
.source "CustomTabUriHandler.kt"

# interfaces
.implements Landroidx/compose/ui/platform/UriHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;",
        "Landroidx/compose/ui/platform/UriHandler;",
        "context",
        "Landroid/content/Context;",
        "browserManager",
        "Lcom/stripe/android/financialconnections/browser/BrowserManager;",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/financialconnections/browser/BrowserManager;)V",
        "openUri",
        "",
        "uri",
        "",
        "financial-connections_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/financialconnections/browser/BrowserManager;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "browserManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;->context:Landroid/content/Context;

    .line 14
    iput-object p2, p0, Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;->browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

    return-void
.end method


# virtual methods
.method public openUri(Ljava/lang/String;)V
    .locals 3

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;->context:Landroid/content/Context;

    .line 18
    iget-object v1, p0, Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;->browserManager:Lcom/stripe/android/financialconnections/browser/BrowserManager;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v2, "parse(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/stripe/android/financialconnections/browser/BrowserManager;->createBrowserIntentForUrl(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
