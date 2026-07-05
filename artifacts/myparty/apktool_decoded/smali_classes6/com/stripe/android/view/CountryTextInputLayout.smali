.class public final Lcom/stripe/android/view/CountryTextInputLayout;
.super Lcom/google/android/material/textfield/TextInputLayout;
.source "CountryTextInputLayout.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CountryTextInputLayout$Companion;,
        Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCountryTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryTextInputLayout.kt\ncom/stripe/android/view/CountryTextInputLayout\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,300:1\n33#2,3:301\n52#3,9:304\n1#4:313\n37#5:314\n53#5:315\n*S KotlinDebug\n*F\n+ 1 CountryTextInputLayout.kt\ncom/stripe/android/view/CountryTextInputLayout\n*L\n61#1:301,3\n98#1:304,9\n169#1:314\n169#1:315\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 K2\u00020\u0001:\u0002KLB\'\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\n\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0007J\u0012\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0007J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202H\u0016J\n\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020\u001e2\u0008\u00106\u001a\u0004\u0018\u000104H\u0014J\u0015\u00107\u001a\u00020\u001e2\u0006\u00106\u001a\u000208H\u0001\u00a2\u0006\u0002\u00089J\u0008\u0010:\u001a\u00020\rH\u0002J\u0008\u0010;\u001a\u00020\u001eH\u0002J\u001b\u0010<\u001a\u00020\u001e2\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020?0>H\u0000\u00a2\u0006\u0002\u0008@J\u0015\u0010A\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\u0008BJ\u0015\u0010A\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020?H\u0001\u00a2\u0006\u0002\u0008BJ\u0010\u0010C\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0007J\u0015\u0010D\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0000\u00a2\u0006\u0002\u0008EJ\r\u0010F\u001a\u00020\u001eH\u0000\u00a2\u0006\u0002\u0008GJ\u0008\u0010H\u001a\u00020\u001eH\u0002J\u0008\u0010I\u001a\u00020JH\u0002R\u0012\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000c\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R5\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00138@@@X\u0081\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008\u001a\u0010\u001b\u0012\u0004\u0008\u0015\u0010\u000f\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00010!8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R0\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001e0%8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008&\u0010\u000f\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R*\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010(\"\u0004\u0008-\u0010*R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"
    }
    d2 = {
        "Lcom/stripe/android/view/CountryTextInputLayout;",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "countryAutoCompleteStyleRes",
        "itemLayoutRes",
        "countryAutocomplete",
        "Landroid/widget/AutoCompleteTextView;",
        "getCountryAutocomplete$annotations",
        "()V",
        "getCountryAutocomplete",
        "()Landroid/widget/AutoCompleteTextView;",
        "<set-?>",
        "Lcom/stripe/android/core/model/CountryCode;",
        "selectedCountryCode",
        "getSelectedCountryCode$payments_core_release$annotations",
        "getSelectedCountryCode$payments_core_release",
        "()Lcom/stripe/android/core/model/CountryCode;",
        "setSelectedCountryCode$payments_core_release",
        "(Lcom/stripe/android/core/model/CountryCode;)V",
        "selectedCountryCode$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "getSelectedCountryCode",
        "setSelectedCountryCode",
        "",
        "countryCode",
        "selectedCountry",
        "Lcom/stripe/android/core/model/Country;",
        "getSelectedCountry$payments_core_release",
        "()Lcom/stripe/android/core/model/Country;",
        "countryChangeCallback",
        "Lkotlin/Function1;",
        "getCountryChangeCallback$payments_core_release$annotations",
        "getCountryChangeCallback$payments_core_release",
        "()Lkotlin/jvm/functions/Function1;",
        "setCountryChangeCallback$payments_core_release",
        "(Lkotlin/jvm/functions/Function1;)V",
        "countryCodeChangeCallback",
        "getCountryCodeChangeCallback",
        "setCountryCodeChangeCallback",
        "countryAdapter",
        "Lcom/stripe/android/view/CountryAdapter;",
        "setEnabled",
        "enabled",
        "",
        "onSaveInstanceState",
        "Landroid/os/Parcelable;",
        "onRestoreInstanceState",
        "state",
        "restoreSelectedCountry",
        "Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;",
        "restoreSelectedCountry$payments_core_release",
        "initializeCountryAutoCompleteWithStyle",
        "updateInitialCountry",
        "setAllowedCountryCodes",
        "allowedCountryCodes",
        "",
        "",
        "setAllowedCountryCodes$payments_core_release",
        "setCountrySelected",
        "setCountrySelected$payments_core_release",
        "updateUiForCountryEntered",
        "updatedSelectedCountryCode",
        "updatedSelectedCountryCode$payments_core_release",
        "validateCountry",
        "validateCountry$payments_core_release",
        "clearError",
        "getLocale",
        "Ljava/util/Locale;",
        "Companion",
        "SelectedCountryState",
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
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field private static final Companion:Lcom/stripe/android/view/CountryTextInputLayout$Companion;

.field private static final DEFAULT_ITEM_LAYOUT:I

.field public static final INVALID_COUNTRY_AUTO_COMPLETE_STYLE:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private countryAdapter:Lcom/stripe/android/view/CountryAdapter;

.field private countryAutoCompleteStyleRes:I

.field private final countryAutocomplete:Landroid/widget/AutoCompleteTextView;

.field private synthetic countryChangeCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/core/model/Country;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic countryCodeChangeCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/core/model/CountryCode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private itemLayoutRes:I

.field private final selectedCountryCode$delegate:Lkotlin/properties/ReadWriteProperty;


# direct methods
.method public static synthetic $r8$lambda$3xcmi5jnpL0PA23RPSZVmvSp4ok(Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CountryTextInputLayout;->_init_$lambda$11(Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic $r8$lambda$4mRXAT5KzWnK6CJhUTpKOUGntdg(Lcom/stripe/android/view/CountryTextInputLayout;Ljava/lang/String;Lcom/stripe/android/core/model/Country;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CountryTextInputLayout;->_init_$lambda$12(Lcom/stripe/android/view/CountryTextInputLayout;Ljava/lang/String;Lcom/stripe/android/core/model/Country;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$9BuzCWMMihJG2nvvdx5xh3wD5ZA(Lcom/stripe/android/core/model/Country;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->countryChangeCallback$lambda$4(Lcom/stripe/android/core/model/Country;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SxnISbxaK1v4grr39ZcwZNspSQM(Landroid/content/Context;Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/ViewGroup;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CountryTextInputLayout;->_init_$lambda$7(Landroid/content/Context;Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/ViewGroup;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_CVpjZBwWzRC_d5dtTFPF8Y87wE(Lcom/stripe/android/view/CountryTextInputLayout;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/view/CountryTextInputLayout;->_init_$lambda$8(Lcom/stripe/android/view/CountryTextInputLayout;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic $r8$lambda$uQIIIcXDGDDQCeH-1nwhkkgnq_Y(Lcom/stripe/android/core/model/CountryCode;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->countryCodeChangeCallback$lambda$5(Lcom/stripe/android/core/model/CountryCode;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 61
    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "selectedCountryCode"

    const-string v3, "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;"

    const-class v4, Lcom/stripe/android/view/CountryTextInputLayout;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v1, Lkotlin/jvm/internal/MutablePropertyReference1;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    sput-object v0, Lcom/stripe/android/view/CountryTextInputLayout;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/stripe/android/view/CountryTextInputLayout$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CountryTextInputLayout$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/CountryTextInputLayout;->Companion:Lcom/stripe/android/view/CountryTextInputLayout$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/CountryTextInputLayout;->$stable:I

    .line 291
    sget v0, Lcom/stripe/android/R$layout;->stripe_country_text_view:I

    sput v0, Lcom/stripe/android/view/CountryTextInputLayout;->DEFAULT_ITEM_LAYOUT:I

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CountryTextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CountryTextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/textfield/TextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    sget p3, Lcom/stripe/android/view/CountryTextInputLayout;->DEFAULT_ITEM_LAYOUT:I

    iput p3, p0, Lcom/stripe/android/view/CountryTextInputLayout;->itemLayoutRes:I

    .line 61
    sget-object v0, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 301
    new-instance v0, Lcom/stripe/android/view/CountryTextInputLayout$special$$inlined$observable$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/stripe/android/view/CountryTextInputLayout$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CountryTextInputLayout;)V

    check-cast v0, Lkotlin/properties/ReadWriteProperty;

    .line 61
    iput-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->selectedCountryCode$delegate:Lkotlin/properties/ReadWriteProperty;

    .line 88
    new-instance v0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda0;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryChangeCallback:Lkotlin/jvm/functions/Function1;

    .line 93
    new-instance v0, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda1;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryCodeChangeCallback:Lkotlin/jvm/functions/Function1;

    .line 100
    sget-object v0, Lcom/stripe/android/R$styleable;->StripeCountryAutoCompleteTextInputLayout:[I

    const-string v1, "StripeCountryAutoCompleteTextInputLayout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 311
    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 103
    sget v0, Lcom/stripe/android/R$styleable;->StripeCountryAutoCompleteTextInputLayout_countryAutoCompleteStyle:I

    .line 102
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutoCompleteStyleRes:I

    .line 108
    sget v0, Lcom/stripe/android/R$styleable;->StripeCountryAutoCompleteTextInputLayout_countryItemLayout:I

    .line 107
    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    iput p3, p0, Lcom/stripe/android/view/CountryTextInputLayout;->itemLayoutRes:I

    .line 311
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 113
    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->initializeCountryAutoCompleteWithStyle()Landroid/widget/AutoCompleteTextView;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutocomplete:Landroid/widget/AutoCompleteTextView;

    .line 115
    move-object p3, p2

    check-cast p3, Landroid/view/View;

    .line 116
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    check-cast v0, Landroid/view/ViewGroup$LayoutParams;

    .line 114
    invoke-virtual {p0, p3, v0}, Lcom/stripe/android/view/CountryTextInputLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 119
    new-instance p3, Lcom/stripe/android/view/CountryAdapter;

    .line 121
    sget-object v0, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getLocale()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/stripe/android/core/model/CountryUtils;->getOrderedCountries(Ljava/util/Locale;)Ljava/util/List;

    move-result-object v0

    .line 122
    iget v2, p0, Lcom/stripe/android/view/CountryTextInputLayout;->itemLayoutRes:I

    .line 119
    new-instance v3, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda2;

    invoke-direct {v3, p1, p0}, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda2;-><init>(Landroid/content/Context;Lcom/stripe/android/view/CountryTextInputLayout;)V

    invoke-direct {p3, p1, v0, v2, v3}, Lcom/stripe/android/view/CountryAdapter;-><init>(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    iput-object p3, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAdapter:Lcom/stripe/android/view/CountryAdapter;

    .line 128
    invoke-virtual {p2, v1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    .line 129
    iget-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAdapter:Lcom/stripe/android/view/CountryAdapter;

    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 130
    new-instance p1, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda3;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/view/CountryTextInputLayout;)V

    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 134
    new-instance p1, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda4;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/view/CountryTextInputLayout;)V

    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 148
    iget-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAdapter:Lcom/stripe/android/view/CountryAdapter;

    invoke-virtual {p1}, Lcom/stripe/android/view/CountryAdapter;->getFirstItem$payments_core_release()Lcom/stripe/android/core/model/Country;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->setSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    .line 149
    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->updateInitialCountry()V

    .line 151
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, Lcom/stripe/android/R$string;->stripe_address_country_invalid:I

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p3, "getString(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    new-instance p3, Lcom/stripe/android/view/CountryAutoCompleteTextViewValidator;

    .line 154
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAdapter:Lcom/stripe/android/view/CountryAdapter;

    .line 153
    new-instance v1, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/view/CountryTextInputLayout;Ljava/lang/String;)V

    invoke-direct {p3, v0, v1}, Lcom/stripe/android/view/CountryAutoCompleteTextViewValidator;-><init>(Lcom/stripe/android/view/CountryAdapter;Lkotlin/jvm/functions/Function1;)V

    check-cast p3, Landroid/widget/AutoCompleteTextView$Validator;

    invoke-virtual {p2, p3}, Landroid/widget/AutoCompleteTextView;->setValidator(Landroid/widget/AutoCompleteTextView$Validator;)V

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

    .line 43
    sget p3, Lcom/google/android/material/R$attr;->textInputStyle:I

    .line 40
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CountryTextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final _init_$lambda$11(Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/View;Z)V
    .locals 2

    if-eqz p2, :cond_0

    .line 136
    iget-object p0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutocomplete:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void

    .line 138
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutocomplete:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 139
    sget-object p2, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/stripe/android/core/model/CountryUtils;->getCountryCodeByName(Ljava/lang/String;Ljava/util/Locale;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 140
    invoke-virtual {p0, p2}, Lcom/stripe/android/view/CountryTextInputLayout;->updateUiForCountryEntered(Lcom/stripe/android/core/model/CountryCode;)V

    return-void

    .line 141
    :cond_1
    sget-object p2, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->create(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/stripe/android/core/model/CountryUtils;->getCountryByCode(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 143
    sget-object p2, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->create(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->updateUiForCountryEntered(Lcom/stripe/android/core/model/CountryCode;)V

    :cond_2
    return-void
.end method

.method private static final _init_$lambda$12(Lcom/stripe/android/view/CountryTextInputLayout;Ljava/lang/String;Lcom/stripe/android/core/model/Country;)Lkotlin/Unit;
    .locals 1

    if-eqz p2, :cond_0

    .line 156
    invoke-virtual {p2}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CountryTextInputLayout;->setSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    if-eqz p2, :cond_1

    .line 159
    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->clearError()V

    goto :goto_1

    .line 161
    :cond_1
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 162
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->setErrorEnabled(Z)V

    .line 164
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final _init_$lambda$7(Landroid/content/Context;Lcom/stripe/android/view/CountryTextInputLayout;Landroid/view/ViewGroup;)Landroid/widget/TextView;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    iget p1, p1, Lcom/stripe/android/view/CountryTextInputLayout;->itemLayoutRes:I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final _init_$lambda$8(Lcom/stripe/android/view/CountryTextInputLayout;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 132
    iget-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAdapter:Lcom/stripe/android/view/CountryAdapter;

    invoke-virtual {p1, p3}, Lcom/stripe/android/view/CountryAdapter;->getItem(I)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->updatedSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    return-void
.end method

.method public static final synthetic access$getDEFAULT_ITEM_LAYOUT$cp()I
    .locals 1

    .line 39
    sget v0, Lcom/stripe/android/view/CountryTextInputLayout;->DEFAULT_ITEM_LAYOUT:I

    return v0
.end method

.method public static final synthetic access$getLocale(Lcom/stripe/android/view/CountryTextInputLayout;)Ljava/util/Locale;
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getLocale()Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method private final clearError()V
    .locals 1

    const/4 v0, 0x0

    .line 281
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CountryTextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 282
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CountryTextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method private static final countryChangeCallback$lambda$4(Lcom/stripe/android/core/model/Country;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final countryCodeChangeCallback$lambda$5(Lcom/stripe/android/core/model/CountryCode;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic getCountryAutocomplete$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCountryChangeCallback$payments_core_release$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Will be removed in a future version"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "countryCodeChangeCallback"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method

.method private final getLocale()Ljava/util/Locale;
    .locals 2

    .line 286
    invoke-static {}, Landroidx/core/os/LocaleListCompat;->getAdjustedDefault()Landroidx/core/os/LocaleListCompat;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/os/LocaleListCompat;->get(I)Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static synthetic getSelectedCountryCode$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final initializeCountryAutoCompleteWithStyle()Landroid/widget/AutoCompleteTextView;
    .locals 5

    .line 210
    iget v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutoCompleteStyleRes:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 211
    new-instance v0, Landroid/widget/AutoCompleteTextView;

    .line 212
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 214
    sget v3, Landroidx/appcompat/R$attr;->autoCompleteTextViewStyle:I

    .line 211
    invoke-direct {v0, v2, v1, v3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-object v0

    .line 216
    :cond_0
    new-instance v0, Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    iget v4, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutoCompleteStyleRes:I

    invoke-direct {v0, v2, v1, v3, v4}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-object v0
.end method

.method private final updateInitialCountry()V
    .locals 3

    .line 220
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAdapter:Lcom/stripe/android/view/CountryAdapter;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryAdapter;->getFirstItem$payments_core_release()Lcom/stripe/android/core/model/Country;

    move-result-object v0

    .line 221
    iget-object v1, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutocomplete:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    invoke-virtual {v0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CountryTextInputLayout;->setSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    return-void
.end method


# virtual methods
.method public final getCountryAutocomplete()Landroid/widget/AutoCompleteTextView;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutocomplete:Landroid/widget/AutoCompleteTextView;

    return-object v0
.end method

.method public final getCountryChangeCallback$payments_core_release()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/core/model/Country;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryChangeCallback:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getCountryCodeChangeCallback()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/core/model/CountryCode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryCodeChangeCallback:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getSelectedCountry$payments_core_release()Lcom/stripe/android/core/model/Country;
    .locals 3

    .line 81
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getLocale()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/stripe/android/core/model/CountryUtils;->getCountryByCode(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSelectedCountryCode()Lcom/stripe/android/core/model/CountryCode;
    .locals 1

    .line 73
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    return-object v0
.end method

.method public final getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->selectedCountryCode$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CountryTextInputLayout;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/model/CountryCode;

    return-object v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 186
    instance-of v0, p1, Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;

    if-eqz v0, :cond_0

    .line 187
    check-cast p1, Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->restoreSelectedCountry$payments_core_release(Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;)V

    return-void

    .line 189
    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 175
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountry$payments_core_release()Lcom/stripe/android/core/model/Country;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 176
    new-instance v1, Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;

    .line 177
    invoke-virtual {v0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    .line 178
    invoke-super {p0}, Lcom/google/android/material/textfield/TextInputLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    .line 176
    invoke-direct {v1, v0, v2}, Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;-><init>(Lcom/stripe/android/core/model/CountryCode;Landroid/os/Parcelable;)V

    check-cast v1, Landroid/os/Parcelable;

    return-object v1

    .line 180
    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/view/CountryTextInputLayout;

    .line 181
    invoke-super {p0}, Lcom/google/android/material/textfield/TextInputLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public final restoreSelectedCountry$payments_core_release(Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    invoke-virtual {p1}, Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 196
    invoke-virtual {p1}, Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    .line 197
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->updatedSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    .line 198
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->updateUiForCountryEntered(Lcom/stripe/android/core/model/CountryCode;)V

    .line 199
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->requestLayout()V

    return-void
.end method

.method public final setAllowedCountryCodes$payments_core_release(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "allowedCountryCodes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAdapter:Lcom/stripe/android/view/CountryAdapter;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CountryAdapter;->updateUnfilteredCountries$payments_core_release(Ljava/util/Set;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 231
    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->updateInitialCountry()V

    :cond_0
    return-void
.end method

.method public final setCountryChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/core/model/Country;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    iput-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryChangeCallback:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setCountryCodeChangeCallback(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/core/model/CountryCode;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iput-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryCodeChangeCallback:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setCountrySelected$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 1

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->updateUiForCountryEntered(Lcom/stripe/android/core/model/CountryCode;)V

    return-void
.end method

.method public final setCountrySelected$payments_core_release(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "This will be removed in a future version"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "setCountrySelected(CountryCode.create(countryCode))"
            imports = {
                "com.stripe.android.model.CountryCode"
            }
        .end subannotation
    .end annotation

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->create(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->updateUiForCountryEntered(Lcom/stripe/android/core/model/CountryCode;)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 168
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    .line 169
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    .line 314
    new-instance v1, Lcom/stripe/android/view/CountryTextInputLayout$setEnabled$$inlined$doOnNextLayout$1;

    invoke-direct {v1, p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout$setEnabled$$inlined$doOnNextLayout$1;-><init>(Lcom/stripe/android/view/CountryTextInputLayout;Z)V

    check-cast v1, Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public final setSelectedCountryCode(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 0

    .line 77
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->setSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    return-void
.end method

.method public final setSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->selectedCountryCode$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CountryTextInputLayout;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final updateUiForCountryEntered(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 2

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    sget-object v0, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/core/model/CountryUtils;->getCountryByCode(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 262
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->updatedSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    goto :goto_0

    .line 264
    :cond_0
    sget-object p1, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/core/model/CountryUtils;->getCountryByCode(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object v0

    .line 266
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutocomplete:Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final updatedSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 1

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    invoke-direct {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->clearError()V

    .line 271
    invoke-virtual {p0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 272
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->setSelectedCountryCode$payments_core_release(Lcom/stripe/android/core/model/CountryCode;)V

    :cond_0
    return-void
.end method

.method public final validateCountry$payments_core_release()V
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/stripe/android/view/CountryTextInputLayout;->countryAutocomplete:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->performValidation()V

    return-void
.end method
