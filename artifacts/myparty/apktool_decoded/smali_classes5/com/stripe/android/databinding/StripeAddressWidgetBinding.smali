.class public final Lcom/stripe/android/databinding/StripeAddressWidgetBinding;
.super Ljava/lang/Object;
.source "StripeAddressWidgetBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final countryAutocompleteAaw:Lcom/stripe/android/view/CountryTextInputLayout;

.field public final etAddressLineOneAaw:Lcom/stripe/android/view/StripeEditText;

.field public final etAddressLineTwoAaw:Lcom/stripe/android/view/StripeEditText;

.field public final etCityAaw:Lcom/stripe/android/view/StripeEditText;

.field public final etNameAaw:Lcom/stripe/android/view/StripeEditText;

.field public final etPhoneNumberAaw:Lcom/stripe/android/view/StripeEditText;

.field public final etPostalCodeAaw:Lcom/stripe/android/view/StripeEditText;

.field public final etStateAaw:Lcom/stripe/android/view/StripeEditText;

.field private final rootView:Landroid/view/View;

.field public final tlAddressLine1Aaw:Lcom/google/android/material/textfield/TextInputLayout;

.field public final tlAddressLine2Aaw:Lcom/google/android/material/textfield/TextInputLayout;

.field public final tlCityAaw:Lcom/google/android/material/textfield/TextInputLayout;

.field public final tlNameAaw:Lcom/google/android/material/textfield/TextInputLayout;

.field public final tlPhoneNumberAaw:Lcom/google/android/material/textfield/TextInputLayout;

.field public final tlPostalCodeAaw:Lcom/google/android/material/textfield/TextInputLayout;

.field public final tlStateAaw:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/stripe/android/view/CountryTextInputLayout;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->rootView:Landroid/view/View;

    .line 77
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->countryAutocompleteAaw:Lcom/stripe/android/view/CountryTextInputLayout;

    .line 78
    iput-object p3, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->etAddressLineOneAaw:Lcom/stripe/android/view/StripeEditText;

    .line 79
    iput-object p4, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->etAddressLineTwoAaw:Lcom/stripe/android/view/StripeEditText;

    .line 80
    iput-object p5, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->etCityAaw:Lcom/stripe/android/view/StripeEditText;

    .line 81
    iput-object p6, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->etNameAaw:Lcom/stripe/android/view/StripeEditText;

    .line 82
    iput-object p7, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->etPhoneNumberAaw:Lcom/stripe/android/view/StripeEditText;

    .line 83
    iput-object p8, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->etPostalCodeAaw:Lcom/stripe/android/view/StripeEditText;

    .line 84
    iput-object p9, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->etStateAaw:Lcom/stripe/android/view/StripeEditText;

    .line 85
    iput-object p10, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->tlAddressLine1Aaw:Lcom/google/android/material/textfield/TextInputLayout;

    .line 86
    iput-object p11, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->tlAddressLine2Aaw:Lcom/google/android/material/textfield/TextInputLayout;

    .line 87
    iput-object p12, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->tlCityAaw:Lcom/google/android/material/textfield/TextInputLayout;

    .line 88
    iput-object p13, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->tlNameAaw:Lcom/google/android/material/textfield/TextInputLayout;

    .line 89
    iput-object p14, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->tlPhoneNumberAaw:Lcom/google/android/material/textfield/TextInputLayout;

    .line 90
    iput-object p15, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->tlPostalCodeAaw:Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 p1, p16

    .line 91
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->tlStateAaw:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeAddressWidgetBinding;
    .locals 17

    move-object/from16 v1, p0

    .line 116
    sget v0, Lcom/stripe/android/R$id;->country_autocomplete_aaw:I

    .line 117
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/CountryTextInputLayout;

    if-eqz v2, :cond_0

    .line 122
    sget v0, Lcom/stripe/android/R$id;->et_address_line_one_aaw:I

    .line 123
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    if-eqz v3, :cond_0

    .line 128
    sget v0, Lcom/stripe/android/R$id;->et_address_line_two_aaw:I

    .line 129
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/view/StripeEditText;

    if-eqz v4, :cond_0

    .line 134
    sget v0, Lcom/stripe/android/R$id;->et_city_aaw:I

    .line 135
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/view/StripeEditText;

    if-eqz v5, :cond_0

    .line 140
    sget v0, Lcom/stripe/android/R$id;->et_name_aaw:I

    .line 141
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/view/StripeEditText;

    if-eqz v6, :cond_0

    .line 146
    sget v0, Lcom/stripe/android/R$id;->et_phone_number_aaw:I

    .line 147
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/view/StripeEditText;

    if-eqz v7, :cond_0

    .line 152
    sget v0, Lcom/stripe/android/R$id;->et_postal_code_aaw:I

    .line 153
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/stripe/android/view/StripeEditText;

    if-eqz v8, :cond_0

    .line 158
    sget v0, Lcom/stripe/android/R$id;->et_state_aaw:I

    .line 159
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/view/StripeEditText;

    if-eqz v9, :cond_0

    .line 164
    sget v0, Lcom/stripe/android/R$id;->tl_address_line1_aaw:I

    .line 165
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v10, :cond_0

    .line 170
    sget v0, Lcom/stripe/android/R$id;->tl_address_line2_aaw:I

    .line 171
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v11, :cond_0

    .line 176
    sget v0, Lcom/stripe/android/R$id;->tl_city_aaw:I

    .line 177
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v12, :cond_0

    .line 182
    sget v0, Lcom/stripe/android/R$id;->tl_name_aaw:I

    .line 183
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v13, :cond_0

    .line 188
    sget v0, Lcom/stripe/android/R$id;->tl_phone_number_aaw:I

    .line 189
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v14, :cond_0

    .line 194
    sget v0, Lcom/stripe/android/R$id;->tl_postal_code_aaw:I

    .line 195
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v15, :cond_0

    .line 200
    sget v0, Lcom/stripe/android/R$id;->tl_state_aaw:I

    .line 201
    invoke-static {v1, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v16, :cond_0

    .line 206
    new-instance v0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;

    invoke-direct/range {v0 .. v16}, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;-><init>(Landroid/view/View;Lcom/stripe/android/view/CountryTextInputLayout;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/stripe/android/view/StripeEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v0

    .line 211
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 212
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeAddressWidgetBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 106
    sget v0, Lcom/stripe/android/R$layout;->stripe_address_widget:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 107
    invoke-static {p1}, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeAddressWidgetBinding;

    move-result-object p0

    return-object p0

    .line 104
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeAddressWidgetBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
