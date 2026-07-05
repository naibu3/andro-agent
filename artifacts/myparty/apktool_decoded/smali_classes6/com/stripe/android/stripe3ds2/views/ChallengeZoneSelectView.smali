.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;
.super Landroid/widget/FrameLayout;
.source "ChallengeZoneSelectView.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/views/FormField;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChallengeZoneSelectView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChallengeZoneSelectView.kt\ncom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1557#2:201\n1628#2,3:202\n1557#2:205\n1628#2,3:206\n1611#2,9:209\n1863#2:218\n1864#2:220\n1620#2:221\n1863#2,2:222\n1863#2,2:224\n1#3:219\n*S KotlinDebug\n*F\n+ 1 ChallengeZoneSelectView.kt\ncom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView\n*L\n51#1:201\n51#1:202,3\n56#1:205\n56#1:206,3\n63#1:209,9\n63#1:218\n63#1:220\n63#1:221\n158#1:222,2\n189#1:224,2\n63#1:219\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$2\u0008\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\nH\u0000\u00a2\u0006\u0002\u0008.J \u0010/\u001a\u0002002\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001f2\u0008\u0010+\u001a\u0004\u0018\u00010,J\u001a\u00102\u001a\u0002002\u0008\u00103\u001a\u0004\u0018\u00010\u001b2\u0008\u00104\u001a\u0004\u0018\u000105J\u000e\u00106\u001a\u0002002\u0006\u00107\u001a\u00020\u0008J\u0008\u00108\u001a\u000209H\u0014J\u0010\u0010:\u001a\u0002002\u0006\u0010;\u001a\u000209H\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"R\u0017\u0010#\u001a\u0008\u0012\u0004\u0012\u00020$0\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\"R\u001a\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\"\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/stripe/android/stripe3ds2/views/FormField;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "isSingleSelectMode",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V",
        "()Z",
        "infoLabel",
        "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;",
        "getInfoLabel$3ds2sdk_release",
        "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;",
        "selectGroup",
        "Landroid/widget/LinearLayout;",
        "getSelectGroup$3ds2sdk_release",
        "()Landroid/widget/LinearLayout;",
        "buttonBottomMargin",
        "buttonLabelPadding",
        "buttonOffsetMargin",
        "buttonMinHeight",
        "userEntry",
        "",
        "getUserEntry",
        "()Ljava/lang/String;",
        "checkBoxes",
        "",
        "Landroid/widget/CheckBox;",
        "getCheckBoxes",
        "()Ljava/util/List;",
        "selectedOptions",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
        "getSelectedOptions",
        "selectedIndexes",
        "getSelectedIndexes$3ds2sdk_release",
        "buildButton",
        "Landroid/widget/CompoundButton;",
        "option",
        "buttonCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;",
        "lastButton",
        "buildButton$3ds2sdk_release",
        "setChallengeSelectOptions",
        "",
        "options",
        "setTextEntryLabel",
        "label",
        "labelCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;",
        "selectOption",
        "index",
        "onSaveInstanceState",
        "Landroid/os/Parcelable;",
        "onRestoreInstanceState",
        "state",
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
.field private static final Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;

.field private static final STATE_SELECTED_INDEXED:Ljava/lang/String; = "state_selected_indexes"

.field private static final STATE_SUPER:Ljava/lang/String; = "state_super"


# instance fields
.field private final buttonBottomMargin:I

.field private final buttonLabelPadding:I

.field private final buttonMinHeight:I

.field private final buttonOffsetMargin:I

.field private final infoLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

.field private final isSingleSelectMode:Z

.field private final selectGroup:Landroid/widget/LinearLayout;


# direct methods
.method public static synthetic $r8$lambda$o53JSU_xLHBwANHU4RO1eaLYS0s(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->_get_userEntry_$lambda$0(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    iput-boolean p4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->isSingleSelectMode:Z

    .line 76
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->getId()I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    .line 77
    sget p2, Lcom/stripe/android/stripe3ds2/R$id;->stripe_3ds2_default_challenge_zone_select_view_id:I

    invoke-virtual {p0, p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->setId(I)V

    .line 79
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 80
    sget p3, Lcom/stripe/android/stripe3ds2/R$dimen;->stripe_3ds2_challenge_zone_select_button_vertical_margin:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 79
    iput p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buttonBottomMargin:I

    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 82
    sget p3, Lcom/stripe/android/stripe3ds2/R$dimen;->stripe_3ds2_challenge_zone_select_button_label_padding:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 81
    iput p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buttonLabelPadding:I

    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 84
    sget p3, Lcom/stripe/android/stripe3ds2/R$dimen;->stripe_3ds2_challenge_zone_select_button_offset_margin:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 83
    iput p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buttonOffsetMargin:I

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 86
    sget p3, Lcom/stripe/android/stripe3ds2/R$dimen;->stripe_3ds2_challenge_zone_select_button_min_height:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 85
    iput p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buttonMinHeight:I

    .line 88
    const-string p2, "inflate(...)"

    const/4 p3, 0x1

    if-eqz p4, :cond_1

    .line 91
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 92
    move-object p4, p0

    check-cast p4, Landroid/view/ViewGroup;

    .line 90
    invoke-static {p1, p4, p3}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneSingleSelectViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneSingleSelectViewBinding;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iget-object p2, p1, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneSingleSelectViewBinding;->label:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->infoLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    .line 96
    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneSingleSelectViewBinding;->selectGroup:Landroid/widget/RadioGroup;

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    return-void

    .line 100
    :cond_1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 101
    move-object p4, p0

    check-cast p4, Landroid/view/ViewGroup;

    .line 99
    invoke-static {p1, p4, p3}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneMultiSelectViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneMultiSelectViewBinding;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    iget-object p2, p1, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneMultiSelectViewBinding;->label:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->infoLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    .line 105
    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneMultiSelectViewBinding;->selectGroup:Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 28
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V

    return-void
.end method

.method private static final _get_userEntry_$lambda$0(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;->getName()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method


# virtual methods
.method public final buildButton$3ds2sdk_release(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Z)Landroid/widget/CompoundButton;
    .locals 3

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->isSingleSelectMode:Z

    if-eqz v0, :cond_0

    .line 115
    new-instance v0, Lcom/google/android/material/radiobutton/MaterialRadioButton;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/material/radiobutton/MaterialRadioButton;-><init>(Landroid/content/Context;)V

    check-cast v0, Landroid/widget/CompoundButton;

    goto :goto_0

    .line 117
    :cond_0
    new-instance v0, Lcom/google/android/material/checkbox/MaterialCheckBox;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/material/checkbox/MaterialCheckBox;-><init>(Landroid/content/Context;)V

    check-cast v0, Landroid/widget/CompoundButton;

    :goto_0
    if-eqz p2, :cond_4

    .line 120
    invoke-interface {p2}, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;->getBackgroundColor()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 124
    :cond_1
    invoke-interface {p2}, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;->getBackgroundColor()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 121
    invoke-static {v0, v1}, Landroidx/core/widget/CompoundButtonCompat;->setButtonTintList(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    .line 127
    :cond_2
    :goto_1
    invoke-interface {p2}, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;->getTextColor()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_4

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    .line 128
    :cond_3
    invoke-interface {p2}, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;->getTextColor()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/widget/CompoundButton;->setTextColor(I)V

    .line 131
    :cond_4
    :goto_2
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/widget/CompoundButton;->setId(I)V

    .line 132
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setTag(Ljava/lang/Object;)V

    .line 133
    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;->getText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setText(Ljava/lang/CharSequence;)V

    .line 135
    iget p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buttonLabelPadding:I

    .line 136
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result p2

    .line 137
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->getPaddingRight()I

    move-result v1

    .line 138
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->getPaddingBottom()I

    move-result v2

    .line 134
    invoke-virtual {v0, p1, p2, v1, v2}, Landroid/widget/CompoundButton;->setPadding(IIII)V

    .line 140
    iget p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buttonMinHeight:I

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setMinimumHeight(I)V

    .line 141
    new-instance p1, Landroid/widget/RadioGroup$LayoutParams;

    const/4 p2, -0x1

    const/4 v1, -0x2

    invoke-direct {p1, p2, v1}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    if-nez p3, :cond_5

    .line 146
    iget p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buttonBottomMargin:I

    iput p2, p1, Landroid/widget/RadioGroup$LayoutParams;->bottomMargin:I

    .line 148
    :cond_5
    iget p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buttonOffsetMargin:I

    iput p2, p1, Landroid/widget/RadioGroup$LayoutParams;->leftMargin:I

    .line 149
    check-cast p1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final getCheckBoxes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/widget/CheckBox;",
            ">;"
        }
    .end annotation

    .line 47
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->isSingleSelectMode:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    .line 51
    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 201
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 202
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 51
    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.widget.CheckBox"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/CheckBox;

    .line 203
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 204
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public final getInfoLabel$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->infoLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    return-object v0
.end method

.method public final getSelectGroup$3ds2sdk_release()Landroid/widget/LinearLayout;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getSelectedIndexes$3ds2sdk_release()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 209
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 218
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 64
    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type android.widget.CompoundButton"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/CompoundButton;

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    .line 217
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 221
    :cond_2
    check-cast v1, Ljava/util/List;

    .line 71
    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    .line 72
    iget-boolean v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->isSingleSelectMode:Z

    if-eqz v2, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_2
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getSelectedOptions()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
            ">;"
        }
    .end annotation

    .line 56
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->getSelectedIndexes$3ds2sdk_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 205
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 206
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 207
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 57
    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;

    .line 207
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 208
    :cond_0
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public getUserEntry()Ljava/lang/String;
    .locals 10

    .line 43
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->getSelectedOptions()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const-string v0, ","

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v7, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$$ExternalSyntheticLambda0;

    invoke-direct {v7}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$$ExternalSyntheticLambda0;-><init>()V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isSingleSelectMode()Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->isSingleSelectMode:Z

    return v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 187
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "state_super"

    const-class v1, Landroid/os/Parcelable;

    invoke-static {p1, v0, v1}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 188
    const-string v0, "state_selected_indexes"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 189
    check-cast p1, Ljava/lang/Iterable;

    .line 224
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 189
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectOption(I)V

    goto :goto_0

    :cond_0
    return-void

    .line 191
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    const/4 v0, 0x2

    .line 180
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "state_super"

    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 181
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->getSelectedIndexes$3ds2sdk_release()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "state_selected_indexes"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 179
    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    return-object v0
.end method

.method public final selectOption(I)V
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.widget.CompoundButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/CompoundButton;

    const/4 v0, 0x1

    .line 175
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

.method public final setChallengeSelectOptions(Ljava/util/List;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;",
            ">;",
            "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 157
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    .line 158
    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 222
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    .line 159
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;

    const/4 v5, 0x1

    add-int/lit8 v6, v0, -0x1

    if-ne v3, v6, :cond_0

    goto :goto_1

    :cond_0
    move v5, v1

    .line 161
    :goto_1
    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->selectGroup:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v4, p2, v5}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->buildButton$3ds2sdk_release(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Z)Landroid/widget/CompoundButton;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final setTextEntryLabel(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V
    .locals 1

    .line 166
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->infoLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->setText(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    return-void

    .line 167
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;->infoLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->setVisibility(I)V

    return-void
.end method
