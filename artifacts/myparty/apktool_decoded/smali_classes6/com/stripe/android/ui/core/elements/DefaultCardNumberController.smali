.class public final Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;
.super Lcom/stripe/android/ui/core/elements/CardNumberController;
.source "CardNumberController.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$Companion;,
        Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardNumberController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/DefaultCardNumberController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,437:1\n774#2:438\n865#2,2:439\n295#2,2:441\n1557#2:470\n1628#2,3:471\n774#2:474\n865#2,2:475\n1557#2:477\n1628#2,3:478\n1557#2:481\n1628#2,3:482\n77#3:443\n77#3:444\n77#3:445\n1225#4,6:446\n1225#4,6:452\n1225#4,6:458\n1225#4,6:464\n1#5:485\n81#6:486\n107#6,2:487\n81#6:489\n107#6,2:490\n*S KotlinDebug\n*F\n+ 1 CardNumberController.kt\ncom/stripe/android/ui/core/elements/DefaultCardNumberController\n*L\n345#1:438\n345#1:439,2\n354#1:441,2\n230#1:470\n230#1:471,3\n256#1:474\n256#1:475,2\n258#1:477\n258#1:478,3\n262#1:481\n262#1:482,3\n369#1:443\n370#1:444\n371#1:445\n374#1:446,6\n375#1:452,6\n379#1:458,6\n402#1:464,6\n374#1:486\n374#1:487,2\n375#1:489\n375#1:490,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 w2\u00020\u0001:\u0001wBY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0012\u0010_\u001a\u0004\u0018\u00010P2\u0006\u0010`\u001a\u00020\u000cH\u0016J\u0010\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u000cH\u0016J\u0010\u0010d\u001a\u00020b2\u0006\u0010e\u001a\u00020\u000eH\u0016J\u0010\u0010f\u001a\u00020b2\u0006\u0010g\u001a\u00020hH\u0016J4\u0010i\u001a\u00020<2\u0008\u0010j\u001a\u0004\u0018\u00010<2\u000c\u0010k\u001a\u0008\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0011\u001a\u00020\u00122\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020<0;J=\u0010l\u001a\u00020b2\u0006\u0010m\u001a\u00020\u000e2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020q2\u000c\u0010r\u001a\u0008\u0012\u0004\u0012\u00020t0s2\u0008\u0010u\u001a\u0004\u0018\u00010tH\u0017\u00a2\u0006\u0002\u0010vR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u00020\u001aX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001fX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\u0008 \u0010\u001cR\u0014\u0010!\u001a\u00020\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0016R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020%0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u000c0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u000c0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\'R\u0016\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u0008\u0012\u0004\u0012\u00020/0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\'R\u0014\u00101\u001a\u000202X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u001a\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u000c0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010\'R\u001a\u00107\u001a\u0008\u0012\u0004\u0012\u00020%0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010\'R\u000e\u00109\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020<0;0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u0008\u0012\u0004\u0012\u00020<0;X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u00020<0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010\'R\u0014\u0010A\u001a\u0008\u0012\u0004\u0012\u00020<0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u00020<0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010\'R\u0014\u0010D\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010\u0018R\u001c\u0010F\u001a\u00020G8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010KR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010\'R\u0014\u0010O\u001a\u0008\u0012\u0004\u0012\u00020P0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020P0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010\'R\u0014\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u000e0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010T\u001a\u0008\u0012\u0004\u0012\u00020\u000e0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010\'R\u001a\u0010V\u001a\u0008\u0012\u0004\u0012\u00020\u000e0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008W\u0010\'R\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010\'R\u001a\u0010[\u001a\u0008\u0012\u0004\u0012\u00020\u000e0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010\'R\u001a\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020]0$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010\'\u00a8\u0006x\u00b2\u0006\u000c\u0010y\u001a\u0004\u0018\u00010<X\u008a\u008e\u0002\u00b2\u0006\n\u0010z\u001a\u00020\u000eX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;",
        "Lcom/stripe/android/ui/core/elements/CardNumberController;",
        "cardTextFieldConfig",
        "Lcom/stripe/android/ui/core/elements/CardNumberConfig;",
        "cardAccountRangeRepository",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "uiContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "staticCardAccountRanges",
        "Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "initialValue",
        "",
        "showOptionalLabel",
        "",
        "cardBrandChoiceConfig",
        "Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "<init>",
        "(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;ZLcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;Lcom/stripe/android/CardBrandFilter;)V",
        "getInitialValue",
        "()Ljava/lang/String;",
        "getShowOptionalLabel",
        "()Z",
        "capitalization",
        "Landroidx/compose/ui/text/input/KeyboardCapitalization;",
        "getCapitalization-IUNYP9k",
        "()I",
        "I",
        "keyboardType",
        "Landroidx/compose/ui/text/input/KeyboardType;",
        "getKeyboardType-PjHm6EE",
        "debugLabel",
        "getDebugLabel",
        "label",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getLabel",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_fieldValue",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "fieldValue",
        "getFieldValue",
        "latestBinBasedPanLength",
        "",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "getVisualTransformation",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "getLayoutDirection",
        "()Landroidx/compose/ui/unit/LayoutDirection;",
        "rawFieldValue",
        "getRawFieldValue",
        "contentDescription",
        "getContentDescription",
        "isEligibleForCardBrandChoice",
        "brandChoices",
        "",
        "Lcom/stripe/android/model/CardBrand;",
        "preferredBrands",
        "mostRecentUserSelectedBrand",
        "selectedCardBrandFlow",
        "getSelectedCardBrandFlow",
        "impliedCardBrand",
        "cardBrandFlow",
        "getCardBrandFlow",
        "cardScanEnabled",
        "getCardScanEnabled",
        "accountRangeService",
        "Lcom/stripe/android/cards/CardAccountRangeService;",
        "getAccountRangeService$annotations",
        "()V",
        "getAccountRangeService",
        "()Lcom/stripe/android/cards/CardAccountRangeService;",
        "trailingIcon",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
        "getTrailingIcon",
        "_fieldState",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "fieldState",
        "getFieldState",
        "_hasFocus",
        "loading",
        "getLoading",
        "visibleError",
        "getVisibleError",
        "error",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "isComplete",
        "formFieldValue",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValue",
        "onValueChange",
        "displayFormatted",
        "onRawValueChange",
        "",
        "rawValue",
        "onFocusChange",
        "newHasFocus",
        "onDropdownItemClicked",
        "item",
        "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;",
        "determineSelectedBrand",
        "previous",
        "allChoices",
        "ComposeUI",
        "enabled",
        "field",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "hiddenIdentifiers",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "lastTextFieldIdentifier",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V",
        "Companion",
        "payments-ui-core_release",
        "lastLoggedCardBrand",
        "hasReportedIncompleteCardNumberRequiringMoreThan16Digits"
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

.field public static final CARD_NUMBER_16_DIGITS:I = 0x10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$Companion;

.field public static final STATIC_ICON_COUNT:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final _fieldState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation
.end field

.field private final _fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

.field private final brandChoices:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;>;"
        }
    .end annotation
.end field

.field private final capitalization:I

.field private final cardBrandChoiceConfig:Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final cardBrandFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field

.field private final cardScanEnabled:Z

.field private final cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

.field private final contentDescription:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final debugLabel:Ljava/lang/String;

.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final formFieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final impliedCardBrand:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field

.field private final initialValue:Ljava/lang/String;

.field private final isComplete:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isEligibleForCardBrandChoice:Z

.field private final keyboardType:I

.field private final label:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final latestBinBasedPanLength:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

.field private final loading:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final mostRecentUserSelectedBrand:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field

.field private final preferredBrands:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field

.field private final rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedCardBrandFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field

.field private final showOptionalLabel:Z

.field private final trailingIcon:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation
.end field

.field private final visibleError:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final visualTransformation:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$-D48WkriNRPhEf8Fqqu7Dw0RJx8()Landroidx/compose/runtime/MutableState;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->ComposeUI$lambda$21$lambda$20()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$39W7AhOw8L7rsark40-Omle4sQs()Landroidx/compose/runtime/MutableState;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->ComposeUI$lambda$25$lambda$24()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$AAYhVsrVDOwAesaTXH2uhMaP4Vo(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->_fieldState$lambda$12(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$F051dqfGpHFOdT0-RA2-uPJsTYg(Lcom/stripe/android/uicore/elements/TextFieldState;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->isComplete$lambda$16(Lcom/stripe/android/uicore/elements/TextFieldState;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$NBGasn0KJysML-WUrx9bG86auYs(Ljava/util/List;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/model/CardBrand;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardBrandFlow$lambda$5(Ljava/util/List;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$RR6STbJ9MvkPGzVldFdpmsBcdZ8(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->contentDescription$lambda$2(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UX3Idf-PEoiBNOM9oeKmWK_6YWE(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->rawFieldValue$lambda$1(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$WDaEejnuKpJYf-marJ7LZ2Z6Kaw(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/model/CardBrand;Ljava/util/List;)Lcom/stripe/android/model/CardBrand;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->selectedCardBrandFlow$lambda$3(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/model/CardBrand;Ljava/util/List;)Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ZO37UCH6YPFHB_27D06cXpl4nbc(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->accountRangeService$lambda$6(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$eVou5LjE1vFyQ13syyXsaKbfN4Q(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/uicore/elements/TextFieldIcon;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->trailingIcon$lambda$11(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/uicore/elements/TextFieldIcon;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$h9vtQfHV7rsCJC-oBdka-w3K4DE(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->visibleError$lambda$13(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$jL7EX6rWXMIT4i0jdv9H-CUsc5w(ZLcom/stripe/android/uicore/elements/TextFieldState;)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->error$lambda$15(ZLcom/stripe/android/uicore/elements/TextFieldState;)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$oK5fmQTHgtLdpMmRMkaWDMjsnog(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;Ljava/lang/Integer;)Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->visualTransformation$lambda$0(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;Ljava/lang/Integer;)Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$q3rvXOjWPFrE54msaiwrj4pAAEQ(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->impliedCardBrand$lambda$4(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$tEuX1Vml_zST7OeQ7wOAr8xJ_Wo(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->formFieldValue$lambda$17(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->Companion:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;ZLcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;Lcom/stripe/android/CardBrandFilter;)V
    .locals 11

    move-object/from16 v0, p8

    move-object/from16 v7, p9

    const-string v1, "cardTextFieldConfig"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "cardAccountRangeRepository"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "uiContext"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "workContext"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "staticCardAccountRanges"

    move-object/from16 v4, p5

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "cardBrandChoiceConfig"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "cardBrandFilter"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 86
    invoke-direct {p0, v1}, Lcom/stripe/android/ui/core/elements/CardNumberController;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    move-object/from16 v2, p6

    .line 82
    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->initialValue:Ljava/lang/String;

    move/from16 v2, p7

    .line 83
    iput-boolean v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->showOptionalLabel:Z

    .line 84
    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardBrandChoiceConfig:Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;

    .line 85
    iput-object v7, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    .line 87
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getCapitalization-IUNYP9k()I

    move-result v2

    iput v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->capitalization:I

    .line 88
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getKeyboard-PjHm6EE()I

    move-result v2

    iput v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->keyboardType:I

    .line 89
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getDebugLabel()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->debugLabel:Ljava/lang/String;

    .line 91
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->getLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->label:Lkotlinx/coroutines/flow/StateFlow;

    .line 93
    const-string p1, ""

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v8

    iput-object v8, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 94
    invoke-static {v8}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 96
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->latestBinBasedPanLength:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 99
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->getFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    .line 100
    check-cast v2, Lkotlinx/coroutines/flow/StateFlow;

    .line 98
    new-instance v6, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda7;

    invoke-direct {v6, p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda7;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V

    invoke-static {v5, v2, v6}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

    .line 109
    sget-object v2, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 112
    move-object v2, v8

    check-cast v2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v5, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda11;

    invoke-direct {v5, p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda11;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V

    invoke-static {v2, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 115
    move-object v2, v8

    check-cast v2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v5, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda12;

    invoke-direct {v5}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda12;-><init>()V

    invoke-static {v2, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->contentDescription:Lkotlinx/coroutines/flow/StateFlow;

    .line 119
    instance-of v2, v0, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;

    iput-boolean v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->isEligibleForCardBrandChoice:Z

    .line 120
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v9

    iput-object v9, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->brandChoices:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 123
    instance-of v5, v0, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;

    if-eqz v5, :cond_0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;->getPreferredBrands()Ljava/util/List;

    move-result-object v5

    goto :goto_0

    .line 124
    :cond_0
    instance-of v5, v0, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Ineligible;

    if-eqz v5, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 122
    :goto_0
    iput-object v5, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->preferredBrands:Ljava/util/List;

    .line 137
    instance-of v5, v0, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;

    if-eqz v5, :cond_1

    check-cast v0, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Eligible;->getInitialBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    goto :goto_1

    .line 138
    :cond_1
    instance-of v0, v0, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Ineligible;

    if-eqz v0, :cond_4

    .line 135
    :goto_1
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->mostRecentUserSelectedBrand:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 143
    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    .line 144
    move-object v1, v9

    check-cast v1, Lkotlinx/coroutines/flow/StateFlow;

    .line 142
    new-instance v5, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda13;

    invoke-direct {v5, p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda13;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V

    invoke-static {v0, v1, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->selectedCardBrandFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 155
    move-object v0, v8

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v1, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda14;

    invoke-direct {v1, p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda14;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v10

    iput-object v10, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->impliedCardBrand:Lkotlinx/coroutines/flow/StateFlow;

    if-eqz v2, :cond_2

    .line 163
    move-object v0, v9

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    .line 164
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->getSelectedCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda1;

    invoke-direct {v2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda1;-><init>()V

    .line 162
    invoke-static {v0, v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v10

    .line 161
    :goto_2
    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardBrandFlow:Lkotlinx/coroutines/flow/StateFlow;

    const/4 v0, 0x1

    .line 172
    iput-boolean v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardScanEnabled:Z

    .line 175
    new-instance v0, Lcom/stripe/android/cards/CardAccountRangeService;

    .line 180
    new-instance v1, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$accountRangeService$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$accountRangeService$1;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V

    move-object v5, v1

    check-cast v5, Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;

    .line 195
    new-instance v6, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda2;

    invoke-direct {v6, p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    .line 175
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/cards/CardAccountRangeService;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/CardBrandFilter;)V

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    .line 200
    move-object p2, v8

    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    .line 201
    check-cast v9, Lkotlinx/coroutines/flow/StateFlow;

    .line 202
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->getSelectedCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    .line 199
    new-instance v1, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V

    invoke-static {p2, v9, p3, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->trailingIcon:Lkotlinx/coroutines/flow/StateFlow;

    .line 273
    check-cast v8, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p2, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda4;

    invoke-direct {p2, p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)V

    invoke-static {v10, v8, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->_fieldState:Lkotlinx/coroutines/flow/StateFlow;

    .line 282
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->fieldState:Lkotlinx/coroutines/flow/StateFlow;

    const/4 p3, 0x0

    .line 284
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-static {p3}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 286
    invoke-virtual {v0}, Lcom/stripe/android/cards/CardAccountRangeService;->isLoading()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->loading:Lkotlinx/coroutines/flow/StateFlow;

    .line 289
    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda5;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {p2, p3, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->visibleError:Lkotlinx/coroutines/flow/StateFlow;

    .line 297
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->getVisibleError()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    new-instance v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda8;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda8;-><init>()V

    invoke-static {p3, p2, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->error:Lkotlinx/coroutines/flow/StateFlow;

    .line 301
    new-instance p3, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda9;

    invoke-direct {p3}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda9;-><init>()V

    invoke-static {p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    .line 304
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->isComplete()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    new-instance v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda10;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda10;-><init>()V

    invoke-static {p2, p3, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 309
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->getInitialValue()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_3

    goto :goto_3

    :cond_3
    move-object p1, p2

    :goto_3
    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->onRawValueChange(Ljava/lang/String;)V

    return-void

    .line 136
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 122
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;ZLcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;Lcom/stripe/android/CardBrandFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    .line 81
    new-instance v1, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;

    invoke-direct {v1}, Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;-><init>()V

    check-cast v1, Lcom/stripe/android/cards/StaticCardAccountRanges;

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v9, v1

    goto :goto_1

    :cond_1
    move/from16 v9, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    .line 84
    sget-object v1, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Ineligible;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig$Ineligible;

    check-cast v1, Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;

    move-object v10, v1

    goto :goto_2

    :cond_2
    move-object/from16 v10, p8

    :goto_2
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_3

    .line 85
    sget-object v0, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    check-cast v0, Lcom/stripe/android/CardBrandFilter;

    move-object v11, v0

    goto :goto_3

    :cond_3
    move-object/from16 v11, p9

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v8, p6

    .line 76
    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;-><init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;ZLcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;Lcom/stripe/android/CardBrandFilter;)V

    return-void
.end method

.method private static final ComposeUI$lambda$21$lambda$20()Landroidx/compose/runtime/MutableState;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 374
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method

.method private static final ComposeUI$lambda$22(Landroidx/compose/runtime/MutableState;)Lcom/stripe/android/model/CardBrand;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;)",
            "Lcom/stripe/android/model/CardBrand;"
        }
    .end annotation

    .line 374
    check-cast p0, Landroidx/compose/runtime/State;

    .line 486
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/CardBrand;

    return-object p0
.end method

.method private static final ComposeUI$lambda$23(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/model/CardBrand;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;",
            "Lcom/stripe/android/model/CardBrand;",
            ")V"
        }
    .end annotation

    .line 487
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final ComposeUI$lambda$25$lambda$24()Landroidx/compose/runtime/MutableState;
    .locals 3

    const/4 v0, 0x0

    .line 376
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    return-object v0
.end method

.method private static final ComposeUI$lambda$26(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 375
    check-cast p0, Landroidx/compose/runtime/State;

    .line 489
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final ComposeUI$lambda$27(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 375
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 490
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _fieldState$lambda$12(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    .line 277
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {p0}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/AccountRange;->getPanLength()I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Lcom/stripe/android/model/CardBrand;->getMaxLengthForCardNumber(Ljava/lang/String;)I

    move-result p0

    .line 274
    :goto_0
    invoke-virtual {v0, p1, p2, p0}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->determineState(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;I)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$ComposeUI$lambda$22(Landroidx/compose/runtime/MutableState;)Lcom/stripe/android/model/CardBrand;
    .locals 0

    .line 76
    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->ComposeUI$lambda$22(Landroidx/compose/runtime/MutableState;)Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$ComposeUI$lambda$23(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/model/CardBrand;)V
    .locals 0

    .line 76
    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->ComposeUI$lambda$23(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/model/CardBrand;)V

    return-void
.end method

.method public static final synthetic access$ComposeUI$lambda$26(Landroidx/compose/runtime/MutableState;)Z
    .locals 0

    .line 76
    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->ComposeUI$lambda$26(Landroidx/compose/runtime/MutableState;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$ComposeUI$lambda$27(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    .line 76
    invoke-static {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->ComposeUI$lambda$27(Landroidx/compose/runtime/MutableState;Z)V

    return-void
.end method

.method public static final synthetic access$getBrandChoices$p(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 76
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->brandChoices:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getImpliedCardBrand$p(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 76
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->impliedCardBrand:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getLatestBinBasedPanLength$p(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 76
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->latestBinBasedPanLength:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_hasFocus$p(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 76
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method private static final accountRangeService$lambda$6(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Z
    .locals 0

    .line 195
    iget-boolean p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->isEligibleForCardBrandChoice:Z

    return p0
.end method

.method private static final cardBrandFlow$lambda$5(Ljava/util/List;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/model/CardBrand;
    .locals 1

    const-string v0, "choices"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/CardBrand;

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method private static final contentDescription$lambda$2(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    invoke-static {p0}, Lcom/stripe/android/uicore/utils/AccessibilityKt;->asIndividualDigits(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final error$lambda$15(ZLcom/stripe/android/uicore/elements/TextFieldState;)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 1

    const-string v0, "fieldState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->getError()Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    return-object p1

    :cond_0
    return-object v0
.end method

.method private static final formFieldValue$lambda$17(ZLjava/lang/String;)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    new-instance v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static synthetic getAccountRangeService$annotations()V
    .locals 0

    return-void
.end method

.method private static final impliedCardBrand$lambda$4(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {p0}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/AccountRange;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    .line 157
    :cond_1
    :goto_0
    sget-object p0, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {p0, p1}, Lcom/stripe/android/model/CardBrand$Companion;->getCardBrands(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/CardBrand;

    if-nez p0, :cond_2

    .line 158
    sget-object p0, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    :cond_2
    return-object p0
.end method

.method private static final isComplete$lambda$16(Lcom/stripe/android/uicore/elements/TextFieldState;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    invoke-interface {p0}, Lcom/stripe/android/uicore/elements/TextFieldState;->isValid()Z

    move-result p0

    return p0
.end method

.method private static final rawFieldValue$lambda$1(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->convertToRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final selectedCardBrandFlow$lambda$3(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/model/CardBrand;Ljava/util/List;)Lcom/stripe/android/model/CardBrand;
    .locals 2

    const-string v0, "allChoices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->preferredBrands:Ljava/util/List;

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->determineSelectedBrand(Lcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/CardBrandFilter;Ljava/util/List;)Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    return-object p0
.end method

.method private static final trailingIcon$lambda$11(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/uicore/elements/TextFieldIcon;
    .locals 12

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brands"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chosen"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->isEligibleForCardBrandChoice:Z

    const/16 v1, 0xa

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 205
    new-instance v2, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    .line 206
    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v3

    .line 207
    sget p1, Lcom/stripe/android/R$string;->stripe_card_brand_choice_no_selection:I

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    .line 208
    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 205
    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 211
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne p1, v4, :cond_0

    .line 212
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/CardBrand;

    .line 214
    new-instance v5, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    .line 215
    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v6

    .line 216
    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v7

    .line 217
    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 214
    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    .line 220
    :cond_0
    sget-object p1, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v5

    aget p1, p1, v5

    if-ne p1, v4, :cond_1

    move-object v5, v3

    goto :goto_0

    .line 222
    :cond_1
    new-instance v5, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    .line 223
    invoke-virtual {p3}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v6

    .line 224
    invoke-virtual {p3}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v7

    .line 225
    invoke-virtual {p3}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 222
    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 230
    :goto_0
    move-object p1, p2

    check-cast p1, Ljava/lang/Iterable;

    .line 470
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p3, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p3, Ljava/util/Collection;

    .line 471
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 472
    check-cast v1, Lcom/stripe/android/model/CardBrand;

    .line 231
    iget-object v6, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    invoke-interface {v6, v1}, Lcom/stripe/android/CardBrandFilter;->isAccepted(Lcom/stripe/android/model/CardBrand;)Z

    move-result v6

    .line 232
    new-instance v7, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;

    .line 233
    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v8

    if-eqz v6, :cond_2

    .line 235
    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v9

    goto :goto_2

    .line 238
    :cond_2
    sget v9, Lcom/stripe/android/ui/core/R$string;->stripe_card_brand_not_accepted_with_brand:I

    .line 239
    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getDisplayName()Ljava/lang/String;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x4

    .line 237
    invoke-static {v9, v10, v3, v11, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v9

    .line 242
    :goto_2
    invoke-virtual {v1}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v1

    .line 232
    invoke-direct {v7, v8, v9, v1, v6}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;IZ)V

    .line 472
    invoke-interface {p3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 473
    :cond_3
    check-cast p3, Ljava/util/List;

    .line 248
    sget p0, Lcom/stripe/android/R$string;->stripe_card_brand_choice_selection_header:I

    invoke-static {p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v5

    .line 251
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x2

    if-ge p1, p2, :cond_5

    move v0, v4

    .line 247
    :cond_5
    new-instance p1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;

    invoke-direct {p1, p0, v0, v2, p3}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;-><init>(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;Ljava/util/List;)V

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldIcon;

    return-object p1

    .line 253
    :cond_6
    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {p2}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object p2

    if-eqz p2, :cond_7

    .line 254
    new-instance v2, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {p0}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/model/AccountRange;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v3

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/uicore/elements/TextFieldIcon;

    return-object v2

    .line 256
    :cond_7
    sget-object p2, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/CardBrand$Companion;->getCardBrands(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 474
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/Collection;

    .line 475
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/model/CardBrand;

    .line 256
    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    invoke-interface {v2, v0}, Lcom/stripe/android/CardBrandFilter;->isAccepted(Lcom/stripe/android/model/CardBrand;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 475
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 476
    :cond_9
    check-cast p2, Ljava/util/List;

    .line 258
    check-cast p2, Ljava/lang/Iterable;

    .line 477
    new-instance p0, Ljava/util/ArrayList;

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p0, Ljava/util/Collection;

    .line 478
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 479
    check-cast p3, Lcom/stripe/android/model/CardBrand;

    .line 259
    new-instance v2, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-virtual {p3}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v3

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 479
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 480
    :cond_a
    check-cast p0, Ljava/util/List;

    .line 477
    check-cast p0, Ljava/lang/Iterable;

    const/4 p1, 0x3

    .line 260
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    .line 481
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p3, Ljava/util/Collection;

    .line 482
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 483
    check-cast v0, Lcom/stripe/android/model/CardBrand;

    .line 263
    new-instance v1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    invoke-virtual {v0}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result v2

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 483
    invoke-interface {p3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 484
    :cond_b
    check-cast p3, Ljava/util/List;

    .line 481
    check-cast p3, Ljava/lang/Iterable;

    .line 264
    invoke-static {p3, p1}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    .line 266
    new-instance p2, Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;

    invoke-direct {p2, p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldIcon$MultiTrailing;-><init>(Ljava/util/List;Ljava/util/List;)V

    check-cast p2, Lcom/stripe/android/uicore/elements/TextFieldIcon;

    return-object p2
.end method

.method private static final visibleError$lambda$13(Lcom/stripe/android/uicore/elements/TextFieldState;Z)Z
    .locals 1

    const-string v0, "fieldState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    invoke-interface {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldState;->shouldShowError(Z)Z

    move-result p0

    return p0
.end method

.method private static final visualTransformation$lambda$0(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Ljava/lang/String;Ljava/lang/Integer;)Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 1

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 102
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    .line 103
    invoke-virtual {p2, p1}, Lcom/stripe/android/model/CardBrand$Companion;->fromCardNumber(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object p2

    .line 104
    invoke-virtual {p2, p1}, Lcom/stripe/android/model/CardBrand;->getMaxLengthForCardNumber(Ljava/lang/String;)I

    move-result p2

    .line 106
    :goto_0
    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->determineVisualTransformation(Ljava/lang/String;I)Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v5, p6

    move/from16 v8, p7

    const-string v1, "field"

    move-object/from16 v9, p2

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "modifier"

    move-object/from16 v10, p3

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "hiddenIdentifiers"

    move-object/from16 v11, p4

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x6ad9afe4

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.ui.core.elements.DefaultCardNumberController.ComposeUI (CardNumberController.kt:367)"

    .line 368
    invoke-static {v1, v8, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 369
    :cond_0
    invoke-static {}, Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporterKt;->getLocalCardNumberCompletedEventReporter()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    const v2, 0x789c5f52

    .line 443
    const-string v3, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v5, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 369
    move-object v12, v1

    check-cast v12, Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;

    .line 370
    invoke-static {}, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporterKt;->getLocalCardBrandDisallowedReporter()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    .line 444
    invoke-static {v5, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 370
    move-object v13, v1

    check-cast v13, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    .line 371
    invoke-static {}, Lcom/stripe/android/ui/core/elements/events/AnalyticsEventReporterKt;->getLocalAnalyticsEventReporter()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    .line 445
    invoke-static {v5, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 371
    move-object v14, v1

    check-cast v14, Lcom/stripe/android/ui/core/elements/events/AnalyticsEventReporter;

    const/4 v15, 0x0

    new-array v1, v15, [Ljava/lang/Object;

    const v2, -0x6cc2681d

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 446
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 447
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_1

    .line 448
    new-instance v2, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda0;-><init>()V

    .line 449
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 374
    :cond_1
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function0;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v6, 0xc00

    const/4 v7, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/compose/runtime/MutableState;

    new-array v1, v15, [Ljava/lang/Object;

    const v2, -0x6cc25854

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 452
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 453
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_2

    .line 454
    new-instance v2, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda6;

    invoke-direct {v2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$$ExternalSyntheticLambda6;-><init>()V

    .line 455
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 375
    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v6, 0xc00

    const/4 v7, 0x6

    move-object v3, v4

    move-object v4, v2

    const/4 v2, 0x0

    move-object v15, v3

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v5

    move-object v7, v1

    check-cast v7, Landroidx/compose/runtime/MutableState;

    .line 379
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v2, -0x6cc24abd

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    .line 458
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    .line 459
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_3

    goto :goto_0

    :cond_3
    move-object v12, v1

    goto :goto_1

    .line 379
    :cond_4
    :goto_0
    new-instance v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;

    const/4 v5, 0x0

    move-object v2, v12

    move-object v3, v13

    move-object v4, v15

    move-object v12, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, v16

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 461
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 379
    :goto_1
    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v1, 0x6

    invoke-static {v12, v3, v6, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 402
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v3, -0x6cc1bf91

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    .line 464
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    .line 465
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_6

    .line 402
    :cond_5
    new-instance v3, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$2$1;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v7, v14, v4}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$2$1;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Landroidx/compose/runtime/MutableState;Lcom/stripe/android/ui/core/elements/events/AnalyticsEventReporter;Lkotlin/coroutines/Continuation;)V

    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 467
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 402
    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v2, v4, v6, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    and-int/lit16 v1, v8, 0x1ffe

    .line 428
    sget v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v1, v2

    const v2, 0xe000

    and-int/2addr v2, v8

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v8

    or-int v7, v1, v2

    move/from16 v1, p1

    move-object/from16 v5, p5

    move-object v2, v9

    move-object v3, v10

    move-object v4, v11

    .line 423
    invoke-super/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/CardNumberController;->ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public final determineSelectedBrand(Lcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/CardBrandFilter;Ljava/util/List;)Lcom/stripe/android/model/CardBrand;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/CardBrand;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;)",
            "Lcom/stripe/android/model/CardBrand;"
        }
    .end annotation

    const-string v0, "allChoices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferredBrands"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 345
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .line 438
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 439
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/model/CardBrand;

    .line 345
    invoke-interface {p3, v4}, Lcom/stripe/android/CardBrandFilter;->isAccepted(Lcom/stripe/android/model/CardBrand;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 439
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 440
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 347
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p3

    const/4 v2, 0x1

    if-ne p3, v2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-le p3, v2, :cond_2

    .line 348
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->single(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/CardBrand;

    return-object p1

    .line 351
    :cond_2
    sget-object p3, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    if-ne p1, p3, :cond_3

    goto :goto_1

    .line 352
    :cond_3
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    if-nez p1, :cond_4

    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    :cond_4
    :goto_1
    return-object p1

    .line 354
    :cond_5
    check-cast p4, Ljava/lang/Iterable;

    .line 441
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object p4, p3

    check-cast p4, Lcom/stripe/android/model/CardBrand;

    .line 354
    invoke-interface {p2, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_6

    goto :goto_2

    :cond_7
    const/4 p3, 0x0

    :goto_2
    check-cast p3, Lcom/stripe/android/model/CardBrand;

    if-nez p3, :cond_8

    .line 355
    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    return-object p1

    :cond_8
    return-object p3
.end method

.method public final getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    return-object v0
.end method

.method public getCapitalization-IUNYP9k()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->capitalization:I

    return v0
.end method

.method public getCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardBrandFlow:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getCardScanEnabled()Z
    .locals 1

    .line 172
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardScanEnabled:Z

    return v0
.end method

.method public getContentDescription()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->contentDescription:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getDebugLabel()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->debugLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getError()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation

    .line 296
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFieldState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation

    .line 282
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->fieldState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation

    .line 303
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getInitialValue()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->initialValue:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyboardType-PjHm6EE()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->keyboardType:I

    return v0
.end method

.method public getLabel()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->label:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->layoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    return-object v0
.end method

.method public getLoading()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 286
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->loading:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getSelectedCardBrandFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->selectedCardBrandFlow:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->showOptionalLabel:Z

    return v0
.end method

.method public getTrailingIcon()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/TextFieldIcon;",
            ">;"
        }
    .end annotation

    .line 199
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->trailingIcon:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getVisibleError()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 288
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->visibleError:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getVisualTransformation()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            ">;"
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public isComplete()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 301
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->mostRecentUserSelectedBrand:Lkotlinx/coroutines/flow/MutableStateFlow;

    sget-object v1, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onFocusChange(Z)V
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->convertFromRaw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    return-void
.end method

.method public onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;
    .locals 2

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->cardTextFieldConfig:Lcom/stripe/android/ui/core/elements/CardNumberConfig;

    invoke-virtual {v1, p1}, Lcom/stripe/android/ui/core/elements/CardNumberConfig;->filter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 317
    new-instance v0, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-direct {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    .line 318
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->accountRangeService:Lcom/stripe/android/cards/CardAccountRangeService;

    invoke-virtual {p1, v0}, Lcom/stripe/android/cards/CardAccountRangeService;->onCardNumberChanged(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V

    const/4 p1, 0x0

    return-object p1
.end method
