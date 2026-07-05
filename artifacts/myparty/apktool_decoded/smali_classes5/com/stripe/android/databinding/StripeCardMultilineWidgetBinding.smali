.class public final Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;
.super Ljava/lang/Object;
.source "StripeCardMultilineWidgetBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final cardBrandView:Lcom/stripe/android/view/CardBrandView;

.field public final cardNumberInputContainer:Landroid/widget/FrameLayout;

.field public final etCardNumber:Lcom/stripe/android/view/CardNumberEditText;

.field public final etCvc:Lcom/stripe/android/view/CvcEditText;

.field public final etExpiry:Lcom/stripe/android/view/ExpiryDateEditText;

.field public final etPostalCode:Lcom/stripe/android/view/PostalCodeEditText;

.field private final rootView:Landroid/view/View;

.field public final secondRowLayout:Landroid/widget/LinearLayout;

.field public final tlCardNumber:Lcom/stripe/android/view/CardNumberTextInputLayout;

.field public final tlCvc:Lcom/google/android/material/textfield/TextInputLayout;

.field public final tlExpiry:Lcom/google/android/material/textfield/TextInputLayout;

.field public final tlPostalCode:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/stripe/android/view/CardBrandView;Landroid/widget/FrameLayout;Lcom/stripe/android/view/CardNumberEditText;Lcom/stripe/android/view/CvcEditText;Lcom/stripe/android/view/ExpiryDateEditText;Lcom/stripe/android/view/PostalCodeEditText;Landroid/widget/LinearLayout;Lcom/stripe/android/view/CardNumberTextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->rootView:Landroid/view/View;

    .line 69
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    .line 70
    iput-object p3, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->cardNumberInputContainer:Landroid/widget/FrameLayout;

    .line 71
    iput-object p4, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->etCardNumber:Lcom/stripe/android/view/CardNumberEditText;

    .line 72
    iput-object p5, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->etCvc:Lcom/stripe/android/view/CvcEditText;

    .line 73
    iput-object p6, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->etExpiry:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 74
    iput-object p7, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->etPostalCode:Lcom/stripe/android/view/PostalCodeEditText;

    .line 75
    iput-object p8, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->secondRowLayout:Landroid/widget/LinearLayout;

    .line 76
    iput-object p9, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->tlCardNumber:Lcom/stripe/android/view/CardNumberTextInputLayout;

    .line 77
    iput-object p10, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->tlCvc:Lcom/google/android/material/textfield/TextInputLayout;

    .line 78
    iput-object p11, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->tlExpiry:Lcom/google/android/material/textfield/TextInputLayout;

    .line 79
    iput-object p12, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->tlPostalCode:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;
    .locals 15

    .line 104
    sget v0, Lcom/stripe/android/R$id;->card_brand_view:I

    .line 105
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/view/CardBrandView;

    if-eqz v4, :cond_0

    .line 110
    sget v0, Lcom/stripe/android/R$id;->card_number_input_container:I

    .line 111
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/FrameLayout;

    if-eqz v5, :cond_0

    .line 116
    sget v0, Lcom/stripe/android/R$id;->et_card_number:I

    .line 117
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/view/CardNumberEditText;

    if-eqz v6, :cond_0

    .line 122
    sget v0, Lcom/stripe/android/R$id;->et_cvc:I

    .line 123
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/view/CvcEditText;

    if-eqz v7, :cond_0

    .line 128
    sget v0, Lcom/stripe/android/R$id;->et_expiry:I

    .line 129
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/stripe/android/view/ExpiryDateEditText;

    if-eqz v8, :cond_0

    .line 134
    sget v0, Lcom/stripe/android/R$id;->et_postal_code:I

    .line 135
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/stripe/android/view/PostalCodeEditText;

    if-eqz v9, :cond_0

    .line 140
    sget v0, Lcom/stripe/android/R$id;->second_row_layout:I

    .line 141
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/LinearLayout;

    if-eqz v10, :cond_0

    .line 146
    sget v0, Lcom/stripe/android/R$id;->tl_card_number:I

    .line 147
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/stripe/android/view/CardNumberTextInputLayout;

    if-eqz v11, :cond_0

    .line 152
    sget v0, Lcom/stripe/android/R$id;->tl_cvc:I

    .line 153
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v12, :cond_0

    .line 158
    sget v0, Lcom/stripe/android/R$id;->tl_expiry:I

    .line 159
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v13, :cond_0

    .line 164
    sget v0, Lcom/stripe/android/R$id;->tl_postal_code:I

    .line 165
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v14, :cond_0

    .line 170
    new-instance v2, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v14}, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;-><init>(Landroid/view/View;Lcom/stripe/android/view/CardBrandView;Landroid/widget/FrameLayout;Lcom/stripe/android/view/CardNumberEditText;Lcom/stripe/android/view/CvcEditText;Lcom/stripe/android/view/ExpiryDateEditText;Lcom/stripe/android/view/PostalCodeEditText;Landroid/widget/LinearLayout;Lcom/stripe/android/view/CardNumberTextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v2

    :cond_0
    move-object v3, p0

    .line 174
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 175
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 94
    sget v0, Lcom/stripe/android/R$layout;->stripe_card_multiline_widget:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 95
    invoke-static {p1}, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;

    move-result-object p0

    return-object p0

    .line 92
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
