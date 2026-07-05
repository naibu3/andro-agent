.class public final Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;
.super Ljava/lang/Object;
.source "StripeChallengeZoneTextViewBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final label:Lcom/google/android/material/textfield/TextInputLayout;

.field private final rootView:Lcom/google/android/material/textfield/TextInputLayout;

.field public final textEntry:Lcom/google/android/material/textfield/TextInputEditText;


# direct methods
.method private constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->rootView:Lcom/google/android/material/textfield/TextInputLayout;

    .line 31
    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->label:Lcom/google/android/material/textfield/TextInputLayout;

    .line 32
    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->textEntry:Lcom/google/android/material/textfield/TextInputEditText;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;
    .locals 3

    .line 62
    move-object v0, p0

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 64
    sget v1, Lcom/stripe/android/stripe3ds2/R$id;->text_entry:I

    .line 65
    invoke-static {p0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v2, :cond_0

    .line 70
    new-instance p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;

    invoke-direct {p0, v0, v0, v2}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;)V

    return-object p0

    .line 72
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 73
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 43
    invoke-static {p0, v0, v1}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;
    .locals 2

    .line 49
    sget v0, Lcom/stripe/android/stripe3ds2/R$layout;->stripe_challenge_zone_text_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 51
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 53
    :cond_0
    invoke-static {p0}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->getRoot()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneTextViewBinding;->rootView:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method
