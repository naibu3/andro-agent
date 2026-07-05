.class public final Lowasp/sat/agoat/DownloadInvoiceService;
.super Landroid/app/Service;
.source "DownloadInvoiceService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\u0004H\u0016J\u0008\u0010\n\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lowasp/sat/agoat/DownloadInvoiceService;",
        "Landroid/app/Service;",
        "()V",
        "downloadFile",
        "",
        "onBind",
        "Landroid/os/IBinder;",
        "intent",
        "Landroid/content/Intent;",
        "onCreate",
        "onDestroy",
        "onStartCommand",
        "",
        "flags",
        "startId",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$gYuH6MTuzEamRS-6wVPfUgtuvVo(Lowasp/sat/agoat/DownloadInvoiceService;)V
    .locals 0

    invoke-static {p0}, Lowasp/sat/agoat/DownloadInvoiceService;->downloadFile$lambda$1(Lowasp/sat/agoat/DownloadInvoiceService;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private final downloadFile()V
    .locals 2

    .line 38
    new-instance v0, Ljava/lang/Thread;

    .line 53
    new-instance v1, Lowasp/sat/agoat/DownloadInvoiceService$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lowasp/sat/agoat/DownloadInvoiceService$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/DownloadInvoiceService;)V

    .line 38
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 53
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 54
    return-void
.end method

.method private static final downloadFile$lambda$1(Lowasp/sat/agoat/DownloadInvoiceService;)V
    .locals 10
    .param p0, "this$0"    # Lowasp/sat/agoat/DownloadInvoiceService;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    const-string v0, "https://raw.githubusercontent.com/satishpatnayak/MyTest/master/AndroGoatInvoice.txt"

    .line 40
    .local v0, "url1":Ljava/lang/String;
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string/jumbo v2, "parse(url1)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .local v1, "url":Landroid/net/Uri;
    new-instance v2, Landroid/app/DownloadManager$Request;

    invoke-direct {v2, v1}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 42
    .local v2, "request":Landroid/app/DownloadManager$Request;
    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, "AndroGoatInvoice.txt"

    .line 43
    .local v3, "fileName":Ljava/lang/String;
    :cond_0
    move-object v4, v2

    .local v4, "$this$downloadFile_u24lambda_u241_u24lambda_u240":Landroid/app/DownloadManager$Request;
    const/4 v5, 0x0

    .line 44
    .local v5, "$i$a$-apply-DownloadInvoiceService$downloadFile$1$1":I
    const/4 v6, 0x3

    invoke-virtual {v4, v6}, Landroid/app/DownloadManager$Request;->setAllowedNetworkTypes(I)Landroid/app/DownloadManager$Request;

    .line 45
    move-object v6, v3

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {v4, v6}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 46
    const-string v6, "The File is downloading..."

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {v4, v6}, Landroid/app/DownloadManager$Request;->setDescription(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 47
    invoke-virtual {v4}, Landroid/app/DownloadManager$Request;->allowScanningByMediaScanner()V

    .line 48
    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 49
    sget-object v6, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "_invoice.txt"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 50
    const-string v6, "download"

    invoke-virtual {p0, v6}, Lowasp/sat/agoat/DownloadInvoiceService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type android.app.DownloadManager"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/app/DownloadManager;

    .line 51
    .local v6, "manager":Landroid/app/DownloadManager;
    invoke-virtual {v6, v2}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    .line 52
    nop

    .line 43
    .end local v4    # "$this$downloadFile_u24lambda_u241_u24lambda_u240":Landroid/app/DownloadManager$Request;
    .end local v5    # "$i$a$-apply-DownloadInvoiceService$downloadFile$1$1":I
    .end local v6    # "manager":Landroid/app/DownloadManager;
    nop

    .line 53
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    const-string v0, "DOWNLOAD"

    const-string v1, "Service onBind"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 3

    .line 16
    const-string v0, "DOWNLOAD"

    const-string v1, "Service onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    invoke-virtual {p0}, Lowasp/sat/agoat/DownloadInvoiceService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Service Created"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 18
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 34
    const-string v0, "DOWNLOAD"

    const-string v1, "Service onDestroy"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "flags"    # I
    .param p3, "startId"    # I

    .line 26
    const-string v0, "DOWNLOAD"

    const-string v1, "Invoice is being downloaded"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    invoke-direct {p0}, Lowasp/sat/agoat/DownloadInvoiceService;->downloadFile()V

    .line 28
    invoke-virtual {p0}, Lowasp/sat/agoat/DownloadInvoiceService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 29
    invoke-virtual {p0}, Lowasp/sat/agoat/DownloadInvoiceService;->stopSelf()V

    .line 30
    const/4 v0, 0x2

    return v0
.end method
