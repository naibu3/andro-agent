.class public final Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;
.super Ljava/lang/Object;
.source "ActivityInsecureStorageSharedPrefsBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final SPViewButton:Landroid/widget/Button;

.field public final password:Landroid/widget/EditText;

.field private final rootView:Landroid/widget/LinearLayout;

.field public final userName:Landroid/widget/EditText;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0
    .param p1, "rootView"    # Landroid/widget/LinearLayout;
    .param p2, "SPViewButton"    # Landroid/widget/Button;
    .param p3, "password"    # Landroid/widget/EditText;
    .param p4, "userName"    # Landroid/widget/EditText;

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;->rootView:Landroid/widget/LinearLayout;

    .line 35
    iput-object p2, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;->SPViewButton:Landroid/widget/Button;

    .line 36
    iput-object p3, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;->password:Landroid/widget/EditText;

    .line 37
    iput-object p4, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;->userName:Landroid/widget/EditText;

    .line 38
    return-void
.end method

.method public static bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;
    .locals 6
    .param p0, "rootView"    # Landroid/view/View;

    .line 68
    sget v0, Lowasp/sat/agoat/R$id;->SPViewButton:I

    .line 69
    .local v0, "id":I
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 70
    .local v1, "SPViewButton":Landroid/widget/Button;
    if-eqz v1, :cond_2

    .line 74
    sget v0, Lowasp/sat/agoat/R$id;->password:I

    .line 75
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 76
    .local v2, "password":Landroid/widget/EditText;
    if-eqz v2, :cond_1

    .line 80
    sget v0, Lowasp/sat/agoat/R$id;->userName:I

    .line 81
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    .line 82
    .local v3, "userName":Landroid/widget/EditText;
    if-eqz v3, :cond_0

    .line 86
    new-instance v4, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;

    move-object v5, p0

    check-cast v5, Landroid/widget/LinearLayout;

    invoke-direct {v4, v5, v1, v2, v3}, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/EditText;Landroid/widget/EditText;)V

    return-object v4

    .line 83
    :cond_0
    goto :goto_0

    .line 77
    .end local v3    # "userName":Landroid/widget/EditText;
    :cond_1
    goto :goto_0

    .line 71
    .end local v2    # "password":Landroid/widget/EditText;
    :cond_2
    nop

    .line 89
    .end local v1    # "SPViewButton":Landroid/widget/Button;
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    .line 90
    .local v1, "missingId":Ljava/lang/String;
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;

    .line 49
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;

    move-result-object v0

    return-object v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;
    .param p1, "parent"    # Landroid/view/ViewGroup;
    .param p2, "attachToParent"    # Z

    .line 55
    sget v0, Lowasp/sat/agoat/R$layout;->activity_insecure_storage_shared_prefs:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 56
    .local v0, "root":Landroid/view/View;
    if-eqz p2, :cond_0

    .line 57
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 59
    :cond_0
    invoke-static {v0}, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;->bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 43
    iget-object v0, p0, Lowasp/sat/agoat/databinding/ActivityInsecureStorageSharedPrefsBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
