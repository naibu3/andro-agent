.class public final Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;
.super Ljava/lang/Object;
.source "StripeAddPaymentMethodCardViewBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final addPaymentMethodCard:Landroid/widget/LinearLayout;

.field public final billingAddressWidget:Lcom/stripe/android/view/ShippingInfoWidget;

.field public final cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

.field private final rootView:Landroid/widget/LinearLayout;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/stripe/android/view/ShippingInfoWidget;Lcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;->rootView:Landroid/widget/LinearLayout;

    .line 36
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;->addPaymentMethodCard:Landroid/widget/LinearLayout;

    .line 37
    iput-object p3, p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;->billingAddressWidget:Lcom/stripe/android/view/ShippingInfoWidget;

    .line 38
    iput-object p4, p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;
    .locals 4

    .line 68
    move-object v0, p0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 70
    sget v1, Lcom/stripe/android/R$id;->billing_address_widget:I

    .line 71
    invoke-static {p0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/ShippingInfoWidget;

    if-eqz v2, :cond_0

    .line 76
    sget v1, Lcom/stripe/android/R$id;->card_multiline_widget:I

    .line 77
    invoke-static {p0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/view/CardMultilineWidget;

    if-eqz v3, :cond_0

    .line 82
    new-instance p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;

    invoke-direct {p0, v0, v0, v2, v3}, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/stripe/android/view/ShippingInfoWidget;Lcom/stripe/android/view/CardMultilineWidget;)V

    return-object p0

    .line 85
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 86
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 49
    invoke-static {p0, v0, v1}, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;
    .locals 2

    .line 55
    sget v0, Lcom/stripe/android/R$layout;->stripe_add_payment_method_card_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 57
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 59
    :cond_0
    invoke-static {p0}, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeAddPaymentMethodCardViewBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
