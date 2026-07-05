.class public final Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "UpdateCardScreenViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUpdateCardScreenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateCardScreenViewModel.kt\ncom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,245:1\n1#2:246\n230#3,5:247\n230#3,5:252\n230#3,5:257\n*S KotlinDebug\n*F\n+ 1 UpdateCardScreenViewModel.kt\ncom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel\n*L\n78#1:247,5\n195#1:252,5\n199#1:257,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 62\u00020\u0001:\u00016Bg\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0006\u0010\'\u001a\u00020\u0013J\u000c\u0010(\u001a\u00020)*\u00020*H\u0002J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0002J\u0017\u0010.\u001a\u00020\u00132\u0008\u0010/\u001a\u0004\u0018\u00010*H\u0001\u00a2\u0006\u0002\u00080J\u0010\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u0002052\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u00067"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "dismissalCoordinator",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "completeLinkFlow",
        "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
        "dismissWithResult",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "",
        "paymentDetailsId",
        "",
        "billingDetailsUpdateFlow",
        "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
        "<init>",
        "(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)V",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "interactor",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
        "getInteractor",
        "()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
        "setInteractor",
        "(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;)V",
        "onUpdateClicked",
        "toApiParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "initializeInteractor",
        "paymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "onCardUpdateParamsChanged",
        "cardUpdateParams",
        "onCardUpdateParamsChanged$paymentsheet_release",
        "onBrandChoiceChanged",
        "cardBrand",
        "Lcom/stripe/android/model/CardBrand;",
        "primaryButtonLabel",
        "Lcom/stripe/android/core/strings/ResolvableString;",
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

.field public static final Companion:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$Companion;


# instance fields
.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;",
            ">;"
        }
    .end annotation
.end field

.field private final completeLinkFlow:Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private final dismissWithResult:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

.field private interactor:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->Companion:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lcom/stripe/android/uicore/navigation/NavigationManager;",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    const-string v8, "logger"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "linkAccountManager"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "navigationManager"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "dismissalCoordinator"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "configuration"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "linkLaunchMode"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "completeLinkFlow"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "dismissWithResult"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "paymentDetailsId"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 49
    iput-object p2, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 50
    iput-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 51
    iput-object v2, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    .line 52
    iput-object v3, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 53
    iput-object v4, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    .line 54
    iput-object v5, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->completeLinkFlow:Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    .line 55
    iput-object v6, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    .line 61
    new-instance v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-object/from16 v2, p10

    .line 64
    invoke-direct {p0, v2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->primaryButtonLabel(Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    const/16 v9, 0xf8

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, p9

    .line 61
    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;-><init>(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 68
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 73
    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p1, p0

    check-cast p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;

    .line 74
    iget-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-interface {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->getConsumerState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ConsumerState;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 75
    invoke-virtual {p1}, Lcom/stripe/android/link/ConsumerState;->getPaymentDetails()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 74
    check-cast p1, Ljava/lang/Iterable;

    .line 75
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    invoke-virtual {v3}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    check-cast v2, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    if-eqz v2, :cond_2

    .line 76
    invoke-virtual {v2}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    :cond_2
    move-object p1, v0

    if-eqz p1, :cond_4

    .line 78
    iget-object v11, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 248
    :cond_3
    invoke-interface {v11}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v12

    .line 249
    move-object v0, v12

    check-cast v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    .line 81
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault()Z

    move-result v4

    const/16 v9, 0xf6

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 79
    invoke-static/range {v0 .. v10}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object v0

    .line 250
    invoke-interface {v11, v12, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 84
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->initializeInteractor(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->interactor:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    .line 85
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 73
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    .line 77
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Payment details with id "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, " not found"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 73
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 85
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 86
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Failed to render payment update screen"

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    iget-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    invoke-interface {p1}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateBack()V

    :cond_5
    return-void
.end method

.method public static final synthetic access$getCompleteLinkFlow$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/link/confirmation/CompleteLinkFlow;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->completeLinkFlow:Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    return-object p0
.end method

.method public static final synthetic access$getDismissWithResult$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getDismissalCoordinator$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/link/LinkDismissalCoordinator;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNavigationManager$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$onBrandChoiceChanged(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;Lcom/stripe/android/model/CardBrand;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->onBrandChoiceChanged(Lcom/stripe/android/model/CardBrand;)V

    return-void
.end method

.method public static final synthetic access$toApiParams(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->toApiParams(Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    return-object p0
.end method

.method private final initializeInteractor(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
    .locals 13

    .line 160
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isBillingDetailsUpdateFlow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 163
    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-interface {v1}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v1

    .line 161
    invoke-static {p1, v0, v1}, Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;->withEffectiveBillingDetails(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p1

    .line 169
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 170
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;

    .line 171
    sget-object v4, Lcom/stripe/android/DefaultCardBrandFilter;->INSTANCE:Lcom/stripe/android/DefaultCardBrandFilter;

    check-cast v4, Lcom/stripe/android/CardBrandFilter;

    .line 172
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getAvailableNetworks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 170
    :goto_1
    invoke-direct {v3, v4, v0, v2}, Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;-><init>(Lcom/stripe/android/CardBrandFilter;ZZ)V

    move-object v7, v3

    goto :goto_2

    :cond_3
    move-object v7, v1

    .line 177
    :goto_2
    new-instance v5, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;

    invoke-direct {v5}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;-><init>()V

    .line 178
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v6

    .line 180
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->Companion:Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;

    .line 182
    iget-object v3, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-interface {v3}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v3}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/stripe/android/link/model/LinkAccount;->getUnredactedPhoneNumber()Ljava/lang/String;

    move-result-object v1

    .line 180
    :cond_4
    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;->create(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    move-result-object v9

    .line 184
    iget-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v10

    .line 185
    new-instance p1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$initializeInteractor$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$initializeInteractor$1;-><init>(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/reflect/KFunction;

    .line 186
    new-instance v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$initializeInteractor$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$initializeInteractor$2;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/reflect/KFunction;

    .line 189
    iget-object v1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->isBillingDetailsUpdateFlow()Z

    move-result v1

    xor-int/lit8 v8, v1, 0x1

    .line 186
    move-object v11, v0

    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 185
    move-object v12, p1

    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 177
    invoke-virtual/range {v5 .. v12}, Lcom/stripe/android/paymentsheet/ui/DefaultEditCardDetailsInteractor$Factory;->create(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;ZLcom/stripe/android/paymentsheet/ui/EditCardPayload;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    move-result-object p1

    return-object p1
.end method

.method private final onBrandChoiceChanged(Lcom/stripe/android/model/CardBrand;)V
    .locals 13

    .line 199
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 258
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 259
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    const/16 v11, 0xdf

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, p1

    .line 199
    invoke-static/range {v2 .. v12}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object p1

    .line 260
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v8

    goto :goto_0
.end method

.method private final primaryButtonLabel(Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    if-eqz p1, :cond_0

    .line 206
    iget-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->completePaymentButtonLabel(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1

    .line 209
    :cond_0
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_update_card_confirm_cta:I

    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1
.end method

.method private final toApiParams(Lcom/stripe/android/paymentsheet/CardUpdateParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 7

    .line 145
    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    .line 146
    new-instance v1, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    invoke-direct {v1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;-><init>()V

    .line 147
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->setExpiryMonth(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    .line 148
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getExpiryYear()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->setExpiryYear(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    .line 149
    iget-object v2, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getPreferredCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 150
    new-instance v3, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;

    invoke-virtual {v2}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->setNetworks(Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    .line 152
    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->build()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    move-result-object v1

    .line 153
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 145
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getInteractor()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->interactor:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    return-object v0
.end method

.method public final getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;",
            ">;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final onCardUpdateParamsChanged$paymentsheet_release(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V
    .locals 13

    .line 195
    iget-object v0, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 253
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 254
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    const/16 v11, 0xef

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p1

    .line 195
    invoke-static/range {v2 .. v12}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->copy$default(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    move-result-object p1

    .line 255
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v7

    goto :goto_0
.end method

.method public final onUpdateClicked()V
    .locals 7

    .line 92
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$onUpdateClicked$1;-><init>(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final setInteractor(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;->interactor:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    return-void
.end method
