.class public final Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;
.super Ljava/lang/Object;
.source "WalletButtonsInteractor.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;,
        Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;,
        Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalletButtonsInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletButtonsInteractor.kt\ncom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1611#2,9:371\n1863#2:380\n1864#2:382\n1620#2:383\n1#3:381\n*S KotlinDebug\n*F\n+ 1 WalletButtonsInteractor.kt\ncom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor\n*L\n145#1:371,9\n145#1:380\n145#1:382\n145#1:383\n145#1:381\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u0000 ,2\u00020\u0001:\u0002+,Bj\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u00170\u0012\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0004H\u0002J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u0004H\u0002J\u001a\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u0004H\u0002R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0008(\u0016\u0012\u0004\u0012\u00020\u00170\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;",
        "arguments",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "linkInlineInteractor",
        "Lcom/stripe/android/link/verification/LinkInlineInteractor;",
        "linkPaymentLauncher",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkAccountHolder",
        "Lcom/stripe/android/link/account/LinkAccountHolder;",
        "onWalletButtonsRenderStateChanged",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "isRendered",
        "",
        "<init>",
        "(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/link/verification/LinkInlineInteractor;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;Lkotlin/jvm/functions/Function1;)V",
        "state",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "setupLink",
        "args",
        "handleViewAction",
        "action",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;",
        "handleLinkButtonPressed",
        "handleButtonPressed",
        "button",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;",
        "confirmationArgs",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "Arguments",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;


# instance fields
.field private final arguments:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;",
            ">;"
        }
    .end annotation
.end field

.field private final confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

.field private final linkInlineInteractor:Lcom/stripe/android/link/verification/LinkInlineInteractor;

.field private final linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

.field private final onWalletButtonsRenderStateChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$c4nHC_hMh7vur7d9HFo4uhf8rJ0(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;Lcom/stripe/android/link/verification/LinkInlineState;Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->state$lambda$8(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;Lcom/stripe/android/link/verification/LinkInlineState;Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->Companion:Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/link/verification/LinkInlineInteractor;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkAccountHolder;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;",
            ">;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            "Lcom/stripe/android/link/verification/LinkInlineInteractor;",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "Lcom/stripe/android/link/account/LinkAccountHolder;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkInlineInteractor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkPaymentLauncher"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountHolder"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onWalletButtonsRenderStateChanged"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->arguments:Lkotlinx/coroutines/flow/StateFlow;

    .line 122
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    .line 123
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 124
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 125
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkInlineInteractor:Lcom/stripe/android/link/verification/LinkInlineInteractor;

    .line 126
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    .line 127
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    .line 128
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->onWalletButtonsRenderStateChanged:Lkotlin/jvm/functions/Function1;

    .line 132
    new-instance p4, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$1;

    const/4 p6, 0x0

    invoke-direct {p4, p0, p6}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;Lkotlin/coroutines/Continuation;)V

    move-object v3, p4

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 140
    invoke-interface {p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    .line 141
    invoke-interface {p5}, Lcom/stripe/android/link/verification/LinkInlineInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    .line 142
    invoke-virtual {p7}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    .line 138
    new-instance p5, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$$ExternalSyntheticLambda0;

    invoke-direct {p5, p0}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;)V

    invoke-static {p1, p2, p3, p4, p5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public static final synthetic access$getArguments$p(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 120
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->arguments:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getConfirmationHandler$p(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;
    .locals 0

    .line 120
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->confirmationHandler:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;

    return-object p0
.end method

.method public static final synthetic access$setupLink(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)V
    .locals 0

    .line 120
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->setupLink(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)V

    return-void
.end method

.method private final confirmationArgs(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;
    .locals 9

    .line 265
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getConfiguration()Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v0

    .line 266
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 264
    :goto_0
    invoke-static {p1, v0, v1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object v5

    if-nez v5, :cond_1

    return-object v2

    .line 270
    :cond_1
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    .line 272
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-result-object v7

    .line 273
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getAppearance()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object v6

    .line 274
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getConfiguration()Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v8

    .line 269
    new-instance v3, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-object v3
.end method

.method private final handleButtonPressed(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)V
    .locals 6

    .line 249
    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;->createSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->confirmationArgs(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 250
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance p2, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$handleButtonPressed$1$1;

    const/4 v1, 0x0

    invoke-direct {p2, p0, p1, v1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$handleButtonPressed$1$1;-><init>(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)V

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 253
    :cond_1
    :goto_0
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;

    .line 254
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 255
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 254
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 253
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-void
.end method

.method private final handleLinkButtonPressed(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)V
    .locals 10

    .line 227
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_4

    .line 229
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object p1

    instance-of v2, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-eqz v2, :cond_1

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_2

    .line 230
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->getSelectedPayment()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v1

    .line 232
    :goto_2
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkPaymentLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    .line 234
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkAccountHolder:Lcom/stripe/android/link/account/LinkAccountHolder;

    invoke-virtual {v3}, Lcom/stripe/android/link/account/LinkAccountHolder;->getLinkAccountInfo()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    .line 235
    new-instance v4, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentMethod;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v1

    :cond_3
    move-object v5, v1

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/link/LinkLaunchMode;

    .line 236
    sget-object p1, Lcom/stripe/android/link/LinkExpressMode;->ENABLED:Lcom/stripe/android/link/LinkExpressMode;

    .line 232
    invoke-virtual {v2, v0, v3, v4, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->present(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkExpressMode;)V

    return-void

    .line 240
    :cond_4
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$Link;

    .line 241
    sget-object v1, Lcom/stripe/android/link/ui/LinkButtonState$Default;->INSTANCE:Lcom/stripe/android/link/ui/LinkButtonState$Default;

    check-cast v1, Lcom/stripe/android/link/ui/LinkButtonState;

    .line 240
    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$Link;-><init>(Lcom/stripe/android/link/ui/LinkButtonState;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;

    .line 239
    invoke-direct {p0, v0, p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->handleButtonPressed(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)V

    return-void
.end method

.method private final setupLink(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)V
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkInlineInteractor:Lcom/stripe/android/link/verification/LinkInlineInteractor;

    .line 201
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object p1

    .line 200
    invoke-interface {v0, p1}, Lcom/stripe/android/link/verification/LinkInlineInteractor;->setup(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V

    return-void
.end method

.method private static final state$lambda$8(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;Lcom/stripe/android/link/verification/LinkInlineState;Lcom/stripe/android/link/LinkAccountUpdate$Value;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;
    .locals 9

    const-string v0, "confirmationState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkEmbeddedState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountInfo"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_c

    .line 145
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getAvailableWallets()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 371
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 380
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 379
    check-cast v4, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    .line 146
    sget-object v5, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->ordinal()I

    move-result v4

    aget v4, v5, v4

    if-eq v4, v0, :cond_8

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    const/4 v5, 0x3

    if-ne v4, v5, :cond_2

    .line 173
    sget-object v4, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$ShopPay;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$ShopPay;

    .line 174
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getWalletsAllowedByMerchant()Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->ShopPay:Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v1

    .line 173
    :goto_1
    check-cast v4, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;

    goto/16 :goto_7

    .line 146
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 159
    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getPaymentMethodMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v4

    goto :goto_2

    :cond_4
    move-object v4, v1

    .line 160
    :goto_2
    new-instance v5, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$Link;

    .line 161
    sget-object v6, Lcom/stripe/android/link/ui/LinkButtonState;->Companion:Lcom/stripe/android/link/ui/LinkButtonState$Companion;

    const/4 v7, 0x0

    if-eqz v4, :cond_5

    .line 162
    invoke-virtual {v4}, Lcom/stripe/android/link/LinkConfiguration;->getEnableDisplayableDefaultValuesInEce()Z

    move-result v4

    if-ne v4, v0, :cond_5

    move v7, v0

    .line 163
    :cond_5
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getLinkEmail()Ljava/lang/String;

    move-result-object v4

    .line 164
    invoke-virtual {p4}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->getAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lcom/stripe/android/link/model/LinkAccount;->getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object v8

    goto :goto_3

    :cond_6
    move-object v8, v1

    .line 161
    :goto_3
    invoke-virtual {v6, v4, v8, v7}, Lcom/stripe/android/link/ui/LinkButtonState$Companion;->create(Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Z)Lcom/stripe/android/link/ui/LinkButtonState;

    move-result-object v4

    .line 160
    invoke-direct {v5, v4}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$Link;-><init>(Lcom/stripe/android/link/ui/LinkButtonState;)V

    .line 168
    invoke-virtual {p3}, Lcom/stripe/android/link/verification/LinkInlineState;->getVerificationState()Lcom/stripe/android/link/verification/VerificationState;

    move-result-object v4

    instance-of v4, v4, Lcom/stripe/android/link/verification/VerificationState$RenderButton;

    if-eqz v4, :cond_7

    .line 169
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getWalletsAllowedByMerchant()Ljava/util/List;

    move-result-object v4

    sget-object v6, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->Link:Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    move-object v5, v1

    .line 166
    :goto_4
    move-object v4, v5

    check-cast v4, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;

    goto :goto_7

    .line 149
    :cond_8
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getConfiguration()Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/common/model/CommonConfiguration;->getGooglePay()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getButtonType()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    move-result-object v4

    goto :goto_5

    :cond_9
    move-object v4, v1

    .line 150
    :goto_5
    new-instance v5, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    .line 151
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getConfiguration()Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/common/model/CommonConfiguration;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v6

    .line 150
    invoke-direct {v5, v6}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    .line 153
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getConfiguration()Lcom/stripe/android/common/model/CommonConfiguration;

    move-result-object v6

    .line 154
    invoke-virtual {v6}, Lcom/stripe/android/common/model/CommonConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v6

    .line 147
    new-instance v7, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$GooglePay;

    .line 150
    check-cast v5, Lcom/stripe/android/CardBrandFilter;

    .line 147
    invoke-direct {v7, v4, v6, v0, v5}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$GooglePay;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZLcom/stripe/android/CardBrandFilter;)V

    .line 156
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getWalletsAllowedByMerchant()Ljava/util/List;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->GooglePay:Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_6

    :cond_a
    move-object v7, v1

    .line 155
    :goto_6
    move-object v4, v7

    check-cast v4, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;

    :goto_7
    if-eqz v4, :cond_0

    .line 379
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 383
    :cond_b
    check-cast v3, Ljava/util/List;

    goto :goto_8

    .line 179
    :cond_c
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    :goto_8
    if-eqz p1, :cond_e

    .line 182
    invoke-virtual {p3}, Lcom/stripe/android/link/verification/LinkInlineState;->getVerificationState()Lcom/stripe/android/link/verification/VerificationState;

    move-result-object p3

    instance-of p4, p3, Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    if-eqz p4, :cond_d

    check-cast p3, Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    goto :goto_9

    :cond_d
    move-object p3, v1

    :goto_9
    if-eqz p3, :cond_e

    invoke-virtual {p3}, Lcom/stripe/android/link/verification/VerificationState$Render2FA;->getViewState()Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p3

    if-eqz p3, :cond_e

    .line 183
    new-instance p4, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;

    .line 185
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkInlineInteractor:Lcom/stripe/android/link/verification/LinkInlineInteractor;

    invoke-interface {p0}, Lcom/stripe/android/link/verification/LinkInlineInteractor;->getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object p0

    .line 183
    invoke-direct {p4, p3, p0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;-><init>(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/uicore/elements/OTPElement;)V

    .line 188
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;->getWalletsAllowedByMerchant()Ljava/util/List;

    move-result-object p0

    sget-object p1, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->Link:Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_e

    move-object v1, p4

    .line 192
    :cond_e
    new-instance p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    .line 195
    instance-of p1, p2, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;

    xor-int/2addr p1, v0

    .line 192
    invoke-direct {p0, v1, v3, p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;-><init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;Ljava/util/List;Z)V

    return-object p0
.end method


# virtual methods
.method public getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;",
            ">;"
        }
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public handleViewAction(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;)V
    .locals 6

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnButtonPressed;

    if-eqz v0, :cond_2

    .line 208
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->arguments:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;

    if-eqz v0, :cond_1

    .line 209
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnButtonPressed;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnButtonPressed;->getButton()Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;

    move-result-object v1

    .line 210
    instance-of v1, v1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$Link;

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->handleLinkButtonPressed(Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)V

    return-void

    .line 211
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnButtonPressed;->getButton()Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->handleButtonPressed(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor$Arguments;)V

    return-void

    .line 213
    :cond_1
    move-object p1, p0

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;

    .line 214
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    .line 215
    sget-object p1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;->WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM:Lcom/stripe/android/payments/core/analytics/ErrorReporter$UnexpectedErrorEvent;

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 214
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    .line 219
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnShown;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->onWalletButtonsRenderStateChanged:Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 220
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnHidden;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->onWalletButtonsRenderStateChanged:Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 221
    :cond_4
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnResendCode;

    if-eqz v0, :cond_5

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkInlineInteractor:Lcom/stripe/android/link/verification/LinkInlineInteractor;

    invoke-interface {p1}, Lcom/stripe/android/link/verification/LinkInlineInteractor;->resendCode()V

    return-void

    .line 222
    :cond_5
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnResendCodeNotificationSent;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultWalletButtonsInteractor;->linkInlineInteractor:Lcom/stripe/android/link/verification/LinkInlineInteractor;

    invoke-interface {p1}, Lcom/stripe/android/link/verification/LinkInlineInteractor;->didShowCodeSentNotification()V

    return-void

    .line 206
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
