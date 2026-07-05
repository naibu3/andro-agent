.class public final Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;
.super Ljava/lang/Object;
.source "StripeInformationZoneViewBinding.java"

# interfaces
.implements Landroidx/viewbinding/ViewBinding;


# instance fields
.field public final expandArrow:Landroidx/appcompat/widget/AppCompatImageView;

.field public final expandContainer:Landroid/widget/LinearLayout;

.field public final expandLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

.field public final expandText:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

.field private final rootView:Landroid/widget/LinearLayout;

.field public final whyArrow:Landroidx/appcompat/widget/AppCompatImageView;

.field public final whyContainer:Landroid/widget/LinearLayout;

.field public final whyLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

.field public final whyText:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;


# direct methods
.method private constructor <init>(Landroid/widget/LinearLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->rootView:Landroid/widget/LinearLayout;

    .line 53
    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->expandArrow:Landroidx/appcompat/widget/AppCompatImageView;

    .line 54
    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->expandContainer:Landroid/widget/LinearLayout;

    .line 55
    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->expandLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    .line 56
    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->expandText:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    .line 57
    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->whyArrow:Landroidx/appcompat/widget/AppCompatImageView;

    .line 58
    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->whyContainer:Landroid/widget/LinearLayout;

    .line 59
    iput-object p8, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->whyLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    .line 60
    iput-object p9, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->whyText:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;
    .locals 12

    .line 90
    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->expand_arrow:I

    .line 91
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v4, :cond_0

    .line 96
    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->expand_container:I

    .line 97
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_0

    .line 102
    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->expand_label:I

    .line 103
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    if-eqz v6, :cond_0

    .line 108
    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->expand_text:I

    .line 109
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    if-eqz v7, :cond_0

    .line 114
    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->why_arrow:I

    .line 115
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v8, :cond_0

    .line 120
    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->why_container:I

    .line 121
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/LinearLayout;

    if-eqz v9, :cond_0

    .line 126
    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->why_label:I

    .line 127
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    if-eqz v10, :cond_0

    .line 132
    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->why_text:I

    .line 133
    invoke-static {p0, v0}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    if-eqz v11, :cond_0

    .line 138
    new-instance v2, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;-><init>(Landroid/widget/LinearLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;)V

    return-object v2

    .line 141
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 142
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 71
    invoke-static {p0, v0, v1}, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;
    .locals 2

    .line 77
    sget v0, Lcom/stripe/android/stripe3ds2/R$layout;->stripe_information_zone_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 79
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 81
    :cond_0
    invoke-static {p0}, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/LinearLayout;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;->rootView:Landroid/widget/LinearLayout;

    return-object v0
.end method
