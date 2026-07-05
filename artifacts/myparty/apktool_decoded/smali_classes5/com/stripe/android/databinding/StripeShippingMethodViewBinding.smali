.class public final Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;
.super Ljava/lang/Object;
.source "StripeShippingMethodViewBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final description:Landroid/widget/TextView;

.field public final name:Landroid/widget/TextView;

.field public final price:Landroid/widget/TextView;

.field private final rootView:Landroid/view/View;

.field public final selectedIcon:Landroidx/appcompat/widget/AppCompatImageView;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;->rootView:Landroid/view/View;

    .line 36
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;->description:Landroid/widget/TextView;

    .line 37
    iput-object p3, p0, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;->name:Landroid/widget/TextView;

    .line 38
    iput-object p4, p0, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;->price:Landroid/widget/TextView;

    .line 39
    iput-object p5, p0, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;->selectedIcon:Landroidx/appcompat/widget/AppCompatImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;
    .locals 8

    .line 64
    sget v0, Lcom/stripe/android/R$id;->description:I

    .line 65
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    .line 70
    sget v0, Lcom/stripe/android/R$id;->name:I

    .line 71
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    .line 76
    sget v0, Lcom/stripe/android/R$id;->price:I

    .line 77
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    .line 82
    sget v0, Lcom/stripe/android/R$id;->selected_icon:I

    .line 83
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v7, :cond_0

    .line 88
    new-instance v2, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;-><init>(Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatImageView;)V

    return-object v2

    :cond_0
    move-object v3, p0

    .line 90
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 91
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 54
    sget v0, Lcom/stripe/android/R$layout;->stripe_shipping_method_view:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 55
    invoke-static {p1}, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;

    move-result-object p0

    return-object p0

    .line 52
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeShippingMethodViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
