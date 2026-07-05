.class public final Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;
.super Ljava/lang/Object;
.source "StripeAddPaymentMethodActivityBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final root:Landroid/widget/LinearLayout;

.field private final rootView:Landroid/widget/ScrollView;


# direct methods
.method private constructor <init>(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;->rootView:Landroid/widget/ScrollView;

    .line 28
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;->root:Landroid/widget/LinearLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;
    .locals 2

    .line 58
    sget v0, Lcom/stripe/android/R$id;->root:I

    .line 59
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    .line 64
    new-instance v0, Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;

    check-cast p0, Landroid/widget/ScrollView;

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;-><init>(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;)V

    return-object v0

    .line 66
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 67
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 39
    invoke-static {p0, v0, v1}, Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;
    .locals 2

    .line 45
    sget v0, Lcom/stripe/android/R$layout;->stripe_add_payment_method_activity:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 47
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    :cond_0
    invoke-static {p0}, Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;->getRoot()Landroid/widget/ScrollView;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/ScrollView;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodActivityBinding;->rootView:Landroid/widget/ScrollView;

    return-object v0
.end method
