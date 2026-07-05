.class public final Lcom/stripe/android/link/ui/signup/SignUpViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SignUpViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSignUpViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 LinkDismissalCoordinator.kt\ncom/stripe/android/link/LinkDismissalCoordinatorKt\n+ 7 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n1#2:322\n49#3:323\n51#3:327\n49#3:328\n51#3:332\n46#4:324\n51#4:326\n46#4:329\n51#4:331\n105#5:325\n105#5:330\n20#6,6:333\n230#7,5:339\n*S KotlinDebug\n*F\n+ 1 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n*L\n90#1:323\n90#1:327\n97#1:328\n97#1:332\n90#1:324\n90#1:326\n97#1:329\n97#1:331\n90#1:325\n97#1:330\n177#1:333,6\n282#1:339,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 O2\u00020\u0001:\u0001OB}\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000e\u00100\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0002\u00101J\u000e\u00102\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0002\u00101J\u0016\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u000205H\u0082@\u00a2\u0006\u0002\u00106J\u0006\u00107\u001a\u00020\u0011J\u000e\u00108\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0002\u00101J4\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020;2\u001c\u0010<\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110=\u0012\u0006\u0012\u0004\u0018\u00010>0\u000fH\u0082@\u00a2\u0006\u0002\u0010?J\u0012\u0010@\u001a\u00020\u00112\u0008\u0010A\u001a\u0004\u0018\u00010BH\u0002J\u000c\u0010C\u001a\u00020\u0011*\u00020DH\u0002J\u001e\u0010E\u001a\u00020\u00112\u0008\u0010F\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010G\u001a\u0004\u0018\u00010HH\u0002J\u0008\u0010I\u001a\u00020\u0011H\u0002J\u001c\u0010J\u001a\u00020\u00112\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u000fH\u0002J\u0010\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u00020NH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010&\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010!R\u0014\u0010(\u001a\u0008\u0012\u0004\u0012\u00020*0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0,\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u000e\u0010/\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "linkAuth",
        "Lcom/stripe/android/link/account/LinkAuth;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "dismissalCoordinator",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "navigateAndClearStack",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/LinkScreen;",
        "",
        "moveToWeb",
        "",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "dismissWithResult",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAuth;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkDismissalCoordinator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;)V",
        "useLinkConfigurationCustomerInfo",
        "",
        "customerInfo",
        "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;",
        "emailController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "getEmailController",
        "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "phoneNumberController",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "getPhoneNumberController",
        "()Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "nameController",
        "getNameController",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "emailHasChanged",
        "signUpEnabledListener",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "emailListener",
        "lookupEmail",
        "email",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onSignUpClick",
        "performSignup",
        "handleLookupResult",
        "lookupResult",
        "Lcom/stripe/android/link/account/LinkAuthResult;",
        "onNoLinkAccountFound",
        "Lkotlin/coroutines/Continuation;",
        "",
        "(Lcom/stripe/android/link/account/LinkAuthResult;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onAccountFetched",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "handle",
        "Lcom/stripe/android/link/account/LinkAuthResult$AccountError;",
        "onError",
        "error",
        "errorMessage",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "clearError",
        "updateState",
        "produceValue",
        "updateSignUpState",
        "signUpState",
        "Lcom/stripe/android/link/ui/signup/SignUpState;",
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

.field public static final Companion:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;

.field private static final LOOKUP_DEBOUNCE:J

.field public static final USE_LINK_CONFIGURATION_CUSTOMER_INFO:Ljava/lang/String; = "use_link_configuration_customer_info"


# instance fields
.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
            ">;"
        }
    .end annotation
.end field

.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private final customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

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

.field private final emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private emailHasChanged:Z

.field private final linkAuth:Lcom/stripe/android/link/account/LinkAuth;

.field private final linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

.field private final linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final moveToWeb:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private final navigateAndClearStack:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/link/LinkScreen;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
            ">;"
        }
    .end annotation
.end field

.field private final useLinkConfigurationCustomerInfo:Z


# direct methods
.method public static synthetic $r8$lambda$1cNKd_d7IsaMV1vTK5FW5b49Q58(Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->clearError$lambda$6(Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$V1UkOrD0nY-L_FKRmN8VCN_SmaI(Lcom/stripe/android/link/ui/signup/SignUpState;Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateSignUpState$lambda$7(Lcom/stripe/android/link/ui/signup/SignUpState;Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_wxYtjhJrGBA4y3gAA2g4c4eu7Q(Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onSignUpClick$lambda$3(Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$kRwgsk6IzAu_rNrIHV4eZMXqHyk(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError$lambda$5(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->Companion:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->$stable:I

    .line 293
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v0, 0x1

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    sput-wide v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->LOOKUP_DEBOUNCE:J

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAuth;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkDismissalCoordinator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/link/account/LinkAuth;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkScreen;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/link/LinkLaunchMode;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    move-object/from16 v2, p7

    move-object/from16 v3, p8

    move-object/from16 v4, p9

    move-object/from16 v5, p10

    const-string v6, "configuration"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "linkEventsReporter"

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "logger"

    invoke-static {p3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "linkAuth"

    invoke-static {p4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "savedStateHandle"

    invoke-static {p5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "dismissalCoordinator"

    invoke-static {p6, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "navigateAndClearStack"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "moveToWeb"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "linkLaunchMode"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "dismissWithResult"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 48
    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    .line 49
    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 50
    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkAuth:Lcom/stripe/android/link/account/LinkAuth;

    .line 51
    iput-object p5, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 52
    iput-object p6, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    .line 53
    iput-object v2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->navigateAndClearStack:Lkotlin/jvm/functions/Function1;

    .line 54
    iput-object v3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->moveToWeb:Lkotlin/jvm/functions/Function1;

    .line 55
    iput-object v4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    .line 56
    iput-object v5, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    .line 59
    const-string p3, "use_link_configuration_customer_info"

    invoke-virtual {p5, p3}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    :goto_0
    iput-boolean p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->useLinkConfigurationCustomerInfo:Z

    .line 60
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    move-object p4, v0

    :goto_1
    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    .line 62
    sget-object p3, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    if-eqz p4, :cond_2

    .line 63
    invoke-virtual {p4}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_2
    const/4 v2, 0x0

    const/4 v3, 0x2

    .line 62
    invoke-static {p3, v1, v2, v3, v0}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController$default(Lcom/stripe/android/uicore/elements/EmailConfig$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 65
    sget-object v1, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    if-eqz p4, :cond_3

    .line 66
    invoke-virtual {p4}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getPhone()Ljava/lang/String;

    move-result-object p3

    goto :goto_3

    :cond_3
    move-object p3, v0

    :goto_3
    if-nez p3, :cond_4

    const-string p3, ""

    :cond_4
    move-object v2, p3

    if-eqz p4, :cond_5

    .line 67
    invoke-virtual {p4}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getBillingCountryCode()Ljava/lang/String;

    move-result-object p3

    move-object v3, p3

    goto :goto_4

    :cond_5
    move-object v3, v0

    :goto_4
    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 65
    invoke-static/range {v1 .. v8}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    .line 69
    sget-object p3, Lcom/stripe/android/uicore/elements/NameConfig;->Companion:Lcom/stripe/android/uicore/elements/NameConfig$Companion;

    if-eqz p4, :cond_6

    .line 70
    invoke-virtual {p4}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_6
    move-object v1, v0

    .line 69
    :goto_5
    invoke-virtual {p3, v1}, Lcom/stripe/android/uicore/elements/NameConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 73
    sget-object p3, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->Companion:Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;

    invoke-virtual {p3, p1, p4}, Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;->create(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 74
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 79
    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/ViewModel;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p3

    new-instance p4, Lcom/stripe/android/link/ui/signup/SignUpViewModel$1;

    invoke-direct {p4, p0, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p4, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object p6, p4

    move/from16 p7, v1

    move-object/from16 p8, v2

    move-object p4, v3

    move-object p5, v4

    invoke-static/range {p3 .. p8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 82
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    new-instance p3, Lcom/stripe/android/link/ui/signup/SignUpViewModel$2;

    invoke-direct {p3, p0, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$2;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p3, Lkotlin/jvm/functions/Function2;

    const/4 p4, 0x3

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object p5, p1

    move-object/from16 p8, p3

    move/from16 p9, p4

    move-object/from16 p10, v0

    move-object p6, v1

    move-object/from16 p7, v2

    invoke-static/range {p5 .. p10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 85
    invoke-interface {p2}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onSignupFlowPresented()V

    return-void
.end method

.method public static final synthetic access$emailListener(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailListener(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getConfiguration$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Lcom/stripe/android/link/LinkConfiguration;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object p0
.end method

.method public static final synthetic access$getDismissalCoordinator$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Lcom/stripe/android/link/LinkDismissalCoordinator;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getEmailHasChanged$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Z
    .locals 0

    .line 46
    iget-boolean p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailHasChanged:Z

    return p0
.end method

.method public static final synthetic access$getLOOKUP_DEBOUNCE$cp()J
    .locals 2

    .line 46
    sget-wide v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->LOOKUP_DEBOUNCE:J

    return-wide v0
.end method

.method public static final synthetic access$getLinkAuth$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Lcom/stripe/android/link/account/LinkAuth;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkAuth:Lcom/stripe/android/link/account/LinkAuth;

    return-object p0
.end method

.method public static final synthetic access$handleLookupResult(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lcom/stripe/android/link/account/LinkAuthResult;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->handleLookupResult(Lcom/stripe/android/link/account/LinkAuthResult;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$lookupEmail(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->lookupEmail(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performSignup(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->performSignup(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setEmailHasChanged$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Z)V
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailHasChanged:Z

    return-void
.end method

.method public static final synthetic access$signUpEnabledListener(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->signUpEnabledListener(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lcom/stripe/android/link/ui/signup/SignUpState;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpState;)V

    return-void
.end method

.method public static final synthetic access$updateState(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final clearError()V
    .locals 1

    .line 278
    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final clearError$lambda$6(Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 11

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    .line 278
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->copy$default(Lcom/stripe/android/link/ui/signup/SignUpScreenState;Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method

.method private final emailListener(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    .line 107
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$2;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$2;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/FlowKt;->mapLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 109
    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

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

.method private final handle(Lcom/stripe/android/link/account/LinkAuthResult$AccountError;)V
    .locals 1

    .line 256
    sget-object v0, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPrimaryField:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpState;)V

    .line 258
    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;->getError()Ljava/lang/Throwable;

    move-result-object p1

    .line 259
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_signup_deactivated_account_message:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 257
    invoke-direct {p0, p1, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method private final handleLookupResult(Lcom/stripe/android/link/account/LinkAuthResult;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/account/LinkAuthResult;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 215
    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;

    if-eqz v0, :cond_0

    .line 216
    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->moveToWeb:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 218
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAuthResult$Error;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 219
    sget-object p2, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-direct {p0, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpState;)V

    .line 220
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$Error;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$Error;->getError()Ljava/lang/Throwable;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p0, p1, v1, p2, v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError$default(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    goto :goto_0

    .line 222
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/link/account/LinkAuthResult$Success;

    if-eqz v0, :cond_2

    .line 223
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$Success;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$Success;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onAccountFetched(Lcom/stripe/android/link/model/LinkAccount;)V

    .line 224
    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-static {p1, p2, p3, v1}, Lcom/stripe/android/link/analytics/LinkEventsReporter$DefaultImpls;->onSignupCompleted$default(Lcom/stripe/android/link/analytics/LinkEventsReporter;ZILjava/lang/Object;)V

    goto :goto_0

    .line 226
    :cond_2
    sget-object v0, Lcom/stripe/android/link/account/LinkAuthResult$NoLinkAccountFound;->INSTANCE:Lcom/stripe/android/link/account/LinkAuthResult$NoLinkAccountFound;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 227
    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 229
    :cond_4
    instance-of p2, p1, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;

    if-eqz p2, :cond_5

    .line 230
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->handle(Lcom/stripe/android/link/account/LinkAuthResult$AccountError;)V

    .line 233
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 214
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final lookupEmail(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;

    iget v1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p2, v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 128
    iget v1, v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->label:I

    const/4 v7, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 129
    sget-object p2, Lcom/stripe/android/link/ui/signup/SignUpState;->VerifyingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-direct {p0, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpState;)V

    .line 131
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkAuth:Lcom/stripe/android/link/account/LinkAuth;

    .line 133
    sget-object v3, Lcom/stripe/android/model/EmailSource;->USER_ACTION:Lcom/stripe/android/model/EmailSource;

    .line 135
    iget-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerIdForEceDefaultValues()Ljava/lang/String;

    move-result-object v5

    .line 131
    iput-object p0, v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->L$0:Ljava/lang/Object;

    iput v2, v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->label:I

    const/4 v4, 0x1

    move-object v2, p1

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAuth;->lookUp(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    .line 128
    :goto_1
    check-cast p2, Lcom/stripe/android/link/account/LinkAuthResult;

    .line 138
    sget-object v1, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPrimaryField:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-direct {p1, v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpState;)V

    .line 140
    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$2;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iput-object v2, v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->L$0:Ljava/lang/Object;

    iput v7, v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupEmail$1;->label:I

    invoke-direct {p1, p2, v1, v6}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->handleLookupResult(Lcom/stripe/android/link/account/LinkAuthResult;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    .line 148
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final onAccountFetched(Lcom/stripe/android/link/model/LinkAccount;)V
    .locals 7

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 237
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getCompletedSignup()Z

    move-result v1

    if-ne v1, v0, :cond_0

    sget-object v0, Lcom/stripe/android/link/LinkScreen$PaymentMethod;->INSTANCE:Lcom/stripe/android/link/LinkScreen$PaymentMethod;

    check-cast v0, Lcom/stripe/android/link/LinkScreen;

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 238
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->isVerified()Z

    move-result v1

    if-ne v1, v0, :cond_1

    sget-object v0, Lcom/stripe/android/link/LinkScreen$Wallet;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Wallet;

    check-cast v0, Lcom/stripe/android/link/LinkScreen;

    goto :goto_0

    .line 239
    :cond_1
    sget-object v0, Lcom/stripe/android/link/LinkScreen$Verification;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Verification;

    check-cast v0, Lcom/stripe/android/link/LinkScreen;

    .line 243
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    instance-of v1, v1, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    if-eqz v1, :cond_2

    sget-object v1, Lcom/stripe/android/link/LinkScreen$Verification;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Verification;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 244
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    .line 245
    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    .line 246
    new-instance v2, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v2, p1, v4, v3, v4}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/link/LinkAccountUpdate;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 245
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/LinkActivityResult$Completed;-><init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 251
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->navigateAndClearStack:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final onError(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 268
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "SignUpViewModel Error: "

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 270
    :cond_0
    new-instance p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda3;

    invoke-direct {p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/core/strings/ResolvableString;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method static synthetic onError$default(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    if-eqz p1, :cond_0

    .line 265
    invoke-static {p1}, Lcom/stripe/android/common/exception/ExceptionKtKt;->stripeErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 263
    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method

.method private static final onError$lambda$5(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 11

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, p0

    move-object v1, p1

    .line 271
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->copy$default(Lcom/stripe/android/link/ui/signup/SignUpScreenState;Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method

.method private static final onSignUpClick$lambda$3(Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 11

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x5f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    .line 172
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->copy$default(Lcom/stripe/android/link/ui/signup/SignUpScreenState;Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method

.method private final performSignup(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
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

    instance-of v0, p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;

    iget v1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    iget-object p1, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 176
    iget v1, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->label:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v9, :cond_1

    iget-boolean v1, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->Z$0:Z

    iget-object v0, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->L$1:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/LinkDismissalCoordinator;

    iget-object v0, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 177
    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    .line 333
    invoke-interface {p1}, Lcom/stripe/android/link/LinkDismissalCoordinator;->getCanDismiss()Z

    move-result v10

    .line 334
    invoke-interface {p1, v8}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 178
    :try_start_1
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkAuth:Lcom/stripe/android/link/account/LinkAuth;

    .line 179
    iget-object v2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 180
    iget-object v3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    invoke-interface {v4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getE164PhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 181
    iget-object v4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object v4

    .line 182
    iget-object v5, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    invoke-interface {v5}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 183
    sget-object v6, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->Implied:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    .line 178
    iput-object p0, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->L$0:Ljava/lang/Object;

    iput-object p1, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->L$1:Ljava/lang/Object;

    iput-boolean v10, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->Z$0:Z

    iput v9, v7, Lcom/stripe/android/link/ui/signup/SignUpViewModel$performSignup$1;->label:I

    invoke-interface/range {v1 .. v7}, Lcom/stripe/android/link/account/LinkAuth;->signUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p0

    move-object v2, p1

    move-object p1, v1

    move v1, v10

    .line 176
    :goto_1
    :try_start_2
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 338
    invoke-interface {v2, v1}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    .line 188
    instance-of v1, p1, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;

    if-eqz v1, :cond_4

    .line 189
    iget-object v0, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->moveToWeb:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$AttestationFailed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 191
    :cond_4
    instance-of v1, p1, Lcom/stripe/android/link/account/LinkAuthResult$Error;

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    .line 192
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$Error;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$Error;->getError()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError$default(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    .line 193
    iget-object v0, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$Error;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v0, v8, p1, v9, v3}, Lcom/stripe/android/link/analytics/LinkEventsReporter$DefaultImpls;->onSignupFailure$default(Lcom/stripe/android/link/analytics/LinkEventsReporter;ZLjava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_2

    .line 195
    :cond_5
    instance-of v1, p1, Lcom/stripe/android/link/account/LinkAuthResult$Success;

    if-eqz v1, :cond_6

    .line 196
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$Success;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAuthResult$Success;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onAccountFetched(Lcom/stripe/android/link/model/LinkAccount;)V

    .line 197
    iget-object p1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-static {p1, v8, v9, v3}, Lcom/stripe/android/link/analytics/LinkEventsReporter$DefaultImpls;->onSignupCompleted$default(Lcom/stripe/android/link/analytics/LinkEventsReporter;ZILjava/lang/Object;)V

    goto :goto_2

    .line 199
    :cond_6
    sget-object v1, Lcom/stripe/android/link/account/LinkAuthResult$NoLinkAccountFound;->INSTANCE:Lcom/stripe/android/link/account/LinkAuthResult$NoLinkAccountFound;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 200
    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1, v3, v2, v3}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError$default(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    .line 201
    iget-object p1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    new-instance v0, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {v0}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {p1, v8, v0, v9, v3}, Lcom/stripe/android/link/analytics/LinkEventsReporter$DefaultImpls;->onSignupFailure$default(Lcom/stripe/android/link/analytics/LinkEventsReporter;ZLjava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_2

    .line 203
    :cond_7
    instance-of v1, p1, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;

    if-eqz v1, :cond_8

    .line 204
    check-cast p1, Lcom/stripe/android/link/account/LinkAuthResult$AccountError;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->handle(Lcom/stripe/android/link/account/LinkAuthResult$AccountError;)V

    .line 207
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 187
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :catchall_1
    move-exception v0

    move-object v2, p1

    move-object p1, v0

    move v1, v10

    .line 338
    :goto_3
    invoke-interface {v2, v1}, Lcom/stripe/android/link/LinkDismissalCoordinator;->setDismissible(Z)V

    throw p1
.end method

.method private final signUpEnabledListener(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
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

    .line 90
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFieldState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 325
    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$signUpEnabledListener$$inlined$map$1;

    invoke-direct {v1, v0, p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$signUpEnabledListener$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    .line 97
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFieldState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 330
    new-instance v2, Lcom/stripe/android/link/ui/signup/SignUpViewModel$signUpEnabledListener$$inlined$map$2;

    invoke-direct {v2, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$signUpEnabledListener$$inlined$map$2;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    .line 98
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 89
    new-instance v3, Lcom/stripe/android/link/ui/signup/SignUpViewModel$signUpEnabledListener$4;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$signUpEnabledListener$4;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function4;

    invoke-static {v1, v2, v0, v3}, Lkotlinx/coroutines/flow/FlowKt;->combine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 101
    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$signUpEnabledListener$5;

    invoke-direct {v1, p0, v4}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$signUpEnabledListener$5;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

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

.method private final updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpState;)V
    .locals 1

    .line 286
    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpState;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final updateSignUpState$lambda$7(Lcom/stripe/android/link/ui/signup/SignUpState;Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 11

    const-string v0, "old"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x6f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p0

    move-object v1, p1

    .line 287
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;->copy$default(Lcom/stripe/android/link/ui/signup/SignUpScreenState;Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p0

    return-object p0
.end method

.method private final updateState(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
            "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
            ">;)V"
        }
    .end annotation

    .line 282
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 340
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 341
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 342
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method


# virtual methods
.method public final getEmailController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final getNameController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final getPhoneNumberController()Lcom/stripe/android/uicore/elements/PhoneNumberController;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    return-object v0
.end method

.method public final getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final onSignUpClick()V
    .locals 7

    .line 151
    invoke-direct {p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->clearError()V

    .line 152
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$onSignUpClick$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$onSignUpClick$1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 171
    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda2;-><init>()V

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->updateState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
