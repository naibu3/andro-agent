.class public final Lcom/stripe/android/shoppay/ShopPayViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "ShopPayViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/ShopPayViewModel$Companion;,
        Lcom/stripe/android/shoppay/ShopPayViewModel$NoArgsException;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShopPayViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShopPayViewModel.kt\ncom/stripe/android/shoppay/ShopPayViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 52\u00020\u0001:\u000256BK\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010\u001e\u001a\u00020\u001fH\u0082@\u00a2\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0082@\u00a2\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\'H\u0082@\u00a2\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u001fJ\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u000200R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/ShopPayViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "bridgeHandler",
        "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;",
        "stripeApiRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "requestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "preparePaymentMethodHandlerProvider",
        "Ljavax/inject/Provider;",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "<init>",
        "(Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
        "getBridgeHandler",
        "()Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;",
        "_paymentResult",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/shoppay/ShopPayActivityResult;",
        "paymentResult",
        "Lkotlinx/coroutines/flow/Flow;",
        "getPaymentResult",
        "()Lkotlinx/coroutines/flow/Flow;",
        "didReceiveECEClick",
        "",
        "listenToConfirmationState",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleSuccessfulPayment",
        "confirmationState",
        "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;",
        "(Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createRadarSessionIfPossible",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "closePopup",
        "assetLoader",
        "Landroidx/webkit/WebViewAssetLoader;",
        "context",
        "Landroid/content/Context;",
        "onPageLoaded",
        "view",
        "Landroid/webkit/WebView;",
        "url",
        "",
        "loadUrl",
        "webView",
        "Companion",
        "NoArgsException",
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

.field public static final Companion:Lcom/stripe/android/shoppay/ShopPayViewModel$Companion;


# instance fields
.field private final _paymentResult:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/shoppay/ShopPayActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field private final bridgeHandler:Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;

.field private didReceiveECEClick:Z

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final paymentResult:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/shoppay/ShopPayActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field private final preparePaymentMethodHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final stripeApiRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public static synthetic $r8$lambda$SoCSqSTKp_EB3cZyOaVTgqrE5Uc(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/shoppay/ShopPayViewModel;->onPageLoaded$lambda$7(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic $r8$lambda$x62JfflHRjws46vLhcnS2g806aE(Lcom/stripe/android/shoppay/ShopPayViewModel;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/shoppay/ShopPayViewModel;->_init_$lambda$0(Lcom/stripe/android/shoppay/ShopPayViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/ShopPayViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/ShopPayViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/ShopPayViewModel;->Companion:Lcom/stripe/android/shoppay/ShopPayViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/shoppay/ShopPayViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 2
    .param p7    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/UIContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
            ">;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "bridgeHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeApiRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preparePaymentMethodHandlerProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 55
    invoke-static {v1, v0, v1}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p7, v0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p7

    invoke-static {p7}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p7

    invoke-direct {p0, p7}, Landroidx/lifecycle/ViewModel;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 48
    iput-object p1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->bridgeHandler:Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;

    .line 49
    iput-object p2, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->stripeApiRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 50
    iput-object p3, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 51
    iput-object p4, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->preparePaymentMethodHandlerProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p5, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 53
    iput-object p6, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    const/4 p2, 0x0

    const/4 p3, 0x7

    .line 57
    invoke-static {p2, p2, v1, p3, v1}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->_paymentResult:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 58
    check-cast p2, Lkotlinx/coroutines/flow/Flow;

    iput-object p2, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->paymentResult:Lkotlinx/coroutines/flow/Flow;

    .line 63
    new-instance p2, Lcom/stripe/android/shoppay/ShopPayViewModel$$ExternalSyntheticLambda1;

    invoke-direct {p2, p0}, Lcom/stripe/android/shoppay/ShopPayViewModel$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/shoppay/ShopPayViewModel;)V

    invoke-interface {p1, p2}, Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;->setOnECEClickCallback(Lkotlin/jvm/functions/Function0;)V

    .line 67
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p2

    new-instance p1, Lcom/stripe/android/shoppay/ShopPayViewModel$2;

    invoke-direct {p1, p0, v1}, Lcom/stripe/android/shoppay/ShopPayViewModel$2;-><init>(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)V

    move-object p5, p1

    check-cast p5, Lkotlin/jvm/functions/Function2;

    const/4 p6, 0x3

    const/4 p7, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 54
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 47
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/shoppay/ShopPayViewModel;-><init>(Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/shoppay/ShopPayViewModel;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->didReceiveECEClick:Z

    .line 65
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$createRadarSessionIfPossible(Lcom/stripe/android/shoppay/ShopPayViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/shoppay/ShopPayViewModel;->createRadarSessionIfPossible(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEventReporter$p(Lcom/stripe/android/shoppay/ShopPayViewModel;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-object p0
.end method

.method public static final synthetic access$get_paymentResult$p(Lcom/stripe/android/shoppay/ShopPayViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->_paymentResult:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method

.method public static final synthetic access$handleSuccessfulPayment(Lcom/stripe/android/shoppay/ShopPayViewModel;Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/shoppay/ShopPayViewModel;->handleSuccessfulPayment(Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$listenToConfirmationState(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/ShopPayViewModel;->listenToConfirmationState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createRadarSessionIfPossible(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;

    iget v1, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;-><init>(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 145
    iget v2, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/shoppay/ShopPayViewModel;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 148
    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p2, p0

    check-cast p2, Lcom/stripe/android/shoppay/ShopPayViewModel;

    .line 149
    iget-object p2, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->stripeApiRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 150
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-eqz p1, :cond_4

    .line 157
    iget-object v2, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 149
    iput-object p0, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/shoppay/ShopPayViewModel$createRadarSessionIfPossible$1;->label:I

    invoke-interface {p2, p1, v2, v0}, Lcom/stripe/android/networking/StripeRepository;->createSavedPaymentMethodRadarSession-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 158
    :goto_1
    :try_start_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lcom/stripe/android/model/RadarSessionWithHCaptcha;

    .line 148
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 151
    :cond_4
    :try_start_3
    new-instance p1, Lcom/stripe/android/core/exception/GenericStripeException;

    .line 152
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 153
    const-string v0, "No payment method ID was found for provided \'PaymentMethod\' object!"

    .line 152
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    .line 155
    const-string v0, "noPaymentMethodId"

    .line 151
    invoke-direct {p1, p2, v0}, Lcom/stripe/android/core/exception/GenericStripeException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object p1, p0

    .line 148
    :goto_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 159
    :goto_3
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 160
    iget-object v0, p1, Lcom/stripe/android/shoppay/ShopPayViewModel;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 161
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 162
    sget-object p1, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 160
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 165
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final handleSuccessfulPayment(Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/shoppay/ShopPayActivityResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;

    iget v3, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;-><init>(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 90
    iget v4, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    iget-object v6, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    iget-object v7, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/shoppay/ShopPayViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_3
    iget-object v4, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    iget-object v7, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/shoppay/ShopPayViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_7

    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 93
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->getBillingDetails()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;->getAddress()Lcom/stripe/android/shoppay/bridge/ECEFullAddress;

    move-result-object v1

    .line 94
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->getShippingAddressData()Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    move-result-object v4

    .line 95
    sget-object v9, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    .line 96
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->getExternalSourceId()Ljava/lang/String;

    move-result-object v10

    .line 98
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->getBillingDetails()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    move-result-object v11

    invoke-virtual {v11}, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;->getName()Ljava/lang/String;

    move-result-object v11

    .line 99
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->getBillingDetails()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v12

    .line 100
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/shoppay/bridge/ShopPayConfirmationState$Success;->getBillingDetails()Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;->getPhone()Ljava/lang/String;

    move-result-object v13

    .line 101
    new-instance v14, Lcom/stripe/android/model/Address;

    if-eqz v1, :cond_5

    .line 102
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getCity()Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    :cond_5
    move-object v15, v8

    :goto_1
    if-eqz v1, :cond_6

    .line 103
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getCountry()Ljava/lang/String;

    move-result-object v16

    goto :goto_2

    :cond_6
    move-object/from16 v16, v8

    :goto_2
    if-eqz v1, :cond_7

    .line 104
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getLine1()Ljava/lang/String;

    move-result-object v17

    goto :goto_3

    :cond_7
    move-object/from16 v17, v8

    :goto_3
    if-eqz v1, :cond_8

    .line 105
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getLine2()Ljava/lang/String;

    move-result-object v18

    goto :goto_4

    :cond_8
    move-object/from16 v18, v8

    :goto_4
    if-eqz v1, :cond_9

    .line 106
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v19

    goto :goto_5

    :cond_9
    move-object/from16 v19, v8

    :goto_5
    if-eqz v1, :cond_a

    .line 107
    invoke-virtual {v1}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getState()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_6

    :cond_a
    move-object/from16 v20, v8

    .line 101
    :goto_6
    invoke-direct/range {v14 .. v20}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    new-instance v1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    invoke-direct {v1, v14, v12, v11, v13}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    invoke-virtual {v9, v10, v1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->createShopPay(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    .line 111
    iget-object v9, v0, Lcom/stripe/android/shoppay/ShopPayViewModel;->stripeApiRepository:Lcom/stripe/android/networking/StripeRepository;

    .line 113
    iget-object v10, v0, Lcom/stripe/android/shoppay/ShopPayViewModel;->requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    .line 111
    iput-object v0, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$1:Ljava/lang/Object;

    iput v7, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    invoke-interface {v9, v1, v10, v2}, Lcom/stripe/android/networking/StripeRepository;->createPaymentMethod-0E7RQCE(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    goto/16 :goto_b

    :cond_b
    move-object v7, v0

    .line 114
    :goto_7
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 115
    iput-object v7, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$2:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    invoke-direct {v7, v1, v2}, Lcom/stripe/android/shoppay/ShopPayViewModel;->createRadarSessionIfPossible(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_c

    goto :goto_b

    :cond_c
    move-object v6, v4

    move-object v4, v1

    .line 117
    :goto_8
    iget-object v1, v7, Lcom/stripe/android/shoppay/ShopPayViewModel;->preparePaymentMethodHandlerProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    if-nez v1, :cond_d

    .line 118
    new-instance v1, Lcom/stripe/android/shoppay/ShopPayActivityResult$Failed;

    .line 119
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "PreparePaymentMethodHandler is required for ShopPay"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    .line 118
    invoke-direct {v1, v2}, Lcom/stripe/android/shoppay/ShopPayActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Lcom/stripe/android/shoppay/ShopPayActivityResult;

    goto :goto_d

    :cond_d
    if-eqz v6, :cond_f

    .line 125
    invoke-virtual {v6}, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;->getName()Ljava/lang/String;

    move-result-object v10

    .line 126
    invoke-virtual {v6}, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;->getAddress()Lcom/stripe/android/shoppay/bridge/ECEFullAddress;

    move-result-object v6

    if-eqz v6, :cond_e

    .line 127
    new-instance v11, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    .line 128
    invoke-virtual {v6}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getCity()Ljava/lang/String;

    move-result-object v12

    .line 129
    invoke-virtual {v6}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getCountry()Ljava/lang/String;

    move-result-object v13

    .line 130
    invoke-virtual {v6}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getLine1()Ljava/lang/String;

    move-result-object v14

    .line 131
    invoke-virtual {v6}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getLine2()Ljava/lang/String;

    move-result-object v15

    .line 132
    invoke-virtual {v6}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v16

    .line 133
    invoke-virtual {v6}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;->getState()Ljava/lang/String;

    move-result-object v17

    .line 127
    invoke-direct/range {v11 .. v17}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_e
    move-object v11, v8

    .line 124
    :goto_9
    new-instance v9, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xc

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v15}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_f
    move-object v9, v8

    .line 121
    :goto_a
    iput-object v8, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->L$2:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/shoppay/ShopPayViewModel$handleSuccessfulPayment$1;->label:I

    invoke-interface {v1, v4, v9, v2}, Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;->onPreparePaymentMethod(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_10

    :goto_b
    return-object v3

    .line 139
    :cond_10
    :goto_c
    sget-object v1, Lcom/stripe/android/shoppay/ShopPayActivityResult$Completed;->INSTANCE:Lcom/stripe/android/shoppay/ShopPayActivityResult$Completed;

    check-cast v1, Lcom/stripe/android/shoppay/ShopPayActivityResult;

    .line 114
    :cond_11
    :goto_d
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 140
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_12

    return-object v1

    .line 141
    :cond_12
    new-instance v1, Lcom/stripe/android/shoppay/ShopPayActivityResult$Failed;

    invoke-direct {v1, v2}, Lcom/stripe/android/shoppay/ShopPayActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Lcom/stripe/android/shoppay/ShopPayActivityResult;

    return-object v1
.end method

.method private final listenToConfirmationState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->bridgeHandler:Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;

    invoke-interface {v0}, Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;->getConfirmationState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    new-instance v1, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/shoppay/ShopPayViewModel$listenToConfirmationState$2;-><init>(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/flow/FlowKt;->collectLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private static final onPageLoaded$lambda$7(Ljava/lang/String;)V
    .locals 2

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initializeApp() => "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "WebViewBridge"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final assetLoader(Landroid/content/Context;)Landroidx/webkit/WebViewAssetLoader;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    new-instance v0, Landroidx/webkit/WebViewAssetLoader$Builder;

    invoke-direct {v0}, Landroidx/webkit/WebViewAssetLoader$Builder;-><init>()V

    .line 176
    const-string v1, "pay.stripe.com"

    invoke-virtual {v0, v1}, Landroidx/webkit/WebViewAssetLoader$Builder;->setDomain(Ljava/lang/String;)Landroidx/webkit/WebViewAssetLoader$Builder;

    move-result-object v0

    .line 177
    new-instance v1, Landroidx/webkit/WebViewAssetLoader$AssetsPathHandler;

    invoke-direct {v1, p1}, Landroidx/webkit/WebViewAssetLoader$AssetsPathHandler;-><init>(Landroid/content/Context;)V

    check-cast v1, Landroidx/webkit/WebViewAssetLoader$PathHandler;

    const-string p1, "/assets/"

    invoke-virtual {v0, p1, v1}, Landroidx/webkit/WebViewAssetLoader$Builder;->addPathHandler(Ljava/lang/String;Landroidx/webkit/WebViewAssetLoader$PathHandler;)Landroidx/webkit/WebViewAssetLoader$Builder;

    move-result-object p1

    .line 178
    invoke-virtual {p1}, Landroidx/webkit/WebViewAssetLoader$Builder;->build()Landroidx/webkit/WebViewAssetLoader;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final closePopup()V
    .locals 7

    .line 168
    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-boolean v1, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->didReceiveECEClick:Z

    invoke-interface {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShopPayWebViewCancelled(Z)V

    .line 169
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/shoppay/ShopPayViewModel$closePopup$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/shoppay/ShopPayViewModel$closePopup$1;-><init>(Lcom/stripe/android/shoppay/ShopPayViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final getBridgeHandler()Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->bridgeHandler:Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;

    return-object v0
.end method

.method public final getPaymentResult()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/shoppay/ShopPayActivityResult;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->paymentResult:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final loadUrl(Landroid/webkit/WebView;)V
    .locals 1

    const-string v0, "webView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShopPayWebViewLoadAttempt()V

    .line 197
    const-string v0, "https://pay.stripe.com/assets/www/index.html"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final onPageLoaded(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "www/native.js"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    const-string v1, "open(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    check-cast v2, Ljava/io/Reader;

    instance-of v0, v2, Ljava/io/BufferedReader;

    if-eqz v0, :cond_0

    check-cast v2, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    const/16 v1, 0x2000

    invoke-direct {v0, v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v2, v0

    :goto_0
    check-cast v2, Ljava/io/Closeable;

    .line 184
    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/io/BufferedReader;

    check-cast v0, Ljava/io/Reader;

    invoke-static {v0}, Lkotlin/io/TextStreamsKt;->readText(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 186
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 188
    check-cast p2, Ljava/lang/CharSequence;

    const-string v0, "pay.stripe.com"

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p2, v0, v2, v3, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 189
    new-instance p2, Lcom/stripe/android/shoppay/ShopPayViewModel$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/stripe/android/shoppay/ShopPayViewModel$$ExternalSyntheticLambda0;-><init>()V

    const-string v0, "initializeApp()"

    invoke-virtual {p1, v0, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 184
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v2, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
.end method
