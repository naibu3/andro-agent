.class public final Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;
.super Ljava/lang/Object;
.source "QActivityScreenBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final fragmentContainerView:Landroidx/fragment/app/FragmentContainerView;

.field private final rootView:Landroidx/fragment/app/FragmentContainerView;


# direct methods
.method private constructor <init>(Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;->rootView:Landroidx/fragment/app/FragmentContainerView;

    .line 25
    iput-object p2, p0, Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;->fragmentContainerView:Landroidx/fragment/app/FragmentContainerView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;
    .locals 1

    if-eqz p0, :cond_0

    .line 55
    check-cast p0, Landroidx/fragment/app/FragmentContainerView;

    .line 57
    new-instance v0, Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;

    invoke-direct {v0, p0, p0}, Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;-><init>(Landroidx/fragment/app/FragmentContainerView;Landroidx/fragment/app/FragmentContainerView;)V

    return-object v0

    .line 52
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 36
    invoke-static {p0, v0, v1}, Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;
    .locals 2

    .line 42
    sget v0, Lcom/qonversion/android/sdk/R$layout;->q_activity_screen:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 44
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 46
    :cond_0
    invoke-static {p0}, Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;->bind(Landroid/view/View;)Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;->getRoot()Landroidx/fragment/app/FragmentContainerView;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroidx/fragment/app/FragmentContainerView;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/qonversion/android/sdk/databinding/QActivityScreenBinding;->rootView:Landroidx/fragment/app/FragmentContainerView;

    return-object v0
.end method
