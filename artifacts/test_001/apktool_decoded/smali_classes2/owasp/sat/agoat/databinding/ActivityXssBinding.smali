.class public final Lowasp/sat/agoat/databinding/ActivityXssBinding;
.super Ljava/lang/Object;
.source "ActivityXssBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field private final rootView:Landroid/widget/LinearLayout;

.field public final webview:Landroid/webkit/WebView;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/webkit/WebView;)V
    .locals 0
    .param p1, "rootView"    # Landroid/widget/LinearLayout;
    .param p2, "webview"    # Landroid/webkit/WebView;

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lowasp/sat/agoat/databinding/ActivityXssBinding;->rootView:Landroid/widget/LinearLayout;

    .line 27
    iput-object p2, p0, Lowasp/sat/agoat/databinding/ActivityXssBinding;->webview:Landroid/webkit/WebView;

    .line 28
    return-void
.end method

.method public static bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityXssBinding;
    .locals 4
    .param p0, "rootView"    # Landroid/view/View;

    .line 57
    sget v0, Lowasp/sat/agoat/R$id;->webview:I

    .line 58
    .local v0, "id":I
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    .line 59
    .local v1, "webview":Landroid/webkit/WebView;
    if-eqz v1, :cond_0

    .line 63
    new-instance v2, Lowasp/sat/agoat/databinding/ActivityXssBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct {v2, v3, v1}, Lowasp/sat/agoat/databinding/ActivityXssBinding;-><init>(Landroid/widget/LinearLayout;Landroid/webkit/WebView;)V

    return-object v2

    .line 60
    :cond_0
    nop

    .line 65
    .end local v1    # "webview":Landroid/webkit/WebView;
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    .line 66
    .local v1, "missingId":Ljava/lang/String;
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lowasp/sat/agoat/databinding/ActivityXssBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;

    .line 38
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lowasp/sat/agoat/databinding/ActivityXssBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityXssBinding;

    move-result-object v0

    return-object v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityXssBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;
    .param p1, "parent"    # Landroid/view/ViewGroup;
    .param p2, "attachToParent"    # Z

    .line 44
    sget v0, Lowasp/sat/agoat/R$layout;->activity_xss:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 45
    .local v0, "root":Landroid/view/View;
    if-eqz p2, :cond_0

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    :cond_0
    invoke-static {v0}, Lowasp/sat/agoat/databinding/ActivityXssBinding;->bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityXssBinding;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lowasp/sat/agoat/databinding/ActivityXssBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 33
    iget-object v0, p0, Lowasp/sat/agoat/databinding/ActivityXssBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
