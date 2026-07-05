.class public final Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;
.super Ljava/lang/Object;
.source "EmbeddedConfirmationHelper.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;


# annotations
.annotation runtime Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementScope;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B9\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;",
        "confirmationStarter",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "confirmationStateHolder",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "embeddedResultCallbackHelper",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;",
        "<init>",
        "(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;)V",
        "confirm",
        "",
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
.field private final activityResultCaller:Landroidx/activity/result/ActivityResultCaller;

.field private final confirmationStarter:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;

.field private final confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

.field private final embeddedResultCallbackHelper:Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;)V
    .locals 6
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "confirmationStarter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultCaller"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationStateHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedResultCallbackHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->confirmationStarter:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;

    .line 23
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->activityResultCaller:Landroidx/activity/result/ActivityResultCaller;

    .line 24
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    .line 25
    iput-object p4, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    .line 26
    iput-object p5, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 27
    iput-object p6, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->embeddedResultCallbackHelper:Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;

    .line 30
    invoke-virtual {p1, p2, p3}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;->register(Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/LifecycleOwner;)V

    .line 35
    invoke-static {p3}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    new-instance p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper$1;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getConfirmationStarter$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->confirmationStarter:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;

    return-object p0
.end method

.method public static final synthetic access$getConfirmationStateHolder$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    return-object p0
.end method

.method public static final synthetic access$getEmbeddedResultCallbackHelper$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->embeddedResultCallbackHelper:Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;

    return-object p0
.end method

.method public static final synthetic access$getEventReporter$p(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    return-object p0
.end method

.method private final confirmationArgs()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 11

    .line 54
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->confirmationStateHolder:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder;->getState()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 55
    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 56
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/common/model/CommonConfigurationKt;->asCommonConfiguration(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;)Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v3

    .line 57
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v1

    .line 55
    :goto_0
    invoke-static {v2, v3, v4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object v7

    if-nez v7, :cond_2

    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v6

    .line 63
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v9

    .line 64
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getAppearance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v8

    .line 65
    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->getConfiguration()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;->getShippingDetails$paymentsheet_release()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v10

    .line 60
    new-instance v5, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-object v5

    :cond_3
    :goto_1
    return-object v1
.end method


# virtual methods
.method public confirm()V
    .locals 4

    .line 44
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->confirmationArgs()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->confirmationStarter:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;

    invoke-virtual {v1, v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStarter;->start(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;)V

    return-void

    .line 46
    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;

    .line 47
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;->embeddedResultCallbackHelper:Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;

    .line 48
    new-instance v1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Not in a state that\'s confirmable."

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    .line 47
    invoke-interface {v0, v1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;->setResult(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V

    return-void
.end method
