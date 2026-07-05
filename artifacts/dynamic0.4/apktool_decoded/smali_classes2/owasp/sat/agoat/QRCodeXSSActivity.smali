.class public final Lowasp/sat/agoat/QRCodeXSSActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "QRCodeXSSActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0014J\u0008\u0010\t\u001a\u00020\u0006H\u0014J\u0008\u0010\n\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lowasp/sat/agoat/QRCodeXSSActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "codeScanner",
        "Lcom/budiyev/android/codescanner/CodeScanner;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onPause",
        "onResume",
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
.field private codeScanner:Lcom/budiyev/android/codescanner/CodeScanner;


# direct methods
.method public static synthetic $r8$lambda$JFtpKiY3NWfpJixw1BxAYCmztEA(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lowasp/sat/agoat/QRCodeXSSActivity;->onCreate$lambda$2(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$JQLvoihB8g4oqQlDamxnC47ScWA(Lcom/google/zxing/Result;Landroid/webkit/WebView;Lowasp/sat/agoat/QRCodeXSSActivity;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lowasp/sat/agoat/QRCodeXSSActivity;->onCreate$lambda$1$lambda$0(Lcom/google/zxing/Result;Landroid/webkit/WebView;Lowasp/sat/agoat/QRCodeXSSActivity;)V

    return-void
.end method

.method public static synthetic $r8$lambda$fcNeA8-U58eGK8neKV4MAeIHYcA(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/webkit/WebView;Lcom/google/zxing/Result;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lowasp/sat/agoat/QRCodeXSSActivity;->onCreate$lambda$1(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/webkit/WebView;Lcom/google/zxing/Result;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$1(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/webkit/WebView;Lcom/google/zxing/Result;)V
    .locals 1
    .param p0, "this$0"    # Lowasp/sat/agoat/QRCodeXSSActivity;
    .param p1, "$webView"    # Landroid/webkit/WebView;
    .param p2, "it"    # Lcom/google/zxing/Result;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    new-instance v0, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;

    invoke-direct {v0, p2, p1, p0}, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda2;-><init>(Lcom/google/zxing/Result;Landroid/webkit/WebView;Lowasp/sat/agoat/QRCodeXSSActivity;)V

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/QRCodeXSSActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 62
    return-void
.end method

.method private static final onCreate$lambda$1$lambda$0(Lcom/google/zxing/Result;Landroid/webkit/WebView;Lowasp/sat/agoat/QRCodeXSSActivity;)V
    .locals 5
    .param p0, "$it"    # Lcom/google/zxing/Result;
    .param p1, "$webView"    # Landroid/webkit/WebView;
    .param p2, "this$0"    # Lowasp/sat/agoat/QRCodeXSSActivity;

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v0

    .line 51
    .local v0, "scannedText":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n                    <html>\n                    <body>\n                        <h2>Scanned Product Details</h2>\n                        <h3>Product Found!</h3>\n                        <p>Product ID: <b>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "</b></p>\n                        <p>Status: Available</p>\n                    </body>\n                    </html>\n                "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-static {v1}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 46
    nop

    .line 58
    .local v1, "htmlData":Ljava/lang/String;
    const-string/jumbo v2, "text/html"

    const-string v3, "UTF-8"

    invoke-virtual {p1, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    move-object v2, p2

    check-cast v2, Landroid/content/Context;

    const-string v3, "Scan Complete"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 61
    return-void
.end method

.method private static final onCreate$lambda$2(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/view/View;)V
    .locals 1
    .param p0, "this$0"    # Lowasp/sat/agoat/QRCodeXSSActivity;
    .param p1, "it"    # Landroid/view/View;

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lowasp/sat/agoat/QRCodeXSSActivity;->codeScanner:Lcom/budiyev/android/codescanner/CodeScanner;

    if-nez v0, :cond_0

    const-string v0, "codeScanner"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->startPreview()V

    .line 67
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 21
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 22
    sget v0, Lowasp/sat/agoat/R$layout;->activity_qrcode_xssactivity:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/QRCodeXSSActivity;->setContentView(I)V

    .line 25
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    const-string v1, "android.permission.CAMERA"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x65

    invoke-static {v0, v1, v2}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 30
    :cond_0
    sget v0, Lowasp/sat/agoat/R$id;->scanner_view:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/QRCodeXSSActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/budiyev/android/codescanner/CodeScannerView;

    .line 31
    .local v0, "scannerView":Lcom/budiyev/android/codescanner/CodeScannerView;
    sget v1, Lowasp/sat/agoat/R$id;->webviewxss:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/QRCodeXSSActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    .line 34
    .local v1, "webView":Landroid/webkit/WebView;
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 35
    new-instance v2, Landroid/webkit/WebChromeClient;

    invoke-direct {v2}, Landroid/webkit/WebChromeClient;-><init>()V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 38
    new-instance v2, Lcom/budiyev/android/codescanner/CodeScanner;

    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    invoke-direct {v2, v3, v0}, Lcom/budiyev/android/codescanner/CodeScanner;-><init>(Landroid/content/Context;Lcom/budiyev/android/codescanner/CodeScannerView;)V

    iput-object v2, p0, Lowasp/sat/agoat/QRCodeXSSActivity;->codeScanner:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 41
    iget-object v2, p0, Lowasp/sat/agoat/QRCodeXSSActivity;->codeScanner:Lcom/budiyev/android/codescanner/CodeScanner;

    if-nez v2, :cond_1

    const-string v2, "codeScanner"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_1
    new-instance v3, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0, v1}, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda0;-><init>(Lowasp/sat/agoat/QRCodeXSSActivity;Landroid/webkit/WebView;)V

    invoke-virtual {v2, v3}, Lcom/budiyev/android/codescanner/CodeScanner;->setDecodeCallback(Lcom/budiyev/android/codescanner/DecodeCallback;)V

    .line 65
    new-instance v2, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lowasp/sat/agoat/QRCodeXSSActivity$$ExternalSyntheticLambda1;-><init>(Lowasp/sat/agoat/QRCodeXSSActivity;)V

    invoke-virtual {v0, v2}, Lcom/budiyev/android/codescanner/CodeScannerView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 78
    iget-object v0, p0, Lowasp/sat/agoat/QRCodeXSSActivity;->codeScanner:Lcom/budiyev/android/codescanner/CodeScanner;

    if-nez v0, :cond_0

    const-string v0, "codeScanner"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->releaseResources()V

    .line 79
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onPause()V

    .line 80
    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 71
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onResume()V

    .line 72
    iget-object v0, p0, Lowasp/sat/agoat/QRCodeXSSActivity;->codeScanner:Lcom/budiyev/android/codescanner/CodeScanner;

    if-eqz v0, :cond_1

    .line 73
    iget-object v0, p0, Lowasp/sat/agoat/QRCodeXSSActivity;->codeScanner:Lcom/budiyev/android/codescanner/CodeScanner;

    if-nez v0, :cond_0

    const-string v0, "codeScanner"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->startPreview()V

    .line 75
    :cond_1
    return-void
.end method
