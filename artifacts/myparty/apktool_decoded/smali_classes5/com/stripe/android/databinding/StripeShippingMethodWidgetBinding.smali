.class public final Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;
.super Ljava/lang/Object;
.source "StripeShippingMethodWidgetBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field private final rootView:Landroid/view/View;

.field public final shippingMethods:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;->rootView:Landroid/view/View;

    .line 26
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;->shippingMethods:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;
    .locals 2

    .line 51
    sget v0, Lcom/stripe/android/R$id;->shipping_methods:I

    .line 52
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_0

    .line 57
    new-instance v0, Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;-><init>(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V

    return-object v0

    .line 59
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 60
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 41
    sget v0, Lcom/stripe/android/R$layout;->stripe_shipping_method_widget:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 42
    invoke-static {p1}, Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;

    move-result-object p0

    return-object p0

    .line 39
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeShippingMethodWidgetBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
