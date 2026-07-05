.class public final Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;
.super Ljava/lang/Object;
.source "EditCardDetailsInteractor.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEditCardDetailsInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCardDetailsInteractor.kt\ncom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n230#2,5:395\n230#2,5:400\n*S KotlinDebug\n*F\n+ 1 EditCardDetailsInteractor.kt\ncom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor\n*L\n276#1:395,5\n286#1:400,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u00015Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001e\u0010\"\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010#\u001a\u00020\t2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010$\u001a\u00020\t2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u000c\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020.H\u0016J\u000c\u0010/\u001a\u00020\u0018*\u00020\u0007H\u0002J\u000c\u00100\u001a\u00020&*\u00020\u0007H\u0002J\u000c\u00101\u001a\u000202*\u00020\u0007H\u0002J\n\u00103\u001a\u0004\u0018\u00010\u001cH\u0002J\u001c\u00104\u001a\u00020\u001f2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!\u00a8\u00066"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
        "payload",
        "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "cardEditConfiguration",
        "Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;",
        "requiresModification",
        "",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "onBrandChoiceChanged",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/model/CardBrand;",
        "",
        "Lcom/stripe/android/paymentsheet/ui/CardBrandCallback;",
        "onCardUpdateParamsChanged",
        "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "Lcom/stripe/android/paymentsheet/ui/CardUpdateParamsCallback;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "cardDetailsEntry",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;",
        "billingDetailsEntry",
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;",
        "billingDetailsForm",
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "newCardUpdateParams",
        "hasCardDetailsChanged",
        "hasBillingDetailsChanged",
        "cardBrandChoice",
        "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;",
        "onDateChanged",
        "text",
        "",
        "onBillingAddressFormChanged",
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;",
        "handleViewAction",
        "viewAction",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction;",
        "buildDefaultCardEntry",
        "defaultCardBrandChoice",
        "defaultExpiryDateState",
        "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;",
        "defaultBillingDetailsForm",
        "uiState",
        "Factory",
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
.field private final billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

.field private final billingDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final billingDetailsForm:Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;

.field private final cardDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final onBrandChoiceChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onCardUpdateParamsChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

.field private final requiresModification:Z

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
            "Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;",
            "Z",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBrandChoiceChanged"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCardUpdateParamsChanged"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    .line 193
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 194
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    .line 198
    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->requiresModification:Z

    .line 199
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 200
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->onBrandChoiceChanged:Lkotlin/jvm/functions/Function1;

    .line 201
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->onCardUpdateParamsChanged:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    .line 204
    invoke-direct {p0, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->buildDefaultCardEntry(Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;)Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    .line 203
    :goto_0
    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 206
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 207
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->defaultBillingDetailsForm()Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsForm:Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;

    .line 209
    move-object p4, p2

    check-cast p4, Lkotlinx/coroutines/flow/Flow;

    new-instance p6, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$state$1;

    invoke-direct {p6, p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$state$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;Lkotlin/coroutines/Continuation;)V

    check-cast p6, Lkotlin/jvm/functions/Function2;

    invoke-static {p4, p6}, Lkotlinx/coroutines/flow/FlowKt;->mapLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p4

    .line 216
    sget-object p6, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    invoke-virtual {p6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getEagerly()Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object p6

    .line 218
    invoke-interface {p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    .line 217
    invoke-direct {p0, p2, p3}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->uiState(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;

    move-result-object p2

    .line 214
    invoke-static {p4, p5, p6, p2}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 224
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance p2, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$1;

    invoke-direct {p2, p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p5

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getBillingDetailsEntry$p(Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 191
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getBillingDetailsForm$p(Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;)Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;
    .locals 0

    .line 191
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsForm:Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;

    return-object p0
.end method

.method public static final synthetic access$getCardDetailsEntry$p(Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 191
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$getOnCardUpdateParamsChanged$p(Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 191
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->onCardUpdateParamsChanged:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$newCardUpdateParams(Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Lcom/stripe/android/paymentsheet/CardUpdateParams;
    .locals 0

    .line 191
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->newCardUpdateParams(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Lcom/stripe/android/paymentsheet/CardUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$uiState(Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;
    .locals 0

    .line 191
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->uiState(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method private final buildDefaultCardEntry(Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;)Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;
    .locals 2

    .line 315
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    .line 316
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->defaultCardBrandChoice(Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;)Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object v1

    .line 317
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->defaultExpiryDateState(Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object p1

    .line 315
    invoke-direct {v0, v1, p1}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;-><init>(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;)V

    return-object v0
.end method

.method private final defaultBillingDetailsForm()Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;
    .locals 7

    .line 333
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;->getAreExpiryDateAndAddressModificationSupported()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 334
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v0

    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->Never:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    if-eq v0, v3, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    .line 335
    :goto_1
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsName$paymentsheet_release()Z

    move-result v3

    if-nez v3, :cond_3

    .line 336
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsEmail$paymentsheet_release()Z

    move-result v3

    if-nez v3, :cond_3

    .line 337
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsPhone$paymentsheet_release()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :cond_3
    :goto_2
    if-nez v0, :cond_4

    if-nez v1, :cond_4

    const/4 v0, 0x0

    return-object v0

    .line 343
    :cond_4
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v3

    .line 344
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v2

    .line 345
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsName$paymentsheet_release()Z

    move-result v4

    .line 346
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsEmail$paymentsheet_release()Z

    move-result v5

    .line 347
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsPhone$paymentsheet_release()Z

    move-result v6

    .line 342
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;-><init>(Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;ZZZ)V

    return-object v1
.end method

.method private final defaultCardBrandChoice(Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;)Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;->getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodCardKtxKt;->getPreferredChoice(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/CardBrandFilter;)Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object p1

    return-object p1
.end method

.method private final defaultExpiryDateState(Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
    .locals 2

    .line 326
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->Companion:Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;

    .line 327
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    .line 328
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;->getAreExpiryDateAndAddressModificationSupported()Z

    move-result p1

    .line 326
    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;->create(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Z)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object p1

    return-object p1
.end method

.method private final hasBillingDetailsChanged(Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 265
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v0

    .line 266
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    .line 264
    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->hasChanged(Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final hasCardDetailsChanged(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;)Z
    .locals 2

    .line 253
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 255
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    .line 256
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->defaultCardBrandChoice(Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;)Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object v0

    .line 254
    invoke-virtual {p1, v1, v0}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->hasChanged(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final newCardUpdateParams(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Lcom/stripe/android/paymentsheet/CardUpdateParams;
    .locals 4

    .line 240
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->hasCardDetailsChanged(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 241
    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->hasBillingDetailsChanged(Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-eqz p1, :cond_2

    .line 242
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->isComplete()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    if-eqz p2, :cond_3

    .line 243
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {p2, v3}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->isComplete(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    if-nez v0, :cond_4

    .line 245
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->requiresModification:Z

    if-nez v0, :cond_5

    :cond_4
    if-eqz v1, :cond_5

    .line 246
    invoke-static {p1, p2}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntryKt;->toUpdateParams(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Lcom/stripe/android/paymentsheet/CardUpdateParams;

    move-result-object p1

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method private final onBillingAddressFormChanged(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)V
    .locals 2

    .line 295
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->billingDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;-><init>(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final onBrandChoiceChanged(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;)V
    .locals 5

    .line 271
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    if-eqz v0, :cond_4

    .line 272
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;->getCardDetailsState()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$CardDetailsState;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$CardDetailsState;->getSelectedCardBrand()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 273
    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 274
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->onBrandChoiceChanged:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v2

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 396
    :cond_2
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 397
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    if-eqz v3, :cond_3

    const/4 v4, 0x2

    .line 277
    invoke-static {v3, p1, v1, v4, v1}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->copy$default(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v1

    .line 398
    :goto_1
    invoke-interface {v0, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_4
    return-void
.end method

.method private final onDateChanged(Ljava/lang/String;)V
    .locals 6

    .line 285
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    if-eqz v0, :cond_2

    .line 286
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardDetailsEntry:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 401
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 402
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 288
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->getExpiryDateState()Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->onDateChanged(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object v4

    const/4 v5, 0x1

    .line 287
    invoke-static {v2, v3, v4, v5, v3}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->copy$default(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;

    move-result-object v3

    .line 403
    :cond_1
    invoke-interface {v0, v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    return-void
.end method

.method private final uiState(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;
    .locals 8

    .line 355
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;

    .line 356
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 357
    invoke-static {v1, v3, v4, v2, v4}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUiExtensionKt;->getSavedPaymentMethodIcon$default(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;ZLjava/lang/Boolean;ILjava/lang/Object;)I

    move-result v2

    .line 358
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    if-eqz v3, :cond_0

    if-eqz p1, :cond_0

    .line 359
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$CardDetailsState;

    .line 360
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->getCardBrandChoice()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object v3

    .line 361
    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;->isCbcModifiable()Z

    move-result v5

    .line 362
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->payload:Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->cardEditConfiguration:Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;->getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodCardKtxKt;->getAvailableNetworks(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/CardBrandFilter;)Ljava/util/List;

    move-result-object v6

    .line 363
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->getExpiryDateState()Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object p1

    .line 359
    invoke-direct {v4, v3, v5, v6, p1}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$CardDetailsState;-><init>(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;ZLjava/util/List;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;)V

    .line 355
    :cond_0
    invoke-direct {v0, v1, v2, v4, p2}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;-><init>(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;ILcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$CardDetailsState;Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;)V

    return-object v0
.end method


# virtual methods
.method public getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;",
            ">;"
        }
    .end annotation

    .line 209
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public handleViewAction(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction;)V
    .locals 1

    const-string v0, "viewAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$BrandChoiceChanged;

    if-eqz v0, :cond_0

    .line 303
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$BrandChoiceChanged;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$BrandChoiceChanged;->getCardBrandChoice()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->onBrandChoiceChanged(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;)V

    return-void

    .line 305
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$DateChanged;

    if-eqz v0, :cond_1

    .line 306
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$DateChanged;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$DateChanged;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->onDateChanged(Ljava/lang/String;)V

    return-void

    .line 308
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$BillingDetailsChanged;

    if-eqz v0, :cond_2

    .line 309
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$BillingDetailsChanged;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$ViewAction$BillingDetailsChanged;->getBillingDetailsFormState()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor;->onBillingAddressFormChanged(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)V

    return-void

    .line 301
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
