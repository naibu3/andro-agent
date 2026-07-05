.class public final Lcom/stripe/android/view/CardFormView;
.super Landroid/widget/LinearLayout;
.source "CardFormView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardFormView$Companion;,
        Lcom/stripe/android/view/CardFormView$Style;,
        Lcom/stripe/android/view/CardFormView$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardFormView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFormView.kt\ncom/stripe/android/view/CardFormView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,571:1\n52#2,9:572\n1#3:581\n1863#4,2:582\n1863#4,2:584\n1863#4,2:612\n1863#4:644\n1864#4:649\n1557#4:652\n1628#4,3:653\n295#4,2:656\n58#5,23:586\n93#5,3:609\n58#5,23:614\n93#5,3:637\n326#6,4:640\n326#6,4:645\n256#6,2:650\n256#6,2:658\n256#6,2:660\n*S KotlinDebug\n*F\n+ 1 CardFormView.kt\ncom/stripe/android/view/CardFormView\n*L\n217#1:572,9\n241#1:582,2\n245#1:584,2\n322#1:612,2\n375#1:644\n375#1:649\n553#1:652\n553#1:653,3\n554#1:656,2\n273#1:586,23\n273#1:609,3\n352#1:614,23\n352#1:637,3\n365#1:640,4\n376#1:645,4\n540#1:650,2\n561#1:658,2\n286#1:660,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e5\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\t*\u00014\u0008\u0007\u0018\u0000 o2\u00020\u0001:\u0002noB\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010R\u001a\u00020S2\u0008\u0010T\u001a\u0004\u0018\u00010\'J\u0008\u0010U\u001a\u00020SH\u0002J\u0012\u0010V\u001a\u00020S2\u0008\u0010W\u001a\u0004\u0018\u00010XH\u0002J\u0008\u0010Y\u001a\u00020ZH\u0002J\u0008\u0010[\u001a\u00020SH\u0002J\u0008\u0010\\\u001a\u00020SH\u0002J\u0010\u0010]\u001a\u00020S2\u0006\u0010^\u001a\u00020ZH\u0016J\u0008\u0010_\u001a\u00020`H\u0014J\u0012\u0010a\u001a\u00020S2\u0008\u0010b\u001a\u0004\u0018\u00010`H\u0014J\u0008\u0010c\u001a\u00020SH\u0014J\u0008\u0010d\u001a\u00020SH\u0014J\u0014\u0010e\u001a\u00020S2\u000c\u0010f\u001a\u0008\u0012\u0004\u0012\u00020=0gJ\u0008\u0010h\u001a\u00020SH\u0002J\u0008\u0010i\u001a\u00020SH\u0002J\u001a\u0010j\u001a\u00020S2\u0006\u0010k\u001a\u00020$2\u0008\u0010l\u001a\u0004\u0018\u00010%H\u0002J\u0012\u0010m\u001a\u00020S2\u0008\u0010l\u001a\u0004\u0018\u00010%H\u0002R\u0018\u0010\n\u001a\n \u000c*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020$008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u00102R\u0010\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R\u0011\u0010<\u001a\u00020=8F\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010?R\u0013\u0010@\u001a\u0004\u0018\u00010A8F\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010CR\u0016\u0010D\u001a\u0004\u0018\u00010E8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0013\u0010H\u001a\u0004\u0018\u00010I8F\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010KR(\u0010M\u001a\u0004\u0018\u00010%2\u0008\u0010L\u001a\u0004\u0018\u00010%@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008N\u0010O\"\u0004\u0008P\u0010Q\u00a8\u0006p"
    }
    d2 = {
        "Lcom/stripe/android/view/CardFormView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "layoutInflater",
        "Landroid/view/LayoutInflater;",
        "kotlin.jvm.PlatformType",
        "Landroid/view/LayoutInflater;",
        "viewBinding",
        "Lcom/stripe/android/databinding/StripeCardFormViewBinding;",
        "cardContainer",
        "Lcom/google/android/material/card/MaterialCardView;",
        "cardMultilineWidget",
        "Lcom/stripe/android/view/CardMultilineWidget;",
        "countryPostalDivider",
        "Landroid/view/View;",
        "postalCodeContainer",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "errors",
        "Landroid/widget/TextView;",
        "postalCodeView",
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "countryLayout",
        "Lcom/stripe/android/view/CountryTextInputLayout;",
        "postalCodeValidator",
        "Lcom/stripe/android/view/PostalCodeValidator;",
        "style",
        "Lcom/stripe/android/view/CardFormView$Style;",
        "errorsMap",
        "",
        "Lcom/stripe/android/view/CardValidCallback$Fields;",
        "",
        "cardValidCallback",
        "Lcom/stripe/android/view/CardValidCallback;",
        "lifecycleOwnerDelegate",
        "Lcom/stripe/android/view/LifecycleOwnerDelegate;",
        "allEditTextFields",
        "",
        "Lcom/stripe/android/view/StripeEditText;",
        "getAllEditTextFields",
        "()Ljava/util/Collection;",
        "invalidFields",
        "",
        "getInvalidFields",
        "()Ljava/util/Set;",
        "cardValidTextWatcher",
        "com/stripe/android/view/CardFormView$cardValidTextWatcher$1",
        "Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;",
        "viewModelStoreOwner",
        "Landroidx/lifecycle/ViewModelStoreOwner;",
        "getViewModelStoreOwner$payments_core_release",
        "()Landroidx/lifecycle/ViewModelStoreOwner;",
        "setViewModelStoreOwner$payments_core_release",
        "(Landroidx/lifecycle/ViewModelStoreOwner;)V",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "cardParams",
        "Lcom/stripe/android/model/CardParams;",
        "getCardParams",
        "()Lcom/stripe/android/model/CardParams;",
        "paymentMethodCard",
        "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "getPaymentMethodCard",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getPaymentMethodCreateParams",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "value",
        "onBehalfOf",
        "getOnBehalfOf",
        "()Ljava/lang/String;",
        "setOnBehalfOf",
        "(Ljava/lang/String;)V",
        "setCardValidCallback",
        "",
        "callback",
        "setupCountryAndPostal",
        "updatePostalCodeViewLocale",
        "countryCode",
        "Lcom/stripe/android/core/model/CountryCode;",
        "isPostalValid",
        "",
        "showPostalError",
        "setupCardWidget",
        "setEnabled",
        "enabled",
        "onSaveInstanceState",
        "Landroid/os/Parcelable;",
        "onRestoreInstanceState",
        "state",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "setPreferredNetworks",
        "preferredNetworks",
        "",
        "applyStandardStyle",
        "applyBorderlessStyle",
        "onFieldError",
        "field",
        "errorMessage",
        "updateErrorsView",
        "Style",
        "Companion",
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
.field public static final $stable:I

.field public static final CARD_FORM_VIEW:Ljava/lang/String; = "CardFormView"

.field public static final Companion:Lcom/stripe/android/view/CardFormView$Companion;

.field private static final STATE_ENABLED:Ljava/lang/String; = "state_enabled"

.field private static final STATE_ON_BEHALF_OF:Ljava/lang/String; = "state_on_behalf_of"

.field private static final STATE_SUPER_STATE:Ljava/lang/String; = "state_super_state"


# instance fields
.field private final cardContainer:Lcom/google/android/material/card/MaterialCardView;

.field private final cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

.field private cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

.field private final cardValidTextWatcher:Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

.field private final countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

.field private final countryPostalDivider:Landroid/view/View;

.field private final errors:Landroid/widget/TextView;

.field private final errorsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/view/CardValidCallback$Fields;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final layoutInflater:Landroid/view/LayoutInflater;

.field private final lifecycleOwnerDelegate:Lcom/stripe/android/view/LifecycleOwnerDelegate;

.field private onBehalfOf:Ljava/lang/String;

.field private final postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

.field private final postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

.field private final postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

.field private style:Lcom/stripe/android/view/CardFormView$Style;

.field private final viewBinding:Lcom/stripe/android/databinding/StripeCardFormViewBinding;

.field private viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;


# direct methods
.method public static synthetic $r8$lambda$3qMssIZEcBajVzYvX8-dCpUdCCM(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardFormView;->setupCardWidget$lambda$18(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Dqirq2tAlGiZEB3Pv1nAePTHkQE(Lcom/stripe/android/view/CardFormView;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardFormView;->onAttachedToWindow$lambda$21(Lcom/stripe/android/view/CardFormView;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Puq5UjT8yNGbtOK8AKIpljTI104(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardFormView;->setupCountryAndPostal$lambda$10(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$VgPMg6hC6Wf5aPhS4An64k9_w_w(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardFormView;->setupCardWidget$lambda$19(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$_ZQF6DhKdedAC60cBJ0Kq0uHV_E(Lcom/stripe/android/view/CardFormView;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardFormView;->setupCountryAndPostal$lambda$8(Lcom/stripe/android/view/CardFormView;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic $r8$lambda$da3xSRsnF7S3-83kJmx48tIU-Ho(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardFormView;->_set_onBehalfOf_$lambda$3(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$hV5a6L0Id-V3LUmmlURM1CbqBV4(Lcom/stripe/android/view/CardFormView;Lcom/stripe/android/core/model/CountryCode;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardFormView;->setupCountryAndPostal$lambda$11(Lcom/stripe/android/view/CardFormView;Lcom/stripe/android/core/model/CountryCode;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$mDKFPkuxGYjWRgKgzeQdj2XdUhQ(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/CardFormView;->setupCardWidget$lambda$20(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/CardFormView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardFormView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/CardFormView;->Companion:Lcom/stripe/android/view/CardFormView$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/CardFormView;->$stable:I

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardFormView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardFormView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    .line 54
    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {p3, v0}, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/StripeCardFormViewBinding;

    move-result-object p3

    const-string v0, "inflate(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardFormView;->viewBinding:Lcom/stripe/android/databinding/StripeCardFormViewBinding;

    .line 56
    iget-object v0, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->cardMultilineWidgetContainer:Lcom/google/android/material/card/MaterialCardView;

    const-string v1, "cardMultilineWidgetContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardContainer:Lcom/google/android/material/card/MaterialCardView;

    .line 58
    iget-object v1, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const-string v2, "cardMultilineWidget"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    .line 60
    iget-object v2, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->countryPostalDivider:Landroid/view/View;

    const-string v3, "countryPostalDivider"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/stripe/android/view/CardFormView;->countryPostalDivider:Landroid/view/View;

    .line 62
    iget-object v2, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "postalCodeContainer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/stripe/android/view/CardFormView;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    .line 64
    iget-object v3, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->errors:Landroid/widget/TextView;

    const-string v4, "errors"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->errors:Landroid/widget/TextView;

    .line 66
    iget-object v3, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->postalCode:Lcom/stripe/android/view/PostalCodeEditText;

    const-string v4, "postalCode"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    .line 68
    iget-object p3, p3, Lcom/stripe/android/databinding/StripeCardFormViewBinding;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    const-string v3, "countryLayout"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    .line 70
    new-instance v3, Lcom/stripe/android/view/PostalCodeValidator;

    invoke-direct {v3}, Lcom/stripe/android/view/PostalCodeValidator;-><init>()V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

    .line 72
    sget-object v3, Lcom/stripe/android/view/CardFormView$Style;->Standard:Lcom/stripe/android/view/CardFormView$Style;

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->style:Lcom/stripe/android/view/CardFormView$Style;

    .line 74
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v3, Ljava/util/Map;

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->errorsMap:Ljava/util/Map;

    .line 78
    new-instance v3, Lcom/stripe/android/view/LifecycleOwnerDelegate;

    invoke-direct {v3}, Lcom/stripe/android/view/LifecycleOwnerDelegate;-><init>()V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->lifecycleOwnerDelegate:Lcom/stripe/android/view/LifecycleOwnerDelegate;

    .line 98
    new-instance v3, Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;-><init>(Lcom/stripe/android/view/CardFormView;)V

    iput-object v3, p0, Lcom/stripe/android/view/CardFormView;->cardValidTextWatcher:Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

    const/4 v3, 0x1

    .line 210
    invoke-virtual {p0, v3}, Lcom/stripe/android/view/CardFormView;->setOrientation(I)V

    .line 212
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->setupCountryAndPostal()V

    .line 213
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->setupCardWidget()V

    .line 219
    sget-object v4, Lcom/stripe/android/R$styleable;->StripeCardFormView:[I

    const-string v5, "StripeCardFormView"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 579
    invoke-virtual {p1, p2, v4, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 222
    sget p2, Lcom/stripe/android/R$styleable;->StripeCardFormView_backgroundColorStateList:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    .line 223
    invoke-static {}, Lcom/stripe/android/view/CardFormView$Style;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v4

    sget v6, Lcom/stripe/android/R$styleable;->StripeCardFormView_cardFormStyle:I

    invoke-virtual {p1, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    invoke-interface {v4, v6}, Lkotlin/enums/EnumEntries;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/view/CardFormView$Style;

    iput-object v4, p0, Lcom/stripe/android/view/CardFormView;->style:Lcom/stripe/android/view/CardFormView$Style;

    .line 579
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_0

    .line 227
    invoke-virtual {v0, p2}, Lcom/google/android/material/card/MaterialCardView;->setCardBackgroundColor(Landroid/content/res/ColorStateList;)V

    .line 228
    invoke-virtual {v1, v5}, Lcom/stripe/android/view/CardMultilineWidget;->setBackgroundColor(I)V

    .line 229
    invoke-virtual {p3, v5}, Lcom/stripe/android/view/CountryTextInputLayout;->setBackgroundColor(I)V

    .line 230
    invoke-virtual {v2, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setBackgroundColor(I)V

    .line 233
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->style:Lcom/stripe/android/view/CardFormView$Style;

    sget-object p2, Lcom/stripe/android/view/CardFormView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/view/CardFormView$Style;->ordinal()I

    move-result p1

    aget p1, p2, p1

    if-eq p1, v3, :cond_2

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    .line 235
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->applyBorderlessStyle()V

    return-void

    .line 233
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 234
    :cond_2
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->applyStandardStyle()V

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

    .line 48
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardFormView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final _set_onBehalfOf_$lambda$3(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$doWithCardWidgetViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewModel"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual {p2, p0}, Lcom/stripe/android/view/CardWidgetViewModel;->setOnBehalfOf(Ljava/lang/String;)V

    .line 202
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$getCardMultilineWidget$p(Lcom/stripe/android/view/CardFormView;)Lcom/stripe/android/view/CardMultilineWidget;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    return-object p0
.end method

.method public static final synthetic access$getCardValidCallback$p(Lcom/stripe/android/view/CardFormView;)Lcom/stripe/android/view/CardValidCallback;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    return-object p0
.end method

.method public static final synthetic access$getInvalidFields(Lcom/stripe/android/view/CardFormView;)Ljava/util/Set;
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getInvalidFields()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPostalCodeContainer$p(Lcom/stripe/android/view/CardFormView;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    return-object p0
.end method

.method public static final synthetic access$getPostalCodeView$p(Lcom/stripe/android/view/CardFormView;)Lcom/stripe/android/view/PostalCodeEditText;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    return-object p0
.end method

.method public static final synthetic access$onFieldError(Lcom/stripe/android/view/CardFormView;Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    return-void
.end method

.method private final applyBorderlessStyle()V
    .locals 5

    .line 504
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberTextInputLayout()Lcom/stripe/android/view/CardNumberTextInputLayout;

    move-result-object v0

    .line 506
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    .line 507
    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    .line 505
    invoke-static {v1, v2, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    .line 509
    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x1

    .line 504
    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/view/CardNumberTextInputLayout;->addView(Landroid/view/View;I)V

    .line 514
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    .line 516
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    .line 517
    iget-object v4, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    check-cast v4, Landroid/view/ViewGroup;

    .line 515
    invoke-static {v1, v4, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    .line 519
    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    .line 514
    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->addView(Landroid/view/View;I)V

    .line 523
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    .line 525
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    .line 526
    iget-object v4, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    check-cast v4, Landroid/view/ViewGroup;

    .line 524
    invoke-static {v1, v4, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    .line 528
    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    .line 523
    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->addView(Landroid/view/View;I)V

    .line 533
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    .line 535
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    .line 536
    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 534
    invoke-static {v1, v2, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    .line 538
    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    .line 533
    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CountryTextInputLayout;->addView(Landroid/view/View;)V

    .line 540
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryPostalDivider:Landroid/view/View;

    const/16 v1, 0x8

    .line 650
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 543
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardContainer:Lcom/google/android/material/card/MaterialCardView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/card/MaterialCardView;->setCardElevation(F)V

    return-void
.end method

.method private final applyStandardStyle()V
    .locals 5

    .line 469
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    .line 471
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    .line 472
    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    .line 470
    invoke-static {v1, v2, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    .line 474
    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x1

    .line 469
    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/view/CardMultilineWidget;->addView(Landroid/view/View;I)V

    .line 479
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getSecondRowLayout()Landroid/widget/LinearLayout;

    move-result-object v0

    .line 481
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    .line 482
    iget-object v4, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v4}, Lcom/stripe/android/view/CardMultilineWidget;->getSecondRowLayout()Landroid/widget/LinearLayout;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    .line 480
    invoke-static {v1, v4, v3}, Lcom/stripe/android/databinding/StripeVerticalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeVerticalDividerBinding;

    move-result-object v1

    .line 484
    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeVerticalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    .line 479
    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 488
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    .line 490
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->layoutInflater:Landroid/view/LayoutInflater;

    .line 491
    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 489
    invoke-static {v1, v2, v3}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;

    move-result-object v1

    .line 493
    invoke-virtual {v1}, Lcom/stripe/android/databinding/StripeHorizontalDividerBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    .line 494
    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardMultilineWidget;->getChildCount()I

    move-result v2

    .line 488
    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/view/CardMultilineWidget;->addView(Landroid/view/View;I)V

    .line 498
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardContainer:Lcom/google/android/material/card/MaterialCardView;

    .line 499
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$dimen;->stripe_card_form_view_card_elevation:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 498
    invoke-virtual {v0, v1}, Lcom/google/android/material/card/MaterialCardView;->setCardElevation(F)V

    return-void
.end method

.method private final getAllEditTextFields()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 83
    new-array v0, v0, [Lcom/stripe/android/view/StripeEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberEditText()Lcom/stripe/android/view/CardNumberEditText;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 84
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 85
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    .line 86
    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    aput-object v2, v0, v1

    .line 82
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method private final getInvalidFields()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/CardValidCallback$Fields;",
            ">;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getInvalidFields$payments_core_release()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 94
    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->isPostalValid()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 93
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 95
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final getPaymentMethodCard()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;
    .locals 11

    .line 170
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getCardParams()Lcom/stripe/android/model/CardParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getNumber()Ljava/lang/String;

    move-result-object v2

    .line 173
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getCvc()Ljava/lang/String;

    move-result-object v5

    .line 174
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getExpMonth()I

    move-result v1

    .line 175
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getExpYear()I

    move-result v3

    .line 176
    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getAttribution()Ljava/util/Set;

    move-result-object v7

    .line 177
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/CardBrandView;->paymentMethodCreateParamsNetworks()Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;

    move-result-object v8

    move v0, v1

    .line 171
    new-instance v1, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    .line 174
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 175
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object v3, v0

    .line 171
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final isPostalValid()Z
    .locals 3

    .line 303
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 304
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

    .line 305
    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    .line 306
    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 304
    invoke-virtual {v1, v2, v0}, Lcom/stripe/android/view/PostalCodeValidator;->isValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static final onAttachedToWindow$lambda$21(Lcom/stripe/android/view/CardFormView;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/view/CardWidgetViewModel;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$doWithCardWidgetViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "viewModel"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 445
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->onBehalfOf:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/view/CardWidgetViewModel;->getOnBehalfOf()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->onBehalfOf:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 446
    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->onBehalfOf:Ljava/lang/String;

    invoke-virtual {p2, p0}, Lcom/stripe/android/view/CardWidgetViewModel;->setOnBehalfOf(Ljava/lang/String;)V

    .line 448
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V
    .locals 2

    .line 550
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->errorsMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    invoke-static {}, Lcom/stripe/android/view/CardValidCallback$Fields;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 652
    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p2, Ljava/util/Collection;

    .line 653
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 654
    check-cast v0, Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 553
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->errorsMap:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 654
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 655
    :cond_0
    check-cast p2, Ljava/util/List;

    .line 652
    check-cast p2, Ljava/lang/Iterable;

    .line 656
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    .line 554
    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_1

    goto :goto_3

    :cond_4
    const/4 p2, 0x0

    :goto_3
    check-cast p2, Ljava/lang/String;

    .line 556
    invoke-direct {p0, p2}, Lcom/stripe/android/view/CardFormView;->updateErrorsView(Ljava/lang/String;)V

    return-void
.end method

.method private final setupCardWidget()V
    .locals 9

    const/4 v0, 0x3

    .line 319
    new-array v0, v0, [Lcom/stripe/android/view/StripeEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberEditText()Lcom/stripe/android/view/CardNumberEditText;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 320
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 321
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    .line 318
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 612
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 325
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/stripe/android/R$dimen;->stripe_card_form_view_textsize:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 323
    invoke-virtual {v1, v2, v5}, Lcom/stripe/android/view/StripeEditText;->setTextSize(IF)V

    .line 329
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 330
    sget v6, Lcom/stripe/android/R$color;->stripe_card_form_view_text_color:I

    .line 328
    invoke-static {v5, v6}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v5

    .line 327
    invoke-virtual {v1, v5}, Lcom/stripe/android/view/StripeEditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    const v5, 0x106000d

    .line 334
    invoke-virtual {v1, v5}, Lcom/stripe/android/view/StripeEditText;->setBackgroundResource(I)V

    .line 337
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/stripe/android/R$color;->stripe_card_form_view_form_error:I

    invoke-static {v5, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    .line 336
    invoke-virtual {v1, v5}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    goto :goto_0

    .line 341
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/stripe/android/view/ExpiryDateEditText;->setIncludeSeparatorGaps$payments_core_release(Z)V

    .line 342
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setExpirationDatePlaceholderRes$payments_core_release(Ljava/lang/Integer;)V

    .line 343
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/stripe/android/uicore/R$string;->stripe_expiration_date_hint:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 344
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberTextInputLayout()Lcom/stripe/android/view/CardNumberTextInputLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardNumberTextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 345
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const-string v5, ""

    invoke-virtual {v0, v5}, Lcom/stripe/android/view/CardMultilineWidget;->setCvcPlaceholderText(Ljava/lang/String;)V

    .line 347
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    iget-object v5, p0, Lcom/stripe/android/view/CardFormView;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    invoke-virtual {v0, v5}, Lcom/stripe/android/view/CardMultilineWidget;->setViewModelStoreOwner$payments_core_release(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 348
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberEditText()Lcom/stripe/android/view/CardNumberEditText;

    move-result-object v0

    iget-object v5, p0, Lcom/stripe/android/view/CardFormView;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    invoke-virtual {v0, v5}, Lcom/stripe/android/view/CardNumberEditText;->setViewModelStoreOwner$payments_core_release(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 350
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v0

    const/4 v5, 0x5

    invoke-virtual {v0, v5}, Lcom/stripe/android/view/CvcEditText;->setImeOptions(I)V

    .line 351
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    sget v5, Lcom/stripe/android/R$drawable;->stripe_card_form_view_text_input_layout_background:I

    invoke-virtual {v0, v5}, Lcom/stripe/android/view/CardMultilineWidget;->setBackgroundResource(I)V

    .line 352
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 636
    new-instance v5, Lcom/stripe/android/view/CardFormView$setupCardWidget$$inlined$doAfterTextChanged$1;

    invoke-direct {v5, p0}, Lcom/stripe/android/view/CardFormView$setupCardWidget$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/CardFormView;)V

    .line 637
    check-cast v5, Landroid/text/TextWatcher;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 361
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v5, Lcom/stripe/android/R$dimen;->stripe_card_form_view_text_margin_horizontal:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 363
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/stripe/android/R$dimen;->stripe_card_form_view_text_margin_vertical:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 365
    iget-object v6, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v6}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberTextInputLayout()Lcom/stripe/android/view/CardNumberTextInputLayout;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    .line 640
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    if-eqz v7, :cond_3

    check-cast v7, Landroid/widget/FrameLayout$LayoutParams;

    check-cast v7, Landroid/view/ViewGroup$LayoutParams;

    .line 641
    move-object v8, v7

    check-cast v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 366
    invoke-virtual {v8, v0}, Landroid/widget/FrameLayout$LayoutParams;->setMarginStart(I)V

    .line 367
    invoke-virtual {v8, v0}, Landroid/widget/FrameLayout$LayoutParams;->setMarginEnd(I)V

    .line 368
    iput v5, v8, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 369
    iput v5, v8, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 642
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 373
    new-array v4, v4, [Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v6, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v6}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v6

    aput-object v6, v4, v2

    .line 374
    iget-object v6, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v6}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcInputLayout()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v6

    aput-object v6, v4, v3

    .line 372
    invoke-static {v4}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 644
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/textfield/TextInputLayout;

    .line 376
    move-object v6, v4

    check-cast v6, Landroid/view/View;

    .line 645
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    if-eqz v7, :cond_1

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    check-cast v7, Landroid/view/ViewGroup$LayoutParams;

    .line 646
    move-object v8, v7

    check-cast v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 377
    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 378
    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 379
    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 380
    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 647
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 382
    invoke-virtual {v4, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 383
    invoke-virtual {v4, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 645
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 386
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    sget v2, Lcom/stripe/payments/model/R$drawable;->stripe_ic_cvc:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/stripe/android/view/CardMultilineWidget;->setCvcIcon(Ljava/lang/Integer;)V

    .line 388
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    new-instance v2, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v2}, Lcom/stripe/android/view/CardMultilineWidget;->setCardNumberErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 395
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    new-instance v2, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v2}, Lcom/stripe/android/view/CardMultilineWidget;->setExpirationDateErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 402
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    new-instance v2, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda2;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v2}, Lcom/stripe/android/view/CardMultilineWidget;->setCvcErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 409
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setPostalCodeErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    return-void

    .line 640
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final setupCardWidget$lambda$18(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V
    .locals 1

    .line 391
    sget-object v0, Lcom/stripe/android/view/CardValidCallback$Fields;->Number:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 390
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    return-void
.end method

.method private static final setupCardWidget$lambda$19(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V
    .locals 1

    .line 398
    sget-object v0, Lcom/stripe/android/view/CardValidCallback$Fields;->Expiry:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 397
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    return-void
.end method

.method private static final setupCardWidget$lambda$20(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V
    .locals 1

    .line 405
    sget-object v0, Lcom/stripe/android/view/CardValidCallback$Fields;->Cvc:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 404
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    return-void
.end method

.method private final setupCountryAndPostal()V
    .locals 3

    .line 253
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/CardFormView;->updatePostalCodeViewLocale(Lcom/stripe/android/core/model/CountryCode;)V

    .line 256
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    .line 257
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$color;->stripe_card_form_view_form_error:I

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    .line 256
    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PostalCodeEditText;->setErrorColor(I)V

    .line 260
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/PostalCodeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    check-cast v0, Landroid/widget/TextView;

    .line 608
    new-instance v1, Lcom/stripe/android/view/CardFormView$setupCountryAndPostal$$inlined$doAfterTextChanged$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$setupCountryAndPostal$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/CardFormView;)V

    .line 609
    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 277
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v1, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda6;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PostalCodeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    .line 284
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    new-instance v1, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda7;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda7;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CountryTextInputLayout;->setCountryCodeChangeCallback(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final setupCountryAndPostal$lambda$10(Lcom/stripe/android/view/CardFormView;Ljava/lang/String;)V
    .locals 1

    .line 279
    sget-object v0, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 278
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    return-void
.end method

.method private static final setupCountryAndPostal$lambda$11(Lcom/stripe/android/view/CardFormView;Lcom/stripe/android/core/model/CountryCode;)Lkotlin/Unit;
    .locals 2

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardFormView;->updatePostalCodeViewLocale(Lcom/stripe/android/core/model/CountryCode;)V

    .line 286
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    check-cast v0, Landroid/view/View;

    sget-object v1, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-virtual {v1, p1}, Lcom/stripe/android/core/model/CountryUtils;->doesCountryUsePostalCode(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 660
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 287
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/PostalCodeEditText;->setShouldShowError(Z)V

    .line 288
    iget-object p0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PostalCodeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 289
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final setupCountryAndPostal$lambda$8(Lcom/stripe/android/view/CardFormView;Landroid/view/View;Z)V
    .locals 0

    if-nez p2, :cond_2

    .line 262
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    .line 263
    invoke-virtual {p1}, Lcom/stripe/android/view/PostalCodeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->isPostalValid()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 262
    :goto_0
    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->setShouldShowError(Z)V

    .line 265
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/PostalCodeEditText;->getShouldShowError()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 266
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->showPostalError()V

    return-void

    .line 268
    :cond_1
    sget-object p1, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private final showPostalError()V
    .locals 2

    .line 312
    sget-object v0, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    .line 313
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/PostalCodeEditText;->getErrorMessage$payments_core_release()Ljava/lang/String;

    move-result-object v1

    .line 311
    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/CardFormView;->onFieldError(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V

    return-void
.end method

.method private final updateErrorsView(Ljava/lang/String;)V
    .locals 2

    .line 560
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->errors:Landroid/widget/TextView;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 561
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->errors:Landroid/widget/TextView;

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    .line 658
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final updatePostalCodeViewLocale(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 2

    .line 293
    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->isUS(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 294
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText$Config;->US:Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Lcom/stripe/android/view/PostalCodeEditText$Config;)V

    .line 295
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/uicore/R$string;->stripe_address_zip_invalid:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setErrorMessage(Ljava/lang/String;)V

    return-void

    .line 297
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    sget-object v0, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Lcom/stripe/android/view/PostalCodeEditText$Config;)V

    .line 298
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/stripe/android/uicore/R$string;->stripe_address_postal_code_invalid:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/PostalCodeEditText;->setErrorMessage(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    return-object v0
.end method

.method public final getCardParams()Lcom/stripe/android/model/CardParams;
    .locals 17

    move-object/from16 v0, p0

    .line 130
    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->validateAllFields()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 131
    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    return-object v2

    .line 134
    :cond_0
    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    .line 137
    invoke-direct {v0}, Lcom/stripe/android/view/CardFormView;->isPostalValid()Z

    move-result v1

    if-nez v1, :cond_1

    .line 138
    invoke-direct {v0}, Lcom/stripe/android/view/CardFormView;->showPostalError()V

    return-object v2

    .line 143
    :cond_1
    invoke-direct {v0, v2}, Lcom/stripe/android/view/CardFormView;->updateErrorsView(Ljava/lang/String;)V

    .line 146
    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 148
    new-instance v3, Lcom/stripe/android/model/CardParams;

    .line 149
    invoke-virtual {v0}, Lcom/stripe/android/view/CardFormView;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v4

    .line 150
    const-string v5, "CardFormView"

    invoke-static {v5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    .line 151
    iget-object v6, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v6}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/stripe/android/cards/CardNumber$Validated;->getValue()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_2
    move-object v6, v2

    :goto_0
    if-nez v6, :cond_3

    const-string v6, ""

    .line 152
    :cond_3
    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Validated;->getMonth()I

    move-result v7

    .line 153
    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Validated;->getYear()I

    move-result v8

    .line 154
    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcEditText()Lcom/stripe/android/view/CvcEditText;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/view/CvcEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_1

    :cond_4
    move-object v9, v2

    .line 155
    :goto_1
    new-instance v1, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v1}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    .line 156
    iget-object v10, v0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v10}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v10

    invoke-virtual {v1, v10}, Lcom/stripe/android/model/Address$Builder;->setCountryCode(Lcom/stripe/android/core/model/CountryCode;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v1

    .line 157
    iget-object v10, v0, Lcom/stripe/android/view/CardFormView;->postalCodeView:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v10}, Lcom/stripe/android/view/PostalCodeEditText;->getText()Landroid/text/Editable;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-virtual {v1, v2}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v1

    .line 158
    invoke-virtual {v1}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v11

    .line 159
    iget-object v1, v0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardMultilineWidget;->getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/view/CardBrandView;->cardParamsNetworks()Lcom/stripe/android/model/Networks;

    move-result-object v13

    const/16 v15, 0x540

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    .line 148
    invoke-direct/range {v3 .. v16}, Lcom/stripe/android/model/CardParams;-><init>(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Lcom/stripe/android/model/Networks;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    .line 146
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final getOnBehalfOf()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->onBehalfOf:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 7

    .line 187
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getPaymentMethodCard()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewModelStoreOwner$payments_core_release()Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 3

    .line 440
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 441
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->lifecycleOwnerDelegate:Lcom/stripe/android/view/LifecycleOwnerDelegate;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/LifecycleOwnerDelegate;->initLifecycle(Landroid/view/View;)V

    .line 444
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    new-instance v2, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda3;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/view/CardFormView;)V

    invoke-static {v1, v0, v2}, Lcom/stripe/android/view/CardWidgetViewModelKt;->doWithCardWidgetViewModel(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 452
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    .line 453
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->lifecycleOwnerDelegate:Lcom/stripe/android/view/LifecycleOwnerDelegate;

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/LifecycleOwnerDelegate;->destroyLifecycle(Landroid/view/View;)V

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 430
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 431
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "state_super_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 432
    const-string v0, "state_enabled"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardFormView;->setEnabled(Z)V

    .line 433
    const-string v0, "state_on_behalf_of"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardFormView;->setOnBehalfOf(Ljava/lang/String;)V

    return-void

    .line 435
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    const/4 v0, 0x3

    .line 423
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "state_super_state"

    invoke-super {p0}, Landroid/widget/LinearLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 424
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->isEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "state_enabled"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 425
    const-string v1, "state_on_behalf_of"

    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->onBehalfOf:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 422
    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    return-object v0
.end method

.method public final setCardValidCallback(Lcom/stripe/android/view/CardValidCallback;)V
    .locals 3

    .line 240
    iput-object p1, p0, Lcom/stripe/android/view/CardFormView;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    .line 241
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getAllEditTextFields()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 582
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    .line 241
    iget-object v2, p0, Lcom/stripe/android/view/CardFormView;->cardValidTextWatcher:Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

    check-cast v2, Landroid/text/TextWatcher;

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 245
    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getAllEditTextFields()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 584
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    .line 245
    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->cardValidTextWatcher:Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;

    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    .line 248
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardFormView;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getInvalidFields()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    invoke-direct {p0}, Lcom/stripe/android/view/CardFormView;->getInvalidFields()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/stripe/android/view/CardValidCallback;->onInputChanged(ZLjava/util/Set;)V

    :cond_2
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 413
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 414
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardContainer:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0, p1}, Lcom/google/android/material/card/MaterialCardView;->setEnabled(Z)V

    .line 415
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setEnabled(Z)V

    .line 416
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->setEnabled(Z)V

    .line 417
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->postalCodeContainer:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    .line 418
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->errors:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method

.method public final setOnBehalfOf(Ljava/lang/String;)V
    .locals 3

    .line 198
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->onBehalfOf:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 199
    invoke-virtual {p0}, Lcom/stripe/android/view/CardFormView;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lcom/stripe/android/view/CardFormView;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    new-instance v2, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda4;

    invoke-direct {v2, p1}, Lcom/stripe/android/view/CardFormView$$ExternalSyntheticLambda4;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcom/stripe/android/view/CardWidgetViewModelKt;->doWithCardWidgetViewModel(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/jvm/functions/Function2;)V

    .line 205
    :cond_0
    iput-object p1, p0, Lcom/stripe/android/view/CardFormView;->onBehalfOf:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final setPreferredNetworks(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;)V"
        }
    .end annotation

    const-string v0, "preferredNetworks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 464
    iget-object v0, p0, Lcom/stripe/android/view/CardFormView;->cardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setMerchantPreferredNetworks(Ljava/util/List;)V

    return-void
.end method

.method public final setViewModelStoreOwner$payments_core_release(Landroidx/lifecycle/ViewModelStoreOwner;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/stripe/android/view/CardFormView;->viewModelStoreOwner:Landroidx/lifecycle/ViewModelStoreOwner;

    return-void
.end method
