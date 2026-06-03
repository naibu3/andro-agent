.class public final Lowasp/sat/agoat/TrafficActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "TrafficActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008\"\u0004\u0008\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0008\"\u0004\u0008\u0010\u0010\n\u00a8\u0006\u0018"
    }
    d2 = {
        "Lowasp/sat/agoat/TrafficActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "client",
        "Lokhttp3/OkHttpClient;",
        "httpsurl",
        "",
        "getHttpsurl",
        "()Ljava/lang/String;",
        "setHttpsurl",
        "(Ljava/lang/String;)V",
        "httpsurl1",
        "getHttpsurl1",
        "setHttpsurl1",
        "httpurl",
        "getHttpurl",
        "setHttpurl",
        "doPinning",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "run",
        "url",
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


# instance fields
.field private final client:Lokhttp3/OkHttpClient;

.field private httpsurl:Ljava/lang/String;

.field private httpsurl1:Ljava/lang/String;

.field private httpurl:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$4nQgxIfPF1L929iGcTJnnVzec24(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/TrafficActivity;->onCreate$lambda$2(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$BJN7bRkrYGSptJQNVCqE3vZ9wBc(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/TrafficActivity;->onCreate$lambda$3(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$atEPTNrtETCpoj5nb5wDIs6C5kY(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/TrafficActivity;->onCreate$lambda$1(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$gsqzEXXn92fBkpOfe1nIlUcAMMM(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/TrafficActivity;->onCreate$lambda$0(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 15
    const-string v0, "http://demo.testfire.net"

    iput-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpurl:Ljava/lang/String;

    .line 16
    const-string v0, "https://owasp.org"

    iput-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpsurl:Ljava/lang/String;

    .line 17
    const-string v0, "https://cve.org"

    iput-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpsurl1:Ljava/lang/String;

    .line 18
    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    iput-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->client:Lokhttp3/OkHttpClient;

    .line 14
    return-void
.end method

.method private static final onCreate$lambda$0(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V
    .locals 1
    .param p0, "this$0"    # Lowasp/sat/agoat/TrafficActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpurl:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/TrafficActivity;->run(Ljava/lang/String;)V

    .line 36
    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V
    .locals 1
    .param p0, "this$0"    # Lowasp/sat/agoat/TrafficActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpsurl:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/TrafficActivity;->run(Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method private static final onCreate$lambda$2(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V
    .locals 1
    .param p0, "this$0"    # Lowasp/sat/agoat/TrafficActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0}, Lowasp/sat/agoat/TrafficActivity;->doPinning()V

    .line 47
    return-void
.end method

.method private static final onCreate$lambda$3(Lowasp/sat/agoat/TrafficActivity;Landroid/view/View;)V
    .locals 1
    .param p0, "this$0"    # Lowasp/sat/agoat/TrafficActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpsurl1:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/TrafficActivity;->run(Ljava/lang/String;)V

    .line 52
    return-void
.end method


# virtual methods
.method public final doPinning()V
    .locals 7

    .line 77
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lowasp/sat/agoat/TrafficActivity$doPinning$1;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lowasp/sat/agoat/TrafficActivity$doPinning$1;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 98
    return-void
.end method

.method public final getHttpsurl()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpsurl:Ljava/lang/String;

    return-object v0
.end method

.method public final getHttpsurl1()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpsurl1:Ljava/lang/String;

    return-object v0
.end method

.method public final getHttpurl()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lowasp/sat/agoat/TrafficActivity;->httpurl:Ljava/lang/String;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 21
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 22
    sget v0, Lowasp/sat/agoat/R$layout;->activity_traffic:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/TrafficActivity;->setContentView(I)V

    .line 25
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    .line 26
    .local v0, "policy":Landroid/os/StrictMode$ThreadPolicy;
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 28
    sget v1, Lowasp/sat/agoat/R$id;->httpButton:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/TrafficActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 29
    .local v1, "HttpButton":Landroid/widget/Button;
    sget v2, Lowasp/sat/agoat/R$id;->httpsButton:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/TrafficActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 30
    .local v2, "HttpsButton":Landroid/widget/Button;
    sget v3, Lowasp/sat/agoat/R$id;->PinningButton:I

    invoke-virtual {p0, v3}, Lowasp/sat/agoat/TrafficActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 31
    .local v3, "PinningButton":Landroid/widget/Button;
    sget v4, Lowasp/sat/agoat/R$id;->PinningButton1:I

    invoke-virtual {p0, v4}, Lowasp/sat/agoat/TrafficActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 34
    .local v4, "PinningButton1":Landroid/widget/Button;
    new-instance v5, Lowasp/sat/agoat/TrafficActivity$$ExternalSyntheticLambda0;

    invoke-direct {v5, p0}, Lowasp/sat/agoat/TrafficActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/TrafficActivity;)V

    invoke-virtual {v1, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    new-instance v5, Lowasp/sat/agoat/TrafficActivity$$ExternalSyntheticLambda1;

    invoke-direct {v5, p0}, Lowasp/sat/agoat/TrafficActivity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/TrafficActivity;)V

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    new-instance v5, Lowasp/sat/agoat/TrafficActivity$$ExternalSyntheticLambda2;

    invoke-direct {v5, p0}, Lowasp/sat/agoat/TrafficActivity$$ExternalSyntheticLambda2;-><init>(Lowasp/sat/agoat/TrafficActivity;)V

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    new-instance v5, Lowasp/sat/agoat/TrafficActivity$$ExternalSyntheticLambda3;

    invoke-direct {v5, p0}, Lowasp/sat/agoat/TrafficActivity$$ExternalSyntheticLambda3;-><init>(Lowasp/sat/agoat/TrafficActivity;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    return-void
.end method

.method public final run(Ljava/lang/String;)V
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    const-string/jumbo v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    nop

    .line 59
    :try_start_0
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 60
    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    .line 59
    nop

    .line 62
    .local v0, "request":Lokhttp3/Request;
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Request sent to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " Please intercept using Proxy"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 64
    iget-object v1, p0, Lowasp/sat/agoat/TrafficActivity;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v1

    new-instance v2, Lowasp/sat/agoat/TrafficActivity$run$1;

    invoke-direct {v2}, Lowasp/sat/agoat/TrafficActivity$run$1;-><init>()V

    check-cast v2, Lokhttp3/Callback;

    invoke-interface {v1, v2}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .end local v0    # "request":Lokhttp3/Request;
    goto :goto_0

    .line 69
    :catch_0
    move-exception v0

    .line 71
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 73
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

.method public final setHttpsurl(Ljava/lang/String;)V
    .locals 1
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, Lowasp/sat/agoat/TrafficActivity;->httpsurl:Ljava/lang/String;

    return-void
.end method

.method public final setHttpsurl1(Ljava/lang/String;)V
    .locals 1
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iput-object p1, p0, Lowasp/sat/agoat/TrafficActivity;->httpsurl1:Ljava/lang/String;

    return-void
.end method

.method public final setHttpurl(Ljava/lang/String;)V
    .locals 1
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iput-object p1, p0, Lowasp/sat/agoat/TrafficActivity;->httpurl:Ljava/lang/String;

    return-void
.end method
