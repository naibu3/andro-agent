.class public final Lcom/stripe/android/view/MaskedCardView;
.super Landroid/widget/LinearLayout;
.source "MaskedCardView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/MaskedCardView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u0008\u0010%\u001a\u00020\u001cH\u0002J\u0008\u0010&\u001a\u00020\u001cH\u0002J\u0008\u0010\'\u001a\u00020\u001cH\u0002R\u001e\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000f8G@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/view/MaskedCardView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyle",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "value",
        "Lcom/stripe/android/model/CardBrand;",
        "cardBrand",
        "getCardBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "",
        "last4",
        "getLast4",
        "()Ljava/lang/String;",
        "viewBinding",
        "Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;",
        "getViewBinding$payments_core_release",
        "()Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;",
        "themeConfig",
        "Lcom/stripe/android/view/ThemeConfig;",
        "cardDisplayFactory",
        "Lcom/stripe/android/view/CardDisplayTextFactory;",
        "applyTint",
        "",
        "imageView",
        "Landroid/widget/ImageView;",
        "setSelected",
        "selected",
        "",
        "setPaymentMethod",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "updateUi",
        "updateBrandIcon",
        "updateCheckMark",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private cardBrand:Lcom/stripe/android/model/CardBrand;

.field private final cardDisplayFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

.field private last4:Ljava/lang/String;

.field private final themeConfig:Lcom/stripe/android/view/ThemeConfig;

.field private final viewBinding:Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/MaskedCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/MaskedCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    sget-object p2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    iput-object p2, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    .line 39
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 40
    move-object p3, p0

    check-cast p3, Landroid/view/ViewGroup;

    .line 38
    invoke-static {p2, p3}, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;

    move-result-object p2

    const-string p3, "inflate(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;

    .line 42
    new-instance p3, Lcom/stripe/android/view/ThemeConfig;

    invoke-direct {p3, p1}, Lcom/stripe/android/view/ThemeConfig;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/stripe/android/view/MaskedCardView;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    .line 43
    new-instance p1, Lcom/stripe/android/view/CardDisplayTextFactory;

    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "getResources(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, p3}, Lcom/stripe/android/view/CardDisplayTextFactory;-><init>(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V

    iput-object p1, p0, Lcom/stripe/android/view/MaskedCardView;->cardDisplayFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

    .line 46
    iget-object p1, p2, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->brandIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const-string p3, "brandIcon"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    invoke-direct {p0, p1}, Lcom/stripe/android/view/MaskedCardView;->applyTint(Landroid/widget/ImageView;)V

    .line 47
    iget-object p1, p2, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->checkIcon:Landroidx/appcompat/widget/AppCompatImageView;

    const-string p2, "checkIcon"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    invoke-direct {p0, p1}, Lcom/stripe/android/view/MaskedCardView;->applyTint(Landroid/widget/ImageView;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 25
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/MaskedCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final applyTint(Landroid/widget/ImageView;)V
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->themeConfig:Lcom/stripe/android/view/ThemeConfig;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/ThemeConfig;->getTintColor$payments_core_release(Z)I

    move-result v0

    .line 53
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 51
    invoke-static {p1, v0}, Landroidx/core/widget/ImageViewCompat;->setImageTintList(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method private final updateBrandIcon()V
    .locals 4

    .line 83
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->brandIcon:Landroidx/appcompat/widget/AppCompatImageView;

    .line 85
    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 86
    iget-object v2, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    sget-object v3, Lcom/stripe/android/view/MaskedCardView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v2

    aget v2, v3, v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 95
    :pswitch_0
    sget v2, Lcom/stripe/payments/model/R$drawable;->stripe_ic_unknown:I

    goto :goto_0

    .line 94
    :pswitch_1
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_cartebancaire_template_32:I

    goto :goto_0

    .line 93
    :pswitch_2
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_unionpay_template_32:I

    goto :goto_0

    .line 92
    :pswitch_3
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_mastercard_template_32:I

    goto :goto_0

    .line 91
    :pswitch_4
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_visa_template_32:I

    goto :goto_0

    .line 90
    :pswitch_5
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_diners_template_32:I

    goto :goto_0

    .line 89
    :pswitch_6
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_jcb_template_32:I

    goto :goto_0

    .line 88
    :pswitch_7
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_discover_template_32:I

    goto :goto_0

    .line 87
    :pswitch_8
    sget v2, Lcom/stripe/android/R$drawable;->stripe_ic_amex_template_32:I

    .line 84
    :goto_0
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final updateCheckMark()V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->checkIcon:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setVisibility(I)V

    return-void
.end method

.method private final updateUi()V
    .locals 5

    .line 78
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateBrandIcon()V

    .line 79
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;

    iget-object v0, v0, Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;->details:Landroidx/appcompat/widget/AppCompatTextView;

    iget-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->cardDisplayFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

    iget-object v2, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    iget-object v3, p0, Lcom/stripe/android/view/MaskedCardView;->last4:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/view/MaskedCardView;->isSelected()Z

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/stripe/android/view/CardDisplayTextFactory;->createStyled$payments_core_release(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Z)Landroid/text/SpannableString;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final getCardBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getViewBinding$payments_core_release()Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->viewBinding:Lcom/stripe/android/databinding/StripeMaskedCardViewBinding;

    return-object v0
.end method

.method public final setPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 3

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    .line 68
    sget-object v0, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object v2, p1, Lcom/stripe/android/model/PaymentMethod$Card;->displayBrand:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    .line 69
    sget-object v2, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    .line 70
    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_3

    sget-object v0, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    .line 68
    :cond_3
    iput-object v0, p0, Lcom/stripe/android/view/MaskedCardView;->cardBrand:Lcom/stripe/android/model/CardBrand;

    if-eqz p1, :cond_4

    .line 72
    iget-object v1, p1, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    :cond_4
    iput-object v1, p0, Lcom/stripe/android/view/MaskedCardView;->last4:Ljava/lang/String;

    .line 74
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateUi()V

    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    .line 60
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setSelected(Z)V

    .line 61
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateCheckMark()V

    .line 62
    invoke-direct {p0}, Lcom/stripe/android/view/MaskedCardView;->updateUi()V

    return-void
.end method
