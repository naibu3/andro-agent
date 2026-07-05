.class public final Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;
.super Ljava/lang/Object;
.source "UpdatePaymentMethodInteractor.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;,
        Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUpdatePaymentMethodInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatePaymentMethodInteractor.kt\ncom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,383:1\n230#2,5:384\n1557#3:389\n1628#3,3:390\n774#3:393\n865#3,2:394\n*S KotlinDebug\n*F\n+ 1 UpdatePaymentMethodInteractor.kt\ncom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor\n*L\n338#1:384,5\n354#1:389\n354#1:390,3\n356#1:393\n356#1:394,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 v2\u00020\u0001:\u0002uvB\u00bb\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u00127\u0010\u000e\u001a3\u0008\u0001\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fj\u0002`\u0017\u0012P\u0010\u0018\u001aL\u0008\u0001\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0013\u0012\u00110\u001a\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u001b\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u001c0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019j\u0002`\u001d\u0012;\u0010\u001e\u001a7\u0008\u0001\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0\u001c0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fj\u0002` \u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\"\u0012\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001f0%\u0012\u0008\u0008\u0002\u0010&\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010X\u001a\u00020S2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0010\u0010[\u001a\u00020S2\u0006\u0010Y\u001a\u00020\\H\u0002J\u0012\u0010]\u001a\u00020\u001f2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010c\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020eH\u0016J\u0008\u0010f\u001a\u00020\u001fH\u0002J\u0008\u0010g\u001a\u00020\u001fH\u0002J\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001cH\u0082@\u00a2\u0006\u0004\u0008i\u0010jJ\u0018\u0010k\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001cH\u0082@\u00a2\u0006\u0004\u0008l\u0010jJ(\u0010m\u001a\u00020n2\u000e\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c2\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001cH\u0002J\u0010\u0010q\u001a\u00020\u001f2\u0006\u0010r\u001a\u00020\u0003H\u0002J\u0008\u0010s\u001a\u00020\u0003H\u0002J\n\u0010t\u001a\u0004\u0018\u00010<H\u0002J\u0008\u0010A\u001a\u00020\u0003H\u0002R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0014\u0010\u0007\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010+R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010+R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010+RA\u0010\u000e\u001a3\u0008\u0001\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fj\u0002`\u0017X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00104RZ\u0010\u0018\u001aL\u0008\u0001\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0013\u0012\u00110\u001a\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u001b\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u001c0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019j\u0002`\u001dX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00105RE\u0010\u001e\u001a7\u0008\u0001\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0\u001c0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000fj\u0002` X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00104R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001f0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u000e\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0;X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u0008\u0012\u0004\u0012\u00020>0;X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u00030;X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0;X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010+R\u0014\u0010C\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010+R\u0016\u0010D\u001a\u0004\u0018\u00010<X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010FR\u0014\u0010G\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010+R\u0014\u0010H\u001a\u00020IX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010KR\u0014\u0010L\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010+R\u0014\u0010N\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010+R\u0014\u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u00030QX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010R\u001a\u00020S8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008T\u0010UR\u0014\u0010^\u001a\u0008\u0012\u0004\u0012\u00020_0QX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010`\u001a\u0008\u0012\u0004\u0012\u00020_0QX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008a\u0010b\u00a8\u0006w"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;",
        "isLiveMode",
        "",
        "canRemove",
        "displayableSavedPaymentMethod",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "addressCollectionMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;",
        "canUpdateFullPaymentMethodDetails",
        "isDefaultPaymentMethod",
        "shouldShowSetAsDefaultCheckbox",
        "removeExecutor",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "Lkotlin/ParameterName;",
        "name",
        "paymentMethod",
        "Lkotlin/coroutines/Continuation;",
        "",
        "",
        "Lcom/stripe/android/paymentsheet/ui/PaymentMethodRemoveOperation;",
        "updatePaymentMethodExecutor",
        "Lkotlin/Function3;",
        "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "cardUpdateParams",
        "Lkotlin/Result;",
        "Lcom/stripe/android/paymentsheet/ui/UpdateCardPaymentMethodOperation;",
        "setDefaultPaymentMethodExecutor",
        "",
        "Lcom/stripe/android/paymentsheet/ui/PaymentMethodSetAsDefaultOperation;",
        "onBrandChoiceSelected",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/model/CardBrand;",
        "onUpdateSuccess",
        "Lkotlin/Function0;",
        "editCardDetailsInteractorFactory",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;",
        "<init>",
        "(ZZLcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;)V",
        "getCanRemove",
        "()Z",
        "getDisplayableSavedPaymentMethod",
        "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "getCardBrandFilter",
        "()Lcom/stripe/android/CardBrandFilter;",
        "getAddressCollectionMode",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;",
        "getCanUpdateFullPaymentMethodDetails",
        "getShouldShowSetAsDefaultCheckbox",
        "Lkotlin/jvm/functions/Function2;",
        "Lkotlin/jvm/functions/Function3;",
        "getEditCardDetailsInteractorFactory",
        "()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "error",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "status",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;",
        "initialSetAsDefaultCheckedValue",
        "setAsDefaultCheckboxChecked",
        "hasValidBrandChoices",
        "getHasValidBrandChoices",
        "isExpiredCard",
        "screenTitle",
        "getScreenTitle",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "isModifiablePaymentMethod",
        "topBarState",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "getTopBarState",
        "()Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "setAsDefaultCheckboxEnabled",
        "getSetAsDefaultCheckboxEnabled",
        "shouldShowSaveButton",
        "getShouldShowSaveButton",
        "_setAsDefaultValueChanged",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "editCardDetailsInteractor",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
        "getEditCardDetailsInteractor",
        "()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
        "editCardDetailsInteractor$delegate",
        "Lkotlin/Lazy;",
        "createEditCardDetailsInteractorForCard",
        "savedPaymentMethodCard",
        "Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;",
        "createEditCardDetailsInteractorForLink",
        "Lcom/stripe/android/model/LinkPaymentDetails$Card;",
        "onCardUpdateParamsChanged",
        "_state",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
        "state",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "handleViewAction",
        "viewAction",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;",
        "removePaymentMethod",
        "savePaymentMethod",
        "maybeUpdateCard",
        "maybeUpdateCard-CmtIpJM",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "maybeSetDefaultPaymentMethod",
        "maybeSetDefaultPaymentMethod-CmtIpJM",
        "getUpdateResult",
        "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;",
        "updateCardBrandResult",
        "setDefaultPaymentMethodResult",
        "onSetAsDefaultCheckboxChanged",
        "isChecked",
        "paymentMethodIsExpiredCard",
        "getInitialError",
        "UpdateResult",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;

.field private static final setDefaultPaymentMethodErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

.field private static final updateCardBrandErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

.field private static final updatesFailedErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;


# instance fields
.field private final _setAsDefaultValueChanged:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
            ">;"
        }
    .end annotation
.end field

.field private final addressCollectionMode:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

.field private final canRemove:Z

.field private final canUpdateFullPaymentMethodDetails:Z

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final cardUpdateParams:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final displayableSavedPaymentMethod:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

.field private final editCardDetailsInteractor$delegate:Lkotlin/Lazy;

.field private final editCardDetailsInteractorFactory:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;

.field private final error:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final hasValidBrandChoices:Z

.field private final initialSetAsDefaultCheckedValue:Z

.field private final isDefaultPaymentMethod:Z

.field private final isExpiredCard:Z

.field private final onBrandChoiceSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onUpdateSuccess:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final removeExecutor:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final screenTitle:Lcom/stripe/android/core/strings/ResolvableString;

.field private final setAsDefaultCheckboxChecked:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final setAsDefaultCheckboxEnabled:Z

.field private final setDefaultPaymentMethodExecutor:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldShowSaveButton:Z

.field private final shouldShowSetAsDefaultCheckbox:Z

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
            ">;"
        }
    .end annotation
.end field

.field private final status:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;",
            ">;"
        }
    .end annotation
.end field

.field private final topBarState:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

.field private final updatePaymentMethodExecutor:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$6v4Ja6zFnG5bCHu5UN9coi4W-IU(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZLcom/stripe/android/paymentsheet/CardUpdateParams;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->_state$lambda$4(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZLcom/stripe/android/paymentsheet/CardUpdateParams;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Iz0P9-kgNMX0ccB4a43bU62-yKQ(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->editCardDetailsInteractor_delegate$lambda$1(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$M5e8QXfSDW1K_K2IGz8yvY1IzZQ(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->createEditCardDetailsInteractorForLink$lambda$3(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UB5rSDazD0GoSWD72NFX7HShaKc(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Z)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->_setAsDefaultValueChanged$lambda$0(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$vpniN_63RkXgY0pM4Gi1XppR5fQ(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->createEditCardDetailsInteractorForCard$lambda$2(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->Companion:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->$stable:I

    .line 370
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_set_default_payment_method_failed_error_message:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setDefaultPaymentMethodErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    .line 374
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_set_default_payment_method_failed_error_message:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->updateCardBrandErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    .line 378
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_card_updates_failed_error_message:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->updatesFailedErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-void
.end method

.method public constructor <init>(ZZLcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;",
            "ZZZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Throwable;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "-",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;",
            ")V"
        }
    .end annotation

    const-string v0, "displayableSavedPaymentMethod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressCollectionMode"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeExecutor"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatePaymentMethodExecutor"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setDefaultPaymentMethodExecutor"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBrandChoiceSelected"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUpdateSuccess"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editCardDetailsInteractorFactory"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->canRemove:Z

    .line 106
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->displayableSavedPaymentMethod:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    .line 107
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    .line 108
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->addressCollectionMode:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    .line 109
    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->canUpdateFullPaymentMethodDetails:Z

    .line 110
    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->isDefaultPaymentMethod:Z

    .line 111
    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->shouldShowSetAsDefaultCheckbox:Z

    .line 112
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->removeExecutor:Lkotlin/jvm/functions/Function2;

    .line 113
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->updatePaymentMethodExecutor:Lkotlin/jvm/functions/Function3;

    .line 114
    iput-object p11, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setDefaultPaymentMethodExecutor:Lkotlin/jvm/functions/Function2;

    .line 115
    iput-object p12, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onBrandChoiceSelected:Lkotlin/jvm/functions/Function1;

    .line 116
    iput-object p13, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onUpdateSuccess:Lkotlin/jvm/functions/Function0;

    .line 117
    iput-object p14, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->editCardDetailsInteractorFactory:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;

    .line 120
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, 0x1

    invoke-static {p3, p4, p3}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    move-result-object p5

    check-cast p5, Lkotlin/coroutines/CoroutineContext;

    invoke-virtual {p2, p5}, Lkotlinx/coroutines/MainCoroutineDispatcher;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 121
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getInitialError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->error:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 122
    sget-object p5, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;->Idle:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    invoke-static {p5}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->status:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 123
    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->initialSetAsDefaultCheckedValue:Z

    .line 124
    invoke-static {p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p6

    invoke-static {p6}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p6

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setAsDefaultCheckboxChecked:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 125
    invoke-static {p3}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->cardUpdateParams:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 127
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->hasValidBrandChoices()Z

    move-result p8

    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->hasValidBrandChoices:Z

    .line 128
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->paymentMethodIsExpiredCard()Z

    move-result p8

    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->isExpiredCard:Z

    .line 129
    sget-object p8, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->Companion:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;

    .line 130
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object p9

    .line 129
    invoke-virtual {p8, p9}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;->screenTitle(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p8

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->screenTitle:Lcom/stripe/android/core/strings/ResolvableString;

    .line 135
    sget-object p8, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;

    .line 137
    sget-object p9, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;

    check-cast p9, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;

    .line 135
    invoke-virtual {p8, p1, p9}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->create(ZLcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->topBarState:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    xor-int/lit8 p1, p7, 0x1

    .line 139
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setAsDefaultCheckboxEnabled:Z

    .line 141
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->isModifiablePaymentMethod()Z

    move-result p1

    if-nez p1, :cond_1

    .line 142
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getShouldShowSetAsDefaultCheckbox()Z

    move-result p1

    if-eqz p1, :cond_0

    if-nez p7, :cond_0

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    .line 141
    :cond_1
    :goto_0
    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->shouldShowSaveButton:Z

    .line 144
    move-object p1, p6

    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p4, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda0;

    invoke-direct {p4, p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)V

    invoke-static {p1, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p10

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->_setAsDefaultValueChanged:Lkotlinx/coroutines/flow/StateFlow;

    .line 147
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->editCardDetailsInteractor$delegate:Lkotlin/Lazy;

    .line 226
    move-object p7, p2

    check-cast p7, Lkotlinx/coroutines/flow/StateFlow;

    .line 227
    move-object p8, p5

    check-cast p8, Lkotlinx/coroutines/flow/StateFlow;

    .line 228
    move-object p9, p6

    check-cast p9, Lkotlinx/coroutines/flow/StateFlow;

    .line 230
    move-object p11, p3

    check-cast p11, Lkotlinx/coroutines/flow/StateFlow;

    .line 225
    new-instance p12, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda2;

    invoke-direct {p12, p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)V

    invoke-static/range {p7 .. p12}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->_state:Lkotlinx/coroutines/flow/StateFlow;

    .line 246
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public synthetic constructor <init>(ZZLcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p15

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    .line 118
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;-><init>()V

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;

    move-object v15, v0

    goto :goto_0

    :cond_0
    move-object/from16 v15, p14

    :goto_0
    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    .line 103
    invoke-direct/range {v1 .. v15}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;-><init>(ZZLcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;)V

    return-void
.end method

.method private static final _setAsDefaultValueChanged$lambda$0(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Z)Z
    .locals 0

    .line 145
    iget-boolean p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->initialSetAsDefaultCheckedValue:Z

    if-eq p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final _state$lambda$4(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZLcom/stripe/android/paymentsheet/CardUpdateParams;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;
    .locals 2

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p4, :cond_0

    if-eqz p5, :cond_1

    .line 237
    :cond_0
    sget-object p4, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;->Idle:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    if-ne p2, p4, :cond_1

    move p4, v0

    goto :goto_0

    :cond_1
    move p4, v1

    .line 243
    :goto_0
    iget-boolean p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->isDefaultPaymentMethod:Z

    if-nez p0, :cond_3

    if-eqz p3, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    .line 239
    :cond_3
    :goto_1
    new-instance p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    invoke-direct {p0, p1, p2, v0, p4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZ)V

    return-object p0
.end method

.method public static final synthetic access$getError$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->error:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getInitialError(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getInitialError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOnUpdateSuccess$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onUpdateSuccess:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$getRemoveExecutor$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlin/jvm/functions/Function2;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->removeExecutor:Lkotlin/jvm/functions/Function2;

    return-object p0
.end method

.method public static final synthetic access$getSetDefaultPaymentMethodErrorMessage$cp()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 103
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setDefaultPaymentMethodErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public static final synthetic access$getStatus$p(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 103
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->status:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getUpdateCardBrandErrorMessage$cp()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 103
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->updateCardBrandErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public static final synthetic access$getUpdateResult(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lkotlin/Result;Lkotlin/Result;)Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getUpdateResult(Lkotlin/Result;Lkotlin/Result;)Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUpdatesFailedErrorMessage$cp()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 103
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->updatesFailedErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public static final synthetic access$maybeSetDefaultPaymentMethod-CmtIpJM(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->maybeSetDefaultPaymentMethod-CmtIpJM(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$maybeUpdateCard-CmtIpJM(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->maybeUpdateCard-CmtIpJM(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createEditCardDetailsInteractorForCard(Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
    .locals 20

    move-object/from16 v0, p0

    .line 168
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v1

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getCanUpdateFullPaymentMethodDetails()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->isModifiable(Z)Z

    move-result v1

    .line 169
    sget-object v2, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->Companion:Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->getCard()Lcom/stripe/android/model/PaymentMethod$Card;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;->create(Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    move-result-object v9

    .line 170
    new-instance v7, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    .line 171
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    .line 172
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->canChangeCbc()Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    if-eqz v1, :cond_1

    .line 173
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getCanUpdateFullPaymentMethodDetails()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    .line 170
    :goto_1
    invoke-direct {v7, v2, v5, v3}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;-><init>(Lcom/stripe/android/CardBrandFilter;ZZ)V

    .line 175
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->editCardDetailsInteractorFactory:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;

    .line 181
    iget-object v6, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 182
    iget-object v11, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onBrandChoiceSelected:Lkotlin/jvm/functions/Function1;

    .line 185
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getAddressCollectionMode()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v16

    .line 186
    sget-object v15, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    .line 187
    sget-object v14, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    .line 188
    sget-object v13, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    .line 184
    new-instance v10, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    const/16 v18, 0x10

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-object v12, v10

    invoke-direct/range {v12 .. v19}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 175
    new-instance v12, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda4;

    invoke-direct {v12, v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)V

    const/4 v8, 0x1

    invoke-interface/range {v5 .. v12}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;->create(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object v1

    return-object v1
.end method

.method private static final createEditCardDetailsInteractorForCard$lambda$2(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;
    .locals 0

    .line 179
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onCardUpdateParamsChanged(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V

    .line 180
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final createEditCardDetailsInteractorForLink(Lcom/stripe/android/model/LinkPaymentDetails$Card;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
    .locals 17

    move-object/from16 v0, p0

    .line 197
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->Companion:Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;->create(Lcom/stripe/android/model/LinkPaymentDetails$Card;)Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    move-result-object v6

    .line 198
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    .line 199
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;

    move-result-object v1

    const/4 v2, 0x0

    .line 198
    invoke-direct {v4, v1, v2, v2}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;-><init>(Lcom/stripe/android/CardBrandFilter;ZZ)V

    .line 203
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->editCardDetailsInteractorFactory:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;

    .line 209
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 210
    iget-object v8, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onBrandChoiceSelected:Lkotlin/jvm/functions/Function1;

    .line 212
    sget-object v13, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    .line 213
    sget-object v12, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    .line 214
    sget-object v11, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    .line 215
    sget-object v10, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;

    .line 211
    new-instance v7, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v9, v7

    invoke-direct/range {v9 .. v16}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 203
    new-instance v9, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda3;

    invoke-direct {v9, v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)V

    const/4 v5, 0x1

    invoke-interface/range {v2 .. v9}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;->create(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object v1

    return-object v1
.end method

.method private static final createEditCardDetailsInteractorForLink$lambda$3(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lkotlin/Unit;
    .locals 0

    .line 207
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onCardUpdateParamsChanged(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V

    .line 208
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final editCardDetailsInteractor_delegate$lambda$1(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
    .locals 2

    .line 148
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/SavedPaymentMethod;

    move-result-object v0

    .line 149
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    if-eqz v1, :cond_0

    .line 150
    check-cast v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->createEditCardDetailsInteractorForCard(Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object p0

    return-object p0

    .line 152
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;

    if-eqz v1, :cond_3

    .line 153
    check-cast v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;->getPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 155
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->createEditCardDetailsInteractorForLink(Lcom/stripe/android/model/LinkPaymentDetails$Card;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object p0

    return-object p0

    .line 154
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Link payment method is not a card"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 158
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 159
    const-string v0, "Card or Link payment method required for creating EditCardDetailsInteractor"

    .line 158
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final getInitialError()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 346
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->paymentMethodIsExpiredCard()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->isModifiablePaymentMethod()Z

    move-result v0

    if-nez v0, :cond_0

    .line 347
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->Companion:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;->getExpiredErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final getUpdateResult(Lkotlin/Result;Lkotlin/Result;)Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;"
        }
    .end annotation

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 323
    sget-object p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$NoUpdatesMade;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$NoUpdatesMade;

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 326
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-ne v1, v0, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-ne v1, v0, :cond_1

    .line 327
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;

    sget-object p2, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->updatesFailedErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;

    return-object p1

    :cond_1
    if-eqz p1, :cond_2

    .line 328
    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v0, :cond_2

    .line 329
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;

    sget-object p2, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->updateCardBrandErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;

    return-object p1

    :cond_2
    if-eqz p2, :cond_3

    .line 330
    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v0, :cond_3

    .line 331
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;

    sget-object p2, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setDefaultPaymentMethodErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Error;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;

    return-object p1

    .line 333
    :cond_3
    sget-object p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Success;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult$Success;

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$UpdateResult;

    return-object p1
.end method

.method private final hasValidBrandChoices()Z
    .locals 5

    .line 354
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Card;->networks:Lcom/stripe/android/model/PaymentMethod$Card$Networks;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod$Card$Networks;->getAvailable()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    .line 389
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 390
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 391
    check-cast v2, Ljava/lang/String;

    .line 355
    sget-object v3, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {v3, v2}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v2

    .line 391
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 392
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 354
    check-cast v1, Ljava/lang/Iterable;

    .line 393
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 394
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/model/CardBrand;

    .line 356
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;

    move-result-object v4

    invoke-interface {v4, v3}, Lcom/stripe/android/CardBrandFilter;->isAccepted(Lcom/stripe/android/model/CardBrand;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 394
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 395
    :cond_2
    check-cast v0, Ljava/util/List;

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 357
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_3

    :cond_4
    move v0, v1

    :goto_3
    const/4 v2, 0x1

    if-le v0, v2, :cond_5

    return v2

    :cond_5
    return v1
.end method

.method private final maybeSetDefaultPaymentMethod-CmtIpJM(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 311
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->_setAsDefaultValueChanged:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setAsDefaultCheckboxChecked:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 312
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setDefaultPaymentMethodExecutor:Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Lkotlin/Result;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final maybeUpdateCard-CmtIpJM(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 296
    iget v2, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 297
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->cardUpdateParams:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/CardUpdateParams;

    if-eqz p1, :cond_5

    .line 299
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->updatePaymentMethodExecutor:Lkotlin/jvm/functions/Function3;

    .line 300
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v5

    .line 299
    iput-object p0, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$maybeUpdateCard$1;->label:I

    invoke-interface {v2, v5, p1, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    .line 302
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 303
    iget-object v0, v0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->cardUpdateParams:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 302
    :cond_4
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v3
.end method

.method private final onCardUpdateParamsChanged(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->cardUpdateParams:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final onSetAsDefaultCheckboxChanged(Z)V
    .locals 3

    .line 338
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setAsDefaultCheckboxChecked:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 385
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 386
    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 338
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 387
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final paymentMethodIsExpiredCard()Z
    .locals 2

    .line 342
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/SavedPaymentMethod;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;->isExpired()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private final removePaymentMethod()V
    .locals 6

    .line 262
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$removePaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final savePaymentMethod()V
    .locals 6

    .line 274
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$savePaymentMethod$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor$savePaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;Lkotlin/coroutines/Continuation;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public getAddressCollectionMode()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->addressCollectionMode:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    return-object v0
.end method

.method public getCanRemove()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->canRemove:Z

    return v0
.end method

.method public getCanUpdateFullPaymentMethodDetails()Z
    .locals 1

    .line 109
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->canUpdateFullPaymentMethodDetails:Z

    return v0
.end method

.method public getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    return-object v0
.end method

.method public getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->displayableSavedPaymentMethod:Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    return-object v0
.end method

.method public getEditCardDetailsInteractor()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->editCardDetailsInteractor$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    return-object v0
.end method

.method public final getEditCardDetailsInteractorFactory()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->editCardDetailsInteractorFactory:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$Factory;

    return-object v0
.end method

.method public getHasValidBrandChoices()Z
    .locals 1

    .line 127
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->hasValidBrandChoices:Z

    return v0
.end method

.method public getScreenTitle()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->screenTitle:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public getSetAsDefaultCheckboxEnabled()Z
    .locals 1

    .line 139
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->setAsDefaultCheckboxEnabled:Z

    return v0
.end method

.method public getShouldShowSaveButton()Z
    .locals 1

    .line 141
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->shouldShowSaveButton:Z

    return v0
.end method

.method public getShouldShowSetAsDefaultCheckbox()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->shouldShowSetAsDefaultCheckbox:Z

    return v0
.end method

.method public getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
            ">;"
        }
    .end annotation

    .line 246
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getTopBarState()Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->topBarState:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    return-object v0
.end method

.method public handleViewAction(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;)V
    .locals 1

    const-string v0, "viewAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$RemovePaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$RemovePaymentMethod;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->removePaymentMethod()V

    return-void

    .line 251
    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SaveButtonPressed;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SaveButtonPressed;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->savePaymentMethod()V

    return-void

    .line 252
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;

    if-eqz v0, :cond_2

    .line 253
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$SetAsDefaultCheckboxChanged;->isChecked()Z

    move-result p1

    .line 252
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onSetAsDefaultCheckboxChanged(Z)V

    return-void

    .line 255
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$CardUpdateParamsChanged;

    if-eqz v0, :cond_3

    .line 256
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$CardUpdateParamsChanged;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction$CardUpdateParamsChanged;->getCardUpdateParams()Lcom/stripe/android/paymentsheet/CardUpdateParams;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->onCardUpdateParamsChanged(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V

    return-void

    .line 249
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final isDefaultPaymentMethod()Z
    .locals 1

    .line 110
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->isDefaultPaymentMethod:Z

    return v0
.end method

.method public isExpiredCard()Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->isExpiredCard:Z

    return v0
.end method

.method public isModifiablePaymentMethod()Z
    .locals 2

    .line 133
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultUpdatePaymentMethodInteractor;->getCanUpdateFullPaymentMethodDetails()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->isModifiable(Z)Z

    move-result v0

    return v0
.end method
