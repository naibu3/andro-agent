.class public final Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "PaymentMethodViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentMethodViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,215:1\n230#2,5:216\n230#2,5:221\n230#2,5:226\n230#2,5:231\n*S KotlinDebug\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel\n*L\n70#1:216,5\n148#1:221,5\n154#1:226,5\n162#1:231,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B]\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u00152\u0008\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0015J*\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u0008\u0010&\u001a\u0004\u0018\u00010\'2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u0082@\u00a2\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020+H\u0002J\u0008\u0010,\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006."
    }
    d2 = {
        "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "completeLinkFlow",
        "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "formHelper",
        "Lcom/stripe/android/paymentsheet/FormHelper;",
        "dismissalCoordinator",
        "Lcom/stripe/android/link/LinkDismissalCoordinator;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "dismissWithResult",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/FormHelper;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;)V",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "formValuesChanged",
        "formValues",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "onPayClicked",
        "attemptCompletion",
        "paymentDetails",
        "Lcom/stripe/android/link/LinkPaymentDetails;",
        "cvc",
        "",
        "billingPhone",
        "(Lcom/stripe/android/link/LinkPaymentDetails;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateButtonState",
        "Lcom/stripe/android/link/ui/PrimaryButtonState;",
        "clearErrorMessage",
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

.field public static final Companion:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;


# instance fields
.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;",
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

.field private final formHelper:Lcom/stripe/android/paymentsheet/FormHelper;

.field private final linkAccount:Lcom/stripe/android/link/model/LinkAccount;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->Companion:Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/FormHelper;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkConfiguration;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/paymentsheet/FormHelper;",
            "Lcom/stripe/android/link/LinkDismissalCoordinator;",
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

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    move-object/from16 v3, p9

    const-string v4, "configuration"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkAccount"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkAccountManager"

    invoke-static {p3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "completeLinkFlow"

    invoke-static {p4, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "logger"

    invoke-static {p5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "formHelper"

    invoke-static {p6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "dismissalCoordinator"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "linkLaunchMode"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "dismissWithResult"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 41
    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    .line 42
    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 43
    iput-object p4, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->completeLinkFlow:Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    .line 44
    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->logger:Lcom/stripe/android/core/Logger;

    .line 45
    iput-object p6, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->formHelper:Lcom/stripe/android/paymentsheet/FormHelper;

    .line 46
    iput-object v1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    .line 47
    iput-object v2, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    .line 48
    iput-object v3, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    .line 52
    sget-object p2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p2, p2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-interface {p6, p2}, Lcom/stripe/android/paymentsheet/FormHelper;->formElementsForCode(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    .line 53
    sget-object p3, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p3, p3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-interface {p6, p3}, Lcom/stripe/android/paymentsheet/FormHelper;->createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v1

    .line 54
    sget-object v3, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    .line 55
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    invoke-static {p1, v2}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->completePaymentButtonLabel(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    .line 51
    new-instance v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p2

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/link/ui/PrimaryButtonState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/strings/ResolvableString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 59
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public static final synthetic access$attemptCompletion(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/link/LinkPaymentDetails;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->attemptCompletion(Lcom/stripe/android/link/LinkPaymentDetails;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$clearErrorMessage(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->clearErrorMessage()V

    return-void
.end method

.method public static final synthetic access$getConfiguration$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/LinkConfiguration;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    return-object p0
.end method

.method public static final synthetic access$getDismissalCoordinator$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/LinkDismissalCoordinator;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->dismissalCoordinator:Lcom/stripe/android/link/LinkDismissalCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$getLinkLaunchMode$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/link/LinkLaunchMode;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->linkLaunchMode:Lcom/stripe/android/link/LinkLaunchMode;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$updateButtonState(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/link/ui/PrimaryButtonState;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->updateButtonState(Lcom/stripe/android/link/ui/PrimaryButtonState;)V

    return-void
.end method

.method private final attemptCompletion(Lcom/stripe/android/link/LinkPaymentDetails;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentDetails;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;

    iget v1, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;-><init>(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 133
    iget v2, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 138
    iget-object p4, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->completeLinkFlow:Lcom/stripe/android/link/confirmation/CompleteLinkFlow;

    .line 139
    new-instance v2, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;

    invoke-direct {v2, p1, p2, p3}, Lcom/stripe/android/link/LinkPaymentMethod$LinkPaymentDetails;-><init>(Lcom/stripe/android/link/LinkPaymentDetails;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v2, Lcom/stripe/android/link/LinkPaymentMethod;

    .line 144
    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    .line 138
    iput-object p0, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$attemptCompletion$1;->label:I

    invoke-interface {p4, v2, p1, v0}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow;->invoke(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 133
    :goto_1
    check-cast p4, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;

    .line 147
    instance-of p2, p4, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Canceled;

    if-nez p2, :cond_7

    .line 148
    instance-of p2, p4, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;

    if-eqz p2, :cond_5

    iget-object p2, p1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 222
    :cond_4
    invoke-interface {p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 223
    move-object v0, p1

    check-cast v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    .line 148
    move-object p3, p4

    check-cast p3, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;

    invoke-virtual {p3}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Failed;->getError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v6

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->copy$default(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/link/ui/PrimaryButtonState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    move-result-object p3

    .line 224
    invoke-interface {p2, p1, p3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    .line 149
    :cond_5
    instance-of p2, p4, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    if-eqz p2, :cond_6

    iget-object p1, p1, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->dismissWithResult:Lkotlin/jvm/functions/Function1;

    check-cast p4, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;

    invoke-virtual {p4}, Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result$Completed;->getLinkActivityResult()Lcom/stripe/android/link/LinkActivityResult;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 146
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 151
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final clearErrorMessage()V
    .locals 11

    .line 162
    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 232
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 233
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    const/16 v9, 0x1f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 163
    invoke-static/range {v2 .. v10}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->copy$default(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/link/ui/PrimaryButtonState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    move-result-object v2

    .line 234
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final updateButtonState(Lcom/stripe/android/link/ui/PrimaryButtonState;)V
    .locals 11

    .line 154
    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 227
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 228
    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    const/16 v9, 0x3b

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p1

    .line 155
    invoke-static/range {v2 .. v10}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->copy$default(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/link/ui/PrimaryButtonState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    move-result-object p1

    .line 229
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v5

    goto :goto_0
.end method


# virtual methods
.method public final formValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)V
    .locals 11

    .line 62
    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->formHelper:Lcom/stripe/android/paymentsheet/FormHelper;

    .line 64
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    .line 62
    invoke-interface {v0, p1, v1}, Lcom/stripe/android/paymentsheet/FormHelper;->getPaymentMethodParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v7

    .line 66
    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->formHelper:Lcom/stripe/android/paymentsheet/FormHelper;

    .line 68
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    .line 66
    invoke-interface {v0, p1, v1}, Lcom/stripe/android/paymentsheet/FormHelper;->onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V

    .line 70
    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 217
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 218
    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    if-eqz v7, :cond_1

    .line 74
    sget-object v1, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_0

    .line 76
    :cond_1
    sget-object v1, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    :goto_0
    move-object v5, v1

    const/16 v9, 0x2b

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 71
    invoke-static/range {v2 .. v10}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->copy$default(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Ljava/util/List;Lcom/stripe/android/link/ui/PrimaryButtonState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    move-result-object v1

    .line 219
    invoke-interface {p1, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final onPayClicked()V
    .locals 9

    .line 83
    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "PaymentMethodViewModel: onPayClicked without paymentMethodCreateParams"

    const/4 v3, 0x2

    invoke-static {v0, v2, v1, v3, v1}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void

    .line 88
    :cond_0
    move-object v2, p0

    check-cast v2, Landroidx/lifecycle/ViewModel;

    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v3

    new-instance v2, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;

    invoke-direct {v2, p0, v0, v1}, Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$onPayClicked$1;-><init>(Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method
