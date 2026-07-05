.class public final Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;
.super Ljava/lang/Object;
.source "StripeMaskedCardViewBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final brandIcon:Landroidx/appcompat/widget/AppCompatImageView;

.field public final checkIcon:Landroidx/appcompat/widget/AppCompatImageView;

.field public final details:Landroidx/appcompat/widget/AppCompatTextView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatTextView;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->rootView:Landroid/view/View;

    .line 33
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->brandIcon:Landroidx/appcompat/widget/AppCompatImageView;

    .line 34
    iput-object p3, p0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->checkIcon:Landroidx/appcompat/widget/AppCompatImageView;

    .line 35
    iput-object p4, p0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->details:Landroidx/appcompat/widget/AppCompatTextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;
    .locals 4

    .line 60
    sget v0, Lcom/stripe/android/R$id;->brand_icon:I

    .line 61
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v1, :cond_0

    .line 66
    sget v0, Lcom/stripe/android/R$id;->check_icon:I

    .line 67
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v2, :cond_0

    .line 72
    sget v0, Lcom/stripe/android/R$id;->details:I

    .line 73
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v3, :cond_0

    .line 78
    new-instance v0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;-><init>(Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatTextView;)V

    return-object v0

    .line 80
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 81
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 50
    sget v0, Lcom/stripe/android/R$layout;->stripe_masked_card_view:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 51
    invoke-static {p1}, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;

    move-result-object p0

    return-object p0

    .line 48
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
