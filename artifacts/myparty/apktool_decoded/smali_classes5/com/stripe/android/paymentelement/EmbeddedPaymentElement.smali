.class public final Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElement.kt"


# annotations
.annotation runtime Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementScope;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Companion;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$FormSheetAction;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;,
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmbeddedPaymentElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedPaymentElement.kt\ncom/stripe/android/paymentelement/EmbeddedPaymentElement\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,719:1\n81#2:720\n81#2:721\n*S KotlinDebug\n*F\n+ 1 EmbeddedPaymentElement.kt\ncom/stripe/android/paymentelement/EmbeddedPaymentElement\n*L\n91#1:720\n102#1:721\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0008\u0007\u0018\u0000 62\u00020\u0001:\n-./0123456B9\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u0010&J\r\u0010\'\u001a\u00020(H\u0007\u00a2\u0006\u0002\u0010)J\r\u0010*\u001a\u00020(H\u0007\u00a2\u0006\u0002\u0010)J\u0006\u0010+\u001a\u00020(J\u0006\u0010,\u001a\u00020(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R5\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d*\u0004\u0008\u0018\u0010\u0019\u00a8\u00067\u00b2\u0006\u000c\u00108\u001a\u0004\u0018\u000109X\u008a\u0084\u0002\u00b2\u0006\u000c\u0010:\u001a\u0004\u0018\u00010;X\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;",
        "",
        "confirmationHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;",
        "contentHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;",
        "selectionHolder",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;",
        "paymentOptionDisplayDataHolder",
        "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;",
        "configurationCoordinator",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;",
        "stateHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
        "<init>",
        "(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)V",
        "paymentOption",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
        "getPaymentOption",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "<set-?>",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;",
        "state",
        "getState$delegate",
        "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Ljava/lang/Object;",
        "getState",
        "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;",
        "setState",
        "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;)V",
        "state$receiver",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
        "configure",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult;",
        "intentConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "configuration",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "WalletButtons",
        "",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Content",
        "confirm",
        "clearPaymentOption",
        "Builder",
        "Configuration",
        "FormSheetAction",
        "ConfigureResult",
        "PaymentOptionDisplayData",
        "Result",
        "ResultCallback",
        "RowSelectionBehavior",
        "State",
        "Companion",
        "paymentsheet_release",
        "walletButtonsContent",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;",
        "embeddedContent",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;"
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

.field public static final Companion:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Companion;


# instance fields
.field private final configurationCoordinator:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;

.field private final confirmationHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;

.field private final contentHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;

.field private final paymentOption:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
            ">;"
        }
    .end annotation
.end field

.field private final selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

.field private final state$receiver:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;


# direct methods
.method public static synthetic $r8$lambda$XxYMNrWtZGXgnv2o8sJjnK2mwk4(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->Content$lambda$3(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fjXyGpTQAab1p2c8EOIgfoHp8pg(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->WalletButtons$lambda$1(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->Companion:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "confirmationHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionDisplayDataHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationCoordinator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateHelper"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->confirmationHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;

    .line 50
    iput-object p2, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->contentHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;

    .line 51
    iput-object p3, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    .line 53
    iput-object p5, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->configurationCoordinator:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;

    .line 61
    invoke-interface {p4}, Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;->getPaymentOption()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->paymentOption:Lkotlinx/coroutines/flow/StateFlow;

    .line 68
    iput-object p6, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->state$receiver:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    return-void
.end method

.method private static final Content$lambda$2(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;"
        }
    .end annotation

    .line 721
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;

    return-object p0
.end method

.method private static final Content$lambda$3(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->Content(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final WalletButtons$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;"
        }
    .end annotation

    .line 720
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;

    return-object p0
.end method

.method private static final WalletButtons$lambda$1(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->WalletButtons(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static getState$delegate(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Ljava/lang/Object;
    .locals 6

    .line 68
    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference0Impl;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->state$receiver:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    const-class v2, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    const-string v4, "getState()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;"

    const/4 v5, 0x0

    const-string v3, "state"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/MutablePropertyReference0Impl;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    check-cast v0, Lkotlin/jvm/internal/MutablePropertyReference0;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty0(Lkotlin/jvm/internal/MutablePropertyReference0;)Lkotlin/reflect/KMutableProperty0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final Content(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    const v0, 0x2c8581c8

    .line 101
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    .line 104
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_4

    .line 101
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentelement.EmbeddedPaymentElement.Content (EmbeddedPaymentElement.kt:100)"

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 102
    :cond_4
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->contentHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;

    invoke-interface {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;->getEmbeddedContent()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, p1, v3, v2}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 103
    invoke-static {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->Content$lambda$2(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0, p1, v3}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;->Content(Landroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 104
    :cond_6
    :goto_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_7
    return-void
.end method

.method public final WalletButtons(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    const v0, -0x5ff011e9

    .line 90
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    .line 93
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_4

    .line 90
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentelement.EmbeddedPaymentElement.WalletButtons (EmbeddedPaymentElement.kt:89)"

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 91
    :cond_4
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->contentHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;

    invoke-interface {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContentHelper;->getWalletButtonsContent()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, p1, v3, v2}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 92
    invoke-static {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->WalletButtons$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0, p1, v3}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->Content(Landroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 93
    :cond_6
    :goto_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_7
    return-void
.end method

.method public final clearPaymentOption()V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->selectionHolder:Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;->set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    return-void
.end method

.method public final configure(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ConfigureResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->configurationCoordinator:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;

    invoke-interface {v0, p1, p2, p3}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfigurationCoordinator;->configure(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final confirm()V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->confirmationHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;

    invoke-interface {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;->confirm()V

    return-void
.end method

.method public final getPaymentOption()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;",
            ">;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->paymentOption:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getState()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->state$receiver:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    invoke-interface {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;->getState()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;

    move-result-object v0

    return-object v0
.end method

.method public final setState(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->state$receiver:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;->setState(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;)V

    return-void
.end method
