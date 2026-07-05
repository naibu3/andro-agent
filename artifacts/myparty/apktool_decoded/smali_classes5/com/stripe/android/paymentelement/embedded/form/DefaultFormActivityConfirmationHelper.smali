.class public final Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;
.super Ljava/lang/Object;
.source "FormActivityConfirmationHelper.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;


# annotations
.annotation runtime Lcom/stripe/android/paymentelement/embedded/form/FormActivityScope;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001Bc\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "configuration",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;",
        "selectionHolder",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "stateHelper",
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;",
        "onClickDelegate",
        "Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultCaller;Lkotlinx/coroutines/CoroutineScope;)V",
        "confirm",
        "Lcom/stripe/android/paymentelement/embedded/form/FormResult;",
        "confirmationArgs",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;",
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
.field private final configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

.field private final confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

.field private final onClickDelegate:Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;

.field private final paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

.field private final selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

.field private final stateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultCaller;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 1
    .param p11    # Lkotlinx/coroutines/CoroutineScope;
        .annotation runtime Lcom/stripe/android/core/injection/ViewModelScope;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "initializationMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClickDelegate"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultCaller"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    .line 27
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 28
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    .line 29
    iput-object p4, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    .line 30
    iput-object p5, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    .line 31
    iput-object p6, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->stateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    .line 32
    iput-object p7, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->onClickDelegate:Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;

    .line 33
    iput-object p8, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 36
    iput-object p11, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 40
    invoke-interface {p3, p10, p9}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V

    .line 41
    invoke-static {p9}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lkotlinx/coroutines/CoroutineScope;

    new-instance p1, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper$1;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper$1;-><init>(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;Lkotlin/coroutines/Continuation;)V

    move-object p5, p1

    check-cast p5, Lkotlin/jvm/functions/Function2;

    const/4 p6, 0x3

    const/4 p7, 0x0

    const/4 p4, 0x0

    invoke-static/range {p2 .. p7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getConfirmationHandler$p(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    return-object p0
.end method

.method public static final synthetic access$getStateHelper$p(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->stateHelper:Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;

    return-object p0
.end method

.method private final confirmationArgs()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 10

    .line 74
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 75
    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    invoke-static {v2}, Lcom/stripe/android/common/model/CommonConfigurationKt;->asCommonConfiguration(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v2

    .line 76
    iget-object v3, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v1

    .line 74
    :goto_0
    invoke-static {v0, v2, v3}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_1

    .line 78
    :cond_1
    new-instance v4, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    .line 79
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v5

    .line 81
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getAppearance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v7

    .line 82
    iget-object v8, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    .line 83
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->paymentMethodMetadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v9

    .line 78
    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-object v4

    :cond_2
    :goto_1
    return-object v1
.end method


# virtual methods
.method public confirm()Lcom/stripe/android/paymentelement/embedded/form/FormResult;
    .locals 8

    .line 49
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->onClickDelegate:Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;

    invoke-interface {v0}, Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;->getOnClickOverride()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->onClickDelegate:Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;

    invoke-interface {v0}, Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;->getOnClickOverride()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    if-eqz v0, :cond_1

    .line 53
    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v2, v0}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPressConfirmButton(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->configuration:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getFormSheetAction$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;

    move-result-object v0

    sget-object v2, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    .line 61
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->confirmationArgs()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 62
    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v3, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper$confirm$2$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper$confirm$2$1;-><init>(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)V

    move-object v5, v3

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    :cond_2
    :goto_0
    return-object v1

    .line 56
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 58
    :cond_4
    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->getSelection()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Complete;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Z)V

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/form/FormResult;

    return-object v0
.end method
