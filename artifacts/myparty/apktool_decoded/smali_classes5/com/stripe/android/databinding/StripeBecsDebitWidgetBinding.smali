.class public final Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;
.super Ljava/lang/Object;
.source "StripeBecsDebitWidgetBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

.field public final accountNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

.field public final bsbTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final emailEditText:Lcom/stripe/android/view/EmailEditText;

.field public final emailTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final mandateAcceptanceTextView:Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

.field public final nameEditText:Lcom/stripe/android/view/StripeEditText;

.field public final nameTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/stripe/android/view/BecsDebitAccountNumberEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/BecsDebitBsbEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/EmailEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;Lcom/stripe/android/view/StripeEditText;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->rootView:Landroid/view/View;

    .line 60
    iput-object p2, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberEditText:Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    .line 61
    iput-object p3, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->accountNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 62
    iput-object p4, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbEditText:Lcom/stripe/android/view/BecsDebitBsbEditText;

    .line 63
    iput-object p5, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bsbTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 64
    iput-object p6, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailEditText:Lcom/stripe/android/view/EmailEditText;

    .line 65
    iput-object p7, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->emailTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    .line 66
    iput-object p8, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->mandateAcceptanceTextView:Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    .line 67
    iput-object p9, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameEditText:Lcom/stripe/android/view/StripeEditText;

    .line 68
    iput-object p10, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->nameTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;
    .locals 13

    .line 93
    sget v0, Lcom/stripe/android/R$id;->account_number_edit_text:I

    .line 94
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/view/BecsDebitAccountNumberEditText;

    if-eqz v4, :cond_0

    .line 99
    sget v0, Lcom/stripe/android/R$id;->account_number_text_input_layout:I

    .line 100
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v5, :cond_0

    .line 105
    sget v0, Lcom/stripe/android/R$id;->bsb_edit_text:I

    .line 106
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/view/BecsDebitBsbEditText;

    if-eqz v6, :cond_0

    .line 111
    sget v0, Lcom/stripe/android/R$id;->bsb_text_input_layout:I

    .line 112
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v7, :cond_0

    .line 117
    sget v0, Lcom/stripe/android/R$id;->email_edit_text:I

    .line 118
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/stripe/android/view/EmailEditText;

    if-eqz v8, :cond_0

    .line 123
    sget v0, Lcom/stripe/android/R$id;->email_text_input_layout:I

    .line 124
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v9, :cond_0

    .line 129
    sget v0, Lcom/stripe/android/R$id;->mandate_acceptance_text_view:I

    .line 130
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    if-eqz v10, :cond_0

    .line 135
    sget v0, Lcom/stripe/android/R$id;->name_edit_text:I

    .line 136
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/stripe/android/view/StripeEditText;

    if-eqz v11, :cond_0

    .line 141
    sget v0, Lcom/stripe/android/R$id;->name_text_input_layout:I

    .line 142
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v12, :cond_0

    .line 147
    new-instance v2, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;-><init>(Landroid/view/View;Lcom/stripe/android/view/BecsDebitAccountNumberEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/BecsDebitBsbEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/EmailEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;Lcom/stripe/android/view/StripeEditText;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v2

    :cond_0
    move-object v3, p0

    .line 151
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 152
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;
    .locals 1

    if-eqz p1, :cond_0

    .line 83
    sget v0, Lcom/stripe/android/R$layout;->stripe_becs_debit_widget:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 84
    invoke-static {p1}, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;

    move-result-object p0

    return-object p0

    .line 81
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
