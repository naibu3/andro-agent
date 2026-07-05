.class public final Lowasp/sat/agoat/databinding/ActivityTrafficBinding;
.super Ljava/lang/Object;
.source "ActivityTrafficBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final PinningButton:Landroid/widget/Button;

.field public final PinningButton1:Landroid/widget/Button;

.field public final httpButton:Landroid/widget/Button;

.field public final httpsButton:Landroid/widget/Button;

.field private final rootView:Landroid/widget/LinearLayout;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0
    .param p1, "rootView"    # Landroid/widget/LinearLayout;
    .param p2, "PinningButton"    # Landroid/widget/Button;
    .param p3, "PinningButton1"    # Landroid/widget/Button;
    .param p4, "httpButton"    # Landroid/widget/Button;
    .param p5, "httpsButton"    # Landroid/widget/Button;

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->rootView:Landroid/widget/LinearLayout;

    .line 37
    iput-object p2, p0, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->PinningButton:Landroid/widget/Button;

    .line 38
    iput-object p3, p0, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->PinningButton1:Landroid/widget/Button;

    .line 39
    iput-object p4, p0, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->httpButton:Landroid/widget/Button;

    .line 40
    iput-object p5, p0, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->httpsButton:Landroid/widget/Button;

    .line 41
    return-void
.end method

.method public static bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityTrafficBinding;
    .locals 8
    .param p0, "rootView"    # Landroid/view/View;

    .line 70
    sget v0, Lowasp/sat/agoat/R$id;->PinningButton:I

    .line 71
    .local v0, "id":I
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/Button;

    .line 72
    .local v4, "PinningButton":Landroid/widget/Button;
    if-eqz v4, :cond_3

    .line 76
    sget v0, Lowasp/sat/agoat/R$id;->PinningButton1:I

    .line 77
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/Button;

    .line 78
    .local v5, "PinningButton1":Landroid/widget/Button;
    if-eqz v5, :cond_2

    .line 82
    sget v0, Lowasp/sat/agoat/R$id;->httpButton:I

    .line 83
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/Button;

    .line 84
    .local v6, "httpButton":Landroid/widget/Button;
    if-eqz v6, :cond_1

    .line 88
    sget v0, Lowasp/sat/agoat/R$id;->httpsButton:I

    .line 89
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/Button;

    .line 90
    .local v7, "httpsButton":Landroid/widget/Button;
    if-eqz v7, :cond_0

    .line 94
    new-instance v2, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct/range {v2 .. v7}, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;)V

    return-object v2

    .line 91
    :cond_0
    goto :goto_0

    .line 85
    .end local v7    # "httpsButton":Landroid/widget/Button;
    :cond_1
    goto :goto_0

    .line 79
    .end local v6    # "httpButton":Landroid/widget/Button;
    :cond_2
    goto :goto_0

    .line 73
    .end local v5    # "PinningButton1":Landroid/widget/Button;
    :cond_3
    nop

    .line 97
    .end local v4    # "PinningButton":Landroid/widget/Button;
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    .line 98
    .local v1, "missingId":Ljava/lang/String;
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lowasp/sat/agoat/databinding/ActivityTrafficBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;

    .line 51
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityTrafficBinding;

    move-result-object v0

    return-object v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityTrafficBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;
    .param p1, "parent"    # Landroid/view/ViewGroup;
    .param p2, "attachToParent"    # Z

    .line 57
    sget v0, Lowasp/sat/agoat/R$layout;->activity_traffic:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 58
    .local v0, "root":Landroid/view/View;
    if-eqz p2, :cond_0

    .line 59
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 61
    :cond_0
    invoke-static {v0}, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityTrafficBinding;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 46
    iget-object v0, p0, Lowasp/sat/agoat/databinding/ActivityTrafficBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
