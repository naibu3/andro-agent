.class public final Lcom/stripe/android/paymentsheet/ui/PrimaryButton;
.super Landroid/widget/FrameLayout;
.source "PrimaryButton.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;,
        Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButton\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,335:1\n169#2:336\n169#2:337\n169#2:338\n169#2:339\n169#2:340\n172#3,2:341\n256#3,2:352\n256#3,2:354\n256#3,2:356\n256#3,2:358\n256#3,2:360\n52#4,9:343\n1863#5,2:362\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButton\n*L\n77#1:336\n80#1:337\n108#1:338\n109#1:339\n118#1:340\n145#1:341,2\n188#1:352,2\n189#1:354,2\n194#1:356,2\n234#1:358,2\n271#1:360,2\n154#1:343,9\n278#1:362,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\r\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001:\u0002TUB\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0008\u00107\u001a\u0004\u0018\u00010\u000bJ\u0010\u00108\u001a\u0002042\u0008\u0008\u0001\u00109\u001a\u00020\u0007J\u0010\u0010:\u001a\u0002042\u0008\u0008\u0001\u0010;\u001a\u00020\u0007J\u0010\u0010<\u001a\u0002042\u0008\u0008\u0001\u00109\u001a\u00020\u0007J\u0010\u0010=\u001a\u0002042\u0008\u0008\u0001\u0010;\u001a\u00020\u0007J\u0012\u0010>\u001a\u0002042\u0008\u00107\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010?\u001a\u0004\u0018\u00010@2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010A\u001a\u0002042\u0008\u0010B\u001a\u0004\u0018\u00010\u0017H\u0002J\u0008\u0010C\u001a\u000204H\u0002J\u0008\u0010D\u001a\u000204H\u0002J\u0016\u0010E\u001a\u0002042\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u0002040GH\u0002J\u0010\u0010H\u001a\u0002042\u0006\u0010I\u001a\u00020&H\u0016J\u0012\u0010J\u001a\u0002042\u0008\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010M\u001a\u0002042\u0008\u0010N\u001a\u0004\u0018\u00010OJ\u0010\u0010P\u001a\u0002042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010Q\u001a\u0002042\u0006\u0010R\u001a\u00020&H\u0002J\u0008\u0010S\u001a\u000204H\u0002R&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0019R&\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u001b\u0010\r\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001c\u0010 \u001a\u00020!8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\"\u0010\r\u001a\u0004\u0008#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006V"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "defaultTintList",
        "Landroid/content/res/ColorStateList;",
        "getDefaultTintList$paymentsheet_release$annotations",
        "()V",
        "getDefaultTintList$paymentsheet_release",
        "()Landroid/content/res/ColorStateList;",
        "setDefaultTintList$paymentsheet_release",
        "(Landroid/content/res/ColorStateList;)V",
        "state",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
        "animator",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;",
        "originalLabel",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "defaultLabelColor",
        "Ljava/lang/Integer;",
        "externalLabel",
        "getExternalLabel$paymentsheet_release$annotations",
        "getExternalLabel$paymentsheet_release",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "setExternalLabel$paymentsheet_release",
        "(Lcom/stripe/android/core/strings/ResolvableString;)V",
        "viewBinding",
        "Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;",
        "getViewBinding$paymentsheet_release$annotations",
        "getViewBinding$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;",
        "lockVisible",
        "",
        "getLockVisible$paymentsheet_release",
        "()Z",
        "setLockVisible$paymentsheet_release",
        "(Z)V",
        "confirmedIcon",
        "Landroid/widget/ImageView;",
        "cornerRadius",
        "",
        "borderStrokeWidth",
        "borderStrokeColor",
        "finishedBackgroundColor",
        "finishedOnBackgroundColor",
        "setAppearanceConfiguration",
        "",
        "primaryButtonStyle",
        "Lcom/stripe/android/uicore/PrimaryButtonStyle;",
        "tintList",
        "setDefaultLabelColor",
        "color",
        "setLockIconDrawable",
        "drawable",
        "setIndicatorColor",
        "setConfirmedIconDrawable",
        "setBackgroundTintList",
        "getTextAttributeValue",
        "",
        "setLabel",
        "text",
        "onReadyState",
        "onStartProcessing",
        "onFinishProcessing",
        "onAnimationEnd",
        "Lkotlin/Function0;",
        "setEnabled",
        "enabled",
        "onInitializeAccessibilityNodeInfo",
        "info",
        "Landroid/view/accessibility/AccessibilityNodeInfo;",
        "updateUiState",
        "uiState",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "updateState",
        "updateLockVisibility",
        "canShow",
        "updateAlpha",
        "State",
        "UIState",
        "paymentsheet_release"
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
.field private final animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

.field private borderStrokeColor:I

.field private borderStrokeWidth:F

.field private final confirmedIcon:Landroid/widget/ImageView;

.field private cornerRadius:F

.field private defaultLabelColor:Ljava/lang/Integer;

.field private defaultTintList:Landroid/content/res/ColorStateList;

.field private externalLabel:Lcom/stripe/android/core/strings/ResolvableString;

.field private finishedBackgroundColor:I

.field private finishedOnBackgroundColor:I

.field private lockVisible:Z

.field private originalLabel:Lcom/stripe/android/core/strings/ResolvableString;

.field private state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

.field private final viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;


# direct methods
.method public static synthetic $r8$lambda$8t5os7w7089R9kE-amiaJEufFMg(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateUiState$lambda$6(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$w6-GFFRjtFsAcbvn2f0muS6iLkg(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->onFinishProcessing$lambda$5(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    new-instance p3, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    invoke-direct {p3, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    .line 68
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    .line 69
    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    .line 67
    invoke-static {p3, v0}, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    move-result-object p3

    const-string v0, "inflate(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    .line 74
    iget-object v1, p3, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->confirmedIcon:Landroid/widget/ImageView;

    const-string v2, "confirmedIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->confirmedIcon:Landroid/widget/ImageView;

    .line 77
    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getCornerRadius()F

    move-result v1

    .line 336
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 76
    invoke-static {p1, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result v1

    iput v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->cornerRadius:F

    .line 80
    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getBorderStrokeWidth()F

    move-result v1

    .line 337
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 79
    invoke-static {p1, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result v1

    iput v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeWidth:F

    .line 83
    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeColor:I

    .line 86
    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->getSuccessBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v1

    iput v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedBackgroundColor:I

    .line 89
    sget-object v1, Lcom/stripe/android/uicore/StripeThemeDefaults;->INSTANCE:Lcom/stripe/android/uicore/StripeThemeDefaults;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeThemeDefaults;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->getOnSuccessBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedOnBackgroundColor:I

    .line 93
    iget-object p1, p3, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    .line 94
    sget-object p3, Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;->INSTANCE:Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;

    check-cast p3, Landroidx/compose/ui/platform/ViewCompositionStrategy;

    .line 93
    invoke-virtual {p1, p3}, Landroidx/compose/ui/platform/ComposeView;->setViewCompositionStrategy(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V

    .line 96
    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getTextAttributeValue(Landroid/util/AttributeSet;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Lcom/stripe/android/core/strings/ResolvableString;)V

    .line 100
    :cond_0
    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setClickable(Z)V

    const/4 p1, 0x0

    .line 101
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setEnabled(Z)V

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

    .line 47
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getDefaultLabelColor$p(Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)Ljava/lang/Integer;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultLabelColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public static synthetic getDefaultTintList$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getExternalLabel$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getTextAttributeValue(Landroid/util/AttributeSet;)Ljava/lang/CharSequence;
    .locals 3

    .line 154
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x101014f

    .line 156
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v1

    const/4 v2, 0x0

    .line 350
    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 158
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 350
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method public static synthetic getViewBinding$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final onFinishProcessing(Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 204
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateLockVisibility(Z)V

    .line 205
    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setClickable(Z)V

    .line 207
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    .line 208
    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_successful_transaction_description:I

    invoke-static {v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    .line 206
    invoke-static {v0, v1}, Landroidx/core/view/ViewCompat;->setStateDescription(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 210
    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedBackgroundColor:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 211
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->confirmedIcon:Landroid/widget/ImageView;

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedOnBackgroundColor:I

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 213
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    const-string v2, "label"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;->fadeOut$paymentsheet_release(Landroid/view/View;)V

    .line 214
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v2, "confirmingIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;->fadeOut$paymentsheet_release(Landroid/view/View;)V

    .line 216
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->animator:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->confirmedIcon:Landroid/widget/ImageView;

    check-cast v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getWidth()I

    move-result v2

    new-instance v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$$ExternalSyntheticLambda1;

    invoke-direct {v3, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;->fadeIn$paymentsheet_release(Landroid/view/View;ILkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final onFinishProcessing$lambda$5(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 217
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 218
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final onReadyState()V
    .locals 4

    const/4 v0, 0x1

    .line 179
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateLockVisibility(Z)V

    .line 180
    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setClickable(Z)V

    .line 181
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->originalLabel:Lcom/stripe/android/core/strings/ResolvableString;

    if-eqz v0, :cond_0

    .line 182
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Landroidx/core/view/ViewCompat;->setStateDescription(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 183
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Lcom/stripe/android/core/strings/ResolvableString;)V

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultTintList:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    .line 186
    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    const-string v1, "lockIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    const/16 v2, 0x8

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    move v1, v2

    .line 352
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v1, "confirmingIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    .line 354
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final onStartProcessing()V
    .locals 4

    const/4 v0, 0x0

    .line 193
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateLockVisibility(Z)V

    .line 194
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v2, "confirmingIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/View;

    .line 356
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 195
    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setClickable(Z)V

    .line 197
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_primary_button_processing:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 199
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Landroidx/core/view/ViewCompat;->setStateDescription(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 200
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method private final setLabel(Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 3

    .line 164
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->externalLabel:Lcom/stripe/android/core/strings/ResolvableString;

    if-eqz p1, :cond_1

    .line 166
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    instance-of v0, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    if-nez v0, :cond_0

    .line 167
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->originalLabel:Lcom/stripe/android/core/strings/ResolvableString;

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;

    invoke-direct {v1, p1, p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$setLabel$1$1;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)V

    const p1, -0x2cf1f55

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    :cond_1
    return-void
.end method

.method private final updateAlpha()V
    .locals 3

    const/4 v0, 0x2

    .line 276
    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 277
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 275
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 362
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 279
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    if-eqz v2, :cond_0

    instance-of v2, v2, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_1

    const/high16 v2, 0x3f000000    # 0.5f

    goto :goto_1

    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final updateLockVisibility(Z)V
    .locals 3

    .line 271
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    const-string v1, "lockIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    .line 360
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final updateUiState$lambda$6(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Landroid/view/View;)V
    .locals 0

    .line 248
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getOnClick()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getDefaultTintList$paymentsheet_release()Landroid/content/res/ColorStateList;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultTintList:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getExternalLabel$paymentsheet_release()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->externalLabel:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getLockVisible$paymentsheet_release()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    return v0
.end method

.method public final getViewBinding$paymentsheet_release()Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    return-object v0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 227
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    if-eqz p1, :cond_0

    .line 229
    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 230
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->isEnabled()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    :cond_1
    return-void
.end method

.method public final setAppearanceConfiguration(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/res/ColorStateList;)V
    .locals 3

    const-string v0, "primaryButtonStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getCornerRadius()F

    move-result v2

    .line 338
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 108
    invoke-static {v0, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result v0

    iput v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->cornerRadius:F

    .line 109
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getBorderStrokeWidth()F

    move-result v2

    .line 339
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 109
    invoke-static {v0, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result v0

    iput v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeWidth:F

    .line 110
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeColor:I

    .line 111
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    .line 112
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getOnBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v2

    .line 111
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 114
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultTintList:Landroid/content/res/ColorStateList;

    .line 115
    invoke-virtual {p0, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 116
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt;->getSuccessBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result p2

    iput p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedBackgroundColor:I

    .line 117
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt;->getOnSuccessBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result p2

    iput p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->finishedOnBackgroundColor:I

    .line 118
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getHeight()F

    move-result p1

    .line 340
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    .line 118
    invoke-static {v0, p1}, Lcom/stripe/android/uicore/StripeThemeKt;->convertDpToPx-3ABfNKs(Landroid/content/Context;F)F

    move-result p1

    float-to-int p1, p1

    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_0
    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 138
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    .line 139
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 140
    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->cornerRadius:F

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 141
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 142
    iget p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeWidth:F

    float-to-int p1, p1

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->borderStrokeColor:I

    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 144
    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 145
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    .line 146
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 147
    sget v1, Lcom/stripe/android/paymentsheet/R$dimen;->stripe_paymentsheet_primary_button_padding:I

    .line 146
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 341
    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public final setConfirmedIconDrawable(I)V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->confirmedIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final setDefaultLabelColor(I)V
    .locals 0

    .line 122
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultLabelColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setDefaultTintList$paymentsheet_release(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->defaultTintList:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 222
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 223
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateAlpha()V

    return-void
.end method

.method public final setExternalLabel$paymentsheet_release(Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->externalLabel:Lcom/stripe/android/core/strings/ResolvableString;

    return-void
.end method

.method public final setIndicatorColor(I)V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/progressindicator/CircularProgressIndicator;->setIndicatorColor([I)V

    return-void
.end method

.method public final setLockIconDrawable(I)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripePrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final setLockVisible$paymentsheet_release(Z)V
    .locals 0

    .line 72
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    return-void
.end method

.method public final updateState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V
    .locals 1

    .line 253
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    .line 254
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateAlpha()V

    .line 257
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    if-eqz v0, :cond_0

    .line 258
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->onReadyState()V

    return-void

    .line 260
    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 261
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->onStartProcessing()V

    return-void

    .line 263
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    if-eqz v0, :cond_2

    .line 264
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;->getOnComplete()Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->onFinishProcessing(Lkotlin/jvm/functions/Function0;)V

    return-void

    :cond_2
    if-nez p1, :cond_3

    return-void

    .line 256
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final updateUiState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)V
    .locals 5

    .line 234
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    .line 358
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    if-eqz p1, :cond_3

    .line 237
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getLockVisible()Z

    move-result v2

    iput-boolean v2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->lockVisible:Z

    .line 239
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->state:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    instance-of v3, v2, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    if-nez v3, :cond_2

    instance-of v2, v2, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    if-nez v2, :cond_2

    .line 241
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setLabel(Lcom/stripe/android/core/strings/ResolvableString;)V

    .line 242
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lcom/stripe/android/core/strings/ResolvableString;->resolve(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v0, v2}, Landroidx/core/view/ViewCompat;->setStateDescription(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 243
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateLockVisibility(Z)V

    .line 246
    :cond_2
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setEnabled(Z)V

    .line 248
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    return-void
.end method
