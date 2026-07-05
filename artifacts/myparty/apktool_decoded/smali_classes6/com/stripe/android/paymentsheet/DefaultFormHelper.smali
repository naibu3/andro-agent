.class public final Lcom/stripe/android/paymentsheet/DefaultFormHelper;
.super Ljava/lang/Object;
.source "DefaultFormHelper.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/FormHelper;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/DefaultFormHelper$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultFormHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultFormHelper.kt\ncom/stripe/android/paymentsheet/DefaultFormHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1#2:234\n1755#3,3:235\n*S KotlinDebug\n*F\n+ 1 DefaultFormHelper.kt\ncom/stripe/android/paymentsheet/DefaultFormHelper\n*L\n194#1:235,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 >2\u00020\u0001:\u0001>By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010+\u001a\u0008\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020!H\u0016J\u0014\u0010/\u001a\u0002002\n\u00101\u001a\u00060!j\u0002`%H\u0016J\u001a\u00102\u001a\u00020\u00102\u0008\u00103\u001a\u0004\u0018\u00010 2\u0006\u00104\u001a\u00020!H\u0016J\u001c\u00105\u001a\u0004\u0018\u0001062\u0008\u00103\u001a\u0004\u0018\u00010 2\u0006\u00104\u001a\u00020!H\u0016J\u001e\u00107\u001a\u00020\u00142\u0006\u00101\u001a\u00020!2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020-0,H\u0002J\u0014\u00109\u001a\u00020:2\n\u00101\u001a\u00060!j\u0002`%H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010.\u001a\u00020!H\u0002J\u0018\u0010=\u001a\u00020\u00102\u000e\u0010.\u001a\n\u0018\u00010!j\u0004\u0018\u0001`%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!0\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010&\u001a\n\u0018\u00010!j\u0004\u0018\u0001`%2\u000e\u0010$\u001a\n\u0018\u00010!j\u0004\u0018\u0001`%8B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*\u00a8\u0006?"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/DefaultFormHelper;",
        "Lcom/stripe/android/paymentsheet/FormHelper;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "linkInlineHandler",
        "Lcom/stripe/android/paymentsheet/LinkInlineHandler;",
        "cardAccountRangeRepositoryFactory",
        "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "newPaymentSelectionProvider",
        "Lkotlin/Function0;",
        "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;",
        "selectionUpdater",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "",
        "linkConfigurationCoordinator",
        "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
        "setAsDefaultMatchesSaveForFutureUse",
        "",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "autocompleteAddressInteractorFactory",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkConfigurationCoordinator;ZLcom/stripe/android/paymentsheet/analytics/EventReporter;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)V",
        "lastFormValues",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "",
        "paymentSelection",
        "Lkotlinx/coroutines/flow/Flow;",
        "value",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "previouslyCompletedForm",
        "getPreviouslyCompletedForm",
        "()Ljava/lang/String;",
        "setPreviouslyCompletedForm",
        "(Ljava/lang/String;)V",
        "formElementsForCode",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "code",
        "createFormArguments",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "paymentMethodCode",
        "onFormFieldValuesChanged",
        "formValues",
        "selectedPaymentMethodCode",
        "getPaymentMethodParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "requiresFormScreen",
        "formElements",
        "formTypeForCode",
        "Lcom/stripe/android/paymentsheet/FormHelper$FormType;",
        "supportedPaymentMethodForCode",
        "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
        "reportFieldCompleted",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/DefaultFormHelper$Companion;

.field public static final PREVIOUSLY_COMPLETED_PAYMENT_FORM:Ljava/lang/String; = "previously_completed_payment_form"


# instance fields
.field private final autocompleteAddressInteractorFactory:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

.field private final cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final lastFormValues:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

.field private final linkInlineHandler:Lcom/stripe/android/paymentsheet/LinkInlineHandler;

.field private final newPaymentSelectionProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

.field private final paymentSelection:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final selectionUpdater:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final setAsDefaultMatchesSaveForFutureUse:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->Companion:Lcom/stripe/android/paymentsheet/DefaultFormHelper$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkConfigurationCoordinator;ZLcom/stripe/android/paymentsheet/analytics/EventReporter;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lcom/stripe/android/paymentsheet/LinkInlineHandler;",
            "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/link/LinkConfigurationCoordinator;",
            "Z",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
            ")V"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkInlineHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newPaymentSelectionProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionUpdater"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 34
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->linkInlineHandler:Lcom/stripe/android/paymentsheet/LinkInlineHandler;

    .line 35
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    .line 36
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 37
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->newPaymentSelectionProvider:Lkotlin/jvm/functions/Function0;

    .line 38
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->selectionUpdater:Lkotlin/jvm/functions/Function1;

    .line 39
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    .line 40
    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->setAsDefaultMatchesSaveForFutureUse:Z

    .line 41
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 42
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 43
    iput-object p11, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->autocompleteAddressInteractorFactory:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

    const/4 p3, 0x7

    const/4 p4, 0x0

    const/4 p5, 0x0

    .line 95
    invoke-static {p4, p4, p5, p3, p5}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->lastFormValues:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 98
    check-cast p3, Lkotlinx/coroutines/flow/Flow;

    .line 99
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/LinkInlineHandler;->getLinkInlineState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    check-cast p2, Lkotlinx/coroutines/flow/Flow;

    .line 97
    new-instance p4, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;

    invoke-direct {p4, p0, p5}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$paymentSelection$1;-><init>(Lcom/stripe/android/paymentsheet/DefaultFormHelper;Lkotlin/coroutines/Continuation;)V

    check-cast p4, Lkotlin/jvm/functions/Function3;

    invoke-static {p3, p2, p4}, Lkotlinx/coroutines/flow/FlowKt;->combine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->paymentSelection:Lkotlinx/coroutines/flow/Flow;

    .line 137
    new-instance p2, Lcom/stripe/android/paymentsheet/DefaultFormHelper$1;

    invoke-direct {p2, p0, p5}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$1;-><init>(Lcom/stripe/android/paymentsheet/DefaultFormHelper;Lkotlin/coroutines/Continuation;)V

    move-object p9, p2

    check-cast p9, Lkotlin/jvm/functions/Function2;

    const/4 p10, 0x3

    const/4 p11, 0x0

    const/4 p7, 0x0

    const/4 p8, 0x0

    move-object p6, p1

    invoke-static/range {p6 .. p11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getLastFormValues$p(Lcom/stripe/android/paymentsheet/DefaultFormHelper;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->lastFormValues:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method

.method public static final synthetic access$getPaymentMethodMetadata$p(Lcom/stripe/android/paymentsheet/DefaultFormHelper;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    return-object p0
.end method

.method public static final synthetic access$getPaymentSelection$p(Lcom/stripe/android/paymentsheet/DefaultFormHelper;)Lkotlinx/coroutines/flow/Flow;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->paymentSelection:Lkotlinx/coroutines/flow/Flow;

    return-object p0
.end method

.method public static final synthetic access$getSelectionUpdater$p(Lcom/stripe/android/paymentsheet/DefaultFormHelper;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->selectionUpdater:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$reportFieldCompleted(Lcom/stripe/android/paymentsheet/DefaultFormHelper;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->reportFieldCompleted(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$supportedPaymentMethodForCode(Lcom/stripe/android/paymentsheet/DefaultFormHelper;Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p0

    return-object p0
.end method

.method private final getPreviouslyCompletedForm()Ljava/lang/String;
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_completed_payment_form"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final reportFieldCompleted(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 219
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->formTypeForCode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/paymentsheet/FormHelper$FormType$UserInteractionRequired;->INSTANCE:Lcom/stripe/android/paymentsheet/FormHelper$FormType$UserInteractionRequired;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 227
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->getPreviouslyCompletedForm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 228
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentMethodFormCompleted(Ljava/lang/String;)V

    .line 229
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->setPreviouslyCompletedForm(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final requiresFormScreen(Ljava/lang/String;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;)Z"
        }
    .end annotation

    .line 194
    check-cast p2, Ljava/lang/Iterable;

    .line 235
    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 236
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/FormElement;

    .line 194
    invoke-interface {v0}, Lcom/stripe/android/uicore/elements/FormElement;->getAllowsUserInteraction()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 196
    :cond_2
    :goto_0
    sget-object p2, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p2, p2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 197
    sget-object p2, Lcom/stripe/android/model/PaymentMethod$Type;->Link:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p2, p2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method private final setPreviouslyCompletedForm(Ljava/lang/String;)V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_completed_payment_form"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {v0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 2

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    sget-object v0, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;

    .line 173
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 171
    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->create(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object p1

    return-object p1
.end method

.method public formElementsForCode(Ljava/lang/String;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->newPaymentSelectionProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 148
    :goto_0
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 150
    new-instance v3, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;

    .line 151
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->cardAccountRangeRepositoryFactory:Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;

    .line 152
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->linkConfigurationCoordinator:Lcom/stripe/android/link/LinkConfigurationCoordinator;

    .line 153
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->linkInlineHandler:Lcom/stripe/android/paymentsheet/LinkInlineHandler;

    .line 154
    new-instance v7, Lcom/stripe/android/paymentsheet/DefaultFormHelper$formElementsForCode$1;

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->linkInlineHandler:Lcom/stripe/android/paymentsheet/LinkInlineHandler;

    invoke-direct {v7, v8}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$formElementsForCode$1;-><init>(Ljava/lang/Object;)V

    check-cast v7, Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    .line 155
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 156
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;->getPaymentMethodOptionParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v9

    goto :goto_2

    :cond_2
    move-object v9, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 157
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;->getPaymentMethodExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object v10

    goto :goto_3

    :cond_3
    move-object v10, v1

    :goto_3
    if-eqz v0, :cond_4

    .line 158
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v0

    goto :goto_4

    :cond_4
    move-object v0, v1

    .line 159
    :goto_4
    instance-of v11, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-eqz v11, :cond_5

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getInput()Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object v1

    :cond_5
    move-object v11, v1

    .line 162
    iget-boolean v12, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->setAsDefaultMatchesSaveForFutureUse:Z

    .line 163
    iget-object v13, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->autocompleteAddressInteractorFactory:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;

    .line 150
    invoke-direct/range {v3 .. v13}, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;-><init>(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/link/ui/inline/UserInput;ZLcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)V

    check-cast v3, Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;

    .line 148
    invoke-virtual {v2, p1, v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->formElementsForCode(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_6

    .line 165
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_6
    return-object p1
.end method

.method public formTypeForCode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;
    .locals 1

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->formElementsForCode(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 202
    invoke-direct {p0, p1, v0}, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->requiresFormScreen(Ljava/lang/String;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 203
    sget-object p1, Lcom/stripe/android/paymentsheet/FormHelper$FormType$UserInteractionRequired;->INSTANCE:Lcom/stripe/android/paymentsheet/FormHelper$FormType$UserInteractionRequired;

    check-cast p1, Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    return-object p1

    .line 205
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/FormElement;

    invoke-interface {v0}, Lcom/stripe/android/uicore/elements/FormElement;->getMandateText()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    .line 207
    sget-object p1, Lcom/stripe/android/paymentsheet/FormHelper$FormType$Empty;->INSTANCE:Lcom/stripe/android/paymentsheet/FormHelper$FormType$Empty;

    check-cast p1, Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    return-object p1

    .line 209
    :cond_3
    new-instance p1, Lcom/stripe/android/paymentsheet/FormHelper$FormType$MandateOnly;

    invoke-direct {p1, v0}, Lcom/stripe/android/paymentsheet/FormHelper$FormType$MandateOnly;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    check-cast p1, Lcom/stripe/android/paymentsheet/FormHelper$FormType;

    return-object p1
.end method

.method public getPaymentMethodParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 1

    const-string v0, "selectedPaymentMethodCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 189
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 187
    invoke-static {p1, p2, v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentMethodCreateParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V
    .locals 7

    const-string v0, "selectedPaymentMethodCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/DefaultFormHelper;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/stripe/android/paymentsheet/DefaultFormHelper$onFormFieldValuesChanged$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, p2, v2}, Lcom/stripe/android/paymentsheet/DefaultFormHelper$onFormFieldValuesChanged$1;-><init>(Lcom/stripe/android/paymentsheet/DefaultFormHelper;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method
