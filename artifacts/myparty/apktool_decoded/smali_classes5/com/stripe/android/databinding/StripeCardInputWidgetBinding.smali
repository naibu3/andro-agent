.class public final Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;
.super Ljava/lang/Object;
.source "StripeCardInputWidgetBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final cardBrandView:Lcom/stripe/android/view/CardBrandView;

.field public final cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

.field public final cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final container:Landroid/widget/FrameLayout;

.field public final cvcEditText:Lcom/stripe/android/view/CvcEditText;

.field public final cvcTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

.field public final expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

.field public final postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/stripe/android/view/CardBrandView;Lcom/stripe/android/view/CardNumberEditText;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/FrameLayout;Lcom/stripe/android/view/CvcEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/ExpiryDateEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/PostalCodeEditText;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->rootView:Landroid/view/View;

    .line 65
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    .line 66
    iput-object p3, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    .line 67
    iput-object p4, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 68
    iput-object p5, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->container:Landroid/widget/FrameLayout;

    .line 69
    iput-object p6, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    .line 70
    iput-object p7, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->cvcTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 71
    iput-object p8, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 72
    iput-object p9, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 73
    iput-object p10, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    .line 74
    iput-object p11, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;
    .locals 14

    .line 99
    sget v0, Lcom/stripe/android/R$id;->card_brand_view:I

    .line 100
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/view/CardBrandView;

    if-eqz v4, :cond_0

    .line 105
    sget v0, Lcom/stripe/android/R$id;->card_number_edit_text:I

    .line 106
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/stripe/android/view/CardNumberEditText;

    if-eqz v5, :cond_0

    .line 111
    sget v0, Lcom/stripe/android/R$id;->card_number_text_input_layout:I

    .line 112
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v6, :cond_0

    .line 117
    sget v0, Lcom/stripe/android/R$id;->container:I

    .line 118
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/FrameLayout;

    if-eqz v7, :cond_0

    .line 123
    sget v0, Lcom/stripe/android/R$id;->cvc_edit_text:I

    .line 124
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/stripe/android/view/CvcEditText;

    if-eqz v8, :cond_0

    .line 129
    sget v0, Lcom/stripe/android/R$id;->cvc_text_input_layout:I

    .line 130
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v9, :cond_0

    .line 135
    sget v0, Lcom/stripe/android/R$id;->expiry_date_edit_text:I

    .line 136
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/view/ExpiryDateEditText;

    if-eqz v10, :cond_0

    .line 141
    sget v0, Lcom/stripe/android/R$id;->expiry_date_text_input_layout:I

    .line 142
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v11, :cond_0

    .line 147
    sget v0, Lcom/stripe/android/R$id;->postal_code_edit_text:I

    .line 148
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/stripe/android/view/PostalCodeEditText;

    if-eqz v12, :cond_0

    .line 153
    sget v0, Lcom/stripe/android/R$id;->postal_code_text_input_layout:I

    .line 154
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v13, :cond_0

    .line 159
    new-instance v2, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v13}, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;-><init>(Landroid/view/View;Lcom/stripe/android/view/CardBrandView;Lcom/stripe/android/view/CardNumberEditText;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/FrameLayout;Lcom/stripe/android/view/CvcEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/ExpiryDateEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/PostalCodeEditText;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v2

    :cond_0
    move-object v3, p0

    .line 163
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 164
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 89
    sget v0, Lcom/stripe/android/R$layout;->stripe_card_input_widget:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 90
    invoke-static {p1}, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;

    move-result-object p0

    return-object p0

    .line 87
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
