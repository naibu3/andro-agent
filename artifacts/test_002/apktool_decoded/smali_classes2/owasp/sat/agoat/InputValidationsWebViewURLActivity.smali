.class public final Lowasp/sat/agoat/InputValidationsWebViewURLActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "InputValidationsWebViewURLActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"
    }
    d2 = {
        "Lowasp/sat/agoat/InputValidationsWebViewURLActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
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
.method public static synthetic $r8$lambda$U4EF0FFD0Tf0h5rnsaH82wXLtHQ(Landroid/webkit/WebView;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lowasp/sat/agoat/InputValidationsWebViewURLActivity;->onCreate$lambda$0(Landroid/webkit/WebView;Landroid/widget/EditText;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private static final onCreate$lambda$0(Landroid/webkit/WebView;Landroid/widget/EditText;Landroid/view/View;)V
    .locals 2
    .param p0, "$webView"    # Landroid/webkit/WebView;
    .param p1, "$urlEditText"    # Landroid/widget/EditText;
    .param p2, "it"    # Landroid/view/View;

    .line 19
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string/jumbo v1, "webView.settings"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .local v0, "webViewSettings":Landroid/webkit/WebSettings;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 21
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 22
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 23
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 24
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 25
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 26
    .local v1, "url":Ljava/lang/String;
    invoke-virtual {p0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 27
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 12
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    sget v0, Lowasp/sat/agoat/R$layout;->activity_input_validations_web_view_url:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InputValidationsWebViewURLActivity;->setContentView(I)V

    .line 14
    sget v0, Lowasp/sat/agoat/R$id;->load:I

    invoke-virtual {p0, v0}, Lowasp/sat/agoat/InputValidationsWebViewURLActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 15
    .local v0, "loadButton":Landroid/widget/Button;
    sget v1, Lowasp/sat/agoat/R$id;->webview1:I

    invoke-virtual {p0, v1}, Lowasp/sat/agoat/InputValidationsWebViewURLActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    .line 16
    .local v1, "webView":Landroid/webkit/WebView;
    sget v2, Lowasp/sat/agoat/R$id;->url:I

    invoke-virtual {p0, v2}, Lowasp/sat/agoat/InputValidationsWebViewURLActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 18
    .local v2, "urlEditText":Landroid/widget/EditText;
    new-instance v3, Lowasp/sat/agoat/InputValidationsWebViewURLActivity$$ExternalSyntheticLambda0;

    invoke-direct {v3, v1, v2}, Lowasp/sat/agoat/InputValidationsWebViewURLActivity$$ExternalSyntheticLambda0;-><init>(Landroid/webkit/WebView;Landroid/widget/EditText;)V

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    return-void
.end method
