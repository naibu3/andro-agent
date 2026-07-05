.class public final Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;
.super Ljava/lang/Object;
.source "StripeGooglePayButtonBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final googlePayButtonLayout:Landroid/widget/RelativeLayout;

.field public final googlePayPaymentButton:Lcom/google/android/gms/wallet/button/PayButton;

.field public final googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/RelativeLayout;Lcom/google/android/gms/wallet/button/PayButton;Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->rootView:Landroid/view/View;

    .line 35
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayButtonLayout:Landroid/widget/RelativeLayout;

    .line 36
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPaymentButton:Lcom/google/android/gms/wallet/button/PayButton;

    .line 37
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->googlePayPrimaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;
    .locals 4

    .line 62
    sget v0, Lcom/stripe/android/paymentsheet/R$id;->google_pay_button_layout:I

    .line 63
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    if-eqz v1, :cond_0

    .line 68
    sget v0, Lcom/stripe/android/paymentsheet/R$id;->google_pay_payment_button:I

    .line 69
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/wallet/button/PayButton;

    if-eqz v2, :cond_0

    .line 74
    sget v0, Lcom/stripe/android/paymentsheet/R$id;->google_pay_primary_button:I

    .line 75
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    if-eqz v3, :cond_0

    .line 80
    new-instance v0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;-><init>(Landroid/view/View;Landroid/widget/RelativeLayout;Lcom/google/android/gms/wallet/button/PayButton;Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)V

    return-object v0

    .line 83
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 84
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 52
    sget v0, Lcom/stripe/android/paymentsheet/R$layout;->stripe_google_pay_button:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 53
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->bind(Landroid/view/View;)Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;

    move-result-object p0

    return-object p0

    .line 50
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
