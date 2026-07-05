.class public final Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;
.super Ljava/lang/Object;
.source "HeaderZoneCustomizer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;",
        "",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "<init>",
        "(Landroidx/fragment/app/FragmentActivity;)V",
        "customize",
        "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;",
        "toolbarCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;",
        "cancelButtonCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;",
        "Companion",
        "3ds2sdk_release"
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
.field public static final Companion:Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;


# instance fields
.field private final activity:Landroidx/fragment/app/FragmentActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->Companion:Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    return-void
.end method

.method public static synthetic customize$default(Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 32
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->customize(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final customize(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;
    .locals 11

    .line 36
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    instance-of v1, v0, Landroidx/appcompat/app/AppCompatActivity;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_8

    .line 37
    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v1

    if-nez v1, :cond_1

    goto/16 :goto_5

    .line 38
    :cond_1
    new-instance v2, Landroidx/appcompat/view/ContextThemeWrapper;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    check-cast v3, Landroid/content/Context;

    sget v4, Lcom/stripe/android/stripe3ds2/R$style;->Stripe3DS2ActionBarButton:I

    invoke-direct {v2, v3, v4}, Landroidx/appcompat/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 39
    new-instance v5, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    move-object v6, v2

    check-cast v6, Landroid/content/Context;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    .line 40
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 41
    invoke-virtual {v5, p2}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    .line 43
    new-instance p2, Landroidx/appcompat/app/ActionBar$LayoutParams;

    const v2, 0x800015

    const/4 v3, -0x2

    invoke-direct {p2, v3, v3, v2}, Landroidx/appcompat/app/ActionBar$LayoutParams;-><init>(III)V

    .line 48
    move-object v2, v5

    check-cast v2, Landroid/view/View;

    invoke-virtual {v1, v2, p2}, Landroidx/appcompat/app/ActionBar;->setCustomView(Landroid/view/View;Landroidx/appcompat/app/ActionBar$LayoutParams;)V

    const/4 p2, 0x1

    .line 49
    invoke-virtual {v1, p2}, Landroidx/appcompat/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    if-eqz p1, :cond_7

    .line 52
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getButtonText()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p2, :cond_3

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    .line 53
    :cond_2
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getButtonText()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {v5, p2}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 55
    :cond_3
    :goto_1
    sget p2, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_hzv_cancel_label:I

    invoke-virtual {v5, p2}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;->setText(I)V

    .line 58
    :goto_2
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getBackgroundColor()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 59
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-direct {v2, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    check-cast v2, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 60
    sget-object p2, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->Companion:Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;

    invoke-virtual {p2, v0, p1}, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;->customizeStatusBar(Landroidx/appcompat/app/AppCompatActivity;Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V

    .line 63
    :cond_4
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getHeaderText()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p2, :cond_6

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_3

    .line 64
    :cond_5
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getHeaderText()Ljava/lang/String;

    move-result-object p2

    .line 63
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_4

    .line 66
    :cond_6
    :goto_3
    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    sget v0, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_hzv_header_label:I

    invoke-virtual {p2, v0}, Landroidx/fragment/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 65
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 69
    :goto_4
    sget-object v0, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->INSTANCE:Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;

    .line 70
    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    check-cast v2, Landroid/content/Context;

    .line 72
    check-cast p1, Lcom/stripe/android/stripe3ds2/init/ui/Customization;

    .line 69
    invoke-virtual {v0, v2, p2, p1}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->buildStyledText(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/Customization;)Landroid/text/SpannableString;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v1, p1}, Landroidx/appcompat/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    return-object v5

    .line 75
    :cond_7
    sget p1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_hzv_header_label:I

    invoke-virtual {v1, p1}, Landroidx/appcompat/app/ActionBar;->setTitle(I)V

    .line 76
    sget p1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_hzv_cancel_label:I

    invoke-virtual {v5, p1}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;->setText(I)V

    return-object v5

    :cond_8
    :goto_5
    return-object v2
.end method
