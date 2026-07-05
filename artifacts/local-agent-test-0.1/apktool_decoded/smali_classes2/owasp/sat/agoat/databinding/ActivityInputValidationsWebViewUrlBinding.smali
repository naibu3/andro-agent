.class public final Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;
.super Ljava/lang/Object;
.source "ActivityInputValidationsWebViewUrlBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final load:Landroid/widget/Button;

.field private final rootView:Landroid/widget/LinearLayout;

.field public final url:Landroid/widget/EditText;

.field public final webview1:Landroid/webkit/WebView;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/EditText;Landroid/webkit/WebView;)V
    .locals 0
    .param p1, "rootView"    # Landroid/widget/LinearLayout;
    .param p2, "load"    # Landroid/widget/Button;
    .param p3, "url"    # Landroid/widget/EditText;
    .param p4, "webview1"    # Landroid/webkit/WebView;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;->rootView:Landroid/widget/LinearLayout;

    .line 36
    iput-object p2, p0, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;->load:Landroid/widget/Button;

    .line 37
    iput-object p3, p0, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;->url:Landroid/widget/EditText;

    .line 38
    iput-object p4, p0, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;->webview1:Landroid/webkit/WebView;

    .line 39
    return-void
.end method

.method public static bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;
    .locals 6
    .param p0, "rootView"    # Landroid/view/View;

    .line 69
    sget v0, Lowasp/sat/agoat/R$id;->load:I

    .line 70
    .local v0, "id":I
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 71
    .local v1, "load":Landroid/widget/Button;
    if-eqz v1, :cond_2

    .line 75
    sget v0, Lowasp/sat/agoat/R$id;->url:I

    .line 76
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 77
    .local v2, "url":Landroid/widget/EditText;
    if-eqz v2, :cond_1

    .line 81
    sget v0, Lowasp/sat/agoat/R$id;->webview1:I

    .line 82
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/webkit/WebView;

    .line 83
    .local v3, "webview1":Landroid/webkit/WebView;
    if-eqz v3, :cond_0

    .line 87
    new-instance v4, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;

    move-object v5, p0

    check-cast v5, Landroid/widget/LinearLayout;

    invoke-direct {v4, v5, v1, v2, v3}, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/EditText;Landroid/webkit/WebView;)V

    return-object v4

    .line 84
    :cond_0
    goto :goto_0

    .line 78
    .end local v3    # "webview1":Landroid/webkit/WebView;
    :cond_1
    goto :goto_0

    .line 72
    .end local v2    # "url":Landroid/widget/EditText;
    :cond_2
    nop

    .line 90
    .end local v1    # "load":Landroid/widget/Button;
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    .line 91
    .local v1, "missingId":Ljava/lang/String;
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;

    .line 50
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;

    move-result-object v0

    return-object v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;
    .param p1, "parent"    # Landroid/view/ViewGroup;
    .param p2, "attachToParent"    # Z

    .line 56
    sget v0, Lowasp/sat/agoat/R$layout;->activity_input_validations_web_view_url:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 57
    .local v0, "root":Landroid/view/View;
    if-eqz p2, :cond_0

    .line 58
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 60
    :cond_0
    invoke-static {v0}, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;->bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 44
    iget-object v0, p0, Lowasp/sat/agoat/databinding/ActivityInputValidationsWebViewUrlBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
