.class public final Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;
.super Ljava/lang/Object;
.source "ActivityCloudServicesBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field private final rootView:Landroid/widget/LinearLayout;

.field public final viewCloudServices:Landroid/widget/Button;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/Button;)V
    .locals 0
    .param p1, "rootView"    # Landroid/widget/LinearLayout;
    .param p2, "viewCloudServices"    # Landroid/widget/Button;

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;->rootView:Landroid/widget/LinearLayout;

    .line 28
    iput-object p2, p0, Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;->viewCloudServices:Landroid/widget/Button;

    .line 29
    return-void
.end method

.method public static bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;
    .locals 4
    .param p0, "rootView"    # Landroid/view/View;

    .line 58
    sget v0, Lowasp/sat/agoat/R$id;->viewCloudServices:I

    .line 59
    .local v0, "id":I
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 60
    .local v1, "viewCloudServices":Landroid/widget/Button;
    if-eqz v1, :cond_0

    .line 64
    new-instance v2, Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct {v2, v3, v1}, Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Button;)V

    return-object v2

    .line 61
    :cond_0
    nop

    .line 66
    .end local v1    # "viewCloudServices":Landroid/widget/Button;
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    .line 67
    .local v1, "missingId":Ljava/lang/String;
    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;

    .line 39
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;

    move-result-object v0

    return-object v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;
    .locals 2
    .param p0, "inflater"    # Landroid/view/LayoutInflater;
    .param p1, "parent"    # Landroid/view/ViewGroup;
    .param p2, "attachToParent"    # Z

    .line 45
    sget v0, Lowasp/sat/agoat/R$layout;->activity_cloud_services:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 46
    .local v0, "root":Landroid/view/View;
    if-eqz p2, :cond_0

    .line 47
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    :cond_0
    invoke-static {v0}, Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;->bind(Landroid/view/View;)Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 34
    iget-object v0, p0, Lowasp/sat/agoat/databinding/ActivityCloudServicesBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
