.class public final Lcom/stripe/android/databinding/StripeCardFormViewBinding;
.super Ljava/lang/Object;
.source "StripeCardFormViewBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

.field public final cardMultilineWidgetContainer:Lcom/google/android/material/card/MaterialCardView;

.field public final countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

.field public final countryPostalDivider:Landroid/view/View;

.field public final errors:Landroid/widget/TextView;

.field public final postalCode:Lcom/stripe/android/view/PostalCodeEditText;

.field public final postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/stripe/android/view/CardMultilineWidget;Lcom/google/android/material/card/MaterialCardView;Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/View;Landroid/widget/TextView;Lcom/stripe/android/view/PostalCodeEditText;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->rootView:Landroid/view/View;

    .line 53
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    .line 54
    iput-object p3, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->cardMultilineWidgetContainer:Lcom/google/android/material/card/MaterialCardView;

    .line 55
    iput-object p4, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    .line 56
    iput-object p5, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->countryPostalDivider:Landroid/view/View;

    .line 57
    iput-object p6, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->errors:Landroid/widget/TextView;

    .line 58
    iput-object p7, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->postalCode:Lcom/stripe/android/view/PostalCodeEditText;

    .line 59
    iput-object p8, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeCardFormViewBinding;
    .locals 11

    .line 84
    sget v0, Lcom/stripe/android/R$id;->card_multiline_widget:I

    .line 85
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/view/CardMultilineWidget;

    if-eqz v4, :cond_0

    .line 90
    sget v0, Lcom/stripe/android/R$id;->card_multiline_widget_container:I

    .line 91
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/google/android/material/card/MaterialCardView;

    if-eqz v5, :cond_0

    .line 96
    sget v0, Lcom/stripe/android/R$id;->country_layout:I

    .line 97
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/view/CountryTextInputLayout;

    if-eqz v6, :cond_0

    .line 102
    sget v0, Lcom/stripe/android/R$id;->country_postal_divider:I

    .line 103
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 108
    sget v0, Lcom/stripe/android/R$id;->errors:I

    .line 109
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    .line 114
    sget v0, Lcom/stripe/android/R$id;->postal_code:I

    .line 115
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/stripe/android/view/PostalCodeEditText;

    if-eqz v9, :cond_0

    .line 120
    sget v0, Lcom/stripe/android/R$id;->postal_code_container:I

    .line 121
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v10, :cond_0

    .line 126
    new-instance v2, Lcom/stripe/android/databinding/StripeCardFormViewBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/databinding/StripeCardFormViewBinding;-><init>(Landroid/view/View;Lcom/stripe/android/view/CardMultilineWidget;Lcom/google/android/material/card/MaterialCardView;Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/View;Landroid/widget/TextView;Lcom/stripe/android/view/PostalCodeEditText;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v2

    :cond_0
    move-object v3, p0

    .line 130
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 131
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeCardFormViewBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 74
    sget v0, Lcom/stripe/android/R$layout;->stripe_card_form_view:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 75
    invoke-static {p1}, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeCardFormViewBinding;

    move-result-object p0

    return-object p0

    .line 72
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
