.class public final Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;
.super Ljava/lang/Object;
.source "ActivityInsecureStorageBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final SDcardButton:Landroid/widget/Button;

.field public final SP1Button:Landroid/widget/Button;

.field public final SPButton:Landroid/widget/Button;

.field public final SQLButton:Landroid/widget/Button;

.field private final rootView:Landroid/widget/LinearLayout;

.field public final tempButton:Landroid/widget/Button;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0
    .param p1, "rootView"    # Landroid/widget/LinearLayout;
    .param p2, "SDcardButton"    # Landroid/widget/Button;
    .param p3, "SP1Button"    # Landroid/widget/Button;
    .param p4, "SPButton"    # Landroid/widget/Button;
    .param p5, "SQLButton"    # Landroid/widget/Button;
    .param p6, "tempButton"    # Landroid/widget/Button;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->rootView:Landroid/widget/LinearLayout;

    .line 41
    iput-object p2, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->SDcardButton:Landroid/widget/Button;

    .line 42
    iput-object p3, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->SP1Button:Landroid/widget/Button;

    .line 43
    iput-object p4, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->SPButton:Landroid/widget/Button;

    .line 44
    iput-object p5, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->SQLButton:Landroid/widget/Button;

    .line 45
    iput-object p6, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->tempButton:Landroid/widget/Button;

    .line 46
    return-void
.end method

.method public static bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;
    .locals 9
    .param p0, "rootView"    # Landroid/view/View;

    .line 75
    sget v0, Lowasp/sat/agoat/R$id;->SDcardButton:I

    .line 76
    .local v0, "id":I
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/Button;

    .line 77
    .local v4, "SDcardButton":Landroid/widget/Button;
    if-eqz v4, :cond_4

    .line 81
    sget v0, Lowasp/sat/agoat/R$id;->SP1Button:I

    .line 82
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/Button;

    .line 83
    .local v5, "SP1Button":Landroid/widget/Button;
    if-eqz v5, :cond_3

    .line 87
    sget v0, Lowasp/sat/agoat/R$id;->SPButton:I

    .line 88
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/Button;

    .line 89
    .local v6, "SPButton":Landroid/widget/Button;
    if-eqz v6, :cond_2

    .line 93
    sget v0, Lowasp/sat/agoat/R$id;->SQLButton:I

    .line 94
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/Button;

    .line 95
    .local v7, "SQLButton":Landroid/widget/Button;
    if-eqz v7, :cond_1

    .line 99
    sget v0, Lowasp/sat/agoat/R$id;->tempButton:I

    .line 100
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/Button;

    .line 101
    .local v8, "tempButton":Landroid/widget/Button;
    if-eqz v8, :cond_0

    .line 105
    new-instance v2, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct/range {v2 .. v8}, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;)V

    return-object v2

    .line 102
    :cond_0
    goto :goto_0

    .line 96
    .end local v8    # "tempButton":Landroid/widget/Button;
    :cond_1
    goto :goto_0

    .line 90
    .end local v7    # "SQLButton":Landroid/widget/Button;
    :cond_2
    goto :goto_0

    .line 84
    .end local v6    # "SPButton":Landroid/widget/Button;
    :cond_3
    goto :goto_0

    .line 78
    .end local v5    # "SP1Button":Landroid/widget/Button;
    :cond_4
    nop

    .line 108
    .end local v4    # "SDcardButton":Landroid/widget/Button;
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    .line 109
    .local v1, "missingId":Ljava/lang/String;
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;

    .line 56
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;

    move-result-object v0

    return-object v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;
    .param p1, "parent"    # Landroid/view/ViewGroup;
    .param p2, "attachToParent"    # Z

    .line 62
    sget v0, Lowasp/sat/agoat/R$layout;->activity_insecure_storage:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 63
    .local v0, "root":Landroid/view/View;
    if-eqz p2, :cond_0

    .line 64
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 66
    :cond_0
    invoke-static {v0}, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 51
    iget-object v0, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
