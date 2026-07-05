.class public final Lcom/stripe/android/link/LinkActivityViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "LinkActivityViewModel.kt"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityViewModel$Companion;,
        Lcom/stripe/android/link/LinkActivityViewModel$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivityViewModel.kt\ncom/stripe/android/link/LinkActivityViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,419:1\n230#2,5:420\n230#2,5:425\n1#3:430\n*S KotlinDebug\n*F\n+ 1 LinkActivityViewModel.kt\ncom/stripe/android/link/LinkActivityViewModel\n*L\n129#1:420,5\n151#1:425,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0002\u0083\u0001Bq\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000e\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020LJ\u0006\u0010Y\u001a\u00020LJ\u000e\u0010Z\u001a\u00020L2\u0006\u0010;\u001a\u00020:J\u0006\u0010[\u001a\u00020LJ\u000e\u0010\\\u001a\u00020L2\u0006\u0010]\u001a\u00020RJ\u0008\u0010^\u001a\u00020LH\u0002J\u000e\u0010_\u001a\u00020L2\u0006\u0010`\u001a\u00020aJ\u000e\u0010b\u001a\u00020L2\u0006\u0010c\u001a\u00020dJ\u0006\u0010e\u001a\u00020LJ\u0016\u0010f\u001a\u00020L2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jJ \u0010k\u001a\u00020L2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020R2\u0008\u0008\u0002\u0010o\u001a\u00020RJ\u0006\u0010p\u001a\u00020LJ\u0006\u0010q\u001a\u00020LJ\u0006\u0010r\u001a\u00020LJ\u0010\u0010s\u001a\u00020L2\u0006\u0010t\u001a\u00020jH\u0016J\u000e\u0010u\u001a\u00020LH\u0082@\u00a2\u0006\u0002\u0010vJ\u001e\u0010w\u001a\u0008\u0012\u0004\u0012\u00020y0x2\u0006\u0010z\u001a\u00020{H\u0082@\u00a2\u0006\u0004\u0008|\u0010}J\u000e\u0010~\u001a\u00020LH\u0082@\u00a2\u0006\u0002\u0010vJ\u000f\u0010\u007f\u001a\u00030\u0080\u0001H\u0082@\u00a2\u0006\u0002\u0010vJ\u000f\u0010\u0081\u0001\u001a\u00020LH\u0082@\u00a2\u0006\u0002\u0010vJ\u0011\u0010\u0082\u0001\u001a\u00020L2\u0006\u0010;\u001a\u00020:H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010-\u001a\u00020.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0014\u00101\u001a\u0008\u0012\u0004\u0012\u00020302X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00104\u001a\u0008\u0012\u0004\u0012\u00020305\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0014\u00108\u001a\u0008\u0012\u0004\u0012\u00020:09X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010;\u001a\u0008\u0012\u0004\u0012\u00020:0<\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010>R\u0017\u0010?\u001a\u0008\u0012\u0004\u0012\u00020@0<\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010>R\u0014\u0010B\u001a\u0008\u0012\u0004\u0012\u00020C02X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010D\u001a\u0008\u0012\u0004\u0012\u00020C05\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u00107R\u0013\u0010F\u001a\u0004\u0018\u00010G8F\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010IR(\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020L\u0018\u00010KX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008M\u0010N\"\u0004\u0008O\u0010PR\u0011\u0010Q\u001a\u00020R8F\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010T\u00a8\u0006\u0084\u0001"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "activityRetainedComponent",
        "Lcom/stripe/android/link/injection/NativeLinkComponent;",
        "confirmationHandlerFactory",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;",
        "linkConfirmationHandlerFactory",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "linkConfiguration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkAttestationCheck",
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "linkExpressMode",
        "Lcom/stripe/android/link/LinkExpressMode;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "autocompleteLauncher",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;",
        "<init>",
        "(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/attestation/LinkAttestationCheck;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;)V",
        "getActivityRetainedComponent",
        "()Lcom/stripe/android/link/injection/NativeLinkComponent;",
        "getEventReporter",
        "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "getLinkConfiguration",
        "()Lcom/stripe/android/link/LinkConfiguration;",
        "getSavedStateHandle",
        "()Landroidx/lifecycle/SavedStateHandle;",
        "getLinkLaunchMode",
        "()Lcom/stripe/android/link/LinkLaunchMode;",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "getConfirmationHandler",
        "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "linkConfirmationHandler",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;",
        "getLinkConfirmationHandler",
        "()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;",
        "_linkAppBarState",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/link/ui/LinkAppBarState;",
        "linkAppBarState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getLinkAppBarState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_result",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "result",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getResult",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "navigationFlow",
        "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
        "getNavigationFlow",
        "_linkScreenState",
        "Lcom/stripe/android/link/ScreenState;",
        "linkScreenState",
        "getLinkScreenState",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "getLinkAccount",
        "()Lcom/stripe/android/link/model/LinkAccount;",
        "launchWebFlow",
        "Lkotlin/Function1;",
        "",
        "getLaunchWebFlow",
        "()Lkotlin/jvm/functions/Function1;",
        "setLaunchWebFlow",
        "(Lkotlin/jvm/functions/Function1;)V",
        "canDismissSheet",
        "",
        "getCanDismissSheet",
        "()Z",
        "handleViewAction",
        "action",
        "Lcom/stripe/android/link/LinkAction;",
        "onVerificationSucceeded",
        "onDismissVerificationClicked",
        "handleResult",
        "dismissSheet",
        "onContentCanScrollBackwardChanged",
        "canScrollBackward",
        "handleLogoutClicked",
        "onNavEntryChanged",
        "entry",
        "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;",
        "moveToWeb",
        "error",
        "",
        "handleBackPressed",
        "registerForActivityResult",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "navigate",
        "screen",
        "Lcom/stripe/android/link/LinkScreen;",
        "clearStack",
        "launchSingleTop",
        "goBack",
        "changeEmail",
        "unregisterActivity",
        "onCreate",
        "owner",
        "loadLink",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "confirmLinkPayment",
        "Lkotlin/Result;",
        "Lcom/stripe/android/link/confirmation/Result;",
        "selectedPayment",
        "Lcom/stripe/android/link/LinkPaymentMethod;",
        "confirmLinkPayment-gIAlu-s",
        "(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateScreenState",
        "buildFullScreenState",
        "Lcom/stripe/android/link/ScreenState$FullScreen;",
        "handleAccountError",
        "dismissWithResult",
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

.field public static final Companion:Lcom/stripe/android/link/LinkActivityViewModel$Companion;


# instance fields
.field private final _linkAppBarState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            ">;"
        }
    .end annotation
.end field

.field private final _linkScreenState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/ScreenState;",
            ">;"
        }
    .end annotation
.end field

.field private final _result:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/link/LinkActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field private final activityRetainedComponent:Lcom/stripe/android/link/injection/NativeLinkComponent;

.field private final autocompleteLauncher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;

.field private final confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private launchWebFlow:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkAppBarState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAttestationCheck:Lcom/stripe/android/link/attestation/LinkAttestationCheck;

.field private final linkConfiguration:Lcom/stripe/android/link/LinkConfiguration;

.field private final linkConfirmationHandler:Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

.field private final linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

.field private final linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private final linkScreenState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ScreenState;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final result:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/link/LinkActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkActivityViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkActivityViewModel;->Companion:Lcom/stripe/android/link/LinkActivityViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkActivityViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/attestation/LinkAttestationCheck;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "activityRetainedComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandlerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfirmationHandlerFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfiguration"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAttestationCheck"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkExpressMode"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkLaunchMode"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autocompleteLauncher"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->activityRetainedComponent:Lcom/stripe/android/link/injection/NativeLinkComponent;

    .line 58
    iput-object p4, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 59
    iput-object p5, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    .line 60
    iput-object p6, p0, Lcom/stripe/android/link/LinkActivityViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 61
    iput-object p7, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkConfiguration:Lcom/stripe/android/link/LinkConfiguration;

    .line 62
    iput-object p8, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAttestationCheck:Lcom/stripe/android/link/attestation/LinkAttestationCheck;

    .line 63
    iput-object p9, p0, Lcom/stripe/android/link/LinkActivityViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 64
    iput-object p10, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    .line 65
    iput-object p11, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 66
    iput-object p12, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    .line 67
    iput-object p13, p0, Lcom/stripe/android/link/LinkActivityViewModel;->autocompleteLauncher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;

    .line 69
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;->create(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    .line 70
    invoke-interface {p3, p1}, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;->create(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkConfirmationHandler:Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    .line 72
    sget-object p1, Lcom/stripe/android/link/ui/LinkAppBarState;->Companion:Lcom/stripe/android/link/ui/LinkAppBarState$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/LinkAppBarState$Companion;->initial()Lcom/stripe/android/link/ui/LinkAppBarState;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->_linkAppBarState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 73
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAppBarState:Lkotlinx/coroutines/flow/StateFlow;

    const/4 p1, 0x0

    const/4 p2, 0x4

    const/4 p3, 0x1

    .line 77
    invoke-static {p3, p3, p1, p2, p1}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->_result:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 78
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->result:Lkotlinx/coroutines/flow/SharedFlow;

    .line 80
    invoke-interface {p11}, Lcom/stripe/android/uicore/navigation/NavigationManager;->getNavigationFlow()Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;

    .line 82
    sget-object p1, Lcom/stripe/android/link/ScreenState$Loading;->INSTANCE:Lcom/stripe/android/link/ScreenState$Loading;

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->_linkScreenState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 83
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkScreenState:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public static final synthetic access$buildFullScreenState(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->buildFullScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$confirmLinkPayment-gIAlu-s(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/LinkActivityViewModel;->confirmLinkPayment-gIAlu-s(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/LinkActivityViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$get_linkScreenState$p(Lcom/stripe/android/link/LinkActivityViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->_linkScreenState:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_result$p(Lcom/stripe/android/link/LinkActivityViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->_result:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method

.method public static final synthetic access$handleAccountError(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->handleAccountError(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadLink(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->loadLink(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateScreenState(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->updateScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final buildFullScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ScreenState$FullScreen;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;

    iget v1, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 346
    iget v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/model/AccountStatus;

    iget-object v0, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 347
    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-interface {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->getAccountStatus()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    iput-object p0, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->label:I

    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    .line 346
    :goto_1
    check-cast p1, Lcom/stripe/android/link/model/AccountStatus;

    .line 351
    iput-object v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/LinkActivityViewModel$buildFullScreenState$1;->label:I

    const-wide/16 v5, 0x28a

    invoke-static {v5, v6, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v1, p1

    move-object v0, v2

    .line 353
    :goto_3
    new-instance p1, Lcom/stripe/android/link/ScreenState$FullScreen;

    .line 354
    sget-object v2, Lcom/stripe/android/link/LinkActivityViewModel$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v1}, Lcom/stripe/android/link/model/AccountStatus;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-eq v1, v4, :cond_9

    if-eq v1, v3, :cond_8

    const/4 v0, 0x3

    if-eq v1, v0, :cond_8

    const/4 v0, 0x4

    if-eq v1, v0, :cond_7

    const/4 v0, 0x5

    if-ne v1, v0, :cond_6

    goto :goto_4

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 366
    :cond_7
    :goto_4
    sget-object v0, Lcom/stripe/android/link/LinkScreen$Verification;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Verification;

    check-cast v0, Lcom/stripe/android/link/LinkScreen;

    goto :goto_5

    .line 369
    :cond_8
    sget-object v0, Lcom/stripe/android/link/LinkScreen$SignUp;->INSTANCE:Lcom/stripe/android/link/LinkScreen$SignUp;

    check-cast v0, Lcom/stripe/android/link/LinkScreen;

    goto :goto_5

    .line 356
    :cond_9
    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/stripe/android/link/model/LinkAccount;->getCompletedSignup()Z

    move-result v1

    if-ne v1, v4, :cond_a

    iget-object v0, v0, Lcom/stripe/android/link/LinkActivityViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    invoke-interface {v0}, Lcom/stripe/android/link/LinkLaunchMode;->selectedPayment()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    if-nez v0, :cond_a

    .line 358
    sget-object v0, Lcom/stripe/android/link/LinkScreen$PaymentMethod;->INSTANCE:Lcom/stripe/android/link/LinkScreen$PaymentMethod;

    check-cast v0, Lcom/stripe/android/link/LinkScreen;

    goto :goto_5

    .line 362
    :cond_a
    sget-object v0, Lcom/stripe/android/link/LinkScreen$Wallet;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Wallet;

    check-cast v0, Lcom/stripe/android/link/LinkScreen;

    .line 353
    :goto_5
    invoke-direct {p1, v0}, Lcom/stripe/android/link/ScreenState$FullScreen;-><init>(Lcom/stripe/android/link/LinkScreen;)V

    return-object p1
.end method

.method private final confirmLinkPayment-gIAlu-s(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "+",
            "Lcom/stripe/android/link/confirmation/Result;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;

    iget v1, v0, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p2, v6, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 270
    iget v1, v6, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkActivityViewModel;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkActivityViewModel;

    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_5

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p2, p0

    check-cast p2, Lcom/stripe/android/link/LinkActivityViewModel;

    .line 271
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod;->readyForConfirmation$paymentsheet_release()Z

    move-result p2

    if-eqz p2, :cond_9

    move p2, v3

    .line 272
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 274
    instance-of v1, p1, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkConfirmationHandler:Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    .line 275
    move-object v2, p1

    check-cast v2, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v2

    .line 276
    move-object v4, p1

    check-cast v4, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getCollectedCvc()Ljava/lang/String;

    move-result-object v4

    .line 277
    check-cast p1, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getBillingPhone()Ljava/lang/String;

    move-result-object v5

    .line 274
    iput-object p0, v6, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->L$0:Ljava/lang/Object;

    iput p2, v6, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->label:I

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;->confirm(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p2, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    :goto_1
    :try_start_3
    check-cast p2, Lcom/stripe/android/link/confirmation/Result;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    .line 280
    :cond_5
    :try_start_4
    instance-of p2, p1, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    if-eqz p2, :cond_7

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkConfirmationHandler:Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    .line 281
    move-object p2, p1

    check-cast p2, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;->getLinkPaymentDetails()Lcom/stripe/android/link/LinkPaymentDetails;

    move-result-object p2

    .line 282
    move-object v4, p1

    check-cast v4, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;->getCollectedCvc()Ljava/lang/String;

    move-result-object v4

    .line 283
    check-cast p1, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;->getBillingPhone()Ljava/lang/String;

    move-result-object v5

    .line 280
    iput-object p0, v6, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->L$0:Ljava/lang/Object;

    iput v2, v6, Lcom/stripe/android/link/LinkActivityViewModel$confirmLinkPayment$1;->label:I

    move-object v2, p2

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;->confirm(Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne p2, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object p1, p0

    :goto_3
    :try_start_5
    check-cast p2, Lcom/stripe/android/link/confirmation/Result;

    .line 270
    :goto_4
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_6

    .line 273
    :cond_7
    :try_start_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 272
    :cond_8
    const-string p1, "LinkAccount must not be null for confirmation"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 271
    :cond_9
    const-string p1, "LinkPaymentMethod must be ready for confirmation"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object p1, p0

    .line 270
    :goto_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 287
    :goto_6
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/confirmation/Result;

    .line 290
    sget-object v1, Lcom/stripe/android/link/confirmation/Result$Canceled;->INSTANCE:Lcom/stripe/android/link/confirmation/Result$Canceled;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 291
    sget-object v1, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->BackPressed:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    .line 292
    sget-object v2, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 290
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    goto :goto_7

    .line 294
    :cond_a
    instance-of v1, v0, Lcom/stripe/android/link/confirmation/Result$Failed;

    if-eqz v1, :cond_b

    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    .line 295
    new-instance v2, Ljava/lang/IllegalStateException;

    check-cast v0, Lcom/stripe/android/link/confirmation/Result$Failed;

    invoke-virtual {v0}, Lcom/stripe/android/link/confirmation/Result$Failed;->getMessage()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to confirm Link payment: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    .line 296
    sget-object v0, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v0, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 294
    invoke-direct {v1, v2, v0}, Lcom/stripe/android/link/LinkActivityResult$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/link/LinkAccountUpdate;)V

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    goto :goto_7

    .line 298
    :cond_b
    sget-object v1, Lcom/stripe/android/link/confirmation/Result$Succeeded;->INSTANCE:Lcom/stripe/android/link/confirmation/Result$Succeeded;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    .line 299
    new-instance v0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    const/4 v2, 0x0

    sget-object v3, Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;->PaymentConfirmed:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    invoke-direct {v0, v2, v3}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 298
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/LinkActivityResult$Completed;-><init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    .line 288
    :goto_7
    invoke-direct {p1, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    goto :goto_8

    .line 289
    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 303
    :cond_d
    :goto_8
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 305
    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    .line 307
    sget-object v2, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 305
    invoke-direct {v1, v0, v2}, Lcom/stripe/android/link/LinkActivityResult$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/link/LinkAccountUpdate;)V

    check-cast v1, Lcom/stripe/android/link/LinkActivityResult;

    .line 304
    invoke-direct {p1, v1}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    :cond_e
    return-object p2
.end method

.method private final dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 7

    .line 382
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$dismissWithResult$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/link/LinkActivityViewModel$dismissWithResult$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkActivityResult;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final handleAccountError(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
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

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;

    iget v1, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 375
    iget v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 376
    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p0, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->logOut-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    .line 377
    :goto_1
    iget-object p1, v2, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    new-instance v4, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    sget-object v5, Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;->LoggedOut:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    const/4 v6, 0x0

    invoke-direct {v4, v6, v5}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V

    invoke-virtual {p1, v4}, Lcom/stripe/android/link/account/LinkAccountHolder;->set(Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    .line 378
    iput-object v6, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/LinkActivityViewModel$handleAccountError$1;->label:I

    invoke-direct {v2, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->updateScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 379
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final handleLogoutClicked()V
    .locals 8

    .line 136
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$handleLogoutClicked$1;

    const/4 v7, 0x0

    invoke-direct {v0, p0, v7}, Lcom/stripe/android/link/LinkActivityViewModel$handleLogoutClicked$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 141
    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 142
    sget-object v1, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->LoggedOut:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    .line 143
    new-instance v2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    sget-object v3, Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;->LoggedOut:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    invoke-direct {v2, v7, v3}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 141
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    .line 140
    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method private final loadLink(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
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

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;

    iget v1, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 247
    iget v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 248
    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAttestationCheck:Lcom/stripe/android/link/attestation/LinkAttestationCheck;

    iput-object p0, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->L$0:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/link/attestation/LinkAttestationCheck;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_6
    move-object v2, p0

    .line 247
    :goto_1
    check-cast p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;

    .line 250
    instance-of v7, p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;

    const/4 v8, 0x0

    if-eqz v7, :cond_a

    .line 251
    iget-object v3, v2, Lcom/stripe/android/link/LinkActivityViewModel;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    sget-object v7, Lcom/stripe/android/link/LinkActivityViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Lcom/stripe/android/link/LinkExpressMode;->ordinal()I

    move-result v3

    aget v3, v7, v3

    if-eq v3, v6, :cond_9

    if-eq v3, v5, :cond_9

    if-ne v3, v4, :cond_8

    .line 254
    iput-object v8, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->label:I

    invoke-direct {v2, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->updateScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    .line 265
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 251
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 253
    :cond_9
    check-cast p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;

    invoke-virtual {p1}, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AttestationFailed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->moveToWeb(Ljava/lang/Throwable;)V

    .line 265
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 257
    :cond_a
    sget-object v5, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Successful;->INSTANCE:Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Successful;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 258
    iput-object v8, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->label:I

    invoke-direct {v2, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->updateScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_5

    .line 265
    :cond_b
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 260
    :cond_c
    instance-of v4, p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$Error;

    if-nez v4, :cond_e

    .line 261
    instance-of p1, p1, Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result$AccountError;

    if-eqz p1, :cond_d

    goto :goto_4

    .line 249
    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 262
    :cond_e
    :goto_4
    iput-object v8, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/LinkActivityViewModel$loadLink$1;->label:I

    invoke-direct {v2, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->handleAccountError(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f

    :goto_5
    return-object v1

    .line 265
    :cond_f
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public static synthetic navigate$default(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkScreen;ZZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 206
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkActivityViewModel;->navigate(Lcom/stripe/android/link/LinkScreen;ZZ)V

    return-void
.end method

.method private final updateScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
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

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;

    iget v1, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 312
    iget v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget-object v2, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 313
    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-interface {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->getAccountStatus()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    iput-object p0, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->label:I

    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_5

    :cond_5
    move-object v2, p0

    .line 312
    :goto_1
    check-cast p1, Lcom/stripe/android/link/model/AccountStatus;

    .line 315
    iget-object v6, v2, Lcom/stripe/android/link/LinkActivityViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    instance-of v7, v6, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    if-eqz v7, :cond_6

    check-cast v6, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    goto :goto_2

    :cond_6
    const/4 v6, 0x0

    :goto_2
    const/4 v7, 0x0

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/stripe/android/link/LinkLaunchMode$Authentication;->getExistingOnly()Z

    move-result v6

    if-ne v6, v5, :cond_7

    move v7, v5

    .line 316
    :cond_7
    iget-object v6, v2, Lcom/stripe/android/link/LinkActivityViewModel;->linkConfiguration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v6}, Lcom/stripe/android/link/LinkConfiguration;->getAllowUserEmailEdits()Z

    move-result v6

    .line 317
    sget-object v8, Lcom/stripe/android/link/model/AccountStatus;->SignedOut:Lcom/stripe/android/link/model/AccountStatus;

    if-eq p1, v8, :cond_8

    sget-object v8, Lcom/stripe/android/link/model/AccountStatus;->Error:Lcom/stripe/android/link/model/AccountStatus;

    if-ne p1, v8, :cond_9

    :cond_8
    if-nez v7, :cond_10

    if-nez v6, :cond_9

    goto/16 :goto_8

    .line 328
    :cond_9
    iget-object v6, v2, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-interface {v6}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v6

    invoke-interface {v6}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v6}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v6

    .line 329
    sget-object v7, Lcom/stripe/android/link/LinkActivityViewModel$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/stripe/android/link/model/AccountStatus;->ordinal()I

    move-result p1

    aget p1, v7, p1

    if-eq p1, v5, :cond_e

    if-eq p1, v4, :cond_e

    if-eq p1, v3, :cond_e

    const/4 v4, 0x4

    if-eq p1, v4, :cond_b

    const/4 v4, 0x5

    if-ne p1, v4, :cond_a

    goto :goto_3

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    :goto_3
    if-eqz v6, :cond_c

    .line 337
    iget-object p1, v2, Lcom/stripe/android/link/LinkActivityViewModel;->linkExpressMode:Lcom/stripe/android/link/LinkExpressMode;

    sget-object v4, Lcom/stripe/android/link/LinkExpressMode;->DISABLED:Lcom/stripe/android/link/LinkExpressMode;

    if-eq p1, v4, :cond_c

    .line 338
    iget-object p1, v2, Lcom/stripe/android/link/LinkActivityViewModel;->_linkScreenState:Lkotlinx/coroutines/flow/MutableStateFlow;

    new-instance v0, Lcom/stripe/android/link/ScreenState$VerificationDialog;

    invoke-direct {v0, v6}, Lcom/stripe/android/link/ScreenState$VerificationDialog;-><init>(Lcom/stripe/android/link/model/LinkAccount;)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_7

    .line 340
    :cond_c
    iget-object p1, v2, Lcom/stripe/android/link/LinkActivityViewModel;->_linkScreenState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iput-object p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->label:I

    invoke-direct {v2, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->buildFullScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_d

    goto :goto_5

    :cond_d
    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_4
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_7

    .line 333
    :cond_e
    iget-object p1, v2, Lcom/stripe/android/link/LinkActivityViewModel;->_linkScreenState:Lkotlinx/coroutines/flow/MutableStateFlow;

    iput-object p1, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/link/LinkActivityViewModel$updateScreenState$1;->label:I

    invoke-direct {v2, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->buildFullScreenState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_f

    :goto_5
    return-object v1

    :cond_f
    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_6
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 344
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 320
    :cond_10
    :goto_8
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    .line 321
    new-instance v0, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {v0}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast v0, Ljava/lang/Throwable;

    .line 322
    sget-object v1, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v1, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 320
    invoke-direct {p1, v0, v1}, Lcom/stripe/android/link/LinkActivityResult$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/link/LinkAccountUpdate;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    .line 319
    invoke-direct {v2, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    .line 325
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method


# virtual methods
.method public final changeEmail()V
    .locals 7

    .line 222
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "use_link_configuration_customer_info"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkScreenState:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/stripe/android/link/ScreenState$VerificationDialog;

    if-eqz v0, :cond_0

    .line 224
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    new-instance v1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, v3}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/account/LinkAccountHolder;->set(Lcom/stripe/android/link/LinkAccountUpdate$Value;)V

    .line 225
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->_linkScreenState:Lkotlinx/coroutines/flow/MutableStateFlow;

    new-instance v1, Lcom/stripe/android/link/ScreenState$FullScreen;

    sget-object v2, Lcom/stripe/android/link/LinkScreen$SignUp;->INSTANCE:Lcom/stripe/android/link/LinkScreen$SignUp;

    check-cast v2, Lcom/stripe/android/link/LinkScreen;

    invoke-direct {v1, v2}, Lcom/stripe/android/link/ScreenState$FullScreen;-><init>(Lcom/stripe/android/link/LinkScreen;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void

    .line 227
    :cond_0
    sget-object v0, Lcom/stripe/android/link/LinkScreen$SignUp;->INSTANCE:Lcom/stripe/android/link/LinkScreen$SignUp;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/LinkScreen;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/LinkActivityViewModel;->navigate$default(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkScreen;ZZILjava/lang/Object;)V

    return-void
.end method

.method public final dismissSheet()V
    .locals 4

    .line 119
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->getCanDismissSheet()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 122
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v1}, Lcom/stripe/android/link/account/LinkAccountUtilKt;->getLinkAccountUpdate(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 121
    invoke-direct {v0, v3, v1, v2, v3}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    .line 120
    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    :cond_0
    return-void
.end method

.method public final getActivityRetainedComponent()Lcom/stripe/android/link/injection/NativeLinkComponent;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->activityRetainedComponent:Lcom/stripe/android/link/injection/NativeLinkComponent;

    return-object v0
.end method

.method public final getCanDismissSheet()Z
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->activityRetainedComponent:Lcom/stripe/android/link/injection/NativeLinkComponent;

    invoke-interface {v0}, Lcom/stripe/android/link/injection/NativeLinkComponent;->getDismissalCoordinator()Lcom/stripe/android/link/LinkDismissalCoordinator;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/link/LinkDismissalCoordinator;->getCanDismiss()Z

    move-result v0

    return v0
.end method

.method public final getConfirmationHandler()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    return-object v0
.end method

.method public final getEventReporter()Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-object v0
.end method

.method public final getLaunchWebFlow()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->launchWebFlow:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-interface {v0}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v0

    return-object v0
.end method

.method public final getLinkAppBarState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAppBarState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getLinkConfiguration()Lcom/stripe/android/link/LinkConfiguration;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkConfiguration:Lcom/stripe/android/link/LinkConfiguration;

    return-object v0
.end method

.method public final getLinkConfirmationHandler()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkConfirmationHandler:Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    return-object v0
.end method

.method public final getLinkLaunchMode()Lcom/stripe/android/link/LinkLaunchMode;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object v0
.end method

.method public final getLinkScreenState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ScreenState;",
            ">;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkScreenState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getNavigationFlow()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigationFlow:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getResult()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/link/LinkActivityResult;",
            ">;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->result:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-object v0
.end method

.method public final goBack()V
    .locals 1

    .line 216
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->getCanDismissSheet()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    invoke-interface {v0}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateBack()V

    :cond_0
    return-void
.end method

.method public final handleBackPressed()V
    .locals 4

    .line 192
    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 193
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v1}, Lcom/stripe/android/link/account/LinkAccountUtilKt;->getLinkAccountUpdate(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 192
    invoke-direct {v0, v3, v1, v2, v3}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    .line 191
    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method public final handleResult(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method public final handleViewAction(Lcom/stripe/android/link/LinkAction;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    sget-object v0, Lcom/stripe/android/link/LinkAction$BackPressed;->INSTANCE:Lcom/stripe/android/link/LinkAction$BackPressed;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->handleBackPressed()V

    return-void

    .line 96
    :cond_0
    sget-object v0, Lcom/stripe/android/link/LinkAction$LogoutClicked;->INSTANCE:Lcom/stripe/android/link/LinkAction$LogoutClicked;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->handleLogoutClicked()V

    return-void

    .line 94
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final moveToWeb(Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    .line 163
    instance-of v1, v0, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    if-eqz v1, :cond_0

    .line 164
    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Failed;

    .line 166
    sget-object v1, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v1, Lcom/stripe/android/link/LinkAccountUpdate;

    .line 164
    invoke-direct {v0, p1, v1}, Lcom/stripe/android/link/LinkActivityResult$Failed;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/link/LinkAccountUpdate;)V

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    .line 163
    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void

    .line 170
    :cond_0
    instance-of p1, v0, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-eqz p1, :cond_1

    .line 171
    new-instance p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    .line 172
    sget-object v0, Lcom/stripe/android/link/LinkAccountUpdate$None;->INSTANCE:Lcom/stripe/android/link/LinkAccountUpdate$None;

    check-cast v0, Lcom/stripe/android/link/LinkAccountUpdate;

    const/4 v1, 0x0

    .line 171
    invoke-direct {p1, v0, v1, v1}, Lcom/stripe/android/link/LinkActivityResult$Completed;-><init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    .line 170
    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void

    .line 178
    :cond_1
    instance-of p1, v0, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;

    if-nez p1, :cond_3

    .line 179
    sget-object p1, Lcom/stripe/android/link/LinkLaunchMode$Full;->INSTANCE:Lcom/stripe/android/link/LinkLaunchMode$Full;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    .line 161
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 179
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->launchWebFlow:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_4

    .line 180
    sget-object v0, Lcom/stripe/android/link/LinkScreen$Loading;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Loading;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/LinkScreen;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/LinkActivityViewModel;->navigate$default(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/link/LinkScreen;ZZILjava/lang/Object;)V

    .line 181
    iget-object v0, v1, Lcom/stripe/android/link/LinkActivityViewModel;->linkConfiguration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    move-object v1, p0

    return-void
.end method

.method public final navigate(Lcom/stripe/android/link/LinkScreen;ZZ)V
    .locals 1

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 208
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 211
    sget-object p2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Start;->INSTANCE:Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Start;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Lcom/stripe/android/uicore/navigation/PopUpToBehavior;

    .line 207
    invoke-interface {v0, p1, p2, p3}, Lcom/stripe/android/uicore/navigation/NavigationManager;->tryNavigateTo(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)V

    return-void
.end method

.method public final onContentCanScrollBackwardChanged(Z)V
    .locals 9

    .line 129
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->_linkAppBarState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 421
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 422
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/LinkAppBarState;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p1

    .line 130
    invoke-static/range {v2 .. v8}, Lcom/stripe/android/link/ui/LinkAppBarState;->copy$default(Lcom/stripe/android/link/ui/LinkAppBarState;ZZLcom/stripe/android/core/strings/ResolvableString;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/LinkAppBarState;

    move-result-object p1

    .line 423
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move p1, v6

    goto :goto_0
.end method

.method public onCreate(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 6

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Landroidx/lifecycle/LifecycleOwner;)V

    .line 237
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    new-instance p1, Lcom/stripe/android/link/LinkActivityViewModel$onCreate$1;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lcom/stripe/android/link/LinkActivityViewModel$onCreate$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onDismissVerificationClicked()V
    .locals 4

    .line 108
    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    .line 109
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v1}, Lcom/stripe/android/link/account/LinkAccountUtilKt;->getLinkAccountUpdate(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkAccountUpdate;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 108
    invoke-direct {v0, v3, v1, v2, v3}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/stripe/android/link/LinkActivityResult;

    .line 107
    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkActivityViewModel;->dismissWithResult(Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method public final onNavEntryChanged(Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;)V
    .locals 7

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    invoke-virtual {p1}, Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;->getCurrentBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 150
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;->getPreviousBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getDestination()Landroidx/navigation/NavDestination;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/navigation/NavDestination;->getRoute()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 151
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->_linkAppBarState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 426
    :cond_2
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 427
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/LinkAppBarState;

    .line 152
    sget-object v3, Lcom/stripe/android/link/ui/LinkAppBarState;->Companion:Lcom/stripe/android/link/ui/LinkAppBarState$Companion;

    .line 155
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/stripe/android/link/model/LinkAccount;->getCompletedSignup()Z

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_3

    move v5, v6

    .line 152
    :cond_3
    invoke-virtual {v3, v0, p1, v5}, Lcom/stripe/android/link/ui/LinkAppBarState$Companion;->create(Landroidx/navigation/NavBackStackEntry;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/LinkAppBarState;

    move-result-object v3

    .line 428
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    return-void
.end method

.method public final onVerificationSucceeded()V
    .locals 7

    .line 101
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$onVerificationSucceeded$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/link/LinkActivityViewModel$onVerificationSucceeded$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final registerForActivityResult(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->autocompleteLauncher:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;->register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V

    .line 203
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V

    return-void
.end method

.method public final setLaunchWebFlow(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 88
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->launchWebFlow:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final unregisterActivity()V
    .locals 1

    const/4 v0, 0x0

    .line 232
    iput-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->launchWebFlow:Lkotlin/jvm/functions/Function1;

    return-void
.end method
